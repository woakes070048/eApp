<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@ include file="/html/employmentstatus/init.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddEmploymentstatus</title>
<portlet:actionURL var="saveemploymentstatus" name="saveEmploymentStatus">
</portlet:actionURL>
<portlet:resourceURL var="deleteemploymentstatus" id="deleteEmploymentStatus"/>
<portlet:renderURL var="listview">
	<portlet:param name="mvcPath" value="/html/employmentstatus/addemploymentstatus.jsp" />
</portlet:renderURL>
<style type="text/css">
#addEmploymentStatusMessage{
 color: red;
}
</style>
<aui:script>
AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#deleteemploymentstatus');
    node.on(
      'click',
      function() {
     var idArray = [];
     A.all('input[name=<portlet:namespace/>rowIds]:checked').each(function(object) {
      idArray.push(object.get("value"));
    
        });
       if(idArray==""){
			  alert("Please select records!");
		  }else{
			  var d = confirm("Are you sure you want to delete the selected Employment Status ?");
		  if(d){
		   var url = '<%=deleteemploymentstatus%>';
          A.io.request(url,
         {
          data: {  
                <portlet:namespace />employmentstatusIds: idArray,  
                 },
          on: {
               success: function() { 
                   alert('deleted successfully');
                   window.location='<%=listview%>';
              },
               failure: function() {
                  
                 }
                }
                 }
                );
		  																		
		  console.log(idArray);
	  
      return true;
  }
  else
    return false;
}             
      }
    );
  }
);
</aui:script>
<aui:script>
AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#addemploymentstatus');
    node.on(
      'click',
      function() {
         A.one('#employmentstatusadddelete').hide();
         A.one('#addEmploymentstatusForm').show();
                     
      }
    );
  }
);

  AUI().ready('event', 'node','transition',function(A){
  A.one('#addEmploymentstatusForm').hide();
  setTimeout(function(){
    A.one('#addEmploymentStatusMessage').transition('fadeOut');
},1000)
 });

AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#cancelemploymentstatus');
    node.on(
      'click',
      function() {
         A.one('#employmentstatusadddelete').show();
         A.one('#addEmploymentstatusForm').hide();
                     
      }
    );
  }
);

</aui:script>
</head>

<body>
<% if(SessionMessages.contains(renderRequest.getPortletSession(),"employmentStatus-empty-error")){%>
<p id="addEmploymentStatusMessage"><liferay-ui:message key="Please Enter EmploymentStatus"/></p>
<%} 
 if(SessionMessages.contains(renderRequest.getPortletSession(),"employmentStatus-duplicate-error")){
%>
<p id="addEmploymentStatusMessage"><liferay-ui:message key="EmploymentStatus already Exits"/></p>
<%} 
%>
 <br/><br/>
	
	<div class="row-fluid">
		<div id="employmentstatusadddelete" class="span12 text-right">
			<a href="#" class="btn btn-primary" id="addemploymentstatus"><i class="icon-plus"></i></a>
			<a href="#" class="btn btn-danger" id="deleteemploymentstatus"><i class="icon-trash"></i></a>
		</div>
		<div  id="addEmploymentstatusForm">
		<aui:form name="myemploymentstatusForm" action="<%=saveemploymentstatus.toString()%>" >
			<aui:input name="employmentstatusId" type="hidden" id="employmentstatusId" />
			<div class="form-inline">
				<label>Employment Status: </label>
				<input name="<portlet:namespace/>employmentstatus" type="text">
				<button type="submit" class="btn btn-primary"><i class="icon-ok"></i></button>
				<button  type="reset" id ="cancelemploymentstatus" class="btn btn-danger"><i class="icon-remove"></i></button>
			</div>
		</aui:form>
		</div>
	</div>

</body>

<%

PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("mvcPath", "/html/employmentstatus/addemploymentstatus.jsp");
RowChecker rowChecker = new RowChecker(renderResponse);

PortalPreferences portalPrefs = PortletPreferencesFactoryUtil.getPortalPreferences(request); 
String sortByCol = ParamUtil.getString(request, "orderByCol"); 
String sortByType = ParamUtil.getString(request, "orderByType"); 
System.out.println("sortByCol == " +sortByCol);
System.out.println("sortByType == " +sortByType);
if (Validator.isNotNull(sortByCol ) && Validator.isNotNull(sortByType )) { 
	System.out.println("if block...");
 
portalPrefs.setValue("NAME_SPACE", "sort-by-col", sortByCol); 
portalPrefs.setValue("NAME_SPACE", "sort-by-type", sortByCol); 
 
} else { 
 
	sortByType = portalPrefs.getValue("NAME_SPACE", "sort-by-type ", "asc");   
}

System.out.println("after....");
System.out.println("sortByCol == " +sortByCol);
System.out.println("sortByType == " +sortByType);

%>
<%!
  com.liferay.portal.kernel.dao.search.SearchContainer<EmploymentStatus> searchContainer;
%>
<div>
<liferay-ui:search-container orderByCol="<%=sortByCol %>"
	orderByType="<%=sortByType %>"
	rowChecker="<%= new RowChecker(renderResponse) %>" delta="5"
	emptyResultsMessage="No records is available for Employment Status."
	deltaConfigurable="true" iteratorURL="<%=iteratorURL%>">
	<liferay-ui:search-container-results>

		<% 
		 System.out.println("addemployee jsp =========");
            List<EmploymentStatus> employmentstatusList = EmploymentStatusLocalServiceUtil.getEmploymentStatuses(searchContainer.getStart(), searchContainer.getEnd());
            System.out.println("list size == " +employmentstatusList.size());
            OrderByComparator orderByComparator = CustomComparatorUtil.getEmploymentStatusrOrderByComparator(sortByCol, sortByType);         
  
           Collections.sort(employmentstatusList,orderByComparator);
  
          results = employmentstatusList;
          
            System.out.println("results == " +results);
           
     
               total = EmploymentStatusLocalServiceUtil.getEmploymentStatusesCount();
               System.out.println("total == " +total);
               pageContext.setAttribute("results", results);
               pageContext.setAttribute("total", total);
 %>

	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="EmploymentStatus"
		keyProperty="employmentStatusId" modelVar="EmploymentStatus" rowVar="curRow"
		escapedModel="<%= true %>">
		<liferay-ui:search-container-column-text orderable="<%=true %>"
			name="Employment Status" property="employmentstatus"
			orderableProperty="employmentstatus" />
		<liferay-ui:search-container-column-jsp name="Edit"
			path="/html/employmentstatus/edit.jsp" />

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />

</liferay-ui:search-container>
</div>

</html>
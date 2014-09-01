/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rknowsys.eapp.hrm.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.ContactDetails;
import com.rknowsys.eapp.hrm.model.ContactDetailsModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ContactDetails service. Represents a row in the &quot;hrm_ContactDetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.ContactDetailsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContactDetailsImpl}.
 * </p>
 *
 * @author rknowsys
 * @see ContactDetailsImpl
 * @see com.rknowsys.eapp.hrm.model.ContactDetails
 * @see com.rknowsys.eapp.hrm.model.ContactDetailsModel
 * @generated
 */
public class ContactDetailsModelImpl extends BaseModelImpl<ContactDetails>
	implements ContactDetailsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a contact details model instance should use the {@link com.rknowsys.eapp.hrm.model.ContactDetails} interface instead.
	 */
	public static final String TABLE_NAME = "hrm_ContactDetails";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "addressStreet1", Types.VARCHAR },
			{ "addressStreet2", Types.VARCHAR },
			{ "city", Types.VARCHAR },
			{ "state_", Types.VARCHAR },
			{ "postalCode", Types.VARCHAR },
			{ "country", Types.VARCHAR },
			{ "homeTelephone", Types.VARCHAR },
			{ "mobile", Types.VARCHAR },
			{ "workTelephone", Types.VARCHAR },
			{ "workEmail", Types.VARCHAR },
			{ "otherEmail", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table hrm_ContactDetails (id_ LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,addressStreet1 VARCHAR(75) null,addressStreet2 VARCHAR(75) null,city VARCHAR(75) null,state_ VARCHAR(75) null,postalCode VARCHAR(75) null,country VARCHAR(75) null,homeTelephone VARCHAR(75) null,mobile VARCHAR(75) null,workTelephone VARCHAR(75) null,workEmail VARCHAR(75) null,otherEmail VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table hrm_ContactDetails";
	public static final String ORDER_BY_JPQL = " ORDER BY contactDetails.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY hrm_ContactDetails.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.ContactDetails"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.ContactDetails"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.ContactDetails"));

	public ContactDetailsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ContactDetails.class;
	}

	@Override
	public String getModelClassName() {
		return ContactDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("addressStreet1", getAddressStreet1());
		attributes.put("addressStreet2", getAddressStreet2());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("postalCode", getPostalCode());
		attributes.put("country", getCountry());
		attributes.put("homeTelephone", getHomeTelephone());
		attributes.put("mobile", getMobile());
		attributes.put("workTelephone", getWorkTelephone());
		attributes.put("workEmail", getWorkEmail());
		attributes.put("otherEmail", getOtherEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String addressStreet1 = (String)attributes.get("addressStreet1");

		if (addressStreet1 != null) {
			setAddressStreet1(addressStreet1);
		}

		String addressStreet2 = (String)attributes.get("addressStreet2");

		if (addressStreet2 != null) {
			setAddressStreet2(addressStreet2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String postalCode = (String)attributes.get("postalCode");

		if (postalCode != null) {
			setPostalCode(postalCode);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String homeTelephone = (String)attributes.get("homeTelephone");

		if (homeTelephone != null) {
			setHomeTelephone(homeTelephone);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String workTelephone = (String)attributes.get("workTelephone");

		if (workTelephone != null) {
			setWorkTelephone(workTelephone);
		}

		String workEmail = (String)attributes.get("workEmail");

		if (workEmail != null) {
			setWorkEmail(workEmail);
		}

		String otherEmail = (String)attributes.get("otherEmail");

		if (otherEmail != null) {
			setOtherEmail(otherEmail);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getAddressStreet1() {
		if (_addressStreet1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _addressStreet1;
		}
	}

	@Override
	public void setAddressStreet1(String addressStreet1) {
		_addressStreet1 = addressStreet1;
	}

	@Override
	public String getAddressStreet2() {
		if (_addressStreet2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _addressStreet2;
		}
	}

	@Override
	public void setAddressStreet2(String addressStreet2) {
		_addressStreet2 = addressStreet2;
	}

	@Override
	public String getCity() {
		if (_city == null) {
			return StringPool.BLANK;
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@Override
	public String getState() {
		if (_state == null) {
			return StringPool.BLANK;
		}
		else {
			return _state;
		}
	}

	@Override
	public void setState(String state) {
		_state = state;
	}

	@Override
	public String getPostalCode() {
		if (_postalCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _postalCode;
		}
	}

	@Override
	public void setPostalCode(String postalCode) {
		_postalCode = postalCode;
	}

	@Override
	public String getCountry() {
		if (_country == null) {
			return StringPool.BLANK;
		}
		else {
			return _country;
		}
	}

	@Override
	public void setCountry(String country) {
		_country = country;
	}

	@Override
	public String getHomeTelephone() {
		if (_homeTelephone == null) {
			return StringPool.BLANK;
		}
		else {
			return _homeTelephone;
		}
	}

	@Override
	public void setHomeTelephone(String homeTelephone) {
		_homeTelephone = homeTelephone;
	}

	@Override
	public String getMobile() {
		if (_mobile == null) {
			return StringPool.BLANK;
		}
		else {
			return _mobile;
		}
	}

	@Override
	public void setMobile(String mobile) {
		_mobile = mobile;
	}

	@Override
	public String getWorkTelephone() {
		if (_workTelephone == null) {
			return StringPool.BLANK;
		}
		else {
			return _workTelephone;
		}
	}

	@Override
	public void setWorkTelephone(String workTelephone) {
		_workTelephone = workTelephone;
	}

	@Override
	public String getWorkEmail() {
		if (_workEmail == null) {
			return StringPool.BLANK;
		}
		else {
			return _workEmail;
		}
	}

	@Override
	public void setWorkEmail(String workEmail) {
		_workEmail = workEmail;
	}

	@Override
	public String getOtherEmail() {
		if (_otherEmail == null) {
			return StringPool.BLANK;
		}
		else {
			return _otherEmail;
		}
	}

	@Override
	public void setOtherEmail(String otherEmail) {
		_otherEmail = otherEmail;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ContactDetails.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ContactDetails toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ContactDetails)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ContactDetailsImpl contactDetailsImpl = new ContactDetailsImpl();

		contactDetailsImpl.setId(getId());
		contactDetailsImpl.setGroupId(getGroupId());
		contactDetailsImpl.setCompanyId(getCompanyId());
		contactDetailsImpl.setUserId(getUserId());
		contactDetailsImpl.setUserName(getUserName());
		contactDetailsImpl.setCreateDate(getCreateDate());
		contactDetailsImpl.setModifiedDate(getModifiedDate());
		contactDetailsImpl.setAddressStreet1(getAddressStreet1());
		contactDetailsImpl.setAddressStreet2(getAddressStreet2());
		contactDetailsImpl.setCity(getCity());
		contactDetailsImpl.setState(getState());
		contactDetailsImpl.setPostalCode(getPostalCode());
		contactDetailsImpl.setCountry(getCountry());
		contactDetailsImpl.setHomeTelephone(getHomeTelephone());
		contactDetailsImpl.setMobile(getMobile());
		contactDetailsImpl.setWorkTelephone(getWorkTelephone());
		contactDetailsImpl.setWorkEmail(getWorkEmail());
		contactDetailsImpl.setOtherEmail(getOtherEmail());

		contactDetailsImpl.resetOriginalValues();

		return contactDetailsImpl;
	}

	@Override
	public int compareTo(ContactDetails contactDetails) {
		long primaryKey = contactDetails.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContactDetails)) {
			return false;
		}

		ContactDetails contactDetails = (ContactDetails)obj;

		long primaryKey = contactDetails.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<ContactDetails> toCacheModel() {
		ContactDetailsCacheModel contactDetailsCacheModel = new ContactDetailsCacheModel();

		contactDetailsCacheModel.id = getId();

		contactDetailsCacheModel.groupId = getGroupId();

		contactDetailsCacheModel.companyId = getCompanyId();

		contactDetailsCacheModel.userId = getUserId();

		contactDetailsCacheModel.userName = getUserName();

		String userName = contactDetailsCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			contactDetailsCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			contactDetailsCacheModel.createDate = createDate.getTime();
		}
		else {
			contactDetailsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			contactDetailsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			contactDetailsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		contactDetailsCacheModel.addressStreet1 = getAddressStreet1();

		String addressStreet1 = contactDetailsCacheModel.addressStreet1;

		if ((addressStreet1 != null) && (addressStreet1.length() == 0)) {
			contactDetailsCacheModel.addressStreet1 = null;
		}

		contactDetailsCacheModel.addressStreet2 = getAddressStreet2();

		String addressStreet2 = contactDetailsCacheModel.addressStreet2;

		if ((addressStreet2 != null) && (addressStreet2.length() == 0)) {
			contactDetailsCacheModel.addressStreet2 = null;
		}

		contactDetailsCacheModel.city = getCity();

		String city = contactDetailsCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			contactDetailsCacheModel.city = null;
		}

		contactDetailsCacheModel.state = getState();

		String state = contactDetailsCacheModel.state;

		if ((state != null) && (state.length() == 0)) {
			contactDetailsCacheModel.state = null;
		}

		contactDetailsCacheModel.postalCode = getPostalCode();

		String postalCode = contactDetailsCacheModel.postalCode;

		if ((postalCode != null) && (postalCode.length() == 0)) {
			contactDetailsCacheModel.postalCode = null;
		}

		contactDetailsCacheModel.country = getCountry();

		String country = contactDetailsCacheModel.country;

		if ((country != null) && (country.length() == 0)) {
			contactDetailsCacheModel.country = null;
		}

		contactDetailsCacheModel.homeTelephone = getHomeTelephone();

		String homeTelephone = contactDetailsCacheModel.homeTelephone;

		if ((homeTelephone != null) && (homeTelephone.length() == 0)) {
			contactDetailsCacheModel.homeTelephone = null;
		}

		contactDetailsCacheModel.mobile = getMobile();

		String mobile = contactDetailsCacheModel.mobile;

		if ((mobile != null) && (mobile.length() == 0)) {
			contactDetailsCacheModel.mobile = null;
		}

		contactDetailsCacheModel.workTelephone = getWorkTelephone();

		String workTelephone = contactDetailsCacheModel.workTelephone;

		if ((workTelephone != null) && (workTelephone.length() == 0)) {
			contactDetailsCacheModel.workTelephone = null;
		}

		contactDetailsCacheModel.workEmail = getWorkEmail();

		String workEmail = contactDetailsCacheModel.workEmail;

		if ((workEmail != null) && (workEmail.length() == 0)) {
			contactDetailsCacheModel.workEmail = null;
		}

		contactDetailsCacheModel.otherEmail = getOtherEmail();

		String otherEmail = contactDetailsCacheModel.otherEmail;

		if ((otherEmail != null) && (otherEmail.length() == 0)) {
			contactDetailsCacheModel.otherEmail = null;
		}

		return contactDetailsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", addressStreet1=");
		sb.append(getAddressStreet1());
		sb.append(", addressStreet2=");
		sb.append(getAddressStreet2());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", postalCode=");
		sb.append(getPostalCode());
		sb.append(", country=");
		sb.append(getCountry());
		sb.append(", homeTelephone=");
		sb.append(getHomeTelephone());
		sb.append(", mobile=");
		sb.append(getMobile());
		sb.append(", workTelephone=");
		sb.append(getWorkTelephone());
		sb.append(", workEmail=");
		sb.append(getWorkEmail());
		sb.append(", otherEmail=");
		sb.append(getOtherEmail());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.ContactDetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressStreet1</column-name><column-value><![CDATA[");
		sb.append(getAddressStreet1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressStreet2</column-name><column-value><![CDATA[");
		sb.append(getAddressStreet2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postalCode</column-name><column-value><![CDATA[");
		sb.append(getPostalCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>homeTelephone</column-name><column-value><![CDATA[");
		sb.append(getHomeTelephone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mobile</column-name><column-value><![CDATA[");
		sb.append(getMobile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workTelephone</column-name><column-value><![CDATA[");
		sb.append(getWorkTelephone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workEmail</column-name><column-value><![CDATA[");
		sb.append(getWorkEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherEmail</column-name><column-value><![CDATA[");
		sb.append(getOtherEmail());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ContactDetails.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ContactDetails.class
		};
	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _addressStreet1;
	private String _addressStreet2;
	private String _city;
	private String _state;
	private String _postalCode;
	private String _country;
	private String _homeTelephone;
	private String _mobile;
	private String _workTelephone;
	private String _workEmail;
	private String _otherEmail;
	private ContactDetails _escapedModel;
}
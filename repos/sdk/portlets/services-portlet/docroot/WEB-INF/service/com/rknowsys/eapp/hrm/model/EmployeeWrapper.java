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

package com.rknowsys.eapp.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author rknowsys
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
	public EmployeeWrapper(Employee employee) {
		_employee = employee;
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeId", getEmployeeId());
		attributes.put("shiftId", getShiftId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("middleName", getMiddleName());
		attributes.put("photograph", getPhotograph());
		attributes.put("gender", getGender());
		attributes.put("maritalStatus", getMaritalStatus());
		attributes.put("nationality", getNationality());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("otherId", getOtherId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeId = (Long)attributes.get("employeeId");

		if (employeeId != null) {
			setEmployeeId(employeeId);
		}

		Long shiftId = (Long)attributes.get("shiftId");

		if (shiftId != null) {
			setShiftId(shiftId);
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

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		Blob photograph = (Blob)attributes.get("photograph");

		if (photograph != null) {
			setPhotograph(photograph);
		}

		Integer gender = (Integer)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String maritalStatus = (String)attributes.get("maritalStatus");

		if (maritalStatus != null) {
			setMaritalStatus(maritalStatus);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String otherId = (String)attributes.get("otherId");

		if (otherId != null) {
			setOtherId(otherId);
		}
	}

	/**
	* Returns the primary key of this Employee.
	*
	* @return the primary key of this Employee
	*/
	@Override
	public long getPrimaryKey() {
		return _employee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this Employee.
	*
	* @param primaryKey the primary key of this Employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the employee ID of this Employee.
	*
	* @return the employee ID of this Employee
	*/
	@Override
	public long getEmployeeId() {
		return _employee.getEmployeeId();
	}

	/**
	* Sets the employee ID of this Employee.
	*
	* @param employeeId the employee ID of this Employee
	*/
	@Override
	public void setEmployeeId(long employeeId) {
		_employee.setEmployeeId(employeeId);
	}

	/**
	* Returns the shift ID of this Employee.
	*
	* @return the shift ID of this Employee
	*/
	@Override
	public long getShiftId() {
		return _employee.getShiftId();
	}

	/**
	* Sets the shift ID of this Employee.
	*
	* @param shiftId the shift ID of this Employee
	*/
	@Override
	public void setShiftId(long shiftId) {
		_employee.setShiftId(shiftId);
	}

	/**
	* Returns the group ID of this Employee.
	*
	* @return the group ID of this Employee
	*/
	@Override
	public long getGroupId() {
		return _employee.getGroupId();
	}

	/**
	* Sets the group ID of this Employee.
	*
	* @param groupId the group ID of this Employee
	*/
	@Override
	public void setGroupId(long groupId) {
		_employee.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this Employee.
	*
	* @return the company ID of this Employee
	*/
	@Override
	public long getCompanyId() {
		return _employee.getCompanyId();
	}

	/**
	* Sets the company ID of this Employee.
	*
	* @param companyId the company ID of this Employee
	*/
	@Override
	public void setCompanyId(long companyId) {
		_employee.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this Employee.
	*
	* @return the user ID of this Employee
	*/
	@Override
	public long getUserId() {
		return _employee.getUserId();
	}

	/**
	* Sets the user ID of this Employee.
	*
	* @param userId the user ID of this Employee
	*/
	@Override
	public void setUserId(long userId) {
		_employee.setUserId(userId);
	}

	/**
	* Returns the user uuid of this Employee.
	*
	* @return the user uuid of this Employee
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employee.getUserUuid();
	}

	/**
	* Sets the user uuid of this Employee.
	*
	* @param userUuid the user uuid of this Employee
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_employee.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this Employee.
	*
	* @return the create date of this Employee
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _employee.getCreateDate();
	}

	/**
	* Sets the create date of this Employee.
	*
	* @param createDate the create date of this Employee
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_employee.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this Employee.
	*
	* @return the modified date of this Employee
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _employee.getModifiedDate();
	}

	/**
	* Sets the modified date of this Employee.
	*
	* @param modifiedDate the modified date of this Employee
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_employee.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the first name of this Employee.
	*
	* @return the first name of this Employee
	*/
	@Override
	public java.lang.String getFirstName() {
		return _employee.getFirstName();
	}

	/**
	* Sets the first name of this Employee.
	*
	* @param firstName the first name of this Employee
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_employee.setFirstName(firstName);
	}

	/**
	* Returns the last name of this Employee.
	*
	* @return the last name of this Employee
	*/
	@Override
	public java.lang.String getLastName() {
		return _employee.getLastName();
	}

	/**
	* Sets the last name of this Employee.
	*
	* @param lastName the last name of this Employee
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_employee.setLastName(lastName);
	}

	/**
	* Returns the middle name of this Employee.
	*
	* @return the middle name of this Employee
	*/
	@Override
	public java.lang.String getMiddleName() {
		return _employee.getMiddleName();
	}

	/**
	* Sets the middle name of this Employee.
	*
	* @param middleName the middle name of this Employee
	*/
	@Override
	public void setMiddleName(java.lang.String middleName) {
		_employee.setMiddleName(middleName);
	}

	/**
	* Returns the photograph of this Employee.
	*
	* @return the photograph of this Employee
	*/
	@Override
	public java.sql.Blob getPhotograph() {
		return _employee.getPhotograph();
	}

	/**
	* Sets the photograph of this Employee.
	*
	* @param photograph the photograph of this Employee
	*/
	@Override
	public void setPhotograph(java.sql.Blob photograph) {
		_employee.setPhotograph(photograph);
	}

	/**
	* Returns the gender of this Employee.
	*
	* @return the gender of this Employee
	*/
	@Override
	public int getGender() {
		return _employee.getGender();
	}

	/**
	* Sets the gender of this Employee.
	*
	* @param gender the gender of this Employee
	*/
	@Override
	public void setGender(int gender) {
		_employee.setGender(gender);
	}

	/**
	* Returns the marital status of this Employee.
	*
	* @return the marital status of this Employee
	*/
	@Override
	public java.lang.String getMaritalStatus() {
		return _employee.getMaritalStatus();
	}

	/**
	* Sets the marital status of this Employee.
	*
	* @param maritalStatus the marital status of this Employee
	*/
	@Override
	public void setMaritalStatus(java.lang.String maritalStatus) {
		_employee.setMaritalStatus(maritalStatus);
	}

	/**
	* Returns the nationality of this Employee.
	*
	* @return the nationality of this Employee
	*/
	@Override
	public java.lang.String getNationality() {
		return _employee.getNationality();
	}

	/**
	* Sets the nationality of this Employee.
	*
	* @param nationality the nationality of this Employee
	*/
	@Override
	public void setNationality(java.lang.String nationality) {
		_employee.setNationality(nationality);
	}

	/**
	* Returns the date of birth of this Employee.
	*
	* @return the date of birth of this Employee
	*/
	@Override
	public java.util.Date getDateOfBirth() {
		return _employee.getDateOfBirth();
	}

	/**
	* Sets the date of birth of this Employee.
	*
	* @param dateOfBirth the date of birth of this Employee
	*/
	@Override
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		_employee.setDateOfBirth(dateOfBirth);
	}

	/**
	* Returns the other ID of this Employee.
	*
	* @return the other ID of this Employee
	*/
	@Override
	public java.lang.String getOtherId() {
		return _employee.getOtherId();
	}

	/**
	* Sets the other ID of this Employee.
	*
	* @param otherId the other ID of this Employee
	*/
	@Override
	public void setOtherId(java.lang.String otherId) {
		_employee.setOtherId(otherId);
	}

	@Override
	public boolean isNew() {
		return _employee.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_employee.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _employee.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employee.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _employee.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _employee.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employee.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_employee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_employee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeWrapper((Employee)_employee.clone());
	}

	@Override
	public int compareTo(com.rknowsys.eapp.hrm.model.Employee employee) {
		return _employee.compareTo(employee);
	}

	@Override
	public int hashCode() {
		return _employee.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rknowsys.eapp.hrm.model.Employee> toCacheModel() {
		return _employee.toCacheModel();
	}

	@Override
	public com.rknowsys.eapp.hrm.model.Employee toEscapedModel() {
		return new EmployeeWrapper(_employee.toEscapedModel());
	}

	@Override
	public com.rknowsys.eapp.hrm.model.Employee toUnescapedModel() {
		return new EmployeeWrapper(_employee.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employee.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employee.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeWrapper)) {
			return false;
		}

		EmployeeWrapper employeeWrapper = (EmployeeWrapper)obj;

		if (Validator.equals(_employee, employeeWrapper._employee)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Employee getWrappedEmployee() {
		return _employee;
	}

	@Override
	public Employee getWrappedModel() {
		return _employee;
	}

	@Override
	public void resetOriginalValues() {
		_employee.resetOriginalValues();
	}

	private Employee _employee;
}
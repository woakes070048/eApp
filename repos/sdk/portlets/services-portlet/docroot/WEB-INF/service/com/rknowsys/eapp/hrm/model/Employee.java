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

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Employee service. Represents a row in the &quot;employee&quot; database table, with each column mapped to a property of this class.
 *
 * @author rknowsys
 * @see EmployeeModel
 * @see com.rknowsys.eapp.hrm.model.impl.EmployeeImpl
 * @see com.rknowsys.eapp.hrm.model.impl.EmployeeModelImpl
 * @generated
 */
public interface Employee extends EmployeeModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.rknowsys.eapp.hrm.model.impl.EmployeeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public com.rknowsys.eapp.hrm.model.ContactDetails getContactDetails()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.rknowsys.eapp.hrm.model.License getLicense()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.rknowsys.eapp.hrm.model.Job getJob()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.rknowsys.eapp.hrm.model.Attachment> getAttachments()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.rknowsys.eapp.hrm.model.Dependent> getDependents()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.rknowsys.eapp.hrm.model.SalaryComponent> getSalaryComponents()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.rknowsys.eapp.hrm.model.EmergencyContact> getEmergencyContacts()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.rknowsys.eapp.hrm.model.ImmigrationDocument> getImmigrationDocuments()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.rknowsys.eapp.hrm.model.Education> getEducations()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.rknowsys.eapp.hrm.model.Language> getLanguages()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.rknowsys.eapp.hrm.model.Skill> getSkills()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<com.rknowsys.eapp.hrm.model.Membership> getMemberships()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}
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

import com.rknowsys.eapp.hrm.model.SubUnit;
import com.rknowsys.eapp.hrm.model.SubUnitModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the SubUnit service. Represents a row in the &quot;sub_unit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.SubUnitModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SubUnitImpl}.
 * </p>
 *
 * @author rknowsys
 * @see SubUnitImpl
 * @see com.rknowsys.eapp.hrm.model.SubUnit
 * @see com.rknowsys.eapp.hrm.model.SubUnitModel
 * @generated
 */
public class SubUnitModelImpl extends BaseModelImpl<SubUnit>
	implements SubUnitModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a SubUnit model instance should use the {@link com.rknowsys.eapp.hrm.model.SubUnit} interface instead.
	 */
	public static final String TABLE_NAME = "sub_unit";
	public static final Object[][] TABLE_COLUMNS = {
			{ "subUnitId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "jobId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table sub_unit (subUnitId LONG not null primary key,name VARCHAR(75) null,description VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,jobId LONG)";
	public static final String TABLE_SQL_DROP = "drop table sub_unit";
	public static final String ORDER_BY_JPQL = " ORDER BY subUnit.subUnitId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY sub_unit.subUnitId ASC";
	public static final String DATA_SOURCE = "anotherDataSource";
	public static final String SESSION_FACTORY = "anotherSessionFactory";
	public static final String TX_MANAGER = "anotherTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.SubUnit"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.SubUnit"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.SubUnit"));

	public SubUnitModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _subUnitId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSubUnitId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _subUnitId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SubUnit.class;
	}

	@Override
	public String getModelClassName() {
		return SubUnit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subUnitId", getSubUnitId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("jobId", getJobId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long subUnitId = (Long)attributes.get("subUnitId");

		if (subUnitId != null) {
			setSubUnitId(subUnitId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
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

		Long jobId = (Long)attributes.get("jobId");

		if (jobId != null) {
			setJobId(jobId);
		}
	}

	@Override
	public long getSubUnitId() {
		return _subUnitId;
	}

	@Override
	public void setSubUnitId(long subUnitId) {
		_subUnitId = subUnitId;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
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
	public long getJobId() {
		return _jobId;
	}

	@Override
	public void setJobId(long jobId) {
		_jobId = jobId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			SubUnit.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SubUnit toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SubUnit)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SubUnitImpl subUnitImpl = new SubUnitImpl();

		subUnitImpl.setSubUnitId(getSubUnitId());
		subUnitImpl.setName(getName());
		subUnitImpl.setDescription(getDescription());
		subUnitImpl.setGroupId(getGroupId());
		subUnitImpl.setCompanyId(getCompanyId());
		subUnitImpl.setUserId(getUserId());
		subUnitImpl.setCreateDate(getCreateDate());
		subUnitImpl.setModifiedDate(getModifiedDate());
		subUnitImpl.setJobId(getJobId());

		subUnitImpl.resetOriginalValues();

		return subUnitImpl;
	}

	@Override
	public int compareTo(SubUnit subUnit) {
		long primaryKey = subUnit.getPrimaryKey();

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

		if (!(obj instanceof SubUnit)) {
			return false;
		}

		SubUnit subUnit = (SubUnit)obj;

		long primaryKey = subUnit.getPrimaryKey();

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
	public CacheModel<SubUnit> toCacheModel() {
		SubUnitCacheModel subUnitCacheModel = new SubUnitCacheModel();

		subUnitCacheModel.subUnitId = getSubUnitId();

		subUnitCacheModel.name = getName();

		String name = subUnitCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			subUnitCacheModel.name = null;
		}

		subUnitCacheModel.description = getDescription();

		String description = subUnitCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			subUnitCacheModel.description = null;
		}

		subUnitCacheModel.groupId = getGroupId();

		subUnitCacheModel.companyId = getCompanyId();

		subUnitCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			subUnitCacheModel.createDate = createDate.getTime();
		}
		else {
			subUnitCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			subUnitCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			subUnitCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		subUnitCacheModel.jobId = getJobId();

		return subUnitCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{subUnitId=");
		sb.append(getSubUnitId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", jobId=");
		sb.append(getJobId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.SubUnit");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>subUnitId</column-name><column-value><![CDATA[");
		sb.append(getSubUnitId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
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
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobId</column-name><column-value><![CDATA[");
		sb.append(getJobId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SubUnit.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SubUnit.class
		};
	private long _subUnitId;
	private String _name;
	private String _description;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _jobId;
	private SubUnit _escapedModel;
}
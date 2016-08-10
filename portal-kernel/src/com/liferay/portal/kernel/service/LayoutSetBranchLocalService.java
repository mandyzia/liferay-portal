/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portal.kernel.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.LayoutSetBranch;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for LayoutSetBranch. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see LayoutSetBranchLocalServiceUtil
 * @see com.liferay.portal.service.base.LayoutSetBranchLocalServiceBaseImpl
 * @see com.liferay.portal.service.impl.LayoutSetBranchLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface LayoutSetBranchLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LayoutSetBranchLocalServiceUtil} to access the layout set branch local service. Add custom service methods to {@link com.liferay.portal.service.impl.LayoutSetBranchLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Adds the layout set branch to the database. Also notifies the appropriate model listeners.
	*
	* @param layoutSetBranch the layout set branch
	* @return the layout set branch that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public LayoutSetBranch addLayoutSetBranch(LayoutSetBranch layoutSetBranch);

	public LayoutSetBranch addLayoutSetBranch(long userId, long groupId,
		boolean privateLayout, java.lang.String name,
		java.lang.String description, boolean master,
		long copyLayoutSetBranchId, ServiceContext serviceContext)
		throws PortalException;

	/**
	* Creates a new layout set branch with the primary key. Does not add the layout set branch to the database.
	*
	* @param layoutSetBranchId the primary key for the new layout set branch
	* @return the new layout set branch
	*/
	public LayoutSetBranch createLayoutSetBranch(long layoutSetBranchId);

	/**
	* Deletes the layout set branch from the database. Also notifies the appropriate model listeners.
	*
	* @param layoutSetBranch the layout set branch
	* @return the layout set branch that was removed
	* @throws PortalException
	*/
	@Indexable(type = IndexableType.DELETE)
	public LayoutSetBranch deleteLayoutSetBranch(
		LayoutSetBranch layoutSetBranch) throws PortalException;

	public LayoutSetBranch deleteLayoutSetBranch(
		LayoutSetBranch layoutSetBranch, boolean includeMaster)
		throws PortalException;

	/**
	* Deletes the layout set branch with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param layoutSetBranchId the primary key of the layout set branch
	* @return the layout set branch that was removed
	* @throws PortalException if a layout set branch with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public LayoutSetBranch deleteLayoutSetBranch(long layoutSetBranchId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public LayoutSetBranch fetchLayoutSetBranch(long groupId,
		boolean privateLayout, java.lang.String name);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public LayoutSetBranch fetchLayoutSetBranch(long layoutSetBranchId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public LayoutSetBranch getLayoutSetBranch(long groupId,
		boolean privateLayout, java.lang.String name) throws PortalException;

	/**
	* Returns the layout set branch with the primary key.
	*
	* @param layoutSetBranchId the primary key of the layout set branch
	* @return the layout set branch
	* @throws PortalException if a layout set branch with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public LayoutSetBranch getLayoutSetBranch(long layoutSetBranchId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public LayoutSetBranch getMasterLayoutSetBranch(long groupId,
		boolean privateLayout) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public LayoutSetBranch getUserLayoutSetBranch(long userId, long groupId,
		boolean privateLayout, long layoutSetId, long layoutSetBranchId)
		throws PortalException;

	public LayoutSetBranch mergeLayoutSetBranch(long layoutSetBranchId,
		long mergeLayoutSetBranchId, ServiceContext serviceContext)
		throws PortalException;

	/**
	* Updates the layout set branch in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param layoutSetBranch the layout set branch
	* @return the layout set branch that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public LayoutSetBranch updateLayoutSetBranch(
		LayoutSetBranch layoutSetBranch);

	public LayoutSetBranch updateLayoutSetBranch(long layoutSetBranchId,
		java.lang.String name, java.lang.String description,
		ServiceContext serviceContext) throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of layout set branchs.
	*
	* @return the number of layout set branchs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getLayoutSetBranchsCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<LayoutSetBranch> getLayoutSetBranches(long groupId,
		boolean privateLayout);

	/**
	* Returns a range of all the layout set branchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetBranchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of layout set branchs
	* @param end the upper bound of the range of layout set branchs (not inclusive)
	* @return the range of layout set branchs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<LayoutSetBranch> getLayoutSetBranchs(int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public void deleteLayoutSetBranches(long groupId, boolean privateLayout)
		throws PortalException;

	public void deleteLayoutSetBranches(long groupId, boolean privateLayout,
		boolean includeMaster) throws PortalException;
}
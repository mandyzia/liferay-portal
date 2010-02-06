/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.messageboards.model;


/**
 * <a href="MBMailingListSoap.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class is a wrapper for {@link MBMailingList}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       MBMailingList
 * @generated
 */
public class MBMailingListWrapper implements MBMailingList {
	public MBMailingListWrapper(MBMailingList mbMailingList) {
		_mbMailingList = mbMailingList;
	}

	public long getPrimaryKey() {
		return _mbMailingList.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_mbMailingList.setPrimaryKey(pk);
	}

	public java.lang.String getUuid() {
		return _mbMailingList.getUuid();
	}

	public void setUuid(java.lang.String uuid) {
		_mbMailingList.setUuid(uuid);
	}

	public long getMailingListId() {
		return _mbMailingList.getMailingListId();
	}

	public void setMailingListId(long mailingListId) {
		_mbMailingList.setMailingListId(mailingListId);
	}

	public long getGroupId() {
		return _mbMailingList.getGroupId();
	}

	public void setGroupId(long groupId) {
		_mbMailingList.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _mbMailingList.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_mbMailingList.setCompanyId(companyId);
	}

	public long getUserId() {
		return _mbMailingList.getUserId();
	}

	public void setUserId(long userId) {
		_mbMailingList.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.SystemException {
		return _mbMailingList.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_mbMailingList.setUserUuid(userUuid);
	}

	public java.lang.String getUserName() {
		return _mbMailingList.getUserName();
	}

	public void setUserName(java.lang.String userName) {
		_mbMailingList.setUserName(userName);
	}

	public java.util.Date getCreateDate() {
		return _mbMailingList.getCreateDate();
	}

	public void setCreateDate(java.util.Date createDate) {
		_mbMailingList.setCreateDate(createDate);
	}

	public java.util.Date getModifiedDate() {
		return _mbMailingList.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_mbMailingList.setModifiedDate(modifiedDate);
	}

	public long getCategoryId() {
		return _mbMailingList.getCategoryId();
	}

	public void setCategoryId(long categoryId) {
		_mbMailingList.setCategoryId(categoryId);
	}

	public java.lang.String getEmailAddress() {
		return _mbMailingList.getEmailAddress();
	}

	public void setEmailAddress(java.lang.String emailAddress) {
		_mbMailingList.setEmailAddress(emailAddress);
	}

	public java.lang.String getInProtocol() {
		return _mbMailingList.getInProtocol();
	}

	public void setInProtocol(java.lang.String inProtocol) {
		_mbMailingList.setInProtocol(inProtocol);
	}

	public java.lang.String getInServerName() {
		return _mbMailingList.getInServerName();
	}

	public void setInServerName(java.lang.String inServerName) {
		_mbMailingList.setInServerName(inServerName);
	}

	public int getInServerPort() {
		return _mbMailingList.getInServerPort();
	}

	public void setInServerPort(int inServerPort) {
		_mbMailingList.setInServerPort(inServerPort);
	}

	public boolean getInUseSSL() {
		return _mbMailingList.getInUseSSL();
	}

	public boolean isInUseSSL() {
		return _mbMailingList.isInUseSSL();
	}

	public void setInUseSSL(boolean inUseSSL) {
		_mbMailingList.setInUseSSL(inUseSSL);
	}

	public java.lang.String getInUserName() {
		return _mbMailingList.getInUserName();
	}

	public void setInUserName(java.lang.String inUserName) {
		_mbMailingList.setInUserName(inUserName);
	}

	public java.lang.String getInPassword() {
		return _mbMailingList.getInPassword();
	}

	public void setInPassword(java.lang.String inPassword) {
		_mbMailingList.setInPassword(inPassword);
	}

	public int getInReadInterval() {
		return _mbMailingList.getInReadInterval();
	}

	public void setInReadInterval(int inReadInterval) {
		_mbMailingList.setInReadInterval(inReadInterval);
	}

	public java.lang.String getOutEmailAddress() {
		return _mbMailingList.getOutEmailAddress();
	}

	public void setOutEmailAddress(java.lang.String outEmailAddress) {
		_mbMailingList.setOutEmailAddress(outEmailAddress);
	}

	public boolean getOutCustom() {
		return _mbMailingList.getOutCustom();
	}

	public boolean isOutCustom() {
		return _mbMailingList.isOutCustom();
	}

	public void setOutCustom(boolean outCustom) {
		_mbMailingList.setOutCustom(outCustom);
	}

	public java.lang.String getOutServerName() {
		return _mbMailingList.getOutServerName();
	}

	public void setOutServerName(java.lang.String outServerName) {
		_mbMailingList.setOutServerName(outServerName);
	}

	public int getOutServerPort() {
		return _mbMailingList.getOutServerPort();
	}

	public void setOutServerPort(int outServerPort) {
		_mbMailingList.setOutServerPort(outServerPort);
	}

	public boolean getOutUseSSL() {
		return _mbMailingList.getOutUseSSL();
	}

	public boolean isOutUseSSL() {
		return _mbMailingList.isOutUseSSL();
	}

	public void setOutUseSSL(boolean outUseSSL) {
		_mbMailingList.setOutUseSSL(outUseSSL);
	}

	public java.lang.String getOutUserName() {
		return _mbMailingList.getOutUserName();
	}

	public void setOutUserName(java.lang.String outUserName) {
		_mbMailingList.setOutUserName(outUserName);
	}

	public java.lang.String getOutPassword() {
		return _mbMailingList.getOutPassword();
	}

	public void setOutPassword(java.lang.String outPassword) {
		_mbMailingList.setOutPassword(outPassword);
	}

	public boolean getActive() {
		return _mbMailingList.getActive();
	}

	public boolean isActive() {
		return _mbMailingList.isActive();
	}

	public void setActive(boolean active) {
		_mbMailingList.setActive(active);
	}

	public com.liferay.portlet.messageboards.model.MBMailingList toEscapedModel() {
		return _mbMailingList.toEscapedModel();
	}

	public boolean isNew() {
		return _mbMailingList.isNew();
	}

	public boolean setNew(boolean n) {
		return _mbMailingList.setNew(n);
	}

	public boolean isCachedModel() {
		return _mbMailingList.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_mbMailingList.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _mbMailingList.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_mbMailingList.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _mbMailingList.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _mbMailingList.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_mbMailingList.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _mbMailingList.clone();
	}

	public int compareTo(
		com.liferay.portlet.messageboards.model.MBMailingList mbMailingList) {
		return _mbMailingList.compareTo(mbMailingList);
	}

	public int hashCode() {
		return _mbMailingList.hashCode();
	}

	public java.lang.String toString() {
		return _mbMailingList.toString();
	}

	public java.lang.String toXmlString() {
		return _mbMailingList.toXmlString();
	}

	public MBMailingList getWrappedMBMailingList() {
		return _mbMailingList;
	}

	private MBMailingList _mbMailingList;
}
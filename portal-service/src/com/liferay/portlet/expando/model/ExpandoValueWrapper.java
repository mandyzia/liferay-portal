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

package com.liferay.portlet.expando.model;


/**
 * <a href="ExpandoValueSoap.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class is a wrapper for {@link ExpandoValue}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ExpandoValue
 * @generated
 */
public class ExpandoValueWrapper implements ExpandoValue {
	public ExpandoValueWrapper(ExpandoValue expandoValue) {
		_expandoValue = expandoValue;
	}

	public long getPrimaryKey() {
		return _expandoValue.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_expandoValue.setPrimaryKey(pk);
	}

	public long getValueId() {
		return _expandoValue.getValueId();
	}

	public void setValueId(long valueId) {
		_expandoValue.setValueId(valueId);
	}

	public long getCompanyId() {
		return _expandoValue.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_expandoValue.setCompanyId(companyId);
	}

	public long getTableId() {
		return _expandoValue.getTableId();
	}

	public void setTableId(long tableId) {
		_expandoValue.setTableId(tableId);
	}

	public long getColumnId() {
		return _expandoValue.getColumnId();
	}

	public void setColumnId(long columnId) {
		_expandoValue.setColumnId(columnId);
	}

	public long getRowId() {
		return _expandoValue.getRowId();
	}

	public void setRowId(long rowId) {
		_expandoValue.setRowId(rowId);
	}

	public java.lang.String getClassName() {
		return _expandoValue.getClassName();
	}

	public long getClassNameId() {
		return _expandoValue.getClassNameId();
	}

	public void setClassNameId(long classNameId) {
		_expandoValue.setClassNameId(classNameId);
	}

	public long getClassPK() {
		return _expandoValue.getClassPK();
	}

	public void setClassPK(long classPK) {
		_expandoValue.setClassPK(classPK);
	}

	public java.lang.String getData() {
		return _expandoValue.getData();
	}

	public void setData(java.lang.String data) {
		_expandoValue.setData(data);
	}

	public com.liferay.portlet.expando.model.ExpandoValue toEscapedModel() {
		return _expandoValue.toEscapedModel();
	}

	public boolean isNew() {
		return _expandoValue.isNew();
	}

	public boolean setNew(boolean n) {
		return _expandoValue.setNew(n);
	}

	public boolean isCachedModel() {
		return _expandoValue.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_expandoValue.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _expandoValue.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_expandoValue.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _expandoValue.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _expandoValue.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_expandoValue.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _expandoValue.clone();
	}

	public int compareTo(
		com.liferay.portlet.expando.model.ExpandoValue expandoValue) {
		return _expandoValue.compareTo(expandoValue);
	}

	public int hashCode() {
		return _expandoValue.hashCode();
	}

	public java.lang.String toString() {
		return _expandoValue.toString();
	}

	public java.lang.String toXmlString() {
		return _expandoValue.toXmlString();
	}

	public boolean getBoolean()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getBoolean();
	}

	public boolean[] getBooleanArray()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getBooleanArray();
	}

	public java.util.Date getDate()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getDate();
	}

	public java.util.Date[] getDateArray()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getDateArray();
	}

	public double getDouble()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getDouble();
	}

	public double[] getDoubleArray()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getDoubleArray();
	}

	public float getFloat()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getFloat();
	}

	public float[] getFloatArray()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getFloatArray();
	}

	public int getInteger()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getInteger();
	}

	public int[] getIntegerArray()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getIntegerArray();
	}

	public long getLong()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getLong();
	}

	public long[] getLongArray()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getLongArray();
	}

	public short getShort()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getShort();
	}

	public short[] getShortArray()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getShortArray();
	}

	public java.lang.String getString()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getString();
	}

	public java.lang.String[] getStringArray()
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _expandoValue.getStringArray();
	}

	public void setBoolean(boolean data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setBoolean(data);
	}

	public void setBooleanArray(boolean[] data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setBooleanArray(data);
	}

	public void setDate(java.util.Date data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setDate(data);
	}

	public void setDateArray(java.util.Date[] data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setDateArray(data);
	}

	public void setDouble(double data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setDouble(data);
	}

	public void setDoubleArray(double[] data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setDoubleArray(data);
	}

	public void setFloat(float data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setFloat(data);
	}

	public void setFloatArray(float[] data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setFloatArray(data);
	}

	public void setInteger(int data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setInteger(data);
	}

	public void setIntegerArray(int[] data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setIntegerArray(data);
	}

	public void setLong(long data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setLong(data);
	}

	public void setLongArray(long[] data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setLongArray(data);
	}

	public void setShort(short data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setShort(data);
	}

	public void setShortArray(short[] data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setShortArray(data);
	}

	public void setString(java.lang.String data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setString(data);
	}

	public void setStringArray(java.lang.String[] data)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_expandoValue.setStringArray(data);
	}

	public ExpandoValue getWrappedExpandoValue() {
		return _expandoValue;
	}

	private ExpandoValue _expandoValue;
}
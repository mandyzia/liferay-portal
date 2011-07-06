/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.shopping.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.portlet.shopping.model.ShoppingCart;
import com.liferay.portlet.shopping.service.ShoppingCartLocalServiceUtil;

/**
 * The extended model base implementation for the ShoppingCart service. Represents a row in the &quot;ShoppingCart&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ShoppingCartImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingCartImpl
 * @see com.liferay.portlet.shopping.model.ShoppingCart
 * @generated
 */
public abstract class ShoppingCartBaseImpl extends ShoppingCartModelImpl
	implements ShoppingCart {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a shopping cart model instance should use the {@link ShoppingCart} interface instead.
	 */
	public void save() throws SystemException {
		ShoppingCartLocalServiceUtil.updateShoppingCart(this);
	}
}
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

package com.liferay.portal.kernel.registry;

import com.liferay.portal.kernel.util.PredicateFilter;
import com.liferay.registry.Registry;
import com.liferay.registry.RegistryUtil;
import com.liferay.registry.ServiceReference;
import com.liferay.registry.ServiceTrackerCustomizer;

/**
 * @author Roberto Díaz
 */
public class ServiceTrackerCustomizerFactory {

	public static <S> ServiceTrackerCustomizer<S, S> create(
		final PredicateFilter<S> predicateFilter) {

		return new ServiceTrackerCustomizer<S, S>() {

			@Override
			public S addingService(ServiceReference<S> serviceReference) {
				Registry registry = RegistryUtil.getRegistry();

				S service = registry.getService(serviceReference);

				try {
					if (predicateFilter.filter(service)) {
						return service;
					}
				}
				catch (Exception e) {
				}

				registry.ungetService(serviceReference);

				return null;
			}

			@Override
			public void removedService(
				ServiceReference<S> serviceReference, S service) {
			}

			@Override
			public void modifiedService(
				ServiceReference<S> serviceReference, S service) {

				Registry registry = RegistryUtil.getRegistry();

				registry.ungetService(serviceReference);
			}
		};
	}

}
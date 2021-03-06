/*
 * Copyright Siemens AG, 2015. Part of the SW360 Portal Project.
 * With modifications by Bosch Software Innovations GmbH, 2016.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.sw360.portal.common.page;

import org.eclipse.sw360.portal.common.PortalConstants;

/**
 * @author daniele.fognini@tngtech.com
 */
public enum PortletDefaultPage implements PortletPage {
    DETAIL(PortalConstants.PAGENAME_DETAIL),
    RELEASE_DETAIL(PortalConstants.PAGENAME_RELEASE_DETAIL),
    EDIT(PortalConstants.PAGENAME_EDIT),
    CLEARING_REQUEST_DETAIL(PortalConstants.PAGENAME_DETAIL_CLEARING_REQUEST);

    private final String pagename;

    PortletDefaultPage(String pagename) {
        this.pagename = pagename;
    }

    @Override
    public String pagename() {
        return pagename;
    }
}

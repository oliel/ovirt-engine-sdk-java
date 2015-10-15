//
// Copyright (c) 2012 Red Hat, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//           http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// *********************************************************************
// ********************* GENERATED CODE - DO NOT MODIFY ****************
// *********************************************************************

package org.ovirt.engine.sdk.decorators;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.ovirt.engine.sdk.common.CollectionDecorator;
import org.ovirt.engine.sdk.exceptions.ServerException;
import org.ovirt.engine.sdk.utils.CollectionUtils;
import org.ovirt.engine.sdk.utils.HttpHeaderBuilder;
import org.ovirt.engine.sdk.utils.HttpHeaderUtils;
import org.ovirt.engine.sdk.utils.UrlBuilder;
import org.ovirt.engine.sdk.utils.UrlBuilder;
import org.ovirt.engine.sdk.utils.UrlHelper;
import org.ovirt.engine.sdk.web.HttpProxyBroker;
import org.ovirt.engine.sdk.web.UrlParameterType;
import org.ovirt.engine.sdk.entities.Action;

/**
 * <p>GroupPermissions providing relation and functional services
 * <p>to {@link org.ovirt.engine.sdk.entities.Permissions }.
 */
@SuppressWarnings("unused")
public class GroupPermissions extends
        CollectionDecorator<org.ovirt.engine.sdk.entities.Permission,
                            org.ovirt.engine.sdk.entities.Permissions,
                            GroupPermission> {

    private Group parent;

    /**
     * @param proxy HttpProxyBroker
     * @param parent Group
     */
    public GroupPermissions(HttpProxyBroker proxy, Group parent) {
        super(proxy, "permissions");
        this.parent = parent;
    }

    /**
     * Lists GroupPermission objects.
     *
     * @return
     *     List of {@link GroupPermission }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public List<GroupPermission> list() throws ClientProtocolException,
            ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();
        return list(url, org.ovirt.engine.sdk.entities.Permissions.class, GroupPermission.class);
    }

    /**
     * Fetches GroupPermission object by id.
     *
     * @return
     *     {@link GroupPermission }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public GroupPermission get(UUID id) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName() + SLASH + id.toString();
        return getProxy().get(url, org.ovirt.engine.sdk.entities.Permission.class, GroupPermission.class);
    }

    /**
     * Fetches GroupPermission object by id.
     *
     * @return
     *     {@link GroupPermission }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public GroupPermission getById(String id) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName() + SLASH + id;
        return getProxy().get(url, org.ovirt.engine.sdk.entities.Permission.class, GroupPermission.class);
    }

    /**
     * Adds Permission object.
     *
     * @param permission {@link org.ovirt.engine.sdk.entities.Permission}
     *    <pre>
     *    Overload 1:
     *
     *      add a new permission on the
     *      data center to the group in
     *      the system
     *
     *      permission.role.id|name
     *      permission.data_center.id
     *
     *    Overload 2:
     *
     *      add a new permission on the
     *      cluster to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.cluster.id
     *
     *    Overload 3:
     *
     *      add a new permission on the
     *      host to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.host.id
     *
     *    Overload 4:
     *
     *      add a new permission on the
     *      storage domain to the group in
     *      the system
     *
     *      permission.role.id|name
     *      permission.storage_domain.id
     *
     *    Overload 5:
     *
     *      add a new permission on the vm
     *      to the group in the system
     *
     *      permission.role.id|name
     *      permission.vm.id
     *
     *    Overload 6:
     *
     *      add a new permission on the vm
     *      pool to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.vm_pool.id
     *
     *    Overload 7:
     *
     *      add a new permission on the
     *      template to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.template.id
     *    </pre>
     *
     *
     * @return
     *     {@link GroupPermission }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public GroupPermission add(org.ovirt.engine.sdk.entities.Permission permission) throws
            ClientProtocolException, ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().add(url, permission,
                org.ovirt.engine.sdk.entities.Permission.class,
                GroupPermission.class, headers);
    }
    /**
     * Adds Permission object.
     *
     * @param permission {@link org.ovirt.engine.sdk.entities.Permission}
     *    <pre>
     *    Overload 1:
     *
     *      add a new permission on the
     *      data center to the group in
     *      the system
     *
     *      permission.role.id|name
     *      permission.data_center.id
     *
     *    Overload 2:
     *
     *      add a new permission on the
     *      cluster to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.cluster.id
     *
     *    Overload 3:
     *
     *      add a new permission on the
     *      host to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.host.id
     *
     *    Overload 4:
     *
     *      add a new permission on the
     *      storage domain to the group in
     *      the system
     *
     *      permission.role.id|name
     *      permission.storage_domain.id
     *
     *    Overload 5:
     *
     *      add a new permission on the vm
     *      to the group in the system
     *
     *      permission.role.id|name
     *      permission.vm.id
     *
     *    Overload 6:
     *
     *      add a new permission on the vm
     *      pool to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.vm_pool.id
     *
     *    Overload 7:
     *
     *      add a new permission on the
     *      template to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.template.id
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     * @return
     *     {@link GroupPermission }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public GroupPermission add(org.ovirt.engine.sdk.entities.Permission permission, String correlationId) throws
            ClientProtocolException, ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        if (correlationId != null) {
            headersBuilder.add("Correlation-Id", correlationId);
        }
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().add(url, permission,
                org.ovirt.engine.sdk.entities.Permission.class,
                GroupPermission.class, headers);
    }
    /**
     * Adds Permission object.
     *
     * @param permission {@link org.ovirt.engine.sdk.entities.Permission}
     *    <pre>
     *    Overload 1:
     *
     *      add a new permission on the
     *      data center to the group in
     *      the system
     *
     *      permission.role.id|name
     *      permission.data_center.id
     *
     *    Overload 2:
     *
     *      add a new permission on the
     *      cluster to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.cluster.id
     *
     *    Overload 3:
     *
     *      add a new permission on the
     *      host to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.host.id
     *
     *    Overload 4:
     *
     *      add a new permission on the
     *      storage domain to the group in
     *      the system
     *
     *      permission.role.id|name
     *      permission.storage_domain.id
     *
     *    Overload 5:
     *
     *      add a new permission on the vm
     *      to the group in the system
     *
     *      permission.role.id|name
     *      permission.vm.id
     *
     *    Overload 6:
     *
     *      add a new permission on the vm
     *      pool to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.vm_pool.id
     *
     *    Overload 7:
     *
     *      add a new permission on the
     *      template to the group in the
     *      system
     *
     *      permission.role.id|name
     *      permission.template.id
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     * @param expect
     *    <pre>
     *    [201-created]
     *    </pre>
     * @return
     *     {@link GroupPermission }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public GroupPermission add(org.ovirt.engine.sdk.entities.Permission permission, String correlationId, String expect) throws
            ClientProtocolException, ServerException, IOException {
        String url = this.parent.getHref() + SLASH + getName();

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        if (correlationId != null) {
            headersBuilder.add("Correlation-Id", correlationId);
        }
        if (expect != null) {
            headersBuilder.add("Expect", expect);
        }
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().add(url, permission,
                org.ovirt.engine.sdk.entities.Permission.class,
                GroupPermission.class, headers);
    }
    /**
     * Lists GroupPermission objects.
     *
     * @param max
     *    <pre>
     *    [max results]
     *    </pre>
     *
     * @return List of {@link GroupPermission }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public List<GroupPermission> list(Integer max) throws ClientProtocolException,
            ServerException, IOException {

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(this.parent.getHref() + SLASH + getName());
        if (max != null) {
            urlBuilder.add("max", max, UrlParameterType.MATRIX);
        }

        String url = urlBuilder.build();

        return list(url, org.ovirt.engine.sdk.entities.Permissions.class,
                GroupPermission.class, headers);
    }

}

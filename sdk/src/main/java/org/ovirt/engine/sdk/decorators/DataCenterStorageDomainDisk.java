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

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.ovirt.engine.sdk.entities.Action;
import org.ovirt.engine.sdk.entities.Response;
import org.ovirt.engine.sdk.exceptions.ServerException;
import org.ovirt.engine.sdk.utils.HttpHeaderBuilder;
import org.ovirt.engine.sdk.utils.HttpHeaderUtils;
import org.ovirt.engine.sdk.utils.UrlBuilder;
import org.ovirt.engine.sdk.web.HttpProxyBroker;
import org.ovirt.engine.sdk.web.UrlParameterType;

/**
 * <p>DataCenterStorageDomainDisk providing relation and functional services
 * <p>to {@link org.ovirt.engine.sdk.entities.Disk }.
 */
@SuppressWarnings("unused")
public class DataCenterStorageDomainDisk extends
        org.ovirt.engine.sdk.entities.Disk {

    private HttpProxyBroker proxy;
    private final Object LOCK = new Object();

    private volatile DataCenterStorageDomainDiskPermissions dataCenterStorageDomainDiskPermissions;
    private volatile DataCenterStorageDomainDiskStatistics dataCenterStorageDomainDiskStatistics;


    /**
     * @param proxy HttpProxyBroker
     */
    public DataCenterStorageDomainDisk(HttpProxyBroker proxy) {
        this.proxy = proxy;
    }

    /**
     * @return HttpProxyBroker
     */
    private HttpProxyBroker getProxy() {
        return proxy;
    }

    /**
     * Gets the value of the DataCenterStorageDomainDiskPermissions property.
     *
     * @return
     *     {@link DataCenterStorageDomainDiskPermissions }
     */
    public DataCenterStorageDomainDiskPermissions getPermissions() {
        if (this.dataCenterStorageDomainDiskPermissions == null) {
            synchronized (this.LOCK) {
                if (this.dataCenterStorageDomainDiskPermissions == null) {
                    this.dataCenterStorageDomainDiskPermissions = new DataCenterStorageDomainDiskPermissions(proxy, this);
                }
            }
        }
        return dataCenterStorageDomainDiskPermissions;
    }
    /**
     * Gets the value of the DataCenterStorageDomainDiskStatistics property.
     *
     * @return
     *     {@link DataCenterStorageDomainDiskStatistics }
     */
    public DataCenterStorageDomainDiskStatistics getStatistics() {
        if (this.dataCenterStorageDomainDiskStatistics == null) {
            synchronized (this.LOCK) {
                if (this.dataCenterStorageDomainDiskStatistics == null) {
                    this.dataCenterStorageDomainDiskStatistics = new DataCenterStorageDomainDiskStatistics(proxy, this);
                }
            }
        }
        return dataCenterStorageDomainDiskStatistics;
    }


    /**
     * Performs copy action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action copy(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/copy";

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs copy action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     * @param async
     *    <pre>
     *    [true|false]
     *    </pre>
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action copy(Action action, Boolean async) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/copy";

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        if (async != null) {
            urlBuilder.add("async", async, UrlParameterType.MATRIX);
        }

        url = urlBuilder.build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Deletes object.
     *
     * @return
     *     {@link Response }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Response delete() throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().delete(url, Response.class, headers);
    }
    /**
     * Deletes object.
     * @param async
     *    <pre>
     *    [true|false]
     *    </pre>
     * @return
     *     {@link Response }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Response delete(Boolean async) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        if (async != null) {
            urlBuilder.add("async", async, UrlParameterType.MATRIX);
        }

        url = urlBuilder.build();

        return getProxy().delete(url, Response.class, headers);
    }
    /**
     * Deletes object.
     * @param async
     *    <pre>
     *    [true|false]
     *    </pre>
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     * @return
     *     {@link Response }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Response delete(Boolean async, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        if (correlationId != null) {
            headersBuilder.add("Correlation-Id", correlationId);
        }
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        if (async != null) {
            urlBuilder.add("async", async, UrlParameterType.MATRIX);
        }

        url = urlBuilder.build();

        return getProxy().delete(url, Response.class, headers);
    }
    /**
     * Performs exportDisk action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    storagedomain.id|name
     *    [action.async]
     *    [action.grace_period.expiry]
     *    </pre>
     *
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action exportDisk(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/export";

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs exportDisk action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    storagedomain.id|name
     *    [action.async]
     *    [action.grace_period.expiry]
     *    </pre>
     *
     * @param async
     *    <pre>
     *    [true|false]
     *    </pre>
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action exportDisk(Action action, Boolean async) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/export";

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        if (async != null) {
            urlBuilder.add("async", async, UrlParameterType.MATRIX);
        }

        url = urlBuilder.build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs exportDisk action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *    <pre>
     *    storagedomain.id|name
     *    [action.async]
     *    [action.grace_period.expiry]
     *    </pre>
     *
     * @param async
     *    <pre>
     *    [true|false]
     *    </pre>
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action exportDisk(Action action, Boolean async, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/export";

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        if (correlationId != null) {
            headersBuilder.add("Correlation-Id", correlationId);
        }
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        if (async != null) {
            urlBuilder.add("async", async, UrlParameterType.MATRIX);
        }

        url = urlBuilder.build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs move action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     *
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action move(Action action) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/move";

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }
    /**
     * Performs move action.
     *
     * @param action {@link org.ovirt.engine.sdk.entities.Action}
     * @param async
     *    <pre>
     *    [true|false]
     *    </pre>
     * @return
     *     {@link Action }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Action move(Action action, Boolean async) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref() + "/move";

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        if (async != null) {
            urlBuilder.add("async", async, UrlParameterType.MATRIX);
        }

        url = urlBuilder.build();

        return getProxy().action(url, action, Action.class, Action.class, headers);
    }

}

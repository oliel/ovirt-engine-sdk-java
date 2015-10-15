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
 * <p>VnicProfiles providing relation and functional services
 * <p>to {@link org.ovirt.engine.sdk.entities.VnicProfiles }.
 */
@SuppressWarnings("unused")
public class VnicProfiles extends
        CollectionDecorator<org.ovirt.engine.sdk.entities.VnicProfile,
                            org.ovirt.engine.sdk.entities.VnicProfiles,
                            VnicProfile> {

    /**
     * @param proxy HttpProxyBroker
     */
    public VnicProfiles(HttpProxyBroker proxy) {
        super(proxy, "vnicprofiles");
    }

    /**
     * Lists VnicProfile objects.
     *
     * @return
     *     List of {@link VnicProfile }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public List<VnicProfile> list() throws ClientProtocolException,
            ServerException, IOException {
        String url = SLASH + getName();
        return list(url, org.ovirt.engine.sdk.entities.VnicProfiles.class, VnicProfile.class);
    }

    /**
     * Fetches VnicProfile object by id.
     *
     * @return {@link VnicProfile }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public VnicProfile get(UUID id) throws ClientProtocolException,
            ServerException, IOException {
        String url = SLASH + getName() + SLASH + id.toString();
        return getProxy().get(url, org.ovirt.engine.sdk.entities.VnicProfile.class, VnicProfile.class);
    }

    /**
     * Fetches VnicProfile object by id.
     *
     * @return {@link VnicProfile }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    @Override
    public VnicProfile getById(String id) throws ClientProtocolException,
            ServerException, IOException {
        String url = SLASH + getName() + SLASH + id;
        return getProxy().get(url, org.ovirt.engine.sdk.entities.VnicProfile.class, VnicProfile.class);
    }

    /**
     * Adds VnicProfile object.
     *
     * @param vnicprofile {@link org.ovirt.engine.sdk.entities.VnicProfile}
     *    <pre>
     *    vnicprofile.network.id
     *    vnicprofile.name
     *    [vnicprofile.description]
     *    [vnicprofile.port_mirroring]
     *    [vnicprofile.custom_properties.custom_property]
     *    </pre>
     *
     *
     * @return
     *     {@link VnicProfile }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VnicProfile add(org.ovirt.engine.sdk.entities.VnicProfile vnicprofile) throws
            ClientProtocolException, ServerException, IOException {
        String url = SLASH + getName();

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().add(url, vnicprofile,
                org.ovirt.engine.sdk.entities.VnicProfile.class,
                VnicProfile.class, headers);
    }
    /**
     * Adds VnicProfile object.
     *
     * @param vnicprofile {@link org.ovirt.engine.sdk.entities.VnicProfile}
     *    <pre>
     *    vnicprofile.network.id
     *    vnicprofile.name
     *    [vnicprofile.description]
     *    [vnicprofile.port_mirroring]
     *    [vnicprofile.custom_properties.custom_property]
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     * @return
     *     {@link VnicProfile }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VnicProfile add(org.ovirt.engine.sdk.entities.VnicProfile vnicprofile, String correlationId) throws
            ClientProtocolException, ServerException, IOException {
        String url = SLASH + getName();

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        if (correlationId != null) {
            headersBuilder.add("Correlation-Id", correlationId);
        }
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(url);
        url = urlBuilder.build();

        return getProxy().add(url, vnicprofile,
                org.ovirt.engine.sdk.entities.VnicProfile.class,
                VnicProfile.class, headers);
    }
    /**
     * Adds VnicProfile object.
     *
     * @param vnicprofile {@link org.ovirt.engine.sdk.entities.VnicProfile}
     *    <pre>
     *    vnicprofile.network.id
     *    vnicprofile.name
     *    [vnicprofile.description]
     *    [vnicprofile.port_mirroring]
     *    [vnicprofile.custom_properties.custom_property]
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
     *     {@link VnicProfile }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VnicProfile add(org.ovirt.engine.sdk.entities.VnicProfile vnicprofile, String correlationId, String expect) throws
            ClientProtocolException, ServerException, IOException {
        String url = SLASH + getName();

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

        return getProxy().add(url, vnicprofile,
                org.ovirt.engine.sdk.entities.VnicProfile.class,
                VnicProfile.class, headers);
    }
    /**
     * Lists VnicProfile objects.
     *
     * @param max
     *    <pre>
     *    [max results]
     *    </pre>
     *
     * @return List of {@link VnicProfile }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public List<VnicProfile> list(Integer max) throws ClientProtocolException,
            ServerException, IOException {

        HttpHeaderBuilder headersBuilder = new HttpHeaderBuilder();
        List<Header> headers = headersBuilder.build();

        UrlBuilder urlBuilder = new UrlBuilder(SLASH + getName());
        if (max != null) {
            urlBuilder.add("max", max, UrlParameterType.MATRIX);
        }

        String url = urlBuilder.build();

        return list(url, org.ovirt.engine.sdk.entities.VnicProfiles.class,
                VnicProfile.class, headers);
    }

}

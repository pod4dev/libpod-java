/*
 * supports a RESTful API for the Libpod library
 * This documentation describes the Podman v2.x+ RESTful API. It consists of a Docker-compatible API and a Libpod API providing support for Podman’s unique features such as pods.  To start the service and keep it running for 5,000 seconds (-t 0 runs forever):  podman system service -t 5000 &  You can then use cURL on the socket using requests documented below.  NOTE: if you install the package podman-docker, it will create a symbolic link for /run/docker.sock to /run/podman/podman.sock  NOTE: Some fields in the API response JSON are encoded as omitempty, which means that if said field has a zero value, they will not be encoded in the API response. This is a feature to help reduce the size of the JSON responses returned via the API.  NOTE: Due to the limitations of [go-swagger](https://github.com/go-swagger/go-swagger), some field values that have a complex type show up as null in the docs as well as in the API responses. This is because the zero value for the field type is null. The field description in the docs will state what type the field is expected to be for such cases.  See podman-system-service(1) for more information.  Quick Examples:  'podman info'  curl --unix-socket /run/podman/podman.sock http://d/v5.0.0/libpod/info  'podman pull quay.io/containers/podman'  curl -XPOST --unix-socket /run/podman/podman.sock -v 'http://d/v5.0.0/images/create?fromImage=quay.io%2Fcontainers%2Fpodman'  'podman list images'  curl --unix-socket /run/podman/podman.sock -v 'http://d/v5.0.0/libpod/images/json' | jq
 *
 * The version of the OpenAPI document: 5.0.0
 * Contact: podman@lists.podman.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.pod4dev.libpodj.api;

import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.model.AuthConfig;
import io.github.pod4dev.libpodj.model.AuthReport;
import io.github.pod4dev.libpodj.model.ErrorModel;
import io.github.pod4dev.libpodj.model.SystemComponentVersion;
import io.github.pod4dev.libpodj.model.SystemDfReport;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemCompatApi
 */
@Disabled
public class SystemCompatApiTest {

    private final SystemCompatApi api = new SystemCompatApi();

    /**
     * Check auth configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void systemAuthTest() throws ApiException {
        AuthConfig authConfig = null;
        AuthReport response = api.systemAuth()
                .authConfig(authConfig)
                .execute();
        // TODO: test validations
    }

    /**
     * Show disk usage
     *
     * Return information about disk usage for containers, images, and volumes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void systemDataUsageTest() throws ApiException {
        SystemDfReport response = api.systemDataUsage()
                .execute();
        // TODO: test validations
    }

    /**
     * Get events
     *
     * Returns events filtered on query parameters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void systemEventsTest() throws ApiException {
        String since = null;
        String until = null;
        String filters = null;
        api.systemEvents()
                .since(since)
                .until(until)
                .filters(filters)
                .execute();
        // TODO: test validations
    }

    /**
     * Get info
     *
     * Returns information on the system and libpod configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void systemInfoTest() throws ApiException {
        api.systemInfo()
                .execute();
        // TODO: test validations
    }

    /**
     * Ping service
     *
     * Return protocol information in response headers. &#x60;HEAD /libpod/_ping&#x60; is also supported. &#x60;/_ping&#x60; is available for compatibility with other engines. The &#39;_ping&#39; endpoints are not versioned. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void systemPingTest() throws ApiException {
        String response = api.systemPing()
                .execute();
        // TODO: test validations
    }

    /**
     * Component Version information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void systemVersionTest() throws ApiException {
        SystemComponentVersion response = api.systemVersion()
                .execute();
        // TODO: test validations
    }

}

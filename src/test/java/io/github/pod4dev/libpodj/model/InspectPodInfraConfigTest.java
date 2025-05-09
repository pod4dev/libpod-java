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


package io.github.pod4dev.libpodj.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.pod4dev.libpodj.model.InspectHostPort;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for InspectPodInfraConfig
 */
public class InspectPodInfraConfigTest {
    private final InspectPodInfraConfig model = new InspectPodInfraConfig();

    /**
     * Model tests for InspectPodInfraConfig
     */
    @Test
    public void testInspectPodInfraConfig() {
        // TODO: test InspectPodInfraConfig
    }

    /**
     * Test the property 'dnSOption'
     */
    @Test
    public void dnSOptionTest() {
        // TODO: test dnSOption
    }

    /**
     * Test the property 'dnSSearch'
     */
    @Test
    public void dnSSearchTest() {
        // TODO: test dnSSearch
    }

    /**
     * Test the property 'dnSServer'
     */
    @Test
    public void dnSServerTest() {
        // TODO: test dnSServer
    }

    /**
     * Test the property 'hostAdd'
     */
    @Test
    public void hostAddTest() {
        // TODO: test hostAdd
    }

    /**
     * Test the property 'hostNetwork'
     */
    @Test
    public void hostNetworkTest() {
        // TODO: test hostNetwork
    }

    /**
     * Test the property 'hostsFile'
     */
    @Test
    public void hostsFileTest() {
        // TODO: test hostsFile
    }

    /**
     * Test the property 'networkOptions'
     */
    @Test
    public void networkOptionsTest() {
        // TODO: test networkOptions
    }

    /**
     * Test the property 'networks'
     */
    @Test
    public void networksTest() {
        // TODO: test networks
    }

    /**
     * Test the property 'noManageHostname'
     */
    @Test
    public void noManageHostnameTest() {
        // TODO: test noManageHostname
    }

    /**
     * Test the property 'noManageHosts'
     */
    @Test
    public void noManageHostsTest() {
        // TODO: test noManageHosts
    }

    /**
     * Test the property 'noManageResolvConf'
     */
    @Test
    public void noManageResolvConfTest() {
        // TODO: test noManageResolvConf
    }

    /**
     * Test the property 'portBindings'
     */
    @Test
    public void portBindingsTest() {
        // TODO: test portBindings
    }

    /**
     * Test the property 'staticIP'
     */
    @Test
    public void staticIPTest() {
        // TODO: test staticIP
    }

    /**
     * Test the property 'staticMAC'
     */
    @Test
    public void staticMACTest() {
        // TODO: test staticMAC
    }

    /**
     * Test the property 'cpuPeriod'
     */
    @Test
    public void cpuPeriodTest() {
        // TODO: test cpuPeriod
    }

    /**
     * Test the property 'cpuQuota'
     */
    @Test
    public void cpuQuotaTest() {
        // TODO: test cpuQuota
    }

    /**
     * Test the property 'cpusetCpus'
     */
    @Test
    public void cpusetCpusTest() {
        // TODO: test cpusetCpus
    }

    /**
     * Test the property 'pidNs'
     */
    @Test
    public void pidNsTest() {
        // TODO: test pidNs
    }

    /**
     * Test the property 'userns'
     */
    @Test
    public void usernsTest() {
        // TODO: test userns
    }

    /**
     * Test the property 'utsNs'
     */
    @Test
    public void utsNsTest() {
        // TODO: test utsNs
    }

}

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
import io.github.pod4dev.libpodj.model.HealthcheckConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Config
 */
public class ConfigTest {
    private final Config model = new Config();

    /**
     * Model tests for Config
     */
    @Test
    public void testConfig() {
        // TODO: test Config
    }

    /**
     * Test the property 'argsEscaped'
     */
    @Test
    public void argsEscapedTest() {
        // TODO: test argsEscaped
    }

    /**
     * Test the property 'attachStderr'
     */
    @Test
    public void attachStderrTest() {
        // TODO: test attachStderr
    }

    /**
     * Test the property 'attachStdin'
     */
    @Test
    public void attachStdinTest() {
        // TODO: test attachStdin
    }

    /**
     * Test the property 'attachStdout'
     */
    @Test
    public void attachStdoutTest() {
        // TODO: test attachStdout
    }

    /**
     * Test the property 'cmd'
     */
    @Test
    public void cmdTest() {
        // TODO: test cmd
    }

    /**
     * Test the property 'domainname'
     */
    @Test
    public void domainnameTest() {
        // TODO: test domainname
    }

    /**
     * Test the property 'entrypoint'
     */
    @Test
    public void entrypointTest() {
        // TODO: test entrypoint
    }

    /**
     * Test the property 'env'
     */
    @Test
    public void envTest() {
        // TODO: test env
    }

    /**
     * Test the property 'exposedPorts'
     */
    @Test
    public void exposedPortsTest() {
        // TODO: test exposedPorts
    }

    /**
     * Test the property 'healthcheck'
     */
    @Test
    public void healthcheckTest() {
        // TODO: test healthcheck
    }

    /**
     * Test the property 'hostname'
     */
    @Test
    public void hostnameTest() {
        // TODO: test hostname
    }

    /**
     * Test the property 'image'
     */
    @Test
    public void imageTest() {
        // TODO: test image
    }

    /**
     * Test the property 'labels'
     */
    @Test
    public void labelsTest() {
        // TODO: test labels
    }

    /**
     * Test the property 'macAddress'
     */
    @Test
    public void macAddressTest() {
        // TODO: test macAddress
    }

    /**
     * Test the property 'networkDisabled'
     */
    @Test
    public void networkDisabledTest() {
        // TODO: test networkDisabled
    }

    /**
     * Test the property 'onBuild'
     */
    @Test
    public void onBuildTest() {
        // TODO: test onBuild
    }

    /**
     * Test the property 'openStdin'
     */
    @Test
    public void openStdinTest() {
        // TODO: test openStdin
    }

    /**
     * Test the property 'shell'
     */
    @Test
    public void shellTest() {
        // TODO: test shell
    }

    /**
     * Test the property 'stdinOnce'
     */
    @Test
    public void stdinOnceTest() {
        // TODO: test stdinOnce
    }

    /**
     * Test the property 'stopSignal'
     */
    @Test
    public void stopSignalTest() {
        // TODO: test stopSignal
    }

    /**
     * Test the property 'stopTimeout'
     */
    @Test
    public void stopTimeoutTest() {
        // TODO: test stopTimeout
    }

    /**
     * Test the property 'tty'
     */
    @Test
    public void ttyTest() {
        // TODO: test tty
    }

    /**
     * Test the property 'user'
     */
    @Test
    public void userTest() {
        // TODO: test user
    }

    /**
     * Test the property 'volumes'
     */
    @Test
    public void volumesTest() {
        // TODO: test volumes
    }

    /**
     * Test the property 'workingDir'
     */
    @Test
    public void workingDirTest() {
        // TODO: test workingDir
    }

}

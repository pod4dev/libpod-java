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
import io.github.pod4dev.libpodj.model.Config;
import io.github.pod4dev.libpodj.model.HostConfig;
import io.github.pod4dev.libpodj.model.MountPoint;
import io.github.pod4dev.libpodj.model.NetworkingConfig;
import io.github.pod4dev.libpodj.model.Platform;
import io.github.pod4dev.libpodj.model.Port;
import io.github.pod4dev.libpodj.model.SummaryNetworkSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for Container
 */
public class ContainerTest {
    private final Container model = new Container();

    /**
     * Model tests for Container
     */
    @Test
    public void testContainer() {
        // TODO: test Container
    }

    /**
     * Test the property 'command'
     */
    @Test
    public void commandTest() {
        // TODO: test command
    }

    /**
     * Test the property 'config'
     */
    @Test
    public void configTest() {
        // TODO: test config
    }

    /**
     * Test the property 'created'
     */
    @Test
    public void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'defaultReadOnlyNonRecursive'
     */
    @Test
    public void defaultReadOnlyNonRecursiveTest() {
        // TODO: test defaultReadOnlyNonRecursive
    }

    /**
     * Test the property 'hostConfig'
     */
    @Test
    public void hostConfigTest() {
        // TODO: test hostConfig
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'image'
     */
    @Test
    public void imageTest() {
        // TODO: test image
    }

    /**
     * Test the property 'imageID'
     */
    @Test
    public void imageIDTest() {
        // TODO: test imageID
    }

    /**
     * Test the property 'labels'
     */
    @Test
    public void labelsTest() {
        // TODO: test labels
    }

    /**
     * Test the property 'mounts'
     */
    @Test
    public void mountsTest() {
        // TODO: test mounts
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'names'
     */
    @Test
    public void namesTest() {
        // TODO: test names
    }

    /**
     * Test the property 'networkSettings'
     */
    @Test
    public void networkSettingsTest() {
        // TODO: test networkSettings
    }

    /**
     * Test the property 'networkingConfig'
     */
    @Test
    public void networkingConfigTest() {
        // TODO: test networkingConfig
    }

    /**
     * Test the property 'platform'
     */
    @Test
    public void platformTest() {
        // TODO: test platform
    }

    /**
     * Test the property 'ports'
     */
    @Test
    public void portsTest() {
        // TODO: test ports
    }

    /**
     * Test the property 'sizeRootFs'
     */
    @Test
    public void sizeRootFsTest() {
        // TODO: test sizeRootFs
    }

    /**
     * Test the property 'sizeRw'
     */
    @Test
    public void sizeRwTest() {
        // TODO: test sizeRw
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

}

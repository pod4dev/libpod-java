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
import io.github.pod4dev.libpodj.model.DriverData;
import io.github.pod4dev.libpodj.model.History;
import io.github.pod4dev.libpodj.model.ImageConfig;
import io.github.pod4dev.libpodj.model.RootFS;
import io.github.pod4dev.libpodj.model.Schema2HealthConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for ImageData
 */
public class ImageDataTest {
    private final ImageData model = new ImageData();

    /**
     * Model tests for ImageData
     */
    @Test
    public void testImageData() {
        // TODO: test ImageData
    }

    /**
     * Test the property 'annotations'
     */
    @Test
    public void annotationsTest() {
        // TODO: test annotations
    }

    /**
     * Test the property 'architecture'
     */
    @Test
    public void architectureTest() {
        // TODO: test architecture
    }

    /**
     * Test the property 'author'
     */
    @Test
    public void authorTest() {
        // TODO: test author
    }

    /**
     * Test the property 'comment'
     */
    @Test
    public void commentTest() {
        // TODO: test comment
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
     * Test the property 'digest'
     */
    @Test
    public void digestTest() {
        // TODO: test digest
    }

    /**
     * Test the property 'graphDriver'
     */
    @Test
    public void graphDriverTest() {
        // TODO: test graphDriver
    }

    /**
     * Test the property 'healthcheck'
     */
    @Test
    public void healthcheckTest() {
        // TODO: test healthcheck
    }

    /**
     * Test the property 'history'
     */
    @Test
    public void historyTest() {
        // TODO: test history
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'labels'
     */
    @Test
    public void labelsTest() {
        // TODO: test labels
    }

    /**
     * Test the property 'manifestType'
     */
    @Test
    public void manifestTypeTest() {
        // TODO: test manifestType
    }

    /**
     * Test the property 'namesHistory'
     */
    @Test
    public void namesHistoryTest() {
        // TODO: test namesHistory
    }

    /**
     * Test the property 'os'
     */
    @Test
    public void osTest() {
        // TODO: test os
    }

    /**
     * Test the property 'parent'
     */
    @Test
    public void parentTest() {
        // TODO: test parent
    }

    /**
     * Test the property 'repoDigests'
     */
    @Test
    public void repoDigestsTest() {
        // TODO: test repoDigests
    }

    /**
     * Test the property 'repoTags'
     */
    @Test
    public void repoTagsTest() {
        // TODO: test repoTags
    }

    /**
     * Test the property 'rootFS'
     */
    @Test
    public void rootFSTest() {
        // TODO: test rootFS
    }

    /**
     * Test the property 'size'
     */
    @Test
    public void sizeTest() {
        // TODO: test size
    }

    /**
     * Test the property 'user'
     */
    @Test
    public void userTest() {
        // TODO: test user
    }

    /**
     * Test the property 'version'
     */
    @Test
    public void versionTest() {
        // TODO: test version
    }

    /**
     * Test the property 'virtualSize'
     */
    @Test
    public void virtualSizeTest() {
        // TODO: test virtualSize
    }

}

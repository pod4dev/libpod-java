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
import io.github.pod4dev.libpodj.model.AttestationProperties;
import io.github.pod4dev.libpodj.model.Descriptor;
import io.github.pod4dev.libpodj.model.ImageProperties;
import io.github.pod4dev.libpodj.model.ManifestSummarySize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for ManifestSummary
 */
public class ManifestSummaryTest {
    private final ManifestSummary model = new ManifestSummary();

    /**
     * Model tests for ManifestSummary
     */
    @Test
    public void testManifestSummary() {
        // TODO: test ManifestSummary
    }

    /**
     * Test the property 'available'
     */
    @Test
    public void availableTest() {
        // TODO: test available
    }

    /**
     * Test the property 'descriptor'
     */
    @Test
    public void descriptorTest() {
        // TODO: test descriptor
    }

    /**
     * Test the property 'ID'
     */
    @Test
    public void IDTest() {
        // TODO: test ID
    }

    /**
     * Test the property 'kind'
     */
    @Test
    public void kindTest() {
        // TODO: test kind
    }

    /**
     * Test the property 'size'
     */
    @Test
    public void sizeTest() {
        // TODO: test size
    }

    /**
     * Test the property 'attestationData'
     */
    @Test
    public void attestationDataTest() {
        // TODO: test attestationData
    }

    /**
     * Test the property 'imageData'
     */
    @Test
    public void imageDataTest() {
        // TODO: test imageData
    }

}

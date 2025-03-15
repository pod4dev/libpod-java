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
import io.github.pod4dev.libpodj.model.DeviceMapping;
import io.github.pod4dev.libpodj.model.DeviceRequest;
import io.github.pod4dev.libpodj.model.RestartPolicy;
import io.github.pod4dev.libpodj.model.ThrottleDevice;
import io.github.pod4dev.libpodj.model.Ulimit;
import io.github.pod4dev.libpodj.model.WeightDevice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for UpdateConfig
 */
public class UpdateConfigTest {
    private final UpdateConfig model = new UpdateConfig();

    /**
     * Model tests for UpdateConfig
     */
    @Test
    public void testUpdateConfig() {
        // TODO: test UpdateConfig
    }

    /**
     * Test the property 'blkioDeviceReadBps'
     */
    @Test
    public void blkioDeviceReadBpsTest() {
        // TODO: test blkioDeviceReadBps
    }

    /**
     * Test the property 'blkioDeviceReadIOps'
     */
    @Test
    public void blkioDeviceReadIOpsTest() {
        // TODO: test blkioDeviceReadIOps
    }

    /**
     * Test the property 'blkioDeviceWriteBps'
     */
    @Test
    public void blkioDeviceWriteBpsTest() {
        // TODO: test blkioDeviceWriteBps
    }

    /**
     * Test the property 'blkioDeviceWriteIOps'
     */
    @Test
    public void blkioDeviceWriteIOpsTest() {
        // TODO: test blkioDeviceWriteIOps
    }

    /**
     * Test the property 'blkioWeight'
     */
    @Test
    public void blkioWeightTest() {
        // TODO: test blkioWeight
    }

    /**
     * Test the property 'blkioWeightDevice'
     */
    @Test
    public void blkioWeightDeviceTest() {
        // TODO: test blkioWeightDevice
    }

    /**
     * Test the property 'cgroupParent'
     */
    @Test
    public void cgroupParentTest() {
        // TODO: test cgroupParent
    }

    /**
     * Test the property 'cpuCount'
     */
    @Test
    public void cpuCountTest() {
        // TODO: test cpuCount
    }

    /**
     * Test the property 'cpuPercent'
     */
    @Test
    public void cpuPercentTest() {
        // TODO: test cpuPercent
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
     * Test the property 'cpuRealtimePeriod'
     */
    @Test
    public void cpuRealtimePeriodTest() {
        // TODO: test cpuRealtimePeriod
    }

    /**
     * Test the property 'cpuRealtimeRuntime'
     */
    @Test
    public void cpuRealtimeRuntimeTest() {
        // TODO: test cpuRealtimeRuntime
    }

    /**
     * Test the property 'cpuShares'
     */
    @Test
    public void cpuSharesTest() {
        // TODO: test cpuShares
    }

    /**
     * Test the property 'cpusetCpus'
     */
    @Test
    public void cpusetCpusTest() {
        // TODO: test cpusetCpus
    }

    /**
     * Test the property 'cpusetMems'
     */
    @Test
    public void cpusetMemsTest() {
        // TODO: test cpusetMems
    }

    /**
     * Test the property 'deviceCgroupRules'
     */
    @Test
    public void deviceCgroupRulesTest() {
        // TODO: test deviceCgroupRules
    }

    /**
     * Test the property 'deviceRequests'
     */
    @Test
    public void deviceRequestsTest() {
        // TODO: test deviceRequests
    }

    /**
     * Test the property 'devices'
     */
    @Test
    public void devicesTest() {
        // TODO: test devices
    }

    /**
     * Test the property 'ioMaximumBandwidth'
     */
    @Test
    public void ioMaximumBandwidthTest() {
        // TODO: test ioMaximumBandwidth
    }

    /**
     * Test the property 'ioMaximumIOps'
     */
    @Test
    public void ioMaximumIOpsTest() {
        // TODO: test ioMaximumIOps
    }

    /**
     * Test the property 'kernelMemory'
     */
    @Test
    public void kernelMemoryTest() {
        // TODO: test kernelMemory
    }

    /**
     * Test the property 'kernelMemoryTCP'
     */
    @Test
    public void kernelMemoryTCPTest() {
        // TODO: test kernelMemoryTCP
    }

    /**
     * Test the property 'memory'
     */
    @Test
    public void memoryTest() {
        // TODO: test memory
    }

    /**
     * Test the property 'memoryReservation'
     */
    @Test
    public void memoryReservationTest() {
        // TODO: test memoryReservation
    }

    /**
     * Test the property 'memorySwap'
     */
    @Test
    public void memorySwapTest() {
        // TODO: test memorySwap
    }

    /**
     * Test the property 'memorySwappiness'
     */
    @Test
    public void memorySwappinessTest() {
        // TODO: test memorySwappiness
    }

    /**
     * Test the property 'nanoCpus'
     */
    @Test
    public void nanoCpusTest() {
        // TODO: test nanoCpus
    }

    /**
     * Test the property 'oomKillDisable'
     */
    @Test
    public void oomKillDisableTest() {
        // TODO: test oomKillDisable
    }

    /**
     * Test the property 'pidsLimit'
     */
    @Test
    public void pidsLimitTest() {
        // TODO: test pidsLimit
    }

    /**
     * Test the property 'restartPolicy'
     */
    @Test
    public void restartPolicyTest() {
        // TODO: test restartPolicy
    }

    /**
     * Test the property 'ulimits'
     */
    @Test
    public void ulimitsTest() {
        // TODO: test ulimits
    }

}

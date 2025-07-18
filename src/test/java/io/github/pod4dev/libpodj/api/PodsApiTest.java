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
import io.github.pod4dev.libpodj.model.ErrorModel;
import java.io.File;
import io.github.pod4dev.libpodj.model.IDResponse;
import io.github.pod4dev.libpodj.model.InspectPodData;
import io.github.pod4dev.libpodj.model.ListPodsReport;
import io.github.pod4dev.libpodj.model.PlayKubeReport;
import io.github.pod4dev.libpodj.model.PodKillReport;
import io.github.pod4dev.libpodj.model.PodPauseReport;
import io.github.pod4dev.libpodj.model.PodPruneReport;
import io.github.pod4dev.libpodj.model.PodRestartReport;
import io.github.pod4dev.libpodj.model.PodRmReport;
import io.github.pod4dev.libpodj.model.PodSpecGenerator;
import io.github.pod4dev.libpodj.model.PodStartReport;
import io.github.pod4dev.libpodj.model.PodStatsReport;
import io.github.pod4dev.libpodj.model.PodStopReport;
import io.github.pod4dev.libpodj.model.PodTopOKBody;
import io.github.pod4dev.libpodj.model.PodUnpauseReport;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * API tests for PodsApi
 */
@Disabled
public class PodsApiTest {

    private final PodsApi api = new PodsApi();

    /**
     * Generate a Kubernetes YAML file.
     *
     * Generate Kubernetes YAML based on a pod or container.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateKubeLibpod_0Test() throws ApiException {
        List<String> names = null;
        Boolean service = null;
        String type = null;
        Integer replicas = null;
        Boolean noTrunc = null;
        Boolean podmanOnly = null;
        File response = api.generateKubeLibpod_0(names)
                .service(service)
                .type(type)
                .replicas(replicas)
                .noTrunc(noTrunc)
                .podmanOnly(podmanOnly)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate Systemd Units
     *
     * Generate Systemd Units based on a pod or container.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateSystemdLibpod_0Test() throws ApiException {
        String name = null;
        Boolean useName = null;
        Boolean _new = null;
        Boolean noHeader = null;
        Integer startTimeout = null;
        Integer stopTimeout = null;
        String restartPolicy = null;
        String containerPrefix = null;
        String podPrefix = null;
        String separator = null;
        Integer restartSec = null;
        List<String> wants = null;
        List<String> after = null;
        List<String> requires = null;
        List<String> additionalEnvVariables = null;
        Map<String, String> response = api.generateSystemdLibpod_0(name)
                .useName(useName)
                ._new(_new)
                .noHeader(noHeader)
                .startTimeout(startTimeout)
                .stopTimeout(stopTimeout)
                .restartPolicy(restartPolicy)
                .containerPrefix(containerPrefix)
                .podPrefix(podPrefix)
                .separator(separator)
                .restartSec(restartSec)
                .wants(wants)
                .after(after)
                .requires(requires)
                .additionalEnvVariables(additionalEnvVariables)
                .execute();
        // TODO: test validations
    }

    /**
     * Apply a podman workload or Kubernetes YAML file.
     *
     * Deploy a podman container, pod, volume, or Kubernetes yaml to a Kubernetes cluster.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void kubeApplyLibpod_0Test() throws ApiException {
        String caCertFile = null;
        String kubeConfig = null;
        String namespace = null;
        Boolean service = null;
        String _file = null;
        String request = null;
        File response = api.kubeApplyLibpod_0()
                .caCertFile(caCertFile)
                .kubeConfig(kubeConfig)
                .namespace(namespace)
                .service(service)
                ._file(_file)
                .request(request)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove resources created from kube play
     *
     * Tears down pods, secrets, and volumes defined in a YAML file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void playKubeDownLibpod_0Test() throws ApiException {
        String contentType = null;
        Boolean force = null;
        String request = null;
        PlayKubeReport response = api.playKubeDownLibpod_0()
                .contentType(contentType)
                .force(force)
                .request(request)
                .execute();
        // TODO: test validations
    }

    /**
     * Play a Kubernetes YAML file.
     *
     * Create and run pods based on a Kubernetes YAML file.  ### Content-Type  Then endpoint support two Content-Type  - &#x60;text/plain&#x60; for yaml format  - &#x60;application/x-tar&#x60; for sending context(s) required for building images  #### Tar format  The tar format must contain a &#x60;play.yaml&#x60; file at the root that will be used. If the file format requires context to build an image, it uses the image name and check for corresponding folder.  For example, the client sends a tar file with the following structure:  &#x60;&#x60;&#x60; └── content.tar  ├── play.yaml  └── foobar/      └── Containerfile &#x60;&#x60;&#x60;  The &#x60;play.yaml&#x60; is the following, the &#x60;foobar&#x60; image means we are looking for a context with this name. &#x60;&#x60;&#x60; apiVersion: v1 kind: Pod metadata: name: demo-build-remote spec: containers:  - name: container    image: foobar &#x60;&#x60;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void playKubeLibpod_0Test() throws ApiException {
        String contentType = null;
        String annotations = null;
        String logDriver = null;
        List<String> logOptions = null;
        List<String> network = null;
        Boolean noHosts = null;
        Boolean noTrunc = null;
        List<String> publishPorts = null;
        Boolean publishAllPorts = null;
        Boolean replace = null;
        Boolean serviceContainer = null;
        Boolean start = null;
        List<String> staticIPs = null;
        List<String> staticMACs = null;
        Boolean tlsVerify = null;
        String userns = null;
        Boolean wait = null;
        Boolean build = null;
        String request = null;
        PlayKubeReport response = api.playKubeLibpod_0()
                .contentType(contentType)
                .annotations(annotations)
                .logDriver(logDriver)
                .logOptions(logOptions)
                .network(network)
                .noHosts(noHosts)
                .noTrunc(noTrunc)
                .publishPorts(publishPorts)
                .publishAllPorts(publishAllPorts)
                .replace(replace)
                .serviceContainer(serviceContainer)
                .start(start)
                .staticIPs(staticIPs)
                .staticMACs(staticMACs)
                .tlsVerify(tlsVerify)
                .userns(userns)
                .wait(wait)
                .build(build)
                .request(request)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a pod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podCreateLibpodTest() throws ApiException {
        PodSpecGenerator create = null;
        IDResponse response = api.podCreateLibpod()
                .create(create)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove pod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podDeleteLibpodTest() throws ApiException {
        String name = null;
        Boolean force = null;
        PodRmReport response = api.podDeleteLibpod(name)
                .force(force)
                .execute();
        // TODO: test validations
    }

    /**
     * Pod exists
     *
     * Check if a pod exists by name or ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podExistsLibpodTest() throws ApiException {
        String name = null;
        api.podExistsLibpod(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Inspect pod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podInspectLibpodTest() throws ApiException {
        String name = null;
        InspectPodData response = api.podInspectLibpod(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Kill a pod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podKillLibpodTest() throws ApiException {
        String name = null;
        String signal = null;
        PodKillReport response = api.podKillLibpod(name)
                .signal(signal)
                .execute();
        // TODO: test validations
    }

    /**
     * List pods
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podListLibpodTest() throws ApiException {
        String filters = null;
        List<ListPodsReport> response = api.podListLibpod()
                .filters(filters)
                .execute();
        // TODO: test validations
    }

    /**
     * Pause a pod
     *
     * Pause a pod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podPauseLibpodTest() throws ApiException {
        String name = null;
        PodPauseReport response = api.podPauseLibpod(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Prune unused pods
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podPruneLibpodTest() throws ApiException {
        PodPruneReport response = api.podPruneLibpod()
                .execute();
        // TODO: test validations
    }

    /**
     * Restart a pod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podRestartLibpodTest() throws ApiException {
        String name = null;
        PodRestartReport response = api.podRestartLibpod(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Start a pod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podStartLibpodTest() throws ApiException {
        String name = null;
        PodStartReport response = api.podStartLibpod(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Statistics for one or more pods
     *
     * Display a live stream of resource usage statistics for the containers in one or more pods
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podStatsAllLibpodTest() throws ApiException {
        Boolean all = null;
        List<String> namesOrIDs = null;
        List<PodStatsReport> response = api.podStatsAllLibpod()
                .all(all)
                .namesOrIDs(namesOrIDs)
                .execute();
        // TODO: test validations
    }

    /**
     * Stop a pod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podStopLibpodTest() throws ApiException {
        String name = null;
        Integer t = null;
        PodStopReport response = api.podStopLibpod(name)
                .t(t)
                .execute();
        // TODO: test validations
    }

    /**
     * List processes
     *
     * List processes running inside a pod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podTopLibpodTest() throws ApiException {
        String name = null;
        Boolean stream = null;
        Integer delay = null;
        String psArgs = null;
        PodTopOKBody response = api.podTopLibpod(name)
                .stream(stream)
                .delay(delay)
                .psArgs(psArgs)
                .execute();
        // TODO: test validations
    }

    /**
     * Unpause a pod
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void podUnpauseLibpodTest() throws ApiException {
        String name = null;
        PodUnpauseReport response = api.podUnpauseLibpod(name)
                .execute();
        // TODO: test validations
    }

}

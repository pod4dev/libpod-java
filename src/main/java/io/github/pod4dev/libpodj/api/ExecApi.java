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

import io.github.pod4dev.libpodj.ApiCallback;
import io.github.pod4dev.libpodj.ApiClient;
import io.github.pod4dev.libpodj.ApiException;
import io.github.pod4dev.libpodj.ApiResponse;
import io.github.pod4dev.libpodj.Configuration;
import io.github.pod4dev.libpodj.Pair;
import io.github.pod4dev.libpodj.ProgressRequestBody;
import io.github.pod4dev.libpodj.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import javax.validation.constraints.*;

import io.github.pod4dev.libpodj.model.ContainerExecRequest;
import io.github.pod4dev.libpodj.model.ErrorModel;
import io.github.pod4dev.libpodj.model.ExecStartLibpodRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ExecApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ExecApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExecApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call containerExecLibpodCall(String name, ContainerExecRequest control, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = control;

        // create path and map variables
        String localVarPath = "/libpod/containers/{name}/exec"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/x-tar"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call containerExecLibpodValidateBeforeCall(String name, ContainerExecRequest control, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling containerExecLibpod(Async)");
        }
        

        okhttp3.Call localVarCall = containerExecLibpodCall(name, control, _callback);
        return localVarCall;

    }


    private ApiResponse<Void> containerExecLibpodWithHttpInfo( @NotNull String name, ContainerExecRequest control) throws ApiException {
        okhttp3.Call localVarCall = containerExecLibpodValidateBeforeCall(name, control, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call containerExecLibpodAsync(String name, ContainerExecRequest control, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = containerExecLibpodValidateBeforeCall(name, control, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIcontainerExecLibpodRequest {
        private final String name;
        private ContainerExecRequest control;

        private APIcontainerExecLibpodRequest(String name) {
            this.name = name;
        }

        /**
         * Set control
         * @param control Attributes for create (optional)
         * @return APIcontainerExecLibpodRequest
         */
        public APIcontainerExecLibpodRequest control(ContainerExecRequest control) {
            this.control = control;
            return this;
        }

        /**
         * Build call for containerExecLibpod
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such container </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> container is paused </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return containerExecLibpodCall(name, control, _callback);
        }

        /**
         * Execute containerExecLibpod request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such container </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> container is paused </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            containerExecLibpodWithHttpInfo(name, control);
        }

        /**
         * Execute containerExecLibpod request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such container </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> container is paused </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return containerExecLibpodWithHttpInfo(name, control);
        }

        /**
         * Execute containerExecLibpod request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such container </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> container is paused </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return containerExecLibpodAsync(name, control, _callback);
        }
    }

    /**
     * Create an exec instance
     * Create an exec session to run a command inside a running container. Exec sessions will be automatically removed 5 minutes after they exit.
     * @param name name of container (required)
     * @return APIcontainerExecLibpodRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such container </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is paused </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIcontainerExecLibpodRequest containerExecLibpod(String name) {
        return new APIcontainerExecLibpodRequest(name);
    }
    private okhttp3.Call execInspectLibpodCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/libpod/exec/{id}/json"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call execInspectLibpodValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling execInspectLibpod(Async)");
        }
        

        okhttp3.Call localVarCall = execInspectLibpodCall(id, _callback);
        return localVarCall;

    }


    private ApiResponse<Void> execInspectLibpodWithHttpInfo( @NotNull String id) throws ApiException {
        okhttp3.Call localVarCall = execInspectLibpodValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call execInspectLibpodAsync(String id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = execInspectLibpodValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIexecInspectLibpodRequest {
        private final String id;

        private APIexecInspectLibpodRequest(String id) {
            this.id = id;
        }

        /**
         * Build call for execInspectLibpod
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return execInspectLibpodCall(id, _callback);
        }

        /**
         * Execute execInspectLibpod request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            execInspectLibpodWithHttpInfo(id);
        }

        /**
         * Execute execInspectLibpod request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return execInspectLibpodWithHttpInfo(id);
        }

        /**
         * Execute execInspectLibpod request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return execInspectLibpodAsync(id, _callback);
        }
    }

    /**
     * Inspect an exec instance
     * Return low-level information about an exec instance.
     * @param id Exec instance ID (required)
     * @return APIexecInspectLibpodRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIexecInspectLibpodRequest execInspectLibpod(String id) {
        return new APIexecInspectLibpodRequest(id);
    }
    private okhttp3.Call execResizeLibpodCall(String id, Integer h, Integer w, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/libpod/exec/{id}/resize"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (h != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("h", h));
        }

        if (w != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("w", w));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call execResizeLibpodValidateBeforeCall(String id, Integer h, Integer w, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling execResizeLibpod(Async)");
        }
        

        okhttp3.Call localVarCall = execResizeLibpodCall(id, h, w, _callback);
        return localVarCall;

    }


    private ApiResponse<Void> execResizeLibpodWithHttpInfo( @NotNull String id, Integer h, Integer w) throws ApiException {
        okhttp3.Call localVarCall = execResizeLibpodValidateBeforeCall(id, h, w, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call execResizeLibpodAsync(String id, Integer h, Integer w, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = execResizeLibpodValidateBeforeCall(id, h, w, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIexecResizeLibpodRequest {
        private final String id;
        private Integer h;
        private Integer w;

        private APIexecResizeLibpodRequest(String id) {
            this.id = id;
        }

        /**
         * Set h
         * @param h Height of the TTY session in characters (optional)
         * @return APIexecResizeLibpodRequest
         */
        public APIexecResizeLibpodRequest h(Integer h) {
            this.h = h;
            return this;
        }

        /**
         * Set w
         * @param w Width of the TTY session in characters (optional)
         * @return APIexecResizeLibpodRequest
         */
        public APIexecResizeLibpodRequest w(Integer w) {
            this.w = w;
            return this;
        }

        /**
         * Build call for execResizeLibpod
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return execResizeLibpodCall(id, h, w, _callback);
        }

        /**
         * Execute execResizeLibpod request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            execResizeLibpodWithHttpInfo(id, h, w);
        }

        /**
         * Execute execResizeLibpod request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return execResizeLibpodWithHttpInfo(id, h, w);
        }

        /**
         * Execute execResizeLibpod request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return execResizeLibpodAsync(id, h, w, _callback);
        }
    }

    /**
     * Resize an exec instance
     * Resize the TTY session used by an exec instance. This endpoint only works if tty was specified as part of creating and starting the exec instance. 
     * @param id Exec instance ID (required)
     * @return APIexecResizeLibpodRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIexecResizeLibpodRequest execResizeLibpod(String id) {
        return new APIexecResizeLibpodRequest(id);
    }
    private okhttp3.Call execStartLibpodCall(String id, ExecStartLibpodRequest control, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = control;

        // create path and map variables
        String localVarPath = "/libpod/exec/{id}/start"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/x-tar"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call execStartLibpodValidateBeforeCall(String id, ExecStartLibpodRequest control, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling execStartLibpod(Async)");
        }
        

        okhttp3.Call localVarCall = execStartLibpodCall(id, control, _callback);
        return localVarCall;

    }


    private ApiResponse<Void> execStartLibpodWithHttpInfo( @NotNull String id, ExecStartLibpodRequest control) throws ApiException {
        okhttp3.Call localVarCall = execStartLibpodValidateBeforeCall(id, control, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call execStartLibpodAsync(String id, ExecStartLibpodRequest control, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = execStartLibpodValidateBeforeCall(id, control, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIexecStartLibpodRequest {
        private final String id;
        private ExecStartLibpodRequest control;

        private APIexecStartLibpodRequest(String id) {
            this.id = id;
        }

        /**
         * Set control
         * @param control Attributes for start (optional)
         * @return APIexecStartLibpodRequest
         */
        public APIexecStartLibpodRequest control(ExecStartLibpodRequest control) {
            this.control = control;
            return this;
        }

        /**
         * Build call for execStartLibpod
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> container is not running. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return execStartLibpodCall(id, control, _callback);
        }

        /**
         * Execute execStartLibpod request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> container is not running. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            execStartLibpodWithHttpInfo(id, control);
        }

        /**
         * Execute execStartLibpod request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> container is not running. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return execStartLibpodWithHttpInfo(id, control);
        }

        /**
         * Execute execStartLibpod request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> container is not running. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return execStartLibpodAsync(id, control, _callback);
        }
    }

    /**
     * Start an exec instance
     * Starts a previously set up exec instance. If detach is true, this endpoint returns immediately after starting the command. Otherwise, it sets up an interactive session with the command. The stream format is the same as the attach endpoint. 
     * @param id Exec instance ID (required)
     * @return APIexecStartLibpodRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is not running. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIexecStartLibpodRequest execStartLibpod(String id) {
        return new APIexecStartLibpodRequest(id);
    }
}

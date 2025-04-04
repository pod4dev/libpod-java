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

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import io.github.pod4dev.libpodj.model.ContainerUpdateLibpod201Response;
import io.github.pod4dev.libpodj.model.ErrorModel;
import io.github.pod4dev.libpodj.model.SecretCreate;
import io.github.pod4dev.libpodj.model.SecretDeleteLibpod404Response;
import io.github.pod4dev.libpodj.model.SecretInfoReportCompat;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecretsCompatApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SecretsCompatApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecretsCompatApi(ApiClient apiClient) {
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

    private okhttp3.Call secretCreateCall(SecretCreate create, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = create;

        // create path and map variables
        String localVarPath = "/secrets/create";

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
            "application/json",
            "application/x-tar"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call secretCreateValidateBeforeCall(SecretCreate create, final ApiCallback _callback) throws ApiException {
        return secretCreateCall(create, _callback);

    }


    private ApiResponse<ContainerUpdateLibpod201Response> secretCreateWithHttpInfo(SecretCreate create) throws ApiException {
        okhttp3.Call localVarCall = secretCreateValidateBeforeCall(create, null);
        Type localVarReturnType = new TypeToken<ContainerUpdateLibpod201Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call secretCreateAsync(SecretCreate create, final ApiCallback<ContainerUpdateLibpod201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = secretCreateValidateBeforeCall(create, _callback);
        Type localVarReturnType = new TypeToken<ContainerUpdateLibpod201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIsecretCreateRequest {
        private SecretCreate create;

        private APIsecretCreateRequest() {
        }

        /**
         * Set create
         * @param create attributes for creating a secret  (optional)
         * @return APIsecretCreateRequest
         */
        public APIsecretCreateRequest create(SecretCreate create) {
            this.create = create;
            return this;
        }

        /**
         * Build call for secretCreate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Secret create response </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> Secret in use </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return secretCreateCall(create, _callback);
        }

        /**
         * Execute secretCreate request
         * @return ContainerUpdateLibpod201Response
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Secret create response </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> Secret in use </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public ContainerUpdateLibpod201Response execute() throws ApiException {
            ApiResponse<ContainerUpdateLibpod201Response> localVarResp = secretCreateWithHttpInfo(create);
            return localVarResp.getData();
        }

        /**
         * Execute secretCreate request with HTTP info returned
         * @return ApiResponse&lt;ContainerUpdateLibpod201Response&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Secret create response </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> Secret in use </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ContainerUpdateLibpod201Response> executeWithHttpInfo() throws ApiException {
            return secretCreateWithHttpInfo(create);
        }

        /**
         * Execute secretCreate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Secret create response </td><td>  -  </td></tr>
            <tr><td> 409 </td><td> Secret in use </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ContainerUpdateLibpod201Response> _callback) throws ApiException {
            return secretCreateAsync(create, _callback);
        }
    }

    /**
     * Create a secret
     * 
     * @return APIsecretCreateRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Secret create response </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Secret in use </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIsecretCreateRequest secretCreate() {
        return new APIsecretCreateRequest();
    }
    private okhttp3.Call secretDeleteCall(String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/secrets/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call secretDeleteValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling secretDelete(Async)");
        }

        return secretDeleteCall(name, _callback);

    }


    private ApiResponse<Void> secretDeleteWithHttpInfo( @NotNull String name) throws ApiException {
        okhttp3.Call localVarCall = secretDeleteValidateBeforeCall(name, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call secretDeleteAsync(String name, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = secretDeleteValidateBeforeCall(name, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIsecretDeleteRequest {
        private final String name;

        private APIsecretDeleteRequest(String name) {
            this.name = name;
        }

        /**
         * Build call for secretDelete
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such secret </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return secretDeleteCall(name, _callback);
        }

        /**
         * Execute secretDelete request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such secret </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            secretDeleteWithHttpInfo(name);
        }

        /**
         * Execute secretDelete request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such secret </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return secretDeleteWithHttpInfo(name);
        }

        /**
         * Execute secretDelete request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such secret </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return secretDeleteAsync(name, _callback);
        }
    }

    /**
     * Remove secret
     * 
     * @param name the name or ID of the secret (required)
     * @return APIsecretDeleteRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such secret </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIsecretDeleteRequest secretDelete(String name) {
        return new APIsecretDeleteRequest(name);
    }
    private okhttp3.Call secretInspectCall(String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/secrets/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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
    private okhttp3.Call secretInspectValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling secretInspect(Async)");
        }

        return secretInspectCall(name, _callback);

    }


    private ApiResponse<SecretInfoReportCompat> secretInspectWithHttpInfo( @NotNull String name) throws ApiException {
        okhttp3.Call localVarCall = secretInspectValidateBeforeCall(name, null);
        Type localVarReturnType = new TypeToken<SecretInfoReportCompat>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call secretInspectAsync(String name, final ApiCallback<SecretInfoReportCompat> _callback) throws ApiException {

        okhttp3.Call localVarCall = secretInspectValidateBeforeCall(name, _callback);
        Type localVarReturnType = new TypeToken<SecretInfoReportCompat>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIsecretInspectRequest {
        private final String name;

        private APIsecretInspectRequest(String name) {
            this.name = name;
        }

        /**
         * Build call for secretInspect
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Secret inspect compat </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such secret </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return secretInspectCall(name, _callback);
        }

        /**
         * Execute secretInspect request
         * @return SecretInfoReportCompat
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Secret inspect compat </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such secret </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public SecretInfoReportCompat execute() throws ApiException {
            ApiResponse<SecretInfoReportCompat> localVarResp = secretInspectWithHttpInfo(name);
            return localVarResp.getData();
        }

        /**
         * Execute secretInspect request with HTTP info returned
         * @return ApiResponse&lt;SecretInfoReportCompat&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Secret inspect compat </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such secret </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SecretInfoReportCompat> executeWithHttpInfo() throws ApiException {
            return secretInspectWithHttpInfo(name);
        }

        /**
         * Execute secretInspect request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Secret inspect compat </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such secret </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SecretInfoReportCompat> _callback) throws ApiException {
            return secretInspectAsync(name, _callback);
        }
    }

    /**
     * Inspect secret
     * 
     * @param name the name or ID of the secret (required)
     * @return APIsecretInspectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Secret inspect compat </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such secret </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIsecretInspectRequest secretInspect(String name) {
        return new APIsecretInspectRequest(name);
    }
    private okhttp3.Call secretListCall(String filters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/secrets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filters != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filters", filters));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call secretListValidateBeforeCall(String filters, final ApiCallback _callback) throws ApiException {
        return secretListCall(filters, _callback);

    }


    private ApiResponse<List<SecretInfoReportCompat>> secretListWithHttpInfo(String filters) throws ApiException {
        okhttp3.Call localVarCall = secretListValidateBeforeCall(filters, null);
        Type localVarReturnType = new TypeToken<List<SecretInfoReportCompat>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call secretListAsync(String filters, final ApiCallback<List<SecretInfoReportCompat>> _callback) throws ApiException {

        okhttp3.Call localVarCall = secretListValidateBeforeCall(filters, _callback);
        Type localVarReturnType = new TypeToken<List<SecretInfoReportCompat>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIsecretListRequest {
        private String filters;

        private APIsecretListRequest() {
        }

        /**
         * Set filters
         * @param filters JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the secrets list. Currently available filters:   - &#x60;name&#x3D;[name]&#x60; Matches secrets name (accepts regex).   - &#x60;id&#x3D;[id]&#x60; Matches for full or partial ID.  (optional)
         * @return APIsecretListRequest
         */
        public APIsecretListRequest filters(String filters) {
            this.filters = filters;
            return this;
        }

        /**
         * Build call for secretList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Secret list response </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return secretListCall(filters, _callback);
        }

        /**
         * Execute secretList request
         * @return List&lt;SecretInfoReportCompat&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Secret list response </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public List<SecretInfoReportCompat> execute() throws ApiException {
            ApiResponse<List<SecretInfoReportCompat>> localVarResp = secretListWithHttpInfo(filters);
            return localVarResp.getData();
        }

        /**
         * Execute secretList request with HTTP info returned
         * @return ApiResponse&lt;List&lt;SecretInfoReportCompat&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Secret list response </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<SecretInfoReportCompat>> executeWithHttpInfo() throws ApiException {
            return secretListWithHttpInfo(filters);
        }

        /**
         * Execute secretList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Secret list response </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<SecretInfoReportCompat>> _callback) throws ApiException {
            return secretListAsync(filters, _callback);
        }
    }

    /**
     * List secrets
     * Returns a list of secrets
     * @return APIsecretListRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Secret list response </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIsecretListRequest secretList() {
        return new APIsecretListRequest();
    }
}

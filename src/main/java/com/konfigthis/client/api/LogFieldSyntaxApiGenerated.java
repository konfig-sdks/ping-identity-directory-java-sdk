/*
 * PingData Config - OpenAPI 3.0
 * This is the PingData Configuration API
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.LogFieldSyntaxListResponse;
import com.konfigthis.client.model.Operation;
import com.konfigthis.client.model.UpdateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class LogFieldSyntaxApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LogFieldSyntaxApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public LogFieldSyntaxApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAllLogFieldSyntaxesCall(String filter, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/log-field-syntaxes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllLogFieldSyntaxesValidateBeforeCall(String filter, final ApiCallback _callback) throws ApiException {
        return getAllLogFieldSyntaxesCall(filter, _callback);

    }


    private ApiResponse<LogFieldSyntaxListResponse> getAllLogFieldSyntaxesWithHttpInfo(String filter) throws ApiException {
        okhttp3.Call localVarCall = getAllLogFieldSyntaxesValidateBeforeCall(filter, null);
        Type localVarReturnType = new TypeToken<LogFieldSyntaxListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllLogFieldSyntaxesAsync(String filter, final ApiCallback<LogFieldSyntaxListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllLogFieldSyntaxesValidateBeforeCall(filter, _callback);
        Type localVarReturnType = new TypeToken<LogFieldSyntaxListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllLogFieldSyntaxesRequestBuilder {
        private String filter;

        private GetAllLogFieldSyntaxesRequestBuilder() {
        }

        /**
         * Set filter
         * @param filter SCIM filter (optional)
         * @return GetAllLogFieldSyntaxesRequestBuilder
         */
        public GetAllLogFieldSyntaxesRequestBuilder filter(String filter) {
            this.filter = filter;
            return this;
        }
        
        /**
         * Build call for getAllLogFieldSyntaxes
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAllLogFieldSyntaxesCall(filter, _callback);
        }


        /**
         * Execute getAllLogFieldSyntaxes request
         * @return LogFieldSyntaxListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
         </table>
         */
        public LogFieldSyntaxListResponse execute() throws ApiException {
            ApiResponse<LogFieldSyntaxListResponse> localVarResp = getAllLogFieldSyntaxesWithHttpInfo(filter);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAllLogFieldSyntaxes request with HTTP info returned
         * @return ApiResponse&lt;LogFieldSyntaxListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<LogFieldSyntaxListResponse> executeWithHttpInfo() throws ApiException {
            return getAllLogFieldSyntaxesWithHttpInfo(filter);
        }

        /**
         * Execute getAllLogFieldSyntaxes request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<LogFieldSyntaxListResponse> _callback) throws ApiException {
            return getAllLogFieldSyntaxesAsync(filter, _callback);
        }
    }

    /**
     * Returns a list of all Log Field Syntax objects
     * 
     * @return GetAllLogFieldSyntaxesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
     </table>
     */
    public GetAllLogFieldSyntaxesRequestBuilder getAllLogFieldSyntaxes() throws IllegalArgumentException {
        return new GetAllLogFieldSyntaxesRequestBuilder();
    }
    private okhttp3.Call getSyntaxByIdCall(String logFieldSyntaxName, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/log-field-syntaxes/{log-field-syntax-name}"
            .replace("{" + "log-field-syntax-name" + "}", localVarApiClient.escapeString(logFieldSyntaxName.toString()));

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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSyntaxByIdValidateBeforeCall(String logFieldSyntaxName, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'logFieldSyntaxName' is set
        if (logFieldSyntaxName == null) {
            throw new ApiException("Missing the required parameter 'logFieldSyntaxName' when calling getSyntaxById(Async)");
        }

        return getSyntaxByIdCall(logFieldSyntaxName, _callback);

    }


    private ApiResponse<Object> getSyntaxByIdWithHttpInfo(String logFieldSyntaxName) throws ApiException {
        okhttp3.Call localVarCall = getSyntaxByIdValidateBeforeCall(logFieldSyntaxName, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSyntaxByIdAsync(String logFieldSyntaxName, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSyntaxByIdValidateBeforeCall(logFieldSyntaxName, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSyntaxByIdRequestBuilder {
        private final String logFieldSyntaxName;

        private GetSyntaxByIdRequestBuilder(String logFieldSyntaxName) {
            this.logFieldSyntaxName = logFieldSyntaxName;
        }

        /**
         * Build call for getSyntaxById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Log Field Syntax does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSyntaxByIdCall(logFieldSyntaxName, _callback);
        }


        /**
         * Execute getSyntaxById request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Log Field Syntax does not exist </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getSyntaxByIdWithHttpInfo(logFieldSyntaxName);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSyntaxById request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Log Field Syntax does not exist </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getSyntaxByIdWithHttpInfo(logFieldSyntaxName);
        }

        /**
         * Execute getSyntaxById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Log Field Syntax does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getSyntaxByIdAsync(logFieldSyntaxName, _callback);
        }
    }

    /**
     * Returns a single Log Field Syntax
     * 
     * @param logFieldSyntaxName Name of the Log Field Syntax (required)
     * @return GetSyntaxByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The Log Field Syntax does not exist </td><td>  -  </td></tr>
     </table>
     */
    public GetSyntaxByIdRequestBuilder getSyntaxById(String logFieldSyntaxName) throws IllegalArgumentException {
        if (logFieldSyntaxName == null) throw new IllegalArgumentException("\"logFieldSyntaxName\" is required but got null");
            

        return new GetSyntaxByIdRequestBuilder(logFieldSyntaxName);
    }
    private okhttp3.Call updateByNameCall(String logFieldSyntaxName, UpdateRequest updateRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateRequest;

        // create path and map variables
        String localVarPath = "/log-field-syntaxes/{log-field-syntax-name}"
            .replace("{" + "log-field-syntax-name" + "}", localVarApiClient.escapeString(logFieldSyntaxName.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateByNameValidateBeforeCall(String logFieldSyntaxName, UpdateRequest updateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'logFieldSyntaxName' is set
        if (logFieldSyntaxName == null) {
            throw new ApiException("Missing the required parameter 'logFieldSyntaxName' when calling updateByName(Async)");
        }

        // verify the required parameter 'updateRequest' is set
        if (updateRequest == null) {
            throw new ApiException("Missing the required parameter 'updateRequest' when calling updateByName(Async)");
        }

        return updateByNameCall(logFieldSyntaxName, updateRequest, _callback);

    }


    private ApiResponse<Object> updateByNameWithHttpInfo(String logFieldSyntaxName, UpdateRequest updateRequest) throws ApiException {
        okhttp3.Call localVarCall = updateByNameValidateBeforeCall(logFieldSyntaxName, updateRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateByNameAsync(String logFieldSyntaxName, UpdateRequest updateRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateByNameValidateBeforeCall(logFieldSyntaxName, updateRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateByNameRequestBuilder {
        private final List<Operation> operations;
        private final String logFieldSyntaxName;

        private UpdateByNameRequestBuilder(List<Operation> operations, String logFieldSyntaxName) {
            this.operations = operations;
            this.logFieldSyntaxName = logFieldSyntaxName;
        }

        /**
         * Build call for updateByName
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Log Field Syntax does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            return updateByNameCall(logFieldSyntaxName, updateRequest, _callback);
        }

        private UpdateRequest buildBodyParams() {
            UpdateRequest updateRequest = new UpdateRequest();
            updateRequest.operations(this.operations);
            return updateRequest;
        }

        /**
         * Execute updateByName request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Log Field Syntax does not exist </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            ApiResponse<Object> localVarResp = updateByNameWithHttpInfo(logFieldSyntaxName, updateRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateByName request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Log Field Syntax does not exist </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            return updateByNameWithHttpInfo(logFieldSyntaxName, updateRequest);
        }

        /**
         * Execute updateByName request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Log Field Syntax does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            return updateByNameAsync(logFieldSyntaxName, updateRequest, _callback);
        }
    }

    /**
     * Update an existing Log Field Syntax by name
     * 
     * @param logFieldSyntaxName Name of the Log Field Syntax (required)
     * @param updateRequest Update an existing Log Field Syntax (required)
     * @return UpdateByNameRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The Log Field Syntax does not exist </td><td>  -  </td></tr>
     </table>
     */
    public UpdateByNameRequestBuilder updateByName(List<Operation> operations, String logFieldSyntaxName) throws IllegalArgumentException {
        if (operations == null) throw new IllegalArgumentException("\"operations\" is required but got null");
        if (logFieldSyntaxName == null) throw new IllegalArgumentException("\"logFieldSyntaxName\" is required but got null");
            

        return new UpdateByNameRequestBuilder(operations, logFieldSyntaxName);
    }
}

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


import com.konfigthis.client.model.DseeCompatAccessControlHandlerResponse;
import com.konfigthis.client.model.Operation;
import com.konfigthis.client.model.UpdateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AccessControlHandlerApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccessControlHandlerApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AccessControlHandlerApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getSingleCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/access-control-handler";

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
    private okhttp3.Call getSingleValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getSingleCall(_callback);

    }


    private ApiResponse<DseeCompatAccessControlHandlerResponse> getSingleWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSingleValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<DseeCompatAccessControlHandlerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSingleAsync(final ApiCallback<DseeCompatAccessControlHandlerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSingleValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<DseeCompatAccessControlHandlerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSingleRequestBuilder {

        private GetSingleRequestBuilder() {
        }

        /**
         * Build call for getSingle
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Access Control Handler does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSingleCall(_callback);
        }


        /**
         * Execute getSingle request
         * @return DseeCompatAccessControlHandlerResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Access Control Handler does not exist </td><td>  -  </td></tr>
         </table>
         */
        public DseeCompatAccessControlHandlerResponse execute() throws ApiException {
            ApiResponse<DseeCompatAccessControlHandlerResponse> localVarResp = getSingleWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSingle request with HTTP info returned
         * @return ApiResponse&lt;DseeCompatAccessControlHandlerResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Access Control Handler does not exist </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<DseeCompatAccessControlHandlerResponse> executeWithHttpInfo() throws ApiException {
            return getSingleWithHttpInfo();
        }

        /**
         * Execute getSingle request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Access Control Handler does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<DseeCompatAccessControlHandlerResponse> _callback) throws ApiException {
            return getSingleAsync(_callback);
        }
    }

    /**
     * Returns a single Access Control Handler
     * 
     * @return GetSingleRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The Access Control Handler does not exist </td><td>  -  </td></tr>
     </table>
     */
    public GetSingleRequestBuilder getSingle() throws IllegalArgumentException {
        return new GetSingleRequestBuilder();
    }
    private okhttp3.Call updateByNameCall(UpdateRequest updateRequest, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/access-control-handler";

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
    private okhttp3.Call updateByNameValidateBeforeCall(UpdateRequest updateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'updateRequest' is set
        if (updateRequest == null) {
            throw new ApiException("Missing the required parameter 'updateRequest' when calling updateByName(Async)");
        }

        return updateByNameCall(updateRequest, _callback);

    }


    private ApiResponse<DseeCompatAccessControlHandlerResponse> updateByNameWithHttpInfo(UpdateRequest updateRequest) throws ApiException {
        okhttp3.Call localVarCall = updateByNameValidateBeforeCall(updateRequest, null);
        Type localVarReturnType = new TypeToken<DseeCompatAccessControlHandlerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateByNameAsync(UpdateRequest updateRequest, final ApiCallback<DseeCompatAccessControlHandlerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateByNameValidateBeforeCall(updateRequest, _callback);
        Type localVarReturnType = new TypeToken<DseeCompatAccessControlHandlerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateByNameRequestBuilder {
        private final List<Operation> operations;

        private UpdateByNameRequestBuilder(List<Operation> operations) {
            this.operations = operations;
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
            <tr><td> 404 </td><td> The Access Control Handler does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            return updateByNameCall(updateRequest, _callback);
        }

        private UpdateRequest buildBodyParams() {
            UpdateRequest updateRequest = new UpdateRequest();
            updateRequest.operations(this.operations);
            return updateRequest;
        }

        /**
         * Execute updateByName request
         * @return DseeCompatAccessControlHandlerResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Access Control Handler does not exist </td><td>  -  </td></tr>
         </table>
         */
        public DseeCompatAccessControlHandlerResponse execute() throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            ApiResponse<DseeCompatAccessControlHandlerResponse> localVarResp = updateByNameWithHttpInfo(updateRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateByName request with HTTP info returned
         * @return ApiResponse&lt;DseeCompatAccessControlHandlerResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Access Control Handler does not exist </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<DseeCompatAccessControlHandlerResponse> executeWithHttpInfo() throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            return updateByNameWithHttpInfo(updateRequest);
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
            <tr><td> 404 </td><td> The Access Control Handler does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<DseeCompatAccessControlHandlerResponse> _callback) throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            return updateByNameAsync(updateRequest, _callback);
        }
    }

    /**
     * Update an existing Access Control Handler by name
     * 
     * @param updateRequest Update an existing Access Control Handler (required)
     * @return UpdateByNameRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The Access Control Handler does not exist </td><td>  -  </td></tr>
     </table>
     */
    public UpdateByNameRequestBuilder updateByName(List<Operation> operations) throws IllegalArgumentException {
        if (operations == null) throw new IllegalArgumentException("\"operations\" is required but got null");
        return new UpdateByNameRequestBuilder(operations);
    }
}

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


import com.konfigthis.client.model.InterServerAuthenticationInfoListResponse;
import com.konfigthis.client.model.Operation;
import com.konfigthis.client.model.UpdateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class InterServerAuthenticationInfoApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InterServerAuthenticationInfoApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public InterServerAuthenticationInfoApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getSingleAuthenticationInfoCall(String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/server-instances/{server-instance-name}/server-instance-listeners/{server-instance-listener-name}/inter-server-authentication-info/{inter-server-authentication-info-name}"
            .replace("{" + "inter-server-authentication-info-name" + "}", localVarApiClient.escapeString(interServerAuthenticationInfoName.toString()))
            .replace("{" + "server-instance-listener-name" + "}", localVarApiClient.escapeString(serverInstanceListenerName.toString()))
            .replace("{" + "server-instance-name" + "}", localVarApiClient.escapeString(serverInstanceName.toString()));

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
    private okhttp3.Call getSingleAuthenticationInfoValidateBeforeCall(String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'interServerAuthenticationInfoName' is set
        if (interServerAuthenticationInfoName == null) {
            throw new ApiException("Missing the required parameter 'interServerAuthenticationInfoName' when calling getSingleAuthenticationInfo(Async)");
        }

        // verify the required parameter 'serverInstanceListenerName' is set
        if (serverInstanceListenerName == null) {
            throw new ApiException("Missing the required parameter 'serverInstanceListenerName' when calling getSingleAuthenticationInfo(Async)");
        }

        // verify the required parameter 'serverInstanceName' is set
        if (serverInstanceName == null) {
            throw new ApiException("Missing the required parameter 'serverInstanceName' when calling getSingleAuthenticationInfo(Async)");
        }

        return getSingleAuthenticationInfoCall(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, _callback);

    }


    private ApiResponse<Object> getSingleAuthenticationInfoWithHttpInfo(String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName) throws ApiException {
        okhttp3.Call localVarCall = getSingleAuthenticationInfoValidateBeforeCall(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSingleAuthenticationInfoAsync(String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSingleAuthenticationInfoValidateBeforeCall(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSingleAuthenticationInfoRequestBuilder {
        private final String interServerAuthenticationInfoName;
        private final String serverInstanceListenerName;
        private final String serverInstanceName;

        private GetSingleAuthenticationInfoRequestBuilder(String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName) {
            this.interServerAuthenticationInfoName = interServerAuthenticationInfoName;
            this.serverInstanceListenerName = serverInstanceListenerName;
            this.serverInstanceName = serverInstanceName;
        }

        /**
         * Build call for getSingleAuthenticationInfo
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Inter Server Authentication Info does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSingleAuthenticationInfoCall(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, _callback);
        }


        /**
         * Execute getSingleAuthenticationInfo request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Inter Server Authentication Info does not exist </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getSingleAuthenticationInfoWithHttpInfo(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSingleAuthenticationInfo request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Inter Server Authentication Info does not exist </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getSingleAuthenticationInfoWithHttpInfo(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName);
        }

        /**
         * Execute getSingleAuthenticationInfo request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> The Inter Server Authentication Info does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getSingleAuthenticationInfoAsync(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, _callback);
        }
    }

    /**
     * Returns a single Inter Server Authentication Info
     * 
     * @param interServerAuthenticationInfoName Name of the Inter Server Authentication Info (required)
     * @param serverInstanceListenerName Name of the Server Instance Listener (required)
     * @param serverInstanceName Name of the Server Instance (required)
     * @return GetSingleAuthenticationInfoRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The Inter Server Authentication Info does not exist </td><td>  -  </td></tr>
     </table>
     */
    public GetSingleAuthenticationInfoRequestBuilder getSingleAuthenticationInfo(String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName) throws IllegalArgumentException {
        if (interServerAuthenticationInfoName == null) throw new IllegalArgumentException("\"interServerAuthenticationInfoName\" is required but got null");
            

        if (serverInstanceListenerName == null) throw new IllegalArgumentException("\"serverInstanceListenerName\" is required but got null");
            

        if (serverInstanceName == null) throw new IllegalArgumentException("\"serverInstanceName\" is required but got null");
            

        return new GetSingleAuthenticationInfoRequestBuilder(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName);
    }
    private okhttp3.Call listInterServerAuthenticationInfoCall(String serverInstanceListenerName, String serverInstanceName, String filter, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/server-instances/{server-instance-name}/server-instance-listeners/{server-instance-listener-name}/inter-server-authentication-info"
            .replace("{" + "server-instance-listener-name" + "}", localVarApiClient.escapeString(serverInstanceListenerName.toString()))
            .replace("{" + "server-instance-name" + "}", localVarApiClient.escapeString(serverInstanceName.toString()));

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
    private okhttp3.Call listInterServerAuthenticationInfoValidateBeforeCall(String serverInstanceListenerName, String serverInstanceName, String filter, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'serverInstanceListenerName' is set
        if (serverInstanceListenerName == null) {
            throw new ApiException("Missing the required parameter 'serverInstanceListenerName' when calling listInterServerAuthenticationInfo(Async)");
        }

        // verify the required parameter 'serverInstanceName' is set
        if (serverInstanceName == null) {
            throw new ApiException("Missing the required parameter 'serverInstanceName' when calling listInterServerAuthenticationInfo(Async)");
        }

        return listInterServerAuthenticationInfoCall(serverInstanceListenerName, serverInstanceName, filter, _callback);

    }


    private ApiResponse<InterServerAuthenticationInfoListResponse> listInterServerAuthenticationInfoWithHttpInfo(String serverInstanceListenerName, String serverInstanceName, String filter) throws ApiException {
        okhttp3.Call localVarCall = listInterServerAuthenticationInfoValidateBeforeCall(serverInstanceListenerName, serverInstanceName, filter, null);
        Type localVarReturnType = new TypeToken<InterServerAuthenticationInfoListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listInterServerAuthenticationInfoAsync(String serverInstanceListenerName, String serverInstanceName, String filter, final ApiCallback<InterServerAuthenticationInfoListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listInterServerAuthenticationInfoValidateBeforeCall(serverInstanceListenerName, serverInstanceName, filter, _callback);
        Type localVarReturnType = new TypeToken<InterServerAuthenticationInfoListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListInterServerAuthenticationInfoRequestBuilder {
        private final String serverInstanceListenerName;
        private final String serverInstanceName;
        private String filter;

        private ListInterServerAuthenticationInfoRequestBuilder(String serverInstanceListenerName, String serverInstanceName) {
            this.serverInstanceListenerName = serverInstanceListenerName;
            this.serverInstanceName = serverInstanceName;
        }

        /**
         * Set filter
         * @param filter SCIM filter (optional)
         * @return ListInterServerAuthenticationInfoRequestBuilder
         */
        public ListInterServerAuthenticationInfoRequestBuilder filter(String filter) {
            this.filter = filter;
            return this;
        }
        
        /**
         * Build call for listInterServerAuthenticationInfo
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
            return listInterServerAuthenticationInfoCall(serverInstanceListenerName, serverInstanceName, filter, _callback);
        }


        /**
         * Execute listInterServerAuthenticationInfo request
         * @return InterServerAuthenticationInfoListResponse
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
        public InterServerAuthenticationInfoListResponse execute() throws ApiException {
            ApiResponse<InterServerAuthenticationInfoListResponse> localVarResp = listInterServerAuthenticationInfoWithHttpInfo(serverInstanceListenerName, serverInstanceName, filter);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listInterServerAuthenticationInfo request with HTTP info returned
         * @return ApiResponse&lt;InterServerAuthenticationInfoListResponse&gt;
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
        public ApiResponse<InterServerAuthenticationInfoListResponse> executeWithHttpInfo() throws ApiException {
            return listInterServerAuthenticationInfoWithHttpInfo(serverInstanceListenerName, serverInstanceName, filter);
        }

        /**
         * Execute listInterServerAuthenticationInfo request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<InterServerAuthenticationInfoListResponse> _callback) throws ApiException {
            return listInterServerAuthenticationInfoAsync(serverInstanceListenerName, serverInstanceName, filter, _callback);
        }
    }

    /**
     * Returns a list of all Inter Server Authentication Info objects
     * 
     * @param serverInstanceListenerName Name of the Server Instance Listener (required)
     * @param serverInstanceName Name of the Server Instance (required)
     * @return ListInterServerAuthenticationInfoRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
     </table>
     */
    public ListInterServerAuthenticationInfoRequestBuilder listInterServerAuthenticationInfo(String serverInstanceListenerName, String serverInstanceName) throws IllegalArgumentException {
        if (serverInstanceListenerName == null) throw new IllegalArgumentException("\"serverInstanceListenerName\" is required but got null");
            

        if (serverInstanceName == null) throw new IllegalArgumentException("\"serverInstanceName\" is required but got null");
            

        return new ListInterServerAuthenticationInfoRequestBuilder(serverInstanceListenerName, serverInstanceName);
    }
    private okhttp3.Call updateByNameCall(String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName, UpdateRequest updateRequest, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/server-instances/{server-instance-name}/server-instance-listeners/{server-instance-listener-name}/inter-server-authentication-info/{inter-server-authentication-info-name}"
            .replace("{" + "inter-server-authentication-info-name" + "}", localVarApiClient.escapeString(interServerAuthenticationInfoName.toString()))
            .replace("{" + "server-instance-listener-name" + "}", localVarApiClient.escapeString(serverInstanceListenerName.toString()))
            .replace("{" + "server-instance-name" + "}", localVarApiClient.escapeString(serverInstanceName.toString()));

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
    private okhttp3.Call updateByNameValidateBeforeCall(String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName, UpdateRequest updateRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'interServerAuthenticationInfoName' is set
        if (interServerAuthenticationInfoName == null) {
            throw new ApiException("Missing the required parameter 'interServerAuthenticationInfoName' when calling updateByName(Async)");
        }

        // verify the required parameter 'serverInstanceListenerName' is set
        if (serverInstanceListenerName == null) {
            throw new ApiException("Missing the required parameter 'serverInstanceListenerName' when calling updateByName(Async)");
        }

        // verify the required parameter 'serverInstanceName' is set
        if (serverInstanceName == null) {
            throw new ApiException("Missing the required parameter 'serverInstanceName' when calling updateByName(Async)");
        }

        // verify the required parameter 'updateRequest' is set
        if (updateRequest == null) {
            throw new ApiException("Missing the required parameter 'updateRequest' when calling updateByName(Async)");
        }

        return updateByNameCall(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, updateRequest, _callback);

    }


    private ApiResponse<Object> updateByNameWithHttpInfo(String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName, UpdateRequest updateRequest) throws ApiException {
        okhttp3.Call localVarCall = updateByNameValidateBeforeCall(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, updateRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateByNameAsync(String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName, UpdateRequest updateRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateByNameValidateBeforeCall(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, updateRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateByNameRequestBuilder {
        private final List<Operation> operations;
        private final String interServerAuthenticationInfoName;
        private final String serverInstanceListenerName;
        private final String serverInstanceName;

        private UpdateByNameRequestBuilder(List<Operation> operations, String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName) {
            this.operations = operations;
            this.interServerAuthenticationInfoName = interServerAuthenticationInfoName;
            this.serverInstanceListenerName = serverInstanceListenerName;
            this.serverInstanceName = serverInstanceName;
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
            <tr><td> 404 </td><td> The Inter Server Authentication Info does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            return updateByNameCall(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, updateRequest, _callback);
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
            <tr><td> 404 </td><td> The Inter Server Authentication Info does not exist </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            ApiResponse<Object> localVarResp = updateByNameWithHttpInfo(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, updateRequest);
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
            <tr><td> 404 </td><td> The Inter Server Authentication Info does not exist </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            return updateByNameWithHttpInfo(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, updateRequest);
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
            <tr><td> 404 </td><td> The Inter Server Authentication Info does not exist </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            UpdateRequest updateRequest = buildBodyParams();
            return updateByNameAsync(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, updateRequest, _callback);
        }
    }

    /**
     * Update an existing Inter Server Authentication Info by name
     * 
     * @param interServerAuthenticationInfoName Name of the Inter Server Authentication Info (required)
     * @param serverInstanceListenerName Name of the Server Instance Listener (required)
     * @param serverInstanceName Name of the Server Instance (required)
     * @param updateRequest Update an existing Inter Server Authentication Info (required)
     * @return UpdateByNameRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Requestor cannot be authenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Requestor does not have the required privileges </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The Inter Server Authentication Info does not exist </td><td>  -  </td></tr>
     </table>
     */
    public UpdateByNameRequestBuilder updateByName(List<Operation> operations, String interServerAuthenticationInfoName, String serverInstanceListenerName, String serverInstanceName) throws IllegalArgumentException {
        if (operations == null) throw new IllegalArgumentException("\"operations\" is required but got null");
        if (interServerAuthenticationInfoName == null) throw new IllegalArgumentException("\"interServerAuthenticationInfoName\" is required but got null");
            

        if (serverInstanceListenerName == null) throw new IllegalArgumentException("\"serverInstanceListenerName\" is required but got null");
            

        if (serverInstanceName == null) throw new IllegalArgumentException("\"serverInstanceName\" is required but got null");
            

        return new UpdateByNameRequestBuilder(operations, interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName);
    }
}

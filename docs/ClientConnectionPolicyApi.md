# ClientConnectionPolicyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewPolicy**](ClientConnectionPolicyApi.md#addNewPolicy) | **POST** /client-connection-policies | Add a new Client Connection Policy to the config |
| [**deleteById**](ClientConnectionPolicyApi.md#deleteById) | **DELETE** /client-connection-policies/{client-connection-policy-name} | Delete a Client Connection Policy |
| [**getAllObjects**](ClientConnectionPolicyApi.md#getAllObjects) | **GET** /client-connection-policies | Returns a list of all Client Connection Policy objects |
| [**getSingle**](ClientConnectionPolicyApi.md#getSingle) | **GET** /client-connection-policies/{client-connection-policy-name} | Returns a single Client Connection Policy |
| [**updateByName**](ClientConnectionPolicyApi.md#updateByName) | **PATCH** /client-connection-policies/{client-connection-policy-name} | Update an existing Client Connection Policy by name |


<a name="addNewPolicy"></a>
# **addNewPolicy**
> ClientConnectionPolicyResponse addNewPolicy(addClientConnectionPolicyRequest).execute();

Add a new Client Connection Policy to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClientConnectionPolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String policyName = "policyName_example"; // Name of the new Client Connection Policy
    String description = "description_example"; // A description for this Client Connection Policy
    List<EnumclientConnectionPolicySchemaUrn> schemas = Arrays.asList();
    String policyID = "policyID_example"; // Specifies a name which uniquely identifies this Client Connection Policy in the server.
    Boolean enabled = true; // Indicates whether this Client Connection Policy is enabled for use in the server. If a Client Connection Policy is disabled, then no new client connections will be associated with it.
    Integer evaluationOrderIndex = 56; // Specifies the order in which Client Connection Policy definitions will be evaluated. A Client Connection Policy with a lower index will be evaluated before one with a higher index, and the first Client Connection Policy evaluated which may apply to a client connection will be used for that connection. Each Client Connection Policy must be assigned a unique evaluation order index value.
    String connectionCriteria = "connectionCriteria_example"; // Specifies a set of connection criteria that must match the associated client connection for it to be associated with this Client Connection Policy.
    Boolean terminateConnection = true; // Indicates whether any client connection for which this Client Connection Policy is selected should be terminated. This makes it possible to define fine-grained criteria for clients that should not be allowed to connect to this Directory Server.
    List<String> sensitiveAttribute = Arrays.asList(); // Provides the ability to indicate that some attributes should be considered sensitive and additional protection should be in place when interacting with those attributes.
    List<String> excludeGlobalSensitiveAttribute = Arrays.asList(); // Specifies the set of global sensitive attribute definitions that should not apply to this client connection policy.
    String resultCodeMap = "resultCodeMap_example"; // Specifies the result code map that should be used for clients associated with this Client Connection Policy. If a value is defined for this property, then it will override any result code map referenced in the global configuration.
    List<String> includedBackendBaseDN = Arrays.asList(); // Specifies the set of backend base DNs for which subtree views should be included in this Client Connection Policy.
    List<String> excludedBackendBaseDN = Arrays.asList(); // Specifies the set of backend base DNs for which subtree views should be excluded from this Client Connection Policy.
    List<EnumclientConnectionPolicyAllowedOperationProp> allowedOperation = Arrays.asList();
    String requiredOperationRequestCriteria = "requiredOperationRequestCriteria_example"; // Specifies a request criteria object that will be required to match all requests submitted by clients associated with this Client Connection Policy. If a client submits a request that does not satisfy this request criteria object, then that request will be rejected.
    String prohibitedOperationRequestCriteria = "prohibitedOperationRequestCriteria_example"; // Specifies a request criteria object that must not match any requests submitted by clients associated with this Client Connection Policy. If a client submits a request that satisfies this request criteria object, then that request will be rejected.
    List<String> allowedRequestControl = Arrays.asList(); // Specifies the OIDs of the controls that clients associated with this Client Connection Policy will be allowed to include in requests.
    List<String> deniedRequestControl = Arrays.asList(); // Specifies the OIDs of the controls that clients associated with this Client Connection Policy will not be allowed to include in requests.
    List<String> allowedExtendedOperation = Arrays.asList(); // Specifies the OIDs of the extended operations that clients associated with this Client Connection Policy will be allowed to request.
    List<String> deniedExtendedOperation = Arrays.asList(); // Specifies the OIDs of the extended operations that clients associated with this Client Connection Policy will not be allowed to request.
    List<EnumclientConnectionPolicyAllowedAuthTypeProp> allowedAuthType = Arrays.asList();
    List<String> allowedSASLMechanism = Arrays.asList(); // Specifies the names of the SASL mechanisms that clients associated with this Client Connection Policy will be allowed to request.
    List<String> deniedSASLMechanism = Arrays.asList(); // Specifies the names of the SASL mechanisms that clients associated with this Client Connection Policy will not be allowed to request.
    List<EnumclientConnectionPolicyAllowedFilterTypeProp> allowedFilterType = Arrays.asList();
    Boolean allowUnindexedSearches = true; // Indicates whether clients will be allowed to request search operations that cannot be efficiently processed using the set of indexes defined in the corresponding backend. Note that even if this is false, some clients may be able to request unindexed searches if the allow-unindexed-searches-with-control property has a value of true and the necessary conditions are satisfied.
    Boolean allowUnindexedSearchesWithControl = true; // Indicates whether clients will be allowed to request search operations that cannot be efficiently processed using the set of indexes defined in the corresponding backend, as long as the search request also includes the permit unindexed search request control and the requester has the unindexed-search-with-control privilege (or that privilege is disabled in the global configuration).
    Integer minimumSubstringLength = 56; // Specifies the minimum number of consecutive bytes that must be present in any subInitial, subAny, or subFinal element of a substring filter component (i.e., the minimum number of consecutive bytes between wildcard characters in a substring filter). Any attempt to use a substring search with an element containing fewer than this number of bytes will be rejected.
    Integer maximumConcurrentConnections = 56; // Specifies the maximum number of client connections which may be associated with this Client Connection Policy at any given time.
    String maximumConnectionDuration = "maximumConnectionDuration_example"; // Specifies the maximum length of time that a connection associated with this Client Connection Policy may be established. Any connection which is associated with this Client Connection Policy and has been established for longer than this period of time may be terminated.
    String maximumIdleConnectionDuration = "maximumIdleConnectionDuration_example"; // Specifies the maximum length of time that a connection associated with this Client Connection Policy may remain established after the completion of the last operation processed on that connection. Any new operation requested on the connection will reset this timer. Any connection associated with this Client Connection Policy which has been idle for longer than this length of time may be terminated.
    Integer maximumOperationCountPerConnection = 56; // Specifies the maximum number of operations that may be requested by any client connection associated with this Client Connection Policy. If an attempt is made to process more than this number of operations on a client connection, then that connection will be terminated.
    Integer maximumConcurrentOperationsPerConnection = 56; // Specifies the maximum number of concurrent operations that can be in progress for any connection. This can help prevent a single client connection from monopolizing server processing resources by sending a large number of concurrent asynchronous requests. A value of zero indicates that no limit will be placed on the number of concurrent requests for a single client.
    String maximumConcurrentOperationWaitTimeBeforeRejecting = "maximumConcurrentOperationWaitTimeBeforeRejecting_example"; // Specifies the maximum length of time that the server should wait for an outstanding operation to complete before rejecting a new request received when the maximum number of outstanding operations are already in progress on that connection. If an existing outstanding operation on the connection completes before this time, then the operation will be processed. Otherwise, the operation will be rejected with a \\\"busy\\\" result.
    EnumclientConnectionPolicyMaximumConcurrentOperationsPerConnectionExceededBehaviorProp maximumConcurrentOperationsPerConnectionExceededBehavior = EnumclientConnectionPolicyMaximumConcurrentOperationsPerConnectionExceededBehaviorProp.fromValue("disconnect");
    List<String> maximumConnectionOperationRate = Arrays.asList(); // Specifies the maximum rate at which a client associated with this Client Connection Policy may issue requests to the Directory Server. If any client attempts to request operations at a rate higher than this limit, then the server will exhibit the behavior described in the connection-operation-rate-exceeded-behavior property.
    EnumclientConnectionPolicyConnectionOperationRateExceededBehaviorProp connectionOperationRateExceededBehavior = EnumclientConnectionPolicyConnectionOperationRateExceededBehaviorProp.fromValue("disconnect");
    List<String> maximumPolicyOperationRate = Arrays.asList(); // Specifies the maximum rate at which all clients associated with this Client Connection Policy, as a collective set, may issue requests to the Directory Server. If this limit is exceeded, then the server will exhibit the behavior described in the policy-operation-rate-exceeded-behavior property.
    EnumclientConnectionPolicyPolicyOperationRateExceededBehaviorProp policyOperationRateExceededBehavior = EnumclientConnectionPolicyPolicyOperationRateExceededBehaviorProp.fromValue("disconnect");
    Integer maximumSearchSizeLimit = 56; // Specifies the maximum number of entries that may be returned for a search performed by a client associated with this Client Connection Policy.
    String maximumSearchTimeLimit = "maximumSearchTimeLimit_example"; // Specifies the maximum length of time that the server should spend processing search operations requested by clients associated with this Client Connection Policy.
    Integer maximumSearchLookthroughLimit = 56; // Specifies the maximum number of entries that may be examined by a backend in the course of processing a search requested by clients associated with this Client Connection Policy.
    Integer maximumLDAPJoinSizeLimit = 56; // Specifies the maximum number of entries that may be joined with any single search result entry for a search request performed by a client associated with this Client Connection Policy.
    Integer maximumSortSizeLimitWithoutVLVIndex = 56; // Specifies the maximum number of entries that the server will attempt to sort without the benefit of a VLV index. A value of zero indicates that no limit should be enforced.
    try {
      ClientConnectionPolicyResponse result = client
              .clientConnectionPolicy
              .addNewPolicy(policyName)
              .description(description)
              .schemas(schemas)
              .policyID(policyID)
              .enabled(enabled)
              .evaluationOrderIndex(evaluationOrderIndex)
              .connectionCriteria(connectionCriteria)
              .terminateConnection(terminateConnection)
              .sensitiveAttribute(sensitiveAttribute)
              .excludeGlobalSensitiveAttribute(excludeGlobalSensitiveAttribute)
              .resultCodeMap(resultCodeMap)
              .includedBackendBaseDN(includedBackendBaseDN)
              .excludedBackendBaseDN(excludedBackendBaseDN)
              .allowedOperation(allowedOperation)
              .requiredOperationRequestCriteria(requiredOperationRequestCriteria)
              .prohibitedOperationRequestCriteria(prohibitedOperationRequestCriteria)
              .allowedRequestControl(allowedRequestControl)
              .deniedRequestControl(deniedRequestControl)
              .allowedExtendedOperation(allowedExtendedOperation)
              .deniedExtendedOperation(deniedExtendedOperation)
              .allowedAuthType(allowedAuthType)
              .allowedSASLMechanism(allowedSASLMechanism)
              .deniedSASLMechanism(deniedSASLMechanism)
              .allowedFilterType(allowedFilterType)
              .allowUnindexedSearches(allowUnindexedSearches)
              .allowUnindexedSearchesWithControl(allowUnindexedSearchesWithControl)
              .minimumSubstringLength(minimumSubstringLength)
              .maximumConcurrentConnections(maximumConcurrentConnections)
              .maximumConnectionDuration(maximumConnectionDuration)
              .maximumIdleConnectionDuration(maximumIdleConnectionDuration)
              .maximumOperationCountPerConnection(maximumOperationCountPerConnection)
              .maximumConcurrentOperationsPerConnection(maximumConcurrentOperationsPerConnection)
              .maximumConcurrentOperationWaitTimeBeforeRejecting(maximumConcurrentOperationWaitTimeBeforeRejecting)
              .maximumConcurrentOperationsPerConnectionExceededBehavior(maximumConcurrentOperationsPerConnectionExceededBehavior)
              .maximumConnectionOperationRate(maximumConnectionOperationRate)
              .connectionOperationRateExceededBehavior(connectionOperationRateExceededBehavior)
              .maximumPolicyOperationRate(maximumPolicyOperationRate)
              .policyOperationRateExceededBehavior(policyOperationRateExceededBehavior)
              .maximumSearchSizeLimit(maximumSearchSizeLimit)
              .maximumSearchTimeLimit(maximumSearchTimeLimit)
              .maximumSearchLookthroughLimit(maximumSearchLookthroughLimit)
              .maximumLDAPJoinSizeLimit(maximumLDAPJoinSizeLimit)
              .maximumSortSizeLimitWithoutVLVIndex(maximumSortSizeLimitWithoutVLVIndex)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getPolicyID());
      System.out.println(result.getEnabled());
      System.out.println(result.getEvaluationOrderIndex());
      System.out.println(result.getConnectionCriteria());
      System.out.println(result.getTerminateConnection());
      System.out.println(result.getSensitiveAttribute());
      System.out.println(result.getExcludeGlobalSensitiveAttribute());
      System.out.println(result.getResultCodeMap());
      System.out.println(result.getIncludedBackendBaseDN());
      System.out.println(result.getExcludedBackendBaseDN());
      System.out.println(result.getAllowedOperation());
      System.out.println(result.getRequiredOperationRequestCriteria());
      System.out.println(result.getProhibitedOperationRequestCriteria());
      System.out.println(result.getAllowedRequestControl());
      System.out.println(result.getDeniedRequestControl());
      System.out.println(result.getAllowedExtendedOperation());
      System.out.println(result.getDeniedExtendedOperation());
      System.out.println(result.getAllowedAuthType());
      System.out.println(result.getAllowedSASLMechanism());
      System.out.println(result.getDeniedSASLMechanism());
      System.out.println(result.getAllowedFilterType());
      System.out.println(result.getAllowUnindexedSearches());
      System.out.println(result.getAllowUnindexedSearchesWithControl());
      System.out.println(result.getMinimumSubstringLength());
      System.out.println(result.getMaximumConcurrentConnections());
      System.out.println(result.getMaximumConnectionDuration());
      System.out.println(result.getMaximumIdleConnectionDuration());
      System.out.println(result.getMaximumOperationCountPerConnection());
      System.out.println(result.getMaximumConcurrentOperationsPerConnection());
      System.out.println(result.getMaximumConcurrentOperationWaitTimeBeforeRejecting());
      System.out.println(result.getMaximumConcurrentOperationsPerConnectionExceededBehavior());
      System.out.println(result.getMaximumConnectionOperationRate());
      System.out.println(result.getConnectionOperationRateExceededBehavior());
      System.out.println(result.getMaximumPolicyOperationRate());
      System.out.println(result.getPolicyOperationRateExceededBehavior());
      System.out.println(result.getMaximumSearchSizeLimit());
      System.out.println(result.getMaximumSearchTimeLimit());
      System.out.println(result.getMaximumSearchLookthroughLimit());
      System.out.println(result.getMaximumLDAPJoinSizeLimit());
      System.out.println(result.getMaximumSortSizeLimitWithoutVLVIndex());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientConnectionPolicyApi#addNewPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClientConnectionPolicyResponse> response = client
              .clientConnectionPolicy
              .addNewPolicy(policyName)
              .description(description)
              .schemas(schemas)
              .policyID(policyID)
              .enabled(enabled)
              .evaluationOrderIndex(evaluationOrderIndex)
              .connectionCriteria(connectionCriteria)
              .terminateConnection(terminateConnection)
              .sensitiveAttribute(sensitiveAttribute)
              .excludeGlobalSensitiveAttribute(excludeGlobalSensitiveAttribute)
              .resultCodeMap(resultCodeMap)
              .includedBackendBaseDN(includedBackendBaseDN)
              .excludedBackendBaseDN(excludedBackendBaseDN)
              .allowedOperation(allowedOperation)
              .requiredOperationRequestCriteria(requiredOperationRequestCriteria)
              .prohibitedOperationRequestCriteria(prohibitedOperationRequestCriteria)
              .allowedRequestControl(allowedRequestControl)
              .deniedRequestControl(deniedRequestControl)
              .allowedExtendedOperation(allowedExtendedOperation)
              .deniedExtendedOperation(deniedExtendedOperation)
              .allowedAuthType(allowedAuthType)
              .allowedSASLMechanism(allowedSASLMechanism)
              .deniedSASLMechanism(deniedSASLMechanism)
              .allowedFilterType(allowedFilterType)
              .allowUnindexedSearches(allowUnindexedSearches)
              .allowUnindexedSearchesWithControl(allowUnindexedSearchesWithControl)
              .minimumSubstringLength(minimumSubstringLength)
              .maximumConcurrentConnections(maximumConcurrentConnections)
              .maximumConnectionDuration(maximumConnectionDuration)
              .maximumIdleConnectionDuration(maximumIdleConnectionDuration)
              .maximumOperationCountPerConnection(maximumOperationCountPerConnection)
              .maximumConcurrentOperationsPerConnection(maximumConcurrentOperationsPerConnection)
              .maximumConcurrentOperationWaitTimeBeforeRejecting(maximumConcurrentOperationWaitTimeBeforeRejecting)
              .maximumConcurrentOperationsPerConnectionExceededBehavior(maximumConcurrentOperationsPerConnectionExceededBehavior)
              .maximumConnectionOperationRate(maximumConnectionOperationRate)
              .connectionOperationRateExceededBehavior(connectionOperationRateExceededBehavior)
              .maximumPolicyOperationRate(maximumPolicyOperationRate)
              .policyOperationRateExceededBehavior(policyOperationRateExceededBehavior)
              .maximumSearchSizeLimit(maximumSearchSizeLimit)
              .maximumSearchTimeLimit(maximumSearchTimeLimit)
              .maximumSearchLookthroughLimit(maximumSearchLookthroughLimit)
              .maximumLDAPJoinSizeLimit(maximumLDAPJoinSizeLimit)
              .maximumSortSizeLimitWithoutVLVIndex(maximumSortSizeLimitWithoutVLVIndex)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientConnectionPolicyApi#addNewPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addClientConnectionPolicyRequest** | [**AddClientConnectionPolicyRequest**](AddClientConnectionPolicyRequest.md)| Create a new Client Connection Policy in the config | |

### Return type

[**ClientConnectionPolicyResponse**](ClientConnectionPolicyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **409** | The Client Connection Policy already exists |  -  |

<a name="deleteById"></a>
# **deleteById**
> deleteById(clientConnectionPolicyName).execute();

Delete a Client Connection Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClientConnectionPolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String clientConnectionPolicyName = "clientConnectionPolicyName_example"; // Name of the Client Connection Policy
    try {
      client
              .clientConnectionPolicy
              .deleteById(clientConnectionPolicyName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientConnectionPolicyApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .clientConnectionPolicy
              .deleteById(clientConnectionPolicyName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientConnectionPolicyApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientConnectionPolicyName** | **String**| Name of the Client Connection Policy | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **404** | The Client Connection Policy does not exist |  -  |
| **409** | The Client Connection Policy cannot be deleted |  -  |

<a name="getAllObjects"></a>
# **getAllObjects**
> ClientConnectionPolicyListResponse getAllObjects().filter(filter).execute();

Returns a list of all Client Connection Policy objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClientConnectionPolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String filter = "filter_example"; // SCIM filter
    try {
      ClientConnectionPolicyListResponse result = client
              .clientConnectionPolicy
              .getAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientConnectionPolicyApi#getAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClientConnectionPolicyListResponse> response = client
              .clientConnectionPolicy
              .getAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientConnectionPolicyApi#getAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**ClientConnectionPolicyListResponse**](ClientConnectionPolicyListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |

<a name="getSingle"></a>
# **getSingle**
> ClientConnectionPolicyResponse getSingle(clientConnectionPolicyName).execute();

Returns a single Client Connection Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClientConnectionPolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String clientConnectionPolicyName = "clientConnectionPolicyName_example"; // Name of the Client Connection Policy
    try {
      ClientConnectionPolicyResponse result = client
              .clientConnectionPolicy
              .getSingle(clientConnectionPolicyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getPolicyID());
      System.out.println(result.getEnabled());
      System.out.println(result.getEvaluationOrderIndex());
      System.out.println(result.getConnectionCriteria());
      System.out.println(result.getTerminateConnection());
      System.out.println(result.getSensitiveAttribute());
      System.out.println(result.getExcludeGlobalSensitiveAttribute());
      System.out.println(result.getResultCodeMap());
      System.out.println(result.getIncludedBackendBaseDN());
      System.out.println(result.getExcludedBackendBaseDN());
      System.out.println(result.getAllowedOperation());
      System.out.println(result.getRequiredOperationRequestCriteria());
      System.out.println(result.getProhibitedOperationRequestCriteria());
      System.out.println(result.getAllowedRequestControl());
      System.out.println(result.getDeniedRequestControl());
      System.out.println(result.getAllowedExtendedOperation());
      System.out.println(result.getDeniedExtendedOperation());
      System.out.println(result.getAllowedAuthType());
      System.out.println(result.getAllowedSASLMechanism());
      System.out.println(result.getDeniedSASLMechanism());
      System.out.println(result.getAllowedFilterType());
      System.out.println(result.getAllowUnindexedSearches());
      System.out.println(result.getAllowUnindexedSearchesWithControl());
      System.out.println(result.getMinimumSubstringLength());
      System.out.println(result.getMaximumConcurrentConnections());
      System.out.println(result.getMaximumConnectionDuration());
      System.out.println(result.getMaximumIdleConnectionDuration());
      System.out.println(result.getMaximumOperationCountPerConnection());
      System.out.println(result.getMaximumConcurrentOperationsPerConnection());
      System.out.println(result.getMaximumConcurrentOperationWaitTimeBeforeRejecting());
      System.out.println(result.getMaximumConcurrentOperationsPerConnectionExceededBehavior());
      System.out.println(result.getMaximumConnectionOperationRate());
      System.out.println(result.getConnectionOperationRateExceededBehavior());
      System.out.println(result.getMaximumPolicyOperationRate());
      System.out.println(result.getPolicyOperationRateExceededBehavior());
      System.out.println(result.getMaximumSearchSizeLimit());
      System.out.println(result.getMaximumSearchTimeLimit());
      System.out.println(result.getMaximumSearchLookthroughLimit());
      System.out.println(result.getMaximumLDAPJoinSizeLimit());
      System.out.println(result.getMaximumSortSizeLimitWithoutVLVIndex());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientConnectionPolicyApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClientConnectionPolicyResponse> response = client
              .clientConnectionPolicy
              .getSingle(clientConnectionPolicyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientConnectionPolicyApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientConnectionPolicyName** | **String**| Name of the Client Connection Policy | |

### Return type

[**ClientConnectionPolicyResponse**](ClientConnectionPolicyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **404** | The Client Connection Policy does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> ClientConnectionPolicyResponse updateByName(clientConnectionPolicyName, updateRequest).execute();

Update an existing Client Connection Policy by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClientConnectionPolicyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    List<Operation> operations = Arrays.asList();
    String clientConnectionPolicyName = "clientConnectionPolicyName_example"; // Name of the Client Connection Policy
    try {
      ClientConnectionPolicyResponse result = client
              .clientConnectionPolicy
              .updateByName(operations, clientConnectionPolicyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getPolicyID());
      System.out.println(result.getEnabled());
      System.out.println(result.getEvaluationOrderIndex());
      System.out.println(result.getConnectionCriteria());
      System.out.println(result.getTerminateConnection());
      System.out.println(result.getSensitiveAttribute());
      System.out.println(result.getExcludeGlobalSensitiveAttribute());
      System.out.println(result.getResultCodeMap());
      System.out.println(result.getIncludedBackendBaseDN());
      System.out.println(result.getExcludedBackendBaseDN());
      System.out.println(result.getAllowedOperation());
      System.out.println(result.getRequiredOperationRequestCriteria());
      System.out.println(result.getProhibitedOperationRequestCriteria());
      System.out.println(result.getAllowedRequestControl());
      System.out.println(result.getDeniedRequestControl());
      System.out.println(result.getAllowedExtendedOperation());
      System.out.println(result.getDeniedExtendedOperation());
      System.out.println(result.getAllowedAuthType());
      System.out.println(result.getAllowedSASLMechanism());
      System.out.println(result.getDeniedSASLMechanism());
      System.out.println(result.getAllowedFilterType());
      System.out.println(result.getAllowUnindexedSearches());
      System.out.println(result.getAllowUnindexedSearchesWithControl());
      System.out.println(result.getMinimumSubstringLength());
      System.out.println(result.getMaximumConcurrentConnections());
      System.out.println(result.getMaximumConnectionDuration());
      System.out.println(result.getMaximumIdleConnectionDuration());
      System.out.println(result.getMaximumOperationCountPerConnection());
      System.out.println(result.getMaximumConcurrentOperationsPerConnection());
      System.out.println(result.getMaximumConcurrentOperationWaitTimeBeforeRejecting());
      System.out.println(result.getMaximumConcurrentOperationsPerConnectionExceededBehavior());
      System.out.println(result.getMaximumConnectionOperationRate());
      System.out.println(result.getConnectionOperationRateExceededBehavior());
      System.out.println(result.getMaximumPolicyOperationRate());
      System.out.println(result.getPolicyOperationRateExceededBehavior());
      System.out.println(result.getMaximumSearchSizeLimit());
      System.out.println(result.getMaximumSearchTimeLimit());
      System.out.println(result.getMaximumSearchLookthroughLimit());
      System.out.println(result.getMaximumLDAPJoinSizeLimit());
      System.out.println(result.getMaximumSortSizeLimitWithoutVLVIndex());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientConnectionPolicyApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ClientConnectionPolicyResponse> response = client
              .clientConnectionPolicy
              .updateByName(operations, clientConnectionPolicyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientConnectionPolicyApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientConnectionPolicyName** | **String**| Name of the Client Connection Policy | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Client Connection Policy | |

### Return type

[**ClientConnectionPolicyResponse**](ClientConnectionPolicyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid request |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **404** | The Client Connection Policy does not exist |  -  |


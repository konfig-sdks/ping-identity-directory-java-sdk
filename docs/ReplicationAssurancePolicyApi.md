# ReplicationAssurancePolicyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNew**](ReplicationAssurancePolicyApi.md#addNew) | **POST** /replication-assurance-policies | Add a new Replication Assurance Policy to the config |
| [**deletePolicy**](ReplicationAssurancePolicyApi.md#deletePolicy) | **DELETE** /replication-assurance-policies/{replication-assurance-policy-name} | Delete a Replication Assurance Policy |
| [**getSinglePolicy**](ReplicationAssurancePolicyApi.md#getSinglePolicy) | **GET** /replication-assurance-policies/{replication-assurance-policy-name} | Returns a single Replication Assurance Policy |
| [**listAllObjects**](ReplicationAssurancePolicyApi.md#listAllObjects) | **GET** /replication-assurance-policies | Returns a list of all Replication Assurance Policy objects |
| [**updateByName**](ReplicationAssurancePolicyApi.md#updateByName) | **PATCH** /replication-assurance-policies/{replication-assurance-policy-name} | Update an existing Replication Assurance Policy by name |


<a name="addNew"></a>
# **addNew**
> ReplicationAssurancePolicyResponse addNew(addReplicationAssurancePolicyRequest).execute();

Add a new Replication Assurance Policy to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicationAssurancePolicyApi;
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
    String policyName = "policyName_example"; // Name of the new Replication Assurance Policy
    String description = "description_example"; // Description of the Replication Assurance Policy.
    List<EnumreplicationAssurancePolicySchemaUrn> schemas = Arrays.asList();
    Boolean enabled = true; // Indicates whether this Replication Assurance Policy is enabled for use in the server. If a Replication Assurance Policy is disabled, then no new operations will be associated with it.
    Integer evaluationOrderIndex = 56; // When multiple Replication Assurance Policies are defined, this property determines the evaluation order for finding a Replication Assurance Policy match against an operation. Policies are evaluated based on this index from least to greatest. Values of this property must be unique but not necessarily contiguous.
    EnumreplicationAssurancePolicyLocalLevelProp localLevel = EnumreplicationAssurancePolicyLocalLevelProp.fromValue("none");
    EnumreplicationAssurancePolicyRemoteLevelProp remoteLevel = EnumreplicationAssurancePolicyRemoteLevelProp.fromValue("none");
    String timeout = "timeout_example"; // Specifies the maximum length of time to wait for the replication assurance requirements to be met before timing out and replying to the client.
    String connectionCriteria = "connectionCriteria_example"; // Specifies a connection criteria used to indicate which operations from clients matching this criteria use this policy. If both a connection criteria and a request criteria are specified for a policy, then both must match an operation for the policy to be assigned.
    String requestCriteria = "requestCriteria_example"; // Specifies a request criteria used to indicate which operations from clients matching this criteria use this policy. If both a connection criteria and a request criteria are specified for a policy, then both must match an operation for the policy to be assigned.
    try {
      ReplicationAssurancePolicyResponse result = client
              .replicationAssurancePolicy
              .addNew(policyName)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .evaluationOrderIndex(evaluationOrderIndex)
              .localLevel(localLevel)
              .remoteLevel(remoteLevel)
              .timeout(timeout)
              .connectionCriteria(connectionCriteria)
              .requestCriteria(requestCriteria)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getEvaluationOrderIndex());
      System.out.println(result.getLocalLevel());
      System.out.println(result.getRemoteLevel());
      System.out.println(result.getTimeout());
      System.out.println(result.getConnectionCriteria());
      System.out.println(result.getRequestCriteria());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationAssurancePolicyApi#addNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicationAssurancePolicyResponse> response = client
              .replicationAssurancePolicy
              .addNew(policyName)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .evaluationOrderIndex(evaluationOrderIndex)
              .localLevel(localLevel)
              .remoteLevel(remoteLevel)
              .timeout(timeout)
              .connectionCriteria(connectionCriteria)
              .requestCriteria(requestCriteria)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationAssurancePolicyApi#addNew");
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
| **addReplicationAssurancePolicyRequest** | [**AddReplicationAssurancePolicyRequest**](AddReplicationAssurancePolicyRequest.md)| Create a new Replication Assurance Policy in the config | |

### Return type

[**ReplicationAssurancePolicyResponse**](ReplicationAssurancePolicyResponse.md)

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
| **409** | The Replication Assurance Policy already exists |  -  |

<a name="deletePolicy"></a>
# **deletePolicy**
> deletePolicy(replicationAssurancePolicyName).execute();

Delete a Replication Assurance Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicationAssurancePolicyApi;
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
    String replicationAssurancePolicyName = "replicationAssurancePolicyName_example"; // Name of the Replication Assurance Policy
    try {
      client
              .replicationAssurancePolicy
              .deletePolicy(replicationAssurancePolicyName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationAssurancePolicyApi#deletePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .replicationAssurancePolicy
              .deletePolicy(replicationAssurancePolicyName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationAssurancePolicyApi#deletePolicy");
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
| **replicationAssurancePolicyName** | **String**| Name of the Replication Assurance Policy | |

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
| **404** | The Replication Assurance Policy does not exist |  -  |
| **409** | The Replication Assurance Policy cannot be deleted |  -  |

<a name="getSinglePolicy"></a>
# **getSinglePolicy**
> ReplicationAssurancePolicyResponse getSinglePolicy(replicationAssurancePolicyName).execute();

Returns a single Replication Assurance Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicationAssurancePolicyApi;
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
    String replicationAssurancePolicyName = "replicationAssurancePolicyName_example"; // Name of the Replication Assurance Policy
    try {
      ReplicationAssurancePolicyResponse result = client
              .replicationAssurancePolicy
              .getSinglePolicy(replicationAssurancePolicyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getEvaluationOrderIndex());
      System.out.println(result.getLocalLevel());
      System.out.println(result.getRemoteLevel());
      System.out.println(result.getTimeout());
      System.out.println(result.getConnectionCriteria());
      System.out.println(result.getRequestCriteria());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationAssurancePolicyApi#getSinglePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicationAssurancePolicyResponse> response = client
              .replicationAssurancePolicy
              .getSinglePolicy(replicationAssurancePolicyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationAssurancePolicyApi#getSinglePolicy");
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
| **replicationAssurancePolicyName** | **String**| Name of the Replication Assurance Policy | |

### Return type

[**ReplicationAssurancePolicyResponse**](ReplicationAssurancePolicyResponse.md)

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
| **404** | The Replication Assurance Policy does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> ReplicationAssurancePolicyListResponse listAllObjects().filter(filter).execute();

Returns a list of all Replication Assurance Policy objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicationAssurancePolicyApi;
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
      ReplicationAssurancePolicyListResponse result = client
              .replicationAssurancePolicy
              .listAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationAssurancePolicyApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicationAssurancePolicyListResponse> response = client
              .replicationAssurancePolicy
              .listAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationAssurancePolicyApi#listAllObjects");
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

[**ReplicationAssurancePolicyListResponse**](ReplicationAssurancePolicyListResponse.md)

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

<a name="updateByName"></a>
# **updateByName**
> ReplicationAssurancePolicyResponse updateByName(replicationAssurancePolicyName, updateRequest).execute();

Update an existing Replication Assurance Policy by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicationAssurancePolicyApi;
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
    String replicationAssurancePolicyName = "replicationAssurancePolicyName_example"; // Name of the Replication Assurance Policy
    try {
      ReplicationAssurancePolicyResponse result = client
              .replicationAssurancePolicy
              .updateByName(operations, replicationAssurancePolicyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getEvaluationOrderIndex());
      System.out.println(result.getLocalLevel());
      System.out.println(result.getRemoteLevel());
      System.out.println(result.getTimeout());
      System.out.println(result.getConnectionCriteria());
      System.out.println(result.getRequestCriteria());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationAssurancePolicyApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicationAssurancePolicyResponse> response = client
              .replicationAssurancePolicy
              .updateByName(operations, replicationAssurancePolicyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationAssurancePolicyApi#updateByName");
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
| **replicationAssurancePolicyName** | **String**| Name of the Replication Assurance Policy | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Replication Assurance Policy | |

### Return type

[**ReplicationAssurancePolicyResponse**](ReplicationAssurancePolicyResponse.md)

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
| **404** | The Replication Assurance Policy does not exist |  -  |


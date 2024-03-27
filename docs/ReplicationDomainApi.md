# ReplicationDomainApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingle**](ReplicationDomainApi.md#getSingle) | **GET** /synchronization-providers/{synchronization-provider-name}/replication-domains/{replication-domain-name} | Returns a single Replication Domain |
| [**listAllDomains**](ReplicationDomainApi.md#listAllDomains) | **GET** /synchronization-providers/{synchronization-provider-name}/replication-domains | Returns a list of all Replication Domain objects |
| [**updateByName**](ReplicationDomainApi.md#updateByName) | **PATCH** /synchronization-providers/{synchronization-provider-name}/replication-domains/{replication-domain-name} | Update an existing Replication Domain by name |


<a name="getSingle"></a>
# **getSingle**
> ReplicationDomainResponse getSingle(replicationDomainName, synchronizationProviderName).execute();

Returns a single Replication Domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicationDomainApi;
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
    String replicationDomainName = "replicationDomainName_example"; // Name of the Replication Domain
    String synchronizationProviderName = "synchronizationProviderName_example"; // Name of the Synchronization Provider
    try {
      ReplicationDomainResponse result = client
              .replicationDomain
              .getSingle(replicationDomainName, synchronizationProviderName)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getId());
      System.out.println(result.getServerID());
      System.out.println(result.getBaseDN());
      System.out.println(result.getWindowSize());
      System.out.println(result.getHeartbeatInterval());
      System.out.println(result.getSyncHistPurgeDelay());
      System.out.println(result.getRestricted());
      System.out.println(result.getOnReplayFailureWaitForDependentOpsTimeout());
      System.out.println(result.getDependentOpsReplayFailureWaitTime());
      System.out.println(result.getMissingChangesPolicy());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationDomainApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicationDomainResponse> response = client
              .replicationDomain
              .getSingle(replicationDomainName, synchronizationProviderName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationDomainApi#getSingle");
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
| **replicationDomainName** | **String**| Name of the Replication Domain | |
| **synchronizationProviderName** | **String**| Name of the Synchronization Provider | |

### Return type

[**ReplicationDomainResponse**](ReplicationDomainResponse.md)

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
| **404** | The Replication Domain does not exist |  -  |

<a name="listAllDomains"></a>
# **listAllDomains**
> ReplicationDomainListResponse listAllDomains(synchronizationProviderName).filter(filter).execute();

Returns a list of all Replication Domain objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicationDomainApi;
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
    String synchronizationProviderName = "synchronizationProviderName_example"; // Name of the Synchronization Provider
    String filter = "filter_example"; // SCIM filter
    try {
      ReplicationDomainListResponse result = client
              .replicationDomain
              .listAllDomains(synchronizationProviderName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationDomainApi#listAllDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicationDomainListResponse> response = client
              .replicationDomain
              .listAllDomains(synchronizationProviderName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationDomainApi#listAllDomains");
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
| **synchronizationProviderName** | **String**| Name of the Synchronization Provider | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**ReplicationDomainListResponse**](ReplicationDomainListResponse.md)

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
> ReplicationDomainResponse updateByName(replicationDomainName, synchronizationProviderName, updateRequest).execute();

Update an existing Replication Domain by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicationDomainApi;
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
    String replicationDomainName = "replicationDomainName_example"; // Name of the Replication Domain
    String synchronizationProviderName = "synchronizationProviderName_example"; // Name of the Synchronization Provider
    try {
      ReplicationDomainResponse result = client
              .replicationDomain
              .updateByName(operations, replicationDomainName, synchronizationProviderName)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getId());
      System.out.println(result.getServerID());
      System.out.println(result.getBaseDN());
      System.out.println(result.getWindowSize());
      System.out.println(result.getHeartbeatInterval());
      System.out.println(result.getSyncHistPurgeDelay());
      System.out.println(result.getRestricted());
      System.out.println(result.getOnReplayFailureWaitForDependentOpsTimeout());
      System.out.println(result.getDependentOpsReplayFailureWaitTime());
      System.out.println(result.getMissingChangesPolicy());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationDomainApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicationDomainResponse> response = client
              .replicationDomain
              .updateByName(operations, replicationDomainName, synchronizationProviderName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationDomainApi#updateByName");
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
| **replicationDomainName** | **String**| Name of the Replication Domain | |
| **synchronizationProviderName** | **String**| Name of the Synchronization Provider | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Replication Domain | |

### Return type

[**ReplicationDomainResponse**](ReplicationDomainResponse.md)

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
| **404** | The Replication Domain does not exist |  -  |


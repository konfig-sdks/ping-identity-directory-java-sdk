# ReplicationServerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingleReplicationServer**](ReplicationServerApi.md#getSingleReplicationServer) | **GET** /synchronization-providers/{synchronization-provider-name}/replication-server | Returns a single Replication Server |
| [**updateByName**](ReplicationServerApi.md#updateByName) | **PATCH** /synchronization-providers/{synchronization-provider-name}/replication-server | Update an existing Replication Server by name |


<a name="getSingleReplicationServer"></a>
# **getSingleReplicationServer**
> ReplicationServerResponse getSingleReplicationServer(synchronizationProviderName).execute();

Returns a single Replication Server

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicationServerApi;
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
    try {
      ReplicationServerResponse result = client
              .replicationServer
              .getSingleReplicationServer(synchronizationProviderName)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getReplicationServerID());
      System.out.println(result.getReplicationDBDirectory());
      System.out.println(result.getJeProperty());
      System.out.println(result.getReplicationPurgeDelay());
      System.out.println(result.getTargetDatabaseSize());
      System.out.println(result.getReplicationPort());
      System.out.println(result.getListenOnAllAddresses());
      System.out.println(result.getCompressionCriteria());
      System.out.println(result.getHeartbeatInterval());
      System.out.println(result.getRemoteMonitorUpdateInterval());
      System.out.println(result.getRestrictedDomain());
      System.out.println(result.getGatewayPriority());
      System.out.println(result.getMissingChangesAlertThresholdPercent());
      System.out.println(result.getMissingChangesPolicy());
      System.out.println(result.getIncludeAllRemoteServersStateInMonitorMessage());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationServerApi#getSingleReplicationServer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicationServerResponse> response = client
              .replicationServer
              .getSingleReplicationServer(synchronizationProviderName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationServerApi#getSingleReplicationServer");
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

### Return type

[**ReplicationServerResponse**](ReplicationServerResponse.md)

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
| **404** | The Replication Server does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> ReplicationServerResponse updateByName(synchronizationProviderName, updateRequest).execute();

Update an existing Replication Server by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReplicationServerApi;
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
    String synchronizationProviderName = "synchronizationProviderName_example"; // Name of the Synchronization Provider
    try {
      ReplicationServerResponse result = client
              .replicationServer
              .updateByName(operations, synchronizationProviderName)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getReplicationServerID());
      System.out.println(result.getReplicationDBDirectory());
      System.out.println(result.getJeProperty());
      System.out.println(result.getReplicationPurgeDelay());
      System.out.println(result.getTargetDatabaseSize());
      System.out.println(result.getReplicationPort());
      System.out.println(result.getListenOnAllAddresses());
      System.out.println(result.getCompressionCriteria());
      System.out.println(result.getHeartbeatInterval());
      System.out.println(result.getRemoteMonitorUpdateInterval());
      System.out.println(result.getRestrictedDomain());
      System.out.println(result.getGatewayPriority());
      System.out.println(result.getMissingChangesAlertThresholdPercent());
      System.out.println(result.getMissingChangesPolicy());
      System.out.println(result.getIncludeAllRemoteServersStateInMonitorMessage());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationServerApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplicationServerResponse> response = client
              .replicationServer
              .updateByName(operations, synchronizationProviderName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReplicationServerApi#updateByName");
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
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Replication Server | |

### Return type

[**ReplicationServerResponse**](ReplicationServerResponse.md)

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
| **404** | The Replication Server does not exist |  -  |


# WorkQueueApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingleWorkQueue**](WorkQueueApi.md#getSingleWorkQueue) | **GET** /work-queue | Returns a single Work Queue |
| [**updateByName**](WorkQueueApi.md#updateByName) | **PATCH** /work-queue | Update an existing Work Queue by name |


<a name="getSingleWorkQueue"></a>
# **getSingleWorkQueue**
> HighThroughputWorkQueueResponse getSingleWorkQueue().execute();

Returns a single Work Queue

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkQueueApi;
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
    try {
      HighThroughputWorkQueueResponse result = client
              .workQueue
              .getSingleWorkQueue()
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getNumWorkerThreads());
      System.out.println(result.getNumWriteWorkerThreads());
      System.out.println(result.getNumAdministrativeSessionWorkerThreads());
      System.out.println(result.getNumQueues());
      System.out.println(result.getNumWriteQueues());
      System.out.println(result.getMaxWorkQueueCapacity());
      System.out.println(result.getMaxOfferTime());
      System.out.println(result.getMonitorQueueTime());
      System.out.println(result.getMaxQueueTime());
      System.out.println(result.getExpensiveOperationCheckInterval());
      System.out.println(result.getExpensiveOperationMinimumConcurrentCount());
      System.out.println(result.getExpensiveOperationMinimumDumpInterval());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkQueueApi#getSingleWorkQueue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HighThroughputWorkQueueResponse> response = client
              .workQueue
              .getSingleWorkQueue()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkQueueApi#getSingleWorkQueue");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HighThroughputWorkQueueResponse**](HighThroughputWorkQueueResponse.md)

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
| **404** | The Work Queue does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> HighThroughputWorkQueueResponse updateByName(updateRequest).execute();

Update an existing Work Queue by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkQueueApi;
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
    try {
      HighThroughputWorkQueueResponse result = client
              .workQueue
              .updateByName(operations)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getNumWorkerThreads());
      System.out.println(result.getNumWriteWorkerThreads());
      System.out.println(result.getNumAdministrativeSessionWorkerThreads());
      System.out.println(result.getNumQueues());
      System.out.println(result.getNumWriteQueues());
      System.out.println(result.getMaxWorkQueueCapacity());
      System.out.println(result.getMaxOfferTime());
      System.out.println(result.getMonitorQueueTime());
      System.out.println(result.getMaxQueueTime());
      System.out.println(result.getExpensiveOperationCheckInterval());
      System.out.println(result.getExpensiveOperationMinimumConcurrentCount());
      System.out.println(result.getExpensiveOperationMinimumDumpInterval());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkQueueApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HighThroughputWorkQueueResponse> response = client
              .workQueue
              .updateByName(operations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkQueueApi#updateByName");
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
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Work Queue | |

### Return type

[**HighThroughputWorkQueueResponse**](HighThroughputWorkQueueResponse.md)

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
| **404** | The Work Queue does not exist |  -  |


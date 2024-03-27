# InterServerAuthenticationInfoApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingleAuthenticationInfo**](InterServerAuthenticationInfoApi.md#getSingleAuthenticationInfo) | **GET** /server-instances/{server-instance-name}/server-instance-listeners/{server-instance-listener-name}/inter-server-authentication-info/{inter-server-authentication-info-name} | Returns a single Inter Server Authentication Info |
| [**listInterServerAuthenticationInfo**](InterServerAuthenticationInfoApi.md#listInterServerAuthenticationInfo) | **GET** /server-instances/{server-instance-name}/server-instance-listeners/{server-instance-listener-name}/inter-server-authentication-info | Returns a list of all Inter Server Authentication Info objects |
| [**updateByName**](InterServerAuthenticationInfoApi.md#updateByName) | **PATCH** /server-instances/{server-instance-name}/server-instance-listeners/{server-instance-listener-name}/inter-server-authentication-info/{inter-server-authentication-info-name} | Update an existing Inter Server Authentication Info by name |


<a name="getSingleAuthenticationInfo"></a>
# **getSingleAuthenticationInfo**
> Object getSingleAuthenticationInfo(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName).execute();

Returns a single Inter Server Authentication Info

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InterServerAuthenticationInfoApi;
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
    String interServerAuthenticationInfoName = "interServerAuthenticationInfoName_example"; // Name of the Inter Server Authentication Info
    String serverInstanceListenerName = "serverInstanceListenerName_example"; // Name of the Server Instance Listener
    String serverInstanceName = "serverInstanceName_example"; // Name of the Server Instance
    try {
      Object result = client
              .interServerAuthenticationInfo
              .getSingleAuthenticationInfo(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InterServerAuthenticationInfoApi#getSingleAuthenticationInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .interServerAuthenticationInfo
              .getSingleAuthenticationInfo(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InterServerAuthenticationInfoApi#getSingleAuthenticationInfo");
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
| **interServerAuthenticationInfoName** | **String**| Name of the Inter Server Authentication Info | |
| **serverInstanceListenerName** | **String**| Name of the Server Instance Listener | |
| **serverInstanceName** | **String**| Name of the Server Instance | |

### Return type

**Object**

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
| **404** | The Inter Server Authentication Info does not exist |  -  |

<a name="listInterServerAuthenticationInfo"></a>
# **listInterServerAuthenticationInfo**
> InterServerAuthenticationInfoListResponse listInterServerAuthenticationInfo(serverInstanceListenerName, serverInstanceName).filter(filter).execute();

Returns a list of all Inter Server Authentication Info objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InterServerAuthenticationInfoApi;
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
    String serverInstanceListenerName = "serverInstanceListenerName_example"; // Name of the Server Instance Listener
    String serverInstanceName = "serverInstanceName_example"; // Name of the Server Instance
    String filter = "filter_example"; // SCIM filter
    try {
      InterServerAuthenticationInfoListResponse result = client
              .interServerAuthenticationInfo
              .listInterServerAuthenticationInfo(serverInstanceListenerName, serverInstanceName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling InterServerAuthenticationInfoApi#listInterServerAuthenticationInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InterServerAuthenticationInfoListResponse> response = client
              .interServerAuthenticationInfo
              .listInterServerAuthenticationInfo(serverInstanceListenerName, serverInstanceName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InterServerAuthenticationInfoApi#listInterServerAuthenticationInfo");
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
| **serverInstanceListenerName** | **String**| Name of the Server Instance Listener | |
| **serverInstanceName** | **String**| Name of the Server Instance | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**InterServerAuthenticationInfoListResponse**](InterServerAuthenticationInfoListResponse.md)

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
> Object updateByName(interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName, updateRequest).execute();

Update an existing Inter Server Authentication Info by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InterServerAuthenticationInfoApi;
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
    String interServerAuthenticationInfoName = "interServerAuthenticationInfoName_example"; // Name of the Inter Server Authentication Info
    String serverInstanceListenerName = "serverInstanceListenerName_example"; // Name of the Server Instance Listener
    String serverInstanceName = "serverInstanceName_example"; // Name of the Server Instance
    try {
      Object result = client
              .interServerAuthenticationInfo
              .updateByName(operations, interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InterServerAuthenticationInfoApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .interServerAuthenticationInfo
              .updateByName(operations, interServerAuthenticationInfoName, serverInstanceListenerName, serverInstanceName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InterServerAuthenticationInfoApi#updateByName");
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
| **interServerAuthenticationInfoName** | **String**| Name of the Inter Server Authentication Info | |
| **serverInstanceListenerName** | **String**| Name of the Server Instance Listener | |
| **serverInstanceName** | **String**| Name of the Server Instance | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Inter Server Authentication Info | |

### Return type

**Object**

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
| **404** | The Inter Server Authentication Info does not exist |  -  |


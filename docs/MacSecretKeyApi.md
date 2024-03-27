# MacSecretKeyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOne**](MacSecretKeyApi.md#getOne) | **GET** /server-instances/{server-instance-name}/mac-secret-keys/{mac-secret-key-name} | Returns a single Mac Secret Key |
| [**listAll**](MacSecretKeyApi.md#listAll) | **GET** /server-instances/{server-instance-name}/mac-secret-keys | Returns a list of all Mac Secret Key objects |
| [**updateByName**](MacSecretKeyApi.md#updateByName) | **PATCH** /server-instances/{server-instance-name}/mac-secret-keys/{mac-secret-key-name} | Update an existing Mac Secret Key by name |


<a name="getOne"></a>
# **getOne**
> MacSecretKeyResponse getOne(macSecretKeyName, serverInstanceName).execute();

Returns a single Mac Secret Key

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MacSecretKeyApi;
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
    String macSecretKeyName = "macSecretKeyName_example"; // Name of the Mac Secret Key
    String serverInstanceName = "serverInstanceName_example"; // Name of the Server Instance
    try {
      MacSecretKeyResponse result = client
              .macSecretKey
              .getOne(macSecretKeyName, serverInstanceName)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getId());
      System.out.println(result.getMacAlgorithmName());
      System.out.println(result.getKeyID());
      System.out.println(result.getIsCompromised());
      System.out.println(result.getSymmetricKey());
      System.out.println(result.getKeyLengthBits());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling MacSecretKeyApi#getOne");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MacSecretKeyResponse> response = client
              .macSecretKey
              .getOne(macSecretKeyName, serverInstanceName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MacSecretKeyApi#getOne");
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
| **macSecretKeyName** | **String**| Name of the Mac Secret Key | |
| **serverInstanceName** | **String**| Name of the Server Instance | |

### Return type

[**MacSecretKeyResponse**](MacSecretKeyResponse.md)

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
| **404** | The Mac Secret Key does not exist |  -  |

<a name="listAll"></a>
# **listAll**
> MacSecretKeyListResponse listAll(serverInstanceName).filter(filter).execute();

Returns a list of all Mac Secret Key objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MacSecretKeyApi;
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
    String serverInstanceName = "serverInstanceName_example"; // Name of the Server Instance
    String filter = "filter_example"; // SCIM filter
    try {
      MacSecretKeyListResponse result = client
              .macSecretKey
              .listAll(serverInstanceName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling MacSecretKeyApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MacSecretKeyListResponse> response = client
              .macSecretKey
              .listAll(serverInstanceName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MacSecretKeyApi#listAll");
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
| **serverInstanceName** | **String**| Name of the Server Instance | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**MacSecretKeyListResponse**](MacSecretKeyListResponse.md)

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
> MacSecretKeyResponse updateByName(macSecretKeyName, serverInstanceName, updateRequest).execute();

Update an existing Mac Secret Key by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MacSecretKeyApi;
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
    String macSecretKeyName = "macSecretKeyName_example"; // Name of the Mac Secret Key
    String serverInstanceName = "serverInstanceName_example"; // Name of the Server Instance
    try {
      MacSecretKeyResponse result = client
              .macSecretKey
              .updateByName(operations, macSecretKeyName, serverInstanceName)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getId());
      System.out.println(result.getMacAlgorithmName());
      System.out.println(result.getKeyID());
      System.out.println(result.getIsCompromised());
      System.out.println(result.getSymmetricKey());
      System.out.println(result.getKeyLengthBits());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling MacSecretKeyApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MacSecretKeyResponse> response = client
              .macSecretKey
              .updateByName(operations, macSecretKeyName, serverInstanceName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MacSecretKeyApi#updateByName");
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
| **macSecretKeyName** | **String**| Name of the Mac Secret Key | |
| **serverInstanceName** | **String**| Name of the Server Instance | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Mac Secret Key | |

### Return type

[**MacSecretKeyResponse**](MacSecretKeyResponse.md)

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
| **404** | The Mac Secret Key does not exist |  -  |


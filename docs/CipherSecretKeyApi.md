# CipherSecretKeyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](CipherSecretKeyApi.md#getAll) | **GET** /server-instances/{server-instance-name}/cipher-secret-keys | Returns a list of all Cipher Secret Key objects |
| [**getSingleKey**](CipherSecretKeyApi.md#getSingleKey) | **GET** /server-instances/{server-instance-name}/cipher-secret-keys/{cipher-secret-key-name} | Returns a single Cipher Secret Key |
| [**updateByName**](CipherSecretKeyApi.md#updateByName) | **PATCH** /server-instances/{server-instance-name}/cipher-secret-keys/{cipher-secret-key-name} | Update an existing Cipher Secret Key by name |


<a name="getAll"></a>
# **getAll**
> CipherSecretKeyListResponse getAll(serverInstanceName).filter(filter).execute();

Returns a list of all Cipher Secret Key objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CipherSecretKeyApi;
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
      CipherSecretKeyListResponse result = client
              .cipherSecretKey
              .getAll(serverInstanceName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling CipherSecretKeyApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CipherSecretKeyListResponse> response = client
              .cipherSecretKey
              .getAll(serverInstanceName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CipherSecretKeyApi#getAll");
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

[**CipherSecretKeyListResponse**](CipherSecretKeyListResponse.md)

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

<a name="getSingleKey"></a>
# **getSingleKey**
> CipherSecretKeyResponse getSingleKey(cipherSecretKeyName, serverInstanceName).execute();

Returns a single Cipher Secret Key

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CipherSecretKeyApi;
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
    String cipherSecretKeyName = "cipherSecretKeyName_example"; // Name of the Cipher Secret Key
    String serverInstanceName = "serverInstanceName_example"; // Name of the Server Instance
    try {
      CipherSecretKeyResponse result = client
              .cipherSecretKey
              .getSingleKey(cipherSecretKeyName, serverInstanceName)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getId());
      System.out.println(result.getCipherTransformationName());
      System.out.println(result.getInitializationVectorLengthBits());
      System.out.println(result.getKeyID());
      System.out.println(result.getIsCompromised());
      System.out.println(result.getSymmetricKey());
      System.out.println(result.getKeyLengthBits());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling CipherSecretKeyApi#getSingleKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CipherSecretKeyResponse> response = client
              .cipherSecretKey
              .getSingleKey(cipherSecretKeyName, serverInstanceName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CipherSecretKeyApi#getSingleKey");
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
| **cipherSecretKeyName** | **String**| Name of the Cipher Secret Key | |
| **serverInstanceName** | **String**| Name of the Server Instance | |

### Return type

[**CipherSecretKeyResponse**](CipherSecretKeyResponse.md)

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
| **404** | The Cipher Secret Key does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> CipherSecretKeyResponse updateByName(cipherSecretKeyName, serverInstanceName, updateRequest).execute();

Update an existing Cipher Secret Key by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CipherSecretKeyApi;
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
    String cipherSecretKeyName = "cipherSecretKeyName_example"; // Name of the Cipher Secret Key
    String serverInstanceName = "serverInstanceName_example"; // Name of the Server Instance
    try {
      CipherSecretKeyResponse result = client
              .cipherSecretKey
              .updateByName(operations, cipherSecretKeyName, serverInstanceName)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getId());
      System.out.println(result.getCipherTransformationName());
      System.out.println(result.getInitializationVectorLengthBits());
      System.out.println(result.getKeyID());
      System.out.println(result.getIsCompromised());
      System.out.println(result.getSymmetricKey());
      System.out.println(result.getKeyLengthBits());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling CipherSecretKeyApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CipherSecretKeyResponse> response = client
              .cipherSecretKey
              .updateByName(operations, cipherSecretKeyName, serverInstanceName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CipherSecretKeyApi#updateByName");
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
| **cipherSecretKeyName** | **String**| Name of the Cipher Secret Key | |
| **serverInstanceName** | **String**| Name of the Server Instance | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Cipher Secret Key | |

### Return type

[**CipherSecretKeyResponse**](CipherSecretKeyResponse.md)

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
| **404** | The Cipher Secret Key does not exist |  -  |


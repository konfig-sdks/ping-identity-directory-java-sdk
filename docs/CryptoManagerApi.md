# CryptoManagerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingleCryptoManager**](CryptoManagerApi.md#getSingleCryptoManager) | **GET** /crypto-manager | Returns a single Crypto Manager |
| [**updateByName**](CryptoManagerApi.md#updateByName) | **PATCH** /crypto-manager | Update an existing Crypto Manager by name |


<a name="getSingleCryptoManager"></a>
# **getSingleCryptoManager**
> CryptoManagerResponse getSingleCryptoManager().execute();

Returns a single Crypto Manager

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CryptoManagerApi;
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
      CryptoManagerResponse result = client
              .cryptoManager
              .getSingleCryptoManager()
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getDigestAlgorithm());
      System.out.println(result.getMacAlgorithm());
      System.out.println(result.getMacKeyLength());
      System.out.println(result.getSigningEncryptionSettingsID());
      System.out.println(result.getCipherTransformation());
      System.out.println(result.getCipherKeyLength());
      System.out.println(result.getKeyWrappingTransformation());
      System.out.println(result.getSslProtocol());
      System.out.println(result.getSslCipherSuite());
      System.out.println(result.getOutboundSSLProtocol());
      System.out.println(result.getOutboundSSLCipherSuite());
      System.out.println(result.getEnableSha1CipherSuites());
      System.out.println(result.getEnableRsaKeyExchangeCipherSuites());
      System.out.println(result.getSslCertNickname());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoManagerApi#getSingleCryptoManager");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CryptoManagerResponse> response = client
              .cryptoManager
              .getSingleCryptoManager()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoManagerApi#getSingleCryptoManager");
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

[**CryptoManagerResponse**](CryptoManagerResponse.md)

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
| **404** | The Crypto Manager does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> CryptoManagerResponse updateByName(updateRequest).execute();

Update an existing Crypto Manager by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CryptoManagerApi;
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
      CryptoManagerResponse result = client
              .cryptoManager
              .updateByName(operations)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getDigestAlgorithm());
      System.out.println(result.getMacAlgorithm());
      System.out.println(result.getMacKeyLength());
      System.out.println(result.getSigningEncryptionSettingsID());
      System.out.println(result.getCipherTransformation());
      System.out.println(result.getCipherKeyLength());
      System.out.println(result.getKeyWrappingTransformation());
      System.out.println(result.getSslProtocol());
      System.out.println(result.getSslCipherSuite());
      System.out.println(result.getOutboundSSLProtocol());
      System.out.println(result.getOutboundSSLCipherSuite());
      System.out.println(result.getEnableSha1CipherSuites());
      System.out.println(result.getEnableRsaKeyExchangeCipherSuites());
      System.out.println(result.getSslCertNickname());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoManagerApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CryptoManagerResponse> response = client
              .cryptoManager
              .updateByName(operations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoManagerApi#updateByName");
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
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Crypto Manager | |

### Return type

[**CryptoManagerResponse**](CryptoManagerResponse.md)

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
| **404** | The Crypto Manager does not exist |  -  |


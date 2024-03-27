# ConsentServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingleConsent**](ConsentServiceApi.md#getSingleConsent) | **GET** /consent-service | Returns a single Consent Service |
| [**updateByName**](ConsentServiceApi.md#updateByName) | **PATCH** /consent-service | Update an existing Consent Service by name |


<a name="getSingleConsent"></a>
# **getSingleConsent**
> ConsentServiceResponse getSingleConsent().execute();

Returns a single Consent Service

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsentServiceApi;
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
      ConsentServiceResponse result = client
              .consentService
              .getSingleConsent()
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getBaseDN());
      System.out.println(result.getBindDN());
      System.out.println(result.getSearchSizeLimit());
      System.out.println(result.getConsentRecordIdentityMapper());
      System.out.println(result.getServiceAccountDN());
      System.out.println(result.getUnprivilegedConsentScope());
      System.out.println(result.getPrivilegedConsentScope());
      System.out.println(result.getAudience());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentServiceApi#getSingleConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsentServiceResponse> response = client
              .consentService
              .getSingleConsent()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentServiceApi#getSingleConsent");
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

[**ConsentServiceResponse**](ConsentServiceResponse.md)

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
| **404** | The Consent Service does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> ConsentServiceResponse updateByName(updateRequest).execute();

Update an existing Consent Service by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsentServiceApi;
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
      ConsentServiceResponse result = client
              .consentService
              .updateByName(operations)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getBaseDN());
      System.out.println(result.getBindDN());
      System.out.println(result.getSearchSizeLimit());
      System.out.println(result.getConsentRecordIdentityMapper());
      System.out.println(result.getServiceAccountDN());
      System.out.println(result.getUnprivilegedConsentScope());
      System.out.println(result.getPrivilegedConsentScope());
      System.out.println(result.getAudience());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentServiceApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsentServiceResponse> response = client
              .consentService
              .updateByName(operations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentServiceApi#updateByName");
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
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Consent Service | |

### Return type

[**ConsentServiceResponse**](ConsentServiceResponse.md)

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
| **404** | The Consent Service does not exist |  -  |


# LdapSdkDebugLoggerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingleDebugLogger**](LdapSdkDebugLoggerApi.md#getSingleDebugLogger) | **GET** /ldap-sdk-debug-logger | Returns a single LDAP SDK Debug Logger |
| [**updateByName**](LdapSdkDebugLoggerApi.md#updateByName) | **PATCH** /ldap-sdk-debug-logger | Update an existing LDAP SDK Debug Logger by name |


<a name="getSingleDebugLogger"></a>
# **getSingleDebugLogger**
> LdapSdkDebugLoggerResponse getSingleDebugLogger().execute();

Returns a single LDAP SDK Debug Logger

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LdapSdkDebugLoggerApi;
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
      LdapSdkDebugLoggerResponse result = client
              .ldapSdkDebugLogger
              .getSingleDebugLogger()
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getLogFile());
      System.out.println(result.getDebugLevel());
      System.out.println(result.getDebugType());
      System.out.println(result.getIncludeStackTrace());
      System.out.println(result.getLogFilePermissions());
      System.out.println(result.getTimeInterval());
      System.out.println(result.getAutoFlush());
      System.out.println(result.getAsynchronous());
      System.out.println(result.getQueueSize());
      System.out.println(result.getBufferSize());
      System.out.println(result.getAppend());
      System.out.println(result.getRotationPolicy());
      System.out.println(result.getRotationListener());
      System.out.println(result.getRetentionPolicy());
      System.out.println(result.getCompressionMechanism());
      System.out.println(result.getSignLog());
      System.out.println(result.getEncryptLog());
      System.out.println(result.getEncryptionSettingsDefinitionID());
      System.out.println(result.getTimestampPrecision());
      System.out.println(result.getLoggingErrorBehavior());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapSdkDebugLoggerApi#getSingleDebugLogger");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LdapSdkDebugLoggerResponse> response = client
              .ldapSdkDebugLogger
              .getSingleDebugLogger()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapSdkDebugLoggerApi#getSingleDebugLogger");
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

[**LdapSdkDebugLoggerResponse**](LdapSdkDebugLoggerResponse.md)

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
| **404** | The LDAP SDK Debug Logger does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> LdapSdkDebugLoggerResponse updateByName(updateRequest).execute();

Update an existing LDAP SDK Debug Logger by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LdapSdkDebugLoggerApi;
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
      LdapSdkDebugLoggerResponse result = client
              .ldapSdkDebugLogger
              .updateByName(operations)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getLogFile());
      System.out.println(result.getDebugLevel());
      System.out.println(result.getDebugType());
      System.out.println(result.getIncludeStackTrace());
      System.out.println(result.getLogFilePermissions());
      System.out.println(result.getTimeInterval());
      System.out.println(result.getAutoFlush());
      System.out.println(result.getAsynchronous());
      System.out.println(result.getQueueSize());
      System.out.println(result.getBufferSize());
      System.out.println(result.getAppend());
      System.out.println(result.getRotationPolicy());
      System.out.println(result.getRotationListener());
      System.out.println(result.getRetentionPolicy());
      System.out.println(result.getCompressionMechanism());
      System.out.println(result.getSignLog());
      System.out.println(result.getEncryptLog());
      System.out.println(result.getEncryptionSettingsDefinitionID());
      System.out.println(result.getTimestampPrecision());
      System.out.println(result.getLoggingErrorBehavior());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapSdkDebugLoggerApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LdapSdkDebugLoggerResponse> response = client
              .ldapSdkDebugLogger
              .updateByName(operations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapSdkDebugLoggerApi#updateByName");
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
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing LDAP SDK Debug Logger | |

### Return type

[**LdapSdkDebugLoggerResponse**](LdapSdkDebugLoggerResponse.md)

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
| **404** | The LDAP SDK Debug Logger does not exist |  -  |


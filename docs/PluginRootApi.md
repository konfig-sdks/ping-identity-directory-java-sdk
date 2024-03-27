# PluginRootApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingle**](PluginRootApi.md#getSingle) | **GET** /plugin-root | Returns a single Plugin Root |
| [**updateByName**](PluginRootApi.md#updateByName) | **PATCH** /plugin-root | Update an existing Plugin Root by name |


<a name="getSingle"></a>
# **getSingle**
> PluginRootResponse getSingle().execute();

Returns a single Plugin Root

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PluginRootApi;
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
      PluginRootResponse result = client
              .pluginRoot
              .getSingle()
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getPluginOrderStartup());
      System.out.println(result.getPluginOrderShutdown());
      System.out.println(result.getPluginOrderPostConnect());
      System.out.println(result.getPluginOrderPostDisconnect());
      System.out.println(result.getPluginOrderLDIFImport());
      System.out.println(result.getPluginOrderLDIFExport());
      System.out.println(result.getPluginOrderPreParseAbandon());
      System.out.println(result.getPluginOrderPreParseAdd());
      System.out.println(result.getPluginOrderPreParseBind());
      System.out.println(result.getPluginOrderPreParseCompare());
      System.out.println(result.getPluginOrderPreParseDelete());
      System.out.println(result.getPluginOrderPreParseExtended());
      System.out.println(result.getPluginOrderPreParseModify());
      System.out.println(result.getPluginOrderPreParseModifyDN());
      System.out.println(result.getPluginOrderPreParseSearch());
      System.out.println(result.getPluginOrderPreParseUnbind());
      System.out.println(result.getPluginOrderPreOperationAdd());
      System.out.println(result.getPluginOrderPreOperationBind());
      System.out.println(result.getPluginOrderPreOperationCompare());
      System.out.println(result.getPluginOrderPreOperationDelete());
      System.out.println(result.getPluginOrderPreOperationExtended());
      System.out.println(result.getPluginOrderPreOperationModify());
      System.out.println(result.getPluginOrderPreOperationModifyDN());
      System.out.println(result.getPluginOrderPreOperationSearch());
      System.out.println(result.getPluginOrderPostOperationAbandon());
      System.out.println(result.getPluginOrderPostOperationAdd());
      System.out.println(result.getPluginOrderPostOperationBind());
      System.out.println(result.getPluginOrderPostOperationCompare());
      System.out.println(result.getPluginOrderPostOperationDelete());
      System.out.println(result.getPluginOrderPostOperationExtended());
      System.out.println(result.getPluginOrderPostOperationModify());
      System.out.println(result.getPluginOrderPostOperationModifyDN());
      System.out.println(result.getPluginOrderPostOperationSearch());
      System.out.println(result.getPluginOrderPostOperationUnbind());
      System.out.println(result.getPluginOrderPostResponseAdd());
      System.out.println(result.getPluginOrderPostResponseBind());
      System.out.println(result.getPluginOrderPostResponseCompare());
      System.out.println(result.getPluginOrderPostResponseDelete());
      System.out.println(result.getPluginOrderPostResponseExtended());
      System.out.println(result.getPluginOrderPostResponseModify());
      System.out.println(result.getPluginOrderPostResponseModifyDN());
      System.out.println(result.getPluginOrderPostSynchronizationAdd());
      System.out.println(result.getPluginOrderPostSynchronizationDelete());
      System.out.println(result.getPluginOrderPostSynchronizationModify());
      System.out.println(result.getPluginOrderPostSynchronizationModifyDN());
      System.out.println(result.getPluginOrderPostResponseSearch());
      System.out.println(result.getPluginOrderSearchResultEntry());
      System.out.println(result.getPluginOrderSearchResultReference());
      System.out.println(result.getPluginOrderSubordinateModifyDN());
      System.out.println(result.getPluginOrderIntermediateResponse());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginRootApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PluginRootResponse> response = client
              .pluginRoot
              .getSingle()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginRootApi#getSingle");
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

[**PluginRootResponse**](PluginRootResponse.md)

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
| **404** | The Plugin Root does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> PluginRootResponse updateByName(updateRequest).execute();

Update an existing Plugin Root by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PluginRootApi;
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
      PluginRootResponse result = client
              .pluginRoot
              .updateByName(operations)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getPluginOrderStartup());
      System.out.println(result.getPluginOrderShutdown());
      System.out.println(result.getPluginOrderPostConnect());
      System.out.println(result.getPluginOrderPostDisconnect());
      System.out.println(result.getPluginOrderLDIFImport());
      System.out.println(result.getPluginOrderLDIFExport());
      System.out.println(result.getPluginOrderPreParseAbandon());
      System.out.println(result.getPluginOrderPreParseAdd());
      System.out.println(result.getPluginOrderPreParseBind());
      System.out.println(result.getPluginOrderPreParseCompare());
      System.out.println(result.getPluginOrderPreParseDelete());
      System.out.println(result.getPluginOrderPreParseExtended());
      System.out.println(result.getPluginOrderPreParseModify());
      System.out.println(result.getPluginOrderPreParseModifyDN());
      System.out.println(result.getPluginOrderPreParseSearch());
      System.out.println(result.getPluginOrderPreParseUnbind());
      System.out.println(result.getPluginOrderPreOperationAdd());
      System.out.println(result.getPluginOrderPreOperationBind());
      System.out.println(result.getPluginOrderPreOperationCompare());
      System.out.println(result.getPluginOrderPreOperationDelete());
      System.out.println(result.getPluginOrderPreOperationExtended());
      System.out.println(result.getPluginOrderPreOperationModify());
      System.out.println(result.getPluginOrderPreOperationModifyDN());
      System.out.println(result.getPluginOrderPreOperationSearch());
      System.out.println(result.getPluginOrderPostOperationAbandon());
      System.out.println(result.getPluginOrderPostOperationAdd());
      System.out.println(result.getPluginOrderPostOperationBind());
      System.out.println(result.getPluginOrderPostOperationCompare());
      System.out.println(result.getPluginOrderPostOperationDelete());
      System.out.println(result.getPluginOrderPostOperationExtended());
      System.out.println(result.getPluginOrderPostOperationModify());
      System.out.println(result.getPluginOrderPostOperationModifyDN());
      System.out.println(result.getPluginOrderPostOperationSearch());
      System.out.println(result.getPluginOrderPostOperationUnbind());
      System.out.println(result.getPluginOrderPostResponseAdd());
      System.out.println(result.getPluginOrderPostResponseBind());
      System.out.println(result.getPluginOrderPostResponseCompare());
      System.out.println(result.getPluginOrderPostResponseDelete());
      System.out.println(result.getPluginOrderPostResponseExtended());
      System.out.println(result.getPluginOrderPostResponseModify());
      System.out.println(result.getPluginOrderPostResponseModifyDN());
      System.out.println(result.getPluginOrderPostSynchronizationAdd());
      System.out.println(result.getPluginOrderPostSynchronizationDelete());
      System.out.println(result.getPluginOrderPostSynchronizationModify());
      System.out.println(result.getPluginOrderPostSynchronizationModifyDN());
      System.out.println(result.getPluginOrderPostResponseSearch());
      System.out.println(result.getPluginOrderSearchResultEntry());
      System.out.println(result.getPluginOrderSearchResultReference());
      System.out.println(result.getPluginOrderSubordinateModifyDN());
      System.out.println(result.getPluginOrderIntermediateResponse());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginRootApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PluginRootResponse> response = client
              .pluginRoot
              .updateByName(operations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PluginRootApi#updateByName");
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
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Plugin Root | |

### Return type

[**PluginRootResponse**](PluginRootResponse.md)

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
| **404** | The Plugin Root does not exist |  -  |


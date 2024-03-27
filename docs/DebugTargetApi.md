# DebugTargetApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewDebugTarget**](DebugTargetApi.md#addNewDebugTarget) | **POST** /log-publishers/{log-publisher-name}/debug-targets | Add a new Debug Target to the config |
| [**deleteDebugTarget**](DebugTargetApi.md#deleteDebugTarget) | **DELETE** /log-publishers/{log-publisher-name}/debug-targets/{debug-target-name} | Delete a Debug Target |
| [**getSingleDebugTarget**](DebugTargetApi.md#getSingleDebugTarget) | **GET** /log-publishers/{log-publisher-name}/debug-targets/{debug-target-name} | Returns a single Debug Target |
| [**listAllDebugTargets**](DebugTargetApi.md#listAllDebugTargets) | **GET** /log-publishers/{log-publisher-name}/debug-targets | Returns a list of all Debug Target objects |
| [**updateByName**](DebugTargetApi.md#updateByName) | **PATCH** /log-publishers/{log-publisher-name}/debug-targets/{debug-target-name} | Update an existing Debug Target by name |


<a name="addNewDebugTarget"></a>
# **addNewDebugTarget**
> DebugTargetResponse addNewDebugTarget(logPublisherName, addDebugTargetRequest).execute();

Add a new Debug Target to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DebugTargetApi;
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
    String targetName = "targetName_example"; // Name of the new Debug Target
    String logPublisherName = "logPublisherName_example"; // Name of the Log Publisher
    String description = "description_example"; // A description for this Debug Target
    List<EnumdebugTargetSchemaUrn> schemas = Arrays.asList();
    String debugScope = "debugScope_example"; // Specifies the fully-qualified Java package, class, or method affected by the settings in this target definition. Use the number character (#) to separate the class name and the method name (that is, com.unboundid.directory.server.core.DirectoryServer#startUp).
    EnumdebugTargetDebugLevelProp debugLevel = EnumdebugTargetDebugLevelProp.fromValue("disabled");
    List<EnumdebugTargetDebugCategoryProp> debugCategory = Arrays.asList();
    Boolean omitMethodEntryArguments = true; // Specifies the property to indicate whether to include method arguments in debug messages.
    Boolean omitMethodReturnValue = true; // Specifies the property to indicate whether to include the return value in debug messages.
    Boolean includeThrowableCause = true; // Specifies the property to indicate whether to include the cause of exceptions in exception thrown and caught messages.
    Integer throwableStackFrames = 56; // Specifies the property to indicate the number of stack frames to include in the stack trace for method entry and exception thrown messages.
    try {
      DebugTargetResponse result = client
              .debugTarget
              .addNewDebugTarget(targetName, logPublisherName)
              .description(description)
              .schemas(schemas)
              .debugScope(debugScope)
              .debugLevel(debugLevel)
              .debugCategory(debugCategory)
              .omitMethodEntryArguments(omitMethodEntryArguments)
              .omitMethodReturnValue(omitMethodReturnValue)
              .includeThrowableCause(includeThrowableCause)
              .throwableStackFrames(throwableStackFrames)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getDebugScope());
      System.out.println(result.getDebugLevel());
      System.out.println(result.getDebugCategory());
      System.out.println(result.getOmitMethodEntryArguments());
      System.out.println(result.getOmitMethodReturnValue());
      System.out.println(result.getIncludeThrowableCause());
      System.out.println(result.getThrowableStackFrames());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DebugTargetApi#addNewDebugTarget");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DebugTargetResponse> response = client
              .debugTarget
              .addNewDebugTarget(targetName, logPublisherName)
              .description(description)
              .schemas(schemas)
              .debugScope(debugScope)
              .debugLevel(debugLevel)
              .debugCategory(debugCategory)
              .omitMethodEntryArguments(omitMethodEntryArguments)
              .omitMethodReturnValue(omitMethodReturnValue)
              .includeThrowableCause(includeThrowableCause)
              .throwableStackFrames(throwableStackFrames)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DebugTargetApi#addNewDebugTarget");
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
| **logPublisherName** | **String**| Name of the Log Publisher | |
| **addDebugTargetRequest** | [**AddDebugTargetRequest**](AddDebugTargetRequest.md)| Create a new Debug Target in the config | |

### Return type

[**DebugTargetResponse**](DebugTargetResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **409** | The Debug Target already exists |  -  |

<a name="deleteDebugTarget"></a>
# **deleteDebugTarget**
> deleteDebugTarget(debugTargetName, logPublisherName).execute();

Delete a Debug Target

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DebugTargetApi;
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
    String debugTargetName = "debugTargetName_example"; // Name of the Debug Target
    String logPublisherName = "logPublisherName_example"; // Name of the Log Publisher
    try {
      client
              .debugTarget
              .deleteDebugTarget(debugTargetName, logPublisherName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DebugTargetApi#deleteDebugTarget");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .debugTarget
              .deleteDebugTarget(debugTargetName, logPublisherName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DebugTargetApi#deleteDebugTarget");
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
| **debugTargetName** | **String**| Name of the Debug Target | |
| **logPublisherName** | **String**| Name of the Log Publisher | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **404** | The Debug Target does not exist |  -  |
| **409** | The Debug Target cannot be deleted |  -  |

<a name="getSingleDebugTarget"></a>
# **getSingleDebugTarget**
> DebugTargetResponse getSingleDebugTarget(debugTargetName, logPublisherName).execute();

Returns a single Debug Target

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DebugTargetApi;
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
    String debugTargetName = "debugTargetName_example"; // Name of the Debug Target
    String logPublisherName = "logPublisherName_example"; // Name of the Log Publisher
    try {
      DebugTargetResponse result = client
              .debugTarget
              .getSingleDebugTarget(debugTargetName, logPublisherName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getDebugScope());
      System.out.println(result.getDebugLevel());
      System.out.println(result.getDebugCategory());
      System.out.println(result.getOmitMethodEntryArguments());
      System.out.println(result.getOmitMethodReturnValue());
      System.out.println(result.getIncludeThrowableCause());
      System.out.println(result.getThrowableStackFrames());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DebugTargetApi#getSingleDebugTarget");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DebugTargetResponse> response = client
              .debugTarget
              .getSingleDebugTarget(debugTargetName, logPublisherName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DebugTargetApi#getSingleDebugTarget");
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
| **debugTargetName** | **String**| Name of the Debug Target | |
| **logPublisherName** | **String**| Name of the Log Publisher | |

### Return type

[**DebugTargetResponse**](DebugTargetResponse.md)

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
| **404** | The Debug Target does not exist |  -  |

<a name="listAllDebugTargets"></a>
# **listAllDebugTargets**
> DebugTargetListResponse listAllDebugTargets(logPublisherName).filter(filter).execute();

Returns a list of all Debug Target objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DebugTargetApi;
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
    String logPublisherName = "logPublisherName_example"; // Name of the Log Publisher
    String filter = "filter_example"; // SCIM filter
    try {
      DebugTargetListResponse result = client
              .debugTarget
              .listAllDebugTargets(logPublisherName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling DebugTargetApi#listAllDebugTargets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DebugTargetListResponse> response = client
              .debugTarget
              .listAllDebugTargets(logPublisherName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DebugTargetApi#listAllDebugTargets");
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
| **logPublisherName** | **String**| Name of the Log Publisher | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**DebugTargetListResponse**](DebugTargetListResponse.md)

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
> DebugTargetResponse updateByName(debugTargetName, logPublisherName, updateRequest).execute();

Update an existing Debug Target by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DebugTargetApi;
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
    String debugTargetName = "debugTargetName_example"; // Name of the Debug Target
    String logPublisherName = "logPublisherName_example"; // Name of the Log Publisher
    try {
      DebugTargetResponse result = client
              .debugTarget
              .updateByName(operations, debugTargetName, logPublisherName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getDebugScope());
      System.out.println(result.getDebugLevel());
      System.out.println(result.getDebugCategory());
      System.out.println(result.getOmitMethodEntryArguments());
      System.out.println(result.getOmitMethodReturnValue());
      System.out.println(result.getIncludeThrowableCause());
      System.out.println(result.getThrowableStackFrames());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DebugTargetApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DebugTargetResponse> response = client
              .debugTarget
              .updateByName(operations, debugTargetName, logPublisherName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DebugTargetApi#updateByName");
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
| **debugTargetName** | **String**| Name of the Debug Target | |
| **logPublisherName** | **String**| Name of the Log Publisher | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Debug Target | |

### Return type

[**DebugTargetResponse**](DebugTargetResponse.md)

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
| **404** | The Debug Target does not exist |  -  |


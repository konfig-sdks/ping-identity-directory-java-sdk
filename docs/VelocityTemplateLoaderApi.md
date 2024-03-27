# VelocityTemplateLoaderApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewLoaderToConfig**](VelocityTemplateLoaderApi.md#addNewLoaderToConfig) | **POST** /http-servlet-extensions/{http-servlet-extension-name}/velocity-template-loaders | Add a new Velocity Template Loader to the config |
| [**deleteLoader**](VelocityTemplateLoaderApi.md#deleteLoader) | **DELETE** /http-servlet-extensions/{http-servlet-extension-name}/velocity-template-loaders/{velocity-template-loader-name} | Delete a Velocity Template Loader |
| [**getAllTemplateLoaders**](VelocityTemplateLoaderApi.md#getAllTemplateLoaders) | **GET** /http-servlet-extensions/{http-servlet-extension-name}/velocity-template-loaders | Returns a list of all Velocity Template Loader objects |
| [**getSingleLoader**](VelocityTemplateLoaderApi.md#getSingleLoader) | **GET** /http-servlet-extensions/{http-servlet-extension-name}/velocity-template-loaders/{velocity-template-loader-name} | Returns a single Velocity Template Loader |
| [**updateByName**](VelocityTemplateLoaderApi.md#updateByName) | **PATCH** /http-servlet-extensions/{http-servlet-extension-name}/velocity-template-loaders/{velocity-template-loader-name} | Update an existing Velocity Template Loader by name |


<a name="addNewLoaderToConfig"></a>
# **addNewLoaderToConfig**
> VelocityTemplateLoaderResponse addNewLoaderToConfig(httpServletExtensionName, addVelocityTemplateLoaderRequest).execute();

Add a new Velocity Template Loader to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VelocityTemplateLoaderApi;
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
    String loaderName = "loaderName_example"; // Name of the new Velocity Template Loader
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    List<EnumvelocityTemplateLoaderSchemaUrn> schemas = Arrays.asList();
    Boolean enabled = true; // Indicates whether this Velocity Template Loader is enabled.
    Integer evaluationOrderIndex = 56; // This property determines the evaluation order for determining the correct Velocity Template Loader to load a template for generating content for a particular request.
    String mimeTypeMatcher = "mimeTypeMatcher_example"; // Specifies a media type for matching Accept request-header values.
    String mimeType = "mimeType_example"; // Specifies a the value that will be used in the response's Content-Type header that indicates the type of content to return.
    String templateSuffix = "templateSuffix_example"; // Specifies the suffix to append to the requested resource name when searching for the template file with which to form a response.
    String templateDirectory = "templateDirectory_example"; // Specifies the directory in which to search for the template files.
    try {
      VelocityTemplateLoaderResponse result = client
              .velocityTemplateLoader
              .addNewLoaderToConfig(loaderName, httpServletExtensionName)
              .schemas(schemas)
              .enabled(enabled)
              .evaluationOrderIndex(evaluationOrderIndex)
              .mimeTypeMatcher(mimeTypeMatcher)
              .mimeType(mimeType)
              .templateSuffix(templateSuffix)
              .templateDirectory(templateDirectory)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getEvaluationOrderIndex());
      System.out.println(result.getMimeTypeMatcher());
      System.out.println(result.getMimeType());
      System.out.println(result.getTemplateSuffix());
      System.out.println(result.getTemplateDirectory());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityTemplateLoaderApi#addNewLoaderToConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VelocityTemplateLoaderResponse> response = client
              .velocityTemplateLoader
              .addNewLoaderToConfig(loaderName, httpServletExtensionName)
              .schemas(schemas)
              .enabled(enabled)
              .evaluationOrderIndex(evaluationOrderIndex)
              .mimeTypeMatcher(mimeTypeMatcher)
              .mimeType(mimeType)
              .templateSuffix(templateSuffix)
              .templateDirectory(templateDirectory)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityTemplateLoaderApi#addNewLoaderToConfig");
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
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |
| **addVelocityTemplateLoaderRequest** | [**AddVelocityTemplateLoaderRequest**](AddVelocityTemplateLoaderRequest.md)| Create a new Velocity Template Loader in the config | |

### Return type

[**VelocityTemplateLoaderResponse**](VelocityTemplateLoaderResponse.md)

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
| **409** | The Velocity Template Loader already exists |  -  |

<a name="deleteLoader"></a>
# **deleteLoader**
> deleteLoader(velocityTemplateLoaderName, httpServletExtensionName).execute();

Delete a Velocity Template Loader

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VelocityTemplateLoaderApi;
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
    String velocityTemplateLoaderName = "velocityTemplateLoaderName_example"; // Name of the Velocity Template Loader
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    try {
      client
              .velocityTemplateLoader
              .deleteLoader(velocityTemplateLoaderName, httpServletExtensionName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityTemplateLoaderApi#deleteLoader");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .velocityTemplateLoader
              .deleteLoader(velocityTemplateLoaderName, httpServletExtensionName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityTemplateLoaderApi#deleteLoader");
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
| **velocityTemplateLoaderName** | **String**| Name of the Velocity Template Loader | |
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |

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
| **404** | The Velocity Template Loader does not exist |  -  |
| **409** | The Velocity Template Loader cannot be deleted |  -  |

<a name="getAllTemplateLoaders"></a>
# **getAllTemplateLoaders**
> VelocityTemplateLoaderListResponse getAllTemplateLoaders(httpServletExtensionName).filter(filter).execute();

Returns a list of all Velocity Template Loader objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VelocityTemplateLoaderApi;
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
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    String filter = "filter_example"; // SCIM filter
    try {
      VelocityTemplateLoaderListResponse result = client
              .velocityTemplateLoader
              .getAllTemplateLoaders(httpServletExtensionName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityTemplateLoaderApi#getAllTemplateLoaders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VelocityTemplateLoaderListResponse> response = client
              .velocityTemplateLoader
              .getAllTemplateLoaders(httpServletExtensionName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityTemplateLoaderApi#getAllTemplateLoaders");
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
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**VelocityTemplateLoaderListResponse**](VelocityTemplateLoaderListResponse.md)

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

<a name="getSingleLoader"></a>
# **getSingleLoader**
> VelocityTemplateLoaderResponse getSingleLoader(velocityTemplateLoaderName, httpServletExtensionName).execute();

Returns a single Velocity Template Loader

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VelocityTemplateLoaderApi;
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
    String velocityTemplateLoaderName = "velocityTemplateLoaderName_example"; // Name of the Velocity Template Loader
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    try {
      VelocityTemplateLoaderResponse result = client
              .velocityTemplateLoader
              .getSingleLoader(velocityTemplateLoaderName, httpServletExtensionName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getEvaluationOrderIndex());
      System.out.println(result.getMimeTypeMatcher());
      System.out.println(result.getMimeType());
      System.out.println(result.getTemplateSuffix());
      System.out.println(result.getTemplateDirectory());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityTemplateLoaderApi#getSingleLoader");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VelocityTemplateLoaderResponse> response = client
              .velocityTemplateLoader
              .getSingleLoader(velocityTemplateLoaderName, httpServletExtensionName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityTemplateLoaderApi#getSingleLoader");
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
| **velocityTemplateLoaderName** | **String**| Name of the Velocity Template Loader | |
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |

### Return type

[**VelocityTemplateLoaderResponse**](VelocityTemplateLoaderResponse.md)

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
| **404** | The Velocity Template Loader does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> VelocityTemplateLoaderResponse updateByName(velocityTemplateLoaderName, httpServletExtensionName, updateRequest).execute();

Update an existing Velocity Template Loader by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VelocityTemplateLoaderApi;
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
    String velocityTemplateLoaderName = "velocityTemplateLoaderName_example"; // Name of the Velocity Template Loader
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    try {
      VelocityTemplateLoaderResponse result = client
              .velocityTemplateLoader
              .updateByName(operations, velocityTemplateLoaderName, httpServletExtensionName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getEvaluationOrderIndex());
      System.out.println(result.getMimeTypeMatcher());
      System.out.println(result.getMimeType());
      System.out.println(result.getTemplateSuffix());
      System.out.println(result.getTemplateDirectory());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityTemplateLoaderApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VelocityTemplateLoaderResponse> response = client
              .velocityTemplateLoader
              .updateByName(operations, velocityTemplateLoaderName, httpServletExtensionName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityTemplateLoaderApi#updateByName");
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
| **velocityTemplateLoaderName** | **String**| Name of the Velocity Template Loader | |
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Velocity Template Loader | |

### Return type

[**VelocityTemplateLoaderResponse**](VelocityTemplateLoaderResponse.md)

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
| **404** | The Velocity Template Loader does not exist |  -  |


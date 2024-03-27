# WebApplicationExtensionApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewExtension**](WebApplicationExtensionApi.md#addNewExtension) | **POST** /web-application-extensions | Add a new Web Application Extension to the config |
| [**deleteExtension**](WebApplicationExtensionApi.md#deleteExtension) | **DELETE** /web-application-extensions/{web-application-extension-name} | Delete a Web Application Extension |
| [**getSingle**](WebApplicationExtensionApi.md#getSingle) | **GET** /web-application-extensions/{web-application-extension-name} | Returns a single Web Application Extension |
| [**listAllObjects**](WebApplicationExtensionApi.md#listAllObjects) | **GET** /web-application-extensions | Returns a list of all Web Application Extension objects |
| [**updateByName**](WebApplicationExtensionApi.md#updateByName) | **PATCH** /web-application-extensions/{web-application-extension-name} | Update an existing Web Application Extension by name |


<a name="addNewExtension"></a>
# **addNewExtension**
> Object addNewExtension(addGenericWebApplicationExtensionRequest).execute();

Add a new Web Application Extension to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebApplicationExtensionApi;
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
    String extensionName = "extensionName_example"; // Name of the new Web Application Extension
    String description = "description_example"; // A description for this Web Application Extension
    List<EnumgenericWebApplicationExtensionSchemaUrn> schemas = Arrays.asList();
    String baseContextPath = "baseContextPath_example"; // Specifies the base context path that should be used by HTTP clients to reference content. The value must start with a forward slash and at least one additional character and must represent a valid HTTP context path.
    String warFile = "warFile_example"; // Specifies the path to a standard web application archive (WAR) file.
    String documentRootDirectory = "documentRootDirectory_example"; // Specifies the path to the directory on the local filesystem containing the files to be served by this Web Application Extension. The path must exist, and it must be a directory.
    String deploymentDescriptorFile = "deploymentDescriptorFile_example"; // Specifies the path to the deployment descriptor file when used with document-root-directory.
    String temporaryDirectory = "temporaryDirectory_example"; // Specifies the path to the directory that may be used to store temporary files such as extracted WAR files and compiled JSP files.
    List<String> initParameter = Arrays.asList(); // Specifies an initialization parameter to pass into the web application during startup.
    try {
      Object result = client
              .webApplicationExtension
              .addNewExtension(extensionName)
              .description(description)
              .schemas(schemas)
              .baseContextPath(baseContextPath)
              .warFile(warFile)
              .documentRootDirectory(documentRootDirectory)
              .deploymentDescriptorFile(deploymentDescriptorFile)
              .temporaryDirectory(temporaryDirectory)
              .initParameter(initParameter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebApplicationExtensionApi#addNewExtension");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .webApplicationExtension
              .addNewExtension(extensionName)
              .description(description)
              .schemas(schemas)
              .baseContextPath(baseContextPath)
              .warFile(warFile)
              .documentRootDirectory(documentRootDirectory)
              .deploymentDescriptorFile(deploymentDescriptorFile)
              .temporaryDirectory(temporaryDirectory)
              .initParameter(initParameter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebApplicationExtensionApi#addNewExtension");
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
| **addGenericWebApplicationExtensionRequest** | [**AddGenericWebApplicationExtensionRequest**](AddGenericWebApplicationExtensionRequest.md)| Create a new Web Application Extension in the config | |

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
| **400** | Bad request |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **409** | The Web Application Extension already exists |  -  |

<a name="deleteExtension"></a>
# **deleteExtension**
> deleteExtension(webApplicationExtensionName).execute();

Delete a Web Application Extension

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebApplicationExtensionApi;
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
    String webApplicationExtensionName = "webApplicationExtensionName_example"; // Name of the Web Application Extension
    try {
      client
              .webApplicationExtension
              .deleteExtension(webApplicationExtensionName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebApplicationExtensionApi#deleteExtension");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webApplicationExtension
              .deleteExtension(webApplicationExtensionName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebApplicationExtensionApi#deleteExtension");
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
| **webApplicationExtensionName** | **String**| Name of the Web Application Extension | |

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
| **404** | The Web Application Extension does not exist |  -  |
| **409** | The Web Application Extension cannot be deleted |  -  |

<a name="getSingle"></a>
# **getSingle**
> Object getSingle(webApplicationExtensionName).execute();

Returns a single Web Application Extension

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebApplicationExtensionApi;
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
    String webApplicationExtensionName = "webApplicationExtensionName_example"; // Name of the Web Application Extension
    try {
      Object result = client
              .webApplicationExtension
              .getSingle(webApplicationExtensionName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebApplicationExtensionApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .webApplicationExtension
              .getSingle(webApplicationExtensionName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebApplicationExtensionApi#getSingle");
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
| **webApplicationExtensionName** | **String**| Name of the Web Application Extension | |

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
| **404** | The Web Application Extension does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> WebApplicationExtensionListResponse listAllObjects().filter(filter).execute();

Returns a list of all Web Application Extension objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebApplicationExtensionApi;
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
    String filter = "filter_example"; // SCIM filter
    try {
      WebApplicationExtensionListResponse result = client
              .webApplicationExtension
              .listAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebApplicationExtensionApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebApplicationExtensionListResponse> response = client
              .webApplicationExtension
              .listAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebApplicationExtensionApi#listAllObjects");
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
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**WebApplicationExtensionListResponse**](WebApplicationExtensionListResponse.md)

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
> Object updateByName(webApplicationExtensionName, updateRequest).execute();

Update an existing Web Application Extension by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebApplicationExtensionApi;
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
    String webApplicationExtensionName = "webApplicationExtensionName_example"; // Name of the Web Application Extension
    try {
      Object result = client
              .webApplicationExtension
              .updateByName(operations, webApplicationExtensionName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebApplicationExtensionApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .webApplicationExtension
              .updateByName(operations, webApplicationExtensionName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebApplicationExtensionApi#updateByName");
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
| **webApplicationExtensionName** | **String**| Name of the Web Application Extension | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Web Application Extension | |

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
| **404** | The Web Application Extension does not exist |  -  |


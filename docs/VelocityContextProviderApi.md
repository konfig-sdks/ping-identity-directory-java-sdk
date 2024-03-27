# VelocityContextProviderApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewProviderToConfig**](VelocityContextProviderApi.md#addNewProviderToConfig) | **POST** /http-servlet-extensions/{http-servlet-extension-name}/velocity-context-providers | Add a new Velocity Context Provider to the config |
| [**deleteVelocityContextProvider**](VelocityContextProviderApi.md#deleteVelocityContextProvider) | **DELETE** /http-servlet-extensions/{http-servlet-extension-name}/velocity-context-providers/{velocity-context-provider-name} | Delete a Velocity Context Provider |
| [**getSingleVelocityContextProvider**](VelocityContextProviderApi.md#getSingleVelocityContextProvider) | **GET** /http-servlet-extensions/{http-servlet-extension-name}/velocity-context-providers/{velocity-context-provider-name} | Returns a single Velocity Context Provider |
| [**listAllVelocityContextProviders**](VelocityContextProviderApi.md#listAllVelocityContextProviders) | **GET** /http-servlet-extensions/{http-servlet-extension-name}/velocity-context-providers | Returns a list of all Velocity Context Provider objects |
| [**updateBynameVelocityContextProvider**](VelocityContextProviderApi.md#updateBynameVelocityContextProvider) | **PATCH** /http-servlet-extensions/{http-servlet-extension-name}/velocity-context-providers/{velocity-context-provider-name} | Update an existing Velocity Context Provider by name |


<a name="addNewProviderToConfig"></a>
# **addNewProviderToConfig**
> Object addNewProviderToConfig(httpServletExtensionName, body).execute();

Add a new Velocity Context Provider to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VelocityContextProviderApi;
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
    try {
      Object result = client
              .velocityContextProvider
              .addNewProviderToConfig(httpServletExtensionName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityContextProviderApi#addNewProviderToConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .velocityContextProvider
              .addNewProviderToConfig(httpServletExtensionName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityContextProviderApi#addNewProviderToConfig");
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
| **body** | **Object**| Create a new Velocity Context Provider in the config | |

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
| **409** | The Velocity Context Provider already exists |  -  |

<a name="deleteVelocityContextProvider"></a>
# **deleteVelocityContextProvider**
> deleteVelocityContextProvider(velocityContextProviderName, httpServletExtensionName).execute();

Delete a Velocity Context Provider

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VelocityContextProviderApi;
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
    String velocityContextProviderName = "velocityContextProviderName_example"; // Name of the Velocity Context Provider
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    try {
      client
              .velocityContextProvider
              .deleteVelocityContextProvider(velocityContextProviderName, httpServletExtensionName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityContextProviderApi#deleteVelocityContextProvider");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .velocityContextProvider
              .deleteVelocityContextProvider(velocityContextProviderName, httpServletExtensionName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityContextProviderApi#deleteVelocityContextProvider");
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
| **velocityContextProviderName** | **String**| Name of the Velocity Context Provider | |
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
| **404** | The Velocity Context Provider does not exist |  -  |
| **409** | The Velocity Context Provider cannot be deleted |  -  |

<a name="getSingleVelocityContextProvider"></a>
# **getSingleVelocityContextProvider**
> Object getSingleVelocityContextProvider(velocityContextProviderName, httpServletExtensionName).execute();

Returns a single Velocity Context Provider

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VelocityContextProviderApi;
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
    String velocityContextProviderName = "velocityContextProviderName_example"; // Name of the Velocity Context Provider
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    try {
      Object result = client
              .velocityContextProvider
              .getSingleVelocityContextProvider(velocityContextProviderName, httpServletExtensionName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityContextProviderApi#getSingleVelocityContextProvider");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .velocityContextProvider
              .getSingleVelocityContextProvider(velocityContextProviderName, httpServletExtensionName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityContextProviderApi#getSingleVelocityContextProvider");
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
| **velocityContextProviderName** | **String**| Name of the Velocity Context Provider | |
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |

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
| **404** | The Velocity Context Provider does not exist |  -  |

<a name="listAllVelocityContextProviders"></a>
# **listAllVelocityContextProviders**
> VelocityContextProviderListResponse listAllVelocityContextProviders(httpServletExtensionName).filter(filter).execute();

Returns a list of all Velocity Context Provider objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VelocityContextProviderApi;
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
      VelocityContextProviderListResponse result = client
              .velocityContextProvider
              .listAllVelocityContextProviders(httpServletExtensionName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityContextProviderApi#listAllVelocityContextProviders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VelocityContextProviderListResponse> response = client
              .velocityContextProvider
              .listAllVelocityContextProviders(httpServletExtensionName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityContextProviderApi#listAllVelocityContextProviders");
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

[**VelocityContextProviderListResponse**](VelocityContextProviderListResponse.md)

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

<a name="updateBynameVelocityContextProvider"></a>
# **updateBynameVelocityContextProvider**
> Object updateBynameVelocityContextProvider(velocityContextProviderName, httpServletExtensionName, updateRequest).execute();

Update an existing Velocity Context Provider by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VelocityContextProviderApi;
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
    String velocityContextProviderName = "velocityContextProviderName_example"; // Name of the Velocity Context Provider
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    try {
      Object result = client
              .velocityContextProvider
              .updateBynameVelocityContextProvider(operations, velocityContextProviderName, httpServletExtensionName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityContextProviderApi#updateBynameVelocityContextProvider");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .velocityContextProvider
              .updateBynameVelocityContextProvider(operations, velocityContextProviderName, httpServletExtensionName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VelocityContextProviderApi#updateBynameVelocityContextProvider");
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
| **velocityContextProviderName** | **String**| Name of the Velocity Context Provider | |
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Velocity Context Provider | |

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
| **404** | The Velocity Context Provider does not exist |  -  |


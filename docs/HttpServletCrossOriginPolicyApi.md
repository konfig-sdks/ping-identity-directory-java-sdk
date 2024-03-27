# HttpServletCrossOriginPolicyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewPolicy**](HttpServletCrossOriginPolicyApi.md#addNewPolicy) | **POST** /http-servlet-cross-origin-policies | Add a new HTTP Servlet Cross Origin Policy to the config |
| [**deletePolicy**](HttpServletCrossOriginPolicyApi.md#deletePolicy) | **DELETE** /http-servlet-cross-origin-policies/{http-servlet-cross-origin-policy-name} | Delete a HTTP Servlet Cross Origin Policy |
| [**getSinglePolicy**](HttpServletCrossOriginPolicyApi.md#getSinglePolicy) | **GET** /http-servlet-cross-origin-policies/{http-servlet-cross-origin-policy-name} | Returns a single HTTP Servlet Cross Origin Policy |
| [**listAllPolicies**](HttpServletCrossOriginPolicyApi.md#listAllPolicies) | **GET** /http-servlet-cross-origin-policies | Returns a list of all HTTP Servlet Cross Origin Policy objects |
| [**updateByName**](HttpServletCrossOriginPolicyApi.md#updateByName) | **PATCH** /http-servlet-cross-origin-policies/{http-servlet-cross-origin-policy-name} | Update an existing HTTP Servlet Cross Origin Policy by name |


<a name="addNewPolicy"></a>
# **addNewPolicy**
> HttpServletCrossOriginPolicyResponse addNewPolicy(addHttpServletCrossOriginPolicyRequest).execute();

Add a new HTTP Servlet Cross Origin Policy to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HttpServletCrossOriginPolicyApi;
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
    String policyName = "policyName_example"; // Name of the new HTTP Servlet Cross Origin Policy
    String description = "description_example"; // A description for this HTTP Servlet Cross Origin Policy
    List<EnumhttpServletCrossOriginPolicySchemaUrn> schemas = Arrays.asList();
    List<String> corsAllowedMethods = Arrays.asList(); // A list of HTTP methods allowed for cross-origin access to resources. i.e. one or more of GET, POST, PUT, DELETE, etc.
    List<String> corsAllowedOrigins = Arrays.asList(); // A list of origins that are allowed to execute cross-origin requests.
    List<String> corsExposedHeaders = Arrays.asList(); // A list of HTTP headers other than the simple response headers that browsers are allowed to access.
    List<String> corsAllowedHeaders = Arrays.asList(); // A list of HTTP headers that are supported by the resource and can be specified in a cross-origin request.
    String corsPreflightMaxAge = "corsPreflightMaxAge_example"; // The maximum amount of time that a preflight request can be cached by a client.
    Boolean corsAllowCredentials = true; // Indicates whether the servlet extension allows CORS requests with username/password credentials.
    try {
      HttpServletCrossOriginPolicyResponse result = client
              .httpServletCrossOriginPolicy
              .addNewPolicy(policyName)
              .description(description)
              .schemas(schemas)
              .corsAllowedMethods(corsAllowedMethods)
              .corsAllowedOrigins(corsAllowedOrigins)
              .corsExposedHeaders(corsExposedHeaders)
              .corsAllowedHeaders(corsAllowedHeaders)
              .corsPreflightMaxAge(corsPreflightMaxAge)
              .corsAllowCredentials(corsAllowCredentials)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getCorsAllowedMethods());
      System.out.println(result.getCorsAllowedOrigins());
      System.out.println(result.getCorsExposedHeaders());
      System.out.println(result.getCorsAllowedHeaders());
      System.out.println(result.getCorsPreflightMaxAge());
      System.out.println(result.getCorsAllowCredentials());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpServletCrossOriginPolicyApi#addNewPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HttpServletCrossOriginPolicyResponse> response = client
              .httpServletCrossOriginPolicy
              .addNewPolicy(policyName)
              .description(description)
              .schemas(schemas)
              .corsAllowedMethods(corsAllowedMethods)
              .corsAllowedOrigins(corsAllowedOrigins)
              .corsExposedHeaders(corsExposedHeaders)
              .corsAllowedHeaders(corsAllowedHeaders)
              .corsPreflightMaxAge(corsPreflightMaxAge)
              .corsAllowCredentials(corsAllowCredentials)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpServletCrossOriginPolicyApi#addNewPolicy");
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
| **addHttpServletCrossOriginPolicyRequest** | [**AddHttpServletCrossOriginPolicyRequest**](AddHttpServletCrossOriginPolicyRequest.md)| Create a new HTTP Servlet Cross Origin Policy in the config | |

### Return type

[**HttpServletCrossOriginPolicyResponse**](HttpServletCrossOriginPolicyResponse.md)

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
| **409** | The HTTP Servlet Cross Origin Policy already exists |  -  |

<a name="deletePolicy"></a>
# **deletePolicy**
> deletePolicy(httpServletCrossOriginPolicyName).execute();

Delete a HTTP Servlet Cross Origin Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HttpServletCrossOriginPolicyApi;
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
    String httpServletCrossOriginPolicyName = "httpServletCrossOriginPolicyName_example"; // Name of the HTTP Servlet Cross Origin Policy
    try {
      client
              .httpServletCrossOriginPolicy
              .deletePolicy(httpServletCrossOriginPolicyName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpServletCrossOriginPolicyApi#deletePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .httpServletCrossOriginPolicy
              .deletePolicy(httpServletCrossOriginPolicyName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpServletCrossOriginPolicyApi#deletePolicy");
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
| **httpServletCrossOriginPolicyName** | **String**| Name of the HTTP Servlet Cross Origin Policy | |

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
| **404** | The HTTP Servlet Cross Origin Policy does not exist |  -  |
| **409** | The HTTP Servlet Cross Origin Policy cannot be deleted |  -  |

<a name="getSinglePolicy"></a>
# **getSinglePolicy**
> HttpServletCrossOriginPolicyResponse getSinglePolicy(httpServletCrossOriginPolicyName).execute();

Returns a single HTTP Servlet Cross Origin Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HttpServletCrossOriginPolicyApi;
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
    String httpServletCrossOriginPolicyName = "httpServletCrossOriginPolicyName_example"; // Name of the HTTP Servlet Cross Origin Policy
    try {
      HttpServletCrossOriginPolicyResponse result = client
              .httpServletCrossOriginPolicy
              .getSinglePolicy(httpServletCrossOriginPolicyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getCorsAllowedMethods());
      System.out.println(result.getCorsAllowedOrigins());
      System.out.println(result.getCorsExposedHeaders());
      System.out.println(result.getCorsAllowedHeaders());
      System.out.println(result.getCorsPreflightMaxAge());
      System.out.println(result.getCorsAllowCredentials());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpServletCrossOriginPolicyApi#getSinglePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HttpServletCrossOriginPolicyResponse> response = client
              .httpServletCrossOriginPolicy
              .getSinglePolicy(httpServletCrossOriginPolicyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpServletCrossOriginPolicyApi#getSinglePolicy");
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
| **httpServletCrossOriginPolicyName** | **String**| Name of the HTTP Servlet Cross Origin Policy | |

### Return type

[**HttpServletCrossOriginPolicyResponse**](HttpServletCrossOriginPolicyResponse.md)

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
| **404** | The HTTP Servlet Cross Origin Policy does not exist |  -  |

<a name="listAllPolicies"></a>
# **listAllPolicies**
> HttpServletCrossOriginPolicyListResponse listAllPolicies().filter(filter).execute();

Returns a list of all HTTP Servlet Cross Origin Policy objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HttpServletCrossOriginPolicyApi;
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
      HttpServletCrossOriginPolicyListResponse result = client
              .httpServletCrossOriginPolicy
              .listAllPolicies()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpServletCrossOriginPolicyApi#listAllPolicies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HttpServletCrossOriginPolicyListResponse> response = client
              .httpServletCrossOriginPolicy
              .listAllPolicies()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpServletCrossOriginPolicyApi#listAllPolicies");
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

[**HttpServletCrossOriginPolicyListResponse**](HttpServletCrossOriginPolicyListResponse.md)

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
> HttpServletCrossOriginPolicyResponse updateByName(httpServletCrossOriginPolicyName, updateRequest).execute();

Update an existing HTTP Servlet Cross Origin Policy by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HttpServletCrossOriginPolicyApi;
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
    String httpServletCrossOriginPolicyName = "httpServletCrossOriginPolicyName_example"; // Name of the HTTP Servlet Cross Origin Policy
    try {
      HttpServletCrossOriginPolicyResponse result = client
              .httpServletCrossOriginPolicy
              .updateByName(operations, httpServletCrossOriginPolicyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getCorsAllowedMethods());
      System.out.println(result.getCorsAllowedOrigins());
      System.out.println(result.getCorsExposedHeaders());
      System.out.println(result.getCorsAllowedHeaders());
      System.out.println(result.getCorsPreflightMaxAge());
      System.out.println(result.getCorsAllowCredentials());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpServletCrossOriginPolicyApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HttpServletCrossOriginPolicyResponse> response = client
              .httpServletCrossOriginPolicy
              .updateByName(operations, httpServletCrossOriginPolicyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpServletCrossOriginPolicyApi#updateByName");
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
| **httpServletCrossOriginPolicyName** | **String**| Name of the HTTP Servlet Cross Origin Policy | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing HTTP Servlet Cross Origin Policy | |

### Return type

[**HttpServletCrossOriginPolicyResponse**](HttpServletCrossOriginPolicyResponse.md)

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
| **404** | The HTTP Servlet Cross Origin Policy does not exist |  -  |


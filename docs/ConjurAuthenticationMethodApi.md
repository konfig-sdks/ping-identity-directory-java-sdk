# ConjurAuthenticationMethodApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewMethod**](ConjurAuthenticationMethodApi.md#addNewMethod) | **POST** /conjur-authentication-methods | Add a new Conjur Authentication Method to the config |
| [**deleteMethod**](ConjurAuthenticationMethodApi.md#deleteMethod) | **DELETE** /conjur-authentication-methods/{conjur-authentication-method-name} | Delete a Conjur Authentication Method |
| [**getMethod**](ConjurAuthenticationMethodApi.md#getMethod) | **GET** /conjur-authentication-methods/{conjur-authentication-method-name} | Returns a single Conjur Authentication Method |
| [**listAllMethods**](ConjurAuthenticationMethodApi.md#listAllMethods) | **GET** /conjur-authentication-methods | Returns a list of all Conjur Authentication Method objects |
| [**updateByMethodName**](ConjurAuthenticationMethodApi.md#updateByMethodName) | **PATCH** /conjur-authentication-methods/{conjur-authentication-method-name} | Update an existing Conjur Authentication Method by name |


<a name="addNewMethod"></a>
# **addNewMethod**
> ApiKeyConjurAuthenticationMethodResponse addNewMethod(addApiKeyConjurAuthenticationMethodRequest).execute();

Add a new Conjur Authentication Method to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConjurAuthenticationMethodApi;
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
    String methodName = "methodName_example"; // Name of the new Conjur Authentication Method
    String description = "description_example"; // A description for this Conjur Authentication Method
    List<EnumapiKeyConjurAuthenticationMethodSchemaUrn> schemas = Arrays.asList();
    String username = "username_example"; // The username for the user to authenticate.
    String password = "password_example"; // The password for the user to authenticate. This will be used to obtain an API key for the target user.
    String apiKey = "apiKey_example"; // The API key for the user to authenticate.
    try {
      ApiKeyConjurAuthenticationMethodResponse result = client
              .conjurAuthenticationMethod
              .addNewMethod(methodName)
              .description(description)
              .schemas(schemas)
              .username(username)
              .password(password)
              .apiKey(apiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getUsername());
      System.out.println(result.getPassword());
      System.out.println(result.getApiKey());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConjurAuthenticationMethodApi#addNewMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApiKeyConjurAuthenticationMethodResponse> response = client
              .conjurAuthenticationMethod
              .addNewMethod(methodName)
              .description(description)
              .schemas(schemas)
              .username(username)
              .password(password)
              .apiKey(apiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConjurAuthenticationMethodApi#addNewMethod");
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
| **addApiKeyConjurAuthenticationMethodRequest** | [**AddApiKeyConjurAuthenticationMethodRequest**](AddApiKeyConjurAuthenticationMethodRequest.md)| Create a new Conjur Authentication Method in the config | |

### Return type

[**ApiKeyConjurAuthenticationMethodResponse**](ApiKeyConjurAuthenticationMethodResponse.md)

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
| **409** | The Conjur Authentication Method already exists |  -  |

<a name="deleteMethod"></a>
# **deleteMethod**
> deleteMethod(conjurAuthenticationMethodName).execute();

Delete a Conjur Authentication Method

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConjurAuthenticationMethodApi;
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
    String conjurAuthenticationMethodName = "conjurAuthenticationMethodName_example"; // Name of the Conjur Authentication Method
    try {
      client
              .conjurAuthenticationMethod
              .deleteMethod(conjurAuthenticationMethodName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConjurAuthenticationMethodApi#deleteMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .conjurAuthenticationMethod
              .deleteMethod(conjurAuthenticationMethodName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConjurAuthenticationMethodApi#deleteMethod");
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
| **conjurAuthenticationMethodName** | **String**| Name of the Conjur Authentication Method | |

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
| **404** | The Conjur Authentication Method does not exist |  -  |
| **409** | The Conjur Authentication Method cannot be deleted |  -  |

<a name="getMethod"></a>
# **getMethod**
> ApiKeyConjurAuthenticationMethodResponse getMethod(conjurAuthenticationMethodName).execute();

Returns a single Conjur Authentication Method

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConjurAuthenticationMethodApi;
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
    String conjurAuthenticationMethodName = "conjurAuthenticationMethodName_example"; // Name of the Conjur Authentication Method
    try {
      ApiKeyConjurAuthenticationMethodResponse result = client
              .conjurAuthenticationMethod
              .getMethod(conjurAuthenticationMethodName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getUsername());
      System.out.println(result.getPassword());
      System.out.println(result.getApiKey());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConjurAuthenticationMethodApi#getMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApiKeyConjurAuthenticationMethodResponse> response = client
              .conjurAuthenticationMethod
              .getMethod(conjurAuthenticationMethodName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConjurAuthenticationMethodApi#getMethod");
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
| **conjurAuthenticationMethodName** | **String**| Name of the Conjur Authentication Method | |

### Return type

[**ApiKeyConjurAuthenticationMethodResponse**](ApiKeyConjurAuthenticationMethodResponse.md)

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
| **404** | The Conjur Authentication Method does not exist |  -  |

<a name="listAllMethods"></a>
# **listAllMethods**
> ConjurAuthenticationMethodListResponse listAllMethods().filter(filter).execute();

Returns a list of all Conjur Authentication Method objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConjurAuthenticationMethodApi;
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
      ConjurAuthenticationMethodListResponse result = client
              .conjurAuthenticationMethod
              .listAllMethods()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConjurAuthenticationMethodApi#listAllMethods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConjurAuthenticationMethodListResponse> response = client
              .conjurAuthenticationMethod
              .listAllMethods()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConjurAuthenticationMethodApi#listAllMethods");
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

[**ConjurAuthenticationMethodListResponse**](ConjurAuthenticationMethodListResponse.md)

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

<a name="updateByMethodName"></a>
# **updateByMethodName**
> ApiKeyConjurAuthenticationMethodResponse updateByMethodName(conjurAuthenticationMethodName, updateRequest).execute();

Update an existing Conjur Authentication Method by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConjurAuthenticationMethodApi;
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
    String conjurAuthenticationMethodName = "conjurAuthenticationMethodName_example"; // Name of the Conjur Authentication Method
    try {
      ApiKeyConjurAuthenticationMethodResponse result = client
              .conjurAuthenticationMethod
              .updateByMethodName(operations, conjurAuthenticationMethodName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getUsername());
      System.out.println(result.getPassword());
      System.out.println(result.getApiKey());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConjurAuthenticationMethodApi#updateByMethodName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApiKeyConjurAuthenticationMethodResponse> response = client
              .conjurAuthenticationMethod
              .updateByMethodName(operations, conjurAuthenticationMethodName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConjurAuthenticationMethodApi#updateByMethodName");
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
| **conjurAuthenticationMethodName** | **String**| Name of the Conjur Authentication Method | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Conjur Authentication Method | |

### Return type

[**ApiKeyConjurAuthenticationMethodResponse**](ApiKeyConjurAuthenticationMethodResponse.md)

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
| **404** | The Conjur Authentication Method does not exist |  -  |


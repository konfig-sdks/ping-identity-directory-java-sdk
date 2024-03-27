# ResultCodeMapApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewResultCodeMap**](ResultCodeMapApi.md#addNewResultCodeMap) | **POST** /result-code-maps | Add a new Result Code Map to the config |
| [**deleteResultCodeMap**](ResultCodeMapApi.md#deleteResultCodeMap) | **DELETE** /result-code-maps/{result-code-map-name} | Delete a Result Code Map |
| [**getAllObjects**](ResultCodeMapApi.md#getAllObjects) | **GET** /result-code-maps | Returns a list of all Result Code Map objects |
| [**getSingleMap**](ResultCodeMapApi.md#getSingleMap) | **GET** /result-code-maps/{result-code-map-name} | Returns a single Result Code Map |
| [**updateByName**](ResultCodeMapApi.md#updateByName) | **PATCH** /result-code-maps/{result-code-map-name} | Update an existing Result Code Map by name |


<a name="addNewResultCodeMap"></a>
# **addNewResultCodeMap**
> ResultCodeMapResponse addNewResultCodeMap(addResultCodeMapRequest).execute();

Add a new Result Code Map to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ResultCodeMapApi;
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
    String mapName = "mapName_example"; // Name of the new Result Code Map
    String description = "description_example"; // A description for this Result Code Map
    List<EnumresultCodeMapSchemaUrn> schemas = Arrays.asList();
    Integer bindAccountLockedResultCode = 56; // Specifies the result code that should be returned if a bind attempt fails because the user's account is locked as a result of too many failed authentication attempts.
    Integer bindMissingUserResultCode = 56; // Specifies the result code that should be returned if a bind attempt fails because the target user entry does not exist in the server.
    Integer bindMissingPasswordResultCode = 56; // Specifies the result code that should be returned if a password-based bind attempt fails because the target user entry does not have a password.
    Integer serverErrorResultCode = 56; // Specifies the result code that should be returned if a generic error occurs within the server.
    try {
      ResultCodeMapResponse result = client
              .resultCodeMap
              .addNewResultCodeMap(mapName)
              .description(description)
              .schemas(schemas)
              .bindAccountLockedResultCode(bindAccountLockedResultCode)
              .bindMissingUserResultCode(bindMissingUserResultCode)
              .bindMissingPasswordResultCode(bindMissingPasswordResultCode)
              .serverErrorResultCode(serverErrorResultCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getBindAccountLockedResultCode());
      System.out.println(result.getBindMissingUserResultCode());
      System.out.println(result.getBindMissingPasswordResultCode());
      System.out.println(result.getServerErrorResultCode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ResultCodeMapApi#addNewResultCodeMap");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultCodeMapResponse> response = client
              .resultCodeMap
              .addNewResultCodeMap(mapName)
              .description(description)
              .schemas(schemas)
              .bindAccountLockedResultCode(bindAccountLockedResultCode)
              .bindMissingUserResultCode(bindMissingUserResultCode)
              .bindMissingPasswordResultCode(bindMissingPasswordResultCode)
              .serverErrorResultCode(serverErrorResultCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ResultCodeMapApi#addNewResultCodeMap");
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
| **addResultCodeMapRequest** | [**AddResultCodeMapRequest**](AddResultCodeMapRequest.md)| Create a new Result Code Map in the config | |

### Return type

[**ResultCodeMapResponse**](ResultCodeMapResponse.md)

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
| **409** | The Result Code Map already exists |  -  |

<a name="deleteResultCodeMap"></a>
# **deleteResultCodeMap**
> deleteResultCodeMap(resultCodeMapName).execute();

Delete a Result Code Map

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ResultCodeMapApi;
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
    String resultCodeMapName = "resultCodeMapName_example"; // Name of the Result Code Map
    try {
      client
              .resultCodeMap
              .deleteResultCodeMap(resultCodeMapName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResultCodeMapApi#deleteResultCodeMap");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .resultCodeMap
              .deleteResultCodeMap(resultCodeMapName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ResultCodeMapApi#deleteResultCodeMap");
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
| **resultCodeMapName** | **String**| Name of the Result Code Map | |

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
| **404** | The Result Code Map does not exist |  -  |
| **409** | The Result Code Map cannot be deleted |  -  |

<a name="getAllObjects"></a>
# **getAllObjects**
> ResultCodeMapListResponse getAllObjects().filter(filter).execute();

Returns a list of all Result Code Map objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ResultCodeMapApi;
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
      ResultCodeMapListResponse result = client
              .resultCodeMap
              .getAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ResultCodeMapApi#getAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultCodeMapListResponse> response = client
              .resultCodeMap
              .getAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ResultCodeMapApi#getAllObjects");
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

[**ResultCodeMapListResponse**](ResultCodeMapListResponse.md)

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

<a name="getSingleMap"></a>
# **getSingleMap**
> ResultCodeMapResponse getSingleMap(resultCodeMapName).execute();

Returns a single Result Code Map

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ResultCodeMapApi;
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
    String resultCodeMapName = "resultCodeMapName_example"; // Name of the Result Code Map
    try {
      ResultCodeMapResponse result = client
              .resultCodeMap
              .getSingleMap(resultCodeMapName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getBindAccountLockedResultCode());
      System.out.println(result.getBindMissingUserResultCode());
      System.out.println(result.getBindMissingPasswordResultCode());
      System.out.println(result.getServerErrorResultCode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ResultCodeMapApi#getSingleMap");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultCodeMapResponse> response = client
              .resultCodeMap
              .getSingleMap(resultCodeMapName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ResultCodeMapApi#getSingleMap");
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
| **resultCodeMapName** | **String**| Name of the Result Code Map | |

### Return type

[**ResultCodeMapResponse**](ResultCodeMapResponse.md)

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
| **404** | The Result Code Map does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> ResultCodeMapResponse updateByName(resultCodeMapName, updateRequest).execute();

Update an existing Result Code Map by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ResultCodeMapApi;
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
    String resultCodeMapName = "resultCodeMapName_example"; // Name of the Result Code Map
    try {
      ResultCodeMapResponse result = client
              .resultCodeMap
              .updateByName(operations, resultCodeMapName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getBindAccountLockedResultCode());
      System.out.println(result.getBindMissingUserResultCode());
      System.out.println(result.getBindMissingPasswordResultCode());
      System.out.println(result.getServerErrorResultCode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ResultCodeMapApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ResultCodeMapResponse> response = client
              .resultCodeMap
              .updateByName(operations, resultCodeMapName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ResultCodeMapApi#updateByName");
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
| **resultCodeMapName** | **String**| Name of the Result Code Map | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Result Code Map | |

### Return type

[**ResultCodeMapResponse**](ResultCodeMapResponse.md)

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
| **404** | The Result Code Map does not exist |  -  |


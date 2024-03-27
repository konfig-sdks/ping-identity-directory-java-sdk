# JsonAttributeConstraintsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewConfig**](JsonAttributeConstraintsApi.md#addNewConfig) | **POST** /json-attribute-constraints | Add a new JSON Attribute Constraints to the config |
| [**deleteJsonAttributeConstraints**](JsonAttributeConstraintsApi.md#deleteJsonAttributeConstraints) | **DELETE** /json-attribute-constraints/{json-attribute-constraints-name} | Delete a JSON Attribute Constraints |
| [**getAllObjects**](JsonAttributeConstraintsApi.md#getAllObjects) | **GET** /json-attribute-constraints | Returns a list of all JSON Attribute Constraints objects |
| [**getSingleJsonAttributeConstraints**](JsonAttributeConstraintsApi.md#getSingleJsonAttributeConstraints) | **GET** /json-attribute-constraints/{json-attribute-constraints-name} | Returns a single JSON Attribute Constraints |
| [**updateByName**](JsonAttributeConstraintsApi.md#updateByName) | **PATCH** /json-attribute-constraints/{json-attribute-constraints-name} | Update an existing JSON Attribute Constraints by name |


<a name="addNewConfig"></a>
# **addNewConfig**
> JsonAttributeConstraintsResponse addNewConfig(addJsonAttributeConstraintsRequest).execute();

Add a new JSON Attribute Constraints to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JsonAttributeConstraintsApi;
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
    String attributeType = "attributeType_example"; // The name or OID of the LDAP attribute type whose values will be subject to the associated field constraints. This attribute type must be defined in the server schema, and it must have a \\\"JSON object\\\" syntax.
    String description = "description_example"; // A description for this JSON Attribute Constraints
    List<EnumjsonAttributeConstraintsSchemaUrn> schemas = Arrays.asList();
    Boolean enabled = true; // Indicates whether this JSON Attribute Constraints is enabled.
    Boolean allowUnnamedFields = true; // Indicates whether JSON objects stored as values of attributes with the associated attribute-type will be permitted to include fields for which there is no subordinate json-field-constraints definition. If unnamed fields are allowed, then no constraints will be imposed on the values of those fields. However, if unnamed fields are not allowed, then the server will reject any attempt to store a JSON object with a field for which there is no corresponding json-fields-constraints definition.
    try {
      JsonAttributeConstraintsResponse result = client
              .jsonAttributeConstraints
              .addNewConfig(attributeType)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .allowUnnamedFields(allowUnnamedFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getAttributeType());
      System.out.println(result.getAllowUnnamedFields());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonAttributeConstraintsApi#addNewConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonAttributeConstraintsResponse> response = client
              .jsonAttributeConstraints
              .addNewConfig(attributeType)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .allowUnnamedFields(allowUnnamedFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonAttributeConstraintsApi#addNewConfig");
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
| **addJsonAttributeConstraintsRequest** | [**AddJsonAttributeConstraintsRequest**](AddJsonAttributeConstraintsRequest.md)| Create a new JSON Attribute Constraints in the config | |

### Return type

[**JsonAttributeConstraintsResponse**](JsonAttributeConstraintsResponse.md)

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
| **409** | The JSON Attribute Constraints already exists |  -  |

<a name="deleteJsonAttributeConstraints"></a>
# **deleteJsonAttributeConstraints**
> deleteJsonAttributeConstraints(jsonAttributeConstraintsName).execute();

Delete a JSON Attribute Constraints

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JsonAttributeConstraintsApi;
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
    String jsonAttributeConstraintsName = "jsonAttributeConstraintsName_example"; // Name of the JSON Attribute Constraints
    try {
      client
              .jsonAttributeConstraints
              .deleteJsonAttributeConstraints(jsonAttributeConstraintsName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonAttributeConstraintsApi#deleteJsonAttributeConstraints");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .jsonAttributeConstraints
              .deleteJsonAttributeConstraints(jsonAttributeConstraintsName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonAttributeConstraintsApi#deleteJsonAttributeConstraints");
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
| **jsonAttributeConstraintsName** | **String**| Name of the JSON Attribute Constraints | |

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
| **404** | The JSON Attribute Constraints does not exist |  -  |
| **409** | The JSON Attribute Constraints cannot be deleted |  -  |

<a name="getAllObjects"></a>
# **getAllObjects**
> JsonAttributeConstraintsListResponse getAllObjects().filter(filter).execute();

Returns a list of all JSON Attribute Constraints objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JsonAttributeConstraintsApi;
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
      JsonAttributeConstraintsListResponse result = client
              .jsonAttributeConstraints
              .getAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonAttributeConstraintsApi#getAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonAttributeConstraintsListResponse> response = client
              .jsonAttributeConstraints
              .getAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonAttributeConstraintsApi#getAllObjects");
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

[**JsonAttributeConstraintsListResponse**](JsonAttributeConstraintsListResponse.md)

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

<a name="getSingleJsonAttributeConstraints"></a>
# **getSingleJsonAttributeConstraints**
> JsonAttributeConstraintsResponse getSingleJsonAttributeConstraints(jsonAttributeConstraintsName).execute();

Returns a single JSON Attribute Constraints

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JsonAttributeConstraintsApi;
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
    String jsonAttributeConstraintsName = "jsonAttributeConstraintsName_example"; // Name of the JSON Attribute Constraints
    try {
      JsonAttributeConstraintsResponse result = client
              .jsonAttributeConstraints
              .getSingleJsonAttributeConstraints(jsonAttributeConstraintsName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getAttributeType());
      System.out.println(result.getAllowUnnamedFields());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonAttributeConstraintsApi#getSingleJsonAttributeConstraints");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonAttributeConstraintsResponse> response = client
              .jsonAttributeConstraints
              .getSingleJsonAttributeConstraints(jsonAttributeConstraintsName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonAttributeConstraintsApi#getSingleJsonAttributeConstraints");
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
| **jsonAttributeConstraintsName** | **String**| Name of the JSON Attribute Constraints | |

### Return type

[**JsonAttributeConstraintsResponse**](JsonAttributeConstraintsResponse.md)

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
| **404** | The JSON Attribute Constraints does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> JsonAttributeConstraintsResponse updateByName(jsonAttributeConstraintsName, updateRequest).execute();

Update an existing JSON Attribute Constraints by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JsonAttributeConstraintsApi;
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
    String jsonAttributeConstraintsName = "jsonAttributeConstraintsName_example"; // Name of the JSON Attribute Constraints
    try {
      JsonAttributeConstraintsResponse result = client
              .jsonAttributeConstraints
              .updateByName(operations, jsonAttributeConstraintsName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getAttributeType());
      System.out.println(result.getAllowUnnamedFields());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonAttributeConstraintsApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonAttributeConstraintsResponse> response = client
              .jsonAttributeConstraints
              .updateByName(operations, jsonAttributeConstraintsName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonAttributeConstraintsApi#updateByName");
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
| **jsonAttributeConstraintsName** | **String**| Name of the JSON Attribute Constraints | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing JSON Attribute Constraints | |

### Return type

[**JsonAttributeConstraintsResponse**](JsonAttributeConstraintsResponse.md)

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
| **404** | The JSON Attribute Constraints does not exist |  -  |


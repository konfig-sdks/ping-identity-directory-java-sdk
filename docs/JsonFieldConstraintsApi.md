# JsonFieldConstraintsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewField**](JsonFieldConstraintsApi.md#addNewField) | **POST** /json-attribute-constraints/{json-attribute-constraints-name}/json-field-constraints | Add a new JSON Field Constraints to the config |
| [**deleteFieldConstraints**](JsonFieldConstraintsApi.md#deleteFieldConstraints) | **DELETE** /json-attribute-constraints/{json-attribute-constraints-name}/json-field-constraints/{json-field-constraints-name} | Delete a JSON Field Constraints |
| [**getSingleFieldConstraints**](JsonFieldConstraintsApi.md#getSingleFieldConstraints) | **GET** /json-attribute-constraints/{json-attribute-constraints-name}/json-field-constraints/{json-field-constraints-name} | Returns a single JSON Field Constraints |
| [**listAllJsonFieldConstraints**](JsonFieldConstraintsApi.md#listAllJsonFieldConstraints) | **GET** /json-attribute-constraints/{json-attribute-constraints-name}/json-field-constraints | Returns a list of all JSON Field Constraints objects |
| [**updateByName**](JsonFieldConstraintsApi.md#updateByName) | **PATCH** /json-attribute-constraints/{json-attribute-constraints-name}/json-field-constraints/{json-field-constraints-name} | Update an existing JSON Field Constraints by name |


<a name="addNewField"></a>
# **addNewField**
> JsonFieldConstraintsResponse addNewField(jsonAttributeConstraintsName, addJsonFieldConstraintsRequest).execute();

Add a new JSON Field Constraints to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JsonFieldConstraintsApi;
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
    String jsonField = "jsonField_example"; // The full name of the JSON field to which these constraints apply.
    String jsonAttributeConstraintsName = "jsonAttributeConstraintsName_example"; // Name of the JSON Attribute Constraints
    String description = "description_example"; // A description for this JSON Field Constraints
    List<EnumjsonFieldConstraintsSchemaUrn> schemas = Arrays.asList();
    EnumjsonFieldConstraintsValueTypeProp valueType = EnumjsonFieldConstraintsValueTypeProp.fromValue("any");
    Boolean isRequired = true; // Indicates whether the target field must be present in JSON objects stored as values of the associated attribute type.
    EnumjsonFieldConstraintsIsArrayProp isArray = EnumjsonFieldConstraintsIsArrayProp.fromValue("required");
    Boolean allowNullValue = true; // Indicates whether the target field may have a value that is the JSON null value as an alternative to a value (or array of values) of the specified value-type.
    Boolean allowEmptyObject = true; // Indicates whether the target field may have a value that is an empty JSON object (i.e., a JSON object with zero fields). This may only be set to true if value-type property is set to object.
    Boolean indexValues = true; // Indicates whether backends that support JSON indexing should maintain an index for values of the target field.
    Integer indexEntryLimit = 56; // The maximum number of entries that may contain a particular value for the target field before the server will stop maintaining the index for that value.
    Boolean primeIndex = true; // Indicates whether backends that support database priming should load the contents of the associated JSON index into memory whenever the backend is opened.
    EnumjsonFieldConstraintsCacheModeProp cacheMode = EnumjsonFieldConstraintsCacheModeProp.fromValue("cache-keys-and-values");
    Boolean tokenizeValues = true; // Indicates whether the backend should attempt to assign a compact token for each distinct value for the target field in an attempt to reduce the encoded size of the field in JSON objects. These tokens would be assigned prior to using any from the token set used for automatic compaction of some JSON string values.
    List<String> allowedValue = Arrays.asList(); // Specifies an explicit set of string values that will be the only values permitted for the target field. If a set of allowed values is defined, then the server will reject any attempt to store a JSON object with a value for the target field that is not included in that set.
    List<String> allowedValueRegularExpression = Arrays.asList(); // Specifies an explicit set of regular expressions that may be used to restrict the set of values that may be used for the target field. If a set of allowed value regular expressions is defined, then the server will reject any attempt to store a JSON object with a value for the target field that does not match at least one of those regular expressions.
    String minimumNumericValue = "minimumNumericValue_example"; // Specifies the smallest numeric value that may be used as the value for the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is less than that minimum numeric value.
    String maximumNumericValue = "maximumNumericValue_example"; // Specifies the largest numeric value that may be used as the value for the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is greater than that maximum numeric value.
    Integer minimumValueLength = 56; // Specifies the smallest number of characters that may be present in string values of the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is shorter than that minimum value length.
    Integer maximumValueLength = 56; // Specifies the largest number of characters that may be present in string values of the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is longer than that maximum value length.
    Integer minimumValueCount = 56; // Specifies the smallest number of elements that may be present in an array of values for the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is an array with fewer than this number of elements.
    Integer maximumValueCount = 56; // Specifies the largest number of elements that may be present in an array of values for the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is an array with more than this number of elements.
    try {
      JsonFieldConstraintsResponse result = client
              .jsonFieldConstraints
              .addNewField(jsonField, jsonAttributeConstraintsName)
              .description(description)
              .schemas(schemas)
              .valueType(valueType)
              .isRequired(isRequired)
              .isArray(isArray)
              .allowNullValue(allowNullValue)
              .allowEmptyObject(allowEmptyObject)
              .indexValues(indexValues)
              .indexEntryLimit(indexEntryLimit)
              .primeIndex(primeIndex)
              .cacheMode(cacheMode)
              .tokenizeValues(tokenizeValues)
              .allowedValue(allowedValue)
              .allowedValueRegularExpression(allowedValueRegularExpression)
              .minimumNumericValue(minimumNumericValue)
              .maximumNumericValue(maximumNumericValue)
              .minimumValueLength(minimumValueLength)
              .maximumValueLength(maximumValueLength)
              .minimumValueCount(minimumValueCount)
              .maximumValueCount(maximumValueCount)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getJsonField());
      System.out.println(result.getValueType());
      System.out.println(result.getIsRequired());
      System.out.println(result.getIsArray());
      System.out.println(result.getAllowNullValue());
      System.out.println(result.getAllowEmptyObject());
      System.out.println(result.getIndexValues());
      System.out.println(result.getIndexEntryLimit());
      System.out.println(result.getPrimeIndex());
      System.out.println(result.getCacheMode());
      System.out.println(result.getTokenizeValues());
      System.out.println(result.getAllowedValue());
      System.out.println(result.getAllowedValueRegularExpression());
      System.out.println(result.getMinimumNumericValue());
      System.out.println(result.getMaximumNumericValue());
      System.out.println(result.getMinimumValueLength());
      System.out.println(result.getMaximumValueLength());
      System.out.println(result.getMinimumValueCount());
      System.out.println(result.getMaximumValueCount());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonFieldConstraintsApi#addNewField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonFieldConstraintsResponse> response = client
              .jsonFieldConstraints
              .addNewField(jsonField, jsonAttributeConstraintsName)
              .description(description)
              .schemas(schemas)
              .valueType(valueType)
              .isRequired(isRequired)
              .isArray(isArray)
              .allowNullValue(allowNullValue)
              .allowEmptyObject(allowEmptyObject)
              .indexValues(indexValues)
              .indexEntryLimit(indexEntryLimit)
              .primeIndex(primeIndex)
              .cacheMode(cacheMode)
              .tokenizeValues(tokenizeValues)
              .allowedValue(allowedValue)
              .allowedValueRegularExpression(allowedValueRegularExpression)
              .minimumNumericValue(minimumNumericValue)
              .maximumNumericValue(maximumNumericValue)
              .minimumValueLength(minimumValueLength)
              .maximumValueLength(maximumValueLength)
              .minimumValueCount(minimumValueCount)
              .maximumValueCount(maximumValueCount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonFieldConstraintsApi#addNewField");
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
| **addJsonFieldConstraintsRequest** | [**AddJsonFieldConstraintsRequest**](AddJsonFieldConstraintsRequest.md)| Create a new JSON Field Constraints in the config | |

### Return type

[**JsonFieldConstraintsResponse**](JsonFieldConstraintsResponse.md)

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
| **409** | The JSON Field Constraints already exists |  -  |

<a name="deleteFieldConstraints"></a>
# **deleteFieldConstraints**
> deleteFieldConstraints(jsonFieldConstraintsName, jsonAttributeConstraintsName).execute();

Delete a JSON Field Constraints

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JsonFieldConstraintsApi;
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
    String jsonFieldConstraintsName = "jsonFieldConstraintsName_example"; // Name of the JSON Field Constraints
    String jsonAttributeConstraintsName = "jsonAttributeConstraintsName_example"; // Name of the JSON Attribute Constraints
    try {
      client
              .jsonFieldConstraints
              .deleteFieldConstraints(jsonFieldConstraintsName, jsonAttributeConstraintsName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonFieldConstraintsApi#deleteFieldConstraints");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .jsonFieldConstraints
              .deleteFieldConstraints(jsonFieldConstraintsName, jsonAttributeConstraintsName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonFieldConstraintsApi#deleteFieldConstraints");
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
| **jsonFieldConstraintsName** | **String**| Name of the JSON Field Constraints | |
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
| **404** | The JSON Field Constraints does not exist |  -  |
| **409** | The JSON Field Constraints cannot be deleted |  -  |

<a name="getSingleFieldConstraints"></a>
# **getSingleFieldConstraints**
> JsonFieldConstraintsResponse getSingleFieldConstraints(jsonFieldConstraintsName, jsonAttributeConstraintsName).execute();

Returns a single JSON Field Constraints

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JsonFieldConstraintsApi;
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
    String jsonFieldConstraintsName = "jsonFieldConstraintsName_example"; // Name of the JSON Field Constraints
    String jsonAttributeConstraintsName = "jsonAttributeConstraintsName_example"; // Name of the JSON Attribute Constraints
    try {
      JsonFieldConstraintsResponse result = client
              .jsonFieldConstraints
              .getSingleFieldConstraints(jsonFieldConstraintsName, jsonAttributeConstraintsName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getJsonField());
      System.out.println(result.getValueType());
      System.out.println(result.getIsRequired());
      System.out.println(result.getIsArray());
      System.out.println(result.getAllowNullValue());
      System.out.println(result.getAllowEmptyObject());
      System.out.println(result.getIndexValues());
      System.out.println(result.getIndexEntryLimit());
      System.out.println(result.getPrimeIndex());
      System.out.println(result.getCacheMode());
      System.out.println(result.getTokenizeValues());
      System.out.println(result.getAllowedValue());
      System.out.println(result.getAllowedValueRegularExpression());
      System.out.println(result.getMinimumNumericValue());
      System.out.println(result.getMaximumNumericValue());
      System.out.println(result.getMinimumValueLength());
      System.out.println(result.getMaximumValueLength());
      System.out.println(result.getMinimumValueCount());
      System.out.println(result.getMaximumValueCount());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonFieldConstraintsApi#getSingleFieldConstraints");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonFieldConstraintsResponse> response = client
              .jsonFieldConstraints
              .getSingleFieldConstraints(jsonFieldConstraintsName, jsonAttributeConstraintsName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonFieldConstraintsApi#getSingleFieldConstraints");
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
| **jsonFieldConstraintsName** | **String**| Name of the JSON Field Constraints | |
| **jsonAttributeConstraintsName** | **String**| Name of the JSON Attribute Constraints | |

### Return type

[**JsonFieldConstraintsResponse**](JsonFieldConstraintsResponse.md)

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
| **404** | The JSON Field Constraints does not exist |  -  |

<a name="listAllJsonFieldConstraints"></a>
# **listAllJsonFieldConstraints**
> JsonFieldConstraintsListResponse listAllJsonFieldConstraints(jsonAttributeConstraintsName).filter(filter).execute();

Returns a list of all JSON Field Constraints objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JsonFieldConstraintsApi;
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
    String filter = "filter_example"; // SCIM filter
    try {
      JsonFieldConstraintsListResponse result = client
              .jsonFieldConstraints
              .listAllJsonFieldConstraints(jsonAttributeConstraintsName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonFieldConstraintsApi#listAllJsonFieldConstraints");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonFieldConstraintsListResponse> response = client
              .jsonFieldConstraints
              .listAllJsonFieldConstraints(jsonAttributeConstraintsName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonFieldConstraintsApi#listAllJsonFieldConstraints");
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
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**JsonFieldConstraintsListResponse**](JsonFieldConstraintsListResponse.md)

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
> JsonFieldConstraintsResponse updateByName(jsonFieldConstraintsName, jsonAttributeConstraintsName, updateRequest).execute();

Update an existing JSON Field Constraints by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JsonFieldConstraintsApi;
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
    String jsonFieldConstraintsName = "jsonFieldConstraintsName_example"; // Name of the JSON Field Constraints
    String jsonAttributeConstraintsName = "jsonAttributeConstraintsName_example"; // Name of the JSON Attribute Constraints
    try {
      JsonFieldConstraintsResponse result = client
              .jsonFieldConstraints
              .updateByName(operations, jsonFieldConstraintsName, jsonAttributeConstraintsName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getJsonField());
      System.out.println(result.getValueType());
      System.out.println(result.getIsRequired());
      System.out.println(result.getIsArray());
      System.out.println(result.getAllowNullValue());
      System.out.println(result.getAllowEmptyObject());
      System.out.println(result.getIndexValues());
      System.out.println(result.getIndexEntryLimit());
      System.out.println(result.getPrimeIndex());
      System.out.println(result.getCacheMode());
      System.out.println(result.getTokenizeValues());
      System.out.println(result.getAllowedValue());
      System.out.println(result.getAllowedValueRegularExpression());
      System.out.println(result.getMinimumNumericValue());
      System.out.println(result.getMaximumNumericValue());
      System.out.println(result.getMinimumValueLength());
      System.out.println(result.getMaximumValueLength());
      System.out.println(result.getMinimumValueCount());
      System.out.println(result.getMaximumValueCount());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonFieldConstraintsApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonFieldConstraintsResponse> response = client
              .jsonFieldConstraints
              .updateByName(operations, jsonFieldConstraintsName, jsonAttributeConstraintsName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JsonFieldConstraintsApi#updateByName");
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
| **jsonFieldConstraintsName** | **String**| Name of the JSON Field Constraints | |
| **jsonAttributeConstraintsName** | **String**| Name of the JSON Attribute Constraints | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing JSON Field Constraints | |

### Return type

[**JsonFieldConstraintsResponse**](JsonFieldConstraintsResponse.md)

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
| **404** | The JSON Field Constraints does not exist |  -  |


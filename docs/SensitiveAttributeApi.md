# SensitiveAttributeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewConfig**](SensitiveAttributeApi.md#addNewConfig) | **POST** /sensitive-attributes | Add a new Sensitive Attribute to the config |
| [**deleteSensitiveAttribute**](SensitiveAttributeApi.md#deleteSensitiveAttribute) | **DELETE** /sensitive-attributes/{sensitive-attribute-name} | Delete a Sensitive Attribute |
| [**getAll**](SensitiveAttributeApi.md#getAll) | **GET** /sensitive-attributes | Returns a list of all Sensitive Attribute objects |
| [**getSingle**](SensitiveAttributeApi.md#getSingle) | **GET** /sensitive-attributes/{sensitive-attribute-name} | Returns a single Sensitive Attribute |
| [**updateByName**](SensitiveAttributeApi.md#updateByName) | **PATCH** /sensitive-attributes/{sensitive-attribute-name} | Update an existing Sensitive Attribute by name |


<a name="addNewConfig"></a>
# **addNewConfig**
> SensitiveAttributeResponse addNewConfig(addSensitiveAttributeRequest).execute();

Add a new Sensitive Attribute to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SensitiveAttributeApi;
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
    String attributeName = "attributeName_example"; // Name of the new Sensitive Attribute
    String description = "description_example"; // A description for this Sensitive Attribute
    List<EnumsensitiveAttributeSchemaUrn> schemas = Arrays.asList();
    List<String> attributeType = Arrays.asList(); // The name(s) or OID(s) of the attribute types for attributes whose values may be considered sensitive.
    Boolean includeDefaultSensitiveOperationalAttributes = true; // Indicates whether to automatically include any server-generated operational attributes that may contain sensitive data.
    EnumsensitiveAttributeAllowInReturnedEntriesProp allowInReturnedEntries = EnumsensitiveAttributeAllowInReturnedEntriesProp.fromValue("allow");
    EnumsensitiveAttributeAllowInFilterProp allowInFilter = EnumsensitiveAttributeAllowInFilterProp.fromValue("allow");
    EnumsensitiveAttributeAllowInAddProp allowInAdd = EnumsensitiveAttributeAllowInAddProp.fromValue("allow");
    EnumsensitiveAttributeAllowInCompareProp allowInCompare = EnumsensitiveAttributeAllowInCompareProp.fromValue("allow");
    EnumsensitiveAttributeAllowInModifyProp allowInModify = EnumsensitiveAttributeAllowInModifyProp.fromValue("allow");
    try {
      SensitiveAttributeResponse result = client
              .sensitiveAttribute
              .addNewConfig(attributeName)
              .description(description)
              .schemas(schemas)
              .attributeType(attributeType)
              .includeDefaultSensitiveOperationalAttributes(includeDefaultSensitiveOperationalAttributes)
              .allowInReturnedEntries(allowInReturnedEntries)
              .allowInFilter(allowInFilter)
              .allowInAdd(allowInAdd)
              .allowInCompare(allowInCompare)
              .allowInModify(allowInModify)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getAttributeType());
      System.out.println(result.getIncludeDefaultSensitiveOperationalAttributes());
      System.out.println(result.getAllowInReturnedEntries());
      System.out.println(result.getAllowInFilter());
      System.out.println(result.getAllowInAdd());
      System.out.println(result.getAllowInCompare());
      System.out.println(result.getAllowInModify());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveAttributeApi#addNewConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SensitiveAttributeResponse> response = client
              .sensitiveAttribute
              .addNewConfig(attributeName)
              .description(description)
              .schemas(schemas)
              .attributeType(attributeType)
              .includeDefaultSensitiveOperationalAttributes(includeDefaultSensitiveOperationalAttributes)
              .allowInReturnedEntries(allowInReturnedEntries)
              .allowInFilter(allowInFilter)
              .allowInAdd(allowInAdd)
              .allowInCompare(allowInCompare)
              .allowInModify(allowInModify)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveAttributeApi#addNewConfig");
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
| **addSensitiveAttributeRequest** | [**AddSensitiveAttributeRequest**](AddSensitiveAttributeRequest.md)| Create a new Sensitive Attribute in the config | |

### Return type

[**SensitiveAttributeResponse**](SensitiveAttributeResponse.md)

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
| **409** | The Sensitive Attribute already exists |  -  |

<a name="deleteSensitiveAttribute"></a>
# **deleteSensitiveAttribute**
> deleteSensitiveAttribute(sensitiveAttributeName).execute();

Delete a Sensitive Attribute

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SensitiveAttributeApi;
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
    String sensitiveAttributeName = "sensitiveAttributeName_example"; // Name of the Sensitive Attribute
    try {
      client
              .sensitiveAttribute
              .deleteSensitiveAttribute(sensitiveAttributeName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveAttributeApi#deleteSensitiveAttribute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .sensitiveAttribute
              .deleteSensitiveAttribute(sensitiveAttributeName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveAttributeApi#deleteSensitiveAttribute");
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
| **sensitiveAttributeName** | **String**| Name of the Sensitive Attribute | |

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
| **404** | The Sensitive Attribute does not exist |  -  |
| **409** | The Sensitive Attribute cannot be deleted |  -  |

<a name="getAll"></a>
# **getAll**
> SensitiveAttributeListResponse getAll().filter(filter).execute();

Returns a list of all Sensitive Attribute objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SensitiveAttributeApi;
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
      SensitiveAttributeListResponse result = client
              .sensitiveAttribute
              .getAll()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveAttributeApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SensitiveAttributeListResponse> response = client
              .sensitiveAttribute
              .getAll()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveAttributeApi#getAll");
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

[**SensitiveAttributeListResponse**](SensitiveAttributeListResponse.md)

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

<a name="getSingle"></a>
# **getSingle**
> SensitiveAttributeResponse getSingle(sensitiveAttributeName).execute();

Returns a single Sensitive Attribute

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SensitiveAttributeApi;
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
    String sensitiveAttributeName = "sensitiveAttributeName_example"; // Name of the Sensitive Attribute
    try {
      SensitiveAttributeResponse result = client
              .sensitiveAttribute
              .getSingle(sensitiveAttributeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getAttributeType());
      System.out.println(result.getIncludeDefaultSensitiveOperationalAttributes());
      System.out.println(result.getAllowInReturnedEntries());
      System.out.println(result.getAllowInFilter());
      System.out.println(result.getAllowInAdd());
      System.out.println(result.getAllowInCompare());
      System.out.println(result.getAllowInModify());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveAttributeApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SensitiveAttributeResponse> response = client
              .sensitiveAttribute
              .getSingle(sensitiveAttributeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveAttributeApi#getSingle");
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
| **sensitiveAttributeName** | **String**| Name of the Sensitive Attribute | |

### Return type

[**SensitiveAttributeResponse**](SensitiveAttributeResponse.md)

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
| **404** | The Sensitive Attribute does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> SensitiveAttributeResponse updateByName(sensitiveAttributeName, updateRequest).execute();

Update an existing Sensitive Attribute by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SensitiveAttributeApi;
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
    String sensitiveAttributeName = "sensitiveAttributeName_example"; // Name of the Sensitive Attribute
    try {
      SensitiveAttributeResponse result = client
              .sensitiveAttribute
              .updateByName(operations, sensitiveAttributeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getAttributeType());
      System.out.println(result.getIncludeDefaultSensitiveOperationalAttributes());
      System.out.println(result.getAllowInReturnedEntries());
      System.out.println(result.getAllowInFilter());
      System.out.println(result.getAllowInAdd());
      System.out.println(result.getAllowInCompare());
      System.out.println(result.getAllowInModify());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveAttributeApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SensitiveAttributeResponse> response = client
              .sensitiveAttribute
              .updateByName(operations, sensitiveAttributeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveAttributeApi#updateByName");
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
| **sensitiveAttributeName** | **String**| Name of the Sensitive Attribute | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Sensitive Attribute | |

### Return type

[**SensitiveAttributeResponse**](SensitiveAttributeResponse.md)

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
| **404** | The Sensitive Attribute does not exist |  -  |


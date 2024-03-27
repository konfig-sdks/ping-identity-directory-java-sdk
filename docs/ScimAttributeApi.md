# ScimAttributeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewAttribute**](ScimAttributeApi.md#addNewAttribute) | **POST** /scim-schemas/{scim-schema-name}/scim-attributes | Add a new SCIM Attribute to the config |
| [**deleteAttribute**](ScimAttributeApi.md#deleteAttribute) | **DELETE** /scim-schemas/{scim-schema-name}/scim-attributes/{scim-attribute-name} | Delete a SCIM Attribute |
| [**getSingleAttribute**](ScimAttributeApi.md#getSingleAttribute) | **GET** /scim-schemas/{scim-schema-name}/scim-attributes/{scim-attribute-name} | Returns a single SCIM Attribute |
| [**listAllAttributes**](ScimAttributeApi.md#listAllAttributes) | **GET** /scim-schemas/{scim-schema-name}/scim-attributes | Returns a list of all SCIM Attribute objects |
| [**updateByName**](ScimAttributeApi.md#updateByName) | **PATCH** /scim-schemas/{scim-schema-name}/scim-attributes/{scim-attribute-name} | Update an existing SCIM Attribute by name |


<a name="addNewAttribute"></a>
# **addNewAttribute**
> ScimAttributeResponse addNewAttribute(scimSchemaName, addScimAttributeRequest).execute();

Add a new SCIM Attribute to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimAttributeApi;
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
    String attributeName = "attributeName_example"; // Name of the new SCIM Attribute
    String scimSchemaName = "scimSchemaName_example"; // Name of the SCIM Schema
    String description = "description_example"; // A description for this SCIM Attribute
    List<EnumscimAttributeSchemaUrn> schemas = Arrays.asList();
    String name = "name_example"; // The name of the attribute.
    EnumscimAttributeTypeProp type = EnumscimAttributeTypeProp.fromValue("string");
    Boolean required = true; // Specifies whether this attribute is required.
    Boolean caseExact = true; // Specifies whether the attribute values are case sensitive.
    Boolean multiValued = true; // Specifies whether this attribute may have multiple values.
    List<String> canonicalValue = Arrays.asList(); // Specifies the suggested canonical type values for the attribute.
    EnumscimAttributeMutabilityProp mutability = EnumscimAttributeMutabilityProp.fromValue("read-only");
    EnumscimAttributeReturnedProp returned = EnumscimAttributeReturnedProp.fromValue("by-default");
    List<String> referenceType = Arrays.asList(); // Specifies the SCIM resource types that may be referenced. This property is only applicable for attributes that are of type 'reference'. Valid values are: A SCIM resource type (e.g., 'User' or 'Group'), 'external' - indicating the resource is an external resource (e.g., such as a photo), or 'uri' - indicating that the reference is to a service endpoint or an identifier (such as a schema urn).
    try {
      ScimAttributeResponse result = client
              .scimAttribute
              .addNewAttribute(attributeName, scimSchemaName)
              .description(description)
              .schemas(schemas)
              .name(name)
              .type(type)
              .required(required)
              .caseExact(caseExact)
              .multiValued(multiValued)
              .canonicalValue(canonicalValue)
              .mutability(mutability)
              .returned(returned)
              .referenceType(referenceType)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getRequired());
      System.out.println(result.getCaseExact());
      System.out.println(result.getMultiValued());
      System.out.println(result.getCanonicalValue());
      System.out.println(result.getMutability());
      System.out.println(result.getReturned());
      System.out.println(result.getReferenceType());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeApi#addNewAttribute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimAttributeResponse> response = client
              .scimAttribute
              .addNewAttribute(attributeName, scimSchemaName)
              .description(description)
              .schemas(schemas)
              .name(name)
              .type(type)
              .required(required)
              .caseExact(caseExact)
              .multiValued(multiValued)
              .canonicalValue(canonicalValue)
              .mutability(mutability)
              .returned(returned)
              .referenceType(referenceType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeApi#addNewAttribute");
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
| **scimSchemaName** | **String**| Name of the SCIM Schema | |
| **addScimAttributeRequest** | [**AddScimAttributeRequest**](AddScimAttributeRequest.md)| Create a new SCIM Attribute in the config | |

### Return type

[**ScimAttributeResponse**](ScimAttributeResponse.md)

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
| **409** | The SCIM Attribute already exists |  -  |

<a name="deleteAttribute"></a>
# **deleteAttribute**
> deleteAttribute(scimAttributeName, scimSchemaName).execute();

Delete a SCIM Attribute

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimAttributeApi;
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
    String scimAttributeName = "scimAttributeName_example"; // Name of the SCIM Attribute
    String scimSchemaName = "scimSchemaName_example"; // Name of the SCIM Schema
    try {
      client
              .scimAttribute
              .deleteAttribute(scimAttributeName, scimSchemaName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeApi#deleteAttribute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .scimAttribute
              .deleteAttribute(scimAttributeName, scimSchemaName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeApi#deleteAttribute");
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
| **scimAttributeName** | **String**| Name of the SCIM Attribute | |
| **scimSchemaName** | **String**| Name of the SCIM Schema | |

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
| **404** | The SCIM Attribute does not exist |  -  |
| **409** | The SCIM Attribute cannot be deleted |  -  |

<a name="getSingleAttribute"></a>
# **getSingleAttribute**
> ScimAttributeResponse getSingleAttribute(scimAttributeName, scimSchemaName).execute();

Returns a single SCIM Attribute

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimAttributeApi;
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
    String scimAttributeName = "scimAttributeName_example"; // Name of the SCIM Attribute
    String scimSchemaName = "scimSchemaName_example"; // Name of the SCIM Schema
    try {
      ScimAttributeResponse result = client
              .scimAttribute
              .getSingleAttribute(scimAttributeName, scimSchemaName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getRequired());
      System.out.println(result.getCaseExact());
      System.out.println(result.getMultiValued());
      System.out.println(result.getCanonicalValue());
      System.out.println(result.getMutability());
      System.out.println(result.getReturned());
      System.out.println(result.getReferenceType());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeApi#getSingleAttribute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimAttributeResponse> response = client
              .scimAttribute
              .getSingleAttribute(scimAttributeName, scimSchemaName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeApi#getSingleAttribute");
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
| **scimAttributeName** | **String**| Name of the SCIM Attribute | |
| **scimSchemaName** | **String**| Name of the SCIM Schema | |

### Return type

[**ScimAttributeResponse**](ScimAttributeResponse.md)

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
| **404** | The SCIM Attribute does not exist |  -  |

<a name="listAllAttributes"></a>
# **listAllAttributes**
> ScimAttributeListResponse listAllAttributes(scimSchemaName).filter(filter).execute();

Returns a list of all SCIM Attribute objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimAttributeApi;
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
    String scimSchemaName = "scimSchemaName_example"; // Name of the SCIM Schema
    String filter = "filter_example"; // SCIM filter
    try {
      ScimAttributeListResponse result = client
              .scimAttribute
              .listAllAttributes(scimSchemaName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeApi#listAllAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimAttributeListResponse> response = client
              .scimAttribute
              .listAllAttributes(scimSchemaName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeApi#listAllAttributes");
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
| **scimSchemaName** | **String**| Name of the SCIM Schema | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**ScimAttributeListResponse**](ScimAttributeListResponse.md)

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
> ScimAttributeResponse updateByName(scimAttributeName, scimSchemaName, updateRequest).execute();

Update an existing SCIM Attribute by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimAttributeApi;
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
    String scimAttributeName = "scimAttributeName_example"; // Name of the SCIM Attribute
    String scimSchemaName = "scimSchemaName_example"; // Name of the SCIM Schema
    try {
      ScimAttributeResponse result = client
              .scimAttribute
              .updateByName(operations, scimAttributeName, scimSchemaName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getRequired());
      System.out.println(result.getCaseExact());
      System.out.println(result.getMultiValued());
      System.out.println(result.getCanonicalValue());
      System.out.println(result.getMutability());
      System.out.println(result.getReturned());
      System.out.println(result.getReferenceType());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimAttributeResponse> response = client
              .scimAttribute
              .updateByName(operations, scimAttributeName, scimSchemaName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeApi#updateByName");
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
| **scimAttributeName** | **String**| Name of the SCIM Attribute | |
| **scimSchemaName** | **String**| Name of the SCIM Schema | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing SCIM Attribute | |

### Return type

[**ScimAttributeResponse**](ScimAttributeResponse.md)

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
| **404** | The SCIM Attribute does not exist |  -  |


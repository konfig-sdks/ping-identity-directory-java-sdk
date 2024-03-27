# ScimSubattributeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewConfig**](ScimSubattributeApi.md#addNewConfig) | **POST** /scim-schemas/{scim-schema-name}/scim-attributes/{scim-attribute-name}/scim-subattributes | Add a new SCIM Subattribute to the config |
| [**deleteSubattribute**](ScimSubattributeApi.md#deleteSubattribute) | **DELETE** /scim-schemas/{scim-schema-name}/scim-attributes/{scim-attribute-name}/scim-subattributes/{scim-subattribute-name} | Delete a SCIM Subattribute |
| [**getSingleSubattribute**](ScimSubattributeApi.md#getSingleSubattribute) | **GET** /scim-schemas/{scim-schema-name}/scim-attributes/{scim-attribute-name}/scim-subattributes/{scim-subattribute-name} | Returns a single SCIM Subattribute |
| [**listAllSubattributes**](ScimSubattributeApi.md#listAllSubattributes) | **GET** /scim-schemas/{scim-schema-name}/scim-attributes/{scim-attribute-name}/scim-subattributes | Returns a list of all SCIM Subattribute objects |
| [**updateByName**](ScimSubattributeApi.md#updateByName) | **PATCH** /scim-schemas/{scim-schema-name}/scim-attributes/{scim-attribute-name}/scim-subattributes/{scim-subattribute-name} | Update an existing SCIM Subattribute by name |


<a name="addNewConfig"></a>
# **addNewConfig**
> ScimSubattributeResponse addNewConfig(scimAttributeName, scimSchemaName, addScimSubattributeRequest).execute();

Add a new SCIM Subattribute to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimSubattributeApi;
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
    String subattributeName = "subattributeName_example"; // Name of the new SCIM Subattribute
    String scimAttributeName = "scimAttributeName_example"; // Name of the SCIM Attribute
    String scimSchemaName = "scimSchemaName_example"; // Name of the SCIM Schema
    String description = "description_example"; // A description for this SCIM Subattribute
    List<EnumscimSubattributeSchemaUrn> schemas = Arrays.asList();
    EnumscimSubattributeTypeProp type = EnumscimSubattributeTypeProp.fromValue("string");
    Boolean required = true; // Specifies whether this sub-attribute is required.
    Boolean caseExact = true; // Specifies whether the sub-attribute values are case sensitive.
    Boolean multiValued = true; // Specifies whether this attribute may have multiple values.
    List<String> canonicalValue = Arrays.asList(); // Specifies the suggested canonical type values for the sub-attribute.
    EnumscimSubattributeMutabilityProp mutability = EnumscimSubattributeMutabilityProp.fromValue("read-only");
    EnumscimSubattributeReturnedProp returned = EnumscimSubattributeReturnedProp.fromValue("by-default");
    List<String> referenceType = Arrays.asList(); // Specifies the SCIM resource types that may be referenced. This property is only applicable for sub-attributes that are of type 'reference'. Valid values are: A SCIM resource type (e.g., 'User' or 'Group'), 'external' - indicating the resource is an external resource (e.g., such as a photo), or 'uri' - indicating that the reference is to a service endpoint or an identifier (such as a schema urn).
    try {
      ScimSubattributeResponse result = client
              .scimSubattribute
              .addNewConfig(subattributeName, scimAttributeName, scimSchemaName)
              .description(description)
              .schemas(schemas)
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
      System.err.println("Exception when calling ScimSubattributeApi#addNewConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimSubattributeResponse> response = client
              .scimSubattribute
              .addNewConfig(subattributeName, scimAttributeName, scimSchemaName)
              .description(description)
              .schemas(schemas)
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
      System.err.println("Exception when calling ScimSubattributeApi#addNewConfig");
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
| **addScimSubattributeRequest** | [**AddScimSubattributeRequest**](AddScimSubattributeRequest.md)| Create a new SCIM Subattribute in the config | |

### Return type

[**ScimSubattributeResponse**](ScimSubattributeResponse.md)

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
| **409** | The SCIM Subattribute already exists |  -  |

<a name="deleteSubattribute"></a>
# **deleteSubattribute**
> deleteSubattribute(scimSubattributeName, scimAttributeName, scimSchemaName).execute();

Delete a SCIM Subattribute

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimSubattributeApi;
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
    String scimSubattributeName = "scimSubattributeName_example"; // Name of the SCIM Subattribute
    String scimAttributeName = "scimAttributeName_example"; // Name of the SCIM Attribute
    String scimSchemaName = "scimSchemaName_example"; // Name of the SCIM Schema
    try {
      client
              .scimSubattribute
              .deleteSubattribute(scimSubattributeName, scimAttributeName, scimSchemaName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimSubattributeApi#deleteSubattribute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .scimSubattribute
              .deleteSubattribute(scimSubattributeName, scimAttributeName, scimSchemaName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimSubattributeApi#deleteSubattribute");
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
| **scimSubattributeName** | **String**| Name of the SCIM Subattribute | |
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
| **404** | The SCIM Subattribute does not exist |  -  |
| **409** | The SCIM Subattribute cannot be deleted |  -  |

<a name="getSingleSubattribute"></a>
# **getSingleSubattribute**
> ScimSubattributeResponse getSingleSubattribute(scimSubattributeName, scimAttributeName, scimSchemaName).execute();

Returns a single SCIM Subattribute

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimSubattributeApi;
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
    String scimSubattributeName = "scimSubattributeName_example"; // Name of the SCIM Subattribute
    String scimAttributeName = "scimAttributeName_example"; // Name of the SCIM Attribute
    String scimSchemaName = "scimSchemaName_example"; // Name of the SCIM Schema
    try {
      ScimSubattributeResponse result = client
              .scimSubattribute
              .getSingleSubattribute(scimSubattributeName, scimAttributeName, scimSchemaName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
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
      System.err.println("Exception when calling ScimSubattributeApi#getSingleSubattribute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimSubattributeResponse> response = client
              .scimSubattribute
              .getSingleSubattribute(scimSubattributeName, scimAttributeName, scimSchemaName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimSubattributeApi#getSingleSubattribute");
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
| **scimSubattributeName** | **String**| Name of the SCIM Subattribute | |
| **scimAttributeName** | **String**| Name of the SCIM Attribute | |
| **scimSchemaName** | **String**| Name of the SCIM Schema | |

### Return type

[**ScimSubattributeResponse**](ScimSubattributeResponse.md)

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
| **404** | The SCIM Subattribute does not exist |  -  |

<a name="listAllSubattributes"></a>
# **listAllSubattributes**
> ScimSubattributeListResponse listAllSubattributes(scimAttributeName, scimSchemaName).filter(filter).execute();

Returns a list of all SCIM Subattribute objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimSubattributeApi;
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
    String filter = "filter_example"; // SCIM filter
    try {
      ScimSubattributeListResponse result = client
              .scimSubattribute
              .listAllSubattributes(scimAttributeName, scimSchemaName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimSubattributeApi#listAllSubattributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimSubattributeListResponse> response = client
              .scimSubattribute
              .listAllSubattributes(scimAttributeName, scimSchemaName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimSubattributeApi#listAllSubattributes");
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
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**ScimSubattributeListResponse**](ScimSubattributeListResponse.md)

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
> ScimSubattributeResponse updateByName(scimSubattributeName, scimAttributeName, scimSchemaName, updateRequest).execute();

Update an existing SCIM Subattribute by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimSubattributeApi;
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
    String scimSubattributeName = "scimSubattributeName_example"; // Name of the SCIM Subattribute
    String scimAttributeName = "scimAttributeName_example"; // Name of the SCIM Attribute
    String scimSchemaName = "scimSchemaName_example"; // Name of the SCIM Schema
    try {
      ScimSubattributeResponse result = client
              .scimSubattribute
              .updateByName(operations, scimSubattributeName, scimAttributeName, scimSchemaName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
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
      System.err.println("Exception when calling ScimSubattributeApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimSubattributeResponse> response = client
              .scimSubattribute
              .updateByName(operations, scimSubattributeName, scimAttributeName, scimSchemaName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimSubattributeApi#updateByName");
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
| **scimSubattributeName** | **String**| Name of the SCIM Subattribute | |
| **scimAttributeName** | **String**| Name of the SCIM Attribute | |
| **scimSchemaName** | **String**| Name of the SCIM Schema | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing SCIM Subattribute | |

### Return type

[**ScimSubattributeResponse**](ScimSubattributeResponse.md)

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
| **404** | The SCIM Subattribute does not exist |  -  |


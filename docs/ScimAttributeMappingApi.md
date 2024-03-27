# ScimAttributeMappingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewMapping**](ScimAttributeMappingApi.md#addNewMapping) | **POST** /scim-resource-types/{scim-resource-type-name}/scim-attribute-mappings | Add a new SCIM Attribute Mapping to the config |
| [**deleteMapping**](ScimAttributeMappingApi.md#deleteMapping) | **DELETE** /scim-resource-types/{scim-resource-type-name}/scim-attribute-mappings/{scim-attribute-mapping-name} | Delete a SCIM Attribute Mapping |
| [**getAllMappings**](ScimAttributeMappingApi.md#getAllMappings) | **GET** /scim-resource-types/{scim-resource-type-name}/scim-attribute-mappings | Returns a list of all SCIM Attribute Mapping objects |
| [**getSingleScimAttributeMapping**](ScimAttributeMappingApi.md#getSingleScimAttributeMapping) | **GET** /scim-resource-types/{scim-resource-type-name}/scim-attribute-mappings/{scim-attribute-mapping-name} | Returns a single SCIM Attribute Mapping |
| [**updateByName**](ScimAttributeMappingApi.md#updateByName) | **PATCH** /scim-resource-types/{scim-resource-type-name}/scim-attribute-mappings/{scim-attribute-mapping-name} | Update an existing SCIM Attribute Mapping by name |


<a name="addNewMapping"></a>
# **addNewMapping**
> ScimAttributeMappingResponse addNewMapping(scimResourceTypeName, addScimAttributeMappingRequest).execute();

Add a new SCIM Attribute Mapping to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimAttributeMappingApi;
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
    String mappingName = "mappingName_example"; // Name of the new SCIM Attribute Mapping
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    List<EnumscimAttributeMappingSchemaUrn> schemas = Arrays.asList();
    String correlatedLDAPDataView = "correlatedLDAPDataView_example"; // The Correlated LDAP Data View that persists the mapped SCIM Resource Type attribute(s).
    String scimResourceTypeAttribute = "scimResourceTypeAttribute_example"; // The attribute path of SCIM Resource Type attributes to be mapped.
    String ldapAttribute = "ldapAttribute_example"; // The LDAP attribute to be mapped, or the path to a specific field of an LDAP attribute with the JSON object attribute syntax.
    Boolean readable = true; // Specifies whether the mapping is used to map from LDAP attribute to SCIM Resource Type attribute in a read operation.
    Boolean writable = true; // Specifies that the mapping is used to map from SCIM Resource Type attribute to LDAP attribute in a write operation.
    Boolean searchable = true; // Specifies that the mapping is used to map from SCIM Resource Type attribute to LDAP attribute in a search filter.
    Boolean authoritative = true; // Specifies that the mapping is authoritative over other mappings for the same SCIM Resource Type attribute (for read operations).
    try {
      ScimAttributeMappingResponse result = client
              .scimAttributeMapping
              .addNewMapping(mappingName, scimResourceTypeName)
              .schemas(schemas)
              .correlatedLDAPDataView(correlatedLDAPDataView)
              .scimResourceTypeAttribute(scimResourceTypeAttribute)
              .ldapAttribute(ldapAttribute)
              .readable(readable)
              .writable(writable)
              .searchable(searchable)
              .authoritative(authoritative)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getCorrelatedLDAPDataView());
      System.out.println(result.getScimResourceTypeAttribute());
      System.out.println(result.getLdapAttribute());
      System.out.println(result.getReadable());
      System.out.println(result.getWritable());
      System.out.println(result.getSearchable());
      System.out.println(result.getAuthoritative());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeMappingApi#addNewMapping");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimAttributeMappingResponse> response = client
              .scimAttributeMapping
              .addNewMapping(mappingName, scimResourceTypeName)
              .schemas(schemas)
              .correlatedLDAPDataView(correlatedLDAPDataView)
              .scimResourceTypeAttribute(scimResourceTypeAttribute)
              .ldapAttribute(ldapAttribute)
              .readable(readable)
              .writable(writable)
              .searchable(searchable)
              .authoritative(authoritative)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeMappingApi#addNewMapping");
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
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |
| **addScimAttributeMappingRequest** | [**AddScimAttributeMappingRequest**](AddScimAttributeMappingRequest.md)| Create a new SCIM Attribute Mapping in the config | |

### Return type

[**ScimAttributeMappingResponse**](ScimAttributeMappingResponse.md)

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
| **409** | The SCIM Attribute Mapping already exists |  -  |

<a name="deleteMapping"></a>
# **deleteMapping**
> deleteMapping(scimAttributeMappingName, scimResourceTypeName).execute();

Delete a SCIM Attribute Mapping

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimAttributeMappingApi;
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
    String scimAttributeMappingName = "scimAttributeMappingName_example"; // Name of the SCIM Attribute Mapping
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    try {
      client
              .scimAttributeMapping
              .deleteMapping(scimAttributeMappingName, scimResourceTypeName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeMappingApi#deleteMapping");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .scimAttributeMapping
              .deleteMapping(scimAttributeMappingName, scimResourceTypeName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeMappingApi#deleteMapping");
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
| **scimAttributeMappingName** | **String**| Name of the SCIM Attribute Mapping | |
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |

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
| **404** | The SCIM Attribute Mapping does not exist |  -  |
| **409** | The SCIM Attribute Mapping cannot be deleted |  -  |

<a name="getAllMappings"></a>
# **getAllMappings**
> ScimAttributeMappingListResponse getAllMappings(scimResourceTypeName).filter(filter).execute();

Returns a list of all SCIM Attribute Mapping objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimAttributeMappingApi;
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
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    String filter = "filter_example"; // SCIM filter
    try {
      ScimAttributeMappingListResponse result = client
              .scimAttributeMapping
              .getAllMappings(scimResourceTypeName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeMappingApi#getAllMappings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimAttributeMappingListResponse> response = client
              .scimAttributeMapping
              .getAllMappings(scimResourceTypeName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeMappingApi#getAllMappings");
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
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**ScimAttributeMappingListResponse**](ScimAttributeMappingListResponse.md)

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

<a name="getSingleScimAttributeMapping"></a>
# **getSingleScimAttributeMapping**
> ScimAttributeMappingResponse getSingleScimAttributeMapping(scimAttributeMappingName, scimResourceTypeName).execute();

Returns a single SCIM Attribute Mapping

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimAttributeMappingApi;
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
    String scimAttributeMappingName = "scimAttributeMappingName_example"; // Name of the SCIM Attribute Mapping
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    try {
      ScimAttributeMappingResponse result = client
              .scimAttributeMapping
              .getSingleScimAttributeMapping(scimAttributeMappingName, scimResourceTypeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getCorrelatedLDAPDataView());
      System.out.println(result.getScimResourceTypeAttribute());
      System.out.println(result.getLdapAttribute());
      System.out.println(result.getReadable());
      System.out.println(result.getWritable());
      System.out.println(result.getSearchable());
      System.out.println(result.getAuthoritative());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeMappingApi#getSingleScimAttributeMapping");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimAttributeMappingResponse> response = client
              .scimAttributeMapping
              .getSingleScimAttributeMapping(scimAttributeMappingName, scimResourceTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeMappingApi#getSingleScimAttributeMapping");
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
| **scimAttributeMappingName** | **String**| Name of the SCIM Attribute Mapping | |
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |

### Return type

[**ScimAttributeMappingResponse**](ScimAttributeMappingResponse.md)

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
| **404** | The SCIM Attribute Mapping does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> ScimAttributeMappingResponse updateByName(scimAttributeMappingName, scimResourceTypeName, updateRequest).execute();

Update an existing SCIM Attribute Mapping by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ScimAttributeMappingApi;
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
    String scimAttributeMappingName = "scimAttributeMappingName_example"; // Name of the SCIM Attribute Mapping
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    try {
      ScimAttributeMappingResponse result = client
              .scimAttributeMapping
              .updateByName(operations, scimAttributeMappingName, scimResourceTypeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getCorrelatedLDAPDataView());
      System.out.println(result.getScimResourceTypeAttribute());
      System.out.println(result.getLdapAttribute());
      System.out.println(result.getReadable());
      System.out.println(result.getWritable());
      System.out.println(result.getSearchable());
      System.out.println(result.getAuthoritative());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeMappingApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ScimAttributeMappingResponse> response = client
              .scimAttributeMapping
              .updateByName(operations, scimAttributeMappingName, scimResourceTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ScimAttributeMappingApi#updateByName");
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
| **scimAttributeMappingName** | **String**| Name of the SCIM Attribute Mapping | |
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing SCIM Attribute Mapping | |

### Return type

[**ScimAttributeMappingResponse**](ScimAttributeMappingResponse.md)

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
| **404** | The SCIM Attribute Mapping does not exist |  -  |


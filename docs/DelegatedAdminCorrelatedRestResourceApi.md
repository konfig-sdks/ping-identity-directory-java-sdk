# DelegatedAdminCorrelatedRestResourceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewToConfig**](DelegatedAdminCorrelatedRestResourceApi.md#addNewToConfig) | **POST** /rest-resource-types/{rest-resource-type-name}/delegated-admin-correlated-rest-resources | Add a new Delegated Admin Correlated REST Resource to the config |
| [**deleteResource**](DelegatedAdminCorrelatedRestResourceApi.md#deleteResource) | **DELETE** /rest-resource-types/{rest-resource-type-name}/delegated-admin-correlated-rest-resources/{delegated-admin-correlated-rest-resource-name} | Delete a Delegated Admin Correlated REST Resource |
| [**getSingleCorrelated**](DelegatedAdminCorrelatedRestResourceApi.md#getSingleCorrelated) | **GET** /rest-resource-types/{rest-resource-type-name}/delegated-admin-correlated-rest-resources/{delegated-admin-correlated-rest-resource-name} | Returns a single Delegated Admin Correlated REST Resource |
| [**listAllObjects**](DelegatedAdminCorrelatedRestResourceApi.md#listAllObjects) | **GET** /rest-resource-types/{rest-resource-type-name}/delegated-admin-correlated-rest-resources | Returns a list of all Delegated Admin Correlated REST Resource objects |
| [**updateByName**](DelegatedAdminCorrelatedRestResourceApi.md#updateByName) | **PATCH** /rest-resource-types/{rest-resource-type-name}/delegated-admin-correlated-rest-resources/{delegated-admin-correlated-rest-resource-name} | Update an existing Delegated Admin Correlated REST Resource by name |


<a name="addNewToConfig"></a>
# **addNewToConfig**
> DelegatedAdminCorrelatedRestResourceResponse addNewToConfig(restResourceTypeName, addDelegatedAdminCorrelatedRestResourceRequest).execute();

Add a new Delegated Admin Correlated REST Resource to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminCorrelatedRestResourceApi;
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
    String resourceName = "resourceName_example"; // Name of the new Delegated Admin Correlated REST Resource
    String restResourceTypeName = "restResourceTypeName_example"; // Name of the REST Resource Type
    List<EnumdelegatedAdminCorrelatedRestResourceSchemaUrn> schemas = Arrays.asList();
    String displayName = "displayName_example"; // A human readable display name for this Delegated Admin Correlated REST Resource.
    String correlatedRESTResource = "correlatedRESTResource_example"; // The REST Resource Type that will be linked to this REST Resource Type.
    String primaryRESTResourceCorrelationAttribute = "primaryRESTResourceCorrelationAttribute_example"; // The LDAP attribute from the parent REST Resource Type whose value will be used to match objects in the Delegated Admin Correlated REST Resource. This attribute must be writeable when use-secondary-value-for-linking is enabled.
    String secondaryRESTResourceCorrelationAttribute = "secondaryRESTResourceCorrelationAttribute_example"; // The LDAP attribute from the Delegated Admin Correlated REST Resource whose value will be matched with the primary-rest-resource-correlation-attribute. This attribute must be writeable when use-secondary-value-for-linking is disabled.
    Boolean useSecondaryValueForLinking = true; // Indicates whether links should be created using the secondary correlation attribute value.
    try {
      DelegatedAdminCorrelatedRestResourceResponse result = client
              .delegatedAdminCorrelatedRestResource
              .addNewToConfig(resourceName, restResourceTypeName)
              .schemas(schemas)
              .displayName(displayName)
              .correlatedRESTResource(correlatedRESTResource)
              .primaryRESTResourceCorrelationAttribute(primaryRESTResourceCorrelationAttribute)
              .secondaryRESTResourceCorrelationAttribute(secondaryRESTResourceCorrelationAttribute)
              .useSecondaryValueForLinking(useSecondaryValueForLinking)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getDisplayName());
      System.out.println(result.getCorrelatedRESTResource());
      System.out.println(result.getPrimaryRESTResourceCorrelationAttribute());
      System.out.println(result.getSecondaryRESTResourceCorrelationAttribute());
      System.out.println(result.getUseSecondaryValueForLinking());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminCorrelatedRestResourceApi#addNewToConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminCorrelatedRestResourceResponse> response = client
              .delegatedAdminCorrelatedRestResource
              .addNewToConfig(resourceName, restResourceTypeName)
              .schemas(schemas)
              .displayName(displayName)
              .correlatedRESTResource(correlatedRESTResource)
              .primaryRESTResourceCorrelationAttribute(primaryRESTResourceCorrelationAttribute)
              .secondaryRESTResourceCorrelationAttribute(secondaryRESTResourceCorrelationAttribute)
              .useSecondaryValueForLinking(useSecondaryValueForLinking)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminCorrelatedRestResourceApi#addNewToConfig");
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
| **restResourceTypeName** | **String**| Name of the REST Resource Type | |
| **addDelegatedAdminCorrelatedRestResourceRequest** | [**AddDelegatedAdminCorrelatedRestResourceRequest**](AddDelegatedAdminCorrelatedRestResourceRequest.md)| Create a new Delegated Admin Correlated REST Resource in the config | |

### Return type

[**DelegatedAdminCorrelatedRestResourceResponse**](DelegatedAdminCorrelatedRestResourceResponse.md)

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
| **409** | The Delegated Admin Correlated REST Resource already exists |  -  |

<a name="deleteResource"></a>
# **deleteResource**
> deleteResource(delegatedAdminCorrelatedRestResourceName, restResourceTypeName).execute();

Delete a Delegated Admin Correlated REST Resource

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminCorrelatedRestResourceApi;
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
    String delegatedAdminCorrelatedRestResourceName = "delegatedAdminCorrelatedRestResourceName_example"; // Name of the Delegated Admin Correlated REST Resource
    String restResourceTypeName = "restResourceTypeName_example"; // Name of the REST Resource Type
    try {
      client
              .delegatedAdminCorrelatedRestResource
              .deleteResource(delegatedAdminCorrelatedRestResourceName, restResourceTypeName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminCorrelatedRestResourceApi#deleteResource");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .delegatedAdminCorrelatedRestResource
              .deleteResource(delegatedAdminCorrelatedRestResourceName, restResourceTypeName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminCorrelatedRestResourceApi#deleteResource");
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
| **delegatedAdminCorrelatedRestResourceName** | **String**| Name of the Delegated Admin Correlated REST Resource | |
| **restResourceTypeName** | **String**| Name of the REST Resource Type | |

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
| **404** | The Delegated Admin Correlated REST Resource does not exist |  -  |
| **409** | The Delegated Admin Correlated REST Resource cannot be deleted |  -  |

<a name="getSingleCorrelated"></a>
# **getSingleCorrelated**
> DelegatedAdminCorrelatedRestResourceResponse getSingleCorrelated(delegatedAdminCorrelatedRestResourceName, restResourceTypeName).execute();

Returns a single Delegated Admin Correlated REST Resource

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminCorrelatedRestResourceApi;
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
    String delegatedAdminCorrelatedRestResourceName = "delegatedAdminCorrelatedRestResourceName_example"; // Name of the Delegated Admin Correlated REST Resource
    String restResourceTypeName = "restResourceTypeName_example"; // Name of the REST Resource Type
    try {
      DelegatedAdminCorrelatedRestResourceResponse result = client
              .delegatedAdminCorrelatedRestResource
              .getSingleCorrelated(delegatedAdminCorrelatedRestResourceName, restResourceTypeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getDisplayName());
      System.out.println(result.getCorrelatedRESTResource());
      System.out.println(result.getPrimaryRESTResourceCorrelationAttribute());
      System.out.println(result.getSecondaryRESTResourceCorrelationAttribute());
      System.out.println(result.getUseSecondaryValueForLinking());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminCorrelatedRestResourceApi#getSingleCorrelated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminCorrelatedRestResourceResponse> response = client
              .delegatedAdminCorrelatedRestResource
              .getSingleCorrelated(delegatedAdminCorrelatedRestResourceName, restResourceTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminCorrelatedRestResourceApi#getSingleCorrelated");
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
| **delegatedAdminCorrelatedRestResourceName** | **String**| Name of the Delegated Admin Correlated REST Resource | |
| **restResourceTypeName** | **String**| Name of the REST Resource Type | |

### Return type

[**DelegatedAdminCorrelatedRestResourceResponse**](DelegatedAdminCorrelatedRestResourceResponse.md)

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
| **404** | The Delegated Admin Correlated REST Resource does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> DelegatedAdminCorrelatedRestResourceListResponse listAllObjects(restResourceTypeName).filter(filter).execute();

Returns a list of all Delegated Admin Correlated REST Resource objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminCorrelatedRestResourceApi;
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
    String restResourceTypeName = "restResourceTypeName_example"; // Name of the REST Resource Type
    String filter = "filter_example"; // SCIM filter
    try {
      DelegatedAdminCorrelatedRestResourceListResponse result = client
              .delegatedAdminCorrelatedRestResource
              .listAllObjects(restResourceTypeName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminCorrelatedRestResourceApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminCorrelatedRestResourceListResponse> response = client
              .delegatedAdminCorrelatedRestResource
              .listAllObjects(restResourceTypeName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminCorrelatedRestResourceApi#listAllObjects");
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
| **restResourceTypeName** | **String**| Name of the REST Resource Type | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**DelegatedAdminCorrelatedRestResourceListResponse**](DelegatedAdminCorrelatedRestResourceListResponse.md)

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
> DelegatedAdminCorrelatedRestResourceResponse updateByName(delegatedAdminCorrelatedRestResourceName, restResourceTypeName, updateRequest).execute();

Update an existing Delegated Admin Correlated REST Resource by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminCorrelatedRestResourceApi;
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
    String delegatedAdminCorrelatedRestResourceName = "delegatedAdminCorrelatedRestResourceName_example"; // Name of the Delegated Admin Correlated REST Resource
    String restResourceTypeName = "restResourceTypeName_example"; // Name of the REST Resource Type
    try {
      DelegatedAdminCorrelatedRestResourceResponse result = client
              .delegatedAdminCorrelatedRestResource
              .updateByName(operations, delegatedAdminCorrelatedRestResourceName, restResourceTypeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getDisplayName());
      System.out.println(result.getCorrelatedRESTResource());
      System.out.println(result.getPrimaryRESTResourceCorrelationAttribute());
      System.out.println(result.getSecondaryRESTResourceCorrelationAttribute());
      System.out.println(result.getUseSecondaryValueForLinking());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminCorrelatedRestResourceApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminCorrelatedRestResourceResponse> response = client
              .delegatedAdminCorrelatedRestResource
              .updateByName(operations, delegatedAdminCorrelatedRestResourceName, restResourceTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminCorrelatedRestResourceApi#updateByName");
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
| **delegatedAdminCorrelatedRestResourceName** | **String**| Name of the Delegated Admin Correlated REST Resource | |
| **restResourceTypeName** | **String**| Name of the REST Resource Type | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Delegated Admin Correlated REST Resource | |

### Return type

[**DelegatedAdminCorrelatedRestResourceResponse**](DelegatedAdminCorrelatedRestResourceResponse.md)

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
| **404** | The Delegated Admin Correlated REST Resource does not exist |  -  |


# DelegatedAdminResourceRightsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewToConfig**](DelegatedAdminResourceRightsApi.md#addNewToConfig) | **POST** /delegated-admin-rights/{delegated-admin-rights-name}/delegated-admin-resource-rights | Add a new Delegated Admin Resource Rights to the config |
| [**deleteResourceRights**](DelegatedAdminResourceRightsApi.md#deleteResourceRights) | **DELETE** /delegated-admin-rights/{delegated-admin-rights-name}/delegated-admin-resource-rights/{delegated-admin-resource-rights-name} | Delete a Delegated Admin Resource Rights |
| [**getSingleResourceRights**](DelegatedAdminResourceRightsApi.md#getSingleResourceRights) | **GET** /delegated-admin-rights/{delegated-admin-rights-name}/delegated-admin-resource-rights/{delegated-admin-resource-rights-name} | Returns a single Delegated Admin Resource Rights |
| [**listAllObjects**](DelegatedAdminResourceRightsApi.md#listAllObjects) | **GET** /delegated-admin-rights/{delegated-admin-rights-name}/delegated-admin-resource-rights | Returns a list of all Delegated Admin Resource Rights objects |
| [**updateByName**](DelegatedAdminResourceRightsApi.md#updateByName) | **PATCH** /delegated-admin-rights/{delegated-admin-rights-name}/delegated-admin-resource-rights/{delegated-admin-resource-rights-name} | Update an existing Delegated Admin Resource Rights by name |


<a name="addNewToConfig"></a>
# **addNewToConfig**
> DelegatedAdminResourceRightsResponse addNewToConfig(delegatedAdminRightsName, addDelegatedAdminResourceRightsRequest).execute();

Add a new Delegated Admin Resource Rights to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminResourceRightsApi;
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
    String restResourceType = "restResourceType_example"; // Specifies the resource type applicable to these Delegated Admin Resource Rights.
    String delegatedAdminRightsName = "delegatedAdminRightsName_example"; // Name of the Delegated Admin Rights
    String description = "description_example"; // A description for this Delegated Admin Resource Rights
    List<EnumdelegatedAdminResourceRightsSchemaUrn> schemas = Arrays.asList();
    Boolean enabled = true; // Indicates whether these Delegated Admin Resource Rights are enabled.
    List<EnumdelegatedAdminResourceRightsAdminPermissionProp> adminPermission = Arrays.asList();
    EnumdelegatedAdminResourceRightsAdminScopeProp adminScope = EnumdelegatedAdminResourceRightsAdminScopeProp.fromValue("resources-in-specific-groups");
    List<String> resourceSubtree = Arrays.asList(); // Specifies subtrees within the search base whose entries can be managed by the administrator(s). The admin-scope must be set to resources-in-specific-subtrees.
    List<String> resourcesInGroup = Arrays.asList(); // Specifies groups whose members can be managed by the administrator(s). The admin-scope must be set to resources-in-specific-groups.
    try {
      DelegatedAdminResourceRightsResponse result = client
              .delegatedAdminResourceRights
              .addNewToConfig(restResourceType, delegatedAdminRightsName)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .adminPermission(adminPermission)
              .adminScope(adminScope)
              .resourceSubtree(resourceSubtree)
              .resourcesInGroup(resourcesInGroup)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getRestResourceType());
      System.out.println(result.getAdminPermission());
      System.out.println(result.getAdminScope());
      System.out.println(result.getResourceSubtree());
      System.out.println(result.getResourcesInGroup());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminResourceRightsApi#addNewToConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminResourceRightsResponse> response = client
              .delegatedAdminResourceRights
              .addNewToConfig(restResourceType, delegatedAdminRightsName)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .adminPermission(adminPermission)
              .adminScope(adminScope)
              .resourceSubtree(resourceSubtree)
              .resourcesInGroup(resourcesInGroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminResourceRightsApi#addNewToConfig");
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
| **delegatedAdminRightsName** | **String**| Name of the Delegated Admin Rights | |
| **addDelegatedAdminResourceRightsRequest** | [**AddDelegatedAdminResourceRightsRequest**](AddDelegatedAdminResourceRightsRequest.md)| Create a new Delegated Admin Resource Rights in the config | |

### Return type

[**DelegatedAdminResourceRightsResponse**](DelegatedAdminResourceRightsResponse.md)

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
| **409** | The Delegated Admin Resource Rights already exists |  -  |

<a name="deleteResourceRights"></a>
# **deleteResourceRights**
> deleteResourceRights(delegatedAdminResourceRightsName, delegatedAdminRightsName).execute();

Delete a Delegated Admin Resource Rights

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminResourceRightsApi;
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
    String delegatedAdminResourceRightsName = "delegatedAdminResourceRightsName_example"; // Name of the Delegated Admin Resource Rights
    String delegatedAdminRightsName = "delegatedAdminRightsName_example"; // Name of the Delegated Admin Rights
    try {
      client
              .delegatedAdminResourceRights
              .deleteResourceRights(delegatedAdminResourceRightsName, delegatedAdminRightsName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminResourceRightsApi#deleteResourceRights");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .delegatedAdminResourceRights
              .deleteResourceRights(delegatedAdminResourceRightsName, delegatedAdminRightsName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminResourceRightsApi#deleteResourceRights");
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
| **delegatedAdminResourceRightsName** | **String**| Name of the Delegated Admin Resource Rights | |
| **delegatedAdminRightsName** | **String**| Name of the Delegated Admin Rights | |

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
| **404** | The Delegated Admin Resource Rights does not exist |  -  |
| **409** | The Delegated Admin Resource Rights cannot be deleted |  -  |

<a name="getSingleResourceRights"></a>
# **getSingleResourceRights**
> DelegatedAdminResourceRightsResponse getSingleResourceRights(delegatedAdminResourceRightsName, delegatedAdminRightsName).execute();

Returns a single Delegated Admin Resource Rights

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminResourceRightsApi;
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
    String delegatedAdminResourceRightsName = "delegatedAdminResourceRightsName_example"; // Name of the Delegated Admin Resource Rights
    String delegatedAdminRightsName = "delegatedAdminRightsName_example"; // Name of the Delegated Admin Rights
    try {
      DelegatedAdminResourceRightsResponse result = client
              .delegatedAdminResourceRights
              .getSingleResourceRights(delegatedAdminResourceRightsName, delegatedAdminRightsName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getRestResourceType());
      System.out.println(result.getAdminPermission());
      System.out.println(result.getAdminScope());
      System.out.println(result.getResourceSubtree());
      System.out.println(result.getResourcesInGroup());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminResourceRightsApi#getSingleResourceRights");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminResourceRightsResponse> response = client
              .delegatedAdminResourceRights
              .getSingleResourceRights(delegatedAdminResourceRightsName, delegatedAdminRightsName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminResourceRightsApi#getSingleResourceRights");
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
| **delegatedAdminResourceRightsName** | **String**| Name of the Delegated Admin Resource Rights | |
| **delegatedAdminRightsName** | **String**| Name of the Delegated Admin Rights | |

### Return type

[**DelegatedAdminResourceRightsResponse**](DelegatedAdminResourceRightsResponse.md)

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
| **404** | The Delegated Admin Resource Rights does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> DelegatedAdminResourceRightsListResponse listAllObjects(delegatedAdminRightsName).filter(filter).execute();

Returns a list of all Delegated Admin Resource Rights objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminResourceRightsApi;
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
    String delegatedAdminRightsName = "delegatedAdminRightsName_example"; // Name of the Delegated Admin Rights
    String filter = "filter_example"; // SCIM filter
    try {
      DelegatedAdminResourceRightsListResponse result = client
              .delegatedAdminResourceRights
              .listAllObjects(delegatedAdminRightsName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminResourceRightsApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminResourceRightsListResponse> response = client
              .delegatedAdminResourceRights
              .listAllObjects(delegatedAdminRightsName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminResourceRightsApi#listAllObjects");
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
| **delegatedAdminRightsName** | **String**| Name of the Delegated Admin Rights | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**DelegatedAdminResourceRightsListResponse**](DelegatedAdminResourceRightsListResponse.md)

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
> DelegatedAdminResourceRightsResponse updateByName(delegatedAdminResourceRightsName, delegatedAdminRightsName, updateRequest).execute();

Update an existing Delegated Admin Resource Rights by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminResourceRightsApi;
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
    String delegatedAdminResourceRightsName = "delegatedAdminResourceRightsName_example"; // Name of the Delegated Admin Resource Rights
    String delegatedAdminRightsName = "delegatedAdminRightsName_example"; // Name of the Delegated Admin Rights
    try {
      DelegatedAdminResourceRightsResponse result = client
              .delegatedAdminResourceRights
              .updateByName(operations, delegatedAdminResourceRightsName, delegatedAdminRightsName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getRestResourceType());
      System.out.println(result.getAdminPermission());
      System.out.println(result.getAdminScope());
      System.out.println(result.getResourceSubtree());
      System.out.println(result.getResourcesInGroup());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminResourceRightsApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminResourceRightsResponse> response = client
              .delegatedAdminResourceRights
              .updateByName(operations, delegatedAdminResourceRightsName, delegatedAdminRightsName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminResourceRightsApi#updateByName");
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
| **delegatedAdminResourceRightsName** | **String**| Name of the Delegated Admin Resource Rights | |
| **delegatedAdminRightsName** | **String**| Name of the Delegated Admin Rights | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Delegated Admin Resource Rights | |

### Return type

[**DelegatedAdminResourceRightsResponse**](DelegatedAdminResourceRightsResponse.md)

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
| **404** | The Delegated Admin Resource Rights does not exist |  -  |


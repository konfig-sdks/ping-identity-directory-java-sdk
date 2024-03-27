# DelegatedAdminRightsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewConfig**](DelegatedAdminRightsApi.md#addNewConfig) | **POST** /delegated-admin-rights | Add a new Delegated Admin Rights to the config |
| [**deleteDelegatedAdminRights**](DelegatedAdminRightsApi.md#deleteDelegatedAdminRights) | **DELETE** /delegated-admin-rights/{delegated-admin-rights-name} | Delete a Delegated Admin Rights |
| [**getSingleRights**](DelegatedAdminRightsApi.md#getSingleRights) | **GET** /delegated-admin-rights/{delegated-admin-rights-name} | Returns a single Delegated Admin Rights |
| [**listAllObjects**](DelegatedAdminRightsApi.md#listAllObjects) | **GET** /delegated-admin-rights | Returns a list of all Delegated Admin Rights objects |
| [**updateByName**](DelegatedAdminRightsApi.md#updateByName) | **PATCH** /delegated-admin-rights/{delegated-admin-rights-name} | Update an existing Delegated Admin Rights by name |


<a name="addNewConfig"></a>
# **addNewConfig**
> DelegatedAdminRightsResponse addNewConfig(addDelegatedAdminRightsRequest).execute();

Add a new Delegated Admin Rights to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminRightsApi;
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
    String rightsName = "rightsName_example"; // Name of the new Delegated Admin Rights
    String description = "description_example"; // A description for this Delegated Admin Rights
    List<EnumdelegatedAdminRightsSchemaUrn> schemas = Arrays.asList();
    Boolean enabled = true; // Indicates whether the Delegated Admin Rights is enabled.
    String adminUserDN = "adminUserDN_example"; // Specifies the DN of an administrative user who has authority to manage resources. Either admin-user-dn or admin-group-dn must be specified, but not both.
    String adminGroupDN = "adminGroupDN_example"; // Specifies the DN of a group of administrative users who have authority to manage resources. Either admin-user-dn or admin-group-dn must be specified, but not both.
    try {
      DelegatedAdminRightsResponse result = client
              .delegatedAdminRights
              .addNewConfig(rightsName)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .adminUserDN(adminUserDN)
              .adminGroupDN(adminGroupDN)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getAdminUserDN());
      System.out.println(result.getAdminGroupDN());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminRightsApi#addNewConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminRightsResponse> response = client
              .delegatedAdminRights
              .addNewConfig(rightsName)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .adminUserDN(adminUserDN)
              .adminGroupDN(adminGroupDN)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminRightsApi#addNewConfig");
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
| **addDelegatedAdminRightsRequest** | [**AddDelegatedAdminRightsRequest**](AddDelegatedAdminRightsRequest.md)| Create a new Delegated Admin Rights in the config | |

### Return type

[**DelegatedAdminRightsResponse**](DelegatedAdminRightsResponse.md)

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
| **409** | The Delegated Admin Rights already exists |  -  |

<a name="deleteDelegatedAdminRights"></a>
# **deleteDelegatedAdminRights**
> deleteDelegatedAdminRights(delegatedAdminRightsName).execute();

Delete a Delegated Admin Rights

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminRightsApi;
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
    try {
      client
              .delegatedAdminRights
              .deleteDelegatedAdminRights(delegatedAdminRightsName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminRightsApi#deleteDelegatedAdminRights");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .delegatedAdminRights
              .deleteDelegatedAdminRights(delegatedAdminRightsName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminRightsApi#deleteDelegatedAdminRights");
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
| **404** | The Delegated Admin Rights does not exist |  -  |
| **409** | The Delegated Admin Rights cannot be deleted |  -  |

<a name="getSingleRights"></a>
# **getSingleRights**
> DelegatedAdminRightsResponse getSingleRights(delegatedAdminRightsName).execute();

Returns a single Delegated Admin Rights

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminRightsApi;
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
    try {
      DelegatedAdminRightsResponse result = client
              .delegatedAdminRights
              .getSingleRights(delegatedAdminRightsName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getAdminUserDN());
      System.out.println(result.getAdminGroupDN());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminRightsApi#getSingleRights");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminRightsResponse> response = client
              .delegatedAdminRights
              .getSingleRights(delegatedAdminRightsName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminRightsApi#getSingleRights");
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

### Return type

[**DelegatedAdminRightsResponse**](DelegatedAdminRightsResponse.md)

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
| **404** | The Delegated Admin Rights does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> DelegatedAdminRightsListResponse listAllObjects().filter(filter).execute();

Returns a list of all Delegated Admin Rights objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminRightsApi;
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
      DelegatedAdminRightsListResponse result = client
              .delegatedAdminRights
              .listAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminRightsApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminRightsListResponse> response = client
              .delegatedAdminRights
              .listAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminRightsApi#listAllObjects");
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

[**DelegatedAdminRightsListResponse**](DelegatedAdminRightsListResponse.md)

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
> DelegatedAdminRightsResponse updateByName(delegatedAdminRightsName, updateRequest).execute();

Update an existing Delegated Admin Rights by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminRightsApi;
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
    String delegatedAdminRightsName = "delegatedAdminRightsName_example"; // Name of the Delegated Admin Rights
    try {
      DelegatedAdminRightsResponse result = client
              .delegatedAdminRights
              .updateByName(operations, delegatedAdminRightsName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getAdminUserDN());
      System.out.println(result.getAdminGroupDN());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminRightsApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminRightsResponse> response = client
              .delegatedAdminRights
              .updateByName(operations, delegatedAdminRightsName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminRightsApi#updateByName");
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
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Delegated Admin Rights | |

### Return type

[**DelegatedAdminRightsResponse**](DelegatedAdminRightsResponse.md)

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
| **404** | The Delegated Admin Rights does not exist |  -  |


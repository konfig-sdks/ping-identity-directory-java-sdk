# DelegatedAdminAttributeCategoryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewCategory**](DelegatedAdminAttributeCategoryApi.md#addNewCategory) | **POST** /delegated-admin-attribute-categories | Add a new Delegated Admin Attribute Category to the config |
| [**deleteCategory**](DelegatedAdminAttributeCategoryApi.md#deleteCategory) | **DELETE** /delegated-admin-attribute-categories/{delegated-admin-attribute-category-name} | Delete a Delegated Admin Attribute Category |
| [**getSingle**](DelegatedAdminAttributeCategoryApi.md#getSingle) | **GET** /delegated-admin-attribute-categories/{delegated-admin-attribute-category-name} | Returns a single Delegated Admin Attribute Category |
| [**listAllCategories**](DelegatedAdminAttributeCategoryApi.md#listAllCategories) | **GET** /delegated-admin-attribute-categories | Returns a list of all Delegated Admin Attribute Category objects |
| [**updateByName**](DelegatedAdminAttributeCategoryApi.md#updateByName) | **PATCH** /delegated-admin-attribute-categories/{delegated-admin-attribute-category-name} | Update an existing Delegated Admin Attribute Category by name |


<a name="addNewCategory"></a>
# **addNewCategory**
> DelegatedAdminAttributeCategoryResponse addNewCategory(addDelegatedAdminAttributeCategoryRequest).execute();

Add a new Delegated Admin Attribute Category to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminAttributeCategoryApi;
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
    String displayName = "displayName_example"; // A human readable display name for this Delegated Admin Attribute Category.
    String description = "description_example"; // A description for this Delegated Admin Attribute Category
    List<EnumdelegatedAdminAttributeCategorySchemaUrn> schemas = Arrays.asList();
    Integer displayOrderIndex = 56; // Delegated Admin Attribute Categories are ordered for display based on this index from least to greatest.
    try {
      DelegatedAdminAttributeCategoryResponse result = client
              .delegatedAdminAttributeCategory
              .addNewCategory(displayName)
              .description(description)
              .schemas(schemas)
              .displayOrderIndex(displayOrderIndex)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getDisplayName());
      System.out.println(result.getDisplayOrderIndex());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeCategoryApi#addNewCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminAttributeCategoryResponse> response = client
              .delegatedAdminAttributeCategory
              .addNewCategory(displayName)
              .description(description)
              .schemas(schemas)
              .displayOrderIndex(displayOrderIndex)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeCategoryApi#addNewCategory");
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
| **addDelegatedAdminAttributeCategoryRequest** | [**AddDelegatedAdminAttributeCategoryRequest**](AddDelegatedAdminAttributeCategoryRequest.md)| Create a new Delegated Admin Attribute Category in the config | |

### Return type

[**DelegatedAdminAttributeCategoryResponse**](DelegatedAdminAttributeCategoryResponse.md)

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
| **409** | The Delegated Admin Attribute Category already exists |  -  |

<a name="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(delegatedAdminAttributeCategoryName).execute();

Delete a Delegated Admin Attribute Category

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminAttributeCategoryApi;
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
    String delegatedAdminAttributeCategoryName = "delegatedAdminAttributeCategoryName_example"; // Name of the Delegated Admin Attribute Category
    try {
      client
              .delegatedAdminAttributeCategory
              .deleteCategory(delegatedAdminAttributeCategoryName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeCategoryApi#deleteCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .delegatedAdminAttributeCategory
              .deleteCategory(delegatedAdminAttributeCategoryName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeCategoryApi#deleteCategory");
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
| **delegatedAdminAttributeCategoryName** | **String**| Name of the Delegated Admin Attribute Category | |

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
| **404** | The Delegated Admin Attribute Category does not exist |  -  |
| **409** | The Delegated Admin Attribute Category cannot be deleted |  -  |

<a name="getSingle"></a>
# **getSingle**
> DelegatedAdminAttributeCategoryResponse getSingle(delegatedAdminAttributeCategoryName).execute();

Returns a single Delegated Admin Attribute Category

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminAttributeCategoryApi;
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
    String delegatedAdminAttributeCategoryName = "delegatedAdminAttributeCategoryName_example"; // Name of the Delegated Admin Attribute Category
    try {
      DelegatedAdminAttributeCategoryResponse result = client
              .delegatedAdminAttributeCategory
              .getSingle(delegatedAdminAttributeCategoryName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getDisplayName());
      System.out.println(result.getDisplayOrderIndex());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeCategoryApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminAttributeCategoryResponse> response = client
              .delegatedAdminAttributeCategory
              .getSingle(delegatedAdminAttributeCategoryName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeCategoryApi#getSingle");
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
| **delegatedAdminAttributeCategoryName** | **String**| Name of the Delegated Admin Attribute Category | |

### Return type

[**DelegatedAdminAttributeCategoryResponse**](DelegatedAdminAttributeCategoryResponse.md)

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
| **404** | The Delegated Admin Attribute Category does not exist |  -  |

<a name="listAllCategories"></a>
# **listAllCategories**
> DelegatedAdminAttributeCategoryListResponse listAllCategories().filter(filter).execute();

Returns a list of all Delegated Admin Attribute Category objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminAttributeCategoryApi;
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
      DelegatedAdminAttributeCategoryListResponse result = client
              .delegatedAdminAttributeCategory
              .listAllCategories()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeCategoryApi#listAllCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminAttributeCategoryListResponse> response = client
              .delegatedAdminAttributeCategory
              .listAllCategories()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeCategoryApi#listAllCategories");
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

[**DelegatedAdminAttributeCategoryListResponse**](DelegatedAdminAttributeCategoryListResponse.md)

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
> DelegatedAdminAttributeCategoryResponse updateByName(delegatedAdminAttributeCategoryName, updateRequest).execute();

Update an existing Delegated Admin Attribute Category by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminAttributeCategoryApi;
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
    String delegatedAdminAttributeCategoryName = "delegatedAdminAttributeCategoryName_example"; // Name of the Delegated Admin Attribute Category
    try {
      DelegatedAdminAttributeCategoryResponse result = client
              .delegatedAdminAttributeCategory
              .updateByName(operations, delegatedAdminAttributeCategoryName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getDisplayName());
      System.out.println(result.getDisplayOrderIndex());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeCategoryApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminAttributeCategoryResponse> response = client
              .delegatedAdminAttributeCategory
              .updateByName(operations, delegatedAdminAttributeCategoryName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeCategoryApi#updateByName");
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
| **delegatedAdminAttributeCategoryName** | **String**| Name of the Delegated Admin Attribute Category | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Delegated Admin Attribute Category | |

### Return type

[**DelegatedAdminAttributeCategoryResponse**](DelegatedAdminAttributeCategoryResponse.md)

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
| **404** | The Delegated Admin Attribute Category does not exist |  -  |


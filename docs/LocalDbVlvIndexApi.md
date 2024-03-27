# LocalDbVlvIndexApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewIndexToConfig**](LocalDbVlvIndexApi.md#addNewIndexToConfig) | **POST** /backends/{backend-name}/local-db-vlv-indexes | Add a new Local DB VLV Index to the config |
| [**delete**](LocalDbVlvIndexApi.md#delete) | **DELETE** /backends/{backend-name}/local-db-vlv-indexes/{local-db-vlv-index-name} | Delete a Local DB VLV Index |
| [**getSingle**](LocalDbVlvIndexApi.md#getSingle) | **GET** /backends/{backend-name}/local-db-vlv-indexes/{local-db-vlv-index-name} | Returns a single Local DB VLV Index |
| [**listObjects**](LocalDbVlvIndexApi.md#listObjects) | **GET** /backends/{backend-name}/local-db-vlv-indexes | Returns a list of all Local DB VLV Index objects |
| [**updateByName**](LocalDbVlvIndexApi.md#updateByName) | **PATCH** /backends/{backend-name}/local-db-vlv-indexes/{local-db-vlv-index-name} | Update an existing Local DB VLV Index by name |


<a name="addNewIndexToConfig"></a>
# **addNewIndexToConfig**
> LocalDbVlvIndexResponse addNewIndexToConfig(backendName, addLocalDbVlvIndexRequest).execute();

Add a new Local DB VLV Index to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbVlvIndexApi;
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
    String indexName = "indexName_example"; // Name of the new Local DB VLV Index
    String backendName = "backendName_example"; // Name of the Backend
    List<EnumlocalDbVlvIndexSchemaUrn> schemas = Arrays.asList();
    String baseDN = "baseDN_example"; // Specifies the base DN used in the search query that is being indexed.
    EnumlocalDbVlvIndexScopeProp scope = EnumlocalDbVlvIndexScopeProp.fromValue("base-object");
    String filter = "filter_example"; // Specifies the LDAP filter used in the query that is being indexed.
    String sortOrder = "sortOrder_example"; // Specifies the names of the attributes that are used to sort the entries for the query being indexed.
    String name = "name_example"; // Specifies a unique name for this VLV index.
    Integer maxBlockSize = 56; // Specifies the number of entry IDs to store in a single sorted set before it must be split.
    EnumlocalDbVlvIndexCacheModeProp cacheMode = EnumlocalDbVlvIndexCacheModeProp.fromValue("cache-keys-and-values");
    try {
      LocalDbVlvIndexResponse result = client
              .localDbVlvIndex
              .addNewIndexToConfig(indexName, backendName)
              .schemas(schemas)
              .baseDN(baseDN)
              .scope(scope)
              .filter(filter)
              .sortOrder(sortOrder)
              .name(name)
              .maxBlockSize(maxBlockSize)
              .cacheMode(cacheMode)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getBaseDN());
      System.out.println(result.getScope());
      System.out.println(result.getFilter());
      System.out.println(result.getSortOrder());
      System.out.println(result.getName());
      System.out.println(result.getMaxBlockSize());
      System.out.println(result.getCacheMode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbVlvIndexApi#addNewIndexToConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbVlvIndexResponse> response = client
              .localDbVlvIndex
              .addNewIndexToConfig(indexName, backendName)
              .schemas(schemas)
              .baseDN(baseDN)
              .scope(scope)
              .filter(filter)
              .sortOrder(sortOrder)
              .name(name)
              .maxBlockSize(maxBlockSize)
              .cacheMode(cacheMode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbVlvIndexApi#addNewIndexToConfig");
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
| **backendName** | **String**| Name of the Backend | |
| **addLocalDbVlvIndexRequest** | [**AddLocalDbVlvIndexRequest**](AddLocalDbVlvIndexRequest.md)| Create a new Local DB VLV Index in the config | |

### Return type

[**LocalDbVlvIndexResponse**](LocalDbVlvIndexResponse.md)

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
| **409** | The Local DB VLV Index already exists |  -  |

<a name="delete"></a>
# **delete**
> delete(localDbVlvIndexName, backendName).execute();

Delete a Local DB VLV Index

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbVlvIndexApi;
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
    String localDbVlvIndexName = "localDbVlvIndexName_example"; // Name of the Local DB VLV Index
    String backendName = "backendName_example"; // Name of the Backend
    try {
      client
              .localDbVlvIndex
              .delete(localDbVlvIndexName, backendName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbVlvIndexApi#delete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .localDbVlvIndex
              .delete(localDbVlvIndexName, backendName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbVlvIndexApi#delete");
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
| **localDbVlvIndexName** | **String**| Name of the Local DB VLV Index | |
| **backendName** | **String**| Name of the Backend | |

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
| **404** | The Local DB VLV Index does not exist |  -  |
| **409** | The Local DB VLV Index cannot be deleted |  -  |

<a name="getSingle"></a>
# **getSingle**
> LocalDbVlvIndexResponse getSingle(localDbVlvIndexName, backendName).execute();

Returns a single Local DB VLV Index

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbVlvIndexApi;
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
    String localDbVlvIndexName = "localDbVlvIndexName_example"; // Name of the Local DB VLV Index
    String backendName = "backendName_example"; // Name of the Backend
    try {
      LocalDbVlvIndexResponse result = client
              .localDbVlvIndex
              .getSingle(localDbVlvIndexName, backendName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getBaseDN());
      System.out.println(result.getScope());
      System.out.println(result.getFilter());
      System.out.println(result.getSortOrder());
      System.out.println(result.getName());
      System.out.println(result.getMaxBlockSize());
      System.out.println(result.getCacheMode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbVlvIndexApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbVlvIndexResponse> response = client
              .localDbVlvIndex
              .getSingle(localDbVlvIndexName, backendName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbVlvIndexApi#getSingle");
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
| **localDbVlvIndexName** | **String**| Name of the Local DB VLV Index | |
| **backendName** | **String**| Name of the Backend | |

### Return type

[**LocalDbVlvIndexResponse**](LocalDbVlvIndexResponse.md)

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
| **404** | The Local DB VLV Index does not exist |  -  |

<a name="listObjects"></a>
# **listObjects**
> LocalDbVlvIndexListResponse listObjects(backendName).filter(filter).execute();

Returns a list of all Local DB VLV Index objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbVlvIndexApi;
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
    String backendName = "backendName_example"; // Name of the Backend
    String filter = "filter_example"; // SCIM filter
    try {
      LocalDbVlvIndexListResponse result = client
              .localDbVlvIndex
              .listObjects(backendName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbVlvIndexApi#listObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbVlvIndexListResponse> response = client
              .localDbVlvIndex
              .listObjects(backendName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbVlvIndexApi#listObjects");
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
| **backendName** | **String**| Name of the Backend | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**LocalDbVlvIndexListResponse**](LocalDbVlvIndexListResponse.md)

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
> LocalDbVlvIndexResponse updateByName(localDbVlvIndexName, backendName, updateRequest).execute();

Update an existing Local DB VLV Index by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbVlvIndexApi;
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
    String localDbVlvIndexName = "localDbVlvIndexName_example"; // Name of the Local DB VLV Index
    String backendName = "backendName_example"; // Name of the Backend
    try {
      LocalDbVlvIndexResponse result = client
              .localDbVlvIndex
              .updateByName(operations, localDbVlvIndexName, backendName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getBaseDN());
      System.out.println(result.getScope());
      System.out.println(result.getFilter());
      System.out.println(result.getSortOrder());
      System.out.println(result.getName());
      System.out.println(result.getMaxBlockSize());
      System.out.println(result.getCacheMode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbVlvIndexApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbVlvIndexResponse> response = client
              .localDbVlvIndex
              .updateByName(operations, localDbVlvIndexName, backendName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbVlvIndexApi#updateByName");
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
| **localDbVlvIndexName** | **String**| Name of the Local DB VLV Index | |
| **backendName** | **String**| Name of the Backend | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Local DB VLV Index | |

### Return type

[**LocalDbVlvIndexResponse**](LocalDbVlvIndexResponse.md)

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
| **404** | The Local DB VLV Index does not exist |  -  |


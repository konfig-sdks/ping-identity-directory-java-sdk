# LocalDbCompositeIndexApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewIndex**](LocalDbCompositeIndexApi.md#addNewIndex) | **POST** /backends/{backend-name}/local-db-composite-indexes | Add a new Local DB Composite Index to the config |
| [**deleteCompositeIndex**](LocalDbCompositeIndexApi.md#deleteCompositeIndex) | **DELETE** /backends/{backend-name}/local-db-composite-indexes/{local-db-composite-index-name} | Delete a Local DB Composite Index |
| [**getSingle**](LocalDbCompositeIndexApi.md#getSingle) | **GET** /backends/{backend-name}/local-db-composite-indexes/{local-db-composite-index-name} | Returns a single Local DB Composite Index |
| [**listAllObjects**](LocalDbCompositeIndexApi.md#listAllObjects) | **GET** /backends/{backend-name}/local-db-composite-indexes | Returns a list of all Local DB Composite Index objects |
| [**updateByName**](LocalDbCompositeIndexApi.md#updateByName) | **PATCH** /backends/{backend-name}/local-db-composite-indexes/{local-db-composite-index-name} | Update an existing Local DB Composite Index by name |


<a name="addNewIndex"></a>
# **addNewIndex**
> LocalDbCompositeIndexResponse addNewIndex(backendName, addLocalDbCompositeIndexRequest).execute();

Add a new Local DB Composite Index to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbCompositeIndexApi;
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
    String indexName = "indexName_example"; // Name of the new Local DB Composite Index
    String backendName = "backendName_example"; // Name of the Backend
    String description = "description_example"; // A description for this Local DB Composite Index
    List<EnumlocalDbCompositeIndexSchemaUrn> schemas = Arrays.asList();
    String indexFilterPattern = "indexFilterPattern_example"; // A filter pattern that identifies which entries to include in the index.
    String indexBaseDNPattern = "indexBaseDNPattern_example"; // An optional base DN pattern that identifies portions of the DIT in which entries to index may exist.
    Integer indexEntryLimit = 56; // The maximum number of entries that any single index key will be allowed to match before the server stops maintaining the ID set for that index key.
    Boolean primeIndex = true; // Indicates whether the server should load the contents of this index into memory when the backend is being opened.
    Boolean primeInternalNodesOnly = true; // Indicates whether to only prime the internal nodes of the index database, rather than priming both internal and leaf nodes.
    EnumlocalDbCompositeIndexCacheModeProp cacheMode = EnumlocalDbCompositeIndexCacheModeProp.fromValue("cache-keys-and-values");
    try {
      LocalDbCompositeIndexResponse result = client
              .localDbCompositeIndex
              .addNewIndex(indexName, backendName)
              .description(description)
              .schemas(schemas)
              .indexFilterPattern(indexFilterPattern)
              .indexBaseDNPattern(indexBaseDNPattern)
              .indexEntryLimit(indexEntryLimit)
              .primeIndex(primeIndex)
              .primeInternalNodesOnly(primeInternalNodesOnly)
              .cacheMode(cacheMode)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getIndexFilterPattern());
      System.out.println(result.getIndexBaseDNPattern());
      System.out.println(result.getIndexEntryLimit());
      System.out.println(result.getPrimeIndex());
      System.out.println(result.getPrimeInternalNodesOnly());
      System.out.println(result.getCacheMode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbCompositeIndexApi#addNewIndex");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbCompositeIndexResponse> response = client
              .localDbCompositeIndex
              .addNewIndex(indexName, backendName)
              .description(description)
              .schemas(schemas)
              .indexFilterPattern(indexFilterPattern)
              .indexBaseDNPattern(indexBaseDNPattern)
              .indexEntryLimit(indexEntryLimit)
              .primeIndex(primeIndex)
              .primeInternalNodesOnly(primeInternalNodesOnly)
              .cacheMode(cacheMode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbCompositeIndexApi#addNewIndex");
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
| **addLocalDbCompositeIndexRequest** | [**AddLocalDbCompositeIndexRequest**](AddLocalDbCompositeIndexRequest.md)| Create a new Local DB Composite Index in the config | |

### Return type

[**LocalDbCompositeIndexResponse**](LocalDbCompositeIndexResponse.md)

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
| **409** | The Local DB Composite Index already exists |  -  |

<a name="deleteCompositeIndex"></a>
# **deleteCompositeIndex**
> deleteCompositeIndex(localDbCompositeIndexName, backendName).execute();

Delete a Local DB Composite Index

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbCompositeIndexApi;
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
    String localDbCompositeIndexName = "localDbCompositeIndexName_example"; // Name of the Local DB Composite Index
    String backendName = "backendName_example"; // Name of the Backend
    try {
      client
              .localDbCompositeIndex
              .deleteCompositeIndex(localDbCompositeIndexName, backendName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbCompositeIndexApi#deleteCompositeIndex");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .localDbCompositeIndex
              .deleteCompositeIndex(localDbCompositeIndexName, backendName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbCompositeIndexApi#deleteCompositeIndex");
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
| **localDbCompositeIndexName** | **String**| Name of the Local DB Composite Index | |
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
| **404** | The Local DB Composite Index does not exist |  -  |
| **409** | The Local DB Composite Index cannot be deleted |  -  |

<a name="getSingle"></a>
# **getSingle**
> LocalDbCompositeIndexResponse getSingle(localDbCompositeIndexName, backendName).execute();

Returns a single Local DB Composite Index

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbCompositeIndexApi;
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
    String localDbCompositeIndexName = "localDbCompositeIndexName_example"; // Name of the Local DB Composite Index
    String backendName = "backendName_example"; // Name of the Backend
    try {
      LocalDbCompositeIndexResponse result = client
              .localDbCompositeIndex
              .getSingle(localDbCompositeIndexName, backendName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getIndexFilterPattern());
      System.out.println(result.getIndexBaseDNPattern());
      System.out.println(result.getIndexEntryLimit());
      System.out.println(result.getPrimeIndex());
      System.out.println(result.getPrimeInternalNodesOnly());
      System.out.println(result.getCacheMode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbCompositeIndexApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbCompositeIndexResponse> response = client
              .localDbCompositeIndex
              .getSingle(localDbCompositeIndexName, backendName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbCompositeIndexApi#getSingle");
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
| **localDbCompositeIndexName** | **String**| Name of the Local DB Composite Index | |
| **backendName** | **String**| Name of the Backend | |

### Return type

[**LocalDbCompositeIndexResponse**](LocalDbCompositeIndexResponse.md)

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
| **404** | The Local DB Composite Index does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> LocalDbCompositeIndexListResponse listAllObjects(backendName).filter(filter).execute();

Returns a list of all Local DB Composite Index objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbCompositeIndexApi;
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
      LocalDbCompositeIndexListResponse result = client
              .localDbCompositeIndex
              .listAllObjects(backendName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbCompositeIndexApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbCompositeIndexListResponse> response = client
              .localDbCompositeIndex
              .listAllObjects(backendName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbCompositeIndexApi#listAllObjects");
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

[**LocalDbCompositeIndexListResponse**](LocalDbCompositeIndexListResponse.md)

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
> LocalDbCompositeIndexResponse updateByName(localDbCompositeIndexName, backendName, updateRequest).execute();

Update an existing Local DB Composite Index by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbCompositeIndexApi;
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
    String localDbCompositeIndexName = "localDbCompositeIndexName_example"; // Name of the Local DB Composite Index
    String backendName = "backendName_example"; // Name of the Backend
    try {
      LocalDbCompositeIndexResponse result = client
              .localDbCompositeIndex
              .updateByName(operations, localDbCompositeIndexName, backendName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getIndexFilterPattern());
      System.out.println(result.getIndexBaseDNPattern());
      System.out.println(result.getIndexEntryLimit());
      System.out.println(result.getPrimeIndex());
      System.out.println(result.getPrimeInternalNodesOnly());
      System.out.println(result.getCacheMode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbCompositeIndexApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbCompositeIndexResponse> response = client
              .localDbCompositeIndex
              .updateByName(operations, localDbCompositeIndexName, backendName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbCompositeIndexApi#updateByName");
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
| **localDbCompositeIndexName** | **String**| Name of the Local DB Composite Index | |
| **backendName** | **String**| Name of the Backend | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Local DB Composite Index | |

### Return type

[**LocalDbCompositeIndexResponse**](LocalDbCompositeIndexResponse.md)

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
| **404** | The Local DB Composite Index does not exist |  -  |


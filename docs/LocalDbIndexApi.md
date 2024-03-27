# LocalDbIndexApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewIndex**](LocalDbIndexApi.md#addNewIndex) | **POST** /backends/{backend-name}/local-db-indexes | Add a new Local DB Index to the config |
| [**deleteIndex**](LocalDbIndexApi.md#deleteIndex) | **DELETE** /backends/{backend-name}/local-db-indexes/{local-db-index-name} | Delete a Local DB Index |
| [**getAllIndexes**](LocalDbIndexApi.md#getAllIndexes) | **GET** /backends/{backend-name}/local-db-indexes | Returns a list of all Local DB Index objects |
| [**getSingle**](LocalDbIndexApi.md#getSingle) | **GET** /backends/{backend-name}/local-db-indexes/{local-db-index-name} | Returns a single Local DB Index |
| [**updateByName**](LocalDbIndexApi.md#updateByName) | **PATCH** /backends/{backend-name}/local-db-indexes/{local-db-index-name} | Update an existing Local DB Index by name |


<a name="addNewIndex"></a>
# **addNewIndex**
> LocalDbIndexResponse addNewIndex(backendName, addLocalDbIndexRequest).execute();

Add a new Local DB Index to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbIndexApi;
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
    String indexName = "indexName_example"; // Name of the new Local DB Index
    String backendName = "backendName_example"; // Name of the Backend
    List<EnumlocalDbIndexSchemaUrn> schemas = Arrays.asList();
    String attribute = "attribute_example"; // Specifies the name of the attribute for which the index is to be maintained.
    Integer indexEntryLimit = 56; // Specifies the maximum number of entries that are allowed to match a given index key before that particular index key is no longer maintained.
    Integer substringIndexEntryLimit = 56; // Specifies, for substring indexes, the maximum number of entries that are allowed to match a given index key before that particular index key is no longer maintained. Setting a large limit can dramatically increase the database size on disk and have a big impact on server performance if the indexed attribute is modified frequently. When a very large limit is required, creating a dedicated composite index with an index-filter-pattern of (attr=*?*) will give the best balance between search and update performance.
    Boolean maintainMatchCountForKeysExceedingEntryLimit = true; // Indicates whether to continue to maintain a count of the number of matching entries for an index key even after that count exceeds the index entry limit.
    List<EnumlocalDbIndexIndexTypeProp> indexType = Arrays.asList();
    Integer substringLength = 56; // The length of substrings in a substring index.
    Boolean primeIndex = true; // If this option is enabled and this index's backend is configured to prime indexes, then this index will be loaded at startup.
    Boolean primeInternalNodesOnly = true; // If this option is enabled and this index's backend is configured to prime indexes using the preload method, then only the internal database nodes (i.e., the database keys but not values) should be primed when the backend is initialized.
    List<String> equalityIndexFilter = Arrays.asList(); // A search filter that may be used in conjunction with an equality component for the associated attribute type. If an equality index filter is defined, then an additional equality index will be maintained for the associated attribute, but only for entries which match the provided filter. Further, the index will be used only for searches containing an equality component with the associated attribute type ANDed with this filter.
    Boolean maintainEqualityIndexWithoutFilter = true; // Indicates whether to maintain a separate equality index for the associated attribute without any filter, in addition to maintaining an index for each equality index filter that is defined. If this is false, then the attribute will not be indexed for equality by itself but only in conjunction with the defined equality index filters.
    EnumlocalDbIndexCacheModeProp cacheMode = EnumlocalDbIndexCacheModeProp.fromValue("cache-keys-and-values");
    try {
      LocalDbIndexResponse result = client
              .localDbIndex
              .addNewIndex(indexName, backendName)
              .schemas(schemas)
              .attribute(attribute)
              .indexEntryLimit(indexEntryLimit)
              .substringIndexEntryLimit(substringIndexEntryLimit)
              .maintainMatchCountForKeysExceedingEntryLimit(maintainMatchCountForKeysExceedingEntryLimit)
              .indexType(indexType)
              .substringLength(substringLength)
              .primeIndex(primeIndex)
              .primeInternalNodesOnly(primeInternalNodesOnly)
              .equalityIndexFilter(equalityIndexFilter)
              .maintainEqualityIndexWithoutFilter(maintainEqualityIndexWithoutFilter)
              .cacheMode(cacheMode)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getAttribute());
      System.out.println(result.getIndexEntryLimit());
      System.out.println(result.getSubstringIndexEntryLimit());
      System.out.println(result.getMaintainMatchCountForKeysExceedingEntryLimit());
      System.out.println(result.getIndexType());
      System.out.println(result.getSubstringLength());
      System.out.println(result.getPrimeIndex());
      System.out.println(result.getPrimeInternalNodesOnly());
      System.out.println(result.getEqualityIndexFilter());
      System.out.println(result.getMaintainEqualityIndexWithoutFilter());
      System.out.println(result.getCacheMode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbIndexApi#addNewIndex");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbIndexResponse> response = client
              .localDbIndex
              .addNewIndex(indexName, backendName)
              .schemas(schemas)
              .attribute(attribute)
              .indexEntryLimit(indexEntryLimit)
              .substringIndexEntryLimit(substringIndexEntryLimit)
              .maintainMatchCountForKeysExceedingEntryLimit(maintainMatchCountForKeysExceedingEntryLimit)
              .indexType(indexType)
              .substringLength(substringLength)
              .primeIndex(primeIndex)
              .primeInternalNodesOnly(primeInternalNodesOnly)
              .equalityIndexFilter(equalityIndexFilter)
              .maintainEqualityIndexWithoutFilter(maintainEqualityIndexWithoutFilter)
              .cacheMode(cacheMode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbIndexApi#addNewIndex");
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
| **addLocalDbIndexRequest** | [**AddLocalDbIndexRequest**](AddLocalDbIndexRequest.md)| Create a new Local DB Index in the config | |

### Return type

[**LocalDbIndexResponse**](LocalDbIndexResponse.md)

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
| **409** | The Local DB Index already exists |  -  |

<a name="deleteIndex"></a>
# **deleteIndex**
> deleteIndex(localDbIndexName, backendName).execute();

Delete a Local DB Index

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbIndexApi;
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
    String localDbIndexName = "localDbIndexName_example"; // Name of the Local DB Index
    String backendName = "backendName_example"; // Name of the Backend
    try {
      client
              .localDbIndex
              .deleteIndex(localDbIndexName, backendName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbIndexApi#deleteIndex");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .localDbIndex
              .deleteIndex(localDbIndexName, backendName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbIndexApi#deleteIndex");
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
| **localDbIndexName** | **String**| Name of the Local DB Index | |
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
| **404** | The Local DB Index does not exist |  -  |
| **409** | The Local DB Index cannot be deleted |  -  |

<a name="getAllIndexes"></a>
# **getAllIndexes**
> LocalDbIndexListResponse getAllIndexes(backendName).filter(filter).execute();

Returns a list of all Local DB Index objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbIndexApi;
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
      LocalDbIndexListResponse result = client
              .localDbIndex
              .getAllIndexes(backendName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbIndexApi#getAllIndexes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbIndexListResponse> response = client
              .localDbIndex
              .getAllIndexes(backendName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbIndexApi#getAllIndexes");
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

[**LocalDbIndexListResponse**](LocalDbIndexListResponse.md)

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
> LocalDbIndexResponse getSingle(localDbIndexName, backendName).execute();

Returns a single Local DB Index

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbIndexApi;
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
    String localDbIndexName = "localDbIndexName_example"; // Name of the Local DB Index
    String backendName = "backendName_example"; // Name of the Backend
    try {
      LocalDbIndexResponse result = client
              .localDbIndex
              .getSingle(localDbIndexName, backendName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getAttribute());
      System.out.println(result.getIndexEntryLimit());
      System.out.println(result.getSubstringIndexEntryLimit());
      System.out.println(result.getMaintainMatchCountForKeysExceedingEntryLimit());
      System.out.println(result.getIndexType());
      System.out.println(result.getSubstringLength());
      System.out.println(result.getPrimeIndex());
      System.out.println(result.getPrimeInternalNodesOnly());
      System.out.println(result.getEqualityIndexFilter());
      System.out.println(result.getMaintainEqualityIndexWithoutFilter());
      System.out.println(result.getCacheMode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbIndexApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbIndexResponse> response = client
              .localDbIndex
              .getSingle(localDbIndexName, backendName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbIndexApi#getSingle");
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
| **localDbIndexName** | **String**| Name of the Local DB Index | |
| **backendName** | **String**| Name of the Backend | |

### Return type

[**LocalDbIndexResponse**](LocalDbIndexResponse.md)

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
| **404** | The Local DB Index does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> LocalDbIndexResponse updateByName(localDbIndexName, backendName, updateRequest).execute();

Update an existing Local DB Index by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalDbIndexApi;
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
    String localDbIndexName = "localDbIndexName_example"; // Name of the Local DB Index
    String backendName = "backendName_example"; // Name of the Backend
    try {
      LocalDbIndexResponse result = client
              .localDbIndex
              .updateByName(operations, localDbIndexName, backendName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getAttribute());
      System.out.println(result.getIndexEntryLimit());
      System.out.println(result.getSubstringIndexEntryLimit());
      System.out.println(result.getMaintainMatchCountForKeysExceedingEntryLimit());
      System.out.println(result.getIndexType());
      System.out.println(result.getSubstringLength());
      System.out.println(result.getPrimeIndex());
      System.out.println(result.getPrimeInternalNodesOnly());
      System.out.println(result.getEqualityIndexFilter());
      System.out.println(result.getMaintainEqualityIndexWithoutFilter());
      System.out.println(result.getCacheMode());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbIndexApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalDbIndexResponse> response = client
              .localDbIndex
              .updateByName(operations, localDbIndexName, backendName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalDbIndexApi#updateByName");
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
| **localDbIndexName** | **String**| Name of the Local DB Index | |
| **backendName** | **String**| Name of the Backend | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Local DB Index | |

### Return type

[**LocalDbIndexResponse**](LocalDbIndexResponse.md)

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
| **404** | The Local DB Index does not exist |  -  |


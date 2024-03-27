# EntryCacheApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewCache**](EntryCacheApi.md#addNewCache) | **POST** /entry-caches | Add a new Entry Cache to the config |
| [**deleteEntryCache**](EntryCacheApi.md#deleteEntryCache) | **DELETE** /entry-caches/{entry-cache-name} | Delete a Entry Cache |
| [**getAllObjects**](EntryCacheApi.md#getAllObjects) | **GET** /entry-caches | Returns a list of all Entry Cache objects |
| [**getSingleCache**](EntryCacheApi.md#getSingleCache) | **GET** /entry-caches/{entry-cache-name} | Returns a single Entry Cache |
| [**updateByName**](EntryCacheApi.md#updateByName) | **PATCH** /entry-caches/{entry-cache-name} | Update an existing Entry Cache by name |


<a name="addNewCache"></a>
# **addNewCache**
> FifoEntryCacheResponse addNewCache(addFifoEntryCacheRequest).execute();

Add a new Entry Cache to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EntryCacheApi;
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
    String cacheName = "cacheName_example"; // Name of the new Entry Cache
    String description = "description_example"; // A description for this Entry Cache
    List<EnumfifoEntryCacheSchemaUrn> schemas = Arrays.asList();
    Integer maxMemoryPercent = 56; // Specifies the maximum amount of memory, as a percentage of the total maximum JVM heap size, that this cache should occupy when full. If the amount of memory the cache is using is greater than this amount, then an attempt to put a new entry in the cache will be ignored and will cause the oldest entry to be purged.
    Integer maxEntries = 56; // Specifies the maximum number of entries that will be allowed in the cache. Once the cache reaches this size, then adding new entries will cause existing entries to be purged, starting with the oldest.
    Boolean onlyCacheFrequentlyAccessed = true; // Specifies that the cache should only store entries which are accessed much more frequently than the average entry. The cache will observe attempts to place entries in the cache and compare an entry's accesses to the average entry's.
    List<String> includeFilter = Arrays.asList(); // The set of filters that define the entries that should be included in the cache.
    List<String> excludeFilter = Arrays.asList(); // The set of filters that define the entries that should be excluded from the cache.
    Integer minCacheEntryValueCount = 56; // Specifies the minimum number of attribute values (optionally across a specified subset of attributes as defined in the min-cache-entry-attributes property) for entries that should be held in the cache. Entries with fewer than this number of attribute values will be excluded from the cache.
    List<String> minCacheEntryAttribute = Arrays.asList(); // Specifies the names of the attribute types for which the min-cache-entry-value-count property should apply. If no attribute types are specified, then all user attributes will be examined.
    Boolean enabled = true; // Indicates whether the Entry Cache is enabled.
    Integer cacheLevel = 56; // Specifies the cache level in the cache order if more than one instance of the cache is configured.
    Boolean cacheUnindexedSearchResults = true; // Indicates whether the entry cache should be updated with entries that have been returned to the client during the course of processing an unindexed search.
    try {
      FifoEntryCacheResponse result = client
              .entryCache
              .addNewCache(cacheName)
              .description(description)
              .schemas(schemas)
              .maxMemoryPercent(maxMemoryPercent)
              .maxEntries(maxEntries)
              .onlyCacheFrequentlyAccessed(onlyCacheFrequentlyAccessed)
              .includeFilter(includeFilter)
              .excludeFilter(excludeFilter)
              .minCacheEntryValueCount(minCacheEntryValueCount)
              .minCacheEntryAttribute(minCacheEntryAttribute)
              .enabled(enabled)
              .cacheLevel(cacheLevel)
              .cacheUnindexedSearchResults(cacheUnindexedSearchResults)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getMaxMemoryPercent());
      System.out.println(result.getMaxEntries());
      System.out.println(result.getOnlyCacheFrequentlyAccessed());
      System.out.println(result.getIncludeFilter());
      System.out.println(result.getExcludeFilter());
      System.out.println(result.getMinCacheEntryValueCount());
      System.out.println(result.getMinCacheEntryAttribute());
      System.out.println(result.getEnabled());
      System.out.println(result.getCacheLevel());
      System.out.println(result.getCacheUnindexedSearchResults());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntryCacheApi#addNewCache");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FifoEntryCacheResponse> response = client
              .entryCache
              .addNewCache(cacheName)
              .description(description)
              .schemas(schemas)
              .maxMemoryPercent(maxMemoryPercent)
              .maxEntries(maxEntries)
              .onlyCacheFrequentlyAccessed(onlyCacheFrequentlyAccessed)
              .includeFilter(includeFilter)
              .excludeFilter(excludeFilter)
              .minCacheEntryValueCount(minCacheEntryValueCount)
              .minCacheEntryAttribute(minCacheEntryAttribute)
              .enabled(enabled)
              .cacheLevel(cacheLevel)
              .cacheUnindexedSearchResults(cacheUnindexedSearchResults)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntryCacheApi#addNewCache");
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
| **addFifoEntryCacheRequest** | [**AddFifoEntryCacheRequest**](AddFifoEntryCacheRequest.md)| Create a new Entry Cache in the config | |

### Return type

[**FifoEntryCacheResponse**](FifoEntryCacheResponse.md)

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
| **409** | The Entry Cache already exists |  -  |

<a name="deleteEntryCache"></a>
# **deleteEntryCache**
> deleteEntryCache(entryCacheName).execute();

Delete a Entry Cache

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EntryCacheApi;
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
    String entryCacheName = "entryCacheName_example"; // Name of the Entry Cache
    try {
      client
              .entryCache
              .deleteEntryCache(entryCacheName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EntryCacheApi#deleteEntryCache");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .entryCache
              .deleteEntryCache(entryCacheName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EntryCacheApi#deleteEntryCache");
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
| **entryCacheName** | **String**| Name of the Entry Cache | |

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
| **404** | The Entry Cache does not exist |  -  |
| **409** | The Entry Cache cannot be deleted |  -  |

<a name="getAllObjects"></a>
# **getAllObjects**
> EntryCacheListResponse getAllObjects().filter(filter).execute();

Returns a list of all Entry Cache objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EntryCacheApi;
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
      EntryCacheListResponse result = client
              .entryCache
              .getAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntryCacheApi#getAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntryCacheListResponse> response = client
              .entryCache
              .getAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntryCacheApi#getAllObjects");
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

[**EntryCacheListResponse**](EntryCacheListResponse.md)

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

<a name="getSingleCache"></a>
# **getSingleCache**
> FifoEntryCacheResponse getSingleCache(entryCacheName).execute();

Returns a single Entry Cache

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EntryCacheApi;
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
    String entryCacheName = "entryCacheName_example"; // Name of the Entry Cache
    try {
      FifoEntryCacheResponse result = client
              .entryCache
              .getSingleCache(entryCacheName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getMaxMemoryPercent());
      System.out.println(result.getMaxEntries());
      System.out.println(result.getOnlyCacheFrequentlyAccessed());
      System.out.println(result.getIncludeFilter());
      System.out.println(result.getExcludeFilter());
      System.out.println(result.getMinCacheEntryValueCount());
      System.out.println(result.getMinCacheEntryAttribute());
      System.out.println(result.getEnabled());
      System.out.println(result.getCacheLevel());
      System.out.println(result.getCacheUnindexedSearchResults());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntryCacheApi#getSingleCache");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FifoEntryCacheResponse> response = client
              .entryCache
              .getSingleCache(entryCacheName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntryCacheApi#getSingleCache");
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
| **entryCacheName** | **String**| Name of the Entry Cache | |

### Return type

[**FifoEntryCacheResponse**](FifoEntryCacheResponse.md)

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
| **404** | The Entry Cache does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> FifoEntryCacheResponse updateByName(entryCacheName, updateRequest).execute();

Update an existing Entry Cache by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EntryCacheApi;
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
    String entryCacheName = "entryCacheName_example"; // Name of the Entry Cache
    try {
      FifoEntryCacheResponse result = client
              .entryCache
              .updateByName(operations, entryCacheName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getMaxMemoryPercent());
      System.out.println(result.getMaxEntries());
      System.out.println(result.getOnlyCacheFrequentlyAccessed());
      System.out.println(result.getIncludeFilter());
      System.out.println(result.getExcludeFilter());
      System.out.println(result.getMinCacheEntryValueCount());
      System.out.println(result.getMinCacheEntryAttribute());
      System.out.println(result.getEnabled());
      System.out.println(result.getCacheLevel());
      System.out.println(result.getCacheUnindexedSearchResults());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntryCacheApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FifoEntryCacheResponse> response = client
              .entryCache
              .updateByName(operations, entryCacheName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EntryCacheApi#updateByName");
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
| **entryCacheName** | **String**| Name of the Entry Cache | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Entry Cache | |

### Return type

[**FifoEntryCacheResponse**](FifoEntryCacheResponse.md)

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
| **404** | The Entry Cache does not exist |  -  |


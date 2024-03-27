# BackendApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConfig**](BackendApi.md#createConfig) | **POST** /backends | Add a new Backend to the config |
| [**deleteBackend**](BackendApi.md#deleteBackend) | **DELETE** /backends/{backend-name} | Delete a Backend |
| [**getAllObjects**](BackendApi.md#getAllObjects) | **GET** /backends | Returns a list of all Backend objects |
| [**getSingle**](BackendApi.md#getSingle) | **GET** /backends/{backend-name} | Returns a single Backend |
| [**updateByName**](BackendApi.md#updateByName) | **PATCH** /backends/{backend-name} | Update an existing Backend by name |


<a name="createConfig"></a>
# **createConfig**
> Object createConfig(addLocalDbBackendRequest).execute();

Add a new Backend to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackendApi;
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
    String backendName = "backendName_example"; // Name of the new Backend
    String description = "description_example"; // A description for this Backend
    List<EnumlocalDbBackendSchemaUrn> schemas = Arrays.asList();
    EnumbackendUncachedId2entryCacheModeProp uncachedId2entryCacheMode = EnumbackendUncachedId2entryCacheModeProp.fromValue("cache-keys-and-values");
    String uncachedAttributeCriteria = "uncachedAttributeCriteria_example"; // The criteria that will be used to identify attributes that should be written into the uncached-id2entry database rather than the id2entry database. This will only be used for entries in which the associated uncached-entry-criteria does not indicate that the entire entry should be uncached.
    String uncachedEntryCriteria = "uncachedEntryCriteria_example"; // The criteria that will be used to identify entries that should be written into the uncached-id2entry database rather than the id2entry database.
    EnumbackendWritabilityModeProp writabilityMode = EnumbackendWritabilityModeProp.fromValue("enabled");
    Boolean setDegradedAlertForUntrustedIndex = true; // Determines whether the Directory Server enters a DEGRADED state when this Local DB Backend has an index whose contents cannot be trusted.
    Boolean returnUnavailableForUntrustedIndex = true; // Determines whether the Directory Server returns UNAVAILABLE for any LDAP search operation in this Local DB Backend that would use an index whose contents cannot be trusted.
    Boolean processFiltersWithUndefinedAttributeTypes = true; // Determines whether the Directory Server should continue filter processing for LDAP search operations in this Local DB Backend that includes a search filter with an attribute that is not defined in the schema. This will only apply if check-schema is enabled in the global configuration.
    Boolean isPrivateBackend = true; // Indicates whether this backend should be considered a private backend in the server. Private backends are meant for storing server-internal information and should not be used for user or application data.
    String dbDirectory = "dbDirectory_example"; // Specifies the path to the filesystem directory that is used to hold the Berkeley DB Java Edition database files containing the data for this backend. The files for this backend are stored in a sub-directory named after the backend-id.
    String dbDirectoryPermissions = "dbDirectoryPermissions_example"; // Specifies the permissions that should be applied to the directory containing the backend database files and to directories and files created during backup or LDIF export of the backend.
    List<String> compactCommonParentDN = Arrays.asList(); // Provides a DN of an entry that may be the parent for a large number of entries in the backend. This may be used to help increase the space efficiency when encoding entries for storage.
    Boolean compressEntries = true; // Indicates whether the backend should attempt to compress entries before storing them in the database.
    Boolean hashEntries = true; // Indicates whether to calculate and store a message digest of the entry contents along with the entry data, in order to provide a means of verifying the integrity of the entry data.
    Integer dbNumCleanerThreads = 56; // Specifies the number of threads that the backend should maintain to keep the database log files at or near the desired utilization. A value of zero indicates that the number of cleaner threads should be automatically configured based on the number of available CPUs.
    Integer dbCleanerMinUtilization = 56; // Specifies the minimum percentage of \\\"live\\\" data that the database cleaner attempts to keep in database log files.
    Integer dbEvictorCriticalPercentage = 56; // Specifies the percentage over the configured maximum that the database cache is allowed to grow. It is recommended to set this value slightly above zero when the database is too large to fully cache in memory. In this case, a dedicated background evictor thread is used to perform evictions once the cache fills up reducing the possibility that server threads are blocked.
    String dbCheckpointerWakeupInterval = "dbCheckpointerWakeupInterval_example"; // Specifies the maximum length of time that should pass between checkpoints.
    String dbBackgroundSyncInterval = "dbBackgroundSyncInterval_example"; // Specifies the interval to use when performing background synchronous writes in the database environment in order to smooth overall write performance and increase data durability. A value of \\\"0 s\\\" will disable background synchronous writes.
    Boolean dbUseThreadLocalHandles = true; // Indicates whether to use thread-local database handles to reduce contention in the backend.
    String dbLogFileMax = "dbLogFileMax_example"; // Specifies the maximum size for a database log file.
    String dbLoggingLevel = "dbLoggingLevel_example"; // Specifies the log level that should be used by the database when it is writing information into the je.info file.
    List<String> jeProperty = Arrays.asList(); // Specifies the database and environment properties for the Berkeley DB Java Edition database serving the data for this backend.
    Integer dbCachePercent = 56; // Specifies the percentage of JVM memory to allocate to the database cache.
    EnumbackendDefaultCacheModeProp defaultCacheMode = EnumbackendDefaultCacheModeProp.fromValue("cache-keys-and-values");
    EnumbackendId2entryCacheModeProp id2entryCacheMode = EnumbackendId2entryCacheModeProp.fromValue("cache-keys-and-values");
    EnumbackendDn2idCacheModeProp dn2idCacheMode = EnumbackendDn2idCacheModeProp.fromValue("cache-keys-and-values");
    EnumbackendId2childrenCacheModeProp id2childrenCacheMode = EnumbackendId2childrenCacheModeProp.fromValue("cache-keys-and-values");
    EnumbackendId2subtreeCacheModeProp id2subtreeCacheMode = EnumbackendId2subtreeCacheModeProp.fromValue("cache-keys-and-values");
    EnumbackendDn2uriCacheModeProp dn2uriCacheMode = EnumbackendDn2uriCacheModeProp.fromValue("cache-keys-and-values");
    List<EnumbackendPrimeMethodProp> primeMethod = Arrays.asList();
    Integer primeThreadCount = 56; // Specifies the number of threads to use when priming. At present, this applies only to the preload and cursor-across-indexes prime methods.
    String primeTimeLimit = "primeTimeLimit_example"; // Specifies the maximum length of time that the backend prime should be allowed to run. A duration of zero seconds indicates that there should not be a time limit.
    Boolean primeAllIndexes = true; // Indicates whether to prime all indexes associated with this backend, or to only prime the specified set of indexes (as configured with the system-index-to-prime property for the system indexes, and the prime-index property in the attribute index definition for attribute indexes).
    List<EnumbackendSystemIndexToPrimeProp> systemIndexToPrime = Arrays.asList();
    List<EnumbackendSystemIndexToPrimeInternalNodesOnlyProp> systemIndexToPrimeInternalNodesOnly = Arrays.asList();
    Boolean backgroundPrime = true; // Indicates whether to attempt to perform the prime using a background thread if possible. If background priming is enabled, then the Directory Server may be allowed to accept client connections and process requests while the prime is in progress.
    Integer indexEntryLimit = 56; // Specifies the maximum number of entries that are allowed to match a given index key before that particular index key is no longer maintained.
    Integer compositeIndexEntryLimit = 56; // Specifies the maximum number of entries that are allowed to match a given composite index key before that particular composite index key is no longer maintained.
    Integer id2childrenIndexEntryLimit = 56; // Specifies the maximum number of entry IDs to maintain for each entry in the id2children system index (which keeps track of the immediate children for an entry, to assist in otherwise unindexed searches with a single-level scope). A value of 0 means there is no limit, however this could have a big impact on database size on disk and on server performance.
    Integer id2subtreeIndexEntryLimit = 56; // Specifies the maximum number of entry IDs to maintain for each entry in the id2subtree system index (which keeps track of all descendants below an entry, to assist in otherwise unindexed searches with a whole-subtree or subordinate subtree scope). A value of 0 means there is no limit, however this could have a big impact on database size on disk and on server performance.
    String importTempDirectory = "importTempDirectory_example"; // Specifies the location of the directory that is used to hold temporary information during the index post-processing phase of an LDIF import.
    Integer importThreadCount = 56; // Specifies the number of threads to use for concurrent processing during an LDIF import.
    Integer exportThreadCount = 56; // Specifies the number of threads to use for concurrently retrieving and encoding entries during an LDIF export.
    Integer dbImportCachePercent = 56; // The percentage of JVM memory to allocate to the database cache during import operations.
    Boolean dbTxnWriteNoSync = true; // Indicates whether the database should synchronously flush data as it is written to disk.
    Integer deadlockRetryLimit = 56; // Specifies the number of times that the server should retry an attempted operation in the backend if a deadlock results from two concurrent requests that interfere with each other in a conflicting manner.
    EnumbackendExternalTxnDefaultBackendLockBehaviorProp externalTxnDefaultBackendLockBehavior = EnumbackendExternalTxnDefaultBackendLockBehaviorProp.fromValue("do-not-acquire");
    EnumbackendSingleWriterLockBehaviorProp singleWriterLockBehavior = EnumbackendSingleWriterLockBehaviorProp.fromValue("never-acquire");
    Integer subtreeDeleteSizeLimit = 56; // Specifies the maximum number of entries that may be deleted from the backend when using the subtree delete control.
    Integer numRecentChanges = 56; // Specifies the number of recent LDAP entry changes per replica for which the backend keeps a record to allow replication to recover in the event that the server is abruptly terminated. Increasing this value can lead to an increased peak server modification rate as well as increased replication throughput.
    String offlineProcessDatabaseOpenTimeout = "offlineProcessDatabaseOpenTimeout_example"; // Specifies a timeout duration which will be used for opening the database environment by an offline process, such as export-ldif.
    String backendID = "backendID_example"; // Specifies a name to identify the associated backend.
    Boolean enabled = true; // Indicates whether the backend is enabled in the server.
    List<String> baseDN = Arrays.asList(); // Specifies the base DN(s) for the data that the backend handles.
    Boolean setDegradedAlertWhenDisabled = true; // Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled.
    Boolean returnUnavailableWhenDisabled = true; // Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled.
    String notificationManager = "notificationManager_example"; // Specifies a notification manager for changes resulting from operations processed through this Backend
    try {
      Object result = client
              .backend
              .createConfig(backendName)
              .description(description)
              .schemas(schemas)
              .uncachedId2entryCacheMode(uncachedId2entryCacheMode)
              .uncachedAttributeCriteria(uncachedAttributeCriteria)
              .uncachedEntryCriteria(uncachedEntryCriteria)
              .writabilityMode(writabilityMode)
              .setDegradedAlertForUntrustedIndex(setDegradedAlertForUntrustedIndex)
              .returnUnavailableForUntrustedIndex(returnUnavailableForUntrustedIndex)
              .processFiltersWithUndefinedAttributeTypes(processFiltersWithUndefinedAttributeTypes)
              .isPrivateBackend(isPrivateBackend)
              .dbDirectory(dbDirectory)
              .dbDirectoryPermissions(dbDirectoryPermissions)
              .compactCommonParentDN(compactCommonParentDN)
              .compressEntries(compressEntries)
              .hashEntries(hashEntries)
              .dbNumCleanerThreads(dbNumCleanerThreads)
              .dbCleanerMinUtilization(dbCleanerMinUtilization)
              .dbEvictorCriticalPercentage(dbEvictorCriticalPercentage)
              .dbCheckpointerWakeupInterval(dbCheckpointerWakeupInterval)
              .dbBackgroundSyncInterval(dbBackgroundSyncInterval)
              .dbUseThreadLocalHandles(dbUseThreadLocalHandles)
              .dbLogFileMax(dbLogFileMax)
              .dbLoggingLevel(dbLoggingLevel)
              .jeProperty(jeProperty)
              .dbCachePercent(dbCachePercent)
              .defaultCacheMode(defaultCacheMode)
              .id2entryCacheMode(id2entryCacheMode)
              .dn2idCacheMode(dn2idCacheMode)
              .id2childrenCacheMode(id2childrenCacheMode)
              .id2subtreeCacheMode(id2subtreeCacheMode)
              .dn2uriCacheMode(dn2uriCacheMode)
              .primeMethod(primeMethod)
              .primeThreadCount(primeThreadCount)
              .primeTimeLimit(primeTimeLimit)
              .primeAllIndexes(primeAllIndexes)
              .systemIndexToPrime(systemIndexToPrime)
              .systemIndexToPrimeInternalNodesOnly(systemIndexToPrimeInternalNodesOnly)
              .backgroundPrime(backgroundPrime)
              .indexEntryLimit(indexEntryLimit)
              .compositeIndexEntryLimit(compositeIndexEntryLimit)
              .id2childrenIndexEntryLimit(id2childrenIndexEntryLimit)
              .id2subtreeIndexEntryLimit(id2subtreeIndexEntryLimit)
              .importTempDirectory(importTempDirectory)
              .importThreadCount(importThreadCount)
              .exportThreadCount(exportThreadCount)
              .dbImportCachePercent(dbImportCachePercent)
              .dbTxnWriteNoSync(dbTxnWriteNoSync)
              .deadlockRetryLimit(deadlockRetryLimit)
              .externalTxnDefaultBackendLockBehavior(externalTxnDefaultBackendLockBehavior)
              .singleWriterLockBehavior(singleWriterLockBehavior)
              .subtreeDeleteSizeLimit(subtreeDeleteSizeLimit)
              .numRecentChanges(numRecentChanges)
              .offlineProcessDatabaseOpenTimeout(offlineProcessDatabaseOpenTimeout)
              .backendID(backendID)
              .enabled(enabled)
              .baseDN(baseDN)
              .setDegradedAlertWhenDisabled(setDegradedAlertWhenDisabled)
              .returnUnavailableWhenDisabled(returnUnavailableWhenDisabled)
              .notificationManager(notificationManager)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BackendApi#createConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .backend
              .createConfig(backendName)
              .description(description)
              .schemas(schemas)
              .uncachedId2entryCacheMode(uncachedId2entryCacheMode)
              .uncachedAttributeCriteria(uncachedAttributeCriteria)
              .uncachedEntryCriteria(uncachedEntryCriteria)
              .writabilityMode(writabilityMode)
              .setDegradedAlertForUntrustedIndex(setDegradedAlertForUntrustedIndex)
              .returnUnavailableForUntrustedIndex(returnUnavailableForUntrustedIndex)
              .processFiltersWithUndefinedAttributeTypes(processFiltersWithUndefinedAttributeTypes)
              .isPrivateBackend(isPrivateBackend)
              .dbDirectory(dbDirectory)
              .dbDirectoryPermissions(dbDirectoryPermissions)
              .compactCommonParentDN(compactCommonParentDN)
              .compressEntries(compressEntries)
              .hashEntries(hashEntries)
              .dbNumCleanerThreads(dbNumCleanerThreads)
              .dbCleanerMinUtilization(dbCleanerMinUtilization)
              .dbEvictorCriticalPercentage(dbEvictorCriticalPercentage)
              .dbCheckpointerWakeupInterval(dbCheckpointerWakeupInterval)
              .dbBackgroundSyncInterval(dbBackgroundSyncInterval)
              .dbUseThreadLocalHandles(dbUseThreadLocalHandles)
              .dbLogFileMax(dbLogFileMax)
              .dbLoggingLevel(dbLoggingLevel)
              .jeProperty(jeProperty)
              .dbCachePercent(dbCachePercent)
              .defaultCacheMode(defaultCacheMode)
              .id2entryCacheMode(id2entryCacheMode)
              .dn2idCacheMode(dn2idCacheMode)
              .id2childrenCacheMode(id2childrenCacheMode)
              .id2subtreeCacheMode(id2subtreeCacheMode)
              .dn2uriCacheMode(dn2uriCacheMode)
              .primeMethod(primeMethod)
              .primeThreadCount(primeThreadCount)
              .primeTimeLimit(primeTimeLimit)
              .primeAllIndexes(primeAllIndexes)
              .systemIndexToPrime(systemIndexToPrime)
              .systemIndexToPrimeInternalNodesOnly(systemIndexToPrimeInternalNodesOnly)
              .backgroundPrime(backgroundPrime)
              .indexEntryLimit(indexEntryLimit)
              .compositeIndexEntryLimit(compositeIndexEntryLimit)
              .id2childrenIndexEntryLimit(id2childrenIndexEntryLimit)
              .id2subtreeIndexEntryLimit(id2subtreeIndexEntryLimit)
              .importTempDirectory(importTempDirectory)
              .importThreadCount(importThreadCount)
              .exportThreadCount(exportThreadCount)
              .dbImportCachePercent(dbImportCachePercent)
              .dbTxnWriteNoSync(dbTxnWriteNoSync)
              .deadlockRetryLimit(deadlockRetryLimit)
              .externalTxnDefaultBackendLockBehavior(externalTxnDefaultBackendLockBehavior)
              .singleWriterLockBehavior(singleWriterLockBehavior)
              .subtreeDeleteSizeLimit(subtreeDeleteSizeLimit)
              .numRecentChanges(numRecentChanges)
              .offlineProcessDatabaseOpenTimeout(offlineProcessDatabaseOpenTimeout)
              .backendID(backendID)
              .enabled(enabled)
              .baseDN(baseDN)
              .setDegradedAlertWhenDisabled(setDegradedAlertWhenDisabled)
              .returnUnavailableWhenDisabled(returnUnavailableWhenDisabled)
              .notificationManager(notificationManager)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackendApi#createConfig");
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
| **addLocalDbBackendRequest** | [**AddLocalDbBackendRequest**](AddLocalDbBackendRequest.md)| Create a new Backend in the config | |

### Return type

**Object**

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
| **409** | The Backend already exists |  -  |

<a name="deleteBackend"></a>
# **deleteBackend**
> deleteBackend(backendName).execute();

Delete a Backend

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackendApi;
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
    try {
      client
              .backend
              .deleteBackend(backendName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BackendApi#deleteBackend");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .backend
              .deleteBackend(backendName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BackendApi#deleteBackend");
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
| **404** | The Backend does not exist |  -  |
| **409** | The Backend cannot be deleted |  -  |

<a name="getAllObjects"></a>
# **getAllObjects**
> BackendListResponse getAllObjects().filter(filter).execute();

Returns a list of all Backend objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackendApi;
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
      BackendListResponse result = client
              .backend
              .getAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackendApi#getAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BackendListResponse> response = client
              .backend
              .getAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackendApi#getAllObjects");
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

[**BackendListResponse**](BackendListResponse.md)

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
> Object getSingle(backendName).execute();

Returns a single Backend

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackendApi;
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
    try {
      Object result = client
              .backend
              .getSingle(backendName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BackendApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .backend
              .getSingle(backendName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackendApi#getSingle");
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

### Return type

**Object**

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
| **404** | The Backend does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> Object updateByName(backendName, updateRequest).execute();

Update an existing Backend by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackendApi;
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
    String backendName = "backendName_example"; // Name of the Backend
    try {
      Object result = client
              .backend
              .updateByName(operations, backendName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BackendApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .backend
              .updateByName(operations, backendName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackendApi#updateByName");
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
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Backend | |

### Return type

**Object**

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
| **404** | The Backend does not exist |  -  |


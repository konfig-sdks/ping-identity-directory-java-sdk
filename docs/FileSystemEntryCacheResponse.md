

# FileSystemEntryCacheResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Entry Cache |  [optional] |
|**schemas** | **List&lt;EnumfileSystemEntryCacheSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Entry Cache |  |
|**maxMemorySize** | **String** | The maximum size of the entry cache in bytes. |  [optional] |
|**maxEntries** | **Integer** | The maximum number of entries allowed in the cache. |  [optional] |
|**cacheType** | **EnumentryCacheCacheTypeProp** |  |  [optional] |
|**cacheDirectory** | **String** | Specifies the directory in which the cache database files should be stored. |  [optional] |
|**persistentCache** | **Boolean** | Specifies whether the cache should persist across restarts. |  [optional] |
|**compactEncoding** | **Boolean** | Indicates whether the cache should use a compact form when encoding cache entries by compressing the attribute descriptions and object class sets. |  [optional] |
|**dbCachePercent** | **Integer** | Specifies the maximum memory usage for the internal JE cache as a percentage of the total JVM memory. |  [optional] |
|**dbCacheSize** | **String** | Specifies the maximum JVM memory usage in bytes for the internal JE cache. |  [optional] |
|**jeProperty** | **List&lt;String&gt;** | Specifies the environment properties for the Berkeley DB Java Edition database providing the backend for this entry cache. |  [optional] |
|**includeFilter** | **List&lt;String&gt;** | The set of filters that define the entries that should be included in the cache. |  [optional] |
|**excludeFilter** | **List&lt;String&gt;** | The set of filters that define the entries that should be excluded from the cache. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Entry Cache is enabled. |  |
|**cacheLevel** | **Integer** | Specifies the cache level in the cache order if more than one instance of the cache is configured. |  |
|**cacheUnindexedSearchResults** | **Boolean** | Indicates whether the entry cache should be updated with entries that have been returned to the client during the course of processing an unindexed search. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




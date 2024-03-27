

# FifoEntryCacheResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Entry Cache |  |
|**description** | **String** | A description for this Entry Cache |  [optional] |
|**schemas** | **List&lt;EnumfifoEntryCacheSchemaUrn&gt;** |  |  |
|**maxMemoryPercent** | **Integer** | Specifies the maximum amount of memory, as a percentage of the total maximum JVM heap size, that this cache should occupy when full. If the amount of memory the cache is using is greater than this amount, then an attempt to put a new entry in the cache will be ignored and will cause the oldest entry to be purged. |  [optional] |
|**maxEntries** | **Integer** | Specifies the maximum number of entries that will be allowed in the cache. Once the cache reaches this size, then adding new entries will cause existing entries to be purged, starting with the oldest. |  [optional] |
|**onlyCacheFrequentlyAccessed** | **Boolean** | Specifies that the cache should only store entries which are accessed much more frequently than the average entry. The cache will observe attempts to place entries in the cache and compare an entry&#39;s accesses to the average entry&#39;s. |  [optional] |
|**includeFilter** | **List&lt;String&gt;** | The set of filters that define the entries that should be included in the cache. |  [optional] |
|**excludeFilter** | **List&lt;String&gt;** | The set of filters that define the entries that should be excluded from the cache. |  [optional] |
|**minCacheEntryValueCount** | **Integer** | Specifies the minimum number of attribute values (optionally across a specified subset of attributes as defined in the min-cache-entry-attributes property) for entries that should be held in the cache. Entries with fewer than this number of attribute values will be excluded from the cache. |  [optional] |
|**minCacheEntryAttribute** | **List&lt;String&gt;** | Specifies the names of the attribute types for which the min-cache-entry-value-count property should apply. If no attribute types are specified, then all user attributes will be examined. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Entry Cache is enabled. |  |
|**cacheLevel** | **Integer** | Specifies the cache level in the cache order if more than one instance of the cache is configured. |  |
|**cacheUnindexedSearchResults** | **Boolean** | Indicates whether the entry cache should be updated with entries that have been returned to the client during the course of processing an unindexed search. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




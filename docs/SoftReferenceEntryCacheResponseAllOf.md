

# SoftReferenceEntryCacheResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Entry Cache |  [optional] |
|**schemas** | **List&lt;EnumsoftReferenceEntryCacheSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Entry Cache |  [optional] |
|**includeFilter** | **List&lt;String&gt;** | The set of filters that define the entries that should be included in the cache. |  [optional] |
|**excludeFilter** | **List&lt;String&gt;** | The set of filters that define the entries that should be excluded from the cache. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Entry Cache is enabled. |  [optional] |
|**cacheLevel** | **Integer** | Specifies the cache level in the cache order if more than one instance of the cache is configured. |  [optional] |
|**cacheUnindexedSearchResults** | **Boolean** | Indicates whether the entry cache should be updated with entries that have been returned to the client during the course of processing an unindexed search. |  [optional] |




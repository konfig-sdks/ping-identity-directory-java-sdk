

# SoftReferenceEntryCacheResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Entry Cache |  [optional] |
|**schemas** | **List&lt;EnumsoftReferenceEntryCacheSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Entry Cache |  |
|**includeFilter** | **List&lt;String&gt;** | The set of filters that define the entries that should be included in the cache. |  [optional] |
|**excludeFilter** | **List&lt;String&gt;** | The set of filters that define the entries that should be excluded from the cache. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Entry Cache is enabled. |  |
|**cacheLevel** | **Integer** | Specifies the cache level in the cache order if more than one instance of the cache is configured. |  |
|**cacheUnindexedSearchResults** | **Boolean** | Indicates whether the entry cache should be updated with entries that have been returned to the client during the course of processing an unindexed search. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




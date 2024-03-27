

# LocalDbIndexResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Local DB Index |  |
|**schemas** | **List&lt;EnumlocalDbIndexSchemaUrn&gt;** |  |  [optional] |
|**attribute** | **String** | Specifies the name of the attribute for which the index is to be maintained. |  |
|**indexEntryLimit** | **Integer** | Specifies the maximum number of entries that are allowed to match a given index key before that particular index key is no longer maintained. |  [optional] |
|**substringIndexEntryLimit** | **Integer** | Specifies, for substring indexes, the maximum number of entries that are allowed to match a given index key before that particular index key is no longer maintained. Setting a large limit can dramatically increase the database size on disk and have a big impact on server performance if the indexed attribute is modified frequently. When a very large limit is required, creating a dedicated composite index with an index-filter-pattern of (attr&#x3D;*?*) will give the best balance between search and update performance. |  [optional] |
|**maintainMatchCountForKeysExceedingEntryLimit** | **Boolean** | Indicates whether to continue to maintain a count of the number of matching entries for an index key even after that count exceeds the index entry limit. |  [optional] |
|**indexType** | **List&lt;EnumlocalDbIndexIndexTypeProp&gt;** |  |  |
|**substringLength** | **Integer** | The length of substrings in a substring index. |  [optional] |
|**primeIndex** | **Boolean** | If this option is enabled and this index&#39;s backend is configured to prime indexes, then this index will be loaded at startup. |  [optional] |
|**primeInternalNodesOnly** | **Boolean** | If this option is enabled and this index&#39;s backend is configured to prime indexes using the preload method, then only the internal database nodes (i.e., the database keys but not values) should be primed when the backend is initialized. |  [optional] |
|**equalityIndexFilter** | **List&lt;String&gt;** | A search filter that may be used in conjunction with an equality component for the associated attribute type. If an equality index filter is defined, then an additional equality index will be maintained for the associated attribute, but only for entries which match the provided filter. Further, the index will be used only for searches containing an equality component with the associated attribute type ANDed with this filter. |  [optional] |
|**maintainEqualityIndexWithoutFilter** | **Boolean** | Indicates whether to maintain a separate equality index for the associated attribute without any filter, in addition to maintaining an index for each equality index filter that is defined. If this is false, then the attribute will not be indexed for equality by itself but only in conjunction with the defined equality index filters. |  [optional] |
|**cacheMode** | **EnumlocalDbIndexCacheModeProp** |  |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




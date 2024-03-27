

# AddLocalDbCompositeIndexRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**indexName** | **String** | Name of the new Local DB Composite Index |  |
|**description** | **String** | A description for this Local DB Composite Index |  [optional] |
|**schemas** | **List&lt;EnumlocalDbCompositeIndexSchemaUrn&gt;** |  |  [optional] |
|**indexFilterPattern** | **String** | A filter pattern that identifies which entries to include in the index. |  |
|**indexBaseDNPattern** | **String** | An optional base DN pattern that identifies portions of the DIT in which entries to index may exist. |  [optional] |
|**indexEntryLimit** | **Integer** | The maximum number of entries that any single index key will be allowed to match before the server stops maintaining the ID set for that index key. |  [optional] |
|**primeIndex** | **Boolean** | Indicates whether the server should load the contents of this index into memory when the backend is being opened. |  [optional] |
|**primeInternalNodesOnly** | **Boolean** | Indicates whether to only prime the internal nodes of the index database, rather than priming both internal and leaf nodes. |  [optional] |
|**cacheMode** | **EnumlocalDbCompositeIndexCacheModeProp** |  |  [optional] |




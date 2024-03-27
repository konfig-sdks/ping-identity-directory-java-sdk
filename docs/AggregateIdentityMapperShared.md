

# AggregateIdentityMapperShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Identity Mapper |  [optional] |
|**schemas** | **List&lt;EnumaggregateIdentityMapperSchemaUrn&gt;** |  |  |
|**allIncludedIdentityMapper** | **List&lt;String&gt;** | The set of identity mappers that must all match the target entry. Each identity mapper must uniquely match the same target entry. If any of the identity mappers match multiple entries, if any of them match zero entries, or if any of them match different entries, then the mapping will fail. |  [optional] |
|**anyIncludedIdentityMapper** | **List&lt;String&gt;** | The set of identity mappers that will be used to identify the target entry. At least one identity mapper must uniquely match an entry. If multiple identity mappers match entries, then they must all uniquely match the same entry. If none of the identity mappers match any entries, if any of them match multiple entries, or if any of them match different entries, then the mapping will fail. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Identity Mapper is enabled for use. |  |




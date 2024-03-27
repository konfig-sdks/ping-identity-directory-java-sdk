

# LocalDbVlvIndexResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Local DB VLV Index |  |
|**schemas** | **List&lt;EnumlocalDbVlvIndexSchemaUrn&gt;** |  |  [optional] |
|**baseDN** | **String** | Specifies the base DN used in the search query that is being indexed. |  |
|**scope** | **EnumlocalDbVlvIndexScopeProp** |  |  |
|**filter** | **String** | Specifies the LDAP filter used in the query that is being indexed. |  |
|**sortOrder** | **String** | Specifies the names of the attributes that are used to sort the entries for the query being indexed. |  |
|**name** | **String** | Specifies a unique name for this VLV index. |  |
|**maxBlockSize** | **Integer** | Specifies the number of entry IDs to store in a single sorted set before it must be split. |  [optional] |
|**cacheMode** | **EnumlocalDbVlvIndexCacheModeProp** |  |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




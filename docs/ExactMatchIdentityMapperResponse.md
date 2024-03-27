

# ExactMatchIdentityMapperResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Identity Mapper |  |
|**description** | **String** | A description for this Identity Mapper |  [optional] |
|**schemas** | **List&lt;EnumexactMatchIdentityMapperSchemaUrn&gt;** |  |  |
|**matchAttribute** | **List&lt;String&gt;** | Specifies the attribute whose value should exactly match the ID string provided to this identity mapper. |  |
|**matchBaseDN** | **List&lt;String&gt;** | Specifies the set of base DNs below which to search for users. |  [optional] |
|**matchFilter** | **String** | An optional filter that mapped users must match. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Identity Mapper is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




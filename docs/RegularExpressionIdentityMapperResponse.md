

# RegularExpressionIdentityMapperResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Identity Mapper |  |
|**description** | **String** | A description for this Identity Mapper |  [optional] |
|**schemas** | **List&lt;EnumregularExpressionIdentityMapperSchemaUrn&gt;** |  |  |
|**matchAttribute** | **List&lt;String&gt;** | Specifies the name or OID of the attribute whose value should match the provided identifier string after it has been processed by the associated regular expression. |  |
|**matchBaseDN** | **List&lt;String&gt;** | Specifies the base DN(s) that should be used when performing searches to map the provided ID string to a user entry. If multiple values are given, searches are performed below all the specified base DNs. |  [optional] |
|**matchFilter** | **String** | An optional filter that mapped users must match. |  [optional] |
|**matchPattern** | **String** | Specifies the regular expression pattern that is used to identify portions of the ID string that will be replaced. |  |
|**replacePattern** | **String** | Specifies the replacement pattern that should be used for substrings in the ID string that match the provided regular expression pattern. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Identity Mapper is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# SubjectAttributeToUserAttributeCertificateMapperResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Certificate Mapper |  |
|**description** | **String** | A description for this Certificate Mapper |  [optional] |
|**schemas** | **List&lt;EnumsubjectAttributeToUserAttributeCertificateMapperSchemaUrn&gt;** |  |  |
|**subjectAttributeMapping** | **List&lt;String&gt;** | Specifies a mapping between certificate attributes and user attributes. |  |
|**userBaseDN** | **List&lt;String&gt;** | Specifies the base DNs that should be used when performing searches to map the client certificate to a user entry. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Certificate Mapper is enabled. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




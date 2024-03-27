

# SubjectDnToUserAttributeCertificateMapperResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Certificate Mapper |  |
|**description** | **String** | A description for this Certificate Mapper |  [optional] |
|**schemas** | **List&lt;EnumsubjectDnToUserAttributeCertificateMapperSchemaUrn&gt;** |  |  |
|**subjectAttribute** | **String** | Specifies the name or OID of the attribute whose value should exactly match the certificate subject DN. |  |
|**userBaseDN** | **List&lt;String&gt;** | Specifies the base DNs that should be used when performing searches to map the client certificate to a user entry. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Certificate Mapper is enabled. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# FingerprintCertificateMapperResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Certificate Mapper |  |
|**description** | **String** | A description for this Certificate Mapper |  [optional] |
|**schemas** | **List&lt;EnumfingerprintCertificateMapperSchemaUrn&gt;** |  |  |
|**fingerprintAttribute** | **String** | Specifies the attribute in which to look for the fingerprint. |  |
|**fingerprintAlgorithm** | **EnumcertificateMapperFingerprintAlgorithmProp** |  |  |
|**userBaseDN** | **List&lt;String&gt;** | Specifies the set of base DNs below which to search for users. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Certificate Mapper is enabled. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




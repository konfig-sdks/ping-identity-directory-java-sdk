

# CryptPasswordStorageSchemeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Password Storage Scheme |  |
|**description** | **String** | A description for this Password Storage Scheme |  [optional] |
|**schemas** | **List&lt;EnumcryptPasswordStorageSchemeSchemaUrn&gt;** |  |  |
|**passwordEncodingMechanism** | **EnumpasswordStorageSchemePasswordEncodingMechanismProp** |  |  [optional] |
|**numDigestRounds** | **Integer** | Specifies the number of digest rounds to use for the SHA-2 encodings. This will not be used for the legacy or MD5-based encodings. |  [optional] |
|**maxPasswordLength** | **Integer** | Specifies the maximum allowed length, in bytes, for passwords encoded with this scheme, which can help mitigate denial of service attacks from clients that attempt to bind with very long passwords. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Password Storage Scheme is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




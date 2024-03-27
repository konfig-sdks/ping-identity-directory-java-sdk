

# AzureKeyVaultCipherStreamProviderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Cipher Stream Provider |  |
|**description** | **String** | A description for this Cipher Stream Provider |  [optional] |
|**schemas** | **List&lt;EnumazureKeyVaultCipherStreamProviderSchemaUrn&gt;** |  |  |
|**keyVaultURI** | **String** | The URI that identifies the Azure Key Vault from which the secret is to be retrieved. |  |
|**azureAuthenticationMethod** | **String** | The mechanism used to authenticate to the Azure service. |  |
|**httpProxyExternalServer** | **String** | A reference to an HTTP proxy server that should be used for requests sent to the Azure service. |  [optional] |
|**secretName** | **String** | The name of the secret to retrieve. |  |
|**encryptionMetadataFile** | **String** | The path to a file that will hold metadata about the encryption performed by this Azure Key Vault Cipher Stream Provider. |  |
|**iterationCount** | **Integer** | The PBKDF2 iteration count that will be used when deriving the encryption key used to protect the encryption settings database. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Cipher Stream Provider is enabled for use in the Directory Server. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# ConjurCipherStreamProviderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Cipher Stream Provider |  |
|**description** | **String** | A description for this Cipher Stream Provider |  [optional] |
|**schemas** | **List&lt;EnumconjurCipherStreamProviderSchemaUrn&gt;** |  |  |
|**conjurExternalServer** | **String** | An external server definition with information needed to connect and authenticate to the Conjur server. |  |
|**conjurSecretRelativePath** | **String** | The portion of the path that follows the account name in the URI needed to obtain the secret passphrase to use to generate the encryption key. Any special characters in the path must be URL-encoded. |  |
|**encryptionMetadataFile** | **String** | The path to a file that will hold metadata about the encryption performed by this Conjur Cipher Stream Provider. |  |
|**iterationCount** | **Integer** | The PBKDF2 iteration count that will be used when deriving the encryption key used to protect the encryption settings database. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Cipher Stream Provider is enabled for use in the Directory Server. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




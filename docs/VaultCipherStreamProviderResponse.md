

# VaultCipherStreamProviderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Cipher Stream Provider |  |
|**description** | **String** | A description for this Cipher Stream Provider |  [optional] |
|**schemas** | **List&lt;EnumvaultCipherStreamProviderSchemaUrn&gt;** |  |  |
|**vaultExternalServer** | **String** | An external server definition with information needed to connect and authenticate to the Vault server. |  [optional] |
|**vaultServerBaseURI** | **List&lt;String&gt;** | The base URL needed to access the Vault server. The base URL should consist of the protocol (\&quot;http\&quot; or \&quot;https\&quot;), the server address (resolvable name or IP address), and the port number. For example, \&quot;https://vault.example.com:8200/\&quot;. |  [optional] |
|**vaultAuthenticationMethod** | **String** | The mechanism used to authenticate to the Vault server. |  [optional] |
|**vaultSecretPath** | **String** | The path to the desired secret in the Vault service. This will be appended to the value of the base-url property for the associated Vault external server. |  |
|**vaultSecretFieldName** | **String** | The name of the field in the Vault secret record that contains the passphrase to use to generate the encryption key. |  |
|**vaultEncryptionMetadataFile** | **String** | The path to a file that will hold metadata about the encryption performed by this Vault Cipher Stream Provider. |  |
|**trustStoreFile** | **String** | The path to a file containing the information needed to trust the certificate presented by the Vault servers. |  [optional] |
|**trustStorePin** | **String** | The passphrase needed to access the contents of the trust store. This is only required if a trust store file is required, and if that trust store requires a PIN to access its contents. |  [optional] |
|**trustStoreType** | **String** | The store type for the specified trust store file. The value should likely be one of \&quot;JKS\&quot; or \&quot;PKCS12\&quot;. |  [optional] |
|**iterationCount** | **Integer** | The PBKDF2 iteration count that will be used when deriving the encryption key used to protect the encryption settings database. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Cipher Stream Provider is enabled for use in the Directory Server. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




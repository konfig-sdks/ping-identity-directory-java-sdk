

# VaultPassphraseProviderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Passphrase Provider |  |
|**description** | **String** | A description for this Passphrase Provider |  [optional] |
|**schemas** | **List&lt;EnumvaultPassphraseProviderSchemaUrn&gt;** |  |  |
|**vaultExternalServer** | **String** | An external server definition with information needed to connect and authenticate to the Vault instance containing the passphrase. |  |
|**vaultSecretPath** | **String** | The path to the desired secret in the Vault service. This will be appended to the value of the base-url property for the associated Vault external server. |  |
|**vaultSecretFieldName** | **String** | The name of the field in the Vault secret record that contains the passphrase to use to generate the encryption key. |  |
|**maxCacheDuration** | **String** | The maximum length of time that the passphrase provider may cache the passphrase that has been read from Vault. A value of zero seconds indicates that the provider should always attempt to read the passphrase from Vault. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Passphrase Provider is enabled for use in the server. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




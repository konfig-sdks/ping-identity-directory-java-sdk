

# AmazonSecretsManagerPassphraseProviderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Passphrase Provider |  |
|**description** | **String** | A description for this Passphrase Provider |  [optional] |
|**schemas** | **List&lt;EnumamazonSecretsManagerPassphraseProviderSchemaUrn&gt;** |  |  |
|**awsExternalServer** | **String** | The external server with information to use when interacting with the AWS Secrets Manager. |  |
|**secretID** | **String** | The Amazon Resource Name (ARN) or the user-friendly name of the secret to be retrieved. |  |
|**secretFieldName** | **String** | The name of the JSON field whose value is the passphrase that will be retrieved. |  |
|**secretVersionID** | **String** | The unique identifier for the version of the secret to be retrieved. |  [optional] |
|**secretVersionStage** | **String** | The staging label for the version of the secret to be retrieved. |  [optional] |
|**maxCacheDuration** | **String** | The maximum length of time that the passphrase provider may cache the passphrase that has been read from Vault. A value of zero seconds indicates that the provider should always attempt to read the passphrase from Vault. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Passphrase Provider is enabled for use in the server. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




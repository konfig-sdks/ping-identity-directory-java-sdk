

# AddAmazonSecretsManagerCipherStreamProviderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerName** | **String** | Name of the new Cipher Stream Provider |  |
|**description** | **String** | A description for this Cipher Stream Provider |  [optional] |
|**schemas** | **List&lt;EnumamazonSecretsManagerCipherStreamProviderSchemaUrn&gt;** |  |  |
|**awsExternalServer** | **String** | The external server with information to use when interacting with the AWS Secrets Manager. |  |
|**secretID** | **String** | The Amazon Resource Name (ARN) or the user-friendly name of the secret to be retrieved. |  |
|**secretFieldName** | **String** | The name of the JSON field whose value is the passphrase that will be used to generate the encryption key for protecting the contents of the encryption settings database. |  |
|**secretVersionID** | **String** | The unique identifier for the version of the secret to be retrieved. |  [optional] |
|**secretVersionStage** | **String** | The staging label for the version of the secret to be retrieved. |  [optional] |
|**encryptionMetadataFile** | **String** | The path to a file that will hold metadata about the encryption performed by this Amazon Secrets Manager Cipher Stream Provider. |  [optional] |
|**iterationCount** | **Integer** | The PBKDF2 iteration count that will be used when deriving the encryption key used to protect the encryption settings database. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Cipher Stream Provider is enabled for use in the Directory Server. |  |




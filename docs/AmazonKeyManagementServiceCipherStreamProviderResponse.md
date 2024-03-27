

# AmazonKeyManagementServiceCipherStreamProviderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Cipher Stream Provider |  |
|**description** | **String** | A description for this Cipher Stream Provider |  [optional] |
|**schemas** | **List&lt;EnumamazonKeyManagementServiceCipherStreamProviderSchemaUrn&gt;** |  |  |
|**encryptedPassphraseFile** | **String** | The path to a file that will hold the encrypted passphrase used by this cipher stream provider. |  |
|**awsExternalServer** | **String** | The external server with information to use when interacting with the Amazon Key Management Service. |  [optional] |
|**awsAccessKeyID** | **String** | The access key ID that will be used if this cipher stream provider will authenticate to the Amazon Key Management Service using an access key rather than an IAM role associated with an EC2 instance. |  [optional] |
|**awsSecretAccessKey** | **String** | The secret access key that will be used if this cipher stream provider will authenticate to the Amazon Key Management Service using an access key rather than an IAM role associated with an EC2 instance. |  [optional] |
|**awsRegionName** | **String** | The name of the Amazon Web Services region that holds the encryption key. This is optional, and if it is not provided, then the server will attempt to determine the region from the key ARN. |  [optional] |
|**kmsEncryptionKeyArn** | **String** | The Amazon resource name (ARN) for the KMS key that will be used to encrypt the contents of the passphrase file. This key must exist, and the AWS client must have access to encrypt and decrypt data using this key. |  |
|**iterationCount** | **Integer** | The PBKDF2 iteration count that will be used when deriving the encryption key used to protect the encryption settings database. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Cipher Stream Provider is enabled for use in the Directory Server. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




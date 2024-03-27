

# FileBasedCipherStreamProviderShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Cipher Stream Provider |  [optional] |
|**schemas** | **List&lt;EnumfileBasedCipherStreamProviderSchemaUrn&gt;** |  |  |
|**passwordFile** | **String** | The path to the file containing the password to use when generating ciphers. |  |
|**waitForPasswordFile** | **Boolean** | Indicates whether the server should wait for the password file to become available if it does not exist. |  [optional] |
|**encryptionMetadataFile** | **String** | The path to a file that will hold metadata about the encryption performed by this File Based Cipher Stream Provider. |  [optional] |
|**iterationCount** | **Integer** | The PBKDF2 iteration count that will be used when deriving the encryption key used to protect the encryption settings database. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Cipher Stream Provider is enabled for use in the Directory Server. |  |




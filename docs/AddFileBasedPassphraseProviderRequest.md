

# AddFileBasedPassphraseProviderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerName** | **String** | Name of the new Passphrase Provider |  |
|**description** | **String** | A description for this Passphrase Provider |  [optional] |
|**schemas** | **List&lt;EnumfileBasedPassphraseProviderSchemaUrn&gt;** |  |  |
|**passwordFile** | **String** | The path to the file containing the passphrase. |  |
|**maxCacheDuration** | **String** | The maximum length of time that the passphrase provider may cache the passphrase that has been read from the target file. A value of zero seconds indicates that the provider should always attempt to read the passphrase from the file. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Passphrase Provider is enabled for use in the server. |  |




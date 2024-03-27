

# ConjurPassphraseProviderShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Passphrase Provider |  [optional] |
|**schemas** | **List&lt;EnumconjurPassphraseProviderSchemaUrn&gt;** |  |  |
|**conjurExternalServer** | **String** | An external server definition with information needed to connect and authenticate to the Conjur instance containing the passphrase. |  |
|**conjurSecretRelativePath** | **String** | The portion of the path that follows the account name in the URI needed to obtain the desired secret. Any special characters in the path must be URL-encoded. |  |
|**maxCacheDuration** | **String** | The maximum length of time that the passphrase provider may cache the passphrase that has been read from Conjur. A value of zero seconds indicates that the provider should always attempt to read the passphrase from Conjur. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Passphrase Provider is enabled for use in the server. |  |




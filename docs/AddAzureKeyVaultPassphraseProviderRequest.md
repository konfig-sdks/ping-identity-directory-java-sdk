

# AddAzureKeyVaultPassphraseProviderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerName** | **String** | Name of the new Passphrase Provider |  |
|**description** | **String** | A description for this Passphrase Provider |  [optional] |
|**schemas** | **List&lt;EnumazureKeyVaultPassphraseProviderSchemaUrn&gt;** |  |  |
|**keyVaultURI** | **String** | The URI that identifies the Azure Key Vault from which the secret is to be retrieved. |  |
|**azureAuthenticationMethod** | **String** | The mechanism used to authenticate to the Azure service. |  |
|**httpProxyExternalServer** | **String** | A reference to an HTTP proxy server that should be used for requests sent to the Azure service. |  [optional] |
|**secretName** | **String** | The name of the secret to retrieve. |  |
|**maxCacheDuration** | **String** | The maximum length of time that the passphrase provider may cache the passphrase that has been read from Azure Key Vault. A value of zero seconds indicates that the provider should always attempt to read the passphrase from the Azure service. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Passphrase Provider is enabled for use in the server. |  |




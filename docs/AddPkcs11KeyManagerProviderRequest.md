

# AddPkcs11KeyManagerProviderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerName** | **String** | Name of the new Key Manager Provider |  |
|**description** | **String** | A description for this Key Manager Provider |  [optional] |
|**schemas** | **List&lt;Enumpkcs11KeyManagerProviderSchemaUrn&gt;** |  |  |
|**pkcs11ProviderClass** | **String** | The fully-qualified name of the Java security provider class that implements support for interacting with PKCS #11 tokens. |  [optional] |
|**pkcs11ProviderConfigurationFile** | **String** | The path to the file to use to configure the security provider that implements support for interacting with PKCS #11 tokens. |  [optional] |
|**pkcs11KeyStoreType** | **String** | The key store type to use when obtaining an instance of a key store for interacting with a PKCS #11 token. |  [optional] |
|**pkcs11MaxCacheDuration** | **String** | The maximum length of time that data retrieved from PKCS #11 tokens may be cached for reuse. Caching might be necessary if there is noticable latency when accessing the token, for example if the token uses a remote key store. A value of zero milliseconds indicates that no caching should be performed. |  [optional] |
|**keyStorePin** | **String** | Specifies the PIN needed to access the PKCS11 Key Manager Provider. |  [optional] |
|**keyStorePinFile** | **String** | Specifies the path to the text file whose only contents should be a single line containing the clear-text PIN needed to access the PKCS11 Key Manager Provider. |  [optional] |
|**keyStorePinPassphraseProvider** | **String** | The passphrase provider to use to obtain the clear-text PIN needed to access the PKCS11 Key Manager Provider. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Key Manager Provider is enabled for use. |  |




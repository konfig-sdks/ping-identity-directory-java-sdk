

# AddFileBasedKeyManagerProviderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerName** | **String** | Name of the new Key Manager Provider |  |
|**description** | **String** | A description for this Key Manager Provider |  [optional] |
|**schemas** | **List&lt;EnumfileBasedKeyManagerProviderSchemaUrn&gt;** |  |  |
|**keyStoreFile** | **String** | Specifies the path to the file that contains the private key information. This may be an absolute path, or a path that is relative to the Directory Server instance root. |  |
|**keyStoreType** | **String** | Specifies the format for the data in the key store file. |  [optional] |
|**keyStorePin** | **String** | Specifies the PIN needed to access the File Based Key Manager Provider. |  [optional] |
|**keyStorePinFile** | **String** | Specifies the path to the text file whose only contents should be a single line containing the clear-text PIN needed to access the File Based Key Manager Provider. |  [optional] |
|**keyStorePinPassphraseProvider** | **String** | The passphrase provider to use to obtain the clear-text PIN needed to access the File Based Key Manager Provider. |  [optional] |
|**privateKeyPin** | **String** | Specifies the clear-text PIN needed to access the File Based Key Manager Provider private key. If no private key PIN is specified the PIN defaults to the key store PIN. |  [optional] |
|**privateKeyPinFile** | **String** | Specifies the path to the text file whose only contents should be a single line containing the clear-text PIN needed to access the File Based Key Manager Provider private key. If no private key PIN is specified the PIN defaults to the key store PIN. |  [optional] |
|**privateKeyPinPassphraseProvider** | **String** | The passphrase provider to use to obtain the clear-text PIN needed to access the File Based Key Manager Provider private key. If no private key PIN is specified the PIN defaults to the key store PIN. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Key Manager Provider is enabled for use. |  |




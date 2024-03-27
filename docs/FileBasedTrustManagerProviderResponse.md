

# FileBasedTrustManagerProviderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Trust Manager Provider |  |
|**schemas** | **List&lt;EnumfileBasedTrustManagerProviderSchemaUrn&gt;** |  |  |
|**trustStoreFile** | **String** | Specifies the path to the file containing the trust information. It can be an absolute path or a path that is relative to the Directory Server instance root. |  |
|**trustStoreType** | **String** | Specifies the format for the data in the trust store file. |  [optional] |
|**trustStorePin** | **String** | Specifies the clear-text PIN needed to access the File Based Trust Manager Provider. |  [optional] |
|**trustStorePinFile** | **String** | Specifies the path to the text file whose only contents should be a single line containing the clear-text PIN needed to access the File Based Trust Manager Provider. |  [optional] |
|**trustStorePinPassphraseProvider** | **String** | The passphrase provider to use to obtain the clear-text PIN needed to access the File Based Trust Manager Provider. |  [optional] |
|**enabled** | **Boolean** | Indicate whether the Trust Manager Provider is enabled for use. |  |
|**includeJVMDefaultIssuers** | **Boolean** | Indicates whether certificates issued by an authority included in the JVM&#39;s set of default issuers should be automatically trusted, even if they would not otherwise be trusted by this provider. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




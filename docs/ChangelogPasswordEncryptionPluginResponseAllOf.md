

# ChangelogPasswordEncryptionPluginResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumchangelogPasswordEncryptionPluginSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Plugin |  [optional] |
|**changelogPasswordEncryptionKey** | **String** | A passphrase that may be used to generate the key for encrypting passwords stored in the changelog. The same passphrase also needs to be set (either through the \&quot;changelog-password-decryption-key\&quot; property or the \&quot;changelog-password-decryption-key-passphrase-provider\&quot; property) in the Global Sync Configuration in the Data Sync Server. |  [optional] |
|**changelogPasswordEncryptionKeyPassphraseProvider** | **String** | A passphrase provider that may be used to obtain the passphrase that will be used to generate the key for encrypting passwords stored in the changelog. The same passphrase also needs to be set (either through the \&quot;changelog-password-decryption-key\&quot; property or the \&quot;changelog-password-decryption-key-passphrase-provider\&quot; property) in the Global Sync Configuration in the Data Sync Server. |  [optional] |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  [optional] |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




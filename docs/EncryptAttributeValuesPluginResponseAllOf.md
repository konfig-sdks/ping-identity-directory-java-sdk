

# EncryptAttributeValuesPluginResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumencryptAttributeValuesPluginSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Plugin |  [optional] |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  [optional] |
|**attributeType** | **List&lt;EnumpluginAttributeTypeProp&gt;** |  |  [optional] |
|**encryptionSettingsDefinitionID** | **String** | Specifies the ID of the encryption settings definition that should be used to encrypt the data. If this is not provided, the server&#39;s preferred encryption settings definition will be used. The \&quot;encryption-settings list\&quot; command can be used to obtain a list of the encryption settings definitions available in the server. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  [optional] |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |






# AddSevenBitCleanPluginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pluginName** | **String** | Name of the new Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumsevenBitCleanPluginSchemaUrn&gt;** |  |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  [optional] |
|**attributeType** | **List&lt;String&gt;** | Specifies the name or OID of an attribute type for which values should be checked to ensure that they are 7-bit clean. |  [optional] |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN below which the checking is performed. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |






# AddReferentialIntegrityPluginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pluginName** | **String** | Name of the new Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumreferentialIntegrityPluginSchemaUrn&gt;** |  |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  [optional] |
|**attributeType** | **List&lt;String&gt;** | Specifies the attribute types for which referential integrity is to be maintained. |  |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN that limits the scope within which referential integrity is maintained. |  [optional] |
|**logFile** | **String** | Specifies the log file location where the update records are written when the plug-in is in background-mode processing. |  [optional] |
|**updateInterval** | **String** | Specifies the interval in seconds when referential integrity updates are made. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




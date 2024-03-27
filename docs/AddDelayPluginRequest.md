

# AddDelayPluginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pluginName** | **String** | Name of the new Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumdelayPluginSchemaUrn&gt;** |  |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  [optional] |
|**delay** | **String** | The delay to inject for operations matching the associated criteria. |  |
|**connectionCriteria** | **String** | Specifies a set of connection criteria used to indicate that only operations from clients matching this criteria should be subject to the configured delay. |  [optional] |
|**requestCriteria** | **String** | Specifies a set of request criteria used to indicate that only operations for requests matching this criteria should be subject to the configured delay. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




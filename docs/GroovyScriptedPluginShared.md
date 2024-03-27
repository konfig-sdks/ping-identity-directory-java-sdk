

# GroovyScriptedPluginShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumgroovyScriptedPluginSchemaUrn&gt;** |  |  |
|**scriptClass** | **String** | The fully-qualified name of the Groovy class providing the logic for the Groovy Scripted Plugin. |  |
|**requestCriteria** | **String** | Specifies a set of request criteria that may be used to indicate that this Groovy Scripted Plugin should only be invoked for operations in which the associated request matches this criteria. |  [optional] |
|**scriptArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Scripted Plugin. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




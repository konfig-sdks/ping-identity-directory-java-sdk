

# ThirdPartyPluginShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyPluginSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Plugin. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Plugin. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**requestCriteria** | **String** | Specifies a set of request criteria that may be used to indicate that this Third Party Plugin should only be invoked for operations in which the associated request matches this criteria. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




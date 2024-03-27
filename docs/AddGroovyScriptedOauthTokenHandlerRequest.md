

# AddGroovyScriptedOauthTokenHandlerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**handlerName** | **String** | Name of the new OAuth Token Handler |  |
|**description** | **String** | A description for this OAuth Token Handler |  [optional] |
|**schemas** | **List&lt;EnumgroovyScriptedOauthTokenHandlerSchemaUrn&gt;** |  |  |
|**scriptClass** | **String** | The fully-qualified name of the Groovy class providing the logic for the Groovy Scripted OAuth Token Handler. |  |
|**scriptArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Scripted OAuth Token Handler. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |




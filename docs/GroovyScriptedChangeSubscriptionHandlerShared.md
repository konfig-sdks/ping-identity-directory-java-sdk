

# GroovyScriptedChangeSubscriptionHandlerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Change Subscription Handler |  [optional] |
|**schemas** | **List&lt;EnumgroovyScriptedChangeSubscriptionHandlerSchemaUrn&gt;** |  |  |
|**scriptClass** | **String** | The fully-qualified name of the Groovy class providing the logic for the Groovy Scripted Change Subscription Handler. |  |
|**scriptArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Scripted Change Subscription Handler. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this change subscription handler is enabled within the server. |  |
|**changeSubscription** | **List&lt;String&gt;** | The set of change subscriptions for which this change subscription handler should be notified. If no values are provided then it will be notified for all change subscriptions defined in the server. |  [optional] |




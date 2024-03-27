

# AddGroovyScriptedHttpOperationLogPublisherRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**publisherName** | **String** | Name of the new Log Publisher |  |
|**description** | **String** | A description for this Log Publisher |  [optional] |
|**schemas** | **List&lt;EnumgroovyScriptedHttpOperationLogPublisherSchemaUrn&gt;** |  |  |
|**scriptClass** | **String** | The fully-qualified name of the Groovy class providing the logic for the Groovy Scripted HTTP Operation Log Publisher. |  |
|**scriptArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Scripted HTTP Operation Log Publisher. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Log Publisher is enabled for use. |  |
|**loggingErrorBehavior** | **EnumlogPublisherLoggingErrorBehaviorProp** |  |  [optional] |




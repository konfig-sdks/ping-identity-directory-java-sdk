

# GroovyScriptedErrorLogPublisherShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Log Publisher |  [optional] |
|**schemas** | **List&lt;EnumgroovyScriptedErrorLogPublisherSchemaUrn&gt;** |  |  |
|**scriptClass** | **String** | The fully-qualified name of the Groovy class providing the logic for the Groovy Scripted Error Log Publisher. |  |
|**scriptArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Scripted Error Log Publisher. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**defaultSeverity** | **List&lt;EnumlogPublisherDefaultSeverityProp&gt;** |  |  [optional] |
|**overrideSeverity** | **List&lt;String&gt;** | Specifies the override severity levels for the logger based on the category of the messages. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Log Publisher is enabled for use. |  |
|**loggingErrorBehavior** | **EnumlogPublisherLoggingErrorBehaviorProp** |  |  [optional] |




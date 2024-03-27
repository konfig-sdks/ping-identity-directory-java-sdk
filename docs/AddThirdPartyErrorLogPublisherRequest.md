

# AddThirdPartyErrorLogPublisherRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**publisherName** | **String** | Name of the new Log Publisher |  |
|**description** | **String** | A description for this Log Publisher |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyErrorLogPublisherSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Error Log Publisher. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Error Log Publisher. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**defaultSeverity** | **List&lt;EnumlogPublisherDefaultSeverityProp&gt;** |  |  [optional] |
|**overrideSeverity** | **List&lt;String&gt;** | Specifies the override severity levels for the logger based on the category of the messages. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Log Publisher is enabled for use. |  |
|**loggingErrorBehavior** | **EnumlogPublisherLoggingErrorBehaviorProp** |  |  [optional] |




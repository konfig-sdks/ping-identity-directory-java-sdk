

# ThirdPartyAlertHandlerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Alert Handler |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyAlertHandlerSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Alert Handler. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Alert Handler. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Alert Handler is enabled. |  |
|**asynchronous** | **Boolean** | Indicates whether the server should attempt to invoke this Alert Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver the alert notification) will not delay whatever processing the server was performing when the alert was generated. |  [optional] |
|**enabledAlertSeverity** | **List&lt;EnumalertHandlerEnabledAlertSeverityProp&gt;** |  |  [optional] |
|**enabledAlertType** | **List&lt;EnumalertHandlerEnabledAlertTypeProp&gt;** |  |  [optional] |
|**disabledAlertType** | **List&lt;EnumalertHandlerDisabledAlertTypeProp&gt;** |  |  [optional] |




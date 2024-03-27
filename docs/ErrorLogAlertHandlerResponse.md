

# ErrorLogAlertHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Alert Handler |  |
|**description** | **String** | A description for this Alert Handler |  [optional] |
|**schemas** | **List&lt;EnumerrorLogAlertHandlerSchemaUrn&gt;** |  |  |
|**enabled** | **Boolean** | Indicates whether the Alert Handler is enabled. |  |
|**asynchronous** | **Boolean** | Indicates whether the server should attempt to invoke this Alert Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver the alert notification) will not delay whatever processing the server was performing when the alert was generated. |  [optional] |
|**enabledAlertSeverity** | **List&lt;EnumalertHandlerEnabledAlertSeverityProp&gt;** |  |  [optional] |
|**enabledAlertType** | **List&lt;EnumalertHandlerEnabledAlertTypeProp&gt;** |  |  [optional] |
|**disabledAlertType** | **List&lt;EnumalertHandlerDisabledAlertTypeProp&gt;** |  |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




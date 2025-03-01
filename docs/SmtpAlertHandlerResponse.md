

# SmtpAlertHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Alert Handler |  |
|**description** | **String** | A description for this Alert Handler |  [optional] |
|**schemas** | **List&lt;EnumsmtpAlertHandlerSchemaUrn&gt;** |  |  |
|**asynchronous** | **Boolean** | Indicates whether the server should attempt to invoke this SMTP Alert Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver the alert notification) will not delay whatever processing the server was performing when the alert was generated. |  [optional] |
|**senderAddress** | **String** | Specifies the email address to use as the sender for messages generated by this alert handler. |  |
|**recipientAddress** | **List&lt;String&gt;** | Specifies an email address to which the messages should be sent. |  |
|**messageSubject** | **String** | Specifies the subject that should be used for email messages generated by this alert handler. |  |
|**messageBody** | **String** | Specifies the body that should be used for email messages generated by this alert handler. |  |
|**includeMonitorDataFilter** | **String** | Include monitor entries that match this filter. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Alert Handler is enabled. |  |
|**enabledAlertSeverity** | **List&lt;EnumalertHandlerEnabledAlertSeverityProp&gt;** |  |  [optional] |
|**enabledAlertType** | **List&lt;EnumalertHandlerEnabledAlertTypeProp&gt;** |  |  [optional] |
|**disabledAlertType** | **List&lt;EnumalertHandlerDisabledAlertTypeProp&gt;** |  |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# AddTwilioAlertHandlerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**handlerName** | **String** | Name of the new Alert Handler |  |
|**description** | **String** | A description for this Alert Handler |  [optional] |
|**schemas** | **List&lt;EnumtwilioAlertHandlerSchemaUrn&gt;** |  |  |
|**asynchronous** | **Boolean** | Indicates whether the server should attempt to invoke this Twilio Alert Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver the alert notification) will not delay whatever processing the server was performing when the alert was generated. |  [optional] |
|**httpProxyExternalServer** | **String** | A reference to an HTTP proxy server that should be used for requests sent to the Twilio service. |  [optional] |
|**twilioAccountSID** | **String** | The unique identifier assigned to the Twilio account that will be used. |  |
|**twilioAuthToken** | **String** | The auth token for the Twilio account that will be used. |  [optional] |
|**twilioAuthTokenPassphraseProvider** | **String** | The passphrase provider that may be used to obtain the auth token for the Twilio account that will be used. |  [optional] |
|**senderPhoneNumber** | **List&lt;String&gt;** | The outgoing phone number to use for the messages. Values must be phone numbers you have obtained for use with your Twilio account. |  |
|**recipientPhoneNumber** | **List&lt;String&gt;** | The phone number to which alert notifications should be delivered. |  |
|**longMessageBehavior** | **EnumalertHandlerLongMessageBehaviorProp** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Alert Handler is enabled. |  |
|**enabledAlertSeverity** | **List&lt;EnumalertHandlerEnabledAlertSeverityProp&gt;** |  |  [optional] |
|**enabledAlertType** | **List&lt;EnumalertHandlerEnabledAlertTypeProp&gt;** |  |  [optional] |
|**disabledAlertType** | **List&lt;EnumalertHandlerDisabledAlertTypeProp&gt;** |  |  [optional] |




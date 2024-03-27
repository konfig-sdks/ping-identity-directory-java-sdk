

# TwilioOtpDeliveryMechanismShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this OTP Delivery Mechanism |  [optional] |
|**schemas** | **List&lt;EnumtwilioOtpDeliveryMechanismSchemaUrn&gt;** |  |  |
|**httpProxyExternalServer** | **String** | A reference to an HTTP proxy server that should be used for requests sent to the Twilio service. |  [optional] |
|**twilioAccountSID** | **String** | The unique identifier assigned to the Twilio account that will be used. |  |
|**twilioAuthToken** | **String** | The auth token for the Twilio account that will be used. |  [optional] |
|**twilioAuthTokenPassphraseProvider** | **String** | The passphrase provider that may be used to obtain the auth token for the Twilio account that will be used. |  [optional] |
|**phoneNumberAttributeType** | **String** | The name or OID of the attribute in the user&#39;s entry that holds the phone number to which the message should be sent. |  [optional] |
|**phoneNumberJSONField** | **String** | The name of the JSON field whose value is the phone number to which the message should be sent. The phone number must be contained in a top-level field whose value is a single string. |  [optional] |
|**phoneNumberJSONObjectFilter** | **String** | A JSON object filter that may be used to identify which phone number value to use when sending the message. |  [optional] |
|**senderPhoneNumber** | **List&lt;String&gt;** | The outgoing phone number to use for the messages. Values must be phone numbers you have obtained for use with your Twilio account. |  |
|**messageTextBeforeOTP** | **String** | Any text that should appear in the message before the one-time password value. |  [optional] |
|**messageTextAfterOTP** | **String** | Any text that should appear in the message after the one-time password value. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this OTP Delivery Mechanism is enabled for use in the server. |  |




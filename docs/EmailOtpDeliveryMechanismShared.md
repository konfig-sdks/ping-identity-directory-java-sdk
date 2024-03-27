

# EmailOtpDeliveryMechanismShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this OTP Delivery Mechanism |  [optional] |
|**schemas** | **List&lt;EnumemailOtpDeliveryMechanismSchemaUrn&gt;** |  |  |
|**emailAddressAttributeType** | **String** | The name or OID of the attribute that holds the email address to which the message should be sent. |  [optional] |
|**emailAddressJSONField** | **String** | The name of the JSON field whose value is the email address to which the message should be sent. The email address must be contained in a top-level field whose value is a single string. |  [optional] |
|**emailAddressJSONObjectFilter** | **String** | A JSON object filter that may be used to identify which email address value to use when sending the message. |  [optional] |
|**senderAddress** | **String** | The e-mail address to use as the sender for the one-time password. |  |
|**messageSubject** | **String** | The subject to use for the e-mail message. |  [optional] |
|**messageTextBeforeOTP** | **String** | Any text that should appear in the message before the one-time password value. |  [optional] |
|**messageTextAfterOTP** | **String** | Any text that should appear in the message after the one-time password value. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this OTP Delivery Mechanism is enabled for use in the server. |  |






# DeliverOtpExtendedOperationHandlerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Extended Operation Handler |  [optional] |
|**schemas** | **List&lt;EnumdeliverOtpExtendedOperationHandlerSchemaUrn&gt;** |  |  |
|**identityMapper** | **String** | The identity mapper that should be used to identify the user(s) targeted by the authentication identity contained in the extended request. This will only be used for \&quot;u:\&quot;-style authentication identities. |  |
|**passwordGenerator** | **String** | The password generator that will be used to create the one-time password values to be delivered to the end user. |  |
|**defaultOTPDeliveryMechanism** | **List&lt;String&gt;** | The set of delivery mechanisms that may be used to deliver one-time passwords to users in requests that do not specify one or more preferred delivery mechanisms. |  |
|**enabled** | **Boolean** | Indicates whether the Extended Operation Handler is enabled (that is, whether the types of extended operations are allowed in the server). |  |






# DeliverPasswordResetTokenExtendedOperationHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Extended Operation Handler |  |
|**description** | **String** | A description for this Extended Operation Handler |  [optional] |
|**schemas** | **List&lt;EnumdeliverPasswordResetTokenExtendedOperationHandlerSchemaUrn&gt;** |  |  |
|**passwordGenerator** | **String** | The password generator that will be used to create the password reset token values to be delivered to the end user. |  |
|**defaultTokenDeliveryMechanism** | **List&lt;String&gt;** | The set of delivery mechanisms that may be used to deliver password reset tokens to users for requests that do not specify one or more preferred delivery mechanisms. |  |
|**passwordResetTokenValidityDuration** | **String** | The maximum length of time that a password reset token should be considered valid. |  |
|**enabled** | **Boolean** | Indicates whether the Extended Operation Handler is enabled (that is, whether the types of extended operations are allowed in the server). |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




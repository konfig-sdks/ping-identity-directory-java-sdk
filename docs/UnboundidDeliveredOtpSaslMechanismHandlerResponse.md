

# UnboundidDeliveredOtpSaslMechanismHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the SASL Mechanism Handler |  |
|**description** | **String** | A description for this SASL Mechanism Handler |  [optional] |
|**schemas** | **List&lt;EnumunboundidDeliveredOtpSaslMechanismHandlerSchemaUrn&gt;** |  |  |
|**identityMapper** | **String** | The identity mapper that should be used to identify the user(s) targeted in the authentication and/or authorization identities contained in the bind request. This will only be used for \&quot;u:\&quot;-style identities. |  |
|**otpValidityDuration** | **String** | The maximum length of time that a one-time password value should be considered valid. |  |
|**enabled** | **Boolean** | Indicates whether the SASL mechanism handler is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




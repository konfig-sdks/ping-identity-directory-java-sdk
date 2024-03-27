

# UnboundidTotpSaslMechanismHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this SASL Mechanism Handler |  [optional] |
|**schemas** | **List&lt;EnumunboundidTotpSaslMechanismHandlerSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the SASL Mechanism Handler |  |
|**identityMapper** | **String** | The identity mapper that should be used to identify the user(s) targeted in the authentication and/or authorization identities contained in the bind request. This will only be used for \&quot;u:\&quot;-style identities. |  |
|**sharedSecretAttributeType** | **String** | The name or OID of the attribute that will be used to hold the shared secret key used during TOTP processing. |  [optional] |
|**timeIntervalDuration** | **String** | The duration of the time interval used for TOTP processing. |  [optional] |
|**adjacentIntervalsToCheck** | **Integer** | The number of adjacent time intervals (both before and after the current time) that should be checked when performing authentication. |  [optional] |
|**requireStaticPassword** | **Boolean** | Indicates whether to require a static password (as might be held in the userPassword attribute, or whatever password attribute is defined in the password policy governing the user) in addition to the one-time password. |  [optional] |
|**preventTOTPReuse** | **Boolean** | Indicates whether to prevent clients from re-using TOTP passwords. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the SASL mechanism handler is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




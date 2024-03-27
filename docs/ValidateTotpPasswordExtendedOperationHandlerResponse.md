

# ValidateTotpPasswordExtendedOperationHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Extended Operation Handler |  |
|**description** | **String** | A description for this Extended Operation Handler |  [optional] |
|**schemas** | **List&lt;EnumvalidateTotpPasswordExtendedOperationHandlerSchemaUrn&gt;** |  |  |
|**sharedSecretAttributeType** | **String** | The name or OID of the attribute that will be used to hold the shared secret key used during TOTP processing. |  [optional] |
|**timeIntervalDuration** | **String** | The duration of the time interval used for TOTP processing. |  [optional] |
|**adjacentIntervalsToCheck** | **Integer** | The number of adjacent time intervals (both before and after the current time) that should be checked when performing authentication. |  [optional] |
|**preventTOTPReuse** | **Boolean** | Indicates whether to prevent clients from re-using TOTP passwords. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Extended Operation Handler is enabled (that is, whether the types of extended operations are allowed in the server). |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




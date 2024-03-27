

# ApiKeyConjurAuthenticationMethodResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Conjur Authentication Method |  |
|**description** | **String** | A description for this Conjur Authentication Method |  [optional] |
|**schemas** | **List&lt;EnumapiKeyConjurAuthenticationMethodSchemaUrn&gt;** |  |  |
|**username** | **String** | The username for the user to authenticate. |  |
|**password** | **String** | The password for the user to authenticate. This will be used to obtain an API key for the target user. |  [optional] |
|**apiKey** | **String** | The API key for the user to authenticate. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




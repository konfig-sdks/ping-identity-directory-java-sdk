

# DefaultAzureAuthenticationMethodResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Azure Authentication Method |  |
|**description** | **String** | A description for this Azure Authentication Method |  [optional] |
|**schemas** | **List&lt;EnumdefaultAzureAuthenticationMethodSchemaUrn&gt;** |  |  |
|**tenantID** | **String** | The tenant ID to use to authenticate. If this is not provided, then it will be obtained from the AZURE_TENANT_ID environment variable. |  [optional] |
|**clientID** | **String** | The client ID to use to authenticate. If this is not provided, then it will be obtained from the AZURE_CLIENT_ID |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




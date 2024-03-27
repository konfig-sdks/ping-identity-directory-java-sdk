

# MemoryBackendResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnummemoryBackendSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Backend |  |
|**writabilityMode** | **EnumbackendWritabilityModeProp** |  |  |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN(s) for the data that the backend handles. |  |
|**setDegradedAlertWhenDisabled** | **Boolean** | Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled. |  [optional] |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




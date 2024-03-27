

# MetricsBackendResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnummetricsBackendSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Backend |  |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  |
|**storageDir** | **String** | Specifies the path to the directory that will be used to store queued samples. |  |
|**metricsDir** | **String** | Specifies the path to the directory that contains metric definitions. |  |
|**sampleFlushInterval** | **String** | Period when samples are flushed to disk. |  [optional] |
|**retentionPolicy** | **List&lt;String&gt;** | The retention policy to use for the Metrics Backend . |  |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  |
|**writabilityMode** | **EnumbackendWritabilityModeProp** |  |  |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




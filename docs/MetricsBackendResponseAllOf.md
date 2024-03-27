

# MetricsBackendResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnummetricsBackendSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Backend |  [optional] |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  [optional] |
|**storageDir** | **String** | Specifies the path to the directory that will be used to store queued samples. |  [optional] |
|**metricsDir** | **String** | Specifies the path to the directory that contains metric definitions. |  [optional] |
|**sampleFlushInterval** | **String** | Period when samples are flushed to disk. |  [optional] |
|**retentionPolicy** | **List&lt;String&gt;** | The retention policy to use for the Metrics Backend . |  [optional] |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  [optional] |
|**writabilityMode** | **EnumbackendWritabilityModeProp** |  |  [optional] |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |




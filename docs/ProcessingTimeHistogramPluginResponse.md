

# ProcessingTimeHistogramPluginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumprocessingTimeHistogramPluginSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Plugin |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  |
|**histogramCategoryBoundary** | **List&lt;String&gt;** | Specifies the boundary values that will be used to separate the processing times into categories. Values should be specified as durations, and all values must be greater than zero. |  |
|**includeQueueTime** | **Boolean** | Indicates whether operation processing times should include the time spent waiting on the work queue. This will only be available if the work queue is configured to monitor the queue time. |  [optional] |
|**separateMonitorEntryPerTrackedApplication** | **Boolean** | When enabled, separate monitor entries will be included for each application defined in the Global Configuration&#39;s tracked-application property. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




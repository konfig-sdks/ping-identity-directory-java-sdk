

# ProfilerPluginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumprofilerPluginSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Plugin |  |
|**profileSampleInterval** | **String** | Specifies the sample interval in milliseconds to be used when capturing profiling information in the server. |  |
|**profileDirectory** | **String** | Specifies the path to the directory where profile information is to be written. This path may be either an absolute path or a path that is relative to the root of the Directory Server instance. |  |
|**enableProfilingOnStartup** | **Boolean** | Indicates whether the profiler plug-in is to start collecting data automatically when the Directory Server is started. |  |
|**profileAction** | **EnumpluginProfileActionProp** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




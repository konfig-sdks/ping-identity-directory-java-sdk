

# ProfilerPluginResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumprofilerPluginSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Plugin |  [optional] |
|**profileSampleInterval** | **String** | Specifies the sample interval in milliseconds to be used when capturing profiling information in the server. |  [optional] |
|**profileDirectory** | **String** | Specifies the path to the directory where profile information is to be written. This path may be either an absolute path or a path that is relative to the root of the Directory Server instance. |  [optional] |
|**enableProfilingOnStartup** | **Boolean** | Indicates whether the profiler plug-in is to start collecting data automatically when the Directory Server is started. |  [optional] |
|**profileAction** | **EnumpluginProfileActionProp** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  [optional] |






# AddPeriodicGcPluginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pluginName** | **String** | Name of the new Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumperiodicGcPluginSchemaUrn&gt;** |  |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  [optional] |
|**invokeGCDayOfWeek** | **List&lt;EnumpluginInvokeGCDayOfWeekProp&gt;** |  |  [optional] |
|**invokeGCTimeUtc** | **List&lt;String&gt;** | Specifies the times of the day at which garbage collection may be explicitly invoked. The times should be specified in \&quot;HH:MM\&quot; format, with \&quot;HH\&quot; as a two-digit numeric value between 00 and 23 representing the hour of the day, and MM as a two-digit numeric value between 00 and 59 representing the minute of the hour. All times will be interpreted in the UTC time zone. |  |
|**delayAfterAlert** | **String** | Specifies the length of time that the Directory Server should wait after sending the \&quot;force-gc-starting\&quot; administrative alert before actually invoking the garbage collection processing. |  [optional] |
|**delayPostGC** | **String** | Specifies the length of time that the Directory Server should wait after successfully completing the garbage collection processing, before removing the \&quot;force-gc-starting\&quot; administrative alert, which marks the server as unavailable. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




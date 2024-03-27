

# SubOperationTimingPluginShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumsubOperationTimingPluginSchemaUrn&gt;** |  |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  [optional] |
|**requestCriteria** | **String** | Specifies a set of request criteria used to indicate that only operations for requests matching this criteria should be counted when aggregating timing data. |  [optional] |
|**numMostExpensivePhasesShown** | **Integer** | This controls how many of the most expensive phases are included per operation type in the monitor entry. |  [optional] |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |




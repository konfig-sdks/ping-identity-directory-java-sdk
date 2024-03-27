

# SubOperationTimingPluginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumsubOperationTimingPluginSchemaUrn&gt;** |  |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  |
|**requestCriteria** | **String** | Specifies a set of request criteria used to indicate that only operations for requests matching this criteria should be counted when aggregating timing data. |  [optional] |
|**numMostExpensivePhasesShown** | **Integer** | This controls how many of the most expensive phases are included per operation type in the monitor entry. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




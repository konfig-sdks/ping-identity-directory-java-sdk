

# InternalSearchRatePluginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnuminternalSearchRatePluginSchemaUrn&gt;** |  |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  |
|**numThreads** | **Integer** | Specifies the number of concurrent threads that should be used to process the search operations. |  |
|**baseDN** | **String** | Specifies the base DN to use for the searches to perform. |  |
|**lowerBound** | **Integer** | Specifies the lower bound for the numeric value which will be inserted into the search filter. |  [optional] |
|**upperBound** | **Integer** | Specifies the upper bound for the numeric value which will be inserted into the search filter. |  [optional] |
|**filterPrefix** | **String** | Specifies a prefix which will be used in front of the randomly-selected numeric value in all search filters used. If no upper bound is defined, then this should contain the entire filter string. |  |
|**filterSuffix** | **String** | Specifies a suffix which will be used after of the randomly-selected numeric value in all search filters used. If no upper bound is defined, then this should be omitted. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




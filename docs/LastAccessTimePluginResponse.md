

# LastAccessTimePluginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumlastAccessTimePluginSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Plugin |  |
|**maxUpdateFrequency** | **String** | Specifies the maximum frequency with which last access time values should be written for an entry. This may help limit the rate of internal write operations processed in the server. |  [optional] |
|**operationType** | **List&lt;EnumpluginOperationTypeProp&gt;** |  |  [optional] |
|**invokeForFailedBinds** | **Boolean** | Indicates whether to update the last access time for an entry targeted by a bind operation if the bind is unsuccessful. |  [optional] |
|**maxSearchResultEntriesToUpdate** | **Integer** | Specifies the maximum number of entries that should be updated in a search operation. Only search result entries actually returned to the client may have their last access time updated, but because a single search operation may return a very large number of entries, the plugin will only update entries if no more than a specified number of entries are updated. |  [optional] |
|**requestCriteria** | **String** | Specifies a set of request criteria that may be used to indicate whether to apply access time updates for the associated operation. |  [optional] |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




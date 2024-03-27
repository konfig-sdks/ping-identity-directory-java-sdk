

# AddCleanUpInactivePingfederatePersistentSessionsPluginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pluginName** | **String** | Name of the new Plugin |  |
|**schemas** | **List&lt;EnumcleanUpInactivePingfederatePersistentSessionsPluginSchemaUrn&gt;** |  |  |
|**expirationOffset** | **String** | Sessions whose last activity timestamp is older than this offset will be removed. |  |
|**pollingInterval** | **String** | This specifies how often the plugin should check for expired data. It also controls the offset of peer servers (see the peer-server-priority-index for more information). |  [optional] |
|**peerServerPriorityIndex** | **Integer** | In a replicated environment, this determines the order in which peer servers should attempt to purge data. |  [optional] |
|**baseDN** | **String** | Only entries located within the subtree specified by this base DN are eligible for purging. |  [optional] |
|**maxUpdatesPerSecond** | **Integer** | This setting smooths out the performance impact on the server by throttling the purging to the specified maximum number of updates per second. To avoid a large backlog, this value should be set comfortably above the average rate that expired data is generated. When purge-behavior is set to subtree-delete-entries, then deletion of the entire subtree is considered a single update for the purposes of throttling. |  [optional] |
|**numDeleteThreads** | **Integer** | The number of threads used to delete expired entries. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |




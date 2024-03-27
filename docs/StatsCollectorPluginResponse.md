

# StatsCollectorPluginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumstatsCollectorPluginSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Plugin |  |
|**sampleInterval** | **String** | The duration between statistics collections. Setting this value too small can have an impact on performance. This value should be a multiple of collection-interval. |  |
|**collectionInterval** | **String** | Some of the calculated statistics, such as the average and maximum queue sizes, can use multiple samples within a log interval. This value controls how often samples are gathered, and setting this value too small can have an adverse impact on performance. |  |
|**ldapInfo** | **EnumpluginLdapInfoProp** |  |  [optional] |
|**serverInfo** | **EnumpluginServerInfoProp** |  |  [optional] |
|**perApplicationLDAPStats** | **EnumpluginStatsCollectorPerApplicationLDAPStatsProp** |  |  [optional] |
|**ldapChangelogInfo** | **EnumpluginLdapChangelogInfoProp** |  |  [optional] |
|**statusSummaryInfo** | **EnumpluginStatusSummaryInfoProp** |  |  [optional] |
|**generateCollectorFiles** | **Boolean** | Indicates whether this plugin should store metric samples on disk for use by the Data Metrics Server. If the Stats Collector Plugin is only being used to collect metrics for one or more StatsD Monitoring Endpoints, then this can be set to false to prevent unnecessary I/O. |  [optional] |
|**localDBBackendInfo** | **EnumpluginLocalDBBackendInfoProp** |  |  [optional] |
|**replicationInfo** | **EnumpluginReplicationInfoProp** |  |  [optional] |
|**entryCacheInfo** | **EnumpluginEntryCacheInfoProp** |  |  [optional] |
|**hostInfo** | **List&lt;EnumpluginHostInfoProp&gt;** |  |  [optional] |
|**includedLDAPApplication** | **List&lt;String&gt;** | If statistics should not be included for all applications, this property names the subset of applications that should be included. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




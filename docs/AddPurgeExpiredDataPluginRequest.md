

# AddPurgeExpiredDataPluginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pluginName** | **String** | Name of the new Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumpurgeExpiredDataPluginSchemaUrn&gt;** |  |  |
|**datetimeAttribute** | **String** | The LDAP attribute that determines when data should be deleted. This could store the expiration time, or it could store the creation time and the expiration-offset property specifies the duration before data is deleted. |  |
|**datetimeJSONField** | **String** | The top-level JSON field within the configured datetime-attribute that determines when data should be deleted. This could store the expiration time, or it could store the creation time and the expiration-offset property specifies the duration before data is deleted. |  [optional] |
|**datetimeFormat** | **EnumpluginDatetimeFormatProp** |  |  [optional] |
|**customDatetimeFormat** | **String** | When the datetime-format property is configured with a value of \&quot;custom\&quot;, this specifies the format (using a string compatible with the java.text.SimpleDateFormat class) that will be used to search for expired data. |  [optional] |
|**customTimezone** | **String** | Specifies the time zone to use when generating a date string using the configured custom-datetime-format value. The provided value must be accepted by java.util.TimeZone.getTimeZone. |  [optional] |
|**expirationOffset** | **String** | The duration to wait after the value specified in datetime-attribute (and optionally datetime-json-field) before purging the data. |  |
|**purgeBehavior** | **EnumpluginPurgeBehaviorProp** |  |  [optional] |
|**baseDN** | **String** | Only entries located within the subtree specified by this base DN are eligible for purging. |  [optional] |
|**filter** | **String** | Only entries that match this LDAP filter will be eligible for having data purged. |  [optional] |
|**pollingInterval** | **String** | This specifies how often the plugin should check for expired data. It also controls the offset of peer servers (see the peer-server-priority-index for more information). |  [optional] |
|**maxUpdatesPerSecond** | **Integer** | This setting smooths out the performance impact on the server by throttling the purging to the specified maximum number of updates per second. To avoid a large backlog, this value should be set comfortably above the average rate that expired data is generated. When purge-behavior is set to subtree-delete-entries, then deletion of the entire subtree is considered a single update for the purposes of throttling. |  [optional] |
|**peerServerPriorityIndex** | **Integer** | In a replicated environment, this determines the order in which peer servers should attempt to purge data. |  [optional] |
|**numDeleteThreads** | **Integer** | The number of threads used to delete expired entries. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |




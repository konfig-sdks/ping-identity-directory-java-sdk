

# ConfigFileHandlerBackendResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnumconfigFileHandlerBackendSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Backend |  |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN(s) for the data that the backend handles. |  |
|**writabilityMode** | **EnumbackendWritabilityModeProp** |  |  |
|**insignificantConfigArchiveAttribute** | **List&lt;String&gt;** | The name or OID of an attribute type that is considered insignificant for the purpose of maintaining the configuration archive. |  [optional] |
|**insignificantConfigArchiveBaseDN** | **List&lt;String&gt;** | The base DN that is considered insignificant for the purpose of maintaining the configuration archive. |  [optional] |
|**maintainConfigArchive** | **Boolean** | Indicates whether the server should maintain the config archive with new changes to the config backend. |  [optional] |
|**maxConfigArchiveCount** | **Integer** | Indicates the maximum number of previous config files to keep as part of maintaining the config archive. |  [optional] |
|**mirroredSubtreePeerPollingInterval** | **String** | Tells the server component that is responsible for mirroring configuration data across a topology of servers the maximum amount of time to wait before polling the peer servers in the topology to determine if there are any changes in the topology. Mirrored data includes meta-data about the servers in the topology as well as cluster-wide configuration data. |  [optional] |
|**mirroredSubtreeEntryUpdateTimeout** | **String** | Tells the server component that is responsible for mirroring configuration data across a topology of servers the maximum amount of time to wait for an update operation (add, delete, modify and modify-dn) on an entry to be applied on all servers in the topology. Mirrored data includes meta-data about the servers in the topology as well as cluster-wide configuration data. |  [optional] |
|**mirroredSubtreeSearchTimeout** | **String** | Tells the server component that is responsible for mirroring configuration data across a topology of servers the maximum amount of time to wait for a search operation to complete. Mirrored data includes meta-data about the servers in the topology as well as cluster-wide configuration data. Search requests that take longer than this timeout will be canceled and considered failures. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  |
|**setDegradedAlertWhenDisabled** | **Boolean** | Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled. |  [optional] |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**backupFilePermissions** | **String** | Specifies the permissions that should be applied to files and directories created by a backup of the backend. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




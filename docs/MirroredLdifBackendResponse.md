

# MirroredLdifBackendResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnummirroredLdifBackendSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Backend |  |
|**mirroredSubtreePeerPollingInterval** | **String** | The amount of time to wait before polling the peer servers in the topology to determine if there are any changes in the topology. A lower value will make for a quicker failover in the event of a failure, but it will also cause more frequent traffic among the peers. |  [optional] |
|**mirroredSubtreeEntryUpdateTimeout** | **String** | Specifies the maximum length of time to wait for an update operation (add, delete, modify and modify-dn) on an entry to be applied on all servers in the topology. |  [optional] |
|**mirroredSubtreeSearchTimeout** | **String** | Specifies the maximum length of time to wait for a search operation to complete. Search requests that take longer than this timeout will be canceled and considered failures. |  [optional] |
|**peerServer** | **List&lt;String&gt;** | Specifies the set of peer servers onto which updates should be mirrored. The local server should not be included in this set, but if it is, then it will just be ignored. |  [optional] |
|**mirroredSubtreePreferredMasterType** | **List&lt;EnumbackendMirroredSubtreePreferredMasterTypeProp&gt;** |  |  [optional] |
|**simulatedResultCode** | **Integer** | Specifies the numeric value of the result code to be assumed for update operations (add, delete, modify and modify-dn) targeted to this backend. |  [optional] |
|**writabilityMode** | **EnumbackendWritabilityModeProp** |  |  |
|**isPrivateBackend** | **Boolean** | Indicates whether the backend should be considered a private backend, which indicates that it is used for storing operational data rather than user-defined information. |  [optional] |
|**ldifFile** | **String** | Specifies the path to the LDIF file containing the data for this backend. |  |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN(s) for the data that the backend handles. |  |
|**setDegradedAlertWhenDisabled** | **Boolean** | Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled. |  [optional] |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**backupFilePermissions** | **String** | Specifies the permissions that should be applied to files and directories created by a backup of the backend. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# ReplicationServerResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumreplicationServerSchemaUrn&gt;** |  |  [optional] |
|**replicationServerID** | **Integer** | Specifies a unique identifier for the Replication Server. |  [optional] |
|**replicationDBDirectory** | **String** | The path where the Replication Server stores all persistent information. |  [optional] |
|**jeProperty** | **List&lt;String&gt;** | Specifies the database and environment properties for the Berkeley DB Java Edition database for the replication changelog. |  [optional] |
|**replicationPurgeDelay** | **String** | Changes are guaranteed to be maintained in the changelog database for at least this duration. Setting target-database-size can allow additional changes to be maintained up to the configured size on disk. |  [optional] |
|**targetDatabaseSize** | **String** | The replication changelog database is allowed to grow up to this size even if changes are older than the configured replication-purge-delay. |  [optional] |
|**replicationPort** | **Integer** | The port on which this Replication Server waits for connections from other Replication Servers or Directory Server instances. |  [optional] |
|**listenOnAllAddresses** | **Boolean** | Indicates whether the Replication Server should listen on all addresses for this host. If set to FALSE, then the Replication Server will listen only to the address resolved from the hostname provided. |  [optional] |
|**compressionCriteria** | **EnumreplicationServerCompressionCriteriaProp** |  |  [optional] |
|**heartbeatInterval** | **String** | Specifies the heartbeat interval that the Directory Server will use when communicating with Replication Servers. |  [optional] |
|**remoteMonitorUpdateInterval** | **String** | Specifies the duration that topology monitor data will be cached before it is requested again from a remote server. |  [optional] |
|**restrictedDomain** | **List&lt;String&gt;** | Specifies the base DN of domains that are only replicated between server instances that belong to the same replication set. |  [optional] |
|**gatewayPriority** | **Integer** | Specifies the gateway priority of the Replication Server in the current location. |  [optional] |
|**missingChangesAlertThresholdPercent** | **Integer** | Specifies the missing changes alert threshold as a percentage of the total pending changes. For instance, a value of 80 indicates that the replica is 80% of the way to losing changes. |  [optional] |
|**missingChangesPolicy** | **EnumreplicationServerMissingChangesPolicyProp** |  |  [optional] |
|**includeAllRemoteServersStateInMonitorMessage** | **Boolean** | Indicates monitor messages should include information about remote servers. |  [optional] |




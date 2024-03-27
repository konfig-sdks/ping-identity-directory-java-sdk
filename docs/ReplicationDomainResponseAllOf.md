

# ReplicationDomainResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumreplicationDomainSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Replication Domain |  [optional] |
|**serverID** | **Integer** | Specifies a unique identifier for the Directory Server within the Replication Domain. |  [optional] |
|**baseDN** | **String** | Specifies the base DN of the replicated data. |  [optional] |
|**windowSize** | **Integer** | Specifies the maximum number of replication updates the Directory Server can have outstanding from the Replication Server. |  [optional] |
|**heartbeatInterval** | **String** | Specifies the heartbeat interval that the Directory Server will use when communicating with Replication Servers. |  [optional] |
|**syncHistPurgeDelay** | **String** | The time in seconds after which historical information used in replication conflict resolution is purged. The information is removed from entries when they are modified after the purge delay has elapsed. |  [optional] |
|**restricted** | **Boolean** | When set to true, changes are only replicated with server instances that belong to the same replication set. |  [optional] |
|**onReplayFailureWaitForDependentOpsTimeout** | **String** | Defines the maximum time to retry a failed operation. An operation will be retried only if it appears that the failure might be dependent on an earlier operation from a different server that hasn&#39;t replicated yet. The frequency of the retry is determined by the dependent-ops-replay-failure-wait-time property. |  [optional] |
|**dependentOpsReplayFailureWaitTime** | **String** | Defines how long to wait before retrying certain operations, specifically operations that might have failed because they depend on an operation from a different server that has not yet replicated to this instance. |  [optional] |
|**missingChangesPolicy** | **EnumreplicationDomainMissingChangesPolicyProp** |  |  [optional] |




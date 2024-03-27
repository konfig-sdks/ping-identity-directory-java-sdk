

# LargeAttributeBackendResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnumlargeAttributeBackendSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Backend |  |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN(s) for the data that the backend handles. |  |
|**writabilityMode** | **EnumbackendWritabilityModeProp** |  |  |
|**isPrivateBackend** | **Boolean** | Indicates whether this backend should be considered a private backend in the server. Private backends are meant for storing server-internal information and should not be used for user or application data. |  [optional] |
|**dbCachePercent** | **Integer** | Specifies the percentage of JVM memory to allocate to the database cache. |  [optional] |
|**defaultCacheMode** | **EnumbackendDefaultCacheModeProp** |  |  [optional] |
|**dbDirectory** | **String** | Specifies the path to the filesystem directory that is used to hold the Berkeley DB Java Edition database files containing the data for this backend. The files for this backend are stored in a sub-directory named after the backend-id. |  |
|**dbDirectoryPermissions** | **String** | Specifies the permissions that should be applied to the directory containing the backend database files and to directories and files created during backup or LDIF export of the backend. |  [optional] |
|**compactCommonParentDN** | **List&lt;String&gt;** | Provides a DN of an entry that may be the parent for a large number of entries in the backend. This may be used to help increase the space efficiency when encoding entries for storage. |  [optional] |
|**compressEntries** | **Boolean** | Indicates whether the backend should attempt to compress entries before storing them in the database. |  [optional] |
|**hashEntries** | **Boolean** | Indicates whether to calculate and store a message digest of the entry contents along with the entry data, in order to provide a means of verifying the integrity of the entry data. |  [optional] |
|**dbNumCleanerThreads** | **Integer** | Specifies the number of threads that the backend should maintain to keep the database log files at or near the desired utilization. A value of zero indicates that the number of cleaner threads should be automatically configured based on the number of available CPUs. |  [optional] |
|**dbCleanerMinUtilization** | **Integer** | Specifies the minimum percentage of \&quot;live\&quot; data that the database cleaner attempts to keep in database log files. |  [optional] |
|**dbEvictorCriticalPercentage** | **Integer** | Specifies the percentage over the configured maximum that the database cache is allowed to grow. It is recommended to set this value slightly above zero when the database is too large to fully cache in memory. In this case, a dedicated background evictor thread is used to perform evictions once the cache fills up reducing the possibility that server threads are blocked. |  [optional] |
|**dbCheckpointerWakeupInterval** | **String** | Specifies the maximum length of time that should pass between checkpoints. |  [optional] |
|**dbBackgroundSyncInterval** | **String** | Specifies the interval to use when performing background synchronous writes in the database environment in order to smooth overall write performance and increase data durability. A value of \&quot;0 s\&quot; will disable background synchronous writes. |  [optional] |
|**dbUseThreadLocalHandles** | **Boolean** | Indicates whether to use thread-local database handles to reduce contention in the backend. |  [optional] |
|**dbLogFileMax** | **String** | Specifies the maximum size for a database log file. |  [optional] |
|**dbLoggingLevel** | **String** | Specifies the log level that should be used by the database when it is writing information into the je.info file. |  [optional] |
|**jeProperty** | **List&lt;String&gt;** | Specifies the database and environment properties for the Berkeley DB Java Edition database serving the data for this backend. |  [optional] |
|**id2entryCacheMode** | **EnumbackendId2entryCacheModeProp** |  |  [optional] |
|**dn2idCacheMode** | **EnumbackendDn2idCacheModeProp** |  |  [optional] |
|**id2childrenCacheMode** | **EnumbackendId2childrenCacheModeProp** |  |  [optional] |
|**id2subtreeCacheMode** | **EnumbackendId2subtreeCacheModeProp** |  |  [optional] |
|**dn2uriCacheMode** | **EnumbackendDn2uriCacheModeProp** |  |  [optional] |
|**primeMethod** | **List&lt;EnumbackendPrimeMethodProp&gt;** |  |  [optional] |
|**primeThreadCount** | **Integer** | Specifies the number of threads to use when priming. At present, this applies only to the preload and cursor-across-indexes prime methods. |  [optional] |
|**primeTimeLimit** | **String** | Specifies the maximum length of time that the backend prime should be allowed to run. A duration of zero seconds indicates that there should not be a time limit. |  [optional] |
|**primeAllIndexes** | **Boolean** | Indicates whether to prime all indexes associated with this backend, or to only prime the specified set of indexes (as configured with the system-index-to-prime property for the system indexes, and the prime-index property in the attribute index definition for attribute indexes). |  [optional] |
|**systemIndexToPrime** | **List&lt;EnumbackendSystemIndexToPrimeProp&gt;** |  |  [optional] |
|**systemIndexToPrimeInternalNodesOnly** | **List&lt;EnumbackendSystemIndexToPrimeInternalNodesOnlyProp&gt;** |  |  [optional] |
|**backgroundPrime** | **Boolean** | Indicates whether to attempt to perform the prime using a background thread if possible. If background priming is enabled, then the Directory Server may be allowed to accept client connections and process requests while the prime is in progress. |  [optional] |
|**indexEntryLimit** | **Integer** | Specifies the maximum number of entries that are allowed to match a given index key before that particular index key is no longer maintained. |  [optional] |
|**compositeIndexEntryLimit** | **Integer** | Specifies the maximum number of entries that are allowed to match a given composite index key before that particular composite index key is no longer maintained. |  [optional] |
|**id2childrenIndexEntryLimit** | **Integer** | Specifies the maximum number of entry IDs to maintain for each entry in the id2children system index (which keeps track of the immediate children for an entry, to assist in otherwise unindexed searches with a single-level scope). A value of 0 means there is no limit, however this could have a big impact on database size on disk and on server performance. |  [optional] |
|**id2subtreeIndexEntryLimit** | **Integer** | Specifies the maximum number of entry IDs to maintain for each entry in the id2subtree system index (which keeps track of all descendants below an entry, to assist in otherwise unindexed searches with a whole-subtree or subordinate subtree scope). A value of 0 means there is no limit, however this could have a big impact on database size on disk and on server performance. |  [optional] |
|**importTempDirectory** | **String** | Specifies the location of the directory that is used to hold temporary information during the index post-processing phase of an LDIF import. |  |
|**importThreadCount** | **Integer** | Specifies the number of threads to use for concurrent processing during an LDIF import. |  [optional] |
|**exportThreadCount** | **Integer** | Specifies the number of threads to use for concurrently retrieving and encoding entries during an LDIF export. |  [optional] |
|**dbImportCachePercent** | **Integer** | The percentage of JVM memory to allocate to the database cache during import operations. |  [optional] |
|**dbTxnWriteNoSync** | **Boolean** | Indicates whether the database should synchronously flush data as it is written to disk. |  [optional] |
|**deadlockRetryLimit** | **Integer** | Specifies the number of times that the server should retry an attempted operation in the backend if a deadlock results from two concurrent requests that interfere with each other in a conflicting manner. |  [optional] |
|**externalTxnDefaultBackendLockBehavior** | **EnumbackendExternalTxnDefaultBackendLockBehaviorProp** |  |  [optional] |
|**singleWriterLockBehavior** | **EnumbackendSingleWriterLockBehaviorProp** |  |  [optional] |
|**subtreeDeleteSizeLimit** | **Integer** | Specifies the maximum number of entries that may be deleted from the backend when using the subtree delete control. |  [optional] |
|**numRecentChanges** | **Integer** | Specifies the number of recent LDAP entry changes per replica for which the backend keeps a record to allow replication to recover in the event that the server is abruptly terminated. Increasing this value can lead to an increased peak server modification rate as well as increased replication throughput. |  [optional] |
|**offlineProcessDatabaseOpenTimeout** | **String** | Specifies a timeout duration which will be used for opening the database environment by an offline process, such as export-ldif. |  [optional] |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  |
|**setDegradedAlertWhenDisabled** | **Boolean** | Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled. |  [optional] |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




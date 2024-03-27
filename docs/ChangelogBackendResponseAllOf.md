

# ChangelogBackendResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnumchangelogBackendSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Backend |  [optional] |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN(s) for the data that the backend handles. |  [optional] |
|**dbDirectory** | **String** | Specifies the path to the filesystem directory that is used to hold the Berkeley DB Java Edition database files containing the data for this backend. The files for this backend are stored in a sub-directory named after the backend-id. |  [optional] |
|**dbDirectoryPermissions** | **String** | Specifies the permissions that should be applied to the directory containing the backend database files and to directories and files created during backup of the backend. |  [optional] |
|**dbCachePercent** | **Integer** | Specifies the percentage of JVM memory to allocate to the changelog database cache. |  [optional] |
|**jeProperty** | **List&lt;String&gt;** | Specifies the database and environment properties for the Berkeley DB Java Edition database for this changelog backend. |  [optional] |
|**changelogWriteBatchSize** | **Integer** | Specifies the number of changelog entries written in a single database transaction. |  [optional] |
|**changelogPurgeBatchSize** | **Integer** | Specifies the number of changelog entries purged in a single database transaction. |  [optional] |
|**changelogWriteQueueCapacity** | **Integer** | Specifies the capacity of the changelog write queue in number of changes. |  [optional] |
|**indexIncludeAttribute** | **List&lt;String&gt;** | Specifies which attribute types are to be specifically included in the set of attribute indexes maintained on the changelog. If this property does not have any values then no attribute types are indexed. |  [optional] |
|**indexExcludeAttribute** | **List&lt;String&gt;** | Specifies which attribute types are to be specifically excluded from the set of attribute indexes maintained on the changelog. This property is useful when the index-include-attribute property contains one of the special values \&quot;*\&quot; and \&quot;+\&quot;. |  [optional] |
|**changelogMaximumAge** | **String** | Changes are guaranteed to be maintained in the changelog database for at least this duration. Setting target-database-size can allow additional changes to be maintained up to the configured size on disk. |  [optional] |
|**targetDatabaseSize** | **String** | The changelog database is allowed to grow up to this size on disk even if changes are older than the configured changelog-maximum-age. |  [optional] |
|**changelogEntryIncludeBaseDN** | **List&lt;String&gt;** | The base DNs for branches in the data for which to record changes in the changelog. |  [optional] |
|**changelogEntryExcludeBaseDN** | **List&lt;String&gt;** | The base DNs for branches in the data for which no changelog records should be generated. |  [optional] |
|**changelogEntryIncludeFilter** | **List&lt;String&gt;** | A filter that indicates which changelog entries should actually be stored in the changelog. Note that this filter is evaluated against the changelog entry itself and not against the entry that was the target of the change referenced by the changelog entry. This filter may target any attributes that appear in changelog entries with the exception of the changeNumber and entry-size-bytes attributes, since they will not be known at the time of the filter evaluation. |  [optional] |
|**changelogEntryExcludeFilter** | **List&lt;String&gt;** | A filter that indicates which changelog entries should be excluded from the changelog. Note that this filter is evaluated against the changelog entry itself and not against the entry that was the target of the change referenced by the changelog entry. This filter may target any attributes that appear in changelog entries with the exception of the changeNumber and entry-size-bytes attributes, since they will not be known at the time of the filter evaluation. |  [optional] |
|**changelogIncludeAttribute** | **List&lt;String&gt;** | Specifies which attribute types will be included in a changelog entry for ADD and MODIFY operations. |  [optional] |
|**changelogExcludeAttribute** | **List&lt;String&gt;** | Specifies a set of attribute types that should be excluded in a changelog entry for ADD and MODIFY operations. |  [optional] |
|**changelogDeletedEntryIncludeAttribute** | **List&lt;String&gt;** | Specifies a set of attribute types that should be included in a changelog entry for DELETE operations. |  [optional] |
|**changelogDeletedEntryExcludeAttribute** | **List&lt;String&gt;** | Specifies a set of attribute types that should be excluded from a changelog entry for DELETE operations. |  [optional] |
|**changelogIncludeKeyAttribute** | **List&lt;String&gt;** | Specifies which attribute types will be included in a changelog entry on every change. |  [optional] |
|**changelogMaxBeforeAfterValues** | **Integer** | This controls whether all attribute values for a modified attribute (even those values that have not changed) will be included in the changelog entry. If the number of attribute values does not exceed this limit, then all values for the modified attribute will be included in the changelog entry. |  [optional] |
|**writeLastmodAttributes** | **Boolean** | Specifies whether values of creatorsName, createTimestamp, modifiersName and modifyTimestamp attributes will be written to changelog entries. |  [optional] |
|**useReversibleForm** | **Boolean** | Specifies whether the changelog should provide enough information to be able to revert the changes if desired. |  [optional] |
|**includeVirtualAttributes** | **List&lt;EnumbackendIncludeVirtualAttributesProp&gt;** |  |  [optional] |
|**applyAccessControlsToChangelogEntryContents** | **Boolean** | Indicates whether the contents of changelog entries should be subject to access control and sensitive attribute evaluation such that the contents of attributes like changes, deletedEntryAttrs, ds-changelog-entry-key-attr-values, ds-changelog-before-values, and ds-changelog-after-values may be altered based on attributes the user can see in the target entry. |  [optional] |
|**reportExcludedChangelogAttributes** | **EnumbackendReportExcludedChangelogAttributesProp** |  |  [optional] |
|**softDeleteEntryIncludedOperation** | **List&lt;EnumbackendSoftDeleteEntryIncludedOperationProp&gt;** |  |  [optional] |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  [optional] |
|**setDegradedAlertWhenDisabled** | **Boolean** | Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled. |  [optional] |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |




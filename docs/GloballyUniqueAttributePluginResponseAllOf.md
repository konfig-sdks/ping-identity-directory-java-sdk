

# GloballyUniqueAttributePluginResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumgloballyUniqueAttributePluginSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Plugin |  [optional] |
|**type** | **List&lt;String&gt;** | The attribute type(s) for which to enforce global uniqueness. The attribute must be indexed for equality searches in all subtree views for which uniqueness should be maintained. |  [optional] |
|**multipleAttributeBehavior** | **EnumpluginGloballyUniqueAttributeMultipleAttributeBehaviorProp** |  |  [optional] |
|**subtreeView** | **List&lt;String&gt;** | The subtree view(s) for which to enforce uniqueness. |  [optional] |
|**preventConflictsWithSoftDeletedEntries** | **Boolean** | Indicates whether this Globally Unique Attribute Plugin should attempt to prevent conflicts with soft-deleted entries (i.e., entries that have been removed in a way that leaves them in the server but in a way that makes them no longer visible to or accessible by normal clients). |  [optional] |
|**preCommitValidation** | **EnumpluginPreCommitValidationProp** |  |  [optional] |
|**postCommitValidation** | **EnumpluginPostCommitValidationProp** |  |  [optional] |
|**filter** | **String** | Specifies the search filter to apply to determine if attribute uniqueness is enforced for the matching entries. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  [optional] |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |






# AddUniqueAttributePluginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pluginName** | **String** | Name of the new Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumuniqueAttributePluginSchemaUrn&gt;** |  |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  [optional] |
|**type** | **List&lt;String&gt;** | Specifies the type of attributes to check for value uniqueness. |  |
|**multipleAttributeBehavior** | **EnumpluginUniqueAttributeMultipleAttributeBehaviorProp** |  |  [optional] |
|**baseDN** | **List&lt;String&gt;** | Specifies a base DN within which the attribute must be unique. |  [optional] |
|**preventConflictsWithSoftDeletedEntries** | **Boolean** | Indicates whether this Unique Attribute Plugin should reject a change that would result in one or more conflicts, even if those conflicts only exist in soft-deleted entries. |  [optional] |
|**filter** | **String** | Specifies the search filter to apply to determine if attribute uniqueness is enforced for the matching entries. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




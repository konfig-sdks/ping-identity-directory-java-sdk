

# AddInvertedStaticGroupReferentialIntegrityPluginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pluginName** | **String** | Name of the new Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnuminvertedStaticGroupReferentialIntegrityPluginSchemaUrn&gt;** |  |  |
|**preventAddingMembersToNonexistentGroups** | **Boolean** | Indicates whether the server should prevent updates to user entries that attempt to add them as a member of an inverted static group that does not exist. |  [optional] |
|**preventAddingGroupsAsInvertedStaticGroupMembers** | **Boolean** | Indicates whether the server should prevent attempts to add a group as a regular member of an inverted static group. If the members of another group should be considered members of an inverted static group, then the other group should be added as a nested group rather than a regular member. |  [optional] |
|**preventNestingNonexistentGroups** | **Boolean** | Indicates whether the server should prevent updates to inverted static groups that add references to nested groups that don&#39;t exist. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




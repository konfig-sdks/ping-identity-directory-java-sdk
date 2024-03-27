

# DelegatedAdminResourceRightsShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Delegated Admin Resource Rights |  [optional] |
|**schemas** | **List&lt;EnumdelegatedAdminResourceRightsSchemaUrn&gt;** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether these Delegated Admin Resource Rights are enabled. |  |
|**restResourceType** | **String** | Specifies the resource type applicable to these Delegated Admin Resource Rights. |  |
|**adminPermission** | **List&lt;EnumdelegatedAdminResourceRightsAdminPermissionProp&gt;** |  |  [optional] |
|**adminScope** | **EnumdelegatedAdminResourceRightsAdminScopeProp** |  |  [optional] |
|**resourceSubtree** | **List&lt;String&gt;** | Specifies subtrees within the search base whose entries can be managed by the administrator(s). The admin-scope must be set to resources-in-specific-subtrees. |  [optional] |
|**resourcesInGroup** | **List&lt;String&gt;** | Specifies groups whose members can be managed by the administrator(s). The admin-scope must be set to resources-in-specific-groups. |  [optional] |






# AddDelegatedAdminRightsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rightsName** | **String** | Name of the new Delegated Admin Rights |  |
|**description** | **String** | A description for this Delegated Admin Rights |  [optional] |
|**schemas** | **List&lt;EnumdelegatedAdminRightsSchemaUrn&gt;** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Delegated Admin Rights is enabled. |  |
|**adminUserDN** | **String** | Specifies the DN of an administrative user who has authority to manage resources. Either admin-user-dn or admin-group-dn must be specified, but not both. |  [optional] |
|**adminGroupDN** | **String** | Specifies the DN of a group of administrative users who have authority to manage resources. Either admin-user-dn or admin-group-dn must be specified, but not both. |  [optional] |




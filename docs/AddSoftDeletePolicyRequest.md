

# AddSoftDeletePolicyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policyName** | **String** | Name of the new Soft Delete Policy |  |
|**description** | **String** | A description for this Soft Delete Policy |  [optional] |
|**schemas** | **List&lt;EnumsoftDeletePolicySchemaUrn&gt;** |  |  [optional] |
|**autoSoftDeleteConnectionCriteria** | **String** | Connection criteria used to automatically identify a delete operation for processing as a soft delete request. |  [optional] |
|**autoSoftDeleteRequestCriteria** | **String** | Request criteria used to automatically identify a delete operation for processing as a soft delete request. |  [optional] |
|**softDeleteRetentionTime** | **String** | Specifies the maximum length of time that soft delete entries are retained before they are eligible to purged automatically. |  [optional] |
|**softDeleteRetainNumberOfEntries** | **Integer** | Specifies the number of soft deleted entries to retain before the oldest entries are purged. |  [optional] |




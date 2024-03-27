

# ReplicationAssurancePolicyShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the Replication Assurance Policy. |  [optional] |
|**schemas** | **List&lt;EnumreplicationAssurancePolicySchemaUrn&gt;** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Replication Assurance Policy is enabled for use in the server. If a Replication Assurance Policy is disabled, then no new operations will be associated with it. |  [optional] |
|**evaluationOrderIndex** | **Integer** | When multiple Replication Assurance Policies are defined, this property determines the evaluation order for finding a Replication Assurance Policy match against an operation. Policies are evaluated based on this index from least to greatest. Values of this property must be unique but not necessarily contiguous. |  |
|**localLevel** | **EnumreplicationAssurancePolicyLocalLevelProp** |  |  [optional] |
|**remoteLevel** | **EnumreplicationAssurancePolicyRemoteLevelProp** |  |  [optional] |
|**timeout** | **String** | Specifies the maximum length of time to wait for the replication assurance requirements to be met before timing out and replying to the client. |  |
|**connectionCriteria** | **String** | Specifies a connection criteria used to indicate which operations from clients matching this criteria use this policy. If both a connection criteria and a request criteria are specified for a policy, then both must match an operation for the policy to be assigned. |  [optional] |
|**requestCriteria** | **String** | Specifies a request criteria used to indicate which operations from clients matching this criteria use this policy. If both a connection criteria and a request criteria are specified for a policy, then both must match an operation for the policy to be assigned. |  [optional] |




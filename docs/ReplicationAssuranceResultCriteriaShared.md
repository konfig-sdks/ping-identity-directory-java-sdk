

# ReplicationAssuranceResultCriteriaShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Result Criteria |  [optional] |
|**schemas** | **List&lt;EnumreplicationAssuranceResultCriteriaSchemaUrn&gt;** |  |  |
|**localAssuranceLevel** | **List&lt;EnumresultCriteriaLocalAssuranceLevelProp&gt;** |  |  [optional] |
|**remoteAssuranceLevel** | **List&lt;EnumresultCriteriaRemoteAssuranceLevelProp&gt;** |  |  [optional] |
|**assuranceTimeoutCriteria** | **EnumresultCriteriaAssuranceTimeoutCriteriaProp** |  |  [optional] |
|**assuranceTimeoutValue** | **String** | The value to use for performing matching based on the assurance timeout. This will be ignored if the assurance-timeout-criteria is \&quot;any\&quot;. |  [optional] |
|**responseDelayedByAssurance** | **EnumresultCriteriaResponseDelayedByAssuranceProp** |  |  [optional] |
|**assuranceBehaviorAlteredByControl** | **EnumresultCriteriaAssuranceBehaviorAlteredByControlProp** |  |  [optional] |
|**assuranceSatisfied** | **EnumresultCriteriaAssuranceSatisfiedProp** |  |  [optional] |




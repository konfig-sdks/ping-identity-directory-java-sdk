

# ReplicationAssuranceResultCriteriaResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Result Criteria |  |
|**description** | **String** | A description for this Result Criteria |  [optional] |
|**schemas** | **List&lt;EnumreplicationAssuranceResultCriteriaSchemaUrn&gt;** |  |  |
|**localAssuranceLevel** | **List&lt;EnumresultCriteriaLocalAssuranceLevelProp&gt;** |  |  |
|**remoteAssuranceLevel** | **List&lt;EnumresultCriteriaRemoteAssuranceLevelProp&gt;** |  |  |
|**assuranceTimeoutCriteria** | **EnumresultCriteriaAssuranceTimeoutCriteriaProp** |  |  [optional] |
|**assuranceTimeoutValue** | **String** | The value to use for performing matching based on the assurance timeout. This will be ignored if the assurance-timeout-criteria is \&quot;any\&quot;. |  [optional] |
|**responseDelayedByAssurance** | **EnumresultCriteriaResponseDelayedByAssuranceProp** |  |  [optional] |
|**assuranceBehaviorAlteredByControl** | **EnumresultCriteriaAssuranceBehaviorAlteredByControlProp** |  |  [optional] |
|**assuranceSatisfied** | **EnumresultCriteriaAssuranceSatisfiedProp** |  |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# AggregateResultCriteriaResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Result Criteria |  |
|**description** | **String** | A description for this Result Criteria |  [optional] |
|**schemas** | **List&lt;EnumaggregateResultCriteriaSchemaUrn&gt;** |  |  |
|**allIncludedResultCriteria** | **List&lt;String&gt;** | Specifies a result criteria object that must match the associated operation result in order to match the aggregate result criteria. If one or more all-included result criteria objects are provided, then an operation result must match all of them in order to match the aggregate result criteria. |  [optional] |
|**anyIncludedResultCriteria** | **List&lt;String&gt;** | Specifies a result criteria object that may match the associated operation result in order to match the aggregate result criteria. If one or more any-included result criteria objects are provided, then an operation result must match at least one of them in order to match the aggregate result criteria. |  [optional] |
|**notAllIncludedResultCriteria** | **List&lt;String&gt;** | Specifies a result criteria object that should not match the associated operation result in order to match the aggregate result criteria. If one or more not-all-included result criteria objects are provided, then an operation result must not match all of them (that is, it may match zero or more of them, but it must not match all of them) in order to match the aggregate result criteria. |  [optional] |
|**noneIncludedResultCriteria** | **List&lt;String&gt;** | Specifies a result criteria object that must not match the associated operation result in order to match the aggregate result criteria. If one or more none-included result criteria objects are provided, then an operation result must not match any of them in order to match the aggregate result criteria. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# AggregateRequestCriteriaResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Request Criteria |  |
|**description** | **String** | A description for this Request Criteria |  [optional] |
|**schemas** | **List&lt;EnumaggregateRequestCriteriaSchemaUrn&gt;** |  |  |
|**allIncludedRequestCriteria** | **List&lt;String&gt;** | Specifies a request criteria object that must match the associated operation request in order to match the aggregate request criteria. If one or more all-included request criteria objects are provided, then an operation request must match all of them in order to match the aggregate request criteria. |  [optional] |
|**anyIncludedRequestCriteria** | **List&lt;String&gt;** | Specifies a request criteria object that may match the associated operation request in order to the this aggregate request criteria. If one or more any-included request criteria objects are provided, then an operation request must match at least one of them in order to match the aggregate request criteria. |  [optional] |
|**notAllIncludedRequestCriteria** | **List&lt;String&gt;** | Specifies a request criteria object that should not match the associated operation request in order to match the aggregate request criteria. If one or more not-all-included request criteria objects are provided, then an operation request must not match all of them (that is, it may match zero or more of them, but it must not match all of them) in order to match the aggregate request criteria. |  [optional] |
|**noneIncludedRequestCriteria** | **List&lt;String&gt;** | Specifies a request criteria object that must not match the associated operation request in order to match the aggregate request criteria. If one or more none-included request criteria objects are provided, then an operation request must not match any of them in order to match the aggregate request criteria. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




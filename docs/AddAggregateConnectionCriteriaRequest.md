

# AddAggregateConnectionCriteriaRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**criteriaName** | **String** | Name of the new Connection Criteria |  |
|**description** | **String** | A description for this Connection Criteria |  [optional] |
|**schemas** | **List&lt;EnumaggregateConnectionCriteriaSchemaUrn&gt;** |  |  |
|**allIncludedConnectionCriteria** | **List&lt;String&gt;** | Specifies a connection criteria object that must match the associated client connection in order to match the aggregate connection criteria. If one or more all-included connection criteria objects are provided, then a client connection must match all of them in order to match the aggregate connection criteria. |  [optional] |
|**anyIncludedConnectionCriteria** | **List&lt;String&gt;** | Specifies a connection criteria object that may match the associated client connection in order to match the aggregate connection criteria. If one or more any-included connection criteria objects are provided, then a client connection must match at least one of them in order to match the aggregate connection criteria. |  [optional] |
|**notAllIncludedConnectionCriteria** | **List&lt;String&gt;** | Specifies a connection criteria object that should not match the associated client connection in order to match the aggregate connection criteria. If one or more not-all-included connection criteria objects are provided, then a client connection must not match all of them (that is, it may match zero or more of them, but it must not match all of them) in order to match the aggregate connection criteria. |  [optional] |
|**noneIncludedConnectionCriteria** | **List&lt;String&gt;** | Specifies a connection criteria object that must not match the associated client connection in order to match the aggregate connection criteria. If one or more none-included connection criteria objects are provided, then a client connection must not match any of them in order to match the aggregate connection criteria. |  [optional] |




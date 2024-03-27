

# AddAggregateSearchReferenceCriteriaRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**criteriaName** | **String** | Name of the new Search Reference Criteria |  |
|**description** | **String** | A description for this Search Reference Criteria |  [optional] |
|**schemas** | **List&lt;EnumaggregateSearchReferenceCriteriaSchemaUrn&gt;** |  |  |
|**allIncludedSearchReferenceCriteria** | **List&lt;String&gt;** | Specifies a search reference criteria object that must match the associated search result reference in order to match the aggregate search reference criteria. If one or more all-included search reference criteria objects are provided, then a search result reference must match all of them in order to match the aggregate search reference criteria. |  [optional] |
|**anyIncludedSearchReferenceCriteria** | **List&lt;String&gt;** | Specifies a search reference criteria object that may match the associated search result reference in order to match the aggregate search reference criteria. If one or more any-included search reference criteria objects are provided, then a search result reference must match at least one of them in order to match the aggregate search reference criteria. |  [optional] |
|**notAllIncludedSearchReferenceCriteria** | **List&lt;String&gt;** | Specifies a search reference criteria object that should not match the associated search result reference in order to match the aggregate search reference criteria. If one or more not-all-included search reference criteria objects are provided, then a search result reference must not match all of them (that is, it may match zero or more of them, but it must not match all of them) in order to match the aggregate search reference criteria. |  [optional] |
|**noneIncludedSearchReferenceCriteria** | **List&lt;String&gt;** | Specifies a search reference criteria object that must not match the associated search result reference in order to match the aggregate search reference criteria. If one or more none-included search reference criteria objects are provided, then a search result reference must not match any of them in order to match the aggregate search reference criteria. |  [optional] |




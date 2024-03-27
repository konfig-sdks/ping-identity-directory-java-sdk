

# AggregateSearchEntryCriteriaShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Search Entry Criteria |  [optional] |
|**schemas** | **List&lt;EnumaggregateSearchEntryCriteriaSchemaUrn&gt;** |  |  |
|**allIncludedSearchEntryCriteria** | **List&lt;String&gt;** | Specifies a search entry criteria object that must match the associated search result entry in order to match the aggregate search entry criteria. If one or more all-included search entry criteria objects are provided, then a search result entry must match all of them in order to match the aggregate search entry criteria. |  [optional] |
|**anyIncludedSearchEntryCriteria** | **List&lt;String&gt;** | Specifies a search entry criteria object that may match the associated search result entry in order to match the aggregate search entry criteria. If one or more any-included search entry criteria objects are provided, then a search result entry must match at least one of them in order to match the aggregate search entry criteria. |  [optional] |
|**notAllIncludedSearchEntryCriteria** | **List&lt;String&gt;** | Specifies a search entry criteria object that should not match the associated search result entry in order to match the aggregate search entry criteria. If one or more not-all-included search entry criteria objects are provided, then a search result entry must not match all of them (that is, it may match zero or more of them, but it must not match all of them) in order to match the aggregate search entry criteria. |  [optional] |
|**noneIncludedSearchEntryCriteria** | **List&lt;String&gt;** | Specifies a search entry criteria object that must not match the associated search result entry in order to match the aggregate search entry criteria. If one or more none-included search entry criteria objects are provided, then a search result entry must not match any of them in order to match the aggregate search entry criteria. |  [optional] |




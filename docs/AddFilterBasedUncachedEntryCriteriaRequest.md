

# AddFilterBasedUncachedEntryCriteriaRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**criteriaName** | **String** | Name of the new Uncached Entry Criteria |  |
|**description** | **String** | A description for this Uncached Entry Criteria |  [optional] |
|**schemas** | **List&lt;EnumfilterBasedUncachedEntryCriteriaSchemaUrn&gt;** |  |  |
|**filter** | **String** | Specifies the search filter that should be used to differentiate entries into cached and uncached sets. |  |
|**filterIdentifiesUncachedEntries** | **Boolean** | Indicates whether the associated filter identifies those entries which should be stored in the uncached-id2entry database (if true) or entries which should be stored in the id2entry database (if false). |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Uncached Entry Criteria is enabled for use in the server. |  |




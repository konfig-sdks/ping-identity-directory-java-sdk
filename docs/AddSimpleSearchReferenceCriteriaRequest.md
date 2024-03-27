

# AddSimpleSearchReferenceCriteriaRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**criteriaName** | **String** | Name of the new Search Reference Criteria |  |
|**description** | **String** | A description for this Search Reference Criteria |  [optional] |
|**schemas** | **List&lt;EnumsimpleSearchReferenceCriteriaSchemaUrn&gt;** |  |  |
|**requestCriteria** | **String** | Specifies a request criteria object that must match the associated request for references included in this Simple Search Reference Criteria. |  [optional] |
|**allIncludedReferenceControl** | **List&lt;String&gt;** | Specifies the OID of a control that must be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must contain all of those controls. |  [optional] |
|**anyIncludedReferenceControl** | **List&lt;String&gt;** | Specifies the OID of a control that may be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must contain at least one of those controls. |  [optional] |
|**notAllIncludedReferenceControl** | **List&lt;String&gt;** | Specifies the OID of a control that should not be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must not contain at least one of those controls (that is, it may contain zero or more of those controls, but not all of them). |  [optional] |
|**noneIncludedReferenceControl** | **List&lt;String&gt;** | Specifies the OID of a control that must not be present in search result references included in this Simple Search Reference Criteria. If any control OIDs are provided, then the reference must not contain any of those controls. |  [optional] |




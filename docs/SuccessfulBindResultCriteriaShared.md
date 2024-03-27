

# SuccessfulBindResultCriteriaShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Result Criteria |  [optional] |
|**schemas** | **List&lt;EnumsuccessfulBindResultCriteriaSchemaUrn&gt;** |  |  |
|**requestCriteria** | **String** | Specifies a request criteria object that must match the associated request for operations included in this Successful Bind Result Criteria. |  [optional] |
|**includeAnonymousBinds** | **Boolean** | Indicates whether this criteria will be permitted to match bind operations that resulted in anonymous authentication. |  [optional] |
|**includedUserBaseDN** | **List&lt;String&gt;** | A set of base DNs for authenticated users that will be permitted to match this criteria. |  [optional] |
|**excludedUserBaseDN** | **List&lt;String&gt;** | A set of base DNs for authenticated users that will not be permitted to match this criteria. |  [optional] |
|**includedUserFilter** | **List&lt;String&gt;** | A set of filters that may be used to identify entries for authenticated users that will be permitted to match this criteria. |  [optional] |
|**excludedUserFilter** | **List&lt;String&gt;** | A set of filters that may be used to identify entries for authenticated users that will not be permitted to match this criteria. |  [optional] |
|**includedUserGroupDN** | **List&lt;String&gt;** | The DNs of the groups whose members will be permitted to match this criteria. |  [optional] |
|**excludedUserGroupDN** | **List&lt;String&gt;** | The DNs of the groups whose members will not be permitted to match this criteria. |  [optional] |




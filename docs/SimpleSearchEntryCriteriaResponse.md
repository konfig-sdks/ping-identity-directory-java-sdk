

# SimpleSearchEntryCriteriaResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Search Entry Criteria |  |
|**description** | **String** | A description for this Search Entry Criteria |  [optional] |
|**schemas** | **List&lt;EnumsimpleSearchEntryCriteriaSchemaUrn&gt;** |  |  |
|**requestCriteria** | **String** | Specifies a request criteria object that must match the associated request for entries included in this Simple Search Entry Criteria. of them. |  [optional] |
|**allIncludedEntryControl** | **List&lt;String&gt;** | Specifies the OID of a control that must be present in search result entries included in this Simple Search Entry Criteria. If any control OIDs are provided, then the entry must contain all of those controls. |  [optional] |
|**anyIncludedEntryControl** | **List&lt;String&gt;** | Specifies the OID of a control that may be present in search result entries included in this Simple Search Entry Criteria. If any control OIDs are provided, then the entry must contain at least one of those controls. |  [optional] |
|**notAllIncludedEntryControl** | **List&lt;String&gt;** | Specifies the OID of a control that should not be present in search result entries included in this Simple Search Entry Criteria. If any control OIDs are provided, then the entry must not contain at least one of those controls (that is, it may contain zero or more of those controls, but not all of them). |  [optional] |
|**noneIncludedEntryControl** | **List&lt;String&gt;** | Specifies the OID of a control that must not be present in search result entries included in this Simple Search Entry Criteria. If any control OIDs are provided, then the entry must not contain any of those controls. |  [optional] |
|**includedEntryBaseDN** | **List&lt;String&gt;** | Specifies a base DN below which entries included in this Simple Search Entry Criteria may exist. |  [optional] |
|**excludedEntryBaseDN** | **List&lt;String&gt;** | Specifies a base DN below which entries included in this Simple Search Entry Criteria may not exist. |  [optional] |
|**allIncludedEntryFilter** | **List&lt;String&gt;** | Specifies a search filter that must match search result entries included in this Simple Search Entry Criteria. Note that this matching will be performed against the entry that is actually returned to the client and may not reflect the complete entry stored in the server. If any filters are provided, then the returned entry must match all of those filters. |  [optional] |
|**anyIncludedEntryFilter** | **List&lt;String&gt;** | Specifies a search filter that may match search result entries included in this Simple Search Entry Criteria. Note that this matching will be performed against the entry that is actually returned to the client and may not reflect the complete entry stored in the server. If any filters are provided, then the entry must match at least one of those filters. |  [optional] |
|**notAllIncludedEntryFilter** | **List&lt;String&gt;** | Specifies a search filter that should not match search result entries included in this Simple Search Entry Criteria. Note that this matching will be performed against the entry that is actually returned to the client and may not reflect the complete entry stored in the server. If any filters are provided, then the entry must not match at least one of those filters (that is, the entry may match zero or more of those filters, but not of all of them). |  [optional] |
|**noneIncludedEntryFilter** | **List&lt;String&gt;** | Specifies a search filter that must not match search result entries included in this Simple Search Entry Criteria. Note that this matching will be performed against the entry that is actually returned to the client and may not reflect the complete entry stored in the server. If any filters are provided, then the entry must not match any of those filters. |  [optional] |
|**allIncludedEntryGroupDN** | **List&lt;String&gt;** | Specifies the DN of a group in which the user associated with the entry must be a member to be included in this Simple Search Entry Criteria. If any group DNs are provided, then the entry must be a member of all of them. |  [optional] |
|**anyIncludedEntryGroupDN** | **List&lt;String&gt;** | Specifies the DN of a group in which the user associated with the entry may be a member to be included in this Simple Search Entry Criteria. If any group DNs are provided, then the entry must be a member of at least one of them. |  [optional] |
|**notAllIncludedEntryGroupDN** | **List&lt;String&gt;** | Specifies the DN of a group in which the user associated with the entry should not be a member to be included in this Simple Search Entry Criteria. If any group DNs are provided, then the entry must not be a member of at least one of them (that is, the entry may be a member of zero or more of the specified groups, but not of all of them). |  [optional] |
|**noneIncludedEntryGroupDN** | **List&lt;String&gt;** | Specifies the DN of a group in which the user associated with the entry must not be a member to be included in this Simple Search Entry Criteria. If any group DNs are provided, then the entry must not be a member of any of them. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




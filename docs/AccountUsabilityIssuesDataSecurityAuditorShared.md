

# AccountUsabilityIssuesDataSecurityAuditorShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumaccountUsabilityIssuesDataSecurityAuditorSchemaUrn&gt;** |  |  |
|**reportFile** | **String** | Specifies the name of the detailed report file. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Data Security Auditor is enabled for use. |  [optional] |
|**includeAttribute** | **List&lt;String&gt;** | Specifies the attributes from the audited entries that should be included detailed reports. By default, no attributes are included. |  [optional] |
|**auditBackend** | **List&lt;String&gt;** | Specifies which backends the data security auditor may be applied to. By default, the data security auditors will audit entries in all backend types that support data auditing (Local DB, LDIF, and Config File Handler). |  [optional] |
|**auditSeverity** | **EnumdataSecurityAuditorAuditSeverityProp** |  |  [optional] |






# AddIdleAccountDataSecurityAuditorRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**auditorName** | **String** | Name of the new Data Security Auditor |  |
|**schemas** | **List&lt;EnumidleAccountDataSecurityAuditorSchemaUrn&gt;** |  |  |
|**reportFile** | **String** | Specifies the name of the detailed report file. |  [optional] |
|**idleAccountWarningInterval** | **String** | The length of time to use as the warning interval for idle accounts. If the length of time since a user last authenticated is greater than the warning interval but less than the error interval (or if it is greater than the warning interval and no error interval is defined), then a warning will be generated for that account. |  |
|**idleAccountErrorInterval** | **String** | The length of time to use as the error interval for idle accounts. If the length of time since a user last authenticated is greater than the error interval, then an error will be generated for that account. If no error interval is defined, then only the warning interval will be used. |  [optional] |
|**neverLoggedInAccountWarningInterval** | **String** | The length of time to use as the warning interval for accounts that do not appear to have authenticated. If this is not specified, then the idle account warning interval will be used. |  [optional] |
|**neverLoggedInAccountErrorInterval** | **String** | The length of time to use as the error interval for accounts that do not appear to have authenticated. If this is not specified, then the never-logged-in warning interval will be used. The idle account warning and error intervals will be used if no never-logged-in interval is configured. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Data Security Auditor is enabled for use. |  [optional] |
|**includeAttribute** | **List&lt;String&gt;** | Specifies the attributes from the audited entries that should be included detailed reports. By default, no attributes are included. |  [optional] |
|**auditBackend** | **List&lt;String&gt;** | Specifies which backends the data security auditor may be applied to. By default, the data security auditors will audit entries in all backend types that support data auditing (Local DB, LDIF, and Config File Handler). |  [optional] |
|**auditSeverity** | **EnumdataSecurityAuditorAuditSeverityProp** |  |  [optional] |




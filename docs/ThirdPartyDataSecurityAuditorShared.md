

# ThirdPartyDataSecurityAuditorShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumthirdPartyDataSecurityAuditorSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Data Security Auditor. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Data Security Auditor. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Data Security Auditor is enabled for use. |  [optional] |
|**reportFile** | **String** | Specifies the name of the detailed report file. |  |
|**includeAttribute** | **List&lt;String&gt;** | Specifies the attributes from the audited entries that should be included detailed reports. By default, no attributes are included. |  [optional] |
|**auditBackend** | **List&lt;String&gt;** | Specifies which backends the data security auditor may be applied to. By default, the data security auditors will audit entries in all backend types that support data auditing (Local DB, LDIF, and Config File Handler). |  [optional] |
|**auditSeverity** | **EnumdataSecurityAuditorAuditSeverityProp** |  |  [optional] |




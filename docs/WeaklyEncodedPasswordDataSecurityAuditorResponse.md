

# WeaklyEncodedPasswordDataSecurityAuditorResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Data Security Auditor |  |
|**schemas** | **List&lt;EnumweaklyEncodedPasswordDataSecurityAuditorSchemaUrn&gt;** |  |  |
|**reportFile** | **String** | Specifies the name of the detailed report file. |  |
|**weakPasswordStorageScheme** | **List&lt;String&gt;** | The password storage schemes that are considered weak. Users with any of the specified password storage schemes will be included in the report. |  |
|**weakCryptEncoding** | **List&lt;EnumdataSecurityAuditorWeakCryptEncodingProp&gt;** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Data Security Auditor is enabled for use. |  |
|**includeAttribute** | **List&lt;String&gt;** | Specifies the attributes from the audited entries that should be included detailed reports. By default, no attributes are included. |  [optional] |
|**auditBackend** | **List&lt;String&gt;** | Specifies which backends the data security auditor may be applied to. By default, the data security auditors will audit entries in all backend types that support data auditing (Local DB, LDIF, and Config File Handler). |  [optional] |
|**auditSeverity** | **EnumdataSecurityAuditorAuditSeverityProp** |  |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




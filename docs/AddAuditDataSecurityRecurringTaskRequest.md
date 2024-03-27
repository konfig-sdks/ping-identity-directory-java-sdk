

# AddAuditDataSecurityRecurringTaskRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taskName** | **String** | Name of the new Recurring Task |  |
|**description** | **String** | A description for this Recurring Task |  [optional] |
|**schemas** | **List&lt;EnumauditDataSecurityRecurringTaskSchemaUrn&gt;** |  |  |
|**baseOutputDirectory** | **String** | The base directory below which generated reports will be written. Each invocation of the audit-data-security task will create a new subdirectory below this base directory whose name is a timestamp indicating when the report was generated. |  [optional] |
|**dataSecurityAuditor** | **List&lt;String&gt;** | The set of data security auditors that should be invoked. If no auditors are specified, then all auditors defined in the configuration will be used. |  [optional] |
|**backend** | **List&lt;String&gt;** | The set of backends that should be examined. If no backends are specified, then all backends that support this functionality will be included. |  [optional] |
|**includeFilter** | **List&lt;String&gt;** | A filter that will be used to identify entries that may be included in the generated report. If multiple filters are specified, then any entry that matches at least one of the filters will be included. If no filters are specified, then all entries will be included. |  [optional] |
|**retainPreviousReportCount** | **Integer** | The minimum number of previous reports that should be preserved after a new report is generated. |  [optional] |
|**retainPreviousReportAge** | **String** | The minimum age of previous reports that should be preserved after a new report completes successfully. |  [optional] |
|**cancelOnTaskDependencyFailure** | **Boolean** | Indicates whether an instance of this Recurring Task should be canceled if the task immediately before it in the recurring task chain fails to complete successfully (including if it is canceled by an administrator before it starts or while it is running). |  [optional] |
|**emailOnStart** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task starts running. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnSuccess** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task completes successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnFailure** | **List&lt;String&gt;** | The email addresses to which a message should be sent if an instance of this Recurring Task fails to complete successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**alertOnStart** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task starts running. |  [optional] |
|**alertOnSuccess** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task completes successfully. |  [optional] |
|**alertOnFailure** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task fails to complete successfully. |  [optional] |




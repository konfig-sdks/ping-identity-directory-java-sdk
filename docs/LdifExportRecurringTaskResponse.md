

# LdifExportRecurringTaskResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Recurring Task |  |
|**description** | **String** | A description for this Recurring Task |  [optional] |
|**schemas** | **List&lt;EnumldifExportRecurringTaskSchemaUrn&gt;** |  |  |
|**ldifDirectory** | **String** | The directory in which LDIF export files will be placed. The directory must already exist. |  |
|**backendID** | **List&lt;String&gt;** | The backend ID for a backend to be exported. |  [optional] |
|**excludeBackendID** | **List&lt;String&gt;** | The backend ID for a backend to be excluded from the export. |  [optional] |
|**compress** | **Boolean** | Indicates whether to compress the LDIF data as it is exported. |  [optional] |
|**encrypt** | **Boolean** | Indicates whether to encrypt the LDIF data as it exported. |  [optional] |
|**encryptionSettingsDefinitionID** | **String** | The ID of an encryption settings definition to use to obtain the LDIF export encryption key. |  [optional] |
|**sign** | **Boolean** | Indicates whether to cryptographically sign the exported data, which will make it possible to detect whether the LDIF data has been altered since it was exported. |  [optional] |
|**retainPreviousLDIFExportCount** | **Integer** | The minimum number of previous LDIF exports that should be preserved after a new export completes successfully. |  [optional] |
|**retainPreviousLDIFExportAge** | **String** | The minimum age of previous LDIF exports that should be preserved after a new export completes successfully. |  [optional] |
|**maxMegabytesPerSecond** | **Integer** | The maximum rate, in megabytes per second, at which LDIF exports should be written. |  [optional] |
|**postLDIFExportTaskProcessor** | **List&lt;String&gt;** | An optional set of post-LDIF-export task processors that should be invoked for the resulting LDIF export files. |  [optional] |
|**cancelOnTaskDependencyFailure** | **Boolean** | Indicates whether an instance of this Recurring Task should be canceled if the task immediately before it in the recurring task chain fails to complete successfully (including if it is canceled by an administrator before it starts or while it is running). |  [optional] |
|**emailOnStart** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task starts running. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnSuccess** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task completes successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnFailure** | **List&lt;String&gt;** | The email addresses to which a message should be sent if an instance of this Recurring Task fails to complete successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**alertOnStart** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task starts running. |  [optional] |
|**alertOnSuccess** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task completes successfully. |  [optional] |
|**alertOnFailure** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task fails to complete successfully. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




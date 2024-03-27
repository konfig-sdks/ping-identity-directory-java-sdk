

# BackupRecurringTaskResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Recurring Task |  |
|**description** | **String** | A description for this Recurring Task |  [optional] |
|**schemas** | **List&lt;EnumbackupRecurringTaskSchemaUrn&gt;** |  |  |
|**backupDirectory** | **String** | The directory in which backup files will be placed. When backing up a single backend, the backup files will be placed directly in this directory. When backing up multiple backends, the backup files for each backend will be placed in a subdirectory whose name is the corresponding backend ID. |  |
|**includedBackendID** | **List&lt;String&gt;** | The backend IDs of any backends that should be included in the backup. |  [optional] |
|**excludedBackendID** | **List&lt;String&gt;** | The backend IDs of any backends that should be excluded from the backup. All backends that support backups and are not listed will be included. |  [optional] |
|**compress** | **Boolean** | Indicates whether to compress the data as it is written into the backup. |  [optional] |
|**encrypt** | **Boolean** | Indicates whether to encrypt the data as it is written into the backup. |  [optional] |
|**encryptionSettingsDefinitionID** | **String** | The ID of an encryption settings definition to use to obtain the backup encryption key. |  [optional] |
|**sign** | **Boolean** | Indicates whether to cryptographically sign backups, which will make it possible to detect whether the backup has been altered since it was created. |  [optional] |
|**retainPreviousFullBackupCount** | **Integer** | The minimum number of previous full backups that should be preserved after a new backup completes successfully. |  [optional] |
|**retainPreviousFullBackupAge** | **String** | The minimum age of previous full backups that should be preserved after a new backup completes successfully. |  [optional] |
|**maxMegabytesPerSecond** | **Integer** | The maximum rate, in megabytes per second, at which backups should be written. |  [optional] |
|**cancelOnTaskDependencyFailure** | **Boolean** | Indicates whether an instance of this Recurring Task should be canceled if the task immediately before it in the recurring task chain fails to complete successfully (including if it is canceled by an administrator before it starts or while it is running). |  [optional] |
|**emailOnStart** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task starts running. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnSuccess** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task completes successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnFailure** | **List&lt;String&gt;** | The email addresses to which a message should be sent if an instance of this Recurring Task fails to complete successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**alertOnStart** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task starts running. |  [optional] |
|**alertOnSuccess** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task completes successfully. |  [optional] |
|**alertOnFailure** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task fails to complete successfully. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# CollectSupportDataRecurringTaskResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Recurring Task |  |
|**description** | **String** | A description for this Recurring Task |  [optional] |
|**schemas** | **List&lt;EnumcollectSupportDataRecurringTaskSchemaUrn&gt;** |  |  |
|**outputDirectory** | **String** | The directory in which the support data archive files will be placed. The path must be a directory, and that directory must already exist. Relative paths will be interpreted as relative to the server root. |  |
|**encryptionPassphraseFile** | **String** | The path to a file that contains the passphrase to encrypt the contents of the support data archive. |  [optional] |
|**includeExpensiveData** | **Boolean** | Indicates whether the support data archive should include information that may be expensive to obtain, and that may temporarily affect the server&#39;s performance or responsiveness. |  [optional] |
|**includeReplicationStateDump** | **Boolean** | Indicates whether the support data archive should include a replication state dump, which may be several megabytes in size. |  [optional] |
|**includeBinaryFiles** | **Boolean** | Indicates whether the support data archive should include binary files that may not have otherwise been included. Note that it may not be possible to obscure or redact sensitive information in binary files. |  [optional] |
|**includeExtensionSource** | **Boolean** | Indicates whether the support data archive should include the source code (if available) for any third-party extensions that may be installed in the server. |  [optional] |
|**useSequentialMode** | **Boolean** | Indicates whether to capture support data information sequentially rather than in parallel. Capturing data in sequential mode may reduce the amount of memory that the tool requires to operate, at the cost of taking longer to run. |  [optional] |
|**securityLevel** | **EnumrecurringTaskSecurityLevelProp** |  |  [optional] |
|**jstackCount** | **Integer** | The number of times to invoke the jstack utility to obtain a stack trace of all threads running in the JVM. A value of zero indicates that the jstack utility should not be invoked. |  [optional] |
|**reportCount** | **Integer** | The number of intervals of data to collect from tools that use sample-based reporting, like vmstat, iostat, and mpstat. A value of zero indicates that these kinds of tools should not be used to collect any information. |  [optional] |
|**reportIntervalSeconds** | **Integer** | The duration (in seconds) between each interval of data to collect from tools that use sample-based reporting, like vmstat, iostat, and mpstat. |  [optional] |
|**logDuration** | **String** | The maximum age (leading up to the time the collect-support-data tool was invoked) for log content to include in the support data archive. |  [optional] |
|**logFileHeadCollectionSize** | **String** | The amount of data to collect from the beginning of each log file included in the support data archive. |  [optional] |
|**logFileTailCollectionSize** | **String** | The amount of data to collect from the end of each log file included in the support data archive. |  [optional] |
|**comment** | **String** | An optional comment to include in a README file within the support data archive. |  [optional] |
|**retainPreviousSupportDataArchiveCount** | **Integer** | The minimum number of previous support data archives that should be preserved after a new archive is generated. |  [optional] |
|**retainPreviousSupportDataArchiveAge** | **String** | The minimum age of previous support data archives that should be preserved after a new archive is generated. |  [optional] |
|**cancelOnTaskDependencyFailure** | **Boolean** | Indicates whether an instance of this Recurring Task should be canceled if the task immediately before it in the recurring task chain fails to complete successfully (including if it is canceled by an administrator before it starts or while it is running). |  [optional] |
|**emailOnStart** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task starts running. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnSuccess** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task completes successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnFailure** | **List&lt;String&gt;** | The email addresses to which a message should be sent if an instance of this Recurring Task fails to complete successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**alertOnStart** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task starts running. |  [optional] |
|**alertOnSuccess** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task completes successfully. |  [optional] |
|**alertOnFailure** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task fails to complete successfully. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




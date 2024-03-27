

# ExecRecurringTaskShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Recurring Task |  [optional] |
|**schemas** | **List&lt;EnumexecRecurringTaskSchemaUrn&gt;** |  |  |
|**commandPath** | **String** | The absolute path to the command to execute. It must be an absolute path, the corresponding file must exist, and it must be listed in the config/exec-command-whitelist.txt file. |  |
|**commandArguments** | **String** | A string containing the arguments to provide to the command. If the command should be run without arguments, this property should be left undefined. If there should be multiple arguments, then they should be separated with spaces. |  [optional] |
|**commandOutputFileBaseName** | **String** | The path and base name for a file to which the command output (both standard output and standard error) should be written. This may be left undefined if the command output should not be recorded into a file. |  [optional] |
|**retainPreviousOutputFileCount** | **Integer** | The minimum number of previous command output files that should be preserved after a new instance of the command is invoked. |  [optional] |
|**retainPreviousOutputFileAge** | **String** | The minimum age of previous command output files that should be preserved after a new instance of the command is invoked. |  [optional] |
|**logCommandOutput** | **Boolean** | Indicates whether the command&#39;s output (both standard output and standard error) should be recorded in the server&#39;s error log. |  [optional] |
|**taskCompletionStateForNonzeroExitCode** | **EnumrecurringTaskTaskCompletionStateForNonzeroExitCodeProp** |  |  [optional] |
|**workingDirectory** | **String** | The absolute path to a working directory where the command should be executed. It must be an absolute path and the corresponding directory must exist. |  [optional] |
|**cancelOnTaskDependencyFailure** | **Boolean** | Indicates whether an instance of this Recurring Task should be canceled if the task immediately before it in the recurring task chain fails to complete successfully (including if it is canceled by an administrator before it starts or while it is running). |  [optional] |
|**emailOnStart** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task starts running. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnSuccess** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task completes successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnFailure** | **List&lt;String&gt;** | The email addresses to which a message should be sent if an instance of this Recurring Task fails to complete successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**alertOnStart** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task starts running. |  [optional] |
|**alertOnSuccess** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task completes successfully. |  [optional] |
|**alertOnFailure** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task fails to complete successfully. |  [optional] |




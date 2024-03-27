

# TaskBackendResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnumtaskBackendSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Backend |  [optional] |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  [optional] |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN(s) for the data that the backend handles. |  [optional] |
|**writabilityMode** | **EnumbackendWritabilityModeProp** |  |  [optional] |
|**taskBackingFile** | **String** | Specifies the path to the backing file for storing information about the tasks configured in the server. |  [optional] |
|**maximumInitialTaskLogMessagesToRetain** | **Integer** | The maximum number of log messages to retain in each task entry from the beginning of the processing for that task. If too many messages are logged during task processing, then retaining only a limited number of messages from the beginning and/or end of task processing can reduce the amount of memory that the server consumes by caching information about currently-active and recently-completed tasks. |  [optional] |
|**maximumFinalTaskLogMessagesToRetain** | **Integer** | The maximum number of log messages to retain in each task entry from the end of the processing for that task. If too many messages are logged during task processing, then retaining only a limited number of messages from the beginning and/or end of task processing can reduce the amount of memory that the server consumes by caching information about currently-active and recently-completed tasks. |  [optional] |
|**taskRetentionTime** | **String** | Specifies the length of time that task entries should be retained after processing on the associated task has been completed. |  [optional] |
|**notificationSenderAddress** | **String** | Specifies the email address to use as the sender address (that is, the \&quot;From:\&quot; address) for notification mail messages generated when a task completes execution. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  [optional] |
|**setDegradedAlertWhenDisabled** | **Boolean** | Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled. |  [optional] |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**backupFilePermissions** | **String** | Specifies the permissions that should be applied to files and directories created by a backup of the backend. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |






# GenerateServerProfileRecurringTaskShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Recurring Task |  [optional] |
|**schemas** | **List&lt;EnumgenerateServerProfileRecurringTaskSchemaUrn&gt;** |  |  |
|**profileDirectory** | **String** | The directory in which the generated server profiles will be placed. The files will be named with the pattern \&quot;server-profile-{timestamp}.zip\&quot;, where \&quot;{timestamp}\&quot; represents the time that the profile was generated. |  |
|**includePath** | **List&lt;String&gt;** | An optional set of additional paths to files within the instance root that should be included in the generated server profile. All paths must be within the instance root, and relative paths will be relative to the instance root. |  [optional] |
|**retainPreviousProfileCount** | **Integer** | The minimum number of previous server profile zip files that should be preserved after a new profile is generated. |  [optional] |
|**retainPreviousProfileAge** | **String** | The minimum age of previous server profile zip files that should be preserved after a new profile is generated. |  [optional] |
|**cancelOnTaskDependencyFailure** | **Boolean** | Indicates whether an instance of this Recurring Task should be canceled if the task immediately before it in the recurring task chain fails to complete successfully (including if it is canceled by an administrator before it starts or while it is running). |  [optional] |
|**emailOnStart** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task starts running. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnSuccess** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task completes successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnFailure** | **List&lt;String&gt;** | The email addresses to which a message should be sent if an instance of this Recurring Task fails to complete successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**alertOnStart** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task starts running. |  [optional] |
|**alertOnSuccess** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task completes successfully. |  [optional] |
|**alertOnFailure** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task fails to complete successfully. |  [optional] |




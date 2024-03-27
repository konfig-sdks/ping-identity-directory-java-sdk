

# DelayRecurringTaskShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Recurring Task |  [optional] |
|**schemas** | **List&lt;EnumdelayRecurringTaskSchemaUrn&gt;** |  |  |
|**sleepDuration** | **String** | The length of time to sleep before the task completes. |  [optional] |
|**durationToWaitForWorkQueueIdle** | **String** | Indicates that task should wait for up to the specified length of time for the work queue to report that all worker threads are idle and there are no pending operations. Note that this primarily monitors operations that use worker threads, which does not include internal operations (for example, those invoked by extensions), and may not include requests from non-LDAP clients (for example, HTTP-based clients). |  [optional] |
|**ldapURLForSearchExpectedToReturnEntries** | **List&lt;String&gt;** | An LDAP URL that provides the criteria for a search request that is expected to return at least one entry. The search will be performed internally, and only the base DN, scope, and filter from the URL will be used; any host, port, or requested attributes included in the URL will be ignored. |  [optional] |
|**searchInterval** | **String** | The length of time the server should sleep between searches performed using the criteria from the ldap-url-for-search-expected-to-return-entries property. |  [optional] |
|**searchTimeLimit** | **String** | The length of time that the server will wait for a response to each internal search performed using the criteria from the ldap-url-for-search-expected-to-return-entries property. |  [optional] |
|**durationToWaitForSearchToReturnEntries** | **String** | The maximum length of time that the server will continue to perform internal searches using the criteria from the ldap-url-for-search-expected-to-return-entries property. |  [optional] |
|**taskReturnStateIfTimeoutIsEncountered** | **EnumrecurringTaskTaskReturnStateIfTimeoutIsEncounteredProp** |  |  [optional] |
|**cancelOnTaskDependencyFailure** | **Boolean** | Indicates whether an instance of this Recurring Task should be canceled if the task immediately before it in the recurring task chain fails to complete successfully (including if it is canceled by an administrator before it starts or while it is running). |  [optional] |
|**emailOnStart** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task starts running. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnSuccess** | **List&lt;String&gt;** | The email addresses to which a message should be sent whenever an instance of this Recurring Task completes successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**emailOnFailure** | **List&lt;String&gt;** | The email addresses to which a message should be sent if an instance of this Recurring Task fails to complete successfully. If this option is used, then at least one smtp-server must be configured in the global configuration. |  [optional] |
|**alertOnStart** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task starts running. |  [optional] |
|**alertOnSuccess** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task completes successfully. |  [optional] |
|**alertOnFailure** | **Boolean** | Indicates whether the server should generate an administrative alert whenever an instance of this Recurring Task fails to complete successfully. |  [optional] |




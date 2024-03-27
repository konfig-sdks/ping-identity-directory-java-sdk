

# JdbcBasedErrorLogPublisherShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Log Publisher |  [optional] |
|**schemas** | **List&lt;EnumjdbcBasedErrorLogPublisherSchemaUrn&gt;** |  |  |
|**server** | **String** | The JDBC-based Database Server to use for a connection. |  |
|**logFieldMapping** | **String** | The log field mapping associates loggable fields to database column names. The table name is not part of this mapping. |  |
|**logTableName** | **String** | The table name to log entries to the database server. |  [optional] |
|**queueSize** | **Integer** | The maximum number of log records that can be stored in the asynchronous queue. |  [optional] |
|**defaultSeverity** | **List&lt;EnumlogPublisherDefaultSeverityProp&gt;** |  |  [optional] |
|**overrideSeverity** | **List&lt;String&gt;** | Specifies the override severity levels for the logger based on the category of the messages. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Log Publisher is enabled for use. |  |
|**loggingErrorBehavior** | **EnumlogPublisherLoggingErrorBehaviorProp** |  |  [optional] |




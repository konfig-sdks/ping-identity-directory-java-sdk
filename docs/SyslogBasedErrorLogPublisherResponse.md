

# SyslogBasedErrorLogPublisherResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Log Publisher |  |
|**description** | **String** | A description for this Log Publisher |  [optional] |
|**schemas** | **List&lt;EnumsyslogBasedErrorLogPublisherSchemaUrn&gt;** |  |  |
|**enabled** | **Boolean** | Indicates whether the Syslog Based Error Log Publisher is enabled for use. |  |
|**serverHostName** | **String** | Specifies the hostname or IP address of the syslogd host to log to. It is highly recommend to use localhost. |  |
|**serverPort** | **Integer** | Specifies the port number of the syslogd host to log to. |  |
|**syslogFacility** | **Integer** | Specifies the syslog facility to use for this Syslog Based Error Log Publisher |  |
|**autoFlush** | **Boolean** | Specifies whether to flush the writer after every log record. |  [optional] |
|**asynchronous** | **Boolean** | Indicates whether the Syslog Based Error Log Publisher will publish records asynchronously. |  |
|**queueSize** | **Integer** | The maximum number of log records that can be stored in the asynchronous queue. |  [optional] |
|**defaultSeverity** | **List&lt;EnumlogPublisherDefaultSeverityProp&gt;** |  |  [optional] |
|**overrideSeverity** | **List&lt;String&gt;** | Specifies the override severity levels for the logger based on the category of the messages. |  [optional] |
|**loggingErrorBehavior** | **EnumlogPublisherLoggingErrorBehaviorProp** |  |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# GroovyScriptedFileBasedAccessLogPublisherShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Log Publisher |  [optional] |
|**schemas** | **List&lt;EnumgroovyScriptedFileBasedAccessLogPublisherSchemaUrn&gt;** |  |  |
|**scriptClass** | **String** | The fully-qualified name of the Groovy class providing the logic for the Groovy Scripted File Based Access Log Publisher. |  |
|**logFile** | **String** | The file name to use for the log files generated by the Scripted File Based Access Log Publisher. The path to the file can be specified either as relative to the server root or as an absolute path. |  |
|**logFilePermissions** | **String** | The UNIX permissions of the log files created by this Scripted File Based Access Log Publisher. |  [optional] |
|**rotationPolicy** | **List&lt;String&gt;** | The rotation policy to use for the Scripted File Based Access Log Publisher . |  [optional] |
|**rotationListener** | **List&lt;String&gt;** | A listener that should be notified whenever a log file is rotated out of service. |  [optional] |
|**retentionPolicy** | **List&lt;String&gt;** | The retention policy to use for the Scripted File Based Access Log Publisher . |  [optional] |
|**compressionMechanism** | **EnumlogPublisherCompressionMechanismProp** |  |  [optional] |
|**signLog** | **Boolean** | Indicates whether the log should be cryptographically signed so that the log content cannot be altered in an undetectable manner. |  [optional] |
|**encryptLog** | **Boolean** | Indicates whether log files should be encrypted so that their content is not available to unauthorized users. |  [optional] |
|**encryptionSettingsDefinitionID** | **String** | Specifies the ID of the encryption settings definition that should be used to encrypt the data. If this is not provided, the server&#39;s preferred encryption settings definition will be used. The \&quot;encryption-settings list\&quot; command can be used to obtain a list of the encryption settings definitions available in the server. |  [optional] |
|**append** | **Boolean** | Specifies whether to append to existing log files. |  [optional] |
|**scriptArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Scripted File Based Access Log Publisher. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**asynchronous** | **Boolean** | Indicates whether the Scripted File Based Access Log Publisher will publish records asynchronously. |  [optional] |
|**autoFlush** | **Boolean** | Specifies whether to flush the writer after every log record. |  [optional] |
|**bufferSize** | **String** | Specifies the log file buffer size. |  [optional] |
|**queueSize** | **Integer** | The maximum number of log records that can be stored in the asynchronous queue. |  [optional] |
|**timeInterval** | **String** | Specifies the interval at which to check whether the log files need to be rotated. |  [optional] |
|**logConnects** | **Boolean** | Indicates whether to log information about connections established to the server. |  [optional] |
|**logDisconnects** | **Boolean** | Indicates whether to log information about connections that have been closed by the client or terminated by the server. |  [optional] |
|**logSecurityNegotiation** | **Boolean** | Indicates whether to log information about the result of any security negotiation (e.g., SSL handshake) processing that has been performed. |  [optional] |
|**logClientCertificates** | **Boolean** | Indicates whether to log information about any client certificates presented to the server. |  [optional] |
|**logRequests** | **Boolean** | Indicates whether to log information about requests received from clients. |  [optional] |
|**logResults** | **Boolean** | Indicates whether to log information about the results of client requests. |  [optional] |
|**logSearchEntries** | **Boolean** | Indicates whether to log information about search result entries sent to the client. |  [optional] |
|**logSearchReferences** | **Boolean** | Indicates whether to log information about search result references sent to the client. |  [optional] |
|**logIntermediateResponses** | **Boolean** | Indicates whether to log information about intermediate responses sent to the client. |  [optional] |
|**suppressInternalOperations** | **Boolean** | Indicates whether internal operations (for example, operations that are initiated by plugins) should be logged along with the operations that are requested by users. |  [optional] |
|**suppressReplicationOperations** | **Boolean** | Indicates whether access messages that are generated by replication operations should be suppressed. |  [optional] |
|**correlateRequestsAndResults** | **Boolean** | Indicates whether to automatically log result messages for any operation in which the corresponding request was logged. In such cases, the result, entry, and reference criteria will be ignored, although the log-responses, log-search-entries, and log-search-references properties will be honored. |  [optional] |
|**connectionCriteria** | **String** | Specifies a set of connection criteria that must match the associated client connection in order for a connect, disconnect, request, or result message to be logged. |  [optional] |
|**requestCriteria** | **String** | Specifies a set of request criteria that must match the associated operation request in order for a request or result to be logged by this Access Log Publisher. |  [optional] |
|**resultCriteria** | **String** | Specifies a set of result criteria that must match the associated operation result in order for that result to be logged by this Access Log Publisher. |  [optional] |
|**searchEntryCriteria** | **String** | Specifies a set of search entry criteria that must match the associated search result entry in order for that it to be logged by this Access Log Publisher. |  [optional] |
|**searchReferenceCriteria** | **String** | Specifies a set of search reference criteria that must match the associated search result reference in order for that it to be logged by this Access Log Publisher. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Log Publisher is enabled for use. |  |
|**loggingErrorBehavior** | **EnumlogPublisherLoggingErrorBehaviorProp** |  |  [optional] |




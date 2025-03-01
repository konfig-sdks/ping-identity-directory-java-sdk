

# GroovyScriptedAccessLogPublisherResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Log Publisher |  |
|**description** | **String** | A description for this Log Publisher |  [optional] |
|**schemas** | **List&lt;EnumgroovyScriptedAccessLogPublisherSchemaUrn&gt;** |  |  |
|**scriptClass** | **String** | The fully-qualified name of the Groovy class providing the logic for the Groovy Scripted Access Log Publisher. |  |
|**scriptArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Scripted Access Log Publisher. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
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
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




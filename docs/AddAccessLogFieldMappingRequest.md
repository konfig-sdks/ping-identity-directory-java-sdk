

# AddAccessLogFieldMappingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mappingName** | **String** | Name of the new Log Field Mapping |  |
|**description** | **String** | A description for this Log Field Mapping |  [optional] |
|**schemas** | **List&lt;EnumaccessLogFieldMappingSchemaUrn&gt;** |  |  |
|**logFieldTimestamp** | **String** | The time that the operation was processed. |  [optional] |
|**logFieldConnectionID** | **String** | The connection ID assigned to the client connection. |  [optional] |
|**logFieldStartupid** | **String** | The startup ID for the Directory Server. A different value will be generated each time the server is started, and it may be used to distinguish between operations with the same connection ID and operation ID across server restarts. |  [optional] |
|**logFieldProductName** | **String** | The name for this Directory Server product, which may be used to identify which product was used to log the message if multiple products log to the same database table. |  [optional] |
|**logFieldInstanceName** | **String** | A name that uniquely identifies this Directory Server instance, which may be used to identify which instance was used to log the message if multiple server instances log to the same database table. |  [optional] |
|**logFieldOperationID** | **String** | The operation ID for the operation processed by the server. |  [optional] |
|**logFieldMessageType** | **String** | The type of log message. Message types may include \&quot;CONNECT\&quot;, \&quot;DISCONNECT\&quot;, \&quot;FORWARD\&quot;, \&quot;RESULT\&quot;, \&quot;ENTRY\&quot;, or \&quot;REFERENCE\&quot;. |  [optional] |
|**logFieldOperationType** | **String** | The type of operation that was processed. |  [optional] |
|**logFieldMessageID** | **String** | The message ID included in the client request. |  [optional] |
|**logFieldResultCode** | **String** | The numeric result code for the operation. |  [optional] |
|**logFieldMessage** | **String** | The diagnostic message for the operation. |  [optional] |
|**logFieldOrigin** | **String** | The origin for the operation. Values may include \&quot;replication\&quot; (if the operation was received via replication), \&quot;internal\&quot; (if it was an internal operation processed by a server component), or \&quot;external\&quot; (if it was a request from a client). |  [optional] |
|**logFieldRequesterDN** | **String** | The DN of the user that requested the operation. |  [optional] |
|**logFieldDisconnectReason** | **String** | The reason that the client connection was closed. |  [optional] |
|**logFieldDeleteOldRDN** | **String** | Indicates whether the old RDN values should be removed from an entry while processing a modify DN operation. |  [optional] |
|**logFieldAuthenticatedUserDN** | **String** | The DN of the user that authenticated to the server. |  [optional] |
|**logFieldProcessingTime** | **String** | The length of time (in milliseconds with microsecond accuracy) required to process the operation. |  [optional] |
|**logFieldRequestedAttributes** | **String** | The set of requested attributes for the search operation. |  [optional] |
|**logFieldSASLMechanismName** | **String** | The name of the SASL mechanism used to authenticate. |  [optional] |
|**logFieldNewRDN** | **String** | The new RDN to use for a modify DN operation. |  [optional] |
|**logFieldBaseDN** | **String** | The base DN for a search operation. |  [optional] |
|**logFieldBindDN** | **String** | The bind DN for a bind operation. |  [optional] |
|**logFieldMatchedDN** | **String** | The DN of the superior entry closest to the DN specified by the client. |  [optional] |
|**logFieldRequesterIPAddress** | **String** | The IP address of the client that requested the operation. |  [optional] |
|**logFieldAuthenticationType** | **String** | The type of authentication requested by the client. |  [optional] |
|**logFieldNewSuperiorDN** | **String** | The new superior DN from a modify DN operation. |  [optional] |
|**logFieldFilter** | **String** | The filter from a search operation. |  [optional] |
|**logFieldAlternateAuthorizationDN** | **String** | The DN of the alternate authorization identity used when processing the operation. |  [optional] |
|**logFieldEntryDN** | **String** | The DN of the entry targeted by the operation. |  [optional] |
|**logFieldEntriesReturned** | **String** | The number of search result entries returned to the client. |  [optional] |
|**logFieldAuthenticationFailureID** | **String** | The numeric identifier for the authentication failure reason. |  [optional] |
|**logFieldRequestOID** | **String** | The OID of an extended request. |  [optional] |
|**logFieldResponseOID** | **String** | The OID of an extended response. |  [optional] |
|**logFieldTargetProtocol** | **String** | The protocol used when forwarding the request to a backend server. |  [optional] |
|**logFieldTargetPort** | **String** | The network port of the Directory Server to which the client connection has been established, or of the backend server to which the request has been forwarded. |  [optional] |
|**logFieldTargetAddress** | **String** | The network address of the Directory Server to which the client connection has been established. |  [optional] |
|**logFieldTargetAttribute** | **String** | The name of the attribute targeted by a compare operation. |  [optional] |
|**logFieldTargetHost** | **String** | The address of the server to which the request has been forwarded. |  [optional] |
|**logFieldProtocolVersion** | **String** | The protocol version used by the client when communicating with the Directory Server. |  [optional] |
|**logFieldProtocolName** | **String** | The name of the protocol the client is using to communicate with the Directory Server. |  [optional] |
|**logFieldAuthenticationFailureReason** | **String** | A message explaining the reason that the authentication attempt failed. |  [optional] |
|**logFieldAdditionalInformation** | **String** | Additional information about the operation that was processed which was not returned to the client. |  [optional] |
|**logFieldUnindexed** | **String** | Indicates whether the requested search operation was unindexed. |  [optional] |
|**logFieldScope** | **String** | The scope for the search operation. |  [optional] |
|**logFieldReferralUrls** | **String** | The referral URLs returned to the client. |  [optional] |
|**logFieldSourceAddress** | **String** | The address of the client from which the connection was established. |  [optional] |
|**logFieldMessageIDToAbandon** | **String** | The message ID of the operation to be abandoned. |  [optional] |
|**logFieldResponseControls** | **String** | The OIDs of the response controls returned to the client. |  [optional] |
|**logFieldRequestControls** | **String** | The OIDs of the request controls returned to the client. |  [optional] |
|**logFieldIntermediateClientResult** | **String** | The contents of the intermediate client response control returned to the client. |  [optional] |
|**logFieldIntermediateClientRequest** | **String** | The contents of the intermediate client request control provided by the client. |  [optional] |
|**logFieldReplicationChangeID** | **String** | The replication change ID. |  [optional] |




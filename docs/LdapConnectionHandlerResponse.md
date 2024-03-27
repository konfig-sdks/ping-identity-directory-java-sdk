

# LdapConnectionHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Connection Handler |  |
|**description** | **String** | A description for this Connection Handler |  [optional] |
|**schemas** | **List&lt;EnumldapConnectionHandlerSchemaUrn&gt;** |  |  |
|**listenAddress** | **List&lt;String&gt;** | Specifies the address or set of addresses on which this LDAP Connection Handler should listen for connections from LDAP clients. |  [optional] |
|**listenPort** | **Integer** | Specifies the port number on which the LDAP Connection Handler will listen for connections from clients. |  |
|**useSSL** | **Boolean** | Indicates whether the LDAP Connection Handler should use SSL. |  [optional] |
|**allowStartTLS** | **Boolean** | Indicates whether clients are allowed to use StartTLS. |  [optional] |
|**sslCertNickname** | **String** | Specifies the nickname (also called the alias) of the certificate that the LDAP Connection Handler should use when performing SSL communication. |  [optional] |
|**keyManagerProvider** | **String** | Specifies the name of the key manager that should be used with this LDAP Connection Handler . |  [optional] |
|**trustManagerProvider** | **String** | Specifies the name of the trust manager that should be used with the LDAP Connection Handler . |  [optional] |
|**allowLDAPV2** | **Boolean** | Indicates whether connections from LDAPv2 clients are allowed. |  [optional] |
|**useTCPKeepAlive** | **Boolean** | Indicates whether the LDAP Connection Handler should use TCP keep-alive. |  [optional] |
|**sendRejectionNotice** | **Boolean** | Indicates whether the LDAP Connection Handler should send a notice of disconnection extended response message to the client if a new connection is rejected for some reason. |  [optional] |
|**failedBindResponseDelay** | **String** | Specifies the length of time that the server should delay the response to non-successful bind operations. A value of zero milliseconds indicates that non-successful bind operations should not be delayed. |  [optional] |
|**maxRequestSize** | **String** | Specifies the size of the largest LDAP request message that will be allowed by this LDAP Connection handler. |  [optional] |
|**maxCancelHandlers** | **Integer** | Specifies the maximum number of threads that are used to process cancel and abandon requests from clients. |  [optional] |
|**numAcceptHandlers** | **Integer** | Specifies the number of threads that are used to accept new client connections, and to perform any initial preparation on those connections that may be needed before the connection can be used to read requests and send responses. |  [optional] |
|**numRequestHandlers** | **Integer** | Specifies the number of request handlers that are used to read requests from clients. |  [optional] |
|**requestHandlerPerConnection** | **Boolean** | Indicates whether a separate request handler thread should be created for each client connection, which can help avoid starvation of client connections for cases in which one or more clients send large numbers of concurrent asynchronous requests. This should only be used for cases in which a relatively small number of connections will be established at any given time, the connections established will generally be long-lived, and at least one client may send high volumes of asynchronous requests. This property can be used to alleviate possible blocking during long-running TLS negotiation on a single request handler which can result in it being unable to acknowledge further client requests until the TLS negotation completes or times out. |  [optional] |
|**sslClientAuthPolicy** | **EnumconnectionHandlerSslClientAuthPolicyProp** |  |  [optional] |
|**acceptBacklog** | **Integer** | Specifies the maximum number of pending connection attempts that are allowed to queue up in the accept backlog before the server starts rejecting new connection attempts. |  [optional] |
|**sslProtocol** | **List&lt;String&gt;** | Specifies the names of the TLS protocols that are allowed for use in SSL or StartTLS communication. The set of supported ssl protocols can be viewed via the ssl context monitor entry. |  [optional] |
|**sslCipherSuite** | **List&lt;String&gt;** | Specifies the names of the TLS cipher suites that are allowed for use in SSL or StartTLS communication. The set of supported cipher suites can be viewed via the ssl context monitor entry. |  [optional] |
|**maxBlockedWriteTimeLimit** | **String** | Specifies the maximum length of time that attempts to write data to LDAP clients should be allowed to block. |  [optional] |
|**autoAuthenticateUsingClientCertificate** | **Boolean** | Indicates whether to attempt to automatically authenticate a client connection that has established a secure communication channel (using either SSL or StartTLS) and presented its own client certificate. Generally, clients should use the SASL EXTERNAL mechanism to authenticate using a client certificate, but some clients may not support that capability and/or may expect automatic authentication. |  [optional] |
|**closeConnectionsWhenUnavailable** | **Boolean** | Indicates whether all connections associated with this LDAP Connection Handler should be closed and no new connections accepted when the server has determined that it is \&quot;unavailable.\&quot; This allows clients (or a network load balancer) to route requests to another server. |  [optional] |
|**closeConnectionsOnExplicitGC** | **Boolean** | Indicates whether all connections associated with this LDAP Connection Handler should be closed before an explicit garbage collection is performed to allow clients to route requests to another server. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Connection Handler is enabled. |  |
|**allowedClient** | **List&lt;String&gt;** | Specifies a set of address masks that determines the addresses of the clients that are allowed to establish connections to this connection handler. |  [optional] |
|**deniedClient** | **List&lt;String&gt;** | Specifies a set of address masks that determines the addresses of the clients that are not allowed to establish connections to this connection handler. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




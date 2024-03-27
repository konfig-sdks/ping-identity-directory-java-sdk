

# HttpConnectionHandlerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Connection Handler |  [optional] |
|**schemas** | **List&lt;EnumhttpConnectionHandlerSchemaUrn&gt;** |  |  |
|**listenAddress** | **String** | Specifies the address on which to listen for connections from HTTP clients. If no value is defined, the server will listen on all addresses on all interfaces. |  [optional] |
|**listenPort** | **Integer** | Specifies the port number on which the HTTP Connection Handler will listen for connections from clients. |  |
|**useSSL** | **Boolean** | Indicates whether the HTTP Connection Handler should use SSL. |  [optional] |
|**sslCertNickname** | **String** | Specifies the nickname (also called the alias) of the certificate that the HTTP Connection Handler should use when performing SSL communication. |  [optional] |
|**httpServletExtension** | **List&lt;String&gt;** | Specifies information about servlets that will be provided via this connection handler. |  [optional] |
|**webApplicationExtension** | **List&lt;String&gt;** | Specifies information about web applications that will be provided via this connection handler. |  [optional] |
|**httpOperationLogPublisher** | **List&lt;String&gt;** | Specifies the set of HTTP operation loggers that should be used to log information about requests and responses for operations processed through this HTTP Connection Handler. |  [optional] |
|**sslProtocol** | **List&lt;String&gt;** | Specifies the names of the SSL protocols that are allowed for use in SSL communication. The set of supported ssl protocols can be viewed via the ssl context monitor entry. |  [optional] |
|**sslCipherSuite** | **List&lt;String&gt;** | Specifies the names of the SSL cipher suites that are allowed for use in SSL communication. The set of supported cipher suites can be viewed via the ssl context monitor entry. |  [optional] |
|**keyManagerProvider** | **String** | Specifies the key manager provider that will be used to obtain the certificate to present to HTTPS clients. |  [optional] |
|**trustManagerProvider** | **String** | Specifies the trust manager provider that will be used to validate any certificates presented by HTTPS clients. |  [optional] |
|**numRequestHandlers** | **Integer** | Specifies the number of threads that will be used for accepting connections and reading requests from clients. |  [optional] |
|**keepStats** | **Boolean** | Indicates whether to enable statistics collection for this connection handler. |  [optional] |
|**acceptBacklog** | **Integer** | Specifies the number of concurrent outstanding connection attempts that the connection handler should allow. The default value should be acceptable in most cases, but it may need to be increased in environments that may attempt to establish large numbers of connections simultaneously. |  [optional] |
|**allowTCPReuseAddress** | **Boolean** | Indicates whether the server should attempt to reuse socket descriptors. This may be useful in environments with a high rate of connection establishment and termination. |  [optional] |
|**idleTimeLimit** | **String** | Specifies the maximum idle time for a connection. The max idle time is applied when waiting for a new request to be received on a connection, when reading the headers and content of a request, or when writing the headers and content of a response. |  [optional] |
|**lowResourcesConnectionThreshold** | **Integer** | Specifies the number of connections, which if exceeded, places this handler in a low resource state where a different idle time limit is applied on the connections. |  [optional] |
|**lowResourcesIdleTimeLimit** | **String** | Specifies the maximum idle time for a connection when this handler is in a low resource state as defined by low-resource-connections. The max idle time is applied when waiting for a new request to be received on a connection, when reading the headers and content of a request, or when writing the headers and content of a response. |  [optional] |
|**enableMultipartMIMEParameters** | **Boolean** | Determines whether request form parameters submitted in multipart/ form-data (RFC 2388) format should be processed as request parameters. |  [optional] |
|**useForwardedHeaders** | **Boolean** | Indicates whether to use \&quot;Forwarded\&quot; and \&quot;X-Forwarded-*\&quot; request headers to override corresponding HTTP request information available during request processing. |  [optional] |
|**httpRequestHeaderSize** | **Integer** | Specifies the maximum buffer size of an http request including the request uri and all of the request headers. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**useCorrelationIDHeader** | **Boolean** | If enabled, a correlation ID header will be added to outgoing HTTP responses. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |
|**correlationIDRequestHeader** | **List&lt;String&gt;** | Specifies the set of HTTP request headers that may contain a value to be used as the correlation ID. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |
|**sslClientAuthPolicy** | **EnumconnectionHandlerSslClientAuthPolicyProp** |  |  [optional] |
|**enableSniHostnameChecks** | **Boolean** | Requires SNI hostnames to match or else throw an Invalid SNI error. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Connection Handler is enabled. |  |




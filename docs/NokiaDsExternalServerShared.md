

# NokiaDsExternalServerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;EnumnokiaDsExternalServerSchemaUrn&gt;** |  |  |
|**verifyCredentialsMethod** | **EnumexternalServerVerifyCredentialsMethodProp** |  |  [optional] |
|**useAdministrativeOperationControl** | **Boolean** | Indicates whether to include the administrative operation request control in requests sent to this server which are intended for administrative operations (e.g., health checking) rather than requests directly from clients. |  [optional] |
|**serverHostName** | **String** | The host name or IP address of the target LDAP server. |  |
|**serverPort** | **Integer** | The port number on which the server listens for requests. |  [optional] |
|**location** | **String** | Specifies the location for the LDAP External Server. |  [optional] |
|**bindDN** | **String** | The DN to use to bind to the target LDAP server if simple authentication is required. |  [optional] |
|**password** | **String** | The login password for the specified user. |  [optional] |
|**passphraseProvider** | **String** | The passphrase provider to use to obtain the login password for the specified user. |  [optional] |
|**connectionSecurity** | **EnumexternalServerNokiaDsConnectionSecurityProp** |  |  [optional] |
|**authenticationMethod** | **EnumexternalServerNokiaDsAuthenticationMethodProp** |  |  [optional] |
|**healthCheckConnectTimeout** | **String** | Specifies the maximum length of time to wait for a connection to be established for the purpose of performing a health check. If the connection cannot be established within this length of time, the server will be classified as unavailable. |  [optional] |
|**maxConnectionAge** | **String** | Specifies the maximum length of time that connections to this server should be allowed to remain established before being closed and replaced with newly-established connections. |  [optional] |
|**minExpiredConnectionDisconnectInterval** | **String** | Specifies the minimum length of time that should pass between connection closures as a result of the connections being established for longer than the maximum connection age. This may help avoid cases in which a large number of connections are closed and re-established in a short period of time because of the maximum connection age. |  [optional] |
|**connectTimeout** | **String** | Specifies the maximum length of time to wait for a connection to be established before giving up and considering the server unavailable. |  [optional] |
|**maxResponseSize** | **String** | Specifies the maximum response size that should be supported for messages received from the LDAP external server. |  [optional] |
|**keyManagerProvider** | **String** | The key manager provider to use if SSL or StartTLS is to be used for connection-level security. When specifying a value for this property (except when using the Null key manager provider) you must ensure that the external server trusts this server&#39;s public certificate by adding this server&#39;s public certificate to the external server&#39;s trust store. |  [optional] |
|**trustManagerProvider** | **String** | The trust manager provider to use if SSL or StartTLS is to be used for connection-level security. |  [optional] |
|**initialConnections** | **Integer** | The number of connections to initially establish to the LDAP external server. A value of zero indicates that the number of connections should be dynamically based on the number of available worker threads. This will be ignored when using a thread-local connection pool. |  [optional] |
|**maxConnections** | **Integer** | The maximum number of concurrent connections to maintain for the LDAP external server. A value of zero indicates that the number of connections should be dynamically based on the number of available worker threads. This will be ignored when using a thread-local connection pool. |  [optional] |
|**defunctConnectionResultCode** | **List&lt;EnumexternalServerDefunctConnectionResultCodeProp&gt;** |  |  [optional] |
|**abandonOnTimeout** | **Boolean** | Indicates whether to send an abandon request for an operation for which a response timeout is encountered. A request which has timed out on one server may be retried on another server regardless of whether an abandon request is sent, but if the initial attempt is not abandoned then a long-running operation may unnecessarily continue to consume processing resources on the initial server. |  [optional] |




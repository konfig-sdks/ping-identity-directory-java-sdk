

# HttpServerInstanceListenerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumhttpServerInstanceListenerSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Server Instance Listener |  |
|**listenAddress** | **String** | If the server is listening on a particular address different from the hostname, then this property may be used to specify the address on which to listen for connections from HTTP clients. |  [optional] |
|**serverHTTPPort** | **Integer** | The TCP port number on which the HTTP server is listening. |  [optional] |
|**connectionSecurity** | **EnumserverInstanceListenerHttpConnectionSecurityProp** |  |  [optional] |
|**purpose** | **List&lt;EnumserverInstanceListenerPurposeProp&gt;** |  |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




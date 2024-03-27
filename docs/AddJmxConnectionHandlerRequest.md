

# AddJmxConnectionHandlerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**handlerName** | **String** | Name of the new Connection Handler |  |
|**description** | **String** | A description for this Connection Handler |  [optional] |
|**schemas** | **List&lt;EnumjmxConnectionHandlerSchemaUrn&gt;** |  |  |
|**listenPort** | **Integer** | Specifies the port number on which the JMX Connection Handler will listen for connections from clients. |  |
|**useSSL** | **Boolean** | Indicates whether the JMX Connection Handler should use SSL. |  [optional] |
|**sslCertNickname** | **String** | Specifies the nickname (also called the alias) of the certificate that the JMX Connection Handler should use when performing SSL communication. |  [optional] |
|**keyManagerProvider** | **String** | Specifies the name of the key manager that should be used with this JMX Connection Handler . |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Connection Handler is enabled. |  |
|**allowedClient** | **List&lt;String&gt;** | Specifies a set of address masks that determines the addresses of the clients that are allowed to establish connections to this connection handler. |  [optional] |
|**deniedClient** | **List&lt;String&gt;** | Specifies a set of address masks that determines the addresses of the clients that are not allowed to establish connections to this connection handler. |  [optional] |






# HttpExternalServerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the External Server |  |
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;EnumhttpExternalServerSchemaUrn&gt;** |  |  |
|**baseURL** | **String** | The base URL of the external server, optionally including port number, for example \&quot;https://externalService:9031\&quot;. |  |
|**hostnameVerificationMethod** | **EnumexternalServerHttpHostnameVerificationMethodProp** |  |  [optional] |
|**keyManagerProvider** | **String** | The key manager provider to use if SSL (HTTPS) is to be used for connection-level security. When specifying a value for this property (except when using the Null key manager provider) you must ensure that the external server trusts this server&#39;s public certificate by adding this server&#39;s public certificate to the external server&#39;s trust store. |  [optional] |
|**trustManagerProvider** | **String** | The trust manager provider to use if SSL (HTTPS) is to be used for connection-level security. |  [optional] |
|**sslCertNickname** | **String** | The certificate alias within the keystore to use if SSL (HTTPS) is to be used for connection-level security. When specifying a value for this property you must ensure that the external server trusts this server&#39;s public certificate by adding this server&#39;s public certificate to the external server&#39;s trust store. |  [optional] |
|**connectTimeout** | **String** | Specifies the maximum length of time to wait for a connection to be established before aborting a request to the server. |  [optional] |
|**responseTimeout** | **String** | Specifies the maximum length of time to wait for response data to be read from an established connection before aborting a request to the server. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




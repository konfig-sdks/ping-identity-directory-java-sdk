

# ApiExternalServerResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;EnumapiExternalServerSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the External Server |  [optional] |
|**baseURL** | **String** | The base URL of the external server, optionally including port number, for example \&quot;https://externalService:9031\&quot;. |  [optional] |
|**hostnameVerificationMethod** | **EnumexternalServerApiHostnameVerificationMethodProp** |  |  [optional] |
|**keyManagerProvider** | **String** | The key manager provider to use if SSL (HTTPS) is to be used for connection-level security. When specifying a value for this property (except when using the Null key manager provider) you must ensure that the external server trusts this server&#39;s public certificate by adding this server&#39;s public certificate to the external server&#39;s trust store. |  [optional] |
|**trustManagerProvider** | **String** | The trust manager provider to use if SSL (HTTPS) is to be used for connection-level security. |  [optional] |
|**allowedHeader** | **List&lt;String&gt;** | A list of HTTP headers that will be forwarded by the PingAuthorize Server to the downstream API server. |  [optional] |
|**userName** | **String** | The name of the login account to use for HTTP requests to the downstream API server using basic authentication. This property is ignored unless an associated Gateway API Endpoint&#39;s http-auth-evaluation-behavior property is set to \&quot;evaluate-and-replace\&quot;. |  [optional] |
|**password** | **String** | The name of the login password to use for HTTP requests to the downstream API server using basic authentication. This property is ignored unless an associated Gateway API Endpoint&#39;s http-auth-evaluation-behavior property is set to \&quot;evaluate-and-replace\&quot;. |  [optional] |
|**sslCertNickname** | **String** | The certificate alias within the keystore to use if SSL (HTTPS) is to be used for connection-level security. When specifying a value for this property you must ensure that the external server trusts this server&#39;s public certificate by adding this server&#39;s public certificate to the external server&#39;s trust store. |  [optional] |
|**connectTimeout** | **String** | Specifies the maximum length of time to wait for a connection to be established before aborting a request to the server. |  [optional] |
|**responseTimeout** | **String** | Specifies the maximum length of time to wait for response data to be read from an established connection before aborting a request to the server. |  [optional] |




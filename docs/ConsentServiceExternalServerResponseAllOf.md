

# ConsentServiceExternalServerResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;EnumconsentServiceExternalServerSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the External Server |  [optional] |
|**baseURL** | **String** | The base URL of the external Consent Service, including the base path and optionally including the port number. For example, \&quot;https://example.com:1443/consent/v1\&quot;. |  [optional] |
|**userName** | **String** | The name of the login account to use when using Basic authentication on REST calls to the Consent Service. |  [optional] |
|**password** | **String** | The login password to use when using Basic authentication on REST calls to the Consent Service. |  [optional] |
|**hostnameVerificationMethod** | **EnumexternalServerConsentServiceHostnameVerificationMethodProp** |  |  [optional] |
|**keyManagerProvider** | **String** | The key manager provider to use if SSL (HTTPS) is to be used for connection-level security. When specifying a value for this property (except when using the Null key manager provider) you must ensure that the external server trusts this server&#39;s public certificate by adding this server&#39;s public certificate to the external server&#39;s trust store. |  [optional] |
|**trustManagerProvider** | **String** | The trust manager provider to use if SSL (HTTPS) is to be used for connection-level security. |  [optional] |
|**sslCertNickname** | **String** | The certificate alias within the keystore to use if SSL (HTTPS) is to be used for connection-level security. When specifying a value for this property you must ensure that the external server trusts this server&#39;s public certificate by adding this server&#39;s public certificate to the external server&#39;s trust store. |  [optional] |
|**connectTimeout** | **String** | Specifies the maximum length of time to wait for a connection to be established before aborting a request to the server. |  [optional] |
|**responseTimeout** | **String** | Specifies the maximum length of time to wait for response data to be read from an established connection before aborting a request to the server. |  [optional] |




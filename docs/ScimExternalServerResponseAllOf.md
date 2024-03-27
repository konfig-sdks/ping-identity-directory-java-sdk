

# ScimExternalServerResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;EnumscimExternalServerSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the External Server |  [optional] |
|**scimServiceURL** | **String** | The complete URL which will be used to access the SCIM service provider. |  [optional] |
|**userName** | **String** | The name of the login account to use when connecting to the SCIM service provider. This is used in conjunction with the chosen authentication-method. |  [optional] |
|**password** | **String** | The login password for the specified user name. This is used in conjunction with the chosen authentication-method. |  [optional] |
|**passphraseProvider** | **String** | The passphrase provider to use to obtain the login password for the specified user. |  [optional] |
|**location** | **String** | Specifies the location for the SCIM External Server. |  [optional] |
|**connectionSecurity** | **EnumexternalServerScimConnectionSecurityProp** |  |  [optional] |
|**authenticationMethod** | **EnumexternalServerScimAuthenticationMethodProp** |  |  [optional] |
|**hostnameVerificationMethod** | **EnumexternalServerScimHostnameVerificationMethodProp** |  |  [optional] |
|**httpProxyExternalServer** | **String** | A reference to an HTTP proxy server that should be used for requests sent to the SCIM service. |  [optional] |
|**keyManagerProvider** | **String** | The key manager provider to use if SSL is to be used for connection-level security. When specifying a value for this property (except when using the Null key manager provider) you must ensure that the external server trusts this server&#39;s public certificate by adding this server&#39;s public certificate to the external server&#39;s trust store. |  [optional] |
|**trustManagerProvider** | **String** | The trust manager provider to use if SSL is to be used for connection-level security. |  [optional] |
|**connectTimeout** | **String** | Specifies the amount of time to wait for a response from the service provider when establishing a connection. If the timeout is exceeded, the Directory Server will attempt to fail over to a different server. A value of zero indicates no timeout. |  [optional] |
|**responseTimeout** | **String** | Specifies the maximum length of time that an operation should be allowed to block while waiting for a response from the SCIM service provider. A value of zero indicates that there should be no client-side timeout. |  [optional] |
|**oauthTokenType** | **EnumexternalServerOAuthTokenTypeProp** |  |  [optional] |
|**oauthToken** | **String** | The token to use in conjunction with the OAuth authentication-method and the chosen oauth-token-type. |  [optional] |




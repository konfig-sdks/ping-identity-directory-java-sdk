

# Scim2ExternalServerResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;Enumscim2ExternalServerSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the External Server |  [optional] |
|**scimServiceURL** | **String** | The base URL for the SCIMv2 service. It must include the hostname, port, and base path to use to make SCIMv2 calls. |  [optional] |
|**httpProxyExternalServer** | **String** | A reference to an HTTP proxy server that should be used for requests sent to the SCIMv2 service. |  [optional] |
|**keyManagerProvider** | **String** | The key manager provider to use if it is necessary to present a client certificate to the SCIMv2 server. |  [optional] |
|**trustManagerProvider** | **String** | The trust manager provider to use to determine whether to trust the certificate presented by the SCIMv2 server during TLS negotiation. |  [optional] |
|**sslCertNickname** | **String** | The nickname (alias) of the entry in the associated key store that holds the client certificate chain to present to the SCIMv2 server during TLS negotiation. |  [optional] |
|**hostnameVerificationMethod** | **EnumexternalServerScim2HostnameVerificationMethodProp** |  |  [optional] |
|**httpAuthorizationMethod** | **String** | The method to use to authorize requests sent to the SCIMv2 server. |  [optional] |
|**responseTimeout** | **String** | The maximum length of time to wait for a response from the SCIMv2 server when processing operations. |  [optional] |
|**clientReconnectInterval** | **String** | The maximum length of time that a client instance should remain active before being recreated. |  [optional] |




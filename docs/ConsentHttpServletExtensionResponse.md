

# ConsentHttpServletExtensionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnumconsentHttpServletExtensionSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the HTTP Servlet Extension |  |
|**bearerTokenAuthEnabled** | **Boolean** | Enables HTTP bearer token authentication. |  [optional] |
|**basicAuthEnabled** | **Boolean** | Enables HTTP Basic authentication, using a username and password. The Identity Mapper specified by the identity-mapper property will be used to map the username to a DN. |  [optional] |
|**identityMapper** | **String** | Specifies the Identity Mapper that is to be used for associating basic authentication usernames with DNs. |  [optional] |
|**accessTokenValidator** | **List&lt;String&gt;** | If specified, the Access Token Validator(s) that may be used to validate access tokens for requests submitted to this Consent HTTP Servlet Extension. |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




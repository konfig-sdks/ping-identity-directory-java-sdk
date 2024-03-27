

# DirectoryRestApiHttpServletExtensionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnumdirectoryRestApiHttpServletExtensionSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the HTTP Servlet Extension |  |
|**basicAuthEnabled** | **Boolean** | Enables HTTP Basic authentication, using a username and password. The Identity Mapper specified by the identity-mapper property will be used to map the username to a DN. |  [optional] |
|**identityMapper** | **String** | Specifies the Identity Mapper that is to be used for associating user entries with basic authentication usernames. |  [optional] |
|**accessTokenValidator** | **List&lt;String&gt;** | If specified, the Access Token Validator(s) that may be used to validate access tokens for requests submitted to this Directory REST API HTTP Servlet Extension. |  [optional] |
|**accessTokenScope** | **String** | The name of a scope that must be present in an access token accepted by the Directory REST API HTTP Servlet Extension. |  [optional] |
|**audience** | **String** | A string or URI that identifies the Directory REST API HTTP Servlet Extension in the context of OAuth2 authorization. |  [optional] |
|**maxPageSize** | **Integer** | The maximum number of entries to be returned in one page of search results. |  [optional] |
|**schemasEndpointObjectclass** | **List&lt;String&gt;** | The list of object classes which will be returned by the schemas endpoint. |  [optional] |
|**defaultOperationalAttribute** | **List&lt;String&gt;** | A set of operational attributes that will be returned with entries by default. |  [optional] |
|**rejectExpansionAttribute** | **List&lt;String&gt;** | A set of attributes which the client is not allowed to provide for the expand query parameters. This should be used for attributes that could either have a large number of values or that reference entries that are very large like groups. |  [optional] |
|**alwaysUsePermissiveModify** | **Boolean** | Indicates whether to always use permissive modify behavior for PATCH requests, even if the request did not include the permissive modify request control. |  [optional] |
|**allowedControl** | **List&lt;EnumhttpServletExtensionAllowedControlProp&gt;** |  |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




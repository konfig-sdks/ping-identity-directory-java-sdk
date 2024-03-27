

# HttpServletCrossOriginPolicyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the HTTP Servlet Cross Origin Policy |  |
|**description** | **String** | A description for this HTTP Servlet Cross Origin Policy |  [optional] |
|**schemas** | **List&lt;EnumhttpServletCrossOriginPolicySchemaUrn&gt;** |  |  [optional] |
|**corsAllowedMethods** | **List&lt;String&gt;** | A list of HTTP methods allowed for cross-origin access to resources. i.e. one or more of GET, POST, PUT, DELETE, etc. |  [optional] |
|**corsAllowedOrigins** | **List&lt;String&gt;** | A list of origins that are allowed to execute cross-origin requests. |  [optional] |
|**corsExposedHeaders** | **List&lt;String&gt;** | A list of HTTP headers other than the simple response headers that browsers are allowed to access. |  [optional] |
|**corsAllowedHeaders** | **List&lt;String&gt;** | A list of HTTP headers that are supported by the resource and can be specified in a cross-origin request. |  [optional] |
|**corsPreflightMaxAge** | **String** | The maximum amount of time that a preflight request can be cached by a client. |  [optional] |
|**corsAllowCredentials** | **Boolean** | Indicates whether the servlet extension allows CORS requests with username/password credentials. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




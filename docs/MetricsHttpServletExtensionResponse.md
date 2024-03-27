

# MetricsHttpServletExtensionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnummetricsHttpServletExtensionSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the HTTP Servlet Extension |  |
|**requireAPIAuthentication** | **Boolean** | Require authentication when accessing the REST API. |  [optional] |
|**identityMapper** | **String** | Specifies the name of the identity mapper that is to be used for associating user entries with basic authentication user names. |  [optional] |
|**omitErrorMessageDetails** | **Boolean** | Specifies that API error messages for invalid queries, unknown resources, service unavailable, and internal server errors are generic in nature. |  [optional] |
|**apiAuthenticationTimeout** | **String** | Length of time before a REST API authentication session expires. |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




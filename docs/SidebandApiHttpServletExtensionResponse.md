

# SidebandApiHttpServletExtensionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnumsidebandApiHttpServletExtensionSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the HTTP Servlet Extension |  |
|**requestLimit** | **String** | The maximum number of bytes allowed per request body. |  [optional] |
|**requestContextMethod** | **EnumhttpServletExtensionRequestContextMethodProp** |  |  [optional] |
|**sharedSecretHeaderName** | **String** | The request header used to find the shared secret header for incoming Sideband API HTTP Servlet Extension requests. |  |
|**sharedSecrets** | **List&lt;String&gt;** | Shared secrets between the third-party API Gateway and Sideband API HTTP Servlet Extension. |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




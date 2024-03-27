

# Scim2HttpServletExtensionResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;Enumscim2HttpServletExtensionSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the HTTP Servlet Extension |  [optional] |
|**baseContextPath** | **String** | The context path to use to access the SCIM 2.0 interface. The value must start with a forward slash and must represent a valid HTTP context path. |  [optional] |
|**accessTokenValidator** | **List&lt;String&gt;** | If specified, the Access Token Validator(s) that may be used to validate access tokens for requests submitted to this SCIM2 HTTP Servlet Extension. |  [optional] |
|**mapAccessTokensToLocalUsers** | **EnumhttpServletExtensionMapAccessTokensToLocalUsersProp** |  |  [optional] |
|**debugEnabled** | **Boolean** | Enables debug logging of the SCIM 2.0 SDK. Debug messages will be forwarded to the Directory Server debug logger with the scope of com.unboundid.directory.broker.http.scim2.extension.SCIM2HTTPServletExtension. |  [optional] |
|**debugLevel** | **EnumhttpServletExtensionDebugLevelProp** |  |  [optional] |
|**debugType** | **List&lt;EnumhttpServletExtensionDebugTypeProp&gt;** |  |  [optional] |
|**includeStackTrace** | **Boolean** | Indicates whether a stack trace of the thread which called the debug method should be included in debug log messages. |  [optional] |
|**swaggerEnabled** | **Boolean** | Indicates whether the SCIM2 HTTP Servlet Extension will generate a Swagger specification document. |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |




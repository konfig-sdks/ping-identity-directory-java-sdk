

# ConfigHttpServletExtensionResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnumconfigHttpServletExtensionSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the HTTP Servlet Extension |  [optional] |
|**identityMapper** | **String** | Specifies the name of the identity mapper that is to be used for associating user entries with basic authentication user names. |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |




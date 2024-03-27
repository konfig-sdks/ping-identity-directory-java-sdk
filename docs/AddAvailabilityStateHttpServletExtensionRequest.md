

# AddAvailabilityStateHttpServletExtensionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extensionName** | **String** | Name of the new HTTP Servlet Extension |  |
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnumavailabilityStateHttpServletExtensionSchemaUrn&gt;** |  |  |
|**baseContextPath** | **String** | Specifies the base context path that HTTP clients should use to access this servlet. The value must start with a forward slash and must represent a valid HTTP context path. |  |
|**availableStatusCode** | **Integer** | Specifies the HTTP status code that the servlet should return if the server considers itself to be available. |  |
|**degradedStatusCode** | **Integer** | Specifies the HTTP status code that the servlet should return if the server considers itself to be degraded. |  |
|**unavailableStatusCode** | **Integer** | Specifies the HTTP status code that the servlet should return if the server considers itself to be unavailable. |  |
|**overrideStatusCode** | **Integer** | Specifies a HTTP status code that the servlet should always return, regardless of the server&#39;s availability. If this value is defined, it will override the availability-based return codes. |  [optional] |
|**includeResponseBody** | **Boolean** | Indicates whether the response should include a body that is a JSON object. |  [optional] |
|**additionalResponseContents** | **String** | A JSON-formatted string containing additional fields to be returned in the response body. For example, an additional-response-contents value of &#39;{ \&quot;key\&quot;: \&quot;value\&quot; }&#39; would add the key and value to the root of the JSON response body. |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |




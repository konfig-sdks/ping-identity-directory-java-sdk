

# GatewayHttpServletExtensionResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnumgatewayHttpServletExtensionSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the HTTP Servlet Extension |  [optional] |
|**excludedAPIEndpoint** | **List&lt;String&gt;** | Specifies any Gateway API Endpoints that will not be handled by the Gateway HTTP Servlet Extension. |  [optional] |
|**requestLimit** | **String** | The maximum number of bytes allowed per request body. |  [optional] |
|**responseLimit** | **String** | The maximum number of bytes allowed per response body. |  [optional] |
|**numForwardThreads** | **Integer** | The number of threads used to forward responses to the API backend. |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |




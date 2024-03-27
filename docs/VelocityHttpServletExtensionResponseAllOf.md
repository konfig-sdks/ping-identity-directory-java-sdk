

# VelocityHttpServletExtensionResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnumvelocityHttpServletExtensionSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the HTTP Servlet Extension |  [optional] |
|**baseContextPath** | **String** | The context path to use to access all template-based and static content. The value must start with a forward slash and must represent a valid HTTP context path. |  [optional] |
|**staticContextPath** | **String** | The path below the base context path by which static, non-template content such as images, CSS, and Javascript files are accessible. |  [optional] |
|**staticContentDirectory** | **String** | Specifies the base directory in which static, non-template content such as images, CSS, and Javascript files are stored on the filesystem. |  [optional] |
|**staticCustomDirectory** | **String** | Specifies the base directory in which custom static, non-template content such as images, CSS, and Javascript files are stored on the filesystem. Files in this directory will override those with the same name in the directory specified by the static-content-directory property. |  [optional] |
|**templateDirectory** | **List&lt;String&gt;** | Specifies an ordered list of directories in which to search for the template files. |  [optional] |
|**exposeRequestAttributes** | **Boolean** | Specifies whether the HTTP request will be exposed to templates. |  [optional] |
|**exposeSessionAttributes** | **Boolean** | Specifies whether the HTTP session will be exposed to templates. |  [optional] |
|**exposeServerContext** | **Boolean** | Specifies whether a server context will be exposed under context key &#39;ubid_server&#39; for all template contexts. |  [optional] |
|**allowContextOverride** | **Boolean** | Indicates whether context providers may override existing context objects with new values. |  [optional] |
|**mimeTypesFile** | **String** | Specifies the path to a file that contains MIME type mappings that will be used to determine the appropriate value to return for the Content-Type header based on the extension of the requested static content file. |  [optional] |
|**defaultMIMEType** | **String** | Specifies the default value that will be used in the response&#39;s Content-Type header that indicates the type of content to return. |  [optional] |
|**characterEncoding** | **String** | Specifies the value that will be used for all responses&#39; Content-Type headers&#39; charset parameter that indicates the character encoding of the document. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all template page requests. |  [optional] |
|**staticResponseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for static content requests such as images and scripts. |  [optional] |
|**requireAuthentication** | **Boolean** | Require authentication when accessing Velocity templates. |  [optional] |
|**identityMapper** | **String** | Specifies the name of the identity mapper that is to be used for associating basic authentication credentials with user entries. |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |




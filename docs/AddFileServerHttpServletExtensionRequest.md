

# AddFileServerHttpServletExtensionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extensionName** | **String** | Name of the new HTTP Servlet Extension |  |
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnumfileServerHttpServletExtensionSchemaUrn&gt;** |  |  |
|**baseContextPath** | **String** | Specifies the base context path that should be used by HTTP clients to reference content. The value must start with a forward slash and must represent a valid HTTP context path. |  |
|**documentRootDirectory** | **String** | Specifies the path to the directory on the local filesystem containing the files to be served by this File Server HTTP Servlet Extension. The path must exist, and it must be a directory. |  |
|**enableDirectoryIndexing** | **Boolean** | Indicates whether to generate a default HTML page with a listing of available files if the requested path refers to a directory rather than a file, and that directory does not contain an index file. |  [optional] |
|**indexFile** | **List&lt;String&gt;** | Specifies the name of a file whose contents may be returned to the client if the requested path refers to a directory rather than a file. |  [optional] |
|**mimeTypesFile** | **String** | Specifies the path to a file that contains MIME type mappings that will be used to determine the appropriate value to return for the Content-Type header based on the extension of the requested file. |  [optional] |
|**defaultMIMEType** | **String** | Specifies the default MIME type to use for the Content-Type header when a mapping cannot be found. |  [optional] |
|**requireAuthentication** | **Boolean** | Indicates whether the servlet extension should only accept requests from authenticated clients. |  [optional] |
|**allowedAuthenticationType** | **List&lt;EnumhttpServletExtensionAllowedAuthenticationTypeProp&gt;** |  |  [optional] |
|**accessTokenValidator** | **List&lt;String&gt;** | The access token validators that may be used to verify the authenticity of an OAuth 2.0 bearer token. |  [optional] |
|**idTokenValidator** | **List&lt;String&gt;** | The ID token validators that may be used to verify the authenticity of an of an OpenID Connect ID token. |  [optional] |
|**requireFileServletAccessPrivilege** | **Boolean** | Indicates whether the servlet extension should only accept requests from authenticated clients that have the file-servlet-access privilege. |  [optional] |
|**requireGroup** | **List&lt;String&gt;** | The DN of a group whose members will be permitted to access to the associated files. If multiple group DNs are configured, then anyone who is a member of at least one of those groups will be granted access. |  [optional] |
|**identityMapper** | **String** | The identity mapper that will be used to identify the entry with which a username is associated. |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |




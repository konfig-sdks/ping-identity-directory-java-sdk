

# LdapMappedScimHttpServletExtensionShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnumldapMappedScimHttpServletExtensionSchemaUrn&gt;** |  |  |
|**oauthTokenHandler** | **String** | Specifies the OAuth Token Handler implementation that should be used to validate OAuth 2.0 bearer tokens when they are included in a SCIM request. |  [optional] |
|**basicAuthEnabled** | **Boolean** | Enables HTTP Basic authentication, using a username and password. |  [optional] |
|**identityMapper** | **String** | Specifies the name of the identity mapper that is to be used to match the username included in the HTTP Basic authentication header to the corresponding user in the directory. |  [optional] |
|**resourceMappingFile** | **String** | The path to an XML file defining the resources supported by the SCIM interface and the SCIM-to-LDAP attribute mappings to use. |  [optional] |
|**includeLDAPObjectclass** | **List&lt;String&gt;** | Specifies the LDAP object classes that should be exposed directly as SCIM resources. |  [optional] |
|**excludeLDAPObjectclass** | **List&lt;String&gt;** | Specifies the LDAP object classes that should be not be exposed directly as SCIM resources. |  [optional] |
|**includeLDAPBaseDN** | **List&lt;String&gt;** | Specifies the base DNs for the branches of the DIT that should be exposed via the Identity Access API. |  [optional] |
|**excludeLDAPBaseDN** | **List&lt;String&gt;** | Specifies the base DNs for the branches of the DIT that should not be exposed via the Identity Access API. |  [optional] |
|**entityTagLDAPAttribute** | **String** | Specifies the LDAP attribute whose value should be used as the entity tag value to enable SCIM resource versioning support. |  [optional] |
|**baseContextPath** | **String** | The context path to use to access the SCIM interface. The value must start with a forward slash and must represent a valid HTTP context path. |  [optional] |
|**temporaryDirectory** | **String** | Specifies the location of the directory that is used to create temporary files containing SCIM request data. |  [optional] |
|**temporaryDirectoryPermissions** | **String** | Specifies the permissions that should be applied to the directory that is used to create temporary files. |  [optional] |
|**maxResults** | **Integer** | The maximum number of resources that are returned in a response. |  [optional] |
|**bulkMaxOperations** | **Integer** | The maximum number of operations that are permitted in a bulk request. |  [optional] |
|**bulkMaxPayloadSize** | **String** | The maximum payload size in bytes of a bulk request. |  [optional] |
|**bulkMaxConcurrentRequests** | **Integer** | The maximum number of bulk requests that may be processed concurrently by the server. Any bulk request that would cause this limit to be exceeded is rejected with HTTP status code 503. |  [optional] |
|**debugEnabled** | **Boolean** | Enables debug logging of the SCIM SDK. Debug messages will be forwarded to the Directory Server debug logger with the scope of com.unboundid.directory.server.extensions.scim.SCIMHTTPServletExtension. |  [optional] |
|**debugLevel** | **EnumhttpServletExtensionDebugLevelProp** |  |  [optional] |
|**debugType** | **List&lt;EnumhttpServletExtensionDebugTypeProp&gt;** |  |  [optional] |
|**includeStackTrace** | **Boolean** | Indicates whether a stack trace of the thread which called the debug method should be included in debug log messages. |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |




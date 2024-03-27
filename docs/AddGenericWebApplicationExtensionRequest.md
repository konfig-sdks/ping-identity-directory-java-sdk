

# AddGenericWebApplicationExtensionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extensionName** | **String** | Name of the new Web Application Extension |  |
|**description** | **String** | A description for this Web Application Extension |  [optional] |
|**schemas** | **List&lt;EnumgenericWebApplicationExtensionSchemaUrn&gt;** |  |  |
|**baseContextPath** | **String** | Specifies the base context path that should be used by HTTP clients to reference content. The value must start with a forward slash and at least one additional character and must represent a valid HTTP context path. |  |
|**warFile** | **String** | Specifies the path to a standard web application archive (WAR) file. |  [optional] |
|**documentRootDirectory** | **String** | Specifies the path to the directory on the local filesystem containing the files to be served by this Web Application Extension. The path must exist, and it must be a directory. |  [optional] |
|**deploymentDescriptorFile** | **String** | Specifies the path to the deployment descriptor file when used with document-root-directory. |  [optional] |
|**temporaryDirectory** | **String** | Specifies the path to the directory that may be used to store temporary files such as extracted WAR files and compiled JSP files. |  [optional] |
|**initParameter** | **List&lt;String&gt;** | Specifies an initialization parameter to pass into the web application during startup. |  [optional] |




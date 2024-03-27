

# VelocityTemplateLoaderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Velocity Template Loader |  |
|**schemas** | **List&lt;EnumvelocityTemplateLoaderSchemaUrn&gt;** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Velocity Template Loader is enabled. |  [optional] |
|**evaluationOrderIndex** | **Integer** | This property determines the evaluation order for determining the correct Velocity Template Loader to load a template for generating content for a particular request. |  |
|**mimeTypeMatcher** | **String** | Specifies a media type for matching Accept request-header values. |  |
|**mimeType** | **String** | Specifies a the value that will be used in the response&#39;s Content-Type header that indicates the type of content to return. |  [optional] |
|**templateSuffix** | **String** | Specifies the suffix to append to the requested resource name when searching for the template file with which to form a response. |  [optional] |
|**templateDirectory** | **String** | Specifies the directory in which to search for the template files. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




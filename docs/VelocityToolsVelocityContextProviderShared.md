

# VelocityToolsVelocityContextProviderShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumvelocityToolsVelocityContextProviderSchemaUrn&gt;** |  |  |
|**requestTool** | **List&lt;String&gt;** | The fully-qualified name of a Velocity Tool class that will be initialized for each request. May optionally include a path to a properties file used to configure this tool separated from the class name by a semi-colon (;). The path may absolute or relative to the server root. |  [optional] |
|**sessionTool** | **List&lt;String&gt;** | The fully-qualified name of a Velocity Tool class that will be initialized for each session. May optionally include a path to a properties file used to configure this tool separated from the class name by a semi-colon (;). The path may absolute or relative to the server root. |  [optional] |
|**applicationTool** | **List&lt;String&gt;** | The fully-qualified name of a Velocity Tool class that will be initialized once for the life of the server. May optionally include a path to a properties file used to configure this tool separated from the class name by a semi-colon (;). The path may absolute or relative to the server root. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Velocity Context Provider is enabled. If set to &#39;false&#39; this Velocity Context Provider will not contribute context content for any requests. |  [optional] |
|**objectScope** | **EnumvelocityContextProviderObjectScopeProp** |  |  [optional] |
|**includedView** | **List&lt;String&gt;** | The name of a view for which this Velocity Context Provider will contribute content. |  [optional] |
|**excludedView** | **List&lt;String&gt;** | The name of a view for which this Velocity Context Provider will not contribute content. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for template page requests to which this Velocity Context Provider contributes content. |  [optional] |




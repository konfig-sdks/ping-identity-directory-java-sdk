

# ThirdPartyVelocityContextProviderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Velocity Context Provider |  |
|**schemas** | **List&lt;EnumthirdPartyVelocityContextProviderSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Velocity Context Provider. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Velocity Context Provider. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Velocity Context Provider is enabled. If set to &#39;false&#39; this Velocity Context Provider will not contribute context content for any requests. |  [optional] |
|**objectScope** | **EnumvelocityContextProviderObjectScopeProp** |  |  [optional] |
|**includedView** | **List&lt;String&gt;** | The name of a view for which this Velocity Context Provider will contribute content. |  [optional] |
|**excludedView** | **List&lt;String&gt;** | The name of a view for which this Velocity Context Provider will not contribute content. |  [optional] |
|**httpMethod** | **List&lt;String&gt;** | Specifies the set of HTTP methods handled by this Velocity Context Provider, which will perform actions necessary to fulfill the request before updating the context for the response. The values of this property are not case-sensitive. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for template page requests to which this Velocity Context Provider contributes content. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




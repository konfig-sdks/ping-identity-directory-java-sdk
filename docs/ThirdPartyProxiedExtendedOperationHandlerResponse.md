

# ThirdPartyProxiedExtendedOperationHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Extended Operation Handler |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyProxiedExtendedOperationHandlerSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Extended Operation Handler |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Proxied Extended Operation Handler. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Proxied Extended Operation Handler. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**routeToBackendSetBehavior** | **EnumextendedOperationHandlerRouteToBackendSetBehaviorProp** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Extended Operation Handler is enabled (that is, whether the types of extended operations are allowed in the server). |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




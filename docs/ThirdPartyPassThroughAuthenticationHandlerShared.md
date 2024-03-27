

# ThirdPartyPassThroughAuthenticationHandlerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Pass Through Authentication Handler |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyPassThroughAuthenticationHandlerSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Pass Through Authentication Handler. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Pass Through Authentication Handler. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**includedLocalEntryBaseDN** | **List&lt;String&gt;** | The base DNs for the local users whose authentication attempts may be passed through to the external authentication service. |  [optional] |
|**connectionCriteria** | **String** | A reference to connection criteria that will be used to indicate which bind requests should be passed through to the external authentication service. |  [optional] |
|**requestCriteria** | **String** | A reference to request criteria that will be used to indicate which bind requests should be passed through to the external authentication service. |  [optional] |




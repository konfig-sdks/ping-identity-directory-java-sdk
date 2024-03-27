

# AddThirdPartyMonitorProviderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerName** | **String** | Name of the new Monitor Provider |  |
|**description** | **String** | A description for this Monitor Provider |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyMonitorProviderSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Monitor Provider. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Monitor Provider. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Monitor Provider is enabled for use. |  |




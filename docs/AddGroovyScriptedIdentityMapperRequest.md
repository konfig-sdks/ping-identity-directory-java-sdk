

# AddGroovyScriptedIdentityMapperRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mapperName** | **String** | Name of the new Identity Mapper |  |
|**description** | **String** | A description for this Identity Mapper |  [optional] |
|**schemas** | **List&lt;EnumgroovyScriptedIdentityMapperSchemaUrn&gt;** |  |  |
|**scriptClass** | **String** | The fully-qualified name of the Groovy class providing the logic for the Groovy Scripted Identity Mapper. |  |
|**scriptArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Scripted Identity Mapper. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Identity Mapper is enabled for use. |  |




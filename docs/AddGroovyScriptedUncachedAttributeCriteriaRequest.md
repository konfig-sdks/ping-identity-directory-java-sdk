

# AddGroovyScriptedUncachedAttributeCriteriaRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**criteriaName** | **String** | Name of the new Uncached Attribute Criteria |  |
|**description** | **String** | A description for this Uncached Attribute Criteria |  [optional] |
|**schemas** | **List&lt;EnumgroovyScriptedUncachedAttributeCriteriaSchemaUrn&gt;** |  |  |
|**scriptClass** | **String** | The fully-qualified name of the Groovy class providing the logic for the Groovy Scripted Uncached Attribute Criteria. |  |
|**scriptArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Scripted Uncached Attribute Criteria. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Uncached Attribute Criteria is enabled for use in the server. |  |




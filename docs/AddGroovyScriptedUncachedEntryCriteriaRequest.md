

# AddGroovyScriptedUncachedEntryCriteriaRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**criteriaName** | **String** | Name of the new Uncached Entry Criteria |  |
|**description** | **String** | A description for this Uncached Entry Criteria |  [optional] |
|**schemas** | **List&lt;EnumgroovyScriptedUncachedEntryCriteriaSchemaUrn&gt;** |  |  |
|**scriptClass** | **String** | The fully-qualified name of the Groovy class providing the logic for the Groovy Scripted Uncached Entry Criteria. |  |
|**scriptArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Scripted Uncached Entry Criteria. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Uncached Entry Criteria is enabled for use in the server. |  |




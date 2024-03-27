

# AddThirdPartyUncachedEntryCriteriaRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**criteriaName** | **String** | Name of the new Uncached Entry Criteria |  |
|**description** | **String** | A description for this Uncached Entry Criteria |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyUncachedEntryCriteriaSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Uncached Entry Criteria. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Uncached Entry Criteria. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Uncached Entry Criteria is enabled for use in the server. |  |




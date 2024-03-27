

# ComposedAttributePluginShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumcomposedAttributePluginSchemaUrn&gt;** |  |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  [optional] |
|**attributeType** | **String** | The name or OID of the attribute type for which values are to be generated. |  |
|**valuePattern** | **List&lt;String&gt;** | Specifies a pattern for constructing the values to use for the target attribute type. |  |
|**multipleValuePatternBehavior** | **EnumpluginMultipleValuePatternBehaviorProp** |  |  [optional] |
|**multiValuedAttributeBehavior** | **EnumpluginMultiValuedAttributeBehaviorProp** |  |  [optional] |
|**targetAttributeExistsDuringInitialPopulationBehavior** | **EnumpluginTargetAttributeExistsDuringInitialPopulationBehaviorProp** |  |  [optional] |
|**updateSourceAttributeBehavior** | **EnumpluginUpdateSourceAttributeBehaviorProp** |  |  [optional] |
|**sourceAttributeRemovalBehavior** | **EnumpluginSourceAttributeRemovalBehaviorProp** |  |  [optional] |
|**updateTargetAttributeBehavior** | **EnumpluginUpdateTargetAttributeBehaviorProp** |  |  [optional] |
|**includeBaseDN** | **List&lt;String&gt;** | The set of base DNs below which composed values may be generated. |  [optional] |
|**excludeBaseDN** | **List&lt;String&gt;** | The set of base DNs below which composed values will not be generated. |  [optional] |
|**includeFilter** | **List&lt;String&gt;** | The set of search filters that identify entries for which composed values may be generated. |  [optional] |
|**excludeFilter** | **List&lt;String&gt;** | The set of search filters that identify entries for which composed values will not be generated. |  [optional] |
|**updatedEntryNewlyMatchesCriteriaBehavior** | **EnumpluginUpdatedEntryNewlyMatchesCriteriaBehaviorProp** |  |  [optional] |
|**updatedEntryNoLongerMatchesCriteriaBehavior** | **EnumpluginUpdatedEntryNoLongerMatchesCriteriaBehaviorProp** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




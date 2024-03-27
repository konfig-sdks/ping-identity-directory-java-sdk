

# AddDnMapperPluginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pluginName** | **String** | Name of the new Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumdnMapperPluginSchemaUrn&gt;** |  |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  [optional] |
|**sourceDN** | **String** | Specifies the source DN that may appear in client requests which should be remapped to the target DN. Note that the source DN must not be equal to the target DN. |  |
|**targetDN** | **String** | Specifies the DN to which the source DN should be mapped. Note that the target DN must not be equal to the source DN. |  |
|**enableAttributeMapping** | **Boolean** | Indicates whether DN mapping should be applied to the values of attributes with appropriate syntaxes. |  [optional] |
|**mapAttribute** | **List&lt;String&gt;** | Specifies a set of specific attributes for which DN mapping should be applied. This will only be applicable if the enable-attribute-mapping property has a value of \&quot;true\&quot;. Any attributes listed must be defined in the server schema with either the distinguished name syntax or the name and optional UID syntax. |  [optional] |
|**enableControlMapping** | **Boolean** | Indicates whether DN mapping should be applied to DNs that may be present in specific controls. DN mapping will only be applied for control types which are specifically supported by the DN mapper plugin. |  [optional] |
|**alwaysMapResponses** | **Boolean** | Indicates whether DNs in response messages containing the target DN should always be remapped back to the source DN. If this is \&quot;false\&quot;, then mapping will be performed for a response message only if one or more elements of the associated request are mapped. Otherwise, the mapping will be performed for all responses regardless of whether the mapping was applied to the request. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




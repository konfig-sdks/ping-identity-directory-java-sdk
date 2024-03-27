

# GlobalReferentialIntegrityPluginResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumglobalReferentialIntegrityPluginSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Plugin |  [optional] |
|**attributeType** | **List&lt;String&gt;** | The attribute type(s) for which to maintain referential integrity. The attribute must have a distinguished name or a name and optional UID syntax and must be indexed for equality searches in all subtree views for which referential integrity is to be maintained. |  [optional] |
|**subtreeView** | **List&lt;String&gt;** | The subtree view(s) for which to maintain referential integrity. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  [optional] |






# LastModPluginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumlastModPluginSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Plugin |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  |
|**includeAttribute** | **List&lt;String&gt;** | Specifies the name or OID of an attribute type that must be updated in order for the modifiersName and modifyTimestamp attributes to be updated in the target entry. |  [optional] |
|**excludeAttribute** | **List&lt;String&gt;** | Specifies the name or OID of an attribute type which may be updated in a modify or modify DN operation without causing the modifiersName and modifyTimestamp values to be updated for that entry. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




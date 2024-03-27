

# ModifiablePasswordPolicyStatePluginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnummodifiablePasswordPolicyStatePluginSchemaUrn&gt;** |  |  |
|**baseDN** | **List&lt;String&gt;** | A base DN that may be used to identify entries that should support the ds-pwp-modifiable-state-json operational attribute. |  [optional] |
|**filter** | **List&lt;String&gt;** | A filter that may be used to identify entries that should support the ds-pwp-modifiable-state-json operational attribute. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# ReplicationStateDetailVirtualAttributeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumreplicationStateDetailVirtualAttributeSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Virtual Attribute |  |
|**enabled** | **Boolean** | Indicates whether the Virtual Attribute is enabled for use. |  |
|**requireExplicitRequestByName** | **Boolean** | Indicates whether attributes of this type must be explicitly included by name in the list of requested attributes. Note that this will only apply to virtual attributes which are associated with an attribute type that is operational. It will be ignored for virtual attributes associated with a non-operational attribute type. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




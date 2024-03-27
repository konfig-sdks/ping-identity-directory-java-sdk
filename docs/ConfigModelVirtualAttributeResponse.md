

# ConfigModelVirtualAttributeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Virtual Attribute |  [optional] |
|**schemas** | **List&lt;EnumconfigModelVirtualAttributeSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Virtual Attribute |  |
|**conflictBehavior** | **EnumvirtualAttributeConflictBehaviorProp** |  |  [optional] |
|**attributeType** | **String** | Specifies the attribute type for the attribute whose values are to be dynamically assigned by the virtual attribute. |  |
|**requireExplicitRequestByName** | **Boolean** | Indicates whether attributes of this type must be explicitly included by name in the list of requested attributes. Note that this will only apply to virtual attributes which are associated with an attribute type that is operational. It will be ignored for virtual attributes associated with a non-operational attribute type. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Virtual Attribute is enabled for use. |  |
|**groupDN** | **List&lt;String&gt;** | Specifies the DNs of the groups whose members can be eligible to use this virtual attribute. |  [optional] |
|**clientConnectionPolicy** | **List&lt;String&gt;** | Specifies a set of client connection policies for which this Virtual Attribute should be generated. If this is undefined, then this Virtual Attribute will always be generated. If it is associated with one or more client connection policies, then this Virtual Attribute will be generated only for operations requested by clients assigned to one of those client connection policies. |  [optional] |
|**multipleVirtualAttributeEvaluationOrderIndex** | **Integer** | Specifies the order in which virtual attribute definitions for the same attribute type will be evaluated when generating values for an entry. |  [optional] |
|**multipleVirtualAttributeMergeBehavior** | **EnumvirtualAttributeMultipleVirtualAttributeMergeBehaviorProp** |  |  [optional] |
|**allowIndexConflicts** | **Boolean** | Indicates whether the server should allow creating or altering this virtual attribute definition even if it conflicts with one or more indexes defined in the server. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




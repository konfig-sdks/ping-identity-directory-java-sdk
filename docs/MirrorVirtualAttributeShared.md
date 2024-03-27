

# MirrorVirtualAttributeShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Virtual Attribute |  [optional] |
|**schemas** | **List&lt;EnummirrorVirtualAttributeSchemaUrn&gt;** |  |  |
|**conflictBehavior** | **EnumvirtualAttributeConflictBehaviorProp** |  |  [optional] |
|**sourceAttribute** | **String** | Specifies the source attribute containing the values to use for this virtual attribute. |  |
|**sourceEntryDNAttribute** | **String** | Specifies the attribute containing the DN of another entry from which to obtain the source attribute providing the values for this virtual attribute. |  [optional] |
|**sourceEntryDNMap** | **String** | Specifies a DN map that will be used to identify the entry from which to obtain the source attribute providing the values for this virtual attribute. |  [optional] |
|**bypassAccessControlForSearches** | **Boolean** | Indicates whether searches performed by this virtual attribute provider should be exempted from access control restrictions. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Virtual Attribute is enabled for use. |  |
|**attributeType** | **String** | Specifies the attribute type for the attribute whose values are to be dynamically assigned by the virtual attribute. |  |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DNs for the branches containing entries that are eligible to use this virtual attribute. |  [optional] |
|**groupDN** | **List&lt;String&gt;** | Specifies the DNs of the groups whose members can be eligible to use this virtual attribute. |  [optional] |
|**filter** | **List&lt;String&gt;** | Specifies the search filters to be applied against entries to determine if the virtual attribute is to be generated for those entries. |  [optional] |
|**clientConnectionPolicy** | **List&lt;String&gt;** | Specifies a set of client connection policies for which this Virtual Attribute should be generated. If this is undefined, then this Virtual Attribute will always be generated. If it is associated with one or more client connection policies, then this Virtual Attribute will be generated only for operations requested by clients assigned to one of those client connection policies. |  [optional] |
|**requireExplicitRequestByName** | **Boolean** | Indicates whether attributes of this type must be explicitly included by name in the list of requested attributes. Note that this will only apply to virtual attributes which are associated with an attribute type that is operational. It will be ignored for virtual attributes associated with a non-operational attribute type. |  [optional] |
|**multipleVirtualAttributeEvaluationOrderIndex** | **Integer** | Specifies the order in which virtual attribute definitions for the same attribute type will be evaluated when generating values for an entry. |  [optional] |
|**multipleVirtualAttributeMergeBehavior** | **EnumvirtualAttributeMultipleVirtualAttributeMergeBehaviorProp** |  |  [optional] |
|**allowIndexConflicts** | **Boolean** | Indicates whether the server should allow creating or altering this virtual attribute definition even if it conflicts with one or more indexes defined in the server. |  [optional] |




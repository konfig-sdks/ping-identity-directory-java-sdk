

# EqualityJoinVirtualAttributeShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Virtual Attribute |  [optional] |
|**schemas** | **List&lt;EnumequalityJoinVirtualAttributeSchemaUrn&gt;** |  |  |
|**joinSourceAttribute** | **String** | The attribute containing the value(s) in the source entry to use to identify related entries. |  |
|**joinTargetAttribute** | **String** | The attribute in target entries whose value(s) match values of the source attribute in the source entry. |  |
|**joinMatchAll** | **Boolean** | Indicates whether joined entries will be required to have all values for the source attribute, or only at least one of its values. |  [optional] |
|**joinBaseDNType** | **EnumvirtualAttributeJoinBaseDNTypeProp** |  |  |
|**joinCustomBaseDN** | **String** | The fixed, administrator-specified base DN for the internal searches used to identify joined entries. |  [optional] |
|**joinScope** | **EnumvirtualAttributeJoinScopeProp** |  |  [optional] |
|**joinSizeLimit** | **Integer** | The maximum number of entries that may be joined with the source entry, which also corresponds to the maximum number of values that the virtual attribute provider will generate for an entry. |  [optional] |
|**joinFilter** | **String** | An optional filter that specifies additional criteria for identifying joined entries. If a join-filter value is specified, then only entries matching that filter (in addition to satisfying the other join criteria) will be joined with the search result entry. |  [optional] |
|**joinAttribute** | **List&lt;String&gt;** | An optional set of the names of the attributes to include with joined entries. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Virtual Attribute is enabled for use. |  |
|**attributeType** | **String** | Specifies the attribute type for the attribute whose values are to be dynamically assigned by the virtual attribute. |  |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DNs for the branches containing entries that are eligible to use this virtual attribute. |  [optional] |
|**groupDN** | **List&lt;String&gt;** | Specifies the DNs of the groups whose members can be eligible to use this virtual attribute. |  [optional] |
|**filter** | **List&lt;String&gt;** | Specifies the search filters to be applied against entries to determine if the virtual attribute is to be generated for those entries. |  [optional] |
|**clientConnectionPolicy** | **List&lt;String&gt;** | Specifies a set of client connection policies for which this Virtual Attribute should be generated. If this is undefined, then this Virtual Attribute will always be generated. If it is associated with one or more client connection policies, then this Virtual Attribute will be generated only for operations requested by clients assigned to one of those client connection policies. |  [optional] |
|**conflictBehavior** | **EnumvirtualAttributeConflictBehaviorProp** |  |  [optional] |
|**requireExplicitRequestByName** | **Boolean** | Indicates whether attributes of this type must be explicitly included by name in the list of requested attributes. Note that this will only apply to virtual attributes which are associated with an attribute type that is operational. It will be ignored for virtual attributes associated with a non-operational attribute type. |  [optional] |
|**multipleVirtualAttributeEvaluationOrderIndex** | **Integer** | Specifies the order in which virtual attribute definitions for the same attribute type will be evaluated when generating values for an entry. |  [optional] |
|**multipleVirtualAttributeMergeBehavior** | **EnumvirtualAttributeMultipleVirtualAttributeMergeBehaviorProp** |  |  [optional] |
|**allowIndexConflicts** | **Boolean** | Indicates whether the server should allow creating or altering this virtual attribute definition even if it conflicts with one or more indexes defined in the server. |  [optional] |






# ShortUniqueIdVirtualAttributeResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Virtual Attribute |  [optional] |
|**schemas** | **List&lt;EnumshortUniqueIdVirtualAttributeSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Virtual Attribute |  [optional] |
|**sequenceNumberAttribute** | **String** | Specifies the name or OID of the attribute which contains the sequence number from which unique identifiers are generated. The attribute should have Integer syntax or a String syntax permitting integer values. If this property is modified then the filter property should be updated accordingly so that only entries containing the sequence number attribute are eligible to have a value generated for this virtual attribute. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Virtual Attribute is enabled for use. |  [optional] |
|**attributeType** | **String** | Specifies the attribute type for the attribute whose values are to be dynamically assigned by the virtual attribute. |  [optional] |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DNs for the branches containing entries that are eligible to use this virtual attribute. |  [optional] |
|**groupDN** | **List&lt;String&gt;** | Specifies the DNs of the groups whose members can be eligible to use this virtual attribute. |  [optional] |
|**filter** | **List&lt;String&gt;** | Specifies the search filters to be applied against entries to determine if the virtual attribute is to be generated for those entries. |  [optional] |
|**clientConnectionPolicy** | **List&lt;String&gt;** | Specifies a set of client connection policies for which this Virtual Attribute should be generated. If this is undefined, then this Virtual Attribute will always be generated. If it is associated with one or more client connection policies, then this Virtual Attribute will be generated only for operations requested by clients assigned to one of those client connection policies. |  [optional] |
|**multipleVirtualAttributeEvaluationOrderIndex** | **Integer** | Specifies the order in which virtual attribute definitions for the same attribute type will be evaluated when generating values for an entry. |  [optional] |
|**multipleVirtualAttributeMergeBehavior** | **EnumvirtualAttributeMultipleVirtualAttributeMergeBehaviorProp** |  |  [optional] |
|**allowIndexConflicts** | **Boolean** | Indicates whether the server should allow creating or altering this virtual attribute definition even if it conflicts with one or more indexes defined in the server. |  [optional] |




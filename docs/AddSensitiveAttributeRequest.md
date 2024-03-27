

# AddSensitiveAttributeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeName** | **String** | Name of the new Sensitive Attribute |  |
|**description** | **String** | A description for this Sensitive Attribute |  [optional] |
|**schemas** | **List&lt;EnumsensitiveAttributeSchemaUrn&gt;** |  |  [optional] |
|**attributeType** | **List&lt;String&gt;** | The name(s) or OID(s) of the attribute types for attributes whose values may be considered sensitive. |  |
|**includeDefaultSensitiveOperationalAttributes** | **Boolean** | Indicates whether to automatically include any server-generated operational attributes that may contain sensitive data. |  [optional] |
|**allowInReturnedEntries** | **EnumsensitiveAttributeAllowInReturnedEntriesProp** |  |  [optional] |
|**allowInFilter** | **EnumsensitiveAttributeAllowInFilterProp** |  |  [optional] |
|**allowInAdd** | **EnumsensitiveAttributeAllowInAddProp** |  |  [optional] |
|**allowInCompare** | **EnumsensitiveAttributeAllowInCompareProp** |  |  [optional] |
|**allowInModify** | **EnumsensitiveAttributeAllowInModifyProp** |  |  [optional] |




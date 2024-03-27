

# ScimAttributeShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this SCIM Attribute |  [optional] |
|**schemas** | **List&lt;EnumscimAttributeSchemaUrn&gt;** |  |  [optional] |
|**name** | **String** | The name of the attribute. |  |
|**type** | **EnumscimAttributeTypeProp** |  |  [optional] |
|**required** | **Boolean** | Specifies whether this attribute is required. |  [optional] |
|**caseExact** | **Boolean** | Specifies whether the attribute values are case sensitive. |  [optional] |
|**multiValued** | **Boolean** | Specifies whether this attribute may have multiple values. |  [optional] |
|**canonicalValue** | **List&lt;String&gt;** | Specifies the suggested canonical type values for the attribute. |  [optional] |
|**mutability** | **EnumscimAttributeMutabilityProp** |  |  [optional] |
|**returned** | **EnumscimAttributeReturnedProp** |  |  [optional] |
|**referenceType** | **List&lt;String&gt;** | Specifies the SCIM resource types that may be referenced. This property is only applicable for attributes that are of type &#39;reference&#39;. Valid values are: A SCIM resource type (e.g., &#39;User&#39; or &#39;Group&#39;), &#39;external&#39; - indicating the resource is an external resource (e.g., such as a photo), or &#39;uri&#39; - indicating that the reference is to a service endpoint or an identifier (such as a schema urn). |  [optional] |




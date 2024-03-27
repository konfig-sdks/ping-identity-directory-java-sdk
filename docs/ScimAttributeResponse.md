

# ScimAttributeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the SCIM Attribute |  |
|**description** | **String** | A description for this SCIM Attribute |  [optional] |
|**schemas** | **List&lt;EnumscimAttributeSchemaUrn&gt;** |  |  [optional] |
|**name** | **String** | The name of the attribute. |  |
|**type** | **EnumscimAttributeTypeProp** |  |  |
|**required** | **Boolean** | Specifies whether this attribute is required. |  |
|**caseExact** | **Boolean** | Specifies whether the attribute values are case sensitive. |  |
|**multiValued** | **Boolean** | Specifies whether this attribute may have multiple values. |  |
|**canonicalValue** | **List&lt;String&gt;** | Specifies the suggested canonical type values for the attribute. |  [optional] |
|**mutability** | **EnumscimAttributeMutabilityProp** |  |  |
|**returned** | **EnumscimAttributeReturnedProp** |  |  |
|**referenceType** | **List&lt;String&gt;** | Specifies the SCIM resource types that may be referenced. This property is only applicable for attributes that are of type &#39;reference&#39;. Valid values are: A SCIM resource type (e.g., &#39;User&#39; or &#39;Group&#39;), &#39;external&#39; - indicating the resource is an external resource (e.g., such as a photo), or &#39;uri&#39; - indicating that the reference is to a service endpoint or an identifier (such as a schema urn). |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# PhotoDelegatedAdminAttributeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Delegated Admin Attribute |  |
|**description** | **String** | A description for this Delegated Admin Attribute |  [optional] |
|**schemas** | **List&lt;EnumphotoDelegatedAdminAttributeSchemaUrn&gt;** |  |  |
|**allowedMIMEType** | **List&lt;EnumdelegatedAdminAttributePhotoAllowedMIMETypeProp&gt;** |  |  [optional] |
|**attributeType** | **String** | Specifies the name or OID of the LDAP attribute type. |  |
|**displayName** | **String** | A human readable display name for this Delegated Admin Attribute. |  |
|**mutability** | **EnumdelegatedAdminAttributeMutabilityProp** |  |  |
|**multiValued** | **Boolean** | Indicates whether this Delegated Admin Attribute may have multiple values. |  |
|**attributeCategory** | **String** | Specifies which attribute category this attribute belongs to. |  [optional] |
|**displayOrderIndex** | **Integer** | This property determines a display order for attributes within a given attribute category. Attributes are ordered within their category based on this index from least to greatest. |  |
|**referenceResourceType** | **String** | For LDAP attributes with DN syntax, specifies what kind of resource is referenced. |  [optional] |
|**attributePresentation** | **EnumdelegatedAdminAttributeAttributePresentationProp** |  |  [optional] |
|**dateTimeFormat** | **String** | Specifies the format string that is used to present a date and/or time value to the user of the app. This property only applies to LDAP attribute types whose LDAP syntax is GeneralizedTime and is ignored if the attribute type has any other syntax. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# AddCertificateDelegatedAdminAttributeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeType** | **String** | Specifies the name or OID of the LDAP attribute type. |  |
|**description** | **String** | A description for this Delegated Admin Attribute |  [optional] |
|**schemas** | **List&lt;EnumcertificateDelegatedAdminAttributeSchemaUrn&gt;** |  |  |
|**allowedMIMEType** | **List&lt;EnumdelegatedAdminAttributeCertificateAllowedMIMETypeProp&gt;** |  |  [optional] |
|**displayName** | **String** | A human readable display name for this Delegated Admin Attribute. |  |
|**mutability** | **EnumdelegatedAdminAttributeMutabilityProp** |  |  [optional] |
|**multiValued** | **Boolean** | Indicates whether this Delegated Admin Attribute may have multiple values. |  [optional] |
|**attributeCategory** | **String** | Specifies which attribute category this attribute belongs to. |  [optional] |
|**displayOrderIndex** | **Integer** | This property determines a display order for attributes within a given attribute category. Attributes are ordered within their category based on this index from least to greatest. |  [optional] |
|**referenceResourceType** | **String** | For LDAP attributes with DN syntax, specifies what kind of resource is referenced. |  [optional] |
|**attributePresentation** | **EnumdelegatedAdminAttributeAttributePresentationProp** |  |  [optional] |
|**dateTimeFormat** | **String** | Specifies the format string that is used to present a date and/or time value to the user of the app. This property only applies to LDAP attribute types whose LDAP syntax is GeneralizedTime and is ignored if the attribute type has any other syntax. |  [optional] |




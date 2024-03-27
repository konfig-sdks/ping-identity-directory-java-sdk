

# LdapUrlAttributeSyntaxResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumldapUrlAttributeSyntaxSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Attribute Syntax |  [optional] |
|**strictFormat** | **Boolean** | Indicates whether values for attributes with this syntax will be required to be in the valid LDAP URL format. If this is set to false, then arbitrary strings will be allowed. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Attribute Syntax is enabled. |  [optional] |
|**requireBinaryTransfer** | **Boolean** | Indicates whether values of this attribute are required to have a \&quot;binary\&quot; transfer option as described in RFC 4522. Attributes with this syntax will generally be referenced with names including \&quot;;binary\&quot; (e.g., \&quot;userCertificate;binary\&quot;). |  [optional] |




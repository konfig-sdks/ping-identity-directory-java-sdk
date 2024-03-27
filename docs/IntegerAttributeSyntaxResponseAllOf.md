

# IntegerAttributeSyntaxResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumintegerAttributeSyntaxSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Attribute Syntax |  [optional] |
|**enableCompaction** | **Boolean** | Indicates whether values of attributes with this syntax should be compacted when stored in a local DB database. |  [optional] |
|**includeAttributeInCompaction** | **List&lt;String&gt;** | Specifies the specific attributes (which should be associated with this syntax) whose values should be compacted. If one or more include attributes are specified, then only those attributes will have their values compacted. If not set then all attributes will have their values compacted. The exclude-attribute-from-compaction property takes precedence over this property. |  [optional] |
|**excludeAttributeFromCompaction** | **List&lt;String&gt;** | Specifies the specific attributes (which should be associated with this syntax) whose values should not be compacted. If one or more exclude attributes are specified, then values of those attributes will not have their values compacted. This property takes precedence over the include-attribute-in-compaction property. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Attribute Syntax is enabled. |  [optional] |
|**requireBinaryTransfer** | **Boolean** | Indicates whether values of this attribute are required to have a \&quot;binary\&quot; transfer option as described in RFC 4522. Attributes with this syntax will generally be referenced with names including \&quot;;binary\&quot; (e.g., \&quot;userCertificate;binary\&quot;). |  [optional] |




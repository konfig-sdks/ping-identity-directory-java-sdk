

# DirectoryStringAttributeSyntaxResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumdirectoryStringAttributeSyntaxSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Attribute Syntax |  |
|**allowZeroLengthValues** | **Boolean** | Indicates whether zero-length (that is, an empty string) values are allowed. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Attribute Syntax is enabled. |  |
|**requireBinaryTransfer** | **Boolean** | Indicates whether values of this attribute are required to have a \&quot;binary\&quot; transfer option as described in RFC 4522. Attributes with this syntax will generally be referenced with names including \&quot;;binary\&quot; (e.g., \&quot;userCertificate;binary\&quot;). |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# ScimAttributeMappingResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the SCIM Attribute Mapping |  |
|**schemas** | **List&lt;EnumscimAttributeMappingSchemaUrn&gt;** |  |  [optional] |
|**correlatedLDAPDataView** | **String** | The Correlated LDAP Data View that persists the mapped SCIM Resource Type attribute(s). |  [optional] |
|**scimResourceTypeAttribute** | **String** | The attribute path of SCIM Resource Type attributes to be mapped. |  |
|**ldapAttribute** | **String** | The LDAP attribute to be mapped, or the path to a specific field of an LDAP attribute with the JSON object attribute syntax. |  |
|**readable** | **Boolean** | Specifies whether the mapping is used to map from LDAP attribute to SCIM Resource Type attribute in a read operation. |  [optional] |
|**writable** | **Boolean** | Specifies that the mapping is used to map from SCIM Resource Type attribute to LDAP attribute in a write operation. |  [optional] |
|**searchable** | **Boolean** | Specifies that the mapping is used to map from SCIM Resource Type attribute to LDAP attribute in a search filter. |  [optional] |
|**authoritative** | **Boolean** | Specifies that the mapping is authoritative over other mappings for the same SCIM Resource Type attribute (for read operations). |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




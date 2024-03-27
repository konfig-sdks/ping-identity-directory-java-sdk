

# LdapCorrelationAttributePairResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the LDAP Correlation Attribute Pair |  |
|**schemas** | **List&lt;EnumldapCorrelationAttributePairSchemaUrn&gt;** |  |  [optional] |
|**primaryCorrelationAttribute** | **String** | The LDAP attribute from the base SCIM Resource Type whose value will be used to match objects in the Correlated LDAP Data View. |  |
|**secondaryCorrelationAttribute** | **String** | The LDAP attribute from the Correlated LDAP Data View whose value will be matched. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




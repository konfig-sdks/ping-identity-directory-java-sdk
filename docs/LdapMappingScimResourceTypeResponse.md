

# LdapMappingScimResourceTypeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the SCIM Resource Type |  |
|**description** | **String** | A description for this SCIM Resource Type |  [optional] |
|**schemas** | **List&lt;EnumldapMappingScimResourceTypeSchemaUrn&gt;** |  |  |
|**coreSchema** | **String** | The core schema enforced on core attributes at the top level of a SCIM resource representation exposed by thisMapping SCIM Resource Type. |  |
|**requiredSchemaExtension** | **List&lt;String&gt;** | Required additive schemas that are enforced on extension attributes in a SCIM resource representation for this Mapping SCIM Resource Type. |  [optional] |
|**optionalSchemaExtension** | **List&lt;String&gt;** | Optional additive schemas that are enforced on extension attributes in a SCIM resource representation for this Mapping SCIM Resource Type. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the SCIM Resource Type is enabled. |  |
|**endpoint** | **String** | The HTTP addressable endpoint of this SCIM Resource Type relative to the &#39;/scim/v2&#39; base URL. Do not include a leading &#39;/&#39;. |  |
|**lookthroughLimit** | **Integer** | The maximum number of resources that the SCIM Resource Type should \&quot;look through\&quot; in the course of processing a search request. |  [optional] |
|**schemaCheckingOption** | **List&lt;EnumscimResourceTypeSchemaCheckingOptionProp&gt;** |  |  [optional] |
|**structuralLDAPObjectclass** | **String** | Specifies the LDAP structural object class that should be exposed by this SCIM Resource Type. |  [optional] |
|**auxiliaryLDAPObjectclass** | **List&lt;String&gt;** | Specifies an auxiliary LDAP object class that should be exposed by this SCIM Resource Type. |  [optional] |
|**includeBaseDN** | **String** | Specifies the base DN of the branch of the LDAP directory that can be accessed by this SCIM Resource Type. |  [optional] |
|**includeFilter** | **List&lt;String&gt;** | The set of LDAP filters that define the LDAP entries that should be included in this SCIM Resource Type. |  [optional] |
|**includeOperationalAttribute** | **List&lt;String&gt;** | Specifies the set of operational LDAP attributes to be provided by this SCIM Resource Type. |  [optional] |
|**createDNPattern** | **String** | Specifies the template to use for the DN when creating new entries. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# AddLdapCorrelationAttributePairRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pairName** | **String** | Name of the new LDAP Correlation Attribute Pair |  |
|**schemas** | **List&lt;EnumldapCorrelationAttributePairSchemaUrn&gt;** |  |  [optional] |
|**primaryCorrelationAttribute** | **String** | The LDAP attribute from the base SCIM Resource Type whose value will be used to match objects in the Correlated LDAP Data View. |  |
|**secondaryCorrelationAttribute** | **String** | The LDAP attribute from the Correlated LDAP Data View whose value will be matched. |  |




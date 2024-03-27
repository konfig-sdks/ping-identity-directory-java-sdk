

# CorrelatedLdapDataViewShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumcorrelatedLdapDataViewSchemaUrn&gt;** |  |  [optional] |
|**structuralLDAPObjectclass** | **String** | Specifies the LDAP structural object class that should be exposed by this Correlated LDAP Data View. |  |
|**auxiliaryLDAPObjectclass** | **List&lt;String&gt;** | Specifies an auxiliary LDAP object class that should be exposed by this Correlated LDAP Data View. |  [optional] |
|**includeBaseDN** | **String** | Specifies the base DN of the branch of the LDAP directory that can be accessed by this Correlated LDAP Data View. |  |
|**includeFilter** | **List&lt;String&gt;** | The set of LDAP filters that define the LDAP entries that should be included in this Correlated LDAP Data View. |  [optional] |
|**includeOperationalAttribute** | **List&lt;String&gt;** | Specifies the set of operational LDAP attributes to be provided by this Correlated LDAP Data View. |  [optional] |
|**createDNPattern** | **String** | Specifies the template to use for the DN when creating new entries. |  [optional] |
|**primaryCorrelationAttribute** | **String** | The LDAP attribute from the parent SCIM Resource Type whose value will be used to match objects in the Correlated LDAP Data View. If multiple correlation attributes are required they may be created using additional correlation-attribute-pairs. |  |
|**secondaryCorrelationAttribute** | **String** | The LDAP attribute from the Correlated LDAP Data View whose value will be matched with the primary-correlation-attribute. If multiple correlation attributes are required they may be specified by creating additional correlation-attribute-pairs. |  |




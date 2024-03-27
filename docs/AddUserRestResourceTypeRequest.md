

# AddUserRestResourceTypeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**typeName** | **String** | Name of the new REST Resource Type |  |
|**description** | **String** | A description for this REST Resource Type |  [optional] |
|**schemas** | **List&lt;EnumuserRestResourceTypeSchemaUrn&gt;** |  |  |
|**passwordAttributeCategory** | **String** | Specifies which attribute category the password belongs to. |  [optional] |
|**passwordDisplayOrderIndex** | **Integer** | This property determines the display order for the password within its attribute category. Attributes are ordered within their category based on this index from least to greatest. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the REST Resource Type is enabled. |  |
|**resourceEndpoint** | **String** | The HTTP addressable endpoint of this REST Resource Type relative to a REST API base URL. Do not include a leading &#39;/&#39;. |  |
|**structuralLDAPObjectclass** | **String** | Specifies the LDAP structural object class that should be exposed by this REST Resource Type. |  |
|**auxiliaryLDAPObjectclass** | **List&lt;String&gt;** | Specifies an auxiliary LDAP object class that should be exposed by this REST Resource Type. |  [optional] |
|**searchBaseDN** | **String** | Specifies the base DN of the branch of the LDAP directory where resources of this type are located. |  |
|**includeFilter** | **List&lt;String&gt;** | The set of LDAP filters that define the LDAP entries that should be included in this REST Resource Type. |  [optional] |
|**parentDN** | **String** | Specifies the DN of the parent entry for new resources of this type, when a parent resource is not provided by the app. The parent DN must be at or below the search base of this resource type. |  [optional] |
|**parentResourceType** | **String** | Specifies the name of another resource type which may be a parent of new resources of this type. The search base DN of the parent resource type must be at or above the search base DN of this resource type. |  [optional] |
|**relativeDNFromParentResource** | **String** | Specifies a template for a relative DN from the parent resource which identifies the parent entry for a new resource of this type. If this property is not specified then new resources are created immediately below the parent resource or parent DN. |  [optional] |
|**createRDNAttributeType** | **String** | Specifies the name or OID of the LDAP attribute type to be used as the RDN of new resources. |  [optional] |
|**postCreateConstructedAttribute** | **List&lt;String&gt;** | Specifies an attribute whose values are to be constructed when a new resource is created. The values are only set at creation time. Subsequent modifications to attributes in the constructed attribute value-pattern are not propagated here. |  [optional] |
|**updateConstructedAttribute** | **List&lt;String&gt;** | Specifies an attribute whose values are to be constructed when a resource is updated. The constructed values replace any existing values of the attribute. |  [optional] |
|**displayName** | **String** | A human readable display name for this REST Resource Type. |  [optional] |
|**searchFilterPattern** | **String** | Specifies the LDAP filter that should be used when searching for resources matching provided search text. All attribute types in the filter pattern referencing the search text must have a Delegated Admin Attribute definition. |  [optional] |
|**primaryDisplayAttributeType** | **String** | Specifies the name or OID of the LDAP attribute type which is the primary display attribute. This attribute type must be in the search filter pattern and must have a Delegated Admin Attribute definition. |  [optional] |
|**delegatedAdminSearchSizeLimit** | **Integer** | The maximum number of resources that may be returned from a search request. |  [optional] |
|**delegatedAdminReportSizeLimit** | **Integer** | The maximum number of resources that may be included in a report. |  [optional] |
|**membersColumnName** | **String** | Specifies the name of the group member column that will be displayed in the Delegated Admin UI |  [optional] |
|**nonmembersColumnName** | **String** | Specifies the name of the group nonmember column that will be displayed in the Delegated Admin UI |  [optional] |




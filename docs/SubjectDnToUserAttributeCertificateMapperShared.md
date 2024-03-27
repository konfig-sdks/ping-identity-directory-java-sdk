

# SubjectDnToUserAttributeCertificateMapperShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Certificate Mapper |  [optional] |
|**schemas** | **List&lt;EnumsubjectDnToUserAttributeCertificateMapperSchemaUrn&gt;** |  |  |
|**subjectAttribute** | **String** | Specifies the name or OID of the attribute whose value should exactly match the certificate subject DN. |  [optional] |
|**userBaseDN** | **List&lt;String&gt;** | Specifies the base DNs that should be used when performing searches to map the client certificate to a user entry. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Certificate Mapper is enabled. |  |




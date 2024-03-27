

# AddFingerprintCertificateMapperRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mapperName** | **String** | Name of the new Certificate Mapper |  |
|**description** | **String** | A description for this Certificate Mapper |  [optional] |
|**schemas** | **List&lt;EnumfingerprintCertificateMapperSchemaUrn&gt;** |  |  |
|**fingerprintAttribute** | **String** | Specifies the attribute in which to look for the fingerprint. |  [optional] |
|**fingerprintAlgorithm** | **EnumcertificateMapperFingerprintAlgorithmProp** |  |  |
|**userBaseDN** | **List&lt;String&gt;** | Specifies the set of base DNs below which to search for users. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Certificate Mapper is enabled. |  |




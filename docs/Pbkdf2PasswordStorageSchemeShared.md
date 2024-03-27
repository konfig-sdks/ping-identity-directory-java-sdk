

# Pbkdf2PasswordStorageSchemeShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Password Storage Scheme |  [optional] |
|**schemas** | **List&lt;Enumpbkdf2PasswordStorageSchemeSchemaUrn&gt;** |  |  |
|**digestAlgorithm** | **EnumpasswordStorageSchemeDigestAlgorithmProp** |  |  [optional] |
|**iterationCount** | **Integer** | Specifies the number of iterations to use when encoding passwords. The value must be greater than or equal to 1000. |  [optional] |
|**saltLengthBytes** | **Integer** | Specifies the number of bytes to use for the generated salt. The value must be greater than or equal to 8. |  [optional] |
|**derivedKeyLengthBytes** | **Integer** | Specifies the number of bytes to use for the derived key. The value must be greater than or equal to 8. |  [optional] |
|**maxPasswordLength** | **Integer** | Specifies the maximum allowed length, in bytes, for passwords encoded with this scheme, which can help mitigate denial of service attacks from clients that attempt to bind with very long passwords. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Password Storage Scheme is enabled for use. |  |




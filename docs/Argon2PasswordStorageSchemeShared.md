

# Argon2PasswordStorageSchemeShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Password Storage Scheme |  [optional] |
|**schemas** | **List&lt;Enumargon2PasswordStorageSchemeSchemaUrn&gt;** |  |  |
|**iterationCount** | **Integer** | The number of rounds of cryptographic processing required in the course of encoding each password. |  |
|**parallelismFactor** | **Integer** | The number of concurrent threads that will be used in the course of encoding each password. |  |
|**memoryUsageKb** | **Integer** | The number of kilobytes of memory that must be used in the course of encoding each password. |  |
|**saltLengthBytes** | **Integer** | The number of bytes to use for the generated salt. |  |
|**derivedKeyLengthBytes** | **Integer** | The number of bytes to use for the derived key. The value must be greater than or equal to 8 and less than or equal to 512. |  |
|**enabled** | **Boolean** | Indicates whether the Password Storage Scheme is enabled for use. |  |




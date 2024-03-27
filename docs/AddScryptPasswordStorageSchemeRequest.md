

# AddScryptPasswordStorageSchemeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemeName** | **String** | Name of the new Password Storage Scheme |  |
|**description** | **String** | A description for this Password Storage Scheme |  [optional] |
|**schemas** | **List&lt;EnumscryptPasswordStorageSchemeSchemaUrn&gt;** |  |  |
|**scryptCpuMemoryCostFactorExponent** | **Integer** | Specifies the exponent that should be used for the CPU/memory cost factor. The cost factor must be a power of two, so the value of this property represents the power to which two is raised. The CPU/memory cost factor specifies the number of iterations required for encoding the password, and also affects the amount of memory required during processing. A higher cost factor requires more processing and more memory to generate a password, which makes attacks against the password more expensive. |  [optional] |
|**scryptBlockSize** | **Integer** | Specifies the block size for the digest that will be used in the course of encoding passwords. Increasing the block size while keeping the CPU/memory cost factor constant will increase the amount of memory required to encode a password, but it also increases the ratio of sequential memory access to random memory access (and sequential memory access is generally faster than random memory access). |  [optional] |
|**scryptParallelizationParameter** | **Integer** | Specifies the number of times that scrypt has to perform the entire encoding process to produce the final result. |  [optional] |
|**maxPasswordLength** | **Integer** | Specifies the maximum allowed length, in bytes, for passwords encoded with this scheme, which can help mitigate denial of service attacks from clients that attempt to bind with very long passwords. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Password Storage Scheme is enabled for use. |  |




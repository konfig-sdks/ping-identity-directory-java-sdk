

# GeneratePasswordExtendedOperationHandlerResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Extended Operation Handler |  [optional] |
|**schemas** | **List&lt;EnumgeneratePasswordExtendedOperationHandlerSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Extended Operation Handler |  [optional] |
|**defaultPasswordPolicy** | **String** | The default password policy that should be used when generating and validating passwords if the request does not specify an alternate policy. If this is not provided, then this Generate Password Extended Operation Handler will use the default password policy defined in the global configuration. |  [optional] |
|**defaultPasswordGenerator** | **String** | The default password generator that will be used if the selected password policy is not configured with a password generator. |  [optional] |
|**maximumPasswordsPerRequest** | **Integer** | The maximum number of passwords that may be generated and returned to the client for a single request. |  [optional] |
|**maximumValidationAttemptsPerPassword** | **Integer** | The maximum number of attempts that the server may use to generate a password that passes validation. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Extended Operation Handler is enabled (that is, whether the types of extended operations are allowed in the server). |  [optional] |




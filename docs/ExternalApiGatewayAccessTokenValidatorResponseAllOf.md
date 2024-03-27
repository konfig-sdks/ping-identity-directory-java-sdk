

# ExternalApiGatewayAccessTokenValidatorResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Access Token Validator |  [optional] |
|**schemas** | **List&lt;EnumexternalApiGatewayAccessTokenValidatorSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Access Token Validator |  [optional] |
|**evaluationOrderIndex** | **Integer** | When multiple External API Gateway Access Token Validators are defined for a single Directory Server, this property determines the evaluation order for determining the correct validator class for an access token received by the Directory Server. Values of this property must be unique among all External API Gateway Access Token Validators defined within Directory Server but not necessarily contiguous. External API Gateway Access Token Validators with a smaller value will be evaluated first to determine if they are able to validate the access token. |  [optional] |
|**identityMapper** | **String** | Specifies the name of the Identity Mapper that should be used for associating user entries with Bearer token subject names. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Access Token Validator is enabled for use in Directory Server. |  [optional] |




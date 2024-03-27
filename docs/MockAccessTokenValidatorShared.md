

# MockAccessTokenValidatorShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Access Token Validator |  [optional] |
|**schemas** | **List&lt;EnummockAccessTokenValidatorSchemaUrn&gt;** |  |  |
|**clientIDClaimName** | **String** | The name of the token claim that contains the OAuth2 client ID. |  [optional] |
|**scopeClaimName** | **String** | The name of the token claim that contains the scopes granted by the token. |  [optional] |
|**evaluationOrderIndex** | **Integer** | When multiple Mock Access Token Validators are defined for a single Directory Server, this property determines the evaluation order for determining the correct validator class for an access token received by the Directory Server. Values of this property must be unique among all Mock Access Token Validators defined within Directory Server but not necessarily contiguous. Mock Access Token Validators with a smaller value will be evaluated first to determine if they are able to validate the access token. |  [optional] |
|**identityMapper** | **String** | Specifies the name of the Identity Mapper that should be used for associating user entries with Bearer token subject names. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property. |  [optional] |
|**subjectClaimName** | **String** | The name of the token claim that contains the subject, i.e. the logged-in user in an access token. This property goes hand-in-hand with the identity-mapper property and tells the Identity Mapper which field to use to look up the user entry on the server. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Access Token Validator is enabled for use in Directory Server. |  |




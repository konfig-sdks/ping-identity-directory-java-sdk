

# ThirdPartyAccessTokenValidatorShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Access Token Validator |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyAccessTokenValidatorSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Access Token Validator. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Access Token Validator. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**identityMapper** | **String** | Specifies the name of the Identity Mapper that should be used for associating user entries with Bearer token subject names. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property. |  [optional] |
|**subjectClaimName** | **String** | The name of the token claim that contains the subject, i.e. the logged-in user in an access token. This property goes hand-in-hand with the identity-mapper property and tells the Identity Mapper which field to use to look up the user entry on the server. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Access Token Validator is enabled for use in Directory Server. |  |
|**evaluationOrderIndex** | **Integer** | When multiple Access Token Validators are defined for a single Directory Server, this property determines the evaluation order for determining the correct validator class for an access token received by the Directory Server. Values of this property must be unique among all Access Token Validators defined within Directory Server but not necessarily contiguous. Access Token Validators with a smaller value will be evaluated first to determine if they are able to validate the access token. |  |




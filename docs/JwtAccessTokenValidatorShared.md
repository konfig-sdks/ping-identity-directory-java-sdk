

# JwtAccessTokenValidatorShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Access Token Validator |  [optional] |
|**schemas** | **List&lt;EnumjwtAccessTokenValidatorSchemaUrn&gt;** |  |  |
|**allowedSigningAlgorithm** | **List&lt;EnumaccessTokenValidatorAllowedSigningAlgorithmProp&gt;** |  |  [optional] |
|**signingCertificate** | **List&lt;String&gt;** | Specifies the locally stored certificates that may be used to validate the signature of an incoming JWT access token. If this property is specified, the JWT Access Token Validator will not use a JWKS endpoint to retrieve public keys. |  [optional] |
|**jwksEndpointPath** | **String** | The relative path to JWKS endpoint from which to retrieve one or more public signing keys that may be used to validate the signature of an incoming JWT access token. This path is relative to the base_url property defined for the validator&#39;s external authorization server. If jwks-endpoint-path is specified, the JWT Access Token Validator will not consult locally stored certificates for validating token signatures. |  [optional] |
|**encryptionKeyPair** | **String** | The public-private key pair that is used to encrypt the JWT payload. If specified, the JWT Access Token Validator will use the private key to decrypt the JWT payload, and the public key must be exported to the Authorization Server that is issuing access tokens. |  [optional] |
|**allowedKeyEncryptionAlgorithm** | **List&lt;EnumaccessTokenValidatorAllowedKeyEncryptionAlgorithmProp&gt;** |  |  [optional] |
|**allowedContentEncryptionAlgorithm** | **List&lt;EnumaccessTokenValidatorAllowedContentEncryptionAlgorithmProp&gt;** |  |  [optional] |
|**clockSkewGracePeriod** | **String** | Specifies the amount of clock skew that is tolerated by the JWT Access Token Validator when evaluating whether a token is within its valid time interval. The duration specified by this parameter will be subtracted from the token&#39;s not-before (nbf) time and added to the token&#39;s expiration (exp) time, if present, to allow for any time difference between the local server&#39;s clock and the token issuer&#39;s clock. |  [optional] |
|**clientIDClaimName** | **String** | The name of the token claim that contains the OAuth2 client Id. |  [optional] |
|**scopeClaimName** | **String** | The name of the token claim that contains the scopes granted by the token. |  [optional] |
|**evaluationOrderIndex** | **Integer** | When multiple JWT Access Token Validators are defined for a single Directory Server, this property determines the evaluation order for determining the correct validator class for an access token received by the Directory Server. Values of this property must be unique among all JWT Access Token Validators defined within Directory Server but not necessarily contiguous. JWT Access Token Validators with a smaller value will be evaluated first to determine if they are able to validate the access token. |  [optional] |
|**authorizationServer** | **String** | Specifies the external server that will be used to aid in validating access tokens. In most cases this will be the Authorization Server that minted the token. |  [optional] |
|**identityMapper** | **String** | Specifies the name of the Identity Mapper that should be used for associating user entries with Bearer token subject names. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property. |  [optional] |
|**subjectClaimName** | **String** | The name of the token claim that contains the subject, i.e. the logged-in user in an access token. This property goes hand-in-hand with the identity-mapper property and tells the Identity Mapper which field to use to look up the user entry on the server. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Access Token Validator is enabled for use in Directory Server. |  |






# AddOpenidConnectIdTokenValidatorRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**validatorName** | **String** | Name of the new ID Token Validator |  |
|**description** | **String** | A description for this ID Token Validator |  [optional] |
|**schemas** | **List&lt;EnumopenidConnectIdTokenValidatorSchemaUrn&gt;** |  |  |
|**allowedSigningAlgorithm** | **List&lt;EnumidTokenValidatorAllowedSigningAlgorithmProp&gt;** |  |  |
|**signingCertificate** | **List&lt;String&gt;** | Specifies the locally stored certificates that may be used to validate the signature of an incoming ID token. This property may be specified if a JWKS endpoint should not be used to retrieve public signing keys. |  [optional] |
|**openIDConnectProvider** | **String** | Specifies the OpenID Connect provider that issues ID tokens handled by this OpenID Connect ID Token Validator. This property is used in conjunction with the jwks-endpoint-path property. |  [optional] |
|**jwksEndpointPath** | **String** | The relative path to the JWKS endpoint from which to retrieve one or more public signing keys that may be used to validate the signature of an incoming ID token. This path is relative to the base_url property defined for the validator&#39;s OpenID Connect provider. If jwks-endpoint-path is specified, the OpenID Connect ID Token Validator will not consult locally stored certificates for validating token signatures. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this ID Token Validator is enabled for use in the Directory Server. |  |
|**identityMapper** | **String** | Specifies the name of the Identity Mapper that should be used to correlate an ID token subject value to a user entry. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property. |  |
|**subjectClaimName** | **String** | The name of the token claim that contains the subject; i.e., the authenticated user. |  [optional] |
|**issuerURL** | **String** | Specifies the OpenID Connect provider&#39;s issuer URL. |  |
|**clockSkewGracePeriod** | **String** | Specifies the amount of clock skew that is tolerated by the ID Token Validator when evaluating whether a token is within its valid time interval. The duration specified by this parameter will be subtracted from the token&#39;s not-before (nbf) time and added to the token&#39;s expiration (exp) time, if present, to allow for any time difference between the local server&#39;s clock and the token issuer&#39;s clock. |  [optional] |
|**jwksCacheDuration** | **String** | How often the ID Token Validator should refresh its cache of JWKS token signing keys. |  [optional] |
|**evaluationOrderIndex** | **Integer** | When multiple ID Token Validators are defined for a single Directory Server, this property determines the order in which the ID Token Validators are consulted. Values of this property must be unique among all ID Token Validators defined within Directory Server but not necessarily contiguous. ID Token Validators with lower values will be evaluated first to determine if they are able to validate the ID token. |  |




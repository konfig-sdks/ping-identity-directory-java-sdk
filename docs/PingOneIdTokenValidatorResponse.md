

# PingOneIdTokenValidatorResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the ID Token Validator |  |
|**description** | **String** | A description for this ID Token Validator |  [optional] |
|**schemas** | **List&lt;EnumpingOneIdTokenValidatorSchemaUrn&gt;** |  |  |
|**issuerURL** | **String** | Specifies a PingOne base issuer URL. |  |
|**openIDConnectProvider** | **String** | Specifies HTTPS connection settings for the PingOne OpenID Connect provider. |  |
|**openIDConnectMetadataCacheDuration** | **String** | How often the PingOne ID Token Validator should refresh its stored cache of OpenID Connect-related metadata. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this ID Token Validator is enabled for use in the Directory Server. |  |
|**identityMapper** | **String** | Specifies the name of the Identity Mapper that should be used to correlate an ID token subject value to a user entry. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property. |  |
|**subjectClaimName** | **String** | The name of the token claim that contains the subject; i.e., the authenticated user. |  [optional] |
|**clockSkewGracePeriod** | **String** | Specifies the amount of clock skew that is tolerated by the ID Token Validator when evaluating whether a token is within its valid time interval. The duration specified by this parameter will be subtracted from the token&#39;s not-before (nbf) time and added to the token&#39;s expiration (exp) time, if present, to allow for any time difference between the local server&#39;s clock and the token issuer&#39;s clock. |  [optional] |
|**jwksCacheDuration** | **String** | How often the ID Token Validator should refresh its cache of JWKS token signing keys. |  [optional] |
|**evaluationOrderIndex** | **Integer** | When multiple ID Token Validators are defined for a single Directory Server, this property determines the order in which the ID Token Validators are consulted. Values of this property must be unique among all ID Token Validators defined within Directory Server but not necessarily contiguous. ID Token Validators with lower values will be evaluated first to determine if they are able to validate the ID token. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




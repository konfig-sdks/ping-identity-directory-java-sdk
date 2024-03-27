

# BindAccessTokenValidatorResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Access Token Validator |  [optional] |
|**schemas** | **List&lt;EnumbindAccessTokenValidatorSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Access Token Validator |  |
|**enabled** | **Boolean** | Indicates whether this Bind Access Token Validator is enabled for use in Directory Server. |  |
|**persistAccessTokens** | **Boolean** | Indicates whether access tokens should be persisted in user entries. |  [optional] |
|**maximumTokenLifetime** | **String** | Specifies the maximum length of time that a generated token should be considered valid. If this is not specified, then generated access tokens will not expire. |  [optional] |
|**allowedAuthenticationType** | **List&lt;EnumaccessTokenValidatorAllowedAuthenticationTypeProp&gt;** |  |  [optional] |
|**allowedSASLMechanism** | **List&lt;String&gt;** | Specifies the names of the SASL mechanisms for which access tokens may be generated, and for which generated access tokens will be accepted. |  [optional] |
|**generateTokenResultCriteria** | **String** | A reference to a request criteria object that may be used to identify the types of bind operations for which access tokens may be generated. If no criteria is specified, then access tokens may be generated for any bind operations that satisfy the other requirements configured in this validator. |  [optional] |
|**includedScope** | **List&lt;String&gt;** | Specifies the names of any scopes that should be granted to a client that authenticates with a bind access token. By default, no scopes will be granted. |  [optional] |
|**identityMapper** | **String** | Specifies the name of the Identity Mapper that should be used for associating user entries with Bearer token subject names. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property. |  [optional] |
|**subjectClaimName** | **String** | The name of the token claim that contains the subject, i.e. the logged-in user in an access token. This property goes hand-in-hand with the identity-mapper property and tells the Identity Mapper which field to use to look up the user entry on the server. |  [optional] |
|**evaluationOrderIndex** | **Integer** | When multiple Access Token Validators are defined for a single Directory Server, this property determines the evaluation order for determining the correct validator class for an access token received by the Directory Server. Values of this property must be unique among all Access Token Validators defined within Directory Server but not necessarily contiguous. Access Token Validators with a smaller value will be evaluated first to determine if they are able to validate the access token. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




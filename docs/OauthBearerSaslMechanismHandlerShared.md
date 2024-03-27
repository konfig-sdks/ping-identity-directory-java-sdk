

# OauthBearerSaslMechanismHandlerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this SASL Mechanism Handler |  [optional] |
|**schemas** | **List&lt;EnumoauthBearerSaslMechanismHandlerSchemaUrn&gt;** |  |  |
|**accessTokenValidator** | **List&lt;String&gt;** | An access token validator that will ensure that each presented OAuth access token is authentic and trustworthy. It must be configured with an identity mapper that will be used to map the access token to a local entry. |  [optional] |
|**idTokenValidator** | **List&lt;String&gt;** | An ID token validator that will ensure that each presented OpenID Connect ID token is authentic and trustworthy, and that will map the token to a local entry. |  [optional] |
|**requireBothAccessTokenAndIDToken** | **Boolean** | Indicates whether bind requests will be required to have both an OAuth access token (in the \&quot;auth\&quot; element of the bind request) and an OpenID Connect ID token (in the \&quot;pingidentityidtoken\&quot; element of the bind request). |  [optional] |
|**validateAccessTokenWhenIDTokenIsAlsoProvided** | **EnumsaslMechanismHandlerValidateAccessTokenWhenIDTokenIsAlsoProvidedProp** |  |  [optional] |
|**alternateAuthorizationIdentityMapper** | **String** | The identity mapper that will be used to map an alternate authorization identity (provided in the GS2 header of the encoded OAUTHBEARER bind request credentials) to the corresponding local entry. |  [optional] |
|**allRequiredScope** | **List&lt;String&gt;** | The set of OAuth scopes that will all be required for any access tokens that will be allowed for authentication. |  [optional] |
|**anyRequiredScope** | **List&lt;String&gt;** | The set of OAuth scopes that a token may have to be allowed for authentication. |  [optional] |
|**serverFqdn** | **String** | The fully-qualified name that clients are expected to use when communicating with the server. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the SASL mechanism handler is enabled for use. |  |




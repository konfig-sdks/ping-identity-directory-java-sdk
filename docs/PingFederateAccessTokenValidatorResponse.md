

# PingFederateAccessTokenValidatorResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Access Token Validator |  |
|**description** | **String** | A description for this Access Token Validator |  [optional] |
|**schemas** | **List&lt;EnumpingFederateAccessTokenValidatorSchemaUrn&gt;** |  |  |
|**clientID** | **String** | The client identifier to use when authenticating to the PingFederate authorization server. |  |
|**clientSecret** | **String** | The client secret to use when authenticating to the PingFederate authorization server. |  [optional] |
|**clientSecretPassphraseProvider** | **String** | The passphrase provider for obtaining the client secret to use when authenticating to the PingFederate authorization server. |  [optional] |
|**includeAudParameter** | **Boolean** | Whether to include the incoming request URL as the \&quot;aud\&quot; parameter when calling the PingFederate introspection endpoint. This property is ignored if the access-token-manager-id property is set. |  [optional] |
|**accessTokenManagerID** | **String** | The Access Token Manager instance ID to specify when calling the PingFederate introspection endpoint. If this property is set the include-aud-parameter property is ignored. |  [optional] |
|**endpointCacheRefresh** | **String** | How often the Access Token Validator should refresh its stored value of the PingFederate server&#39;s token introspection endpoint. |  [optional] |
|**evaluationOrderIndex** | **Integer** | When multiple Ping Federate Access Token Validators are defined for a single Directory Server, this property determines the evaluation order for determining the correct validator class for an access token received by the Directory Server. Values of this property must be unique among all Ping Federate Access Token Validators defined within Directory Server but not necessarily contiguous. Ping Federate Access Token Validators with a smaller value will be evaluated first to determine if they are able to validate the access token. |  |
|**authorizationServer** | **String** | Specifies the external server that will be used to aid in validating access tokens. In most cases this will be the Authorization Server that minted the token. |  [optional] |
|**identityMapper** | **String** | Specifies the name of the Identity Mapper that should be used for associating user entries with Bearer token subject names. The claim name from which to obtain the subject (i.e. the currently logged-in user) may be configured using the subject-claim-name property. |  [optional] |
|**subjectClaimName** | **String** | The name of the token claim that contains the subject, i.e. the logged-in user in an access token. This property goes hand-in-hand with the identity-mapper property and tells the Identity Mapper which field to use to look up the user entry on the server. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Access Token Validator is enabled for use in Directory Server. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




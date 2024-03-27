

# AddPingOnePassThroughAuthenticationHandlerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**handlerName** | **String** | Name of the new Pass Through Authentication Handler |  |
|**description** | **String** | A description for this Pass Through Authentication Handler |  [optional] |
|**schemas** | **List&lt;EnumpingOnePassThroughAuthenticationHandlerSchemaUrn&gt;** |  |  |
|**apiURL** | **String** | Specifies the API endpoint for the PingOne web service. |  |
|**authURL** | **String** | Specifies the API endpoint for the PingOne authentication service. |  |
|**oauthClientID** | **String** | Specifies the OAuth Client ID used to authenticate connections to the PingOne API. |  |
|**oauthClientSecret** | **String** | Specifies the OAuth Client Secret used to authenticate connections to the PingOne API. |  [optional] |
|**oauthClientSecretPassphraseProvider** | **String** | Specifies a passphrase provider that can be used to obtain the OAuth Client Secret used to authenticate connections to the PingOne API. |  [optional] |
|**environmentID** | **String** | Specifies the PingOne Environment that will be associated with this PingOne Pass Through Authentication Handler. |  |
|**httpProxyExternalServer** | **String** | A reference to an HTTP proxy server that should be used for requests sent to the PingOne service. |  [optional] |
|**userMappingLocalAttribute** | **List&lt;String&gt;** | The names of the attributes in the local user entry whose values must match the values of the corresponding fields in the PingOne service. |  |
|**userMappingRemoteJSONField** | **List&lt;String&gt;** | The names of the fields in the PingOne service whose values must match the values of the corresponding attributes in the local user entry, as specified in the user-mapping-local-attribute property. |  |
|**additionalUserMappingSCIMFilter** | **String** | An optional SCIM filter that will be ANDed with the filter created to identify the account in the PingOne service that corresponds to the local entry. Only the \&quot;eq\&quot;, \&quot;sw\&quot;, \&quot;and\&quot;, and \&quot;or\&quot; filter types may be used. |  [optional] |
|**includedLocalEntryBaseDN** | **List&lt;String&gt;** | The base DNs for the local users whose authentication attempts may be passed through to the external authentication service. |  [optional] |
|**connectionCriteria** | **String** | A reference to connection criteria that will be used to indicate which bind requests should be passed through to the external authentication service. |  [optional] |
|**requestCriteria** | **String** | A reference to request criteria that will be used to indicate which bind requests should be passed through to the external authentication service. |  [optional] |




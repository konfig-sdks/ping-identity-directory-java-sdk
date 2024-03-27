

# AddPingOnePassThroughAuthenticationPluginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pluginName** | **String** | Name of the new Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumpingOnePassThroughAuthenticationPluginSchemaUrn&gt;** |  |  |
|**apiURL** | **String** | Specifies the API endpoint for the PingOne web service. |  |
|**authURL** | **String** | Specifies the API endpoint for the PingOne authentication service. |  |
|**oauthClientID** | **String** | Specifies the OAuth Client ID used to authenticate connections to the PingOne API. |  |
|**oauthClientSecret** | **String** | Specifies the OAuth Client Secret used to authenticate connections to the PingOne API. |  [optional] |
|**oauthClientSecretPassphraseProvider** | **String** | Specifies a passphrase provider that can be used to obtain the OAuth Client Secret used to authenticate connections to the PingOne API. |  [optional] |
|**environmentID** | **String** | Specifies the PingOne Environment that will be associated with this PingOne Pass Through Authentication Plugin. |  |
|**httpProxyExternalServer** | **String** | A reference to an HTTP proxy server that should be used for requests sent to the PingOne service. |  [optional] |
|**includedLocalEntryBaseDN** | **List&lt;String&gt;** | The base DNs for the local users whose authentication attempts may be passed through to the PingOne service. |  [optional] |
|**connectionCriteria** | **String** | A reference to connection criteria that will be used to indicate which bind requests should be passed through to the PingOne service. |  [optional] |
|**requestCriteria** | **String** | A reference to request criteria that will be used to indicate which bind requests should be passed through to the PingOne service. |  [optional] |
|**tryLocalBind** | **Boolean** | Indicates whether to attempt the bind in the local server first, or to only send it to the PingOne service. |  [optional] |
|**overrideLocalPassword** | **Boolean** | Indicates whether to attempt the authentication in the PingOne service if the local user entry includes a password. This property will only be used if try-local-bind is true. |  [optional] |
|**updateLocalPassword** | **Boolean** | Indicates whether to overwrite the user&#39;s local password if the local bind fails but the authentication attempt succeeds when attempted in the PingOne service. |  [optional] |
|**updateLocalPasswordDN** | **String** | This is the DN of the user that will be used to overwrite the user&#39;s local password if update-local-password is set. The DN put here should be added to &#39;ignore-changes-by-dn&#39; in the appropriate Sync Source. |  [optional] |
|**allowLaxPassThroughAuthenticationPasswords** | **Boolean** | Indicates whether to overwrite the user&#39;s local password even if the password used to authenticate to the PingOne service would have failed validation if the user attempted to set it directly. |  [optional] |
|**ignoredPasswordPolicyStateErrorCondition** | **List&lt;EnumpluginIgnoredPasswordPolicyStateErrorConditionProp&gt;** |  |  [optional] |
|**userMappingLocalAttribute** | **List&lt;String&gt;** | The names of the attributes in the local user entry whose values must match the values of the corresponding fields in the PingOne service. |  |
|**userMappingRemoteJSONField** | **List&lt;String&gt;** | The names of the fields in the PingOne service whose values must match the values of the corresponding attributes in the local user entry, as specified in the user-mapping-local-attribute property. |  |
|**additionalUserMappingSCIMFilter** | **String** | An optional SCIM filter that will be ANDed with the filter created to identify the account in the PingOne service that corresponds to the local entry. Only the \&quot;eq\&quot;, \&quot;sw\&quot;, \&quot;and\&quot;, and \&quot;or\&quot; filter types may be used. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




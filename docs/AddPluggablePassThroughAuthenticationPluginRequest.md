

# AddPluggablePassThroughAuthenticationPluginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pluginName** | **String** | Name of the new Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumpluggablePassThroughAuthenticationPluginSchemaUrn&gt;** |  |  |
|**passThroughAuthenticationHandler** | **String** | The component used to manage authentication with the external authentication service. |  |
|**includedLocalEntryBaseDN** | **List&lt;String&gt;** | The base DNs for the local users whose authentication attempts may be passed through to the external authentication service. |  [optional] |
|**connectionCriteria** | **String** | A reference to connection criteria that will be used to indicate which bind requests should be passed through to the external authentication service. |  [optional] |
|**requestCriteria** | **String** | A reference to request criteria that will be used to indicate which bind requests should be passed through to the external authentication service. |  [optional] |
|**tryLocalBind** | **Boolean** | Indicates whether to attempt the bind in the local server first and only send the request to the external authentication service if the local bind attempt fails, or to only attempt the bind in the external service. |  [optional] |
|**overrideLocalPassword** | **Boolean** | Indicates whether to attempt the authentication in the external service if the local user entry includes a password. This property will be ignored if try-local-bind is false. |  [optional] |
|**updateLocalPassword** | **Boolean** | Indicates whether to overwrite the user&#39;s local password if the local bind fails but the authentication attempt succeeds when attempted in the external service. This property may only be set to true if try-local-bind is also true. |  [optional] |
|**updateLocalPasswordDN** | **String** | The DN of the authorization identity that will be used when updating the user&#39;s local password if update-local-password is true. This is primarily intended for use if the Data Sync Server will be used to synchronize passwords between the local server and the external service, and in that case, the DN used here should also be added to the ignore-changes-by-dn property in the appropriate Sync Source object in the Data Sync Server configuration. |  [optional] |
|**allowLaxPassThroughAuthenticationPasswords** | **Boolean** | Indicates whether to overwrite the user&#39;s local password even if the password used to authenticate to the external service would have failed validation if the user attempted to set it directly. |  [optional] |
|**ignoredPasswordPolicyStateErrorCondition** | **List&lt;EnumpluginIgnoredPasswordPolicyStateErrorConditionProp&gt;** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




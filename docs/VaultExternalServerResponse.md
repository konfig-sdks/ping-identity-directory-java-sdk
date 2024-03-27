

# VaultExternalServerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the External Server |  |
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;EnumvaultExternalServerSchemaUrn&gt;** |  |  |
|**vaultServerBaseURI** | **List&lt;String&gt;** | The base URL needed to access the Vault server. The base URL should consist of the protocol (\&quot;http\&quot; or \&quot;https\&quot;), the server address (resolvable name or IP address), and the port number. For example, \&quot;https://vault.example.com:8200/\&quot;. |  |
|**vaultAuthenticationMethod** | **String** | The mechanism used to authenticate to the Vault server. |  |
|**httpConnectTimeout** | **String** | The maximum length of time to wait to obtain an HTTP connection. |  [optional] |
|**httpResponseTimeout** | **String** | The maximum length of time to wait for a response to an HTTP request. |  [optional] |
|**trustStoreFile** | **String** | The path to a file containing the information needed to trust the certificate presented by the Vault servers. |  [optional] |
|**trustStorePin** | **String** | The passphrase needed to access the contents of the trust store. This is only required if a trust store file is required, and if that trust store requires a PIN to access its contents. |  [optional] |
|**trustStoreType** | **String** | The store type for the specified trust store file. The value should likely be one of \&quot;JKS\&quot;, \&quot;PKCS12\&quot;, or \&quot;BCFKS\&quot;. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




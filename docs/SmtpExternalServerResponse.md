

# SmtpExternalServerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the External Server |  |
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;EnumsmtpExternalServerSchemaUrn&gt;** |  |  |
|**serverHostName** | **String** | The host name of the smtp server. |  |
|**serverPort** | **Integer** | The port number where the smtp server listens for requests. |  [optional] |
|**smtpSecurity** | **EnumexternalServerSmtpSecurityProp** |  |  [optional] |
|**userName** | **String** | The name of the login account to use when connecting to the smtp server. Both username and password must be supplied if this attribute is set. |  [optional] |
|**password** | **String** | The login password for the specified user name. Both username and password must be supplied if this attribute is set. |  [optional] |
|**passphraseProvider** | **String** | The passphrase provider to use to obtain the login password for the specified user. |  [optional] |
|**smtpTimeout** | **String** | Specifies the maximum length of time that a connection or attempted connection to a SMTP server may take. |  [optional] |
|**smtpConnectionProperties** | **List&lt;String&gt;** | Specifies the connection properties for the smtp server. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




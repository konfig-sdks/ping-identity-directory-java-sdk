

# ConsoleWebApplicationExtensionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Web Application Extension |  [optional] |
|**schemas** | **List&lt;EnumconsoleWebApplicationExtensionSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Web Application Extension |  |
|**ssoEnabled** | **Boolean** | Indicates that SSO login into the Administrative Console is enabled. |  [optional] |
|**oidcClientID** | **String** | The client ID to use when authenticating to the OpenID Connect provider. |  [optional] |
|**oidcClientSecret** | **String** | The client secret to use when authenticating to the OpenID Connect provider. |  [optional] |
|**oidcClientSecretPassphraseProvider** | **String** | A passphrase provider that may be used to obtain the client secret to use when authenticating to the OpenID Connect provider. |  [optional] |
|**oidcIssuerURL** | **String** | The issuer URL of the OpenID Connect provider. |  [optional] |
|**oidcTrustStoreFile** | **String** | Specifies the path to the truststore file used by this application to evaluate OIDC provider certificates. If this field is left blank, the default JVM trust store will be used. |  [optional] |
|**oidcTrustStoreType** | **String** | Specifies the format for the data in the OIDC trust store file. |  [optional] |
|**oidcTrustStorePinPassphraseProvider** | **String** | The passphrase provider that may be used to obtain the PIN for the trust store used with OIDC providers. This is only required if a trust store file is required, and if that trust store requires a PIN to access its contents. |  [optional] |
|**oidcStrictHostnameVerification** | **Boolean** | Controls whether or not hostname verification is performed, which checks if the hostname of the OIDC provider matches the name(s) stored inside the certificate it provides. This property should only be set to false for testing purposes. |  [optional] |
|**oidcTrustAll** | **Boolean** | Controls whether or not this application will always trust any certificate that is presented to it, regardless of its contents. This property should only be set to true for testing purposes. |  [optional] |
|**ldapServer** | **String** | The LDAP URL used to connect to the managed server. |  [optional] |
|**trustStoreFile** | **String** | Specifies the path to the truststore file, which is used by this application to establish trust of managed servers. |  [optional] |
|**trustStoreType** | **String** | Specifies the format for the data in the trust store file. |  [optional] |
|**trustStorePinPassphraseProvider** | **String** | The passphrase provider that may be used to obtain the PIN for the trust store used with managed LDAP servers. This is only required if a trust store file is required, and if that trust store requires a PIN to access its contents. |  [optional] |
|**logFile** | **String** | The path to the log file for the web application. |  [optional] |
|**complexity** | **EnumwebApplicationExtensionComplexityProp** |  |  [optional] |
|**baseContextPath** | **String** | Specifies the base context path that should be used by HTTP clients to reference content. The value must start with a forward slash and at least one additional character and must represent a valid HTTP context path. |  |
|**warFile** | **String** | Specifies the path to a standard web application archive (WAR) file. |  [optional] |
|**documentRootDirectory** | **String** | Specifies the path to the directory on the local filesystem containing the files to be served by this Web Application Extension. The path must exist, and it must be a directory. |  [optional] |
|**deploymentDescriptorFile** | **String** | Specifies the path to the deployment descriptor file when used with document-root-directory. |  [optional] |
|**temporaryDirectory** | **String** | Specifies the path to the directory that may be used to store temporary files such as extracted WAR files and compiled JSP files. |  [optional] |
|**initParameter** | **List&lt;String&gt;** | Specifies an initialization parameter to pass into the web application during startup. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




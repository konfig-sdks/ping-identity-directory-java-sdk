

# GssapiSaslMechanismHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this SASL Mechanism Handler |  [optional] |
|**schemas** | **List&lt;EnumgssapiSaslMechanismHandlerSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the SASL Mechanism Handler |  |
|**realm** | **String** | Specifies the realm to be used for GSSAPI authentication. |  [optional] |
|**kdcAddress** | **String** | Specifies the address of the KDC that is to be used for Kerberos processing. |  [optional] |
|**keytab** | **String** | Specifies the keytab file that should be used for Kerberos processing. |  [optional] |
|**allowNullServerFqdn** | **Boolean** | Specifies whether or not to allow a null value for the server-fqdn. |  [optional] |
|**serverFqdn** | **String** | Specifies the DNS-resolvable fully-qualified domain name for the system. |  [optional] |
|**allowedQualityOfProtection** | **List&lt;EnumsaslMechanismHandlerAllowedQualityOfProtectionProp&gt;** |  |  [optional] |
|**identityMapper** | **String** | Specifies the name of the identity mapper that is to be used with this SASL mechanism handler to match the Kerberos principal included in the SASL bind request to the corresponding user in the directory. |  |
|**alternateAuthorizationIdentityMapper** | **String** | Specifies the name of the identity mapper that is to be used with this SASL mechanism handler to map the alternate authorization identity (if provided, and if different from the Kerberos principal used as the authentication identity) to the corresponding user in the directory. If no value is specified, then the mapper specified in the identity-mapper configuration property will be used. |  [optional] |
|**kerberosServicePrincipal** | **String** | Specifies the Kerberos service principal that the Directory Server will use to identify itself to the KDC. |  [optional] |
|**gssapiRole** | **EnumsaslMechanismHandlerGssapiRoleProp** |  |  [optional] |
|**jaasConfigFile** | **String** | Specifies the path to a JAAS (Java Authentication and Authorization Service) configuration file that provides the information that the JVM should use for Kerberos processing. |  [optional] |
|**enableDebug** | **Boolean** | Indicates whether to enable debugging for the Java GSSAPI provider. Debug information will be written to standard output, which should be captured in the server.out log file. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the SASL mechanism handler is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




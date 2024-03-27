

# LdapServerInstanceListenerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumldapServerInstanceListenerSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Server Instance Listener |  |
|**serverLDAPPort** | **Integer** | The TCP port number on which the LDAP server is listening. |  [optional] |
|**connectionSecurity** | **EnumserverInstanceListenerLdapConnectionSecurityProp** |  |  [optional] |
|**listenerCertificate** | **String** | The public component of the certificate that the listener is expected to present to clients. When establishing a connection to this server, only the certificate(s) listed here will be trusted. |  [optional] |
|**purpose** | **List&lt;EnumserverInstanceListenerPurposeProp&gt;** |  |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |






# AuthorizeServerInstanceResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumauthorizeServerInstanceSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Server Instance |  [optional] |
|**serverInstanceType** | **EnumserverInstanceServerInstanceTypeProp** |  |  [optional] |
|**serverInstanceName** | **String** | The name of this Server Instance. The instance name needs to be unique if this server will be part of a topology of servers that are connected to each other. Once set, it may not be changed. |  [optional] |
|**clusterName** | **String** | The name of the cluster to which this Server Instance belongs. Server instances within the same cluster will share the same cluster-wide configuration. |  [optional] |
|**serverInstanceLocation** | **String** | Specifies the location for the Server Instance. |  [optional] |
|**hostname** | **String** | The name of the host where this Server Instance is installed. |  [optional] |
|**serverRoot** | **String** | The file system path where this Server Instance is installed. |  [optional] |
|**serverVersion** | **String** | The version of the server. |  [optional] |
|**interServerCertificate** | **String** | The public component of the certificate used by this instance to protect inter-server communication and to perform server-specific encryption. This will generally be managed by the server and should only be altered by administrators under explicit direction from Ping Identity support personnel. |  [optional] |
|**ldapPort** | **Integer** | The TCP port on which this server is listening for LDAP connections. |  [optional] |
|**ldapsPort** | **Integer** | The TCP port on which this server is listening for LDAP secure connections. |  [optional] |
|**httpPort** | **Integer** | The TCP port on which this server is listening for HTTP connections. |  [optional] |
|**httpsPort** | **Integer** | The TCP port on which this server is listening for HTTPS connections. |  [optional] |
|**replicationPort** | **Integer** | The replication TCP port. |  [optional] |
|**replicationServerID** | **Integer** | Specifies a unique identifier for the replication server on this server instance. |  [optional] |
|**replicationDomainServerID** | **List&lt;Integer&gt;** | Specifies a unique identifier for the Directory Server within the replication domain. |  [optional] |
|**jmxPort** | **Integer** | The TCP port on which this server is listening for JMX connections. |  [optional] |
|**jmxsPort** | **Integer** | The TCP port on which this server is listening for JMX secure connections. |  [optional] |
|**preferredSecurity** | **EnumserverInstancePreferredSecurityProp** |  |  [optional] |
|**startTLSEnabled** | **Boolean** | Indicates whether StartTLS is enabled on this server. |  [optional] |
|**baseDN** | **List&lt;String&gt;** | The set of base DNs under the root DSE. |  [optional] |
|**memberOfServerGroup** | **List&lt;String&gt;** | The set of groups of which this server is a member. |  [optional] |




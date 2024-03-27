

# PassThroughAuthenticationPluginShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumpassThroughAuthenticationPluginSchemaUrn&gt;** |  |  |
|**pluginType** | **List&lt;EnumpluginPluginTypeProp&gt;** |  |  [optional] |
|**server** | **List&lt;String&gt;** | Specifies the LDAP external server(s) to which authentication attempts should be forwarded. |  |
|**tryLocalBind** | **Boolean** | Indicates whether the bind attempt should first be attempted against the local server. Depending on the value of the override-local-password property, the bind attempt may then be attempted against a remote server if the local bind fails. |  [optional] |
|**overrideLocalPassword** | **Boolean** | Indicates whether the bind attempt should be attempted against a remote server in the event that the local bind fails but the local password is present. |  [optional] |
|**updateLocalPassword** | **Boolean** | Indicates whether the local password value should be updated to the value used in the bind request in the event that the local bind fails but the remote bind succeeds. |  [optional] |
|**allowLaxPassThroughAuthenticationPasswords** | **Boolean** | Indicates whether updates to the local password value should accept passwords that do not meet password policy constraints. |  [optional] |
|**serverAccessMode** | **EnumpluginServerAccessModeProp** |  |  [optional] |
|**includedLocalEntryBaseDN** | **List&lt;String&gt;** | The base DNs for the local users whose authentication attempts may be passed through to an alternate server. |  [optional] |
|**connectionCriteria** | **String** | Specifies a set of connection criteria that must match the client associated with the bind request for the bind to be passed through to an alternate server. |  [optional] |
|**requestCriteria** | **String** | Specifies a set of request criteria that must match the bind request for the bind to be passed through to an alternate server. |  [optional] |
|**dnMap** | **List&lt;String&gt;** | Specifies one or more DN mappings that may be used to transform bind DNs before attempting to bind to the external servers. |  [optional] |
|**bindDNPattern** | **String** | A pattern to use to construct the bind DN for the simple bind request to send to the remote server. This may consist of a combination of static text and attribute values and other directives enclosed in curly braces.  For example, the value \&quot;cn&#x3D;{cn},ou&#x3D;People,dc&#x3D;example,dc&#x3D;com\&quot; indicates that the remote bind DN should be constructed from the text \&quot;cn&#x3D;\&quot; followed by the value of the local entry&#39;s cn attribute followed by the text \&quot;ou&#x3D;People,dc&#x3D;example,dc&#x3D;com\&quot;. If an attribute contains the value to use as the bind DN for pass-through authentication, then the pattern may simply be the name of that attribute in curly braces (e.g., if the seeAlso attribute contains the bind DN for the target user, then a bind DN pattern of \&quot;{seeAlso}\&quot; would be appropriate).  Note that a bind DN pattern can be used to construct a bind DN that is not actually a valid LDAP distinguished name. For example, if authentication is being passed through to a Microsoft Active Directory server, then a bind DN pattern could be used to construct a user principal name (UPN) as an alternative to a distinguished name. |  [optional] |
|**searchBaseDN** | **String** | The base DN to use when searching for the user entry using a filter constructed from the pattern defined in the search-filter-pattern property. If no base DN is specified, the null DN will be used as the search base DN. |  [optional] |
|**searchFilterPattern** | **String** | A pattern to use to construct a filter to use when searching an external server for the entry of the user as whom to bind. For example, \&quot;(mail&#x3D;{uid:ldapFilterEscape}@example.com)\&quot; would construct a search filter to search for a user whose entry in the local server contains a uid attribute whose value appears before \&quot;@example.com\&quot; in the mail attribute in the external server. Note that the \&quot;ldapFilterEscape\&quot; modifier should almost always be used with attributes specified in the pattern. |  [optional] |
|**initialConnections** | **Integer** | Specifies the initial number of connections to establish to each external server against which authentication may be attempted. |  [optional] |
|**maxConnections** | **Integer** | Specifies the maximum number of connections to maintain to each external server against which authentication may be attempted. This value must be greater than or equal to the value for the initial-connections property. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |






# AddRootDnUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userName** | **String** | Name of the new Root DN User |  |
|**description** | **String** | A description for this User. |  [optional] |
|**schemas** | **List&lt;EnumrootDnUserSchemaUrn&gt;** |  |  [optional] |
|**alternateBindDN** | **List&lt;String&gt;** | Specifies one or more alternate DNs that can be used to bind to the server as this User. |  [optional] |
|**password** | **String** | Specifies the user&#39;s password. This is stored in the userPassword LDAP attribute. To set a pre-hashed value, the account making the change must have the bypass-pw-policy privilege. |  [optional] |
|**firstName** | **List&lt;String&gt;** | Specifies the user&#39;s first name. This is stored in the givenName LDAP attribute. |  [optional] |
|**lastName** | **List&lt;String&gt;** | Specifies the user&#39;s last name. This is stored in the sn LDAP attribute. |  [optional] |
|**userID** | **String** | Specifies the user&#39;s user ID. This is stored in the uid LDAP attribute. |  [optional] |
|**emailAddress** | **List&lt;String&gt;** | Specifies the user&#39;s email address. This is stored in the mail LDAP attribute. |  [optional] |
|**workTelephoneNumber** | **List&lt;String&gt;** | Specifies the user&#39;s work telephone number. This is stored in the telephoneNumber LDAP attribute. |  [optional] |
|**homeTelephoneNumber** | **List&lt;String&gt;** | Specifies the user&#39;s home telephone number. This is stored in the homePhone LDAP attribute. |  [optional] |
|**mobileTelephoneNumber** | **List&lt;String&gt;** | Specifies the user&#39;s mobile telephone number. This is stored in the mobile LDAP attribute. |  [optional] |
|**pagerTelephoneNumber** | **List&lt;String&gt;** | Specifies the user&#39;s pager telephone number. This is stored in the pager LDAP attribute. |  [optional] |
|**inheritDefaultRootPrivileges** | **Boolean** | Indicates whether this User should be automatically granted the set of privileges defined in the default-root-privilege-name property of the Root DN configuration object. |  [optional] |
|**privilege** | **List&lt;EnumrootDnUserPrivilegeProp&gt;** |  |  [optional] |
|**searchResultEntryLimit** | **Integer** | Specifies the maximum number of entries that the server may return to the user in response to any single search request. A value of 0 indicates no limit should be enforced. This is stored in the ds-rlim-size-limit LDAP attribute. |  [optional] |
|**timeLimitSeconds** | **Integer** | Specifies the maximum length of time (in seconds) that the server may spend processing any single search request. A value of 0 indicates no limit should be enforced. This is stored in the ds-rlim-time-limit LDAP attribute. |  [optional] |
|**lookThroughEntryLimit** | **Integer** | Specifies the maximum number of candidate entries that the server may examine in the course of processing any single search request. A value of 0 indicates no limit should be enforced. This is stored in the ds-rlim-lookthrough-limit LDAP attribute. |  [optional] |
|**idleTimeLimitSeconds** | **Integer** | Specifies the maximum length of time (in seconds) that a connection authenticated as this user may remain established without issuing any requests. A value of 0 indicates no limit should be enforced. This is stored in the ds-rlim-idle-time-limit LDAP attribute. |  [optional] |
|**passwordPolicy** | **String** | Specifies the password policy for the user. This is stored in the ds-pwp-password-policy-dn LDAP attribute. |  [optional] |
|**disabled** | **Boolean** | Specifies whether the root user account should be disabled. A disabled account is not permitted to authenticate, nor can it be used as an authorization identity. This is stored in the ds-pwp-account-disabled LDAP attribute. |  [optional] |
|**accountActivationTime** | **String** | Specifies the time, in generalized time format (e.g., &#39;20160101070000Z&#39;), that the root user account should become active. If an activation time is specified, the user will not be permitted to authenticate, nor can the account be used as an authorization identity, until the activation time has arrived. This is stored in the ds-pwp-account-activation-time LDAP attribute. |  [optional] |
|**accountExpirationTime** | **String** | Specifies the time, in generalized time format (e.g., &#39;20240101070000Z&#39;), that the root user account should expire. If an expiration time is specified, the user will not be permitted to authenticate, nor can the account be used as an authorization identity, after this time has passed. This is stored in the ds-pwp-account-expiration-time LDAP attribute. |  [optional] |
|**requireSecureAuthentication** | **Boolean** | Indicates whether this User must authenticate in a secure manner. When set to \&quot;true\&quot;, the User will only be allowed to authenticate over a secure connection or using a mechanism that does not expose user credentials (e.g., the CRAM-MD5, DIGEST-MD5, and GSSAPI SASL mechanisms). |  [optional] |
|**requireSecureConnections** | **Boolean** | Indicates whether this User must be required to communicate with the server over a secure connection. When set to \&quot;true\&quot;, the User will only be allowed to communicate with the server over a secure connection (i.e., using TLS or the StartTLS extended operation). |  [optional] |
|**allowedAuthenticationType** | **List&lt;String&gt;** | Indicates that User should only be allowed to authenticate in certain ways. Allowed values include \&quot;simple\&quot; (to indicate that the user should be allowed to bind using simple authentication) or \&quot;sasl {mech}\&quot; (to indicate that the user should be allowed to bind using the specified SASL mechanism, like \&quot;sasl PLAIN\&quot;). The list of available SASL mechanisms can be retrieved by running \&quot;dsconfig --advanced list-sasl-mechanism-handlers\&quot;. |  [optional] |
|**allowedAuthenticationIPAddress** | **List&lt;String&gt;** | An IPv4 or IPv6 address mask that controls the set of IP addresses from which this User can authenticate to the server. For instance a value of 127.0.0.1 (or ::1 in IPv6) would restricted access only to localhost connections, whereas 10.6.1.* would restrict access to servers on the 10.6.1.* subnet. |  [optional] |
|**preferredOTPDeliveryMechanism** | **List&lt;String&gt;** | Overrides the default settings for the mechanisms (e.g., email or SMS) that are used to deliver one time passwords to Users. |  [optional] |
|**isProxyable** | **EnumrootDnUserIsProxyableProp** |  |  [optional] |
|**isProxyableByDN** | **List&lt;String&gt;** | Specifies the DNs of accounts that can proxy as this User using the proxied authorization v1 or v2 control, the intermediate client control, or a SASL mechanism that allows specifying an alternate authorization identity. This property is only applicable if is-proxyable is set to \&quot;allowed\&quot; or \&quot;required\&quot;. |  [optional] |
|**isProxyableByGroup** | **List&lt;String&gt;** | Specifies the DNs of groups whose members can proxy as this User using the proxied authorization v1 or v2 control, the intermediate client control, or a SASL mechanism that allows specifying an alternate authorization identity. This property is only applicable if is-proxyable is set to \&quot;allowed\&quot; or \&quot;required\&quot;. |  [optional] |
|**isProxyableByURL** | **List&lt;String&gt;** | Specifies LDAP URLs of accounts that can proxy as this User using the proxied authorization v1 or v2 control, the intermediate client control, or a SASL mechanism that allows specifying an alternate authorization identity. This property is only applicable if is-proxyable is set to \&quot;allowed\&quot; or \&quot;required\&quot;. |  [optional] |
|**mayProxyAsDN** | **List&lt;String&gt;** | This restricts the set of accounts that this User can proxy as to entries with the specified DNs. |  [optional] |
|**mayProxyAsGroup** | **List&lt;String&gt;** | This restricts the set of accounts that this User can proxy as to entries that are in the group with the specified DN. |  [optional] |
|**mayProxyAsURL** | **List&lt;String&gt;** | This restricts the set of accounts that this User can proxy as to entries that are matched by the specified LDAP URL. |  [optional] |




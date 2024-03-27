# TopologyAdminUserApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewUser**](TopologyAdminUserApi.md#addNewUser) | **POST** /topology-admin-users | Add a new Topology Admin User to the config |
| [**deleteUser**](TopologyAdminUserApi.md#deleteUser) | **DELETE** /topology-admin-users/{topology-admin-user-name} | Delete a Topology Admin User |
| [**getSingleTopologyAdminUser**](TopologyAdminUserApi.md#getSingleTopologyAdminUser) | **GET** /topology-admin-users/{topology-admin-user-name} | Returns a single Topology Admin User |
| [**listAllUsers**](TopologyAdminUserApi.md#listAllUsers) | **GET** /topology-admin-users | Returns a list of all Topology Admin User objects |
| [**updateByName**](TopologyAdminUserApi.md#updateByName) | **PATCH** /topology-admin-users/{topology-admin-user-name} | Update an existing Topology Admin User by name |


<a name="addNewUser"></a>
# **addNewUser**
> TopologyAdminUserResponse addNewUser(addTopologyAdminUserRequest).execute();

Add a new Topology Admin User to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopologyAdminUserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String userName = "userName_example"; // Name of the new Topology Admin User
    String description = "description_example"; // A description for this User.
    List<EnumtopologyAdminUserSchemaUrn> schemas = Arrays.asList();
    List<String> alternateBindDN = Arrays.asList(); // Specifies one or more alternate DNs that can be used to bind to the server as this User.
    String password = "password_example"; // Specifies the user's password. This is stored in the userPassword LDAP attribute. To set a pre-hashed value, the account making the change must have the bypass-pw-policy privilege.
    List<String> firstName = Arrays.asList(); // Specifies the user's first name. This is stored in the givenName LDAP attribute.
    List<String> lastName = Arrays.asList(); // Specifies the user's last name. This is stored in the sn LDAP attribute.
    String userID = "userID_example"; // Specifies the user's user ID. This is stored in the uid LDAP attribute.
    List<String> emailAddress = Arrays.asList(); // Specifies the user's email address. This is stored in the mail LDAP attribute.
    List<String> workTelephoneNumber = Arrays.asList(); // Specifies the user's work telephone number. This is stored in the telephoneNumber LDAP attribute.
    List<String> homeTelephoneNumber = Arrays.asList(); // Specifies the user's home telephone number. This is stored in the homePhone LDAP attribute.
    List<String> mobileTelephoneNumber = Arrays.asList(); // Specifies the user's mobile telephone number. This is stored in the mobile LDAP attribute.
    List<String> pagerTelephoneNumber = Arrays.asList(); // Specifies the user's pager telephone number. This is stored in the pager LDAP attribute.
    Boolean inheritDefaultRootPrivileges = true; // Indicates whether this User should be automatically granted the set of privileges defined in the default-root-privilege-name property of the Root DN configuration object.
    List<EnumtopologyAdminUserPrivilegeProp> privilege = Arrays.asList();
    Integer searchResultEntryLimit = 56; // Specifies the maximum number of entries that the server may return to the user in response to any single search request. A value of 0 indicates no limit should be enforced. This is stored in the ds-rlim-size-limit LDAP attribute.
    Integer timeLimitSeconds = 56; // Specifies the maximum length of time (in seconds) that the server may spend processing any single search request. A value of 0 indicates no limit should be enforced. This is stored in the ds-rlim-time-limit LDAP attribute.
    Integer lookThroughEntryLimit = 56; // Specifies the maximum number of candidate entries that the server may examine in the course of processing any single search request. A value of 0 indicates no limit should be enforced. This is stored in the ds-rlim-lookthrough-limit LDAP attribute.
    Integer idleTimeLimitSeconds = 56; // Specifies the maximum length of time (in seconds) that a connection authenticated as this user may remain established without issuing any requests. A value of 0 indicates no limit should be enforced. This is stored in the ds-rlim-idle-time-limit LDAP attribute.
    String passwordPolicy = "passwordPolicy_example"; // Specifies the password policy for the user. This is stored in the ds-pwp-password-policy-dn LDAP attribute.
    Boolean disabled = true; // Specifies whether the root user account should be disabled. A disabled account is not permitted to authenticate, nor can it be used as an authorization identity. This is stored in the ds-pwp-account-disabled LDAP attribute.
    String accountActivationTime = "accountActivationTime_example"; // Specifies the time, in generalized time format (e.g., '20160101070000Z'), that the root user account should become active. If an activation time is specified, the user will not be permitted to authenticate, nor can the account be used as an authorization identity, until the activation time has arrived. This is stored in the ds-pwp-account-activation-time LDAP attribute.
    String accountExpirationTime = "accountExpirationTime_example"; // Specifies the time, in generalized time format (e.g., '20240101070000Z'), that the root user account should expire. If an expiration time is specified, the user will not be permitted to authenticate, nor can the account be used as an authorization identity, after this time has passed. This is stored in the ds-pwp-account-expiration-time LDAP attribute.
    Boolean requireSecureAuthentication = true; // Indicates whether this User must authenticate in a secure manner. When set to \\\"true\\\", the User will only be allowed to authenticate over a secure connection or using a mechanism that does not expose user credentials (e.g., the CRAM-MD5, DIGEST-MD5, and GSSAPI SASL mechanisms).
    Boolean requireSecureConnections = true; // Indicates whether this User must be required to communicate with the server over a secure connection. When set to \\\"true\\\", the User will only be allowed to communicate with the server over a secure connection (i.e., using TLS or the StartTLS extended operation).
    List<String> allowedAuthenticationType = Arrays.asList(); // Indicates that User should only be allowed to authenticate in certain ways. Allowed values include \\\"simple\\\" (to indicate that the user should be allowed to bind using simple authentication) or \\\"sasl {mech}\\\" (to indicate that the user should be allowed to bind using the specified SASL mechanism, like \\\"sasl PLAIN\\\"). The list of available SASL mechanisms can be retrieved by running \\\"dsconfig --advanced list-sasl-mechanism-handlers\\\".
    List<String> allowedAuthenticationIPAddress = Arrays.asList(); // An IPv4 or IPv6 address mask that controls the set of IP addresses from which this User can authenticate to the server. For instance a value of 127.0.0.1 (or ::1 in IPv6) would restricted access only to localhost connections, whereas 10.6.1.* would restrict access to servers on the 10.6.1.* subnet.
    List<String> preferredOTPDeliveryMechanism = Arrays.asList(); // Overrides the default settings for the mechanisms (e.g., email or SMS) that are used to deliver one time passwords to Users.
    EnumtopologyAdminUserIsProxyableProp isProxyable = EnumtopologyAdminUserIsProxyableProp.fromValue("allowed");
    List<String> isProxyableByDN = Arrays.asList(); // Specifies the DNs of accounts that can proxy as this User using the proxied authorization v1 or v2 control, the intermediate client control, or a SASL mechanism that allows specifying an alternate authorization identity. This property is only applicable if is-proxyable is set to \\\"allowed\\\" or \\\"required\\\".
    List<String> isProxyableByGroup = Arrays.asList(); // Specifies the DNs of groups whose members can proxy as this User using the proxied authorization v1 or v2 control, the intermediate client control, or a SASL mechanism that allows specifying an alternate authorization identity. This property is only applicable if is-proxyable is set to \\\"allowed\\\" or \\\"required\\\".
    List<String> isProxyableByURL = Arrays.asList(); // Specifies LDAP URLs of accounts that can proxy as this User using the proxied authorization v1 or v2 control, the intermediate client control, or a SASL mechanism that allows specifying an alternate authorization identity. This property is only applicable if is-proxyable is set to \\\"allowed\\\" or \\\"required\\\".
    List<String> mayProxyAsDN = Arrays.asList(); // This restricts the set of accounts that this User can proxy as to entries with the specified DNs.
    List<String> mayProxyAsGroup = Arrays.asList(); // This restricts the set of accounts that this User can proxy as to entries that are in the group with the specified DN.
    List<String> mayProxyAsURL = Arrays.asList(); // This restricts the set of accounts that this User can proxy as to entries that are matched by the specified LDAP URL.
    try {
      TopologyAdminUserResponse result = client
              .topologyAdminUser
              .addNewUser(userName)
              .description(description)
              .schemas(schemas)
              .alternateBindDN(alternateBindDN)
              .password(password)
              .firstName(firstName)
              .lastName(lastName)
              .userID(userID)
              .emailAddress(emailAddress)
              .workTelephoneNumber(workTelephoneNumber)
              .homeTelephoneNumber(homeTelephoneNumber)
              .mobileTelephoneNumber(mobileTelephoneNumber)
              .pagerTelephoneNumber(pagerTelephoneNumber)
              .inheritDefaultRootPrivileges(inheritDefaultRootPrivileges)
              .privilege(privilege)
              .searchResultEntryLimit(searchResultEntryLimit)
              .timeLimitSeconds(timeLimitSeconds)
              .lookThroughEntryLimit(lookThroughEntryLimit)
              .idleTimeLimitSeconds(idleTimeLimitSeconds)
              .passwordPolicy(passwordPolicy)
              .disabled(disabled)
              .accountActivationTime(accountActivationTime)
              .accountExpirationTime(accountExpirationTime)
              .requireSecureAuthentication(requireSecureAuthentication)
              .requireSecureConnections(requireSecureConnections)
              .allowedAuthenticationType(allowedAuthenticationType)
              .allowedAuthenticationIPAddress(allowedAuthenticationIPAddress)
              .preferredOTPDeliveryMechanism(preferredOTPDeliveryMechanism)
              .isProxyable(isProxyable)
              .isProxyableByDN(isProxyableByDN)
              .isProxyableByGroup(isProxyableByGroup)
              .isProxyableByURL(isProxyableByURL)
              .mayProxyAsDN(mayProxyAsDN)
              .mayProxyAsGroup(mayProxyAsGroup)
              .mayProxyAsURL(mayProxyAsURL)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getAlternateBindDN());
      System.out.println(result.getPassword());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getUserID());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getWorkTelephoneNumber());
      System.out.println(result.getHomeTelephoneNumber());
      System.out.println(result.getMobileTelephoneNumber());
      System.out.println(result.getPagerTelephoneNumber());
      System.out.println(result.getInheritDefaultRootPrivileges());
      System.out.println(result.getPrivilege());
      System.out.println(result.getSearchResultEntryLimit());
      System.out.println(result.getTimeLimitSeconds());
      System.out.println(result.getLookThroughEntryLimit());
      System.out.println(result.getIdleTimeLimitSeconds());
      System.out.println(result.getPasswordPolicy());
      System.out.println(result.getDisabled());
      System.out.println(result.getAccountActivationTime());
      System.out.println(result.getAccountExpirationTime());
      System.out.println(result.getRequireSecureAuthentication());
      System.out.println(result.getRequireSecureConnections());
      System.out.println(result.getAllowedAuthenticationType());
      System.out.println(result.getAllowedAuthenticationIPAddress());
      System.out.println(result.getPreferredOTPDeliveryMechanism());
      System.out.println(result.getIsProxyable());
      System.out.println(result.getIsProxyableByDN());
      System.out.println(result.getIsProxyableByGroup());
      System.out.println(result.getIsProxyableByURL());
      System.out.println(result.getMayProxyAsDN());
      System.out.println(result.getMayProxyAsGroup());
      System.out.println(result.getMayProxyAsURL());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopologyAdminUserApi#addNewUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopologyAdminUserResponse> response = client
              .topologyAdminUser
              .addNewUser(userName)
              .description(description)
              .schemas(schemas)
              .alternateBindDN(alternateBindDN)
              .password(password)
              .firstName(firstName)
              .lastName(lastName)
              .userID(userID)
              .emailAddress(emailAddress)
              .workTelephoneNumber(workTelephoneNumber)
              .homeTelephoneNumber(homeTelephoneNumber)
              .mobileTelephoneNumber(mobileTelephoneNumber)
              .pagerTelephoneNumber(pagerTelephoneNumber)
              .inheritDefaultRootPrivileges(inheritDefaultRootPrivileges)
              .privilege(privilege)
              .searchResultEntryLimit(searchResultEntryLimit)
              .timeLimitSeconds(timeLimitSeconds)
              .lookThroughEntryLimit(lookThroughEntryLimit)
              .idleTimeLimitSeconds(idleTimeLimitSeconds)
              .passwordPolicy(passwordPolicy)
              .disabled(disabled)
              .accountActivationTime(accountActivationTime)
              .accountExpirationTime(accountExpirationTime)
              .requireSecureAuthentication(requireSecureAuthentication)
              .requireSecureConnections(requireSecureConnections)
              .allowedAuthenticationType(allowedAuthenticationType)
              .allowedAuthenticationIPAddress(allowedAuthenticationIPAddress)
              .preferredOTPDeliveryMechanism(preferredOTPDeliveryMechanism)
              .isProxyable(isProxyable)
              .isProxyableByDN(isProxyableByDN)
              .isProxyableByGroup(isProxyableByGroup)
              .isProxyableByURL(isProxyableByURL)
              .mayProxyAsDN(mayProxyAsDN)
              .mayProxyAsGroup(mayProxyAsGroup)
              .mayProxyAsURL(mayProxyAsURL)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopologyAdminUserApi#addNewUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addTopologyAdminUserRequest** | [**AddTopologyAdminUserRequest**](AddTopologyAdminUserRequest.md)| Create a new Topology Admin User in the config | |

### Return type

[**TopologyAdminUserResponse**](TopologyAdminUserResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **409** | The Topology Admin User already exists |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(topologyAdminUserName).execute();

Delete a Topology Admin User

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopologyAdminUserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String topologyAdminUserName = "topologyAdminUserName_example"; // Name of the Topology Admin User
    try {
      client
              .topologyAdminUser
              .deleteUser(topologyAdminUserName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopologyAdminUserApi#deleteUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .topologyAdminUser
              .deleteUser(topologyAdminUserName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TopologyAdminUserApi#deleteUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **topologyAdminUserName** | **String**| Name of the Topology Admin User | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **404** | The Topology Admin User does not exist |  -  |
| **409** | The Topology Admin User cannot be deleted |  -  |

<a name="getSingleTopologyAdminUser"></a>
# **getSingleTopologyAdminUser**
> TopologyAdminUserResponse getSingleTopologyAdminUser(topologyAdminUserName).execute();

Returns a single Topology Admin User

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopologyAdminUserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String topologyAdminUserName = "topologyAdminUserName_example"; // Name of the Topology Admin User
    try {
      TopologyAdminUserResponse result = client
              .topologyAdminUser
              .getSingleTopologyAdminUser(topologyAdminUserName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getAlternateBindDN());
      System.out.println(result.getPassword());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getUserID());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getWorkTelephoneNumber());
      System.out.println(result.getHomeTelephoneNumber());
      System.out.println(result.getMobileTelephoneNumber());
      System.out.println(result.getPagerTelephoneNumber());
      System.out.println(result.getInheritDefaultRootPrivileges());
      System.out.println(result.getPrivilege());
      System.out.println(result.getSearchResultEntryLimit());
      System.out.println(result.getTimeLimitSeconds());
      System.out.println(result.getLookThroughEntryLimit());
      System.out.println(result.getIdleTimeLimitSeconds());
      System.out.println(result.getPasswordPolicy());
      System.out.println(result.getDisabled());
      System.out.println(result.getAccountActivationTime());
      System.out.println(result.getAccountExpirationTime());
      System.out.println(result.getRequireSecureAuthentication());
      System.out.println(result.getRequireSecureConnections());
      System.out.println(result.getAllowedAuthenticationType());
      System.out.println(result.getAllowedAuthenticationIPAddress());
      System.out.println(result.getPreferredOTPDeliveryMechanism());
      System.out.println(result.getIsProxyable());
      System.out.println(result.getIsProxyableByDN());
      System.out.println(result.getIsProxyableByGroup());
      System.out.println(result.getIsProxyableByURL());
      System.out.println(result.getMayProxyAsDN());
      System.out.println(result.getMayProxyAsGroup());
      System.out.println(result.getMayProxyAsURL());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopologyAdminUserApi#getSingleTopologyAdminUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopologyAdminUserResponse> response = client
              .topologyAdminUser
              .getSingleTopologyAdminUser(topologyAdminUserName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopologyAdminUserApi#getSingleTopologyAdminUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **topologyAdminUserName** | **String**| Name of the Topology Admin User | |

### Return type

[**TopologyAdminUserResponse**](TopologyAdminUserResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **404** | The Topology Admin User does not exist |  -  |

<a name="listAllUsers"></a>
# **listAllUsers**
> TopologyAdminUserListResponse listAllUsers().filter(filter).execute();

Returns a list of all Topology Admin User objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopologyAdminUserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String filter = "filter_example"; // SCIM filter
    try {
      TopologyAdminUserListResponse result = client
              .topologyAdminUser
              .listAllUsers()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopologyAdminUserApi#listAllUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopologyAdminUserListResponse> response = client
              .topologyAdminUser
              .listAllUsers()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopologyAdminUserApi#listAllUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**TopologyAdminUserListResponse**](TopologyAdminUserListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |

<a name="updateByName"></a>
# **updateByName**
> TopologyAdminUserResponse updateByName(topologyAdminUserName, updateRequest).execute();

Update an existing Topology Admin User by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TopologyAdminUserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    List<Operation> operations = Arrays.asList();
    String topologyAdminUserName = "topologyAdminUserName_example"; // Name of the Topology Admin User
    try {
      TopologyAdminUserResponse result = client
              .topologyAdminUser
              .updateByName(operations, topologyAdminUserName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getAlternateBindDN());
      System.out.println(result.getPassword());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getUserID());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getWorkTelephoneNumber());
      System.out.println(result.getHomeTelephoneNumber());
      System.out.println(result.getMobileTelephoneNumber());
      System.out.println(result.getPagerTelephoneNumber());
      System.out.println(result.getInheritDefaultRootPrivileges());
      System.out.println(result.getPrivilege());
      System.out.println(result.getSearchResultEntryLimit());
      System.out.println(result.getTimeLimitSeconds());
      System.out.println(result.getLookThroughEntryLimit());
      System.out.println(result.getIdleTimeLimitSeconds());
      System.out.println(result.getPasswordPolicy());
      System.out.println(result.getDisabled());
      System.out.println(result.getAccountActivationTime());
      System.out.println(result.getAccountExpirationTime());
      System.out.println(result.getRequireSecureAuthentication());
      System.out.println(result.getRequireSecureConnections());
      System.out.println(result.getAllowedAuthenticationType());
      System.out.println(result.getAllowedAuthenticationIPAddress());
      System.out.println(result.getPreferredOTPDeliveryMechanism());
      System.out.println(result.getIsProxyable());
      System.out.println(result.getIsProxyableByDN());
      System.out.println(result.getIsProxyableByGroup());
      System.out.println(result.getIsProxyableByURL());
      System.out.println(result.getMayProxyAsDN());
      System.out.println(result.getMayProxyAsGroup());
      System.out.println(result.getMayProxyAsURL());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopologyAdminUserApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TopologyAdminUserResponse> response = client
              .topologyAdminUser
              .updateByName(operations, topologyAdminUserName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TopologyAdminUserApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **topologyAdminUserName** | **String**| Name of the Topology Admin User | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Topology Admin User | |

### Return type

[**TopologyAdminUserResponse**](TopologyAdminUserResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid request |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **404** | The Topology Admin User does not exist |  -  |


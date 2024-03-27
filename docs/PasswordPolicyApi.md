# PasswordPolicyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewPolicyToConfig**](PasswordPolicyApi.md#addNewPolicyToConfig) | **POST** /password-policies | Add a new Password Policy to the config |
| [**deletePolicy**](PasswordPolicyApi.md#deletePolicy) | **DELETE** /password-policies/{password-policy-name} | Delete a Password Policy |
| [**getSinglePolicy**](PasswordPolicyApi.md#getSinglePolicy) | **GET** /password-policies/{password-policy-name} | Returns a single Password Policy |
| [**listAllObjects**](PasswordPolicyApi.md#listAllObjects) | **GET** /password-policies | Returns a list of all Password Policy objects |
| [**updateByName**](PasswordPolicyApi.md#updateByName) | **PATCH** /password-policies/{password-policy-name} | Update an existing Password Policy by name |


<a name="addNewPolicyToConfig"></a>
# **addNewPolicyToConfig**
> PasswordPolicyResponse addNewPolicyToConfig(addPasswordPolicyRequest).execute();

Add a new Password Policy to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PasswordPolicyApi;
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
    String policyName = "policyName_example"; // Name of the new Password Policy
    String description = "description_example"; // A description for this Password Policy
    List<EnumpasswordPolicySchemaUrn> schemas = Arrays.asList();
    Boolean requireSecureAuthentication = true; // Indicates whether users with the associated password policy are required to authenticate in a secure manner.
    Boolean requireSecurePasswordChanges = true; // Indicates whether users with the associated password policy are required to change their password in a secure manner that does not expose the credentials.
    List<String> accountStatusNotificationHandler = Arrays.asList(); // Specifies the names of the account status notification handlers that are used with the associated password storage scheme.
    EnumpasswordPolicyStateUpdateFailurePolicyProp stateUpdateFailurePolicy = EnumpasswordPolicyStateUpdateFailurePolicyProp.fromValue("ignore");
    Boolean enableDebug = true; // Indicates whether to enable debugging for the password policy state.
    String passwordAttribute = "passwordAttribute_example"; // Specifies the attribute type used to hold user passwords.
    List<String> defaultPasswordStorageScheme = Arrays.asList(); // Specifies the names of the password storage schemes that are used to encode clear-text passwords for this password policy.
    List<String> deprecatedPasswordStorageScheme = Arrays.asList(); // Specifies the names of the password storage schemes that are considered deprecated for this password policy.
    Boolean reEncodePasswordsOnSchemeConfigChange = true; // Indicates whether to re-encode passwords on authentication if the configuration for the underlying password storage scheme has changed.
    Boolean allowMultiplePasswordValues = true; // Indicates whether user entries can have multiple distinct values for the password attribute.
    EnumpasswordPolicyAllowPreEncodedPasswordsProp allowPreEncodedPasswords = EnumpasswordPolicyAllowPreEncodedPasswordsProp.fromValue("false");
    List<String> passwordValidator = Arrays.asList(); // Specifies the names of the password validators that are used with the associated password storage scheme.
    List<String> bindPasswordValidator = Arrays.asList(); // Specifies the names of the password validators that should be invoked for bind operations.
    String minimumBindPasswordValidationFrequency = "minimumBindPasswordValidationFrequency_example"; // Indicates how frequently password validation should be performed during bind operations for each user to whom this password policy is assigned.
    EnumpasswordPolicyBindPasswordValidationFailureActionProp bindPasswordValidationFailureAction = EnumpasswordPolicyBindPasswordValidationFailureActionProp.fromValue("reject-bind");
    String passwordGenerator = "passwordGenerator_example"; // Specifies the name of the password generator that is used with the associated password policy.
    Integer passwordHistoryCount = 56; // Specifies the maximum number of former passwords to maintain in the password history.
    String passwordHistoryDuration = "passwordHistoryDuration_example"; // Specifies the maximum length of time that passwords remain in the password history.
    String minPasswordAge = "minPasswordAge_example"; // Specifies the minimum length of time after a password change before the user is allowed to change the password again.
    String maxPasswordAge = "maxPasswordAge_example"; // Specifies the maximum length of time that a user can continue using the same password before it must be changed (that is, the password expiration interval).
    String passwordExpirationWarningInterval = "passwordExpirationWarningInterval_example"; // Specifies the maximum length of time before a user's password actually expires that the server begins to include warning notifications in bind responses for that user.
    Boolean expirePasswordsWithoutWarning = true; // Indicates whether the Directory Server allows a user's password to expire even if that user has never seen an expiration warning notification.
    EnumpasswordPolicyReturnPasswordExpirationControlsProp returnPasswordExpirationControls = EnumpasswordPolicyReturnPasswordExpirationControlsProp.fromValue("unless-password-policy-control-is-used");
    Boolean allowExpiredPasswordChanges = true; // Indicates whether a user whose password is expired is still allowed to change that password using the password modify extended operation.
    Integer graceLoginCount = 56; // Specifies the number of grace logins that a user is allowed after the account has expired to allow that user to choose a new password.
    String requireChangeByTime = "requireChangeByTime_example"; // Specifies the time by which all users with the associated password policy must change their passwords.
    Integer lockoutFailureCount = 56; // Specifies the maximum number of authentication failures that a user is allowed before the account is locked out.
    String lockoutDuration = "lockoutDuration_example"; // Specifies the length of time that an account is locked after too many authentication failures.
    String lockoutFailureExpirationInterval = "lockoutFailureExpirationInterval_example"; // Specifies the length of time before an authentication failure is no longer counted against a user for the purposes of account lockout.
    Boolean ignoreDuplicatePasswordFailures = true; // Indicates whether to ignore subsequent authentication failures using the same password as an earlier failed authentication attempt (within the time frame defined by the lockout failure expiration interval). If this option is \\\"true\\\", then multiple failed attempts using the same password will be considered only a single failure. If this option is \\\"false\\\", then any failure will be tracked regardless of whether it used the same password as an earlier attempt.
    String failureLockoutAction = "failureLockoutAction_example"; // The action that the server should take for authentication attempts that target a user with more than the configured number of outstanding authentication failures.
    String idleLockoutInterval = "idleLockoutInterval_example"; // Specifies the maximum length of time that an account may remain idle (that is, the associated user does not authenticate to the server) before that user is locked out.
    Boolean allowUserPasswordChanges = true; // Indicates whether users can change their own passwords.
    Boolean passwordChangeRequiresCurrentPassword = true; // Indicates whether user password changes must use the password modify extended operation and must include the user's current password before the change is allowed.
    List<EnumpasswordPolicyPasswordRetirementBehaviorProp> passwordRetirementBehavior = Arrays.asList();
    String maxRetiredPasswordAge = "maxRetiredPasswordAge_example"; // Specifies the maximum length of time that a retired password should be considered valid and may be used to authenticate to the server.
    List<EnumpasswordPolicyAllowedPasswordResetTokenUseConditionProp> allowedPasswordResetTokenUseCondition = Arrays.asList();
    Boolean forceChangeOnAdd = true; // Indicates whether users are forced to change their passwords upon first authenticating to the Directory Server after their account has been created.
    Boolean forceChangeOnReset = true; // Indicates whether users are forced to change their passwords if they are reset by an administrator. If a user's password is changed by any other user, that is considered an administrative password reset.
    String maxPasswordResetAge = "maxPasswordResetAge_example"; // Specifies the maximum length of time that users have to change passwords after they have been reset by an administrator before they become locked.
    Boolean skipValidationForAdministrators = true; // Indicates whether passwords set by administrators are allowed to bypass the password validation process that is required for user password changes.
    Integer maximumRecentLoginHistorySuccessfulAuthenticationCount = 56; // The maximum number of successful authentication attempts to include in the recent login history for each account.
    String maximumRecentLoginHistorySuccessfulAuthenticationDuration = "maximumRecentLoginHistorySuccessfulAuthenticationDuration_example"; // The maximum age of successful authentication attempts to include in the recent login history for each account.
    Integer maximumRecentLoginHistoryFailedAuthenticationCount = 56; // The maximum number of failed authentication attempts to include in the recent login history for each account.
    String maximumRecentLoginHistoryFailedAuthenticationDuration = "maximumRecentLoginHistoryFailedAuthenticationDuration_example"; // The maximum age of failed authentication attempts to include in the recent login history for each account.
    EnumpasswordPolicyRecentLoginHistorySimilarAttemptBehaviorProp recentLoginHistorySimilarAttemptBehavior = EnumpasswordPolicyRecentLoginHistorySimilarAttemptBehaviorProp.fromValue("collapse-similar-attempts-on-the-same-date");
    String lastLoginIPAddressAttribute = "lastLoginIPAddressAttribute_example"; // Specifies the name or OID of the attribute type that is used to hold the IP address of the client from which the user last authenticated.
    String lastLoginTimeAttribute = "lastLoginTimeAttribute_example"; // Specifies the name or OID of the attribute type that is used to hold the last login time for users with the associated password policy.
    String lastLoginTimeFormat = "lastLoginTimeFormat_example"; // Specifies the format string that is used to generate the last login time value for users with the associated password policy. Last login time values will be written using the UTC (also known as GMT, or Greenwich Mean Time) time zone.
    List<String> previousLastLoginTimeFormat = Arrays.asList(); // Specifies the format string(s) that might have been used with the last login time at any point in the past for users associated with the password policy.
    try {
      PasswordPolicyResponse result = client
              .passwordPolicy
              .addNewPolicyToConfig(policyName)
              .description(description)
              .schemas(schemas)
              .requireSecureAuthentication(requireSecureAuthentication)
              .requireSecurePasswordChanges(requireSecurePasswordChanges)
              .accountStatusNotificationHandler(accountStatusNotificationHandler)
              .stateUpdateFailurePolicy(stateUpdateFailurePolicy)
              .enableDebug(enableDebug)
              .passwordAttribute(passwordAttribute)
              .defaultPasswordStorageScheme(defaultPasswordStorageScheme)
              .deprecatedPasswordStorageScheme(deprecatedPasswordStorageScheme)
              .reEncodePasswordsOnSchemeConfigChange(reEncodePasswordsOnSchemeConfigChange)
              .allowMultiplePasswordValues(allowMultiplePasswordValues)
              .allowPreEncodedPasswords(allowPreEncodedPasswords)
              .passwordValidator(passwordValidator)
              .bindPasswordValidator(bindPasswordValidator)
              .minimumBindPasswordValidationFrequency(minimumBindPasswordValidationFrequency)
              .bindPasswordValidationFailureAction(bindPasswordValidationFailureAction)
              .passwordGenerator(passwordGenerator)
              .passwordHistoryCount(passwordHistoryCount)
              .passwordHistoryDuration(passwordHistoryDuration)
              .minPasswordAge(minPasswordAge)
              .maxPasswordAge(maxPasswordAge)
              .passwordExpirationWarningInterval(passwordExpirationWarningInterval)
              .expirePasswordsWithoutWarning(expirePasswordsWithoutWarning)
              .returnPasswordExpirationControls(returnPasswordExpirationControls)
              .allowExpiredPasswordChanges(allowExpiredPasswordChanges)
              .graceLoginCount(graceLoginCount)
              .requireChangeByTime(requireChangeByTime)
              .lockoutFailureCount(lockoutFailureCount)
              .lockoutDuration(lockoutDuration)
              .lockoutFailureExpirationInterval(lockoutFailureExpirationInterval)
              .ignoreDuplicatePasswordFailures(ignoreDuplicatePasswordFailures)
              .failureLockoutAction(failureLockoutAction)
              .idleLockoutInterval(idleLockoutInterval)
              .allowUserPasswordChanges(allowUserPasswordChanges)
              .passwordChangeRequiresCurrentPassword(passwordChangeRequiresCurrentPassword)
              .passwordRetirementBehavior(passwordRetirementBehavior)
              .maxRetiredPasswordAge(maxRetiredPasswordAge)
              .allowedPasswordResetTokenUseCondition(allowedPasswordResetTokenUseCondition)
              .forceChangeOnAdd(forceChangeOnAdd)
              .forceChangeOnReset(forceChangeOnReset)
              .maxPasswordResetAge(maxPasswordResetAge)
              .skipValidationForAdministrators(skipValidationForAdministrators)
              .maximumRecentLoginHistorySuccessfulAuthenticationCount(maximumRecentLoginHistorySuccessfulAuthenticationCount)
              .maximumRecentLoginHistorySuccessfulAuthenticationDuration(maximumRecentLoginHistorySuccessfulAuthenticationDuration)
              .maximumRecentLoginHistoryFailedAuthenticationCount(maximumRecentLoginHistoryFailedAuthenticationCount)
              .maximumRecentLoginHistoryFailedAuthenticationDuration(maximumRecentLoginHistoryFailedAuthenticationDuration)
              .recentLoginHistorySimilarAttemptBehavior(recentLoginHistorySimilarAttemptBehavior)
              .lastLoginIPAddressAttribute(lastLoginIPAddressAttribute)
              .lastLoginTimeAttribute(lastLoginTimeAttribute)
              .lastLoginTimeFormat(lastLoginTimeFormat)
              .previousLastLoginTimeFormat(previousLastLoginTimeFormat)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getRequireSecureAuthentication());
      System.out.println(result.getRequireSecurePasswordChanges());
      System.out.println(result.getAccountStatusNotificationHandler());
      System.out.println(result.getStateUpdateFailurePolicy());
      System.out.println(result.getEnableDebug());
      System.out.println(result.getPasswordAttribute());
      System.out.println(result.getDefaultPasswordStorageScheme());
      System.out.println(result.getDeprecatedPasswordStorageScheme());
      System.out.println(result.getReEncodePasswordsOnSchemeConfigChange());
      System.out.println(result.getAllowMultiplePasswordValues());
      System.out.println(result.getAllowPreEncodedPasswords());
      System.out.println(result.getPasswordValidator());
      System.out.println(result.getBindPasswordValidator());
      System.out.println(result.getMinimumBindPasswordValidationFrequency());
      System.out.println(result.getBindPasswordValidationFailureAction());
      System.out.println(result.getPasswordGenerator());
      System.out.println(result.getPasswordHistoryCount());
      System.out.println(result.getPasswordHistoryDuration());
      System.out.println(result.getMinPasswordAge());
      System.out.println(result.getMaxPasswordAge());
      System.out.println(result.getPasswordExpirationWarningInterval());
      System.out.println(result.getExpirePasswordsWithoutWarning());
      System.out.println(result.getReturnPasswordExpirationControls());
      System.out.println(result.getAllowExpiredPasswordChanges());
      System.out.println(result.getGraceLoginCount());
      System.out.println(result.getRequireChangeByTime());
      System.out.println(result.getLockoutFailureCount());
      System.out.println(result.getLockoutDuration());
      System.out.println(result.getLockoutFailureExpirationInterval());
      System.out.println(result.getIgnoreDuplicatePasswordFailures());
      System.out.println(result.getFailureLockoutAction());
      System.out.println(result.getIdleLockoutInterval());
      System.out.println(result.getAllowUserPasswordChanges());
      System.out.println(result.getPasswordChangeRequiresCurrentPassword());
      System.out.println(result.getPasswordRetirementBehavior());
      System.out.println(result.getMaxRetiredPasswordAge());
      System.out.println(result.getAllowedPasswordResetTokenUseCondition());
      System.out.println(result.getForceChangeOnAdd());
      System.out.println(result.getForceChangeOnReset());
      System.out.println(result.getMaxPasswordResetAge());
      System.out.println(result.getSkipValidationForAdministrators());
      System.out.println(result.getMaximumRecentLoginHistorySuccessfulAuthenticationCount());
      System.out.println(result.getMaximumRecentLoginHistorySuccessfulAuthenticationDuration());
      System.out.println(result.getMaximumRecentLoginHistoryFailedAuthenticationCount());
      System.out.println(result.getMaximumRecentLoginHistoryFailedAuthenticationDuration());
      System.out.println(result.getRecentLoginHistorySimilarAttemptBehavior());
      System.out.println(result.getLastLoginIPAddressAttribute());
      System.out.println(result.getLastLoginTimeAttribute());
      System.out.println(result.getLastLoginTimeFormat());
      System.out.println(result.getPreviousLastLoginTimeFormat());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordPolicyApi#addNewPolicyToConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PasswordPolicyResponse> response = client
              .passwordPolicy
              .addNewPolicyToConfig(policyName)
              .description(description)
              .schemas(schemas)
              .requireSecureAuthentication(requireSecureAuthentication)
              .requireSecurePasswordChanges(requireSecurePasswordChanges)
              .accountStatusNotificationHandler(accountStatusNotificationHandler)
              .stateUpdateFailurePolicy(stateUpdateFailurePolicy)
              .enableDebug(enableDebug)
              .passwordAttribute(passwordAttribute)
              .defaultPasswordStorageScheme(defaultPasswordStorageScheme)
              .deprecatedPasswordStorageScheme(deprecatedPasswordStorageScheme)
              .reEncodePasswordsOnSchemeConfigChange(reEncodePasswordsOnSchemeConfigChange)
              .allowMultiplePasswordValues(allowMultiplePasswordValues)
              .allowPreEncodedPasswords(allowPreEncodedPasswords)
              .passwordValidator(passwordValidator)
              .bindPasswordValidator(bindPasswordValidator)
              .minimumBindPasswordValidationFrequency(minimumBindPasswordValidationFrequency)
              .bindPasswordValidationFailureAction(bindPasswordValidationFailureAction)
              .passwordGenerator(passwordGenerator)
              .passwordHistoryCount(passwordHistoryCount)
              .passwordHistoryDuration(passwordHistoryDuration)
              .minPasswordAge(minPasswordAge)
              .maxPasswordAge(maxPasswordAge)
              .passwordExpirationWarningInterval(passwordExpirationWarningInterval)
              .expirePasswordsWithoutWarning(expirePasswordsWithoutWarning)
              .returnPasswordExpirationControls(returnPasswordExpirationControls)
              .allowExpiredPasswordChanges(allowExpiredPasswordChanges)
              .graceLoginCount(graceLoginCount)
              .requireChangeByTime(requireChangeByTime)
              .lockoutFailureCount(lockoutFailureCount)
              .lockoutDuration(lockoutDuration)
              .lockoutFailureExpirationInterval(lockoutFailureExpirationInterval)
              .ignoreDuplicatePasswordFailures(ignoreDuplicatePasswordFailures)
              .failureLockoutAction(failureLockoutAction)
              .idleLockoutInterval(idleLockoutInterval)
              .allowUserPasswordChanges(allowUserPasswordChanges)
              .passwordChangeRequiresCurrentPassword(passwordChangeRequiresCurrentPassword)
              .passwordRetirementBehavior(passwordRetirementBehavior)
              .maxRetiredPasswordAge(maxRetiredPasswordAge)
              .allowedPasswordResetTokenUseCondition(allowedPasswordResetTokenUseCondition)
              .forceChangeOnAdd(forceChangeOnAdd)
              .forceChangeOnReset(forceChangeOnReset)
              .maxPasswordResetAge(maxPasswordResetAge)
              .skipValidationForAdministrators(skipValidationForAdministrators)
              .maximumRecentLoginHistorySuccessfulAuthenticationCount(maximumRecentLoginHistorySuccessfulAuthenticationCount)
              .maximumRecentLoginHistorySuccessfulAuthenticationDuration(maximumRecentLoginHistorySuccessfulAuthenticationDuration)
              .maximumRecentLoginHistoryFailedAuthenticationCount(maximumRecentLoginHistoryFailedAuthenticationCount)
              .maximumRecentLoginHistoryFailedAuthenticationDuration(maximumRecentLoginHistoryFailedAuthenticationDuration)
              .recentLoginHistorySimilarAttemptBehavior(recentLoginHistorySimilarAttemptBehavior)
              .lastLoginIPAddressAttribute(lastLoginIPAddressAttribute)
              .lastLoginTimeAttribute(lastLoginTimeAttribute)
              .lastLoginTimeFormat(lastLoginTimeFormat)
              .previousLastLoginTimeFormat(previousLastLoginTimeFormat)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordPolicyApi#addNewPolicyToConfig");
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
| **addPasswordPolicyRequest** | [**AddPasswordPolicyRequest**](AddPasswordPolicyRequest.md)| Create a new Password Policy in the config | |

### Return type

[**PasswordPolicyResponse**](PasswordPolicyResponse.md)

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
| **409** | The Password Policy already exists |  -  |

<a name="deletePolicy"></a>
# **deletePolicy**
> deletePolicy(passwordPolicyName).execute();

Delete a Password Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PasswordPolicyApi;
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
    String passwordPolicyName = "passwordPolicyName_example"; // Name of the Password Policy
    try {
      client
              .passwordPolicy
              .deletePolicy(passwordPolicyName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordPolicyApi#deletePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .passwordPolicy
              .deletePolicy(passwordPolicyName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordPolicyApi#deletePolicy");
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
| **passwordPolicyName** | **String**| Name of the Password Policy | |

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
| **404** | The Password Policy does not exist |  -  |
| **409** | The Password Policy cannot be deleted |  -  |

<a name="getSinglePolicy"></a>
# **getSinglePolicy**
> PasswordPolicyResponse getSinglePolicy(passwordPolicyName).execute();

Returns a single Password Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PasswordPolicyApi;
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
    String passwordPolicyName = "passwordPolicyName_example"; // Name of the Password Policy
    try {
      PasswordPolicyResponse result = client
              .passwordPolicy
              .getSinglePolicy(passwordPolicyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getRequireSecureAuthentication());
      System.out.println(result.getRequireSecurePasswordChanges());
      System.out.println(result.getAccountStatusNotificationHandler());
      System.out.println(result.getStateUpdateFailurePolicy());
      System.out.println(result.getEnableDebug());
      System.out.println(result.getPasswordAttribute());
      System.out.println(result.getDefaultPasswordStorageScheme());
      System.out.println(result.getDeprecatedPasswordStorageScheme());
      System.out.println(result.getReEncodePasswordsOnSchemeConfigChange());
      System.out.println(result.getAllowMultiplePasswordValues());
      System.out.println(result.getAllowPreEncodedPasswords());
      System.out.println(result.getPasswordValidator());
      System.out.println(result.getBindPasswordValidator());
      System.out.println(result.getMinimumBindPasswordValidationFrequency());
      System.out.println(result.getBindPasswordValidationFailureAction());
      System.out.println(result.getPasswordGenerator());
      System.out.println(result.getPasswordHistoryCount());
      System.out.println(result.getPasswordHistoryDuration());
      System.out.println(result.getMinPasswordAge());
      System.out.println(result.getMaxPasswordAge());
      System.out.println(result.getPasswordExpirationWarningInterval());
      System.out.println(result.getExpirePasswordsWithoutWarning());
      System.out.println(result.getReturnPasswordExpirationControls());
      System.out.println(result.getAllowExpiredPasswordChanges());
      System.out.println(result.getGraceLoginCount());
      System.out.println(result.getRequireChangeByTime());
      System.out.println(result.getLockoutFailureCount());
      System.out.println(result.getLockoutDuration());
      System.out.println(result.getLockoutFailureExpirationInterval());
      System.out.println(result.getIgnoreDuplicatePasswordFailures());
      System.out.println(result.getFailureLockoutAction());
      System.out.println(result.getIdleLockoutInterval());
      System.out.println(result.getAllowUserPasswordChanges());
      System.out.println(result.getPasswordChangeRequiresCurrentPassword());
      System.out.println(result.getPasswordRetirementBehavior());
      System.out.println(result.getMaxRetiredPasswordAge());
      System.out.println(result.getAllowedPasswordResetTokenUseCondition());
      System.out.println(result.getForceChangeOnAdd());
      System.out.println(result.getForceChangeOnReset());
      System.out.println(result.getMaxPasswordResetAge());
      System.out.println(result.getSkipValidationForAdministrators());
      System.out.println(result.getMaximumRecentLoginHistorySuccessfulAuthenticationCount());
      System.out.println(result.getMaximumRecentLoginHistorySuccessfulAuthenticationDuration());
      System.out.println(result.getMaximumRecentLoginHistoryFailedAuthenticationCount());
      System.out.println(result.getMaximumRecentLoginHistoryFailedAuthenticationDuration());
      System.out.println(result.getRecentLoginHistorySimilarAttemptBehavior());
      System.out.println(result.getLastLoginIPAddressAttribute());
      System.out.println(result.getLastLoginTimeAttribute());
      System.out.println(result.getLastLoginTimeFormat());
      System.out.println(result.getPreviousLastLoginTimeFormat());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordPolicyApi#getSinglePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PasswordPolicyResponse> response = client
              .passwordPolicy
              .getSinglePolicy(passwordPolicyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordPolicyApi#getSinglePolicy");
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
| **passwordPolicyName** | **String**| Name of the Password Policy | |

### Return type

[**PasswordPolicyResponse**](PasswordPolicyResponse.md)

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
| **404** | The Password Policy does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> PasswordPolicyListResponse listAllObjects().filter(filter).execute();

Returns a list of all Password Policy objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PasswordPolicyApi;
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
      PasswordPolicyListResponse result = client
              .passwordPolicy
              .listAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordPolicyApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PasswordPolicyListResponse> response = client
              .passwordPolicy
              .listAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordPolicyApi#listAllObjects");
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

[**PasswordPolicyListResponse**](PasswordPolicyListResponse.md)

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
> PasswordPolicyResponse updateByName(passwordPolicyName, updateRequest).execute();

Update an existing Password Policy by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PasswordPolicyApi;
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
    String passwordPolicyName = "passwordPolicyName_example"; // Name of the Password Policy
    try {
      PasswordPolicyResponse result = client
              .passwordPolicy
              .updateByName(operations, passwordPolicyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getRequireSecureAuthentication());
      System.out.println(result.getRequireSecurePasswordChanges());
      System.out.println(result.getAccountStatusNotificationHandler());
      System.out.println(result.getStateUpdateFailurePolicy());
      System.out.println(result.getEnableDebug());
      System.out.println(result.getPasswordAttribute());
      System.out.println(result.getDefaultPasswordStorageScheme());
      System.out.println(result.getDeprecatedPasswordStorageScheme());
      System.out.println(result.getReEncodePasswordsOnSchemeConfigChange());
      System.out.println(result.getAllowMultiplePasswordValues());
      System.out.println(result.getAllowPreEncodedPasswords());
      System.out.println(result.getPasswordValidator());
      System.out.println(result.getBindPasswordValidator());
      System.out.println(result.getMinimumBindPasswordValidationFrequency());
      System.out.println(result.getBindPasswordValidationFailureAction());
      System.out.println(result.getPasswordGenerator());
      System.out.println(result.getPasswordHistoryCount());
      System.out.println(result.getPasswordHistoryDuration());
      System.out.println(result.getMinPasswordAge());
      System.out.println(result.getMaxPasswordAge());
      System.out.println(result.getPasswordExpirationWarningInterval());
      System.out.println(result.getExpirePasswordsWithoutWarning());
      System.out.println(result.getReturnPasswordExpirationControls());
      System.out.println(result.getAllowExpiredPasswordChanges());
      System.out.println(result.getGraceLoginCount());
      System.out.println(result.getRequireChangeByTime());
      System.out.println(result.getLockoutFailureCount());
      System.out.println(result.getLockoutDuration());
      System.out.println(result.getLockoutFailureExpirationInterval());
      System.out.println(result.getIgnoreDuplicatePasswordFailures());
      System.out.println(result.getFailureLockoutAction());
      System.out.println(result.getIdleLockoutInterval());
      System.out.println(result.getAllowUserPasswordChanges());
      System.out.println(result.getPasswordChangeRequiresCurrentPassword());
      System.out.println(result.getPasswordRetirementBehavior());
      System.out.println(result.getMaxRetiredPasswordAge());
      System.out.println(result.getAllowedPasswordResetTokenUseCondition());
      System.out.println(result.getForceChangeOnAdd());
      System.out.println(result.getForceChangeOnReset());
      System.out.println(result.getMaxPasswordResetAge());
      System.out.println(result.getSkipValidationForAdministrators());
      System.out.println(result.getMaximumRecentLoginHistorySuccessfulAuthenticationCount());
      System.out.println(result.getMaximumRecentLoginHistorySuccessfulAuthenticationDuration());
      System.out.println(result.getMaximumRecentLoginHistoryFailedAuthenticationCount());
      System.out.println(result.getMaximumRecentLoginHistoryFailedAuthenticationDuration());
      System.out.println(result.getRecentLoginHistorySimilarAttemptBehavior());
      System.out.println(result.getLastLoginIPAddressAttribute());
      System.out.println(result.getLastLoginTimeAttribute());
      System.out.println(result.getLastLoginTimeFormat());
      System.out.println(result.getPreviousLastLoginTimeFormat());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordPolicyApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PasswordPolicyResponse> response = client
              .passwordPolicy
              .updateByName(operations, passwordPolicyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordPolicyApi#updateByName");
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
| **passwordPolicyName** | **String**| Name of the Password Policy | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Password Policy | |

### Return type

[**PasswordPolicyResponse**](PasswordPolicyResponse.md)

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
| **404** | The Password Policy does not exist |  -  |


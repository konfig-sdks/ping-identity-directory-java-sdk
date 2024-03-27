

# PasswordPolicyShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Password Policy |  [optional] |
|**schemas** | **List&lt;EnumpasswordPolicySchemaUrn&gt;** |  |  [optional] |
|**requireSecureAuthentication** | **Boolean** | Indicates whether users with the associated password policy are required to authenticate in a secure manner. |  [optional] |
|**requireSecurePasswordChanges** | **Boolean** | Indicates whether users with the associated password policy are required to change their password in a secure manner that does not expose the credentials. |  [optional] |
|**accountStatusNotificationHandler** | **List&lt;String&gt;** | Specifies the names of the account status notification handlers that are used with the associated password storage scheme. |  [optional] |
|**stateUpdateFailurePolicy** | **EnumpasswordPolicyStateUpdateFailurePolicyProp** |  |  [optional] |
|**enableDebug** | **Boolean** | Indicates whether to enable debugging for the password policy state. |  [optional] |
|**passwordAttribute** | **String** | Specifies the attribute type used to hold user passwords. |  |
|**defaultPasswordStorageScheme** | **List&lt;String&gt;** | Specifies the names of the password storage schemes that are used to encode clear-text passwords for this password policy. |  |
|**deprecatedPasswordStorageScheme** | **List&lt;String&gt;** | Specifies the names of the password storage schemes that are considered deprecated for this password policy. |  [optional] |
|**reEncodePasswordsOnSchemeConfigChange** | **Boolean** | Indicates whether to re-encode passwords on authentication if the configuration for the underlying password storage scheme has changed. |  [optional] |
|**allowMultiplePasswordValues** | **Boolean** | Indicates whether user entries can have multiple distinct values for the password attribute. |  [optional] |
|**allowPreEncodedPasswords** | **EnumpasswordPolicyAllowPreEncodedPasswordsProp** |  |  [optional] |
|**passwordValidator** | **List&lt;String&gt;** | Specifies the names of the password validators that are used with the associated password storage scheme. |  [optional] |
|**bindPasswordValidator** | **List&lt;String&gt;** | Specifies the names of the password validators that should be invoked for bind operations. |  [optional] |
|**minimumBindPasswordValidationFrequency** | **String** | Indicates how frequently password validation should be performed during bind operations for each user to whom this password policy is assigned. |  [optional] |
|**bindPasswordValidationFailureAction** | **EnumpasswordPolicyBindPasswordValidationFailureActionProp** |  |  [optional] |
|**passwordGenerator** | **String** | Specifies the name of the password generator that is used with the associated password policy. |  [optional] |
|**passwordHistoryCount** | **Integer** | Specifies the maximum number of former passwords to maintain in the password history. |  [optional] |
|**passwordHistoryDuration** | **String** | Specifies the maximum length of time that passwords remain in the password history. |  [optional] |
|**minPasswordAge** | **String** | Specifies the minimum length of time after a password change before the user is allowed to change the password again. |  [optional] |
|**maxPasswordAge** | **String** | Specifies the maximum length of time that a user can continue using the same password before it must be changed (that is, the password expiration interval). |  [optional] |
|**passwordExpirationWarningInterval** | **String** | Specifies the maximum length of time before a user&#39;s password actually expires that the server begins to include warning notifications in bind responses for that user. |  [optional] |
|**expirePasswordsWithoutWarning** | **Boolean** | Indicates whether the Directory Server allows a user&#39;s password to expire even if that user has never seen an expiration warning notification. |  [optional] |
|**returnPasswordExpirationControls** | **EnumpasswordPolicyReturnPasswordExpirationControlsProp** |  |  [optional] |
|**allowExpiredPasswordChanges** | **Boolean** | Indicates whether a user whose password is expired is still allowed to change that password using the password modify extended operation. |  [optional] |
|**graceLoginCount** | **Integer** | Specifies the number of grace logins that a user is allowed after the account has expired to allow that user to choose a new password. |  [optional] |
|**requireChangeByTime** | **String** | Specifies the time by which all users with the associated password policy must change their passwords. |  [optional] |
|**lockoutFailureCount** | **Integer** | Specifies the maximum number of authentication failures that a user is allowed before the account is locked out. |  [optional] |
|**lockoutDuration** | **String** | Specifies the length of time that an account is locked after too many authentication failures. |  [optional] |
|**lockoutFailureExpirationInterval** | **String** | Specifies the length of time before an authentication failure is no longer counted against a user for the purposes of account lockout. |  [optional] |
|**ignoreDuplicatePasswordFailures** | **Boolean** | Indicates whether to ignore subsequent authentication failures using the same password as an earlier failed authentication attempt (within the time frame defined by the lockout failure expiration interval). If this option is \&quot;true\&quot;, then multiple failed attempts using the same password will be considered only a single failure. If this option is \&quot;false\&quot;, then any failure will be tracked regardless of whether it used the same password as an earlier attempt. |  [optional] |
|**failureLockoutAction** | **String** | The action that the server should take for authentication attempts that target a user with more than the configured number of outstanding authentication failures. |  [optional] |
|**idleLockoutInterval** | **String** | Specifies the maximum length of time that an account may remain idle (that is, the associated user does not authenticate to the server) before that user is locked out. |  [optional] |
|**allowUserPasswordChanges** | **Boolean** | Indicates whether users can change their own passwords. |  [optional] |
|**passwordChangeRequiresCurrentPassword** | **Boolean** | Indicates whether user password changes must use the password modify extended operation and must include the user&#39;s current password before the change is allowed. |  [optional] |
|**passwordRetirementBehavior** | **List&lt;EnumpasswordPolicyPasswordRetirementBehaviorProp&gt;** |  |  [optional] |
|**maxRetiredPasswordAge** | **String** | Specifies the maximum length of time that a retired password should be considered valid and may be used to authenticate to the server. |  [optional] |
|**allowedPasswordResetTokenUseCondition** | **List&lt;EnumpasswordPolicyAllowedPasswordResetTokenUseConditionProp&gt;** |  |  [optional] |
|**forceChangeOnAdd** | **Boolean** | Indicates whether users are forced to change their passwords upon first authenticating to the Directory Server after their account has been created. |  [optional] |
|**forceChangeOnReset** | **Boolean** | Indicates whether users are forced to change their passwords if they are reset by an administrator. If a user&#39;s password is changed by any other user, that is considered an administrative password reset. |  [optional] |
|**maxPasswordResetAge** | **String** | Specifies the maximum length of time that users have to change passwords after they have been reset by an administrator before they become locked. |  [optional] |
|**skipValidationForAdministrators** | **Boolean** | Indicates whether passwords set by administrators are allowed to bypass the password validation process that is required for user password changes. |  [optional] |
|**maximumRecentLoginHistorySuccessfulAuthenticationCount** | **Integer** | The maximum number of successful authentication attempts to include in the recent login history for each account. |  [optional] |
|**maximumRecentLoginHistorySuccessfulAuthenticationDuration** | **String** | The maximum age of successful authentication attempts to include in the recent login history for each account. |  [optional] |
|**maximumRecentLoginHistoryFailedAuthenticationCount** | **Integer** | The maximum number of failed authentication attempts to include in the recent login history for each account. |  [optional] |
|**maximumRecentLoginHistoryFailedAuthenticationDuration** | **String** | The maximum age of failed authentication attempts to include in the recent login history for each account. |  [optional] |
|**recentLoginHistorySimilarAttemptBehavior** | **EnumpasswordPolicyRecentLoginHistorySimilarAttemptBehaviorProp** |  |  [optional] |
|**lastLoginIPAddressAttribute** | **String** | Specifies the name or OID of the attribute type that is used to hold the IP address of the client from which the user last authenticated. |  [optional] |
|**lastLoginTimeAttribute** | **String** | Specifies the name or OID of the attribute type that is used to hold the last login time for users with the associated password policy. |  [optional] |
|**lastLoginTimeFormat** | **String** | Specifies the format string that is used to generate the last login time value for users with the associated password policy. Last login time values will be written using the UTC (also known as GMT, or Greenwich Mean Time) time zone. |  [optional] |
|**previousLastLoginTimeFormat** | **List&lt;String&gt;** | Specifies the format string(s) that might have been used with the last login time at any point in the past for users associated with the password policy. |  [optional] |






# AddMultiPartEmailAccountStatusNotificationHandlerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**handlerName** | **String** | Name of the new Account Status Notification Handler |  |
|**description** | **String** | A description for this Account Status Notification Handler |  [optional] |
|**schemas** | **List&lt;EnummultiPartEmailAccountStatusNotificationHandlerSchemaUrn&gt;** |  |  |
|**accountTemporarilyFailureLockedMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that an account becomes temporarily locked as a result of too many authentication failures. |  [optional] |
|**accountPermanentlyFailureLockedMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that an account becomes permanently locked as a result of too many authentication failures. |  [optional] |
|**accountIdleLockedMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that authentication attempt fails because it has been too long since the user last successfully authenticated. |  [optional] |
|**accountResetLockedMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that authentication attempt fails because the user failed to choose a new password in a timely manner after an administrative reset. |  [optional] |
|**accountUnlockedMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that a user&#39;s account has been unlocked (e.g., by an administrative password reset). |  [optional] |
|**accountDisabledMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that a user&#39;s account is disabled by an administrator. |  [optional] |
|**accountEnabledMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that a user&#39;s account is enabled by an administrator. |  [optional] |
|**accountNotYetActiveMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that an authentication attempt fails because the account has an activation time that is in the future. |  [optional] |
|**accountExpiredMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that an authentication attempt fails because the account has an expiration time that is in the past. |  [optional] |
|**passwordExpiredMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that an authentication attempt fails because the account has an expired password. |  [optional] |
|**passwordExpiringMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that an authentication attempt succeeds, but the user&#39;s password is about to expire. This notification will only be generated the first time the user authenticates within the window of time that the server should warn about an upcoming password expiration. |  [optional] |
|**passwordResetMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that a user&#39;s password has been reset by an administrator. |  [optional] |
|**passwordChangedMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that a user changes their own password. |  [optional] |
|**accountAuthenticatedMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that an account has successfully authenticated in a bind operation that matches the criteria provided in the account-authentication-notification-request-criteria property. |  [optional] |
|**accountCreatedMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that a new account is created in an add request that matches the criteria provided in the account-creation-notification-request-criteria property. |  [optional] |
|**accountDeletedMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that an existing accout has been removed in a delete request that matches the criteria provided in the account-deletion-notification-request-criteria property. |  [optional] |
|**accountUpdatedMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that an existing account is updated with a modify or modify DN operation that matches the criteria provided in the account-update-notification-request-criteria property. |  [optional] |
|**bindPasswordFailedValidationMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that a user authenticated with a password that failed to satisfy the criteria for one or more of the configured password validators. |  [optional] |
|**mustChangePasswordMessageTemplate** | **String** | The path to a file containing the template to use to generate the email message to send in the event that a user successfully authenticates to the server but will be required to choose a new password before they will be allowed to perform any other operations. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Account Status Notification Handler is enabled. Only enabled handlers are invoked whenever a related event occurs in the server. |  |
|**asynchronous** | **Boolean** | Indicates whether the server should attempt to invoke this Account Status Notification Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver a message) will not delay processing for the operation that triggered the notification. |  [optional] |
|**accountAuthenticationNotificationResultCriteria** | **String** | A result criteria object that identifies which successful bind operations should result in account authentication notifications for this handler. |  [optional] |
|**accountCreationNotificationRequestCriteria** | **String** | A request criteria object that identifies which add requests should result in account creation notifications for this handler. |  [optional] |
|**accountDeletionNotificationRequestCriteria** | **String** | A request criteria object that identifies which delete requests should result in account deletion notifications for this handler. |  [optional] |
|**accountUpdateNotificationRequestCriteria** | **String** | A request criteria object that identifies which modify and modify DN requests should result in account update notifications for this handler. |  [optional] |






# AdminAlertAccountStatusNotificationHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Account Status Notification Handler |  |
|**description** | **String** | A description for this Account Status Notification Handler |  [optional] |
|**schemas** | **List&lt;EnumadminAlertAccountStatusNotificationHandlerSchemaUrn&gt;** |  |  |
|**accountStatusNotificationType** | **List&lt;EnumaccountStatusNotificationHandlerAccountStatusNotificationTypeProp&gt;** |  |  |
|**enabled** | **Boolean** | Indicates whether the Account Status Notification Handler is enabled. Only enabled handlers are invoked whenever a related event occurs in the server. |  |
|**asynchronous** | **Boolean** | Indicates whether the server should attempt to invoke this Account Status Notification Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver a message) will not delay processing for the operation that triggered the notification. |  [optional] |
|**accountAuthenticationNotificationResultCriteria** | **String** | A result criteria object that identifies which successful bind operations should result in account authentication notifications for this handler. |  [optional] |
|**accountCreationNotificationRequestCriteria** | **String** | A request criteria object that identifies which add requests should result in account creation notifications for this handler. |  [optional] |
|**accountDeletionNotificationRequestCriteria** | **String** | A request criteria object that identifies which delete requests should result in account deletion notifications for this handler. |  [optional] |
|**accountUpdateNotificationRequestCriteria** | **String** | A request criteria object that identifies which modify and modify DN requests should result in account update notifications for this handler. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




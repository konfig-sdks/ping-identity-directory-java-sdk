

# ThirdPartyAccountStatusNotificationHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Account Status Notification Handler |  |
|**description** | **String** | A description for this Account Status Notification Handler |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyAccountStatusNotificationHandlerSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Account Status Notification Handler. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Account Status Notification Handler. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Account Status Notification Handler is enabled. Only enabled handlers are invoked whenever a related event occurs in the server. |  |
|**asynchronous** | **Boolean** | Indicates whether the server should attempt to invoke this Account Status Notification Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver a message) will not delay processing for the operation that triggered the notification. |  [optional] |
|**accountAuthenticationNotificationResultCriteria** | **String** | A result criteria object that identifies which successful bind operations should result in account authentication notifications for this handler. |  [optional] |
|**accountCreationNotificationRequestCriteria** | **String** | A request criteria object that identifies which add requests should result in account creation notifications for this handler. |  [optional] |
|**accountDeletionNotificationRequestCriteria** | **String** | A request criteria object that identifies which delete requests should result in account deletion notifications for this handler. |  [optional] |
|**accountUpdateNotificationRequestCriteria** | **String** | A request criteria object that identifies which modify and modify DN requests should result in account update notifications for this handler. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




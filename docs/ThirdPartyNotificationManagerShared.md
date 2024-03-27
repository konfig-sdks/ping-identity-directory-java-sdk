

# ThirdPartyNotificationManagerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Notification Manager |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyNotificationManagerSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Notification Manager. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Notification Manager. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Notification Manager is enabled within the server. |  |
|**subscriptionBaseDN** | **String** | Specifies the DN of the entry below which subscription data is stored for this Notification Manager. This needs to be in the backend that has the data to be notified on, and must not be the same entry as the backend base DN. The subscription base DN entry does not need to exist as it will be created by the server. |  |
|**transactionNotification** | **EnumnotificationManagerTransactionNotificationProp** |  |  [optional] |
|**monitorEntriesEnabled** | **Boolean** | Enables monitor entries for this Notification Manager. |  [optional] |




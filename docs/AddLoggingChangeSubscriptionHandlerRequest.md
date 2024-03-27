

# AddLoggingChangeSubscriptionHandlerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**handlerName** | **String** | Name of the new Change Subscription Handler |  |
|**description** | **String** | A description for this Change Subscription Handler |  [optional] |
|**schemas** | **List&lt;EnumloggingChangeSubscriptionHandlerSchemaUrn&gt;** |  |  |
|**logFile** | **String** | Specifies the log file in which the change notification messages will be written. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this change subscription handler is enabled within the server. |  |
|**changeSubscription** | **List&lt;String&gt;** | The set of change subscriptions for which this change subscription handler should be notified. If no values are provided then it will be notified for all change subscriptions defined in the server. |  [optional] |




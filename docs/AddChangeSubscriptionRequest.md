

# AddChangeSubscriptionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subscriptionName** | **String** | Name of the new Change Subscription |  |
|**description** | **String** | A description for this Change Subscription |  [optional] |
|**schemas** | **List&lt;EnumchangeSubscriptionSchemaUrn&gt;** |  |  [optional] |
|**connectionCriteria** | **String** | Specifies a set of connection criteria that must match the client connection associated with an operation in order for that operation to be processed by a change subscription handler. |  [optional] |
|**requestCriteria** | **String** | Specifies a set of request criteria that must match the request associated with an operation in order for that operation to be processed by a change subscription handler. |  [optional] |
|**resultCriteria** | **String** | Specifies a set of result criteria that must match the result associated with an operation in order for that operation to be processed by a change subscription handler. |  [optional] |
|**expirationTime** | **String** | Specifies a timestamp that provides an expiration time for this change subscription. If an expiration time is provided, then the change subscription will not be active after that time has passed. |  [optional] |




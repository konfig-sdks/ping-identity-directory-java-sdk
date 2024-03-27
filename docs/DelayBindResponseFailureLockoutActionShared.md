

# DelayBindResponseFailureLockoutActionShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Failure Lockout Action |  [optional] |
|**schemas** | **List&lt;EnumdelayBindResponseFailureLockoutActionSchemaUrn&gt;** |  |  |
|**delay** | **String** | The length of time to delay the bind response for accounts with too many failed authentication attempts. |  |
|**allowBlockingDelay** | **Boolean** | Indicates whether to delay the response for authentication attempts even if that delay may block the thread being used to process the attempt. |  [optional] |
|**generateAccountStatusNotification** | **Boolean** | Indicates whether to generate an account status notification for cases in which a bind response is delayed because of failure lockout. |  [optional] |




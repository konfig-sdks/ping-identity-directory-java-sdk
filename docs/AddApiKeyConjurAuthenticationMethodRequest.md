

# AddApiKeyConjurAuthenticationMethodRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**methodName** | **String** | Name of the new Conjur Authentication Method |  |
|**description** | **String** | A description for this Conjur Authentication Method |  [optional] |
|**schemas** | **List&lt;EnumapiKeyConjurAuthenticationMethodSchemaUrn&gt;** |  |  |
|**username** | **String** | The username for the user to authenticate. |  |
|**password** | **String** | The password for the user to authenticate. This will be used to obtain an API key for the target user. |  [optional] |
|**apiKey** | **String** | The API key for the user to authenticate. |  [optional] |




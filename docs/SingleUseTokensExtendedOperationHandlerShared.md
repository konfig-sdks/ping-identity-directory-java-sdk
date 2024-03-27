

# SingleUseTokensExtendedOperationHandlerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Extended Operation Handler |  [optional] |
|**schemas** | **List&lt;EnumsingleUseTokensExtendedOperationHandlerSchemaUrn&gt;** |  |  |
|**passwordGenerator** | **String** | The password generator that will be used to create the single-use token values to be delivered to the end user. |  |
|**defaultOTPDeliveryMechanism** | **List&lt;String&gt;** | The set of delivery mechanisms that may be used to deliver single-use tokens to users in requests that do not specify one or more preferred delivery mechanisms. |  |
|**defaultSingleUseTokenValidityDuration** | **String** | The default length of time that a single-use token will be considered valid by the server if the client doesn&#39;t specify a duration in the deliver single-use token request. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Extended Operation Handler is enabled (that is, whether the types of extended operations are allowed in the server). |  |




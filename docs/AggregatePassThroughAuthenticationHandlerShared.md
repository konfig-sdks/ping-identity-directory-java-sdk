

# AggregatePassThroughAuthenticationHandlerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Pass Through Authentication Handler |  [optional] |
|**schemas** | **List&lt;EnumaggregatePassThroughAuthenticationHandlerSchemaUrn&gt;** |  |  |
|**subordinatePassThroughAuthenticationHandler** | **List&lt;String&gt;** | The set of subordinate pass-through authentication handlers that may be used to perform the authentication processing. Handlers will be invoked in order until one is found for which the bind operation matches the associated criteria and either succeeds or fails in a manner that should not be ignored. |  |
|**continueOnFailureType** | **List&lt;EnumpassThroughAuthenticationHandlerContinueOnFailureTypeProp&gt;** |  |  [optional] |
|**includedLocalEntryBaseDN** | **List&lt;String&gt;** | The base DNs for the local users whose authentication attempts may be passed through to the external authentication service. |  [optional] |
|**connectionCriteria** | **String** | A reference to connection criteria that will be used to indicate which bind requests should be passed through to the external authentication service. |  [optional] |
|**requestCriteria** | **String** | A reference to request criteria that will be used to indicate which bind requests should be passed through to the external authentication service. |  [optional] |




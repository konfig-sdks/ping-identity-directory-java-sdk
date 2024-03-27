

# ErrorLogFieldMappingShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Log Field Mapping |  [optional] |
|**schemas** | **List&lt;EnumerrorLogFieldMappingSchemaUrn&gt;** |  |  |
|**logFieldTimestamp** | **String** | The time that the log message was generated. |  [optional] |
|**logFieldProductName** | **String** | The name for this Directory Server product, which may be used to identify which product was used to log the message if multiple products log to the same database table. |  [optional] |
|**logFieldInstanceName** | **String** | A name that uniquely identifies this Directory Server instance, which may be used to identify which instance was used to log the message if multiple server instances log to the same database table. |  [optional] |
|**logFieldStartupid** | **String** | The startup ID for the Directory Server. A different value will be generated each time the server is started. |  [optional] |
|**logFieldCategory** | **String** | The category for the log message. |  [optional] |
|**logFieldSeverity** | **String** | The severity for the log message. |  [optional] |
|**logFieldMessageID** | **String** | The numeric value which uniquely identifies the type of message. |  [optional] |
|**logFieldMessage** | **String** | The text of the log message. |  [optional] |






# AddSnmpAlertHandlerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**handlerName** | **String** | Name of the new Alert Handler |  |
|**description** | **String** | A description for this Alert Handler |  [optional] |
|**schemas** | **List&lt;EnumsnmpAlertHandlerSchemaUrn&gt;** |  |  |
|**asynchronous** | **Boolean** | Indicates whether the server should attempt to invoke this SNMP Alert Handler in a background thread so that any potentially-expensive processing (e.g., performing network communication to deliver the alert notification) will not delay whatever processing the server was performing when the alert was generated. |  [optional] |
|**serverHostName** | **String** | Specifies the address of the SNMP agent to which traps will be sent. |  |
|**serverPort** | **Integer** | Specifies the port number of the SNMP agent to which traps will be sent. |  [optional] |
|**communityName** | **String** | Specifies the name of the community to which the traps will be sent. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Alert Handler is enabled. |  |
|**enabledAlertSeverity** | **List&lt;EnumalertHandlerEnabledAlertSeverityProp&gt;** |  |  [optional] |
|**enabledAlertType** | **List&lt;EnumalertHandlerEnabledAlertTypeProp&gt;** |  |  [optional] |
|**disabledAlertType** | **List&lt;EnumalertHandlerDisabledAlertTypeProp&gt;** |  |  [optional] |




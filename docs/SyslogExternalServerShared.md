

# SyslogExternalServerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;EnumsyslogExternalServerSchemaUrn&gt;** |  |  |
|**serverHostName** | **String** | The address of the syslog server. |  |
|**serverPort** | **Integer** | The port on which the syslog server accepts connections. |  [optional] |
|**transportMechanism** | **EnumexternalServerTransportMechanismProp** |  |  |
|**connectTimeout** | **String** | Specifies the maximum length of time to wait for a connection to be established before giving up and considering the server unavailable. This will only be used when communicating with the syslog server over TCP (with or without TLS encryption). |  [optional] |
|**maxConnectionAge** | **String** | The maximum length of time that TCP connections should remain established. This will be ignored for UDP-based connections. A zero duration indicates that no maximum age will be imposed. |  [optional] |
|**trustManagerProvider** | **String** | A trust manager provider that will be used to determine whether to trust the certificate chain presented by the syslog server when communication is encrypted with TLS. This property will be ignored when not using TLS encryption. |  [optional] |




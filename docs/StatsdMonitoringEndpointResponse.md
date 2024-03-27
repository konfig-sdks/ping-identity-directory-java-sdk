

# StatsdMonitoringEndpointResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Monitoring Endpoint |  |
|**schemas** | **List&lt;EnumstatsdMonitoringEndpointSchemaUrn&gt;** |  |  |
|**hostname** | **String** | The name of the host where this StatsD Monitoring Endpoint should send metric data. |  |
|**serverPort** | **Integer** | Specifies the port number of the endpoint where metric data should be sent. |  |
|**connectionType** | **EnummonitoringEndpointConnectionTypeProp** |  |  |
|**trustManagerProvider** | **String** | The trust manager provider to use if SSL over TCP is to be used for connection-level security. |  [optional] |
|**additionalTags** | **List&lt;String&gt;** | Specifies any optional additional tags to include in StatsD messages. Any additional tags will be appended to the end of each StatsD message, separated by commas. Tags should be written in a [key]:[value] format (\&quot;host:server1\&quot;, for example). |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Monitoring Endpoint is enabled for use in the Directory Server. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




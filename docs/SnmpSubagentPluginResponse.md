

# SnmpSubagentPluginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumsnmpSubagentPluginSchemaUrn&gt;** |  |  |
|**contextName** | **String** | The SNMP context name for this sub-agent. The context name must not be longer than 30 ASCII characters. Each server in a topology must have a unique SNMP context name. |  [optional] |
|**agentxAddress** | **String** | The hostname or IP address of the SNMP master agent. |  |
|**agentxPort** | **Integer** | The port number on which the SNMP master agent will be contacted. |  |
|**numWorkerThreads** | **Integer** | The number of worker threads to use to handle SNMP requests. |  [optional] |
|**sessionTimeout** | **String** | Specifies the maximum amount of time to wait for a session to the master agent to be established. |  [optional] |
|**connectRetryMaxWait** | **String** | The maximum amount of time to wait between attempts to establish a connection to the master agent. |  [optional] |
|**pingInterval** | **String** | The amount of time between consecutive pings sent by the sub-agent on its connection to the master agent. A value of zero disables the sending of pings by the sub-agent. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




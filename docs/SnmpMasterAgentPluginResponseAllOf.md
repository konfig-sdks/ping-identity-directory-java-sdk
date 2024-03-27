

# SnmpMasterAgentPluginResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumsnmpMasterAgentPluginSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Plugin |  [optional] |
|**listenAddress** | **String** | The IP address on which the SNMP agent will listen for client requests. |  [optional] |
|**listenPort** | **Integer** | The port number on which the SNMP agent will listen for client requests. |  [optional] |
|**agentxTransport** | **EnumpluginAgentxTransportProp** |  |  [optional] |
|**agentxListenAddress** | **String** | The IP address on which the SNMP agent will listen for sub-agent sessions. |  [optional] |
|**agentxListenPort** | **Integer** | The port number on which the SNMP agent will listen for sub-agent sessions. |  [optional] |
|**notificationTargetAddress** | **String** | The IP address of the target to which the SNMP agent should send notifications (traps). |  [optional] |
|**notificationTargetPort** | **Integer** | The port number of the target to which the SNMP agent should send notifications (traps). |  [optional] |
|**agentSNMPVersion** | **List&lt;EnumpluginAgentSNMPVersionProp&gt;** |  |  [optional] |
|**communityName** | **String** | The name of the community to use for the SNMP agent. |  [optional] |
|**agentSecurityName** | **String** | The security name (i.e., username) to use for the SNMP agent. This must be defined if SNMPv3 is to be used. |  [optional] |
|**agentSecurityLevel** | **EnumpluginAgentSecurityLevelProp** |  |  [optional] |
|**agentAuthenticationProtocol** | **EnumpluginAgentAuthenticationProtocolProp** |  |  [optional] |
|**agentAuthenticationPassphrase** | **String** | The authentication passphrase to use for SNMPv3 if authentication is to be performed. |  [optional] |
|**agentPrivacyProtocol** | **EnumpluginAgentPrivacyProtocolProp** |  |  [optional] |
|**agentPrivacyPassphrase** | **String** | The privacy passphrase to use for SNMPv3 if privacy is to be used. |  [optional] |
|**numWorkerThreads** | **Integer** | The number of worker threads to use to handle SNMP requests. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  [optional] |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |




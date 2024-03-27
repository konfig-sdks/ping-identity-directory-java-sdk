

# SnmpMasterAgentPluginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumsnmpMasterAgentPluginSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Plugin |  |
|**listenAddress** | **String** | The IP address on which the SNMP agent will listen for client requests. |  |
|**listenPort** | **Integer** | The port number on which the SNMP agent will listen for client requests. |  |
|**agentxTransport** | **EnumpluginAgentxTransportProp** |  |  |
|**agentxListenAddress** | **String** | The IP address on which the SNMP agent will listen for sub-agent sessions. |  |
|**agentxListenPort** | **Integer** | The port number on which the SNMP agent will listen for sub-agent sessions. |  |
|**notificationTargetAddress** | **String** | The IP address of the target to which the SNMP agent should send notifications (traps). |  [optional] |
|**notificationTargetPort** | **Integer** | The port number of the target to which the SNMP agent should send notifications (traps). |  [optional] |
|**agentSNMPVersion** | **List&lt;EnumpluginAgentSNMPVersionProp&gt;** |  |  |
|**communityName** | **String** | The name of the community to use for the SNMP agent. |  |
|**agentSecurityName** | **String** | The security name (i.e., username) to use for the SNMP agent. This must be defined if SNMPv3 is to be used. |  [optional] |
|**agentSecurityLevel** | **EnumpluginAgentSecurityLevelProp** |  |  [optional] |
|**agentAuthenticationProtocol** | **EnumpluginAgentAuthenticationProtocolProp** |  |  [optional] |
|**agentAuthenticationPassphrase** | **String** | The authentication passphrase to use for SNMPv3 if authentication is to be performed. |  [optional] |
|**agentPrivacyProtocol** | **EnumpluginAgentPrivacyProtocolProp** |  |  [optional] |
|**agentPrivacyPassphrase** | **String** | The privacy passphrase to use for SNMPv3 if privacy is to be used. |  [optional] |
|**numWorkerThreads** | **Integer** | The number of worker threads to use to handle SNMP requests. |  |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




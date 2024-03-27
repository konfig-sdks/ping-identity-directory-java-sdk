

# CoalesceModificationsPluginResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Plugin |  |
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumcoalesceModificationsPluginSchemaUrn&gt;** |  |  |
|**requestCriteria** | **String** | A reference to request criteria that indicates which modify requests should be coalesced. |  |
|**allowedRequestControl** | **List&lt;String&gt;** | Specifies the OIDs of the controls that are allowed to be present in operations to coalesce. These controls are passed through when the request is validated, but they will not be included when the background thread applies the coalesced modify requests. |  [optional] |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




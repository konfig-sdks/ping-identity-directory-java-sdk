

# SchemaBackendResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnumschemaBackendSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Backend |  |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN(s) for the data that the backend handles. |  |
|**writabilityMode** | **EnumbackendWritabilityModeProp** |  |  |
|**schemaEntryDN** | **List&lt;String&gt;** | Defines the base DNs of the subtrees in which the schema information is published in addition to the value included in the base-dn property. |  [optional] |
|**showAllAttributes** | **Boolean** | Indicates whether to treat all attributes in the schema entry as if they were user attributes regardless of their configuration. |  |
|**readOnlySchemaFile** | **List&lt;String&gt;** | Specifies the name of a file (which must exist in the config/schema directory) containing schema elements that should be considered read-only. Any schema definitions contained in read-only files cannot be altered by external clients. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  |
|**setDegradedAlertWhenDisabled** | **Boolean** | Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled. |  [optional] |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**backupFilePermissions** | **String** | Specifies the permissions that should be applied to files and directories created by a backup of the backend. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




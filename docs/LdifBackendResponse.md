

# LdifBackendResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnumldifBackendSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Backend |  |
|**writabilityMode** | **EnumbackendWritabilityModeProp** |  |  |
|**isPrivateBackend** | **Boolean** | Indicates whether the backend should be considered a private backend, which indicates that it is used for storing operational data rather than user-defined information. |  [optional] |
|**ldifFile** | **String** | Specifies the path to the LDIF file containing the data for this backend. |  |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN(s) for the data that the backend handles. |  |
|**setDegradedAlertWhenDisabled** | **Boolean** | Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled. |  [optional] |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**backupFilePermissions** | **String** | Specifies the permissions that should be applied to files and directories created by a backup of the backend. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




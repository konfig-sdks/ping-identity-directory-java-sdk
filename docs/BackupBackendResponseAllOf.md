

# BackupBackendResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnumbackupBackendSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Backend |  [optional] |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  [optional] |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN(s) for the data that the backend handles. |  [optional] |
|**writabilityMode** | **EnumbackendWritabilityModeProp** |  |  [optional] |
|**backupDirectory** | **List&lt;String&gt;** | Specifies the path to a backup directory containing one or more backups for a particular backend. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  [optional] |
|**setDegradedAlertWhenDisabled** | **Boolean** | Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled. |  [optional] |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |




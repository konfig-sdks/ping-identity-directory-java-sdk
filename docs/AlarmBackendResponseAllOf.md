

# AlarmBackendResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Backend |  [optional] |
|**schemas** | **List&lt;EnumalarmBackendSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Backend |  [optional] |
|**backendID** | **String** | Specifies a name to identify the associated backend. |  [optional] |
|**baseDN** | **List&lt;String&gt;** | Specifies the base DN(s) for the data that the backend handles. |  [optional] |
|**ldifFile** | **String** | Specifies the path to the LDIF file that serves as the backing file for this backend. |  [optional] |
|**alarmRetentionTime** | **String** | Specifies the maximum length of time that information about raised alarms should be maintained before they will be purged. |  [optional] |
|**maxAlarms** | **Integer** | Specifies the maximum number of alarms that should be retained. If more alarms than this configured maximum are generated within the alarm retention time, then the oldest alarms will be purged to achieve this maximum. Only alarms at normal severity will be purged. |  [optional] |
|**writabilityMode** | **EnumbackendWritabilityModeProp** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the backend is enabled in the server. |  [optional] |
|**setDegradedAlertWhenDisabled** | **Boolean** | Determines whether the Directory Server enters a DEGRADED state (and sends a corresponding alert) when this Backend is disabled. |  [optional] |
|**returnUnavailableWhenDisabled** | **Boolean** | Determines whether any LDAP operation that would use this Backend is to return UNAVAILABLE when this Backend is disabled. |  [optional] |
|**backupFilePermissions** | **String** | Specifies the permissions that should be applied to files and directories created by a backup of the backend. |  [optional] |
|**notificationManager** | **String** | Specifies a notification manager for changes resulting from operations processed through this Backend |  [optional] |




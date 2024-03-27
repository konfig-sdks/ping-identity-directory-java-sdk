

# HostSystemMonitorProviderResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Monitor Provider |  [optional] |
|**schemas** | **List&lt;EnumhostSystemMonitorProviderSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Monitor Provider |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Host System Monitor Provider is enabled for use. |  [optional] |
|**diskDevices** | **List&lt;String&gt;** | Specifies which disk devices to monitor for I/O activity. Should be the device name as displayed by iostat -d. |  [optional] |
|**networkDevices** | **List&lt;String&gt;** | Specifies which network interfaces to monitor for I/O activity. Should be the device name as displayed by netstat -i. |  [optional] |
|**systemUtilizationMonitorLogDirectory** | **String** | Specifies a relative or absolute path to the directory on the local filesystem containing the log files used by the system utilization monitor. The path must exist, and it must be a writable directory by the server process. |  [optional] |




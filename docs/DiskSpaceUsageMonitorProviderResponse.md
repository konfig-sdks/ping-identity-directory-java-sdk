

# DiskSpaceUsageMonitorProviderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Monitor Provider |  [optional] |
|**schemas** | **List&lt;EnumdiskSpaceUsageMonitorProviderSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Monitor Provider |  |
|**lowSpaceWarningSizeThreshold** | **String** | Specifies the low space warning threshold value as an absolute amount of space. If the amount of usable disk space drops below this amount, then the Directory Server will begin generating warning alert notifications. |  [optional] |
|**lowSpaceWarningPercentThreshold** | **Integer** | Specifies the low space warning threshold value as a percentage of total space. If the amount of usable disk space drops below this amount, then the Directory Server will begin generating warning alert notifications. |  [optional] |
|**lowSpaceErrorSizeThreshold** | **String** | Specifies the low space error threshold value as an absolute amount of space. If the amount of usable disk space drops below this amount, then the Directory Server will start rejecting operations requested by non-root users. |  [optional] |
|**lowSpaceErrorPercentThreshold** | **Integer** | Specifies the low space error threshold value as a percentage of total space. If the amount of usable disk space drops below this amount, then the Directory Server will start rejecting operations requested by non-root users. |  [optional] |
|**outOfSpaceErrorSizeThreshold** | **String** | Specifies the out of space error threshold value as an absolute amount of space. If the amount of usable disk space drops below this amount, then the Directory Server will shut itself down to avoid problems that may occur from complete exhaustion of usable space. |  [optional] |
|**outOfSpaceErrorPercentThreshold** | **Integer** | Specifies the out of space error threshold value as a percentage of total space. If the amount of usable disk space drops below this amount, then the Directory Server will shut itself down to avoid problems that may occur from complete exhaustion of usable space. |  [optional] |
|**alertFrequency** | **String** | Specifies the length of time between administrative alerts generated in response to lack of usable disk space. Administrative alerts will be generated whenever the amount of usable space drops below any threshold, and they will also be generated at regular intervals as long as the amount of usable space remains below the threshold value. A value of zero indicates that alerts should only be generated when the amount of usable space drops below a configured threshold. |  |
|**enabled** | **Boolean** | Indicates whether the Monitor Provider is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




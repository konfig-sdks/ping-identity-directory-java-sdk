

# UploadToS3LogFileRotationListenerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Log File Rotation Listener |  |
|**description** | **String** | A description for this Log File Rotation Listener |  [optional] |
|**schemas** | **List&lt;EnumuploadToS3LogFileRotationListenerSchemaUrn&gt;** |  |  |
|**awsExternalServer** | **String** | The external server with information to use when interacting with the AWS S3 service. |  |
|**s3BucketName** | **String** | The name of the S3 bucket into which rotated log files should be copied. |  |
|**targetThroughputInMegabitsPerSecond** | **Integer** | The target throughput to attempt to achieve for data transfers to or from S3, in megabits per second. |  [optional] |
|**maximumConcurrentTransferConnections** | **Integer** | The maximum number of concurrent connections that may be used when transferring data to or from S3. |  [optional] |
|**maximumFileCountToRetain** | **Integer** | The maximum number of existing files matching the file retention pattern that should be retained in the S3 bucket after successfully uploading a newly rotated file. |  [optional] |
|**maximumFileAgeToRetain** | **String** | The maximum length of time to retain files matching the file retention pattern that should be retained in the S3 bucket after successfully uploading a newly rotated file. |  [optional] |
|**fileRetentionPattern** | **String** | A regular expression pattern that will be used to identify which files are candidates for automatic removal based on the maximum-file-count-to-retain and maximum-file-age-to-retain properties. By default, all files in the bucket will be eligible for removal by retention processing. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Log File Rotation Listener is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




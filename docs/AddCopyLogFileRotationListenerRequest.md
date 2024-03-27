

# AddCopyLogFileRotationListenerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**listenerName** | **String** | Name of the new Log File Rotation Listener |  |
|**description** | **String** | A description for this Log File Rotation Listener |  [optional] |
|**schemas** | **List&lt;EnumcopyLogFileRotationListenerSchemaUrn&gt;** |  |  |
|**copyToDirectory** | **String** | The path to the directory to which log files should be copied. It must be different from the directory to which the log file is originally written, and administrators should ensure that the filesystem has sufficient space to hold files as they are copied. |  |
|**compressOnCopy** | **Boolean** | Indicates whether the file should be gzip-compressed as it is copied into the destination directory. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Log File Rotation Listener is enabled for use. |  |






# SubtreeAccessibilityExtendedOperationHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Extended Operation Handler |  [optional] |
|**schemas** | **List&lt;EnumsubtreeAccessibilityExtendedOperationHandlerSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the Extended Operation Handler |  |
|**nonAccessibleSubtreeUnauthorizedBindResultCode** | **Integer** | The integer value for the result code that the server should return to clients that attempt to perform an unauthorized bind operation in a non-accessible subtree. |  [optional] |
|**nonAccessibleSubtreeUnauthorizedReadResultCode** | **Integer** | The integer value for the result code that the server should return to clients that attempt to perform an unauthorized read (e.g., search or compare) operation in a non-accessible subtree. |  [optional] |
|**nonAccessibleSubtreeUnauthorizedWriteResultCode** | **Integer** | The integer value for the result code that the server should return to clients that attempt to perform an unauthorized write (e.g., add, delete, modify or modify DN) operation in a non-accessible subtree. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Extended Operation Handler is enabled (that is, whether the types of extended operations are allowed in the server). |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




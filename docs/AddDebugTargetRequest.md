

# AddDebugTargetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targetName** | **String** | Name of the new Debug Target |  |
|**description** | **String** | A description for this Debug Target |  [optional] |
|**schemas** | **List&lt;EnumdebugTargetSchemaUrn&gt;** |  |  [optional] |
|**debugScope** | **String** | Specifies the fully-qualified Java package, class, or method affected by the settings in this target definition. Use the number character (#) to separate the class name and the method name (that is, com.unboundid.directory.server.core.DirectoryServer#startUp). |  |
|**debugLevel** | **EnumdebugTargetDebugLevelProp** |  |  |
|**debugCategory** | **List&lt;EnumdebugTargetDebugCategoryProp&gt;** |  |  [optional] |
|**omitMethodEntryArguments** | **Boolean** | Specifies the property to indicate whether to include method arguments in debug messages. |  [optional] |
|**omitMethodReturnValue** | **Boolean** | Specifies the property to indicate whether to include the return value in debug messages. |  [optional] |
|**includeThrowableCause** | **Boolean** | Specifies the property to indicate whether to include the cause of exceptions in exception thrown and caught messages. |  [optional] |
|**throwableStackFrames** | **Integer** | Specifies the property to indicate the number of stack frames to include in the stack trace for method entry and exception thrown messages. |  [optional] |




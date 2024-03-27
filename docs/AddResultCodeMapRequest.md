

# AddResultCodeMapRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mapName** | **String** | Name of the new Result Code Map |  |
|**description** | **String** | A description for this Result Code Map |  [optional] |
|**schemas** | **List&lt;EnumresultCodeMapSchemaUrn&gt;** |  |  [optional] |
|**bindAccountLockedResultCode** | **Integer** | Specifies the result code that should be returned if a bind attempt fails because the user&#39;s account is locked as a result of too many failed authentication attempts. |  [optional] |
|**bindMissingUserResultCode** | **Integer** | Specifies the result code that should be returned if a bind attempt fails because the target user entry does not exist in the server. |  [optional] |
|**bindMissingPasswordResultCode** | **Integer** | Specifies the result code that should be returned if a password-based bind attempt fails because the target user entry does not have a password. |  [optional] |
|**serverErrorResultCode** | **Integer** | Specifies the result code that should be returned if a generic error occurs within the server. |  [optional] |




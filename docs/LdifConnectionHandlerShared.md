

# LdifConnectionHandlerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Connection Handler |  [optional] |
|**schemas** | **List&lt;EnumldifConnectionHandlerSchemaUrn&gt;** |  |  |
|**allowedClient** | **List&lt;String&gt;** | Specifies a set of address masks that determines the addresses of the clients that are allowed to establish connections to this connection handler. |  [optional] |
|**deniedClient** | **List&lt;String&gt;** | Specifies a set of address masks that determines the addresses of the clients that are not allowed to establish connections to this connection handler. |  [optional] |
|**ldifDirectory** | **String** | Specifies the path to the directory in which the LDIF files should be placed. |  [optional] |
|**pollInterval** | **String** | Specifies how frequently the LDIF connection handler should check the LDIF directory to determine whether a new LDIF file has been added. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Connection Handler is enabled. |  |




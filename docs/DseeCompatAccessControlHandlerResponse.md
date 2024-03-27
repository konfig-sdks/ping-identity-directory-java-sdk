

# DseeCompatAccessControlHandlerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumdseeCompatAccessControlHandlerSchemaUrn&gt;** |  |  |
|**globalACI** | **List&lt;String&gt;** | Defines global access control rules. |  [optional] |
|**allowedBindControl** | **List&lt;EnumaccessControlHandlerAllowedBindControlProp&gt;** |  |  [optional] |
|**allowedBindControlOID** | **List&lt;String&gt;** | Specifies the OIDs of any additional controls (not covered by the allowed-bind-control property) that should be permitted in bind requests. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Access Control Handler is enabled. If set to FALSE, then no access control is enforced, and any client (including unauthenticated or anonymous clients) could be allowed to perform any operation if not subject to other restrictions, such as those enforced by the privilege subsystem. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




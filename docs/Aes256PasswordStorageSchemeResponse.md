

# Aes256PasswordStorageSchemeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Password Storage Scheme |  |
|**description** | **String** | A description for this Password Storage Scheme |  [optional] |
|**schemas** | **List&lt;Enumaes256PasswordStorageSchemeSchemaUrn&gt;** |  |  |
|**encryptionSettingsDefinitionID** | **String** | The identifier for the encryption settings definition that should be used to derive the encryption key to use when encrypting new passwords. If this is not provided, the server&#39;s preferred encryption settings definition will be used. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Password Storage Scheme is enabled for use. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




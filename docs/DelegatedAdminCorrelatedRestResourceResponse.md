

# DelegatedAdminCorrelatedRestResourceResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the Delegated Admin Correlated REST Resource |  |
|**schemas** | **List&lt;EnumdelegatedAdminCorrelatedRestResourceSchemaUrn&gt;** |  |  [optional] |
|**displayName** | **String** | A human readable display name for this Delegated Admin Correlated REST Resource. |  |
|**correlatedRESTResource** | **String** | The REST Resource Type that will be linked to this REST Resource Type. |  |
|**primaryRESTResourceCorrelationAttribute** | **String** | The LDAP attribute from the parent REST Resource Type whose value will be used to match objects in the Delegated Admin Correlated REST Resource. This attribute must be writeable when use-secondary-value-for-linking is enabled. |  |
|**secondaryRESTResourceCorrelationAttribute** | **String** | The LDAP attribute from the Delegated Admin Correlated REST Resource whose value will be matched with the primary-rest-resource-correlation-attribute. This attribute must be writeable when use-secondary-value-for-linking is disabled. |  |
|**useSecondaryValueForLinking** | **Boolean** | Indicates whether links should be created using the secondary correlation attribute value. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




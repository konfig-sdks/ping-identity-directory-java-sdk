

# RootDseBackendResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumrootDseBackendSchemaUrn&gt;** |  |  [optional] |
|**subordinateBaseDN** | **List&lt;String&gt;** | Specifies the set of base DNs used for singleLevel, wholeSubtree, and subordinateSubtree searches based at the root DSE. |  [optional] |
|**additionalSupportedControlOID** | **List&lt;String&gt;** | Specifies an additional OID that should appear in the list of supportedControl values in the server&#39;s root DSE. |  [optional] |
|**showAllAttributes** | **Boolean** | Indicates whether all attributes in the root DSE are to be treated like user attributes (and therefore returned to clients by default) regardless of the Directory Server schema configuration. |  |
|**useLegacyVendorVersion** | **Boolean** | Indicates whether the server&#39;s root DSE should reflect current or legacy values for the vendorName and vendorVersion attributes. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




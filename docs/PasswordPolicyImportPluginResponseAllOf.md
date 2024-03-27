

# PasswordPolicyImportPluginResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Plugin |  [optional] |
|**schemas** | **List&lt;EnumpasswordPolicyImportPluginSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Plugin |  [optional] |
|**invokeForInternalOperations** | **Boolean** | Indicates whether the plug-in should be invoked for internal operations. |  [optional] |
|**defaultUserPasswordStorageScheme** | **List&lt;String&gt;** | Specifies the names of the password storage schemes to be used for encoding passwords contained in attributes with the user password syntax for entries that do not include the ds-pwp-password-policy-dn attribute specifying which password policy is to be used to govern them. |  [optional] |
|**defaultAuthPasswordStorageScheme** | **List&lt;String&gt;** | Specifies the names of password storage schemes that to be used for encoding passwords contained in attributes with the auth password syntax for entries that do not include the ds-pwp-password-policy-dn attribute specifying which password policy should be used to govern them. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the plug-in is enabled for use. |  [optional] |




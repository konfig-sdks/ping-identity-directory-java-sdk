

# AddAppRoleVaultAuthenticationMethodRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**methodName** | **String** | Name of the new Vault Authentication Method |  |
|**description** | **String** | A description for this Vault Authentication Method |  [optional] |
|**schemas** | **List&lt;EnumappRoleVaultAuthenticationMethodSchemaUrn&gt;** |  |  |
|**vaultRoleID** | **String** | The role ID for the AppRole to authenticate. |  |
|**vaultSecretID** | **String** | The secret ID for the AppRole to authenticate. |  |
|**loginMechanismName** | **String** | The name used when enabling the desired AppRole authentication mechanism in the Vault server. |  [optional] |




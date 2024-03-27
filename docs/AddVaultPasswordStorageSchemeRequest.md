

# AddVaultPasswordStorageSchemeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemeName** | **String** | Name of the new Password Storage Scheme |  |
|**description** | **String** | A description for this Password Storage Scheme |  [optional] |
|**schemas** | **List&lt;EnumvaultPasswordStorageSchemeSchemaUrn&gt;** |  |  |
|**vaultExternalServer** | **String** | An external server definition with information needed to connect and authenticate to the Vault instance containing the passphrase. |  |
|**defaultField** | **String** | The default name of the field in JSON objects contained in the AWS Secrets Manager service that contains the password for the target user. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Password Storage Scheme is enabled for use. |  |




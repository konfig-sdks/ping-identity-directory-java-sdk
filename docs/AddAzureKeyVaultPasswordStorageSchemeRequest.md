

# AddAzureKeyVaultPasswordStorageSchemeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemeName** | **String** | Name of the new Password Storage Scheme |  |
|**description** | **String** | A description for this Password Storage Scheme |  [optional] |
|**schemas** | **List&lt;EnumazureKeyVaultPasswordStorageSchemeSchemaUrn&gt;** |  |  |
|**keyVaultURI** | **String** | The URI that identifies the Azure Key Vault from which the secret is to be retrieved. |  |
|**azureAuthenticationMethod** | **String** | The mechanism used to authenticate to the Azure service. |  |
|**httpProxyExternalServer** | **String** | A reference to an HTTP proxy server that should be used for requests sent to the Azure service. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Password Storage Scheme is enabled for use. |  |




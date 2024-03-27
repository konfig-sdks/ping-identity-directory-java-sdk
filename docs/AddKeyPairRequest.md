

# AddKeyPairRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pairName** | **String** | Name of the new Key Pair |  |
|**schemas** | **List&lt;EnumkeyPairSchemaUrn&gt;** |  |  [optional] |
|**keyAlgorithm** | **EnumkeyPairKeyAlgorithmProp** |  |  [optional] |
|**selfSignedCertificateValidity** | **String** | The validity period for a self-signed certificate. If not specified, the self-signed certificate will be valid for approximately 20 years. This is not used when importing an existing key-pair. The system will not automatically rotate expired certificates. It is up to the administrator to do that when that happens. |  [optional] |
|**subjectDN** | **String** | The DN that should be used as the subject for the self-signed certificate and certificate signing request. This is not used when importing an existing key-pair. |  [optional] |
|**certificateChain** | **String** | The PEM-encoded X.509 certificate chain. |  [optional] |
|**privateKey** | **String** | The base64-encoded private key that is encrypted using the preferred encryption settings definition. |  [optional] |






# MacSecretKeyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnummacSecretKeySchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the Mac Secret Key |  |
|**macAlgorithmName** | **String** | The algorithm name used to generate this MAC key, e.g. HmacMD5, HmacSHA1, HMacSHA256, etc. |  [optional] |
|**keyID** | **String** | The unique system-generated identifier for the Secret Key. |  |
|**isCompromised** | **Boolean** | If the key is compromised, an administrator may set this flag to immediately trigger the creation of a new secret key. After the new key is generated, the value of this property will be reset to false. |  [optional] |
|**symmetricKey** | **List&lt;String&gt;** | The symmetric key that is used for both encryption of plain text and decryption of cipher text. This stores the secret key for each server instance encrypted with that server&#39;s inter-server certificate. |  [optional] |
|**keyLengthBits** | **Integer** | The length of the key in bits. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




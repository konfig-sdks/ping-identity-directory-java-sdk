

# CryptoManagerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumcryptoManagerSchemaUrn&gt;** |  |  [optional] |
|**digestAlgorithm** | **String** | Specifies the preferred message digest algorithm for the Directory Server. |  [optional] |
|**macAlgorithm** | **String** | Specifies the preferred MAC algorithm for the Directory Server. |  [optional] |
|**macKeyLength** | **Integer** | Specifies the key length in bits for the preferred MAC algorithm. |  [optional] |
|**signingEncryptionSettingsID** | **String** | The ID of the encryption settings definition to use for generating digital signatures. If this is not specified, then the server&#39;s preferred encryption settings definition will be used. |  [optional] |
|**cipherTransformation** | **String** | Specifies the cipher for the Directory Server using the syntax algorithm/mode/padding. |  [optional] |
|**cipherKeyLength** | **Integer** | Specifies the key length in bits for the preferred cipher. |  [optional] |
|**keyWrappingTransformation** | **String** | The preferred key wrapping transformation for the Directory Server. This value must be the same for all server instances in a replication topology. |  [optional] |
|**sslProtocol** | **List&lt;String&gt;** | Specifies the names of TLS protocols that are allowed for use in secure communication. |  [optional] |
|**sslCipherSuite** | **List&lt;String&gt;** | Specifies the names of the TLS cipher suites that are allowed for use in secure communication. |  [optional] |
|**outboundSSLProtocol** | **List&lt;String&gt;** | Specifies the names of the TLS protocols that will be enabled for outbound connections initiated by the Directory Server. |  [optional] |
|**outboundSSLCipherSuite** | **List&lt;String&gt;** | Specifies the names of the TLS cipher suites that will be enabled for outbound connections initiated by the Directory Server. |  [optional] |
|**enableSha1CipherSuites** | **Boolean** | Indicates whether to enable support for TLS cipher suites that use the SHA-1 digest algorithm. The SHA-1 digest algorithm is no longer considered secure and is not recommended for use. |  [optional] |
|**enableRsaKeyExchangeCipherSuites** | **Boolean** | Indicates whether to enable support for TLS cipher suites that use the RSA key exchange algorithm. Cipher suites that rely on RSA key exchange are not recommended because they do not support forward secrecy, which means that if the private key is compromised, then any communication negotiated using that private key should also be considered compromised. |  [optional] |
|**sslCertNickname** | **String** | Specifies the nickname (also called the alias) of the certificate that the Crypto Manager should use when performing SSL communication. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




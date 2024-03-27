

# Pkcs11CipherStreamProviderShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Cipher Stream Provider |  [optional] |
|**schemas** | **List&lt;Enumpkcs11CipherStreamProviderSchemaUrn&gt;** |  |  |
|**pkcs11ProviderClass** | **String** | The fully-qualified name of the Java security provider class that implements support for interacting with PKCS #11 tokens. |  [optional] |
|**pkcs11ProviderConfigurationFile** | **String** | The path to the file to use to configure the security provider that implements support for interacting with PKCS #11 tokens. |  [optional] |
|**keyStorePin** | **String** | The clear-text user PIN needed to interact with the PKCS #11 token. |  [optional] |
|**keyStorePinFile** | **String** | The path to a file containing the user PIN needed to interact with the PKCS #11 token. The file must exist and must contain exactly one line with a clear-text representation of the PIN. |  [optional] |
|**keyStorePinEnvironmentVariable** | **String** | The name of an environment variable whose value is the user PIN needed to interact with the PKCS #11 token. The environment variable must be defined and must contain a clear-text representation of the PIN. |  [optional] |
|**pkcs11KeyStoreType** | **String** | The key store type to use when obtaining an instance of a key store for interacting with a PKCS #11 token. |  [optional] |
|**sslCertNickname** | **String** | The alias for the certificate in the PKCS #11 token that will be used to wrap the encryption key. The target certificate must exist in the PKCS #11 token, and it must have an RSA key pair because the JVM does not currently provide adequate key wrapping support for elliptic curve key pairs.  If you have also configured the server to use a PKCS #11 token for accessing listener certificates, we strongly recommend that you use a different certificate to protect the contents of the encryption settings database than you use for negotiating TLS sessions with clients. It is imperative that the certificate used by this PKCS11 Cipher Stream Provider remain constant for the life of the provider because if the certificate were to be replaced, then the contents of the encryption settings database could become inaccessible. Unlike with listener certificates used for TLS negotiation that need to be replaced on a regular basis, this PKCS11 Cipher Stream Provider does not consider the validity period for the associated certificate, and it will continue to function even after the certificate has expired.  If you need to rotate the certificate used to protect the server&#39;s encryption settings database, you should first install the desired new certificate in the PKCS #11 token under a different alias. Then, you should create a new instance of this PKCS11 Cipher Stream Provider that is configured to use that certificate, and that also uses a different value for the encryption-metadata-file because the information in that file is tied to the certificate used to generate it. Finally, you will need to update the global configuration so that the encryption-settings-cipher-stream-provider property references the new cipher stream provider rather than this one. The update to the global configuration must be done with the server online so that it can properly re-encrypt the contents of the encryption settings database with the correct key tied to the new certificate. |  |
|**encryptionMetadataFile** | **String** | The path to a file that will hold metadata about the encryption performed by this PKCS11 Cipher Stream Provider. |  [optional] |
|**iterationCount** | **Integer** | The PBKDF2 iteration count that will be used when deriving the encryption key used to protect the encryption settings database. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Cipher Stream Provider is enabled for use in the Directory Server. |  |




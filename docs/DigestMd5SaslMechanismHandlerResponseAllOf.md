

# DigestMd5SaslMechanismHandlerResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this SASL Mechanism Handler |  [optional] |
|**schemas** | **List&lt;EnumdigestMd5SaslMechanismHandlerSchemaUrn&gt;** |  |  [optional] |
|**id** | **String** | Name of the SASL Mechanism Handler |  [optional] |
|**realm** | **String** | Specifies the realm that is to be used by the server for DIGEST-MD5 authentication. |  [optional] |
|**identityMapper** | **String** | Specifies the name of the identity mapper that is to be used with this SASL mechanism handler to match the authentication or authorization ID included in the SASL bind request to the corresponding user in the directory. |  [optional] |
|**serverFqdn** | **String** | Specifies the DNS-resolvable fully-qualified domain name for the server that is used when validating the digest-uri parameter during the authentication process. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the SASL mechanism handler is enabled for use. |  [optional] |




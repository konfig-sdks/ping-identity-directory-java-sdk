

# ConsentServiceResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumconsentServiceSchemaUrn&gt;** |  |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Consent Service is enabled. |  [optional] |
|**baseDN** | **String** | The base DN under which consent records are stored. |  [optional] |
|**bindDN** | **String** | The DN of an internal service account used by the Consent Service to make internal LDAP requests. |  [optional] |
|**searchSizeLimit** | **Integer** | The maximum number of consent resources that may be returned from a search request. |  [optional] |
|**consentRecordIdentityMapper** | **List&lt;String&gt;** | If specified, the Identity Mapper(s) that may be used to map consent record subject and actor values to DNs. This is typically only needed if privileged API clients will be used. |  [optional] |
|**serviceAccountDN** | **List&lt;String&gt;** | The set of account DNs that the Consent Service will consider to be privileged. |  [optional] |
|**unprivilegedConsentScope** | **String** | The name of a scope that must be present in an access token accepted by the Consent Service for unprivileged clients. |  [optional] |
|**privilegedConsentScope** | **String** | The name of a scope that must be present in an access token accepted by the Consent Service if the client is to be considered privileged. |  [optional] |
|**audience** | **String** | A string or URI that identifies the Consent Service in the context of OAuth2 authorization. |  [optional] |




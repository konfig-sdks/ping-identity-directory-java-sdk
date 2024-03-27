

# AddReplaceCertificateExtendedOperationHandlerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**handlerName** | **String** | Name of the new Extended Operation Handler |  |
|**description** | **String** | A description for this Extended Operation Handler |  [optional] |
|**schemas** | **List&lt;EnumreplaceCertificateExtendedOperationHandlerSchemaUrn&gt;** |  |  |
|**allowRemotelyProvidedCertificates** | **Boolean** | Indicates whether clients should be allowed to directly provide a new listener or inter-server certificate chain in the extended request. |  [optional] |
|**allowedOperation** | **List&lt;EnumextendedOperationHandlerAllowedOperationProp&gt;** |  |  [optional] |
|**connectionCriteria** | **String** | A set of criteria that client connections must satisfy before they will be allowed to request the associated extended operations. |  [optional] |
|**requestCriteria** | **String** | A set of criteria that the extended requests must satisfy before they will be processed by the server. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Extended Operation Handler is enabled (that is, whether the types of extended operations are allowed in the server). |  |




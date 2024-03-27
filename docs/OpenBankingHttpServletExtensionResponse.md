

# OpenBankingHttpServletExtensionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnumopenBankingHttpServletExtensionSchemaUrn&gt;** |  |  |
|**id** | **String** | Name of the HTTP Servlet Extension |  |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP header that will contain a correlation ID value. This header will be used both in downstream requests to the Consent API and in responses to the Open Banking client. The value \&quot;x-fapi-interaction-id\&quot; is recommended. |  [optional] |
|**fapiFinancialID** | **String** | The unique financial id of the ASPSP associated with this Open Banking service. |  [optional] |
|**accessTokenValidator** | **List&lt;String&gt;** | If specified, the Access Token Validator(s) that may be used to validate access tokens for requests submitted to this Open Banking HTTP Servlet Extension. |  [optional] |
|**pathPrefix** | **String** | An optional ASPSP-specific path prefix to include in the base URI path. If specified with the value \&quot;myPrefix\&quot;, for example, the base path will be /myPrefix/open-banking/v1.1/. |  [optional] |
|**consentServer** | **String** | Specifies the PingDirectory instance that is hosting the Consent API for storage and retrieval of Account Requests. |  [optional] |
|**consentDefinitionID** | **String** | The name/id of the consent definition, as defined in the consent-server, that is used for storing Account Requests. |  |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




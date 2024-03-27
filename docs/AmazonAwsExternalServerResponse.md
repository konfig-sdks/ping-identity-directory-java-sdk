

# AmazonAwsExternalServerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Name of the External Server |  |
|**description** | **String** | A description for this External Server |  [optional] |
|**schemas** | **List&lt;EnumamazonAwsExternalServerSchemaUrn&gt;** |  |  |
|**httpProxyExternalServer** | **String** | A reference to an HTTP proxy server that should be used for requests sent to the AWS service. |  [optional] |
|**authenticationMethod** | **EnumexternalServerAmazonAwsAuthenticationMethodProp** |  |  [optional] |
|**awsAccessKeyID** | **String** | The access key ID that will be used if authentication should use an access key. If this is provided, then an aws-secret-access-key must also be provided. |  [optional] |
|**awsSecretAccessKey** | **String** | The secret access key that will be used if authentication should use an access key. If this is provided, then an aws-access-key-id must also be provided. |  [optional] |
|**awsRegionName** | **String** | The name of the AWS region containing the resources that will be accessed. |  |
|**meta** | [**MetaMeta**](MetaMeta.md) |  |  [optional] |
|**urnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20** | [**MetaUrnPingidentitySchemasConfigurationMessages20**](MetaUrnPingidentitySchemasConfigurationMessages20.md) |  |  [optional] |




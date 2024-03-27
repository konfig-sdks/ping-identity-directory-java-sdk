

# AddThirdPartyCertificateMapperRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mapperName** | **String** | Name of the new Certificate Mapper |  |
|**description** | **String** | A description for this Certificate Mapper |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyCertificateMapperSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party Certificate Mapper. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party Certificate Mapper. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the Certificate Mapper is enabled. |  |




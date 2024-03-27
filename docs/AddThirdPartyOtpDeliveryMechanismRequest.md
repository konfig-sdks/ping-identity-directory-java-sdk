

# AddThirdPartyOtpDeliveryMechanismRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mechanismName** | **String** | Name of the new OTP Delivery Mechanism |  |
|**description** | **String** | A description for this OTP Delivery Mechanism |  [optional] |
|**schemas** | **List&lt;EnumthirdPartyOtpDeliveryMechanismSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party OTP Delivery Mechanism. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party OTP Delivery Mechanism. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this OTP Delivery Mechanism is enabled for use in the server. |  |




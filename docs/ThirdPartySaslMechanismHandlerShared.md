

# ThirdPartySaslMechanismHandlerShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this SASL Mechanism Handler |  [optional] |
|**schemas** | **List&lt;EnumthirdPartySaslMechanismHandlerSchemaUrn&gt;** |  |  |
|**extensionClass** | **String** | The fully-qualified name of the Java class providing the logic for the Third Party SASL Mechanism Handler. |  |
|**extensionArgument** | **List&lt;String&gt;** | The set of arguments used to customize the behavior for the Third Party SASL Mechanism Handler. Each configuration property should be given in the form &#39;name&#x3D;value&#39;. |  [optional] |
|**identityMapper** | **String** | The identity mapper that may be used to map usernames to user entries. If the custom SASL mechanism involves a username or some other form of authentication and/or authorization identity, then this may be used to map that ID to an entry for that user. |  [optional] |
|**enabled** | **Boolean** | Indicates whether the SASL mechanism handler is enabled for use. |  |




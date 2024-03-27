

# TextAccessLogFieldBehaviorShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Log Field Behavior |  [optional] |
|**schemas** | **List&lt;EnumtextAccessLogFieldBehaviorSchemaUrn&gt;** |  |  |
|**preserveField** | **List&lt;EnumlogFieldBehaviorTextAccessPreserveFieldProp&gt;** |  |  [optional] |
|**preserveFieldName** | **List&lt;String&gt;** | The names of any custom fields whose values should be preserved. This should generally only be used for fields that are not available through the preserve-field property (for example, custom log fields defined in Server SDK extensions). |  [optional] |
|**omitField** | **List&lt;EnumlogFieldBehaviorTextAccessOmitFieldProp&gt;** |  |  [optional] |
|**omitFieldName** | **List&lt;String&gt;** | The names of any custom fields that should be omitted from log messages. This should generally only be used for fields that are not available through the omit-field property (for example, custom log fields defined in Server SDK extensions). |  [optional] |
|**redactEntireValueField** | **List&lt;EnumlogFieldBehaviorTextAccessRedactEntireValueFieldProp&gt;** |  |  [optional] |
|**redactEntireValueFieldName** | **List&lt;String&gt;** | The names of any custom fields whose values should be completely redacted. This should generally only be used for fields that are not available through the redact-entire-value-field property (for example, custom log fields defined in Server SDK extensions). |  [optional] |
|**redactValueComponentsField** | **List&lt;EnumlogFieldBehaviorTextAccessRedactValueComponentsFieldProp&gt;** |  |  [optional] |
|**redactValueComponentsFieldName** | **List&lt;String&gt;** | The names of any custom fields for which to redact components within the value. This should generally only be used for fields that are not available through the redact-value-components-field property (for example, custom log fields defined in Server SDK extensions). |  [optional] |
|**tokenizeEntireValueField** | **List&lt;EnumlogFieldBehaviorTextAccessTokenizeEntireValueFieldProp&gt;** |  |  [optional] |
|**tokenizeEntireValueFieldName** | **List&lt;String&gt;** | The names of any custom fields whose values should be completely tokenized. This should generally only be used for fields that are not available through the tokenize-entire-value-field property (for example, custom log fields defined in Server SDK extensions). |  [optional] |
|**tokenizeValueComponentsField** | **List&lt;EnumlogFieldBehaviorTextAccessTokenizeValueComponentsFieldProp&gt;** |  |  [optional] |
|**tokenizeValueComponentsFieldName** | **List&lt;String&gt;** | The names of any custom fields for which to tokenize components within the value. This should generally only be used for fields that are not available through the tokenize-value-components-field property (for example, custom log fields defined in Server SDK extensions). |  [optional] |
|**defaultBehavior** | **EnumlogFieldBehaviorDefaultBehaviorProp** |  |  [optional] |




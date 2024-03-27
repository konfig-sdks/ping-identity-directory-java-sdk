

# JsonFieldConstraintsShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this JSON Field Constraints |  [optional] |
|**schemas** | **List&lt;EnumjsonFieldConstraintsSchemaUrn&gt;** |  |  [optional] |
|**jsonField** | **String** | The full name of the JSON field to which these constraints apply. |  |
|**valueType** | **EnumjsonFieldConstraintsValueTypeProp** |  |  |
|**isRequired** | **Boolean** | Indicates whether the target field must be present in JSON objects stored as values of the associated attribute type. |  [optional] |
|**isArray** | **EnumjsonFieldConstraintsIsArrayProp** |  |  [optional] |
|**allowNullValue** | **Boolean** | Indicates whether the target field may have a value that is the JSON null value as an alternative to a value (or array of values) of the specified value-type. |  [optional] |
|**allowEmptyObject** | **Boolean** | Indicates whether the target field may have a value that is an empty JSON object (i.e., a JSON object with zero fields). This may only be set to true if value-type property is set to object. |  [optional] |
|**indexValues** | **Boolean** | Indicates whether backends that support JSON indexing should maintain an index for values of the target field. |  [optional] |
|**indexEntryLimit** | **Integer** | The maximum number of entries that may contain a particular value for the target field before the server will stop maintaining the index for that value. |  [optional] |
|**primeIndex** | **Boolean** | Indicates whether backends that support database priming should load the contents of the associated JSON index into memory whenever the backend is opened. |  [optional] |
|**cacheMode** | **EnumjsonFieldConstraintsCacheModeProp** |  |  [optional] |
|**tokenizeValues** | **Boolean** | Indicates whether the backend should attempt to assign a compact token for each distinct value for the target field in an attempt to reduce the encoded size of the field in JSON objects. These tokens would be assigned prior to using any from the token set used for automatic compaction of some JSON string values. |  [optional] |
|**allowedValue** | **List&lt;String&gt;** | Specifies an explicit set of string values that will be the only values permitted for the target field. If a set of allowed values is defined, then the server will reject any attempt to store a JSON object with a value for the target field that is not included in that set. |  [optional] |
|**allowedValueRegularExpression** | **List&lt;String&gt;** | Specifies an explicit set of regular expressions that may be used to restrict the set of values that may be used for the target field. If a set of allowed value regular expressions is defined, then the server will reject any attempt to store a JSON object with a value for the target field that does not match at least one of those regular expressions. |  [optional] |
|**minimumNumericValue** | **String** | Specifies the smallest numeric value that may be used as the value for the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is less than that minimum numeric value. |  [optional] |
|**maximumNumericValue** | **String** | Specifies the largest numeric value that may be used as the value for the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is greater than that maximum numeric value. |  [optional] |
|**minimumValueLength** | **Integer** | Specifies the smallest number of characters that may be present in string values of the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is shorter than that minimum value length. |  [optional] |
|**maximumValueLength** | **Integer** | Specifies the largest number of characters that may be present in string values of the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is longer than that maximum value length. |  [optional] |
|**minimumValueCount** | **Integer** | Specifies the smallest number of elements that may be present in an array of values for the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is an array with fewer than this number of elements. |  [optional] |
|**maximumValueCount** | **Integer** | Specifies the largest number of elements that may be present in an array of values for the target field. If configured, then the server will reject any attempt to store a JSON object with a value for the target field that is an array with more than this number of elements. |  [optional] |




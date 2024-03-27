

# CustomLoggedStatsShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Custom Logged Stats |  [optional] |
|**schemas** | **List&lt;EnumcustomLoggedStatsSchemaUrn&gt;** |  |  |
|**enabled** | **Boolean** | Indicates whether the Custom Logged Stats object is enabled. |  [optional] |
|**monitorObjectclass** | **String** | The objectclass name of the monitor entries to examine for generating these statistics. |  |
|**includeFilter** | **String** | An optional LDAP filter that can be used restrict which monitor entries are used to produce the output. |  [optional] |
|**attributeToLog** | **List&lt;String&gt;** | Specifies the attributes on the monitor entries that should be included in the output. |  |
|**columnName** | **List&lt;String&gt;** | Optionally, specifies an explicit name for each column header instead of having these names automatically generated from the monitored attribute name. |  [optional] |
|**statisticType** | **List&lt;EnumcustomLoggedStatsStatisticTypeProp&gt;** |  |  |
|**headerPrefix** | **String** | An optional prefix that is included in the header before the column name. |  [optional] |
|**headerPrefixAttribute** | **String** | An optional attribute from the monitor entry that is included as a prefix before the column name in the column header. |  [optional] |
|**regexPattern** | **String** | An optional regular expression pattern, that when used in conjunction with regex-replacement, can alter the value of the attribute being monitored. |  [optional] |
|**regexReplacement** | **String** | An optional regular expression replacement value, that when used in conjunction with regex-pattern, can alter the value of the attribute being monitored. |  [optional] |
|**divideValueBy** | **String** | An optional floating point value that can be used to scale the resulting value. |  [optional] |
|**divideValueByAttribute** | **String** | An optional property that can scale the resulting value by another attribute in the monitored entry. |  [optional] |
|**decimalFormat** | **String** | This provides a way to format the monitored attribute value in the output to control the precision for instance. |  [optional] |
|**nonZeroImpliesNotIdle** | **Boolean** | If this property is set to true, then the value of any of the monitored attributes here can contribute to whether an interval is considered \&quot;idle\&quot; by the Periodic Stats Logger. |  [optional] |




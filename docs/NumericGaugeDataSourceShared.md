

# NumericGaugeDataSourceShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Gauge Data Source |  [optional] |
|**schemas** | **List&lt;EnumnumericGaugeDataSourceSchemaUrn&gt;** |  |  |
|**dataOrientation** | **EnumgaugeDataSourceDataOrientationProp** |  |  [optional] |
|**statisticType** | **EnumgaugeDataSourceStatisticTypeProp** |  |  [optional] |
|**divideValueBy** | **Double** | An optional floating point value that can be used to scale the resulting value. |  [optional] |
|**divideValueByAttribute** | **String** | An optional property that can scale the resulting value by another attribute in the monitored entry. |  [optional] |
|**divideValueByCounterAttribute** | **String** | An optional property that can scale the resulting value by another attribute whose value represents a counter in the monitored entry. |  [optional] |
|**additionalText** | **String** | Additional information about the source of this data that is added to alerts sent as a result of gauges that use this Gauge Data Source. |  [optional] |
|**monitorObjectclass** | **String** | The object class name of the monitor entries to examine for generating gauge data. |  |
|**monitorAttribute** | **String** | Specifies the attribute on the monitor entries from which to derive the current gauge value. |  |
|**includeFilter** | **String** | An optional LDAP filter that can be used restrict which monitor entries are used to compute output. |  [optional] |
|**resourceAttribute** | **String** | Specifies the attribute whose value is used to identify the specific resource being monitored (e.g. device name). |  [optional] |
|**resourceType** | **String** | A string indicating the type of resource being monitored. |  [optional] |
|**minimumUpdateInterval** | **String** | The minimum frequency with which gauges using this Gauge Data Source can be configured for update. In order to prevent undesirable side effects, some Gauge Data Sources may use this property to impose a higher bound on the update frequency of gauges. |  [optional] |




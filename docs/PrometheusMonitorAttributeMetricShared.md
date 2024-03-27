

# PrometheusMonitorAttributeMetricShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemas** | **List&lt;EnumprometheusMonitorAttributeMetricSchemaUrn&gt;** |  |  [optional] |
|**metricName** | **String** | The name that will be used in the metric to be consumed by Prometheus. |  |
|**monitorAttributeName** | **String** | The name of the monitor attribute that contains the numeric value to be published. |  |
|**monitorObjectClassName** | **String** | The name of the object class for monitor entries that contain the monitor attribute. |  |
|**metricType** | **EnumprometheusMonitorAttributeMetricMetricTypeProp** |  |  |
|**filter** | **String** | A filter that may be used to restrict the set of monitor entries for which the metric should be generated. |  [optional] |
|**metricDescription** | **String** | A human-readable description that should be published as part of the metric definition. |  [optional] |
|**labelNameValuePair** | **List&lt;String&gt;** | A set of name-value pairs for labels that should be included in the published metric for the target attribute. |  [optional] |




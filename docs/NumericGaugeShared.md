

# NumericGaugeShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Gauge |  [optional] |
|**schemas** | **List&lt;EnumnumericGaugeSchemaUrn&gt;** |  |  |
|**gaugeDataSource** | **String** | Specifies the source of data to use in determining this gauge&#39;s current severity. |  |
|**criticalValue** | **Double** | A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should be &#39;critical&#39;. |  [optional] |
|**criticalExitValue** | **Double** | A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should no longer be &#39;critical&#39;. |  [optional] |
|**majorValue** | **Double** | A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should be &#39;major&#39;. |  [optional] |
|**majorExitValue** | **Double** | A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should no longer be &#39;major&#39;. |  [optional] |
|**minorValue** | **Double** | A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should be &#39;minor&#39;. |  [optional] |
|**minorExitValue** | **Double** | A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should no longer be &#39;minor&#39;. |  [optional] |
|**warningValue** | **Double** | A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should be &#39;warning&#39;. |  [optional] |
|**warningExitValue** | **Double** | A value that is used to determine whether the current monitored value indicates this gauge&#39;s severity should no longer be &#39;warning&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Gauge is enabled. |  [optional] |
|**overrideSeverity** | **EnumgaugeOverrideSeverityProp** |  |  [optional] |
|**alertLevel** | **EnumgaugeAlertLevelProp** |  |  [optional] |
|**updateInterval** | **String** | The frequency with which this Gauge is updated. |  [optional] |
|**samplesPerUpdateInterval** | **Integer** | Indicates the number of times the monitor data source value will be collected during the update interval. |  [optional] |
|**includeResource** | **List&lt;String&gt;** | Specifies set of resources to be monitored. |  [optional] |
|**excludeResource** | **List&lt;String&gt;** | Specifies resources to exclude from being monitored. |  [optional] |
|**serverUnavailableSeverityLevel** | **EnumgaugeServerUnavailableSeverityLevelProp** |  |  [optional] |
|**serverDegradedSeverityLevel** | **EnumgaugeServerDegradedSeverityLevelProp** |  |  [optional] |




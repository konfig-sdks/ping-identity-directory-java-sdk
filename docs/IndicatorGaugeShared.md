

# IndicatorGaugeShared


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for this Gauge |  [optional] |
|**schemas** | **List&lt;EnumindicatorGaugeSchemaUrn&gt;** |  |  |
|**gaugeDataSource** | **String** | Specifies the source of data to use in determining this Indicator Gauge&#39;s severity and status. |  |
|**criticalValue** | **String** | A regular expression pattern that is used to determine whether the current monitored value indicates this gauge&#39;s severity should be critical. |  [optional] |
|**majorValue** | **String** | A regular expression pattern that is used to determine whether the current monitored value indicates this gauge&#39;s severity will be &#39;major&#39;. |  [optional] |
|**minorValue** | **String** | A regular expression pattern that is used to determine whether the current monitored value indicates this gauge&#39;s severity will be &#39;minor&#39;. |  [optional] |
|**warningValue** | **String** | A regular expression pattern that is used to determine whether the current monitored value indicates this gauge&#39;s severity will be &#39;warning&#39;. |  [optional] |
|**enabled** | **Boolean** | Indicates whether this Gauge is enabled. |  [optional] |
|**overrideSeverity** | **EnumgaugeOverrideSeverityProp** |  |  [optional] |
|**alertLevel** | **EnumgaugeAlertLevelProp** |  |  [optional] |
|**updateInterval** | **String** | The frequency with which this Gauge is updated. |  [optional] |
|**samplesPerUpdateInterval** | **Integer** | Indicates the number of times the monitor data source value will be collected during the update interval. |  [optional] |
|**includeResource** | **List&lt;String&gt;** | Specifies set of resources to be monitored. |  [optional] |
|**excludeResource** | **List&lt;String&gt;** | Specifies resources to exclude from being monitored. |  [optional] |
|**serverUnavailableSeverityLevel** | **EnumgaugeServerUnavailableSeverityLevelProp** |  |  [optional] |
|**serverDegradedSeverityLevel** | **EnumgaugeServerDegradedSeverityLevelProp** |  |  [optional] |




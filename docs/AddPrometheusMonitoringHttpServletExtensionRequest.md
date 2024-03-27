

# AddPrometheusMonitoringHttpServletExtensionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extensionName** | **String** | Name of the new HTTP Servlet Extension |  |
|**description** | **String** | A description for this HTTP Servlet Extension |  [optional] |
|**schemas** | **List&lt;EnumprometheusMonitoringHttpServletExtensionSchemaUrn&gt;** |  |  |
|**baseContextPath** | **String** | Specifies the base context path that HTTP clients should use to access this servlet. The value must start with a forward slash and must represent a valid HTTP context path. |  [optional] |
|**includeInstanceNameLabel** | **Boolean** | Indicates whether generated metrics should include an \&quot;instance\&quot; label whose value is the instance name for this Directory Server instance. |  [optional] |
|**includeProductNameLabel** | **Boolean** | Indicates whether generated metrics should include a \&quot;product\&quot; label whose value is the product name for this Directory Server instance. |  [optional] |
|**includeLocationNameLabel** | **Boolean** | Indicates whether generated metrics should include a \&quot;location\&quot; label whose value is the location name for this Directory Server instance. |  [optional] |
|**alwaysIncludeMonitorEntryNameLabel** | **Boolean** | Indicates whether generated metrics should always include a \&quot;monitor_entry\&quot; label whose value is the name of the monitor entry from which the metric was obtained. |  [optional] |
|**includeMonitorObjectClassNameLabel** | **Boolean** | Indicates whether generated metrics should include a \&quot;monitor_object_class\&quot; label whose value is the name of the object class for the monitor entry from which the metric was obtained. |  [optional] |
|**includeMonitorAttributeNameLabel** | **Boolean** | Indicates whether generated metrics should include a \&quot;monitor_attribute\&quot; label whose value is the name of the monitor attribute from which the metric was obtained. |  [optional] |
|**labelNameValuePair** | **List&lt;String&gt;** | A set of name-value pairs for labels that should be included in all metrics exposed by this Directory Server instance. |  [optional] |
|**crossOriginPolicy** | **String** | The cross-origin request policy to use for the HTTP Servlet Extension. |  [optional] |
|**responseHeader** | **List&lt;String&gt;** | Specifies HTTP header fields and values added to response headers for all requests. |  [optional] |
|**correlationIDResponseHeader** | **String** | Specifies the name of the HTTP response header that will contain a correlation ID value. Example values are \&quot;Correlation-Id\&quot;, \&quot;X-Amzn-Trace-Id\&quot;, and \&quot;X-Request-Id\&quot;. |  [optional] |




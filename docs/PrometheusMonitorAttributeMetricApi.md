# PrometheusMonitorAttributeMetricApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewMetricToConfig**](PrometheusMonitorAttributeMetricApi.md#addNewMetricToConfig) | **POST** /http-servlet-extensions/{http-servlet-extension-name}/prometheus-monitor-attribute-metrics | Add a new Prometheus Monitor Attribute Metric to the config |
| [**deleteMetric**](PrometheusMonitorAttributeMetricApi.md#deleteMetric) | **DELETE** /http-servlet-extensions/{http-servlet-extension-name}/prometheus-monitor-attribute-metrics/{prometheus-monitor-attribute-metric-name} | Delete a Prometheus Monitor Attribute Metric |
| [**getSingleMetric**](PrometheusMonitorAttributeMetricApi.md#getSingleMetric) | **GET** /http-servlet-extensions/{http-servlet-extension-name}/prometheus-monitor-attribute-metrics/{prometheus-monitor-attribute-metric-name} | Returns a single Prometheus Monitor Attribute Metric |
| [**listAllObjects**](PrometheusMonitorAttributeMetricApi.md#listAllObjects) | **GET** /http-servlet-extensions/{http-servlet-extension-name}/prometheus-monitor-attribute-metrics | Returns a list of all Prometheus Monitor Attribute Metric objects |
| [**updateByname**](PrometheusMonitorAttributeMetricApi.md#updateByname) | **PATCH** /http-servlet-extensions/{http-servlet-extension-name}/prometheus-monitor-attribute-metrics/{prometheus-monitor-attribute-metric-name} | Update an existing Prometheus Monitor Attribute Metric by name |


<a name="addNewMetricToConfig"></a>
# **addNewMetricToConfig**
> PrometheusMonitorAttributeMetricResponse addNewMetricToConfig(httpServletExtensionName, addPrometheusMonitorAttributeMetricRequest).execute();

Add a new Prometheus Monitor Attribute Metric to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PrometheusMonitorAttributeMetricApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String metricName = "metricName_example"; // The name that will be used in the metric to be consumed by Prometheus.
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    List<EnumprometheusMonitorAttributeMetricSchemaUrn> schemas = Arrays.asList();
    String monitorAttributeName = "monitorAttributeName_example"; // The name of the monitor attribute that contains the numeric value to be published.
    String monitorObjectClassName = "monitorObjectClassName_example"; // The name of the object class for monitor entries that contain the monitor attribute.
    EnumprometheusMonitorAttributeMetricMetricTypeProp metricType = EnumprometheusMonitorAttributeMetricMetricTypeProp.fromValue("counter");
    String filter = "filter_example"; // A filter that may be used to restrict the set of monitor entries for which the metric should be generated.
    String metricDescription = "metricDescription_example"; // A human-readable description that should be published as part of the metric definition.
    List<String> labelNameValuePair = Arrays.asList(); // A set of name-value pairs for labels that should be included in the published metric for the target attribute.
    try {
      PrometheusMonitorAttributeMetricResponse result = client
              .prometheusMonitorAttributeMetric
              .addNewMetricToConfig(metricName, httpServletExtensionName)
              .schemas(schemas)
              .monitorAttributeName(monitorAttributeName)
              .monitorObjectClassName(monitorObjectClassName)
              .metricType(metricType)
              .filter(filter)
              .metricDescription(metricDescription)
              .labelNameValuePair(labelNameValuePair)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getMetricName());
      System.out.println(result.getMonitorAttributeName());
      System.out.println(result.getMonitorObjectClassName());
      System.out.println(result.getMetricType());
      System.out.println(result.getFilter());
      System.out.println(result.getMetricDescription());
      System.out.println(result.getLabelNameValuePair());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrometheusMonitorAttributeMetricApi#addNewMetricToConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PrometheusMonitorAttributeMetricResponse> response = client
              .prometheusMonitorAttributeMetric
              .addNewMetricToConfig(metricName, httpServletExtensionName)
              .schemas(schemas)
              .monitorAttributeName(monitorAttributeName)
              .monitorObjectClassName(monitorObjectClassName)
              .metricType(metricType)
              .filter(filter)
              .metricDescription(metricDescription)
              .labelNameValuePair(labelNameValuePair)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrometheusMonitorAttributeMetricApi#addNewMetricToConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |
| **addPrometheusMonitorAttributeMetricRequest** | [**AddPrometheusMonitorAttributeMetricRequest**](AddPrometheusMonitorAttributeMetricRequest.md)| Create a new Prometheus Monitor Attribute Metric in the config | |

### Return type

[**PrometheusMonitorAttributeMetricResponse**](PrometheusMonitorAttributeMetricResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **409** | The Prometheus Monitor Attribute Metric already exists |  -  |

<a name="deleteMetric"></a>
# **deleteMetric**
> deleteMetric(prometheusMonitorAttributeMetricName, httpServletExtensionName).execute();

Delete a Prometheus Monitor Attribute Metric

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PrometheusMonitorAttributeMetricApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String prometheusMonitorAttributeMetricName = "prometheusMonitorAttributeMetricName_example"; // Name of the Prometheus Monitor Attribute Metric
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    try {
      client
              .prometheusMonitorAttributeMetric
              .deleteMetric(prometheusMonitorAttributeMetricName, httpServletExtensionName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PrometheusMonitorAttributeMetricApi#deleteMetric");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .prometheusMonitorAttributeMetric
              .deleteMetric(prometheusMonitorAttributeMetricName, httpServletExtensionName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PrometheusMonitorAttributeMetricApi#deleteMetric");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prometheusMonitorAttributeMetricName** | **String**| Name of the Prometheus Monitor Attribute Metric | |
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **404** | The Prometheus Monitor Attribute Metric does not exist |  -  |
| **409** | The Prometheus Monitor Attribute Metric cannot be deleted |  -  |

<a name="getSingleMetric"></a>
# **getSingleMetric**
> PrometheusMonitorAttributeMetricResponse getSingleMetric(prometheusMonitorAttributeMetricName, httpServletExtensionName).execute();

Returns a single Prometheus Monitor Attribute Metric

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PrometheusMonitorAttributeMetricApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String prometheusMonitorAttributeMetricName = "prometheusMonitorAttributeMetricName_example"; // Name of the Prometheus Monitor Attribute Metric
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    try {
      PrometheusMonitorAttributeMetricResponse result = client
              .prometheusMonitorAttributeMetric
              .getSingleMetric(prometheusMonitorAttributeMetricName, httpServletExtensionName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getMetricName());
      System.out.println(result.getMonitorAttributeName());
      System.out.println(result.getMonitorObjectClassName());
      System.out.println(result.getMetricType());
      System.out.println(result.getFilter());
      System.out.println(result.getMetricDescription());
      System.out.println(result.getLabelNameValuePair());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrometheusMonitorAttributeMetricApi#getSingleMetric");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PrometheusMonitorAttributeMetricResponse> response = client
              .prometheusMonitorAttributeMetric
              .getSingleMetric(prometheusMonitorAttributeMetricName, httpServletExtensionName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrometheusMonitorAttributeMetricApi#getSingleMetric");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prometheusMonitorAttributeMetricName** | **String**| Name of the Prometheus Monitor Attribute Metric | |
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |

### Return type

[**PrometheusMonitorAttributeMetricResponse**](PrometheusMonitorAttributeMetricResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **404** | The Prometheus Monitor Attribute Metric does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> PrometheusMonitorAttributeMetricListResponse listAllObjects(httpServletExtensionName).filter(filter).execute();

Returns a list of all Prometheus Monitor Attribute Metric objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PrometheusMonitorAttributeMetricApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    String filter = "filter_example"; // SCIM filter
    try {
      PrometheusMonitorAttributeMetricListResponse result = client
              .prometheusMonitorAttributeMetric
              .listAllObjects(httpServletExtensionName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrometheusMonitorAttributeMetricApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PrometheusMonitorAttributeMetricListResponse> response = client
              .prometheusMonitorAttributeMetric
              .listAllObjects(httpServletExtensionName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrometheusMonitorAttributeMetricApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**PrometheusMonitorAttributeMetricListResponse**](PrometheusMonitorAttributeMetricListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |

<a name="updateByname"></a>
# **updateByname**
> PrometheusMonitorAttributeMetricResponse updateByname(prometheusMonitorAttributeMetricName, httpServletExtensionName, updateRequest).execute();

Update an existing Prometheus Monitor Attribute Metric by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PrometheusMonitorAttributeMetricApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://localhost";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    PingIdentityDirectory client = new PingIdentityDirectory(configuration);
    List<Operation> operations = Arrays.asList();
    String prometheusMonitorAttributeMetricName = "prometheusMonitorAttributeMetricName_example"; // Name of the Prometheus Monitor Attribute Metric
    String httpServletExtensionName = "httpServletExtensionName_example"; // Name of the HTTP Servlet Extension
    try {
      PrometheusMonitorAttributeMetricResponse result = client
              .prometheusMonitorAttributeMetric
              .updateByname(operations, prometheusMonitorAttributeMetricName, httpServletExtensionName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getMetricName());
      System.out.println(result.getMonitorAttributeName());
      System.out.println(result.getMonitorObjectClassName());
      System.out.println(result.getMetricType());
      System.out.println(result.getFilter());
      System.out.println(result.getMetricDescription());
      System.out.println(result.getLabelNameValuePair());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrometheusMonitorAttributeMetricApi#updateByname");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PrometheusMonitorAttributeMetricResponse> response = client
              .prometheusMonitorAttributeMetric
              .updateByname(operations, prometheusMonitorAttributeMetricName, httpServletExtensionName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PrometheusMonitorAttributeMetricApi#updateByname");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prometheusMonitorAttributeMetricName** | **String**| Name of the Prometheus Monitor Attribute Metric | |
| **httpServletExtensionName** | **String**| Name of the HTTP Servlet Extension | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Prometheus Monitor Attribute Metric | |

### Return type

[**PrometheusMonitorAttributeMetricResponse**](PrometheusMonitorAttributeMetricResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid request |  -  |
| **401** | Requestor cannot be authenticated |  -  |
| **403** | Requestor does not have the required privileges |  -  |
| **404** | The Prometheus Monitor Attribute Metric does not exist |  -  |


# MonitoringEndpointApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewConfig**](MonitoringEndpointApi.md#addNewConfig) | **POST** /monitoring-endpoints | Add a new Monitoring Endpoint to the config |
| [**deleteMonitoringEndpoint**](MonitoringEndpointApi.md#deleteMonitoringEndpoint) | **DELETE** /monitoring-endpoints/{monitoring-endpoint-name} | Delete a Monitoring Endpoint |
| [**getSingleEndpoint**](MonitoringEndpointApi.md#getSingleEndpoint) | **GET** /monitoring-endpoints/{monitoring-endpoint-name} | Returns a single Monitoring Endpoint |
| [**listAllObjects**](MonitoringEndpointApi.md#listAllObjects) | **GET** /monitoring-endpoints | Returns a list of all Monitoring Endpoint objects |
| [**updateByName**](MonitoringEndpointApi.md#updateByName) | **PATCH** /monitoring-endpoints/{monitoring-endpoint-name} | Update an existing Monitoring Endpoint by name |


<a name="addNewConfig"></a>
# **addNewConfig**
> StatsdMonitoringEndpointResponse addNewConfig(addStatsdMonitoringEndpointRequest).execute();

Add a new Monitoring Endpoint to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MonitoringEndpointApi;
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
    String endpointName = "endpointName_example"; // Name of the new Monitoring Endpoint
    List<EnumstatsdMonitoringEndpointSchemaUrn> schemas = Arrays.asList();
    String hostname = "hostname_example"; // The name of the host where this StatsD Monitoring Endpoint should send metric data.
    Integer serverPort = 56; // Specifies the port number of the endpoint where metric data should be sent.
    EnummonitoringEndpointConnectionTypeProp connectionType = EnummonitoringEndpointConnectionTypeProp.fromValue("unencrypted-udp");
    String trustManagerProvider = "trustManagerProvider_example"; // The trust manager provider to use if SSL over TCP is to be used for connection-level security.
    List<String> additionalTags = Arrays.asList(); // Specifies any optional additional tags to include in StatsD messages. Any additional tags will be appended to the end of each StatsD message, separated by commas. Tags should be written in a [key]:[value] format (\\\"host:server1\\\", for example).
    Boolean enabled = true; // Indicates whether this Monitoring Endpoint is enabled for use in the Directory Server.
    try {
      StatsdMonitoringEndpointResponse result = client
              .monitoringEndpoint
              .addNewConfig(endpointName)
              .schemas(schemas)
              .hostname(hostname)
              .serverPort(serverPort)
              .connectionType(connectionType)
              .trustManagerProvider(trustManagerProvider)
              .additionalTags(additionalTags)
              .enabled(enabled)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getHostname());
      System.out.println(result.getServerPort());
      System.out.println(result.getConnectionType());
      System.out.println(result.getTrustManagerProvider());
      System.out.println(result.getAdditionalTags());
      System.out.println(result.getEnabled());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringEndpointApi#addNewConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatsdMonitoringEndpointResponse> response = client
              .monitoringEndpoint
              .addNewConfig(endpointName)
              .schemas(schemas)
              .hostname(hostname)
              .serverPort(serverPort)
              .connectionType(connectionType)
              .trustManagerProvider(trustManagerProvider)
              .additionalTags(additionalTags)
              .enabled(enabled)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringEndpointApi#addNewConfig");
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
| **addStatsdMonitoringEndpointRequest** | [**AddStatsdMonitoringEndpointRequest**](AddStatsdMonitoringEndpointRequest.md)| Create a new Monitoring Endpoint in the config | |

### Return type

[**StatsdMonitoringEndpointResponse**](StatsdMonitoringEndpointResponse.md)

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
| **409** | The Monitoring Endpoint already exists |  -  |

<a name="deleteMonitoringEndpoint"></a>
# **deleteMonitoringEndpoint**
> deleteMonitoringEndpoint(monitoringEndpointName).execute();

Delete a Monitoring Endpoint

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MonitoringEndpointApi;
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
    String monitoringEndpointName = "monitoringEndpointName_example"; // Name of the Monitoring Endpoint
    try {
      client
              .monitoringEndpoint
              .deleteMonitoringEndpoint(monitoringEndpointName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringEndpointApi#deleteMonitoringEndpoint");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .monitoringEndpoint
              .deleteMonitoringEndpoint(monitoringEndpointName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringEndpointApi#deleteMonitoringEndpoint");
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
| **monitoringEndpointName** | **String**| Name of the Monitoring Endpoint | |

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
| **404** | The Monitoring Endpoint does not exist |  -  |
| **409** | The Monitoring Endpoint cannot be deleted |  -  |

<a name="getSingleEndpoint"></a>
# **getSingleEndpoint**
> StatsdMonitoringEndpointResponse getSingleEndpoint(monitoringEndpointName).execute();

Returns a single Monitoring Endpoint

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MonitoringEndpointApi;
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
    String monitoringEndpointName = "monitoringEndpointName_example"; // Name of the Monitoring Endpoint
    try {
      StatsdMonitoringEndpointResponse result = client
              .monitoringEndpoint
              .getSingleEndpoint(monitoringEndpointName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getHostname());
      System.out.println(result.getServerPort());
      System.out.println(result.getConnectionType());
      System.out.println(result.getTrustManagerProvider());
      System.out.println(result.getAdditionalTags());
      System.out.println(result.getEnabled());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringEndpointApi#getSingleEndpoint");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatsdMonitoringEndpointResponse> response = client
              .monitoringEndpoint
              .getSingleEndpoint(monitoringEndpointName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringEndpointApi#getSingleEndpoint");
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
| **monitoringEndpointName** | **String**| Name of the Monitoring Endpoint | |

### Return type

[**StatsdMonitoringEndpointResponse**](StatsdMonitoringEndpointResponse.md)

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
| **404** | The Monitoring Endpoint does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> MonitoringEndpointListResponse listAllObjects().filter(filter).execute();

Returns a list of all Monitoring Endpoint objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MonitoringEndpointApi;
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
    String filter = "filter_example"; // SCIM filter
    try {
      MonitoringEndpointListResponse result = client
              .monitoringEndpoint
              .listAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringEndpointApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MonitoringEndpointListResponse> response = client
              .monitoringEndpoint
              .listAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringEndpointApi#listAllObjects");
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
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**MonitoringEndpointListResponse**](MonitoringEndpointListResponse.md)

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

<a name="updateByName"></a>
# **updateByName**
> StatsdMonitoringEndpointResponse updateByName(monitoringEndpointName, updateRequest).execute();

Update an existing Monitoring Endpoint by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MonitoringEndpointApi;
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
    String monitoringEndpointName = "monitoringEndpointName_example"; // Name of the Monitoring Endpoint
    try {
      StatsdMonitoringEndpointResponse result = client
              .monitoringEndpoint
              .updateByName(operations, monitoringEndpointName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getHostname());
      System.out.println(result.getServerPort());
      System.out.println(result.getConnectionType());
      System.out.println(result.getTrustManagerProvider());
      System.out.println(result.getAdditionalTags());
      System.out.println(result.getEnabled());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringEndpointApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatsdMonitoringEndpointResponse> response = client
              .monitoringEndpoint
              .updateByName(operations, monitoringEndpointName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MonitoringEndpointApi#updateByName");
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
| **monitoringEndpointName** | **String**| Name of the Monitoring Endpoint | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Monitoring Endpoint | |

### Return type

[**StatsdMonitoringEndpointResponse**](StatsdMonitoringEndpointResponse.md)

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
| **404** | The Monitoring Endpoint does not exist |  -  |


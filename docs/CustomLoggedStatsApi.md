# CustomLoggedStatsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewStatToConfig**](CustomLoggedStatsApi.md#addNewStatToConfig) | **POST** /plugin-root/plugins/{plugin-name}/custom-logged-stats | Add a new Custom Logged Stats to the config |
| [**deleteStat**](CustomLoggedStatsApi.md#deleteStat) | **DELETE** /plugin-root/plugins/{plugin-name}/custom-logged-stats/{custom-logged-stats-name} | Delete a Custom Logged Stats |
| [**getSingle**](CustomLoggedStatsApi.md#getSingle) | **GET** /plugin-root/plugins/{plugin-name}/custom-logged-stats/{custom-logged-stats-name} | Returns a single Custom Logged Stats |
| [**listAllObjects**](CustomLoggedStatsApi.md#listAllObjects) | **GET** /plugin-root/plugins/{plugin-name}/custom-logged-stats | Returns a list of all Custom Logged Stats objects |
| [**updateByName**](CustomLoggedStatsApi.md#updateByName) | **PATCH** /plugin-root/plugins/{plugin-name}/custom-logged-stats/{custom-logged-stats-name} | Update an existing Custom Logged Stats by name |


<a name="addNewStatToConfig"></a>
# **addNewStatToConfig**
> CustomLoggedStatsResponse addNewStatToConfig(pluginName, addCustomLoggedStatsRequest).execute();

Add a new Custom Logged Stats to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomLoggedStatsApi;
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
    String statsName = "statsName_example"; // Name of the new Custom Logged Stats
    String pluginName = "pluginName_example"; // Name of the Plugin
    String description = "description_example"; // A description for this Custom Logged Stats
    List<EnumcustomLoggedStatsSchemaUrn> schemas = Arrays.asList();
    Boolean enabled = true; // Indicates whether the Custom Logged Stats object is enabled.
    String monitorObjectclass = "monitorObjectclass_example"; // The objectclass name of the monitor entries to examine for generating these statistics.
    String includeFilter = "includeFilter_example"; // An optional LDAP filter that can be used restrict which monitor entries are used to produce the output.
    List<String> attributeToLog = Arrays.asList(); // Specifies the attributes on the monitor entries that should be included in the output.
    List<String> columnName = Arrays.asList(); // Optionally, specifies an explicit name for each column header instead of having these names automatically generated from the monitored attribute name.
    List<EnumcustomLoggedStatsStatisticTypeProp> statisticType = Arrays.asList();
    String headerPrefix = "headerPrefix_example"; // An optional prefix that is included in the header before the column name.
    String headerPrefixAttribute = "headerPrefixAttribute_example"; // An optional attribute from the monitor entry that is included as a prefix before the column name in the column header.
    String regexPattern = "regexPattern_example"; // An optional regular expression pattern, that when used in conjunction with regex-replacement, can alter the value of the attribute being monitored.
    String regexReplacement = "regexReplacement_example"; // An optional regular expression replacement value, that when used in conjunction with regex-pattern, can alter the value of the attribute being monitored.
    String divideValueBy = "divideValueBy_example"; // An optional floating point value that can be used to scale the resulting value.
    String divideValueByAttribute = "divideValueByAttribute_example"; // An optional property that can scale the resulting value by another attribute in the monitored entry.
    String decimalFormat = "decimalFormat_example"; // This provides a way to format the monitored attribute value in the output to control the precision for instance.
    Boolean nonZeroImpliesNotIdle = true; // If this property is set to true, then the value of any of the monitored attributes here can contribute to whether an interval is considered \\\"idle\\\" by the Periodic Stats Logger.
    try {
      CustomLoggedStatsResponse result = client
              .customLoggedStats
              .addNewStatToConfig(statsName, pluginName)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .monitorObjectclass(monitorObjectclass)
              .includeFilter(includeFilter)
              .attributeToLog(attributeToLog)
              .columnName(columnName)
              .statisticType(statisticType)
              .headerPrefix(headerPrefix)
              .headerPrefixAttribute(headerPrefixAttribute)
              .regexPattern(regexPattern)
              .regexReplacement(regexReplacement)
              .divideValueBy(divideValueBy)
              .divideValueByAttribute(divideValueByAttribute)
              .decimalFormat(decimalFormat)
              .nonZeroImpliesNotIdle(nonZeroImpliesNotIdle)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getMonitorObjectclass());
      System.out.println(result.getIncludeFilter());
      System.out.println(result.getAttributeToLog());
      System.out.println(result.getColumnName());
      System.out.println(result.getStatisticType());
      System.out.println(result.getHeaderPrefix());
      System.out.println(result.getHeaderPrefixAttribute());
      System.out.println(result.getRegexPattern());
      System.out.println(result.getRegexReplacement());
      System.out.println(result.getDivideValueBy());
      System.out.println(result.getDivideValueByAttribute());
      System.out.println(result.getDecimalFormat());
      System.out.println(result.getNonZeroImpliesNotIdle());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomLoggedStatsApi#addNewStatToConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomLoggedStatsResponse> response = client
              .customLoggedStats
              .addNewStatToConfig(statsName, pluginName)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .monitorObjectclass(monitorObjectclass)
              .includeFilter(includeFilter)
              .attributeToLog(attributeToLog)
              .columnName(columnName)
              .statisticType(statisticType)
              .headerPrefix(headerPrefix)
              .headerPrefixAttribute(headerPrefixAttribute)
              .regexPattern(regexPattern)
              .regexReplacement(regexReplacement)
              .divideValueBy(divideValueBy)
              .divideValueByAttribute(divideValueByAttribute)
              .decimalFormat(decimalFormat)
              .nonZeroImpliesNotIdle(nonZeroImpliesNotIdle)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomLoggedStatsApi#addNewStatToConfig");
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
| **pluginName** | **String**| Name of the Plugin | |
| **addCustomLoggedStatsRequest** | [**AddCustomLoggedStatsRequest**](AddCustomLoggedStatsRequest.md)| Create a new Custom Logged Stats in the config | |

### Return type

[**CustomLoggedStatsResponse**](CustomLoggedStatsResponse.md)

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
| **409** | The Custom Logged Stats already exists |  -  |

<a name="deleteStat"></a>
# **deleteStat**
> deleteStat(customLoggedStatsName, pluginName).execute();

Delete a Custom Logged Stats

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomLoggedStatsApi;
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
    String customLoggedStatsName = "customLoggedStatsName_example"; // Name of the Custom Logged Stats
    String pluginName = "pluginName_example"; // Name of the Plugin
    try {
      client
              .customLoggedStats
              .deleteStat(customLoggedStatsName, pluginName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomLoggedStatsApi#deleteStat");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .customLoggedStats
              .deleteStat(customLoggedStatsName, pluginName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomLoggedStatsApi#deleteStat");
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
| **customLoggedStatsName** | **String**| Name of the Custom Logged Stats | |
| **pluginName** | **String**| Name of the Plugin | |

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
| **404** | The Custom Logged Stats does not exist |  -  |
| **409** | The Custom Logged Stats cannot be deleted |  -  |

<a name="getSingle"></a>
# **getSingle**
> CustomLoggedStatsResponse getSingle(customLoggedStatsName, pluginName).execute();

Returns a single Custom Logged Stats

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomLoggedStatsApi;
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
    String customLoggedStatsName = "customLoggedStatsName_example"; // Name of the Custom Logged Stats
    String pluginName = "pluginName_example"; // Name of the Plugin
    try {
      CustomLoggedStatsResponse result = client
              .customLoggedStats
              .getSingle(customLoggedStatsName, pluginName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getMonitorObjectclass());
      System.out.println(result.getIncludeFilter());
      System.out.println(result.getAttributeToLog());
      System.out.println(result.getColumnName());
      System.out.println(result.getStatisticType());
      System.out.println(result.getHeaderPrefix());
      System.out.println(result.getHeaderPrefixAttribute());
      System.out.println(result.getRegexPattern());
      System.out.println(result.getRegexReplacement());
      System.out.println(result.getDivideValueBy());
      System.out.println(result.getDivideValueByAttribute());
      System.out.println(result.getDecimalFormat());
      System.out.println(result.getNonZeroImpliesNotIdle());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomLoggedStatsApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomLoggedStatsResponse> response = client
              .customLoggedStats
              .getSingle(customLoggedStatsName, pluginName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomLoggedStatsApi#getSingle");
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
| **customLoggedStatsName** | **String**| Name of the Custom Logged Stats | |
| **pluginName** | **String**| Name of the Plugin | |

### Return type

[**CustomLoggedStatsResponse**](CustomLoggedStatsResponse.md)

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
| **404** | The Custom Logged Stats does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> CustomLoggedStatsListResponse listAllObjects(pluginName).filter(filter).execute();

Returns a list of all Custom Logged Stats objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomLoggedStatsApi;
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
    String pluginName = "pluginName_example"; // Name of the Plugin
    String filter = "filter_example"; // SCIM filter
    try {
      CustomLoggedStatsListResponse result = client
              .customLoggedStats
              .listAllObjects(pluginName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomLoggedStatsApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomLoggedStatsListResponse> response = client
              .customLoggedStats
              .listAllObjects(pluginName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomLoggedStatsApi#listAllObjects");
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
| **pluginName** | **String**| Name of the Plugin | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**CustomLoggedStatsListResponse**](CustomLoggedStatsListResponse.md)

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
> CustomLoggedStatsResponse updateByName(customLoggedStatsName, pluginName, updateRequest).execute();

Update an existing Custom Logged Stats by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomLoggedStatsApi;
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
    String customLoggedStatsName = "customLoggedStatsName_example"; // Name of the Custom Logged Stats
    String pluginName = "pluginName_example"; // Name of the Plugin
    try {
      CustomLoggedStatsResponse result = client
              .customLoggedStats
              .updateByName(operations, customLoggedStatsName, pluginName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getMonitorObjectclass());
      System.out.println(result.getIncludeFilter());
      System.out.println(result.getAttributeToLog());
      System.out.println(result.getColumnName());
      System.out.println(result.getStatisticType());
      System.out.println(result.getHeaderPrefix());
      System.out.println(result.getHeaderPrefixAttribute());
      System.out.println(result.getRegexPattern());
      System.out.println(result.getRegexReplacement());
      System.out.println(result.getDivideValueBy());
      System.out.println(result.getDivideValueByAttribute());
      System.out.println(result.getDecimalFormat());
      System.out.println(result.getNonZeroImpliesNotIdle());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomLoggedStatsApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomLoggedStatsResponse> response = client
              .customLoggedStats
              .updateByName(operations, customLoggedStatsName, pluginName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomLoggedStatsApi#updateByName");
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
| **customLoggedStatsName** | **String**| Name of the Custom Logged Stats | |
| **pluginName** | **String**| Name of the Plugin | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Custom Logged Stats | |

### Return type

[**CustomLoggedStatsResponse**](CustomLoggedStatsResponse.md)

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
| **404** | The Custom Logged Stats does not exist |  -  |


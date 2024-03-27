# RecurringTaskChainApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewToConfig**](RecurringTaskChainApi.md#addNewToConfig) | **POST** /recurring-task-chains | Add a new Recurring Task Chain to the config |
| [**deleteChain**](RecurringTaskChainApi.md#deleteChain) | **DELETE** /recurring-task-chains/{recurring-task-chain-name} | Delete a Recurring Task Chain |
| [**getSingle**](RecurringTaskChainApi.md#getSingle) | **GET** /recurring-task-chains/{recurring-task-chain-name} | Returns a single Recurring Task Chain |
| [**listAllObjects**](RecurringTaskChainApi.md#listAllObjects) | **GET** /recurring-task-chains | Returns a list of all Recurring Task Chain objects |
| [**updateByRecurringTaskChainName**](RecurringTaskChainApi.md#updateByRecurringTaskChainName) | **PATCH** /recurring-task-chains/{recurring-task-chain-name} | Update an existing Recurring Task Chain by name |


<a name="addNewToConfig"></a>
# **addNewToConfig**
> RecurringTaskChainResponse addNewToConfig(addRecurringTaskChainRequest).execute();

Add a new Recurring Task Chain to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecurringTaskChainApi;
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
    String chainName = "chainName_example"; // Name of the new Recurring Task Chain
    String description = "description_example"; // A description for this Recurring Task Chain
    List<EnumrecurringTaskChainSchemaUrn> schemas = Arrays.asList();
    Boolean enabled = true; // Indicates whether this Recurring Task Chain is enabled for use. Recurring Task Chains that are disabled will not have any new instances scheduled, but instances that are already scheduled will be preserved. Those instances may be manually canceled if desired.
    List<String> recurringTask = Arrays.asList(); // The set of recurring tasks that make up this chain. At least one value must be provided. If multiple values are given, then the task instances will be invoked in the order in which they are listed.
    List<EnumrecurringTaskChainScheduledMonthProp> scheduledMonth = Arrays.asList();
    EnumrecurringTaskChainScheduledDateSelectionTypeProp scheduledDateSelectionType = EnumrecurringTaskChainScheduledDateSelectionTypeProp.fromValue("every-day");
    List<EnumrecurringTaskChainScheduledDayOfTheWeekProp> scheduledDayOfTheWeek = Arrays.asList();
    List<EnumrecurringTaskChainScheduledDayOfTheMonthProp> scheduledDayOfTheMonth = Arrays.asList();
    List<String> scheduledTimeOfDay = Arrays.asList(); // The time of day at which instances of the Recurring Task Chain should be eligible to start running. Values should be in the format HH:MM (where HH is a two-digit representation of the hour of the day, between 00 and 23, inclusive), and MM is a two-digit representation of the minute of the hour (between 00 and 59, inclusive). Alternately, the value can be in the form *:MM, which indicates that the task should be eligible to start at the specified minute of every hour. At least one value must be provided, but multiple values may be given to indicate multiple start times within the same day.
    String timeZone = "timeZone_example"; // The time zone that will be used to interpret the scheduled-time-of-day values. If no value is provided, then the JVM's default time zone will be used.
    EnumrecurringTaskChainInterruptedByShutdownBehaviorProp interruptedByShutdownBehavior = EnumrecurringTaskChainInterruptedByShutdownBehaviorProp.fromValue("cancel-interrupted-task-and-dependencies");
    EnumrecurringTaskChainServerOfflineAtStartTimeBehaviorProp serverOfflineAtStartTimeBehavior = EnumrecurringTaskChainServerOfflineAtStartTimeBehaviorProp.fromValue("run-immediately-upon-server-startup");
    try {
      RecurringTaskChainResponse result = client
              .recurringTaskChain
              .addNewToConfig(chainName)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .recurringTask(recurringTask)
              .scheduledMonth(scheduledMonth)
              .scheduledDateSelectionType(scheduledDateSelectionType)
              .scheduledDayOfTheWeek(scheduledDayOfTheWeek)
              .scheduledDayOfTheMonth(scheduledDayOfTheMonth)
              .scheduledTimeOfDay(scheduledTimeOfDay)
              .timeZone(timeZone)
              .interruptedByShutdownBehavior(interruptedByShutdownBehavior)
              .serverOfflineAtStartTimeBehavior(serverOfflineAtStartTimeBehavior)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getRecurringTask());
      System.out.println(result.getScheduledMonth());
      System.out.println(result.getScheduledDateSelectionType());
      System.out.println(result.getScheduledDayOfTheWeek());
      System.out.println(result.getScheduledDayOfTheMonth());
      System.out.println(result.getScheduledTimeOfDay());
      System.out.println(result.getTimeZone());
      System.out.println(result.getInterruptedByShutdownBehavior());
      System.out.println(result.getServerOfflineAtStartTimeBehavior());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringTaskChainApi#addNewToConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringTaskChainResponse> response = client
              .recurringTaskChain
              .addNewToConfig(chainName)
              .description(description)
              .schemas(schemas)
              .enabled(enabled)
              .recurringTask(recurringTask)
              .scheduledMonth(scheduledMonth)
              .scheduledDateSelectionType(scheduledDateSelectionType)
              .scheduledDayOfTheWeek(scheduledDayOfTheWeek)
              .scheduledDayOfTheMonth(scheduledDayOfTheMonth)
              .scheduledTimeOfDay(scheduledTimeOfDay)
              .timeZone(timeZone)
              .interruptedByShutdownBehavior(interruptedByShutdownBehavior)
              .serverOfflineAtStartTimeBehavior(serverOfflineAtStartTimeBehavior)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringTaskChainApi#addNewToConfig");
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
| **addRecurringTaskChainRequest** | [**AddRecurringTaskChainRequest**](AddRecurringTaskChainRequest.md)| Create a new Recurring Task Chain in the config | |

### Return type

[**RecurringTaskChainResponse**](RecurringTaskChainResponse.md)

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
| **409** | The Recurring Task Chain already exists |  -  |

<a name="deleteChain"></a>
# **deleteChain**
> deleteChain(recurringTaskChainName).execute();

Delete a Recurring Task Chain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecurringTaskChainApi;
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
    String recurringTaskChainName = "recurringTaskChainName_example"; // Name of the Recurring Task Chain
    try {
      client
              .recurringTaskChain
              .deleteChain(recurringTaskChainName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringTaskChainApi#deleteChain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .recurringTaskChain
              .deleteChain(recurringTaskChainName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringTaskChainApi#deleteChain");
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
| **recurringTaskChainName** | **String**| Name of the Recurring Task Chain | |

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
| **404** | The Recurring Task Chain does not exist |  -  |
| **409** | The Recurring Task Chain cannot be deleted |  -  |

<a name="getSingle"></a>
# **getSingle**
> RecurringTaskChainResponse getSingle(recurringTaskChainName).execute();

Returns a single Recurring Task Chain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecurringTaskChainApi;
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
    String recurringTaskChainName = "recurringTaskChainName_example"; // Name of the Recurring Task Chain
    try {
      RecurringTaskChainResponse result = client
              .recurringTaskChain
              .getSingle(recurringTaskChainName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getRecurringTask());
      System.out.println(result.getScheduledMonth());
      System.out.println(result.getScheduledDateSelectionType());
      System.out.println(result.getScheduledDayOfTheWeek());
      System.out.println(result.getScheduledDayOfTheMonth());
      System.out.println(result.getScheduledTimeOfDay());
      System.out.println(result.getTimeZone());
      System.out.println(result.getInterruptedByShutdownBehavior());
      System.out.println(result.getServerOfflineAtStartTimeBehavior());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringTaskChainApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringTaskChainResponse> response = client
              .recurringTaskChain
              .getSingle(recurringTaskChainName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringTaskChainApi#getSingle");
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
| **recurringTaskChainName** | **String**| Name of the Recurring Task Chain | |

### Return type

[**RecurringTaskChainResponse**](RecurringTaskChainResponse.md)

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
| **404** | The Recurring Task Chain does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> RecurringTaskChainListResponse listAllObjects().filter(filter).execute();

Returns a list of all Recurring Task Chain objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecurringTaskChainApi;
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
      RecurringTaskChainListResponse result = client
              .recurringTaskChain
              .listAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringTaskChainApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringTaskChainListResponse> response = client
              .recurringTaskChain
              .listAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringTaskChainApi#listAllObjects");
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

[**RecurringTaskChainListResponse**](RecurringTaskChainListResponse.md)

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

<a name="updateByRecurringTaskChainName"></a>
# **updateByRecurringTaskChainName**
> RecurringTaskChainResponse updateByRecurringTaskChainName(recurringTaskChainName, updateRequest).execute();

Update an existing Recurring Task Chain by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecurringTaskChainApi;
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
    String recurringTaskChainName = "recurringTaskChainName_example"; // Name of the Recurring Task Chain
    try {
      RecurringTaskChainResponse result = client
              .recurringTaskChain
              .updateByRecurringTaskChainName(operations, recurringTaskChainName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getEnabled());
      System.out.println(result.getRecurringTask());
      System.out.println(result.getScheduledMonth());
      System.out.println(result.getScheduledDateSelectionType());
      System.out.println(result.getScheduledDayOfTheWeek());
      System.out.println(result.getScheduledDayOfTheMonth());
      System.out.println(result.getScheduledTimeOfDay());
      System.out.println(result.getTimeZone());
      System.out.println(result.getInterruptedByShutdownBehavior());
      System.out.println(result.getServerOfflineAtStartTimeBehavior());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringTaskChainApi#updateByRecurringTaskChainName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringTaskChainResponse> response = client
              .recurringTaskChain
              .updateByRecurringTaskChainName(operations, recurringTaskChainName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringTaskChainApi#updateByRecurringTaskChainName");
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
| **recurringTaskChainName** | **String**| Name of the Recurring Task Chain | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Recurring Task Chain | |

### Return type

[**RecurringTaskChainResponse**](RecurringTaskChainResponse.md)

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
| **404** | The Recurring Task Chain does not exist |  -  |


# NotificationManagerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewConfig**](NotificationManagerApi.md#addNewConfig) | **POST** /notification-managers | Add a new Notification Manager to the config |
| [**deleteNotificationManager**](NotificationManagerApi.md#deleteNotificationManager) | **DELETE** /notification-managers/{notification-manager-name} | Delete a Notification Manager |
| [**getSingle**](NotificationManagerApi.md#getSingle) | **GET** /notification-managers/{notification-manager-name} | Returns a single Notification Manager |
| [**listAllObjects**](NotificationManagerApi.md#listAllObjects) | **GET** /notification-managers | Returns a list of all Notification Manager objects |
| [**updateByName**](NotificationManagerApi.md#updateByName) | **PATCH** /notification-managers/{notification-manager-name} | Update an existing Notification Manager by name |


<a name="addNewConfig"></a>
# **addNewConfig**
> ThirdPartyNotificationManagerResponse addNewConfig(addThirdPartyNotificationManagerRequest).execute();

Add a new Notification Manager to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationManagerApi;
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
    String managerName = "managerName_example"; // Name of the new Notification Manager
    String description = "description_example"; // A description for this Notification Manager
    List<EnumthirdPartyNotificationManagerSchemaUrn> schemas = Arrays.asList();
    String extensionClass = "extensionClass_example"; // The fully-qualified name of the Java class providing the logic for the Third Party Notification Manager.
    List<String> extensionArgument = Arrays.asList(); // The set of arguments used to customize the behavior for the Third Party Notification Manager. Each configuration property should be given in the form 'name=value'.
    Boolean enabled = true; // Indicates whether this Notification Manager is enabled within the server.
    String subscriptionBaseDN = "subscriptionBaseDN_example"; // Specifies the DN of the entry below which subscription data is stored for this Notification Manager. This needs to be in the backend that has the data to be notified on, and must not be the same entry as the backend base DN. The subscription base DN entry does not need to exist as it will be created by the server.
    EnumnotificationManagerTransactionNotificationProp transactionNotification = EnumnotificationManagerTransactionNotificationProp.fromValue("individual");
    Boolean monitorEntriesEnabled = true; // Enables monitor entries for this Notification Manager.
    try {
      ThirdPartyNotificationManagerResponse result = client
              .notificationManager
              .addNewConfig(managerName)
              .description(description)
              .schemas(schemas)
              .extensionClass(extensionClass)
              .extensionArgument(extensionArgument)
              .enabled(enabled)
              .subscriptionBaseDN(subscriptionBaseDN)
              .transactionNotification(transactionNotification)
              .monitorEntriesEnabled(monitorEntriesEnabled)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getExtensionClass());
      System.out.println(result.getExtensionArgument());
      System.out.println(result.getEnabled());
      System.out.println(result.getSubscriptionBaseDN());
      System.out.println(result.getTransactionNotification());
      System.out.println(result.getMonitorEntriesEnabled());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationManagerApi#addNewConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ThirdPartyNotificationManagerResponse> response = client
              .notificationManager
              .addNewConfig(managerName)
              .description(description)
              .schemas(schemas)
              .extensionClass(extensionClass)
              .extensionArgument(extensionArgument)
              .enabled(enabled)
              .subscriptionBaseDN(subscriptionBaseDN)
              .transactionNotification(transactionNotification)
              .monitorEntriesEnabled(monitorEntriesEnabled)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationManagerApi#addNewConfig");
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
| **addThirdPartyNotificationManagerRequest** | [**AddThirdPartyNotificationManagerRequest**](AddThirdPartyNotificationManagerRequest.md)| Create a new Notification Manager in the config | |

### Return type

[**ThirdPartyNotificationManagerResponse**](ThirdPartyNotificationManagerResponse.md)

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
| **409** | The Notification Manager already exists |  -  |

<a name="deleteNotificationManager"></a>
# **deleteNotificationManager**
> deleteNotificationManager(notificationManagerName).execute();

Delete a Notification Manager

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationManagerApi;
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
    String notificationManagerName = "notificationManagerName_example"; // Name of the Notification Manager
    try {
      client
              .notificationManager
              .deleteNotificationManager(notificationManagerName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationManagerApi#deleteNotificationManager");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .notificationManager
              .deleteNotificationManager(notificationManagerName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationManagerApi#deleteNotificationManager");
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
| **notificationManagerName** | **String**| Name of the Notification Manager | |

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
| **404** | The Notification Manager does not exist |  -  |
| **409** | The Notification Manager cannot be deleted |  -  |

<a name="getSingle"></a>
# **getSingle**
> ThirdPartyNotificationManagerResponse getSingle(notificationManagerName).execute();

Returns a single Notification Manager

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationManagerApi;
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
    String notificationManagerName = "notificationManagerName_example"; // Name of the Notification Manager
    try {
      ThirdPartyNotificationManagerResponse result = client
              .notificationManager
              .getSingle(notificationManagerName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getExtensionClass());
      System.out.println(result.getExtensionArgument());
      System.out.println(result.getEnabled());
      System.out.println(result.getSubscriptionBaseDN());
      System.out.println(result.getTransactionNotification());
      System.out.println(result.getMonitorEntriesEnabled());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationManagerApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ThirdPartyNotificationManagerResponse> response = client
              .notificationManager
              .getSingle(notificationManagerName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationManagerApi#getSingle");
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
| **notificationManagerName** | **String**| Name of the Notification Manager | |

### Return type

[**ThirdPartyNotificationManagerResponse**](ThirdPartyNotificationManagerResponse.md)

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
| **404** | The Notification Manager does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> NotificationManagerListResponse listAllObjects().filter(filter).execute();

Returns a list of all Notification Manager objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationManagerApi;
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
      NotificationManagerListResponse result = client
              .notificationManager
              .listAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationManagerApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NotificationManagerListResponse> response = client
              .notificationManager
              .listAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationManagerApi#listAllObjects");
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

[**NotificationManagerListResponse**](NotificationManagerListResponse.md)

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
> ThirdPartyNotificationManagerResponse updateByName(notificationManagerName, updateRequest).execute();

Update an existing Notification Manager by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationManagerApi;
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
    String notificationManagerName = "notificationManagerName_example"; // Name of the Notification Manager
    try {
      ThirdPartyNotificationManagerResponse result = client
              .notificationManager
              .updateByName(operations, notificationManagerName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getExtensionClass());
      System.out.println(result.getExtensionArgument());
      System.out.println(result.getEnabled());
      System.out.println(result.getSubscriptionBaseDN());
      System.out.println(result.getTransactionNotification());
      System.out.println(result.getMonitorEntriesEnabled());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationManagerApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ThirdPartyNotificationManagerResponse> response = client
              .notificationManager
              .updateByName(operations, notificationManagerName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationManagerApi#updateByName");
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
| **notificationManagerName** | **String**| Name of the Notification Manager | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Notification Manager | |

### Return type

[**ThirdPartyNotificationManagerResponse**](ThirdPartyNotificationManagerResponse.md)

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
| **404** | The Notification Manager does not exist |  -  |


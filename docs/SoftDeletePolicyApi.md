# SoftDeletePolicyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewPolicy**](SoftDeletePolicyApi.md#addNewPolicy) | **POST** /soft-delete-policies | Add a new Soft Delete Policy to the config |
| [**deletePolicy**](SoftDeletePolicyApi.md#deletePolicy) | **DELETE** /soft-delete-policies/{soft-delete-policy-name} | Delete a Soft Delete Policy |
| [**getSingleSoftDeletePolicy**](SoftDeletePolicyApi.md#getSingleSoftDeletePolicy) | **GET** /soft-delete-policies/{soft-delete-policy-name} | Returns a single Soft Delete Policy |
| [**listAllObjects**](SoftDeletePolicyApi.md#listAllObjects) | **GET** /soft-delete-policies | Returns a list of all Soft Delete Policy objects |
| [**updateByName**](SoftDeletePolicyApi.md#updateByName) | **PATCH** /soft-delete-policies/{soft-delete-policy-name} | Update an existing Soft Delete Policy by name |


<a name="addNewPolicy"></a>
# **addNewPolicy**
> SoftDeletePolicyResponse addNewPolicy(addSoftDeletePolicyRequest).execute();

Add a new Soft Delete Policy to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SoftDeletePolicyApi;
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
    String policyName = "policyName_example"; // Name of the new Soft Delete Policy
    String description = "description_example"; // A description for this Soft Delete Policy
    List<EnumsoftDeletePolicySchemaUrn> schemas = Arrays.asList();
    String autoSoftDeleteConnectionCriteria = "autoSoftDeleteConnectionCriteria_example"; // Connection criteria used to automatically identify a delete operation for processing as a soft delete request.
    String autoSoftDeleteRequestCriteria = "autoSoftDeleteRequestCriteria_example"; // Request criteria used to automatically identify a delete operation for processing as a soft delete request.
    String softDeleteRetentionTime = "softDeleteRetentionTime_example"; // Specifies the maximum length of time that soft delete entries are retained before they are eligible to purged automatically.
    Integer softDeleteRetainNumberOfEntries = 56; // Specifies the number of soft deleted entries to retain before the oldest entries are purged.
    try {
      SoftDeletePolicyResponse result = client
              .softDeletePolicy
              .addNewPolicy(policyName)
              .description(description)
              .schemas(schemas)
              .autoSoftDeleteConnectionCriteria(autoSoftDeleteConnectionCriteria)
              .autoSoftDeleteRequestCriteria(autoSoftDeleteRequestCriteria)
              .softDeleteRetentionTime(softDeleteRetentionTime)
              .softDeleteRetainNumberOfEntries(softDeleteRetainNumberOfEntries)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getAutoSoftDeleteConnectionCriteria());
      System.out.println(result.getAutoSoftDeleteRequestCriteria());
      System.out.println(result.getSoftDeleteRetentionTime());
      System.out.println(result.getSoftDeleteRetainNumberOfEntries());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftDeletePolicyApi#addNewPolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SoftDeletePolicyResponse> response = client
              .softDeletePolicy
              .addNewPolicy(policyName)
              .description(description)
              .schemas(schemas)
              .autoSoftDeleteConnectionCriteria(autoSoftDeleteConnectionCriteria)
              .autoSoftDeleteRequestCriteria(autoSoftDeleteRequestCriteria)
              .softDeleteRetentionTime(softDeleteRetentionTime)
              .softDeleteRetainNumberOfEntries(softDeleteRetainNumberOfEntries)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftDeletePolicyApi#addNewPolicy");
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
| **addSoftDeletePolicyRequest** | [**AddSoftDeletePolicyRequest**](AddSoftDeletePolicyRequest.md)| Create a new Soft Delete Policy in the config | |

### Return type

[**SoftDeletePolicyResponse**](SoftDeletePolicyResponse.md)

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
| **409** | The Soft Delete Policy already exists |  -  |

<a name="deletePolicy"></a>
# **deletePolicy**
> deletePolicy(softDeletePolicyName).execute();

Delete a Soft Delete Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SoftDeletePolicyApi;
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
    String softDeletePolicyName = "softDeletePolicyName_example"; // Name of the Soft Delete Policy
    try {
      client
              .softDeletePolicy
              .deletePolicy(softDeletePolicyName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftDeletePolicyApi#deletePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .softDeletePolicy
              .deletePolicy(softDeletePolicyName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftDeletePolicyApi#deletePolicy");
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
| **softDeletePolicyName** | **String**| Name of the Soft Delete Policy | |

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
| **404** | The Soft Delete Policy does not exist |  -  |
| **409** | The Soft Delete Policy cannot be deleted |  -  |

<a name="getSingleSoftDeletePolicy"></a>
# **getSingleSoftDeletePolicy**
> SoftDeletePolicyResponse getSingleSoftDeletePolicy(softDeletePolicyName).execute();

Returns a single Soft Delete Policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SoftDeletePolicyApi;
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
    String softDeletePolicyName = "softDeletePolicyName_example"; // Name of the Soft Delete Policy
    try {
      SoftDeletePolicyResponse result = client
              .softDeletePolicy
              .getSingleSoftDeletePolicy(softDeletePolicyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getAutoSoftDeleteConnectionCriteria());
      System.out.println(result.getAutoSoftDeleteRequestCriteria());
      System.out.println(result.getSoftDeleteRetentionTime());
      System.out.println(result.getSoftDeleteRetainNumberOfEntries());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftDeletePolicyApi#getSingleSoftDeletePolicy");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SoftDeletePolicyResponse> response = client
              .softDeletePolicy
              .getSingleSoftDeletePolicy(softDeletePolicyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftDeletePolicyApi#getSingleSoftDeletePolicy");
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
| **softDeletePolicyName** | **String**| Name of the Soft Delete Policy | |

### Return type

[**SoftDeletePolicyResponse**](SoftDeletePolicyResponse.md)

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
| **404** | The Soft Delete Policy does not exist |  -  |

<a name="listAllObjects"></a>
# **listAllObjects**
> SoftDeletePolicyListResponse listAllObjects().filter(filter).execute();

Returns a list of all Soft Delete Policy objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SoftDeletePolicyApi;
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
      SoftDeletePolicyListResponse result = client
              .softDeletePolicy
              .listAllObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftDeletePolicyApi#listAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SoftDeletePolicyListResponse> response = client
              .softDeletePolicy
              .listAllObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftDeletePolicyApi#listAllObjects");
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

[**SoftDeletePolicyListResponse**](SoftDeletePolicyListResponse.md)

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
> SoftDeletePolicyResponse updateByName(softDeletePolicyName, updateRequest).execute();

Update an existing Soft Delete Policy by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SoftDeletePolicyApi;
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
    String softDeletePolicyName = "softDeletePolicyName_example"; // Name of the Soft Delete Policy
    try {
      SoftDeletePolicyResponse result = client
              .softDeletePolicy
              .updateByName(operations, softDeletePolicyName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getSchemas());
      System.out.println(result.getAutoSoftDeleteConnectionCriteria());
      System.out.println(result.getAutoSoftDeleteRequestCriteria());
      System.out.println(result.getSoftDeleteRetentionTime());
      System.out.println(result.getSoftDeleteRetainNumberOfEntries());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftDeletePolicyApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SoftDeletePolicyResponse> response = client
              .softDeletePolicy
              .updateByName(operations, softDeletePolicyName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftDeletePolicyApi#updateByName");
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
| **softDeletePolicyName** | **String**| Name of the Soft Delete Policy | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Soft Delete Policy | |

### Return type

[**SoftDeletePolicyResponse**](SoftDeletePolicyResponse.md)

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
| **404** | The Soft Delete Policy does not exist |  -  |


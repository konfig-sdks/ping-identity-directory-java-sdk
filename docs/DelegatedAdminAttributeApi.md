# DelegatedAdminAttributeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewConfig**](DelegatedAdminAttributeApi.md#addNewConfig) | **POST** /rest-resource-types/{rest-resource-type-name}/delegated-admin-attributes | Add a new Delegated Admin Attribute to the config |
| [**deleteDelegatedAdminAttribute**](DelegatedAdminAttributeApi.md#deleteDelegatedAdminAttribute) | **DELETE** /rest-resource-types/{rest-resource-type-name}/delegated-admin-attributes/{delegated-admin-attribute-name} | Delete a Delegated Admin Attribute |
| [**getListOfDelegatedAdminAttributes**](DelegatedAdminAttributeApi.md#getListOfDelegatedAdminAttributes) | **GET** /rest-resource-types/{rest-resource-type-name}/delegated-admin-attributes | Returns a list of all Delegated Admin Attribute objects |
| [**getSingle**](DelegatedAdminAttributeApi.md#getSingle) | **GET** /rest-resource-types/{rest-resource-type-name}/delegated-admin-attributes/{delegated-admin-attribute-name} | Returns a single Delegated Admin Attribute |
| [**updateByName**](DelegatedAdminAttributeApi.md#updateByName) | **PATCH** /rest-resource-types/{rest-resource-type-name}/delegated-admin-attributes/{delegated-admin-attribute-name} | Update an existing Delegated Admin Attribute by name |


<a name="addNewConfig"></a>
# **addNewConfig**
> Object addNewConfig(restResourceTypeName, body).execute();

Add a new Delegated Admin Attribute to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminAttributeApi;
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
    String restResourceTypeName = "restResourceTypeName_example"; // Name of the REST Resource Type
    try {
      Object result = client
              .delegatedAdminAttribute
              .addNewConfig(restResourceTypeName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeApi#addNewConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .delegatedAdminAttribute
              .addNewConfig(restResourceTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeApi#addNewConfig");
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
| **restResourceTypeName** | **String**| Name of the REST Resource Type | |
| **body** | **Object**| Create a new Delegated Admin Attribute in the config | |

### Return type

**Object**

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
| **409** | The Delegated Admin Attribute already exists |  -  |

<a name="deleteDelegatedAdminAttribute"></a>
# **deleteDelegatedAdminAttribute**
> deleteDelegatedAdminAttribute(delegatedAdminAttributeName, restResourceTypeName).execute();

Delete a Delegated Admin Attribute

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminAttributeApi;
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
    String delegatedAdminAttributeName = "delegatedAdminAttributeName_example"; // Name of the Delegated Admin Attribute
    String restResourceTypeName = "restResourceTypeName_example"; // Name of the REST Resource Type
    try {
      client
              .delegatedAdminAttribute
              .deleteDelegatedAdminAttribute(delegatedAdminAttributeName, restResourceTypeName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeApi#deleteDelegatedAdminAttribute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .delegatedAdminAttribute
              .deleteDelegatedAdminAttribute(delegatedAdminAttributeName, restResourceTypeName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeApi#deleteDelegatedAdminAttribute");
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
| **delegatedAdminAttributeName** | **String**| Name of the Delegated Admin Attribute | |
| **restResourceTypeName** | **String**| Name of the REST Resource Type | |

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
| **404** | The Delegated Admin Attribute does not exist |  -  |
| **409** | The Delegated Admin Attribute cannot be deleted |  -  |

<a name="getListOfDelegatedAdminAttributes"></a>
# **getListOfDelegatedAdminAttributes**
> DelegatedAdminAttributeListResponse getListOfDelegatedAdminAttributes(restResourceTypeName).filter(filter).execute();

Returns a list of all Delegated Admin Attribute objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminAttributeApi;
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
    String restResourceTypeName = "restResourceTypeName_example"; // Name of the REST Resource Type
    String filter = "filter_example"; // SCIM filter
    try {
      DelegatedAdminAttributeListResponse result = client
              .delegatedAdminAttribute
              .getListOfDelegatedAdminAttributes(restResourceTypeName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeApi#getListOfDelegatedAdminAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DelegatedAdminAttributeListResponse> response = client
              .delegatedAdminAttribute
              .getListOfDelegatedAdminAttributes(restResourceTypeName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeApi#getListOfDelegatedAdminAttributes");
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
| **restResourceTypeName** | **String**| Name of the REST Resource Type | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**DelegatedAdminAttributeListResponse**](DelegatedAdminAttributeListResponse.md)

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

<a name="getSingle"></a>
# **getSingle**
> Object getSingle(delegatedAdminAttributeName, restResourceTypeName).execute();

Returns a single Delegated Admin Attribute

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminAttributeApi;
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
    String delegatedAdminAttributeName = "delegatedAdminAttributeName_example"; // Name of the Delegated Admin Attribute
    String restResourceTypeName = "restResourceTypeName_example"; // Name of the REST Resource Type
    try {
      Object result = client
              .delegatedAdminAttribute
              .getSingle(delegatedAdminAttributeName, restResourceTypeName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .delegatedAdminAttribute
              .getSingle(delegatedAdminAttributeName, restResourceTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeApi#getSingle");
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
| **delegatedAdminAttributeName** | **String**| Name of the Delegated Admin Attribute | |
| **restResourceTypeName** | **String**| Name of the REST Resource Type | |

### Return type

**Object**

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
| **404** | The Delegated Admin Attribute does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> Object updateByName(delegatedAdminAttributeName, restResourceTypeName, updateRequest).execute();

Update an existing Delegated Admin Attribute by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DelegatedAdminAttributeApi;
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
    String delegatedAdminAttributeName = "delegatedAdminAttributeName_example"; // Name of the Delegated Admin Attribute
    String restResourceTypeName = "restResourceTypeName_example"; // Name of the REST Resource Type
    try {
      Object result = client
              .delegatedAdminAttribute
              .updateByName(operations, delegatedAdminAttributeName, restResourceTypeName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .delegatedAdminAttribute
              .updateByName(operations, delegatedAdminAttributeName, restResourceTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DelegatedAdminAttributeApi#updateByName");
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
| **delegatedAdminAttributeName** | **String**| Name of the Delegated Admin Attribute | |
| **restResourceTypeName** | **String**| Name of the REST Resource Type | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Delegated Admin Attribute | |

### Return type

**Object**

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
| **404** | The Delegated Admin Attribute does not exist |  -  |


# OtpDeliveryMechanismApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewMethod**](OtpDeliveryMechanismApi.md#addNewMethod) | **POST** /otp-delivery-mechanisms | Add a new OTP Delivery Mechanism to the config |
| [**deleteDeliveryMechanism**](OtpDeliveryMechanismApi.md#deleteDeliveryMechanism) | **DELETE** /otp-delivery-mechanisms/{otp-delivery-mechanism-name} | Delete a OTP Delivery Mechanism |
| [**getSingleDeliveryMechanism**](OtpDeliveryMechanismApi.md#getSingleDeliveryMechanism) | **GET** /otp-delivery-mechanisms/{otp-delivery-mechanism-name} | Returns a single OTP Delivery Mechanism |
| [**listAll**](OtpDeliveryMechanismApi.md#listAll) | **GET** /otp-delivery-mechanisms | Returns a list of all OTP Delivery Mechanism objects |
| [**updateByOtpDeliveryMechanismName**](OtpDeliveryMechanismApi.md#updateByOtpDeliveryMechanismName) | **PATCH** /otp-delivery-mechanisms/{otp-delivery-mechanism-name} | Update an existing OTP Delivery Mechanism by name |


<a name="addNewMethod"></a>
# **addNewMethod**
> Object addNewMethod(body).execute();

Add a new OTP Delivery Mechanism to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OtpDeliveryMechanismApi;
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
    try {
      Object result = client
              .otpDeliveryMechanism
              .addNewMethod()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpDeliveryMechanismApi#addNewMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .otpDeliveryMechanism
              .addNewMethod()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpDeliveryMechanismApi#addNewMethod");
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
| **body** | **Object**| Create a new OTP Delivery Mechanism in the config | |

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
| **409** | The OTP Delivery Mechanism already exists |  -  |

<a name="deleteDeliveryMechanism"></a>
# **deleteDeliveryMechanism**
> deleteDeliveryMechanism(otpDeliveryMechanismName).execute();

Delete a OTP Delivery Mechanism

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OtpDeliveryMechanismApi;
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
    String otpDeliveryMechanismName = "otpDeliveryMechanismName_example"; // Name of the OTP Delivery Mechanism
    try {
      client
              .otpDeliveryMechanism
              .deleteDeliveryMechanism(otpDeliveryMechanismName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpDeliveryMechanismApi#deleteDeliveryMechanism");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .otpDeliveryMechanism
              .deleteDeliveryMechanism(otpDeliveryMechanismName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpDeliveryMechanismApi#deleteDeliveryMechanism");
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
| **otpDeliveryMechanismName** | **String**| Name of the OTP Delivery Mechanism | |

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
| **404** | The OTP Delivery Mechanism does not exist |  -  |
| **409** | The OTP Delivery Mechanism cannot be deleted |  -  |

<a name="getSingleDeliveryMechanism"></a>
# **getSingleDeliveryMechanism**
> Object getSingleDeliveryMechanism(otpDeliveryMechanismName).execute();

Returns a single OTP Delivery Mechanism

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OtpDeliveryMechanismApi;
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
    String otpDeliveryMechanismName = "otpDeliveryMechanismName_example"; // Name of the OTP Delivery Mechanism
    try {
      Object result = client
              .otpDeliveryMechanism
              .getSingleDeliveryMechanism(otpDeliveryMechanismName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpDeliveryMechanismApi#getSingleDeliveryMechanism");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .otpDeliveryMechanism
              .getSingleDeliveryMechanism(otpDeliveryMechanismName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpDeliveryMechanismApi#getSingleDeliveryMechanism");
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
| **otpDeliveryMechanismName** | **String**| Name of the OTP Delivery Mechanism | |

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
| **404** | The OTP Delivery Mechanism does not exist |  -  |

<a name="listAll"></a>
# **listAll**
> OtpDeliveryMechanismListResponse listAll().filter(filter).execute();

Returns a list of all OTP Delivery Mechanism objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OtpDeliveryMechanismApi;
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
      OtpDeliveryMechanismListResponse result = client
              .otpDeliveryMechanism
              .listAll()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpDeliveryMechanismApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OtpDeliveryMechanismListResponse> response = client
              .otpDeliveryMechanism
              .listAll()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpDeliveryMechanismApi#listAll");
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

[**OtpDeliveryMechanismListResponse**](OtpDeliveryMechanismListResponse.md)

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

<a name="updateByOtpDeliveryMechanismName"></a>
# **updateByOtpDeliveryMechanismName**
> Object updateByOtpDeliveryMechanismName(otpDeliveryMechanismName, updateRequest).execute();

Update an existing OTP Delivery Mechanism by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OtpDeliveryMechanismApi;
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
    String otpDeliveryMechanismName = "otpDeliveryMechanismName_example"; // Name of the OTP Delivery Mechanism
    try {
      Object result = client
              .otpDeliveryMechanism
              .updateByOtpDeliveryMechanismName(operations, otpDeliveryMechanismName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpDeliveryMechanismApi#updateByOtpDeliveryMechanismName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .otpDeliveryMechanism
              .updateByOtpDeliveryMechanismName(operations, otpDeliveryMechanismName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OtpDeliveryMechanismApi#updateByOtpDeliveryMechanismName");
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
| **otpDeliveryMechanismName** | **String**| Name of the OTP Delivery Mechanism | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing OTP Delivery Mechanism | |

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
| **404** | The OTP Delivery Mechanism does not exist |  -  |


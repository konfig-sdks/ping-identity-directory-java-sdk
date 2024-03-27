# TokenClaimValidationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewClaimValidation**](TokenClaimValidationApi.md#addNewClaimValidation) | **POST** /id-token-validators/{id-token-validator-name}/token-claim-validations | Add a new Token Claim Validation to the config |
| [**deleteClaimValidation**](TokenClaimValidationApi.md#deleteClaimValidation) | **DELETE** /id-token-validators/{id-token-validator-name}/token-claim-validations/{token-claim-validation-name} | Delete a Token Claim Validation |
| [**getSingleClaimValidation**](TokenClaimValidationApi.md#getSingleClaimValidation) | **GET** /id-token-validators/{id-token-validator-name}/token-claim-validations/{token-claim-validation-name} | Returns a single Token Claim Validation |
| [**listTokenClaimValidations**](TokenClaimValidationApi.md#listTokenClaimValidations) | **GET** /id-token-validators/{id-token-validator-name}/token-claim-validations | Returns a list of all Token Claim Validation objects |
| [**updateClaimValidationByName**](TokenClaimValidationApi.md#updateClaimValidationByName) | **PATCH** /id-token-validators/{id-token-validator-name}/token-claim-validations/{token-claim-validation-name} | Update an existing Token Claim Validation by name |


<a name="addNewClaimValidation"></a>
# **addNewClaimValidation**
> Object addNewClaimValidation(idTokenValidatorName, body).execute();

Add a new Token Claim Validation to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenClaimValidationApi;
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
    String idTokenValidatorName = "idTokenValidatorName_example"; // Name of the ID Token Validator
    try {
      Object result = client
              .tokenClaimValidation
              .addNewClaimValidation(idTokenValidatorName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenClaimValidationApi#addNewClaimValidation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .tokenClaimValidation
              .addNewClaimValidation(idTokenValidatorName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenClaimValidationApi#addNewClaimValidation");
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
| **idTokenValidatorName** | **String**| Name of the ID Token Validator | |
| **body** | **Object**| Create a new Token Claim Validation in the config | |

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
| **409** | The Token Claim Validation already exists |  -  |

<a name="deleteClaimValidation"></a>
# **deleteClaimValidation**
> deleteClaimValidation(tokenClaimValidationName, idTokenValidatorName).execute();

Delete a Token Claim Validation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenClaimValidationApi;
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
    String tokenClaimValidationName = "tokenClaimValidationName_example"; // Name of the Token Claim Validation
    String idTokenValidatorName = "idTokenValidatorName_example"; // Name of the ID Token Validator
    try {
      client
              .tokenClaimValidation
              .deleteClaimValidation(tokenClaimValidationName, idTokenValidatorName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenClaimValidationApi#deleteClaimValidation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .tokenClaimValidation
              .deleteClaimValidation(tokenClaimValidationName, idTokenValidatorName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenClaimValidationApi#deleteClaimValidation");
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
| **tokenClaimValidationName** | **String**| Name of the Token Claim Validation | |
| **idTokenValidatorName** | **String**| Name of the ID Token Validator | |

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
| **404** | The Token Claim Validation does not exist |  -  |
| **409** | The Token Claim Validation cannot be deleted |  -  |

<a name="getSingleClaimValidation"></a>
# **getSingleClaimValidation**
> Object getSingleClaimValidation(tokenClaimValidationName, idTokenValidatorName).execute();

Returns a single Token Claim Validation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenClaimValidationApi;
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
    String tokenClaimValidationName = "tokenClaimValidationName_example"; // Name of the Token Claim Validation
    String idTokenValidatorName = "idTokenValidatorName_example"; // Name of the ID Token Validator
    try {
      Object result = client
              .tokenClaimValidation
              .getSingleClaimValidation(tokenClaimValidationName, idTokenValidatorName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenClaimValidationApi#getSingleClaimValidation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .tokenClaimValidation
              .getSingleClaimValidation(tokenClaimValidationName, idTokenValidatorName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenClaimValidationApi#getSingleClaimValidation");
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
| **tokenClaimValidationName** | **String**| Name of the Token Claim Validation | |
| **idTokenValidatorName** | **String**| Name of the ID Token Validator | |

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
| **404** | The Token Claim Validation does not exist |  -  |

<a name="listTokenClaimValidations"></a>
# **listTokenClaimValidations**
> TokenClaimValidationListResponse listTokenClaimValidations(idTokenValidatorName).filter(filter).execute();

Returns a list of all Token Claim Validation objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenClaimValidationApi;
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
    String idTokenValidatorName = "idTokenValidatorName_example"; // Name of the ID Token Validator
    String filter = "filter_example"; // SCIM filter
    try {
      TokenClaimValidationListResponse result = client
              .tokenClaimValidation
              .listTokenClaimValidations(idTokenValidatorName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenClaimValidationApi#listTokenClaimValidations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TokenClaimValidationListResponse> response = client
              .tokenClaimValidation
              .listTokenClaimValidations(idTokenValidatorName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenClaimValidationApi#listTokenClaimValidations");
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
| **idTokenValidatorName** | **String**| Name of the ID Token Validator | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**TokenClaimValidationListResponse**](TokenClaimValidationListResponse.md)

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

<a name="updateClaimValidationByName"></a>
# **updateClaimValidationByName**
> Object updateClaimValidationByName(tokenClaimValidationName, idTokenValidatorName, updateRequest).execute();

Update an existing Token Claim Validation by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenClaimValidationApi;
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
    String tokenClaimValidationName = "tokenClaimValidationName_example"; // Name of the Token Claim Validation
    String idTokenValidatorName = "idTokenValidatorName_example"; // Name of the ID Token Validator
    try {
      Object result = client
              .tokenClaimValidation
              .updateClaimValidationByName(operations, tokenClaimValidationName, idTokenValidatorName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenClaimValidationApi#updateClaimValidationByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .tokenClaimValidation
              .updateClaimValidationByName(operations, tokenClaimValidationName, idTokenValidatorName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenClaimValidationApi#updateClaimValidationByName");
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
| **tokenClaimValidationName** | **String**| Name of the Token Claim Validation | |
| **idTokenValidatorName** | **String**| Name of the ID Token Validator | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Token Claim Validation | |

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
| **404** | The Token Claim Validation does not exist |  -  |


# KeyPairApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewKeyPair**](KeyPairApi.md#createNewKeyPair) | **POST** /key-pairs | Add a new Key Pair to the config |
| [**deleteKeyPair**](KeyPairApi.md#deleteKeyPair) | **DELETE** /key-pairs/{key-pair-name} | Delete a Key Pair |
| [**getSingleKeyPair**](KeyPairApi.md#getSingleKeyPair) | **GET** /key-pairs/{key-pair-name} | Returns a single Key Pair |
| [**listObjects**](KeyPairApi.md#listObjects) | **GET** /key-pairs | Returns a list of all Key Pair objects |
| [**updateByName**](KeyPairApi.md#updateByName) | **PATCH** /key-pairs/{key-pair-name} | Update an existing Key Pair by name |


<a name="createNewKeyPair"></a>
# **createNewKeyPair**
> KeyPairResponse createNewKeyPair(addKeyPairRequest).execute();

Add a new Key Pair to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KeyPairApi;
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
    String pairName = "pairName_example"; // Name of the new Key Pair
    List<EnumkeyPairSchemaUrn> schemas = Arrays.asList();
    EnumkeyPairKeyAlgorithmProp keyAlgorithm = EnumkeyPairKeyAlgorithmProp.fromValue("RSA_2048");
    String selfSignedCertificateValidity = "selfSignedCertificateValidity_example"; // The validity period for a self-signed certificate. If not specified, the self-signed certificate will be valid for approximately 20 years. This is not used when importing an existing key-pair. The system will not automatically rotate expired certificates. It is up to the administrator to do that when that happens.
    String subjectDN = "subjectDN_example"; // The DN that should be used as the subject for the self-signed certificate and certificate signing request. This is not used when importing an existing key-pair.
    String certificateChain = "certificateChain_example"; // The PEM-encoded X.509 certificate chain.
    String privateKey = "privateKey_example"; // The base64-encoded private key that is encrypted using the preferred encryption settings definition.
    try {
      KeyPairResponse result = client
              .keyPair
              .createNewKeyPair(pairName)
              .schemas(schemas)
              .keyAlgorithm(keyAlgorithm)
              .selfSignedCertificateValidity(selfSignedCertificateValidity)
              .subjectDN(subjectDN)
              .certificateChain(certificateChain)
              .privateKey(privateKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getKeyAlgorithm());
      System.out.println(result.getSelfSignedCertificateValidity());
      System.out.println(result.getSubjectDN());
      System.out.println(result.getCertificateChain());
      System.out.println(result.getPrivateKey());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#createNewKeyPair");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeyPairResponse> response = client
              .keyPair
              .createNewKeyPair(pairName)
              .schemas(schemas)
              .keyAlgorithm(keyAlgorithm)
              .selfSignedCertificateValidity(selfSignedCertificateValidity)
              .subjectDN(subjectDN)
              .certificateChain(certificateChain)
              .privateKey(privateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#createNewKeyPair");
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
| **addKeyPairRequest** | [**AddKeyPairRequest**](AddKeyPairRequest.md)| Create a new Key Pair in the config | |

### Return type

[**KeyPairResponse**](KeyPairResponse.md)

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
| **409** | The Key Pair already exists |  -  |

<a name="deleteKeyPair"></a>
# **deleteKeyPair**
> deleteKeyPair(keyPairName).execute();

Delete a Key Pair

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KeyPairApi;
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
    String keyPairName = "keyPairName_example"; // Name of the Key Pair
    try {
      client
              .keyPair
              .deleteKeyPair(keyPairName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#deleteKeyPair");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .keyPair
              .deleteKeyPair(keyPairName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#deleteKeyPair");
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
| **keyPairName** | **String**| Name of the Key Pair | |

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
| **404** | The Key Pair does not exist |  -  |
| **409** | The Key Pair cannot be deleted |  -  |

<a name="getSingleKeyPair"></a>
# **getSingleKeyPair**
> KeyPairResponse getSingleKeyPair(keyPairName).execute();

Returns a single Key Pair

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KeyPairApi;
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
    String keyPairName = "keyPairName_example"; // Name of the Key Pair
    try {
      KeyPairResponse result = client
              .keyPair
              .getSingleKeyPair(keyPairName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getKeyAlgorithm());
      System.out.println(result.getSelfSignedCertificateValidity());
      System.out.println(result.getSubjectDN());
      System.out.println(result.getCertificateChain());
      System.out.println(result.getPrivateKey());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#getSingleKeyPair");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeyPairResponse> response = client
              .keyPair
              .getSingleKeyPair(keyPairName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#getSingleKeyPair");
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
| **keyPairName** | **String**| Name of the Key Pair | |

### Return type

[**KeyPairResponse**](KeyPairResponse.md)

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
| **404** | The Key Pair does not exist |  -  |

<a name="listObjects"></a>
# **listObjects**
> KeyPairListResponse listObjects().filter(filter).execute();

Returns a list of all Key Pair objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KeyPairApi;
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
      KeyPairListResponse result = client
              .keyPair
              .listObjects()
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#listObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeyPairListResponse> response = client
              .keyPair
              .listObjects()
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#listObjects");
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

[**KeyPairListResponse**](KeyPairListResponse.md)

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
> KeyPairResponse updateByName(keyPairName, updateRequest).execute();

Update an existing Key Pair by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.KeyPairApi;
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
    String keyPairName = "keyPairName_example"; // Name of the Key Pair
    try {
      KeyPairResponse result = client
              .keyPair
              .updateByName(operations, keyPairName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getKeyAlgorithm());
      System.out.println(result.getSelfSignedCertificateValidity());
      System.out.println(result.getSubjectDN());
      System.out.println(result.getCertificateChain());
      System.out.println(result.getPrivateKey());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeyPairResponse> response = client
              .keyPair
              .updateByName(operations, keyPairName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#updateByName");
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
| **keyPairName** | **String**| Name of the Key Pair | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Key Pair | |

### Return type

[**KeyPairResponse**](KeyPairResponse.md)

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
| **404** | The Key Pair does not exist |  -  |


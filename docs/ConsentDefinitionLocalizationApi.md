# ConsentDefinitionLocalizationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNew**](ConsentDefinitionLocalizationApi.md#addNew) | **POST** /consent-definitions/{consent-definition-name}/consent-definition-localizations | Add a new Consent Definition Localization to the config |
| [**deleteLocalization**](ConsentDefinitionLocalizationApi.md#deleteLocalization) | **DELETE** /consent-definitions/{consent-definition-name}/consent-definition-localizations/{consent-definition-localization-name} | Delete a Consent Definition Localization |
| [**getAllObjects**](ConsentDefinitionLocalizationApi.md#getAllObjects) | **GET** /consent-definitions/{consent-definition-name}/consent-definition-localizations | Returns a list of all Consent Definition Localization objects |
| [**getSingle**](ConsentDefinitionLocalizationApi.md#getSingle) | **GET** /consent-definitions/{consent-definition-name}/consent-definition-localizations/{consent-definition-localization-name} | Returns a single Consent Definition Localization |
| [**updateByName**](ConsentDefinitionLocalizationApi.md#updateByName) | **PATCH** /consent-definitions/{consent-definition-name}/consent-definition-localizations/{consent-definition-localization-name} | Update an existing Consent Definition Localization by name |


<a name="addNew"></a>
# **addNew**
> ConsentDefinitionLocalizationResponse addNew(consentDefinitionName, addConsentDefinitionLocalizationRequest).execute();

Add a new Consent Definition Localization to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsentDefinitionLocalizationApi;
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
    String localizationName = "localizationName_example"; // Name of the new Consent Definition Localization
    String consentDefinitionName = "consentDefinitionName_example"; // Name of the Consent Definition
    String version = "version_example"; // The version of this Consent Definition Localization, using the format MAJOR.MINOR.
    List<EnumconsentDefinitionLocalizationSchemaUrn> schemas = Arrays.asList();
    String locale = "locale_example"; // The locale of this Consent Definition Localization.
    String titleText = "titleText_example"; // Localized text that may be used to provide a title or summary for a consent request or a granted consent.
    String dataText = "dataText_example"; // Localized text describing the data to be shared.
    String purposeText = "purposeText_example"; // Localized text describing how the data is to be used.
    try {
      ConsentDefinitionLocalizationResponse result = client
              .consentDefinitionLocalization
              .addNew(localizationName, consentDefinitionName)
              .version(version)
              .schemas(schemas)
              .locale(locale)
              .titleText(titleText)
              .dataText(dataText)
              .purposeText(purposeText)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getVersion());
      System.out.println(result.getSchemas());
      System.out.println(result.getLocale());
      System.out.println(result.getTitleText());
      System.out.println(result.getDataText());
      System.out.println(result.getPurposeText());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentDefinitionLocalizationApi#addNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsentDefinitionLocalizationResponse> response = client
              .consentDefinitionLocalization
              .addNew(localizationName, consentDefinitionName)
              .version(version)
              .schemas(schemas)
              .locale(locale)
              .titleText(titleText)
              .dataText(dataText)
              .purposeText(purposeText)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentDefinitionLocalizationApi#addNew");
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
| **consentDefinitionName** | **String**| Name of the Consent Definition | |
| **addConsentDefinitionLocalizationRequest** | [**AddConsentDefinitionLocalizationRequest**](AddConsentDefinitionLocalizationRequest.md)| Create a new Consent Definition Localization in the config | |

### Return type

[**ConsentDefinitionLocalizationResponse**](ConsentDefinitionLocalizationResponse.md)

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
| **409** | The Consent Definition Localization already exists |  -  |

<a name="deleteLocalization"></a>
# **deleteLocalization**
> deleteLocalization(consentDefinitionLocalizationName, consentDefinitionName).execute();

Delete a Consent Definition Localization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsentDefinitionLocalizationApi;
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
    String consentDefinitionLocalizationName = "consentDefinitionLocalizationName_example"; // Name of the Consent Definition Localization
    String consentDefinitionName = "consentDefinitionName_example"; // Name of the Consent Definition
    try {
      client
              .consentDefinitionLocalization
              .deleteLocalization(consentDefinitionLocalizationName, consentDefinitionName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentDefinitionLocalizationApi#deleteLocalization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .consentDefinitionLocalization
              .deleteLocalization(consentDefinitionLocalizationName, consentDefinitionName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentDefinitionLocalizationApi#deleteLocalization");
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
| **consentDefinitionLocalizationName** | **String**| Name of the Consent Definition Localization | |
| **consentDefinitionName** | **String**| Name of the Consent Definition | |

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
| **404** | The Consent Definition Localization does not exist |  -  |
| **409** | The Consent Definition Localization cannot be deleted |  -  |

<a name="getAllObjects"></a>
# **getAllObjects**
> ConsentDefinitionLocalizationListResponse getAllObjects(consentDefinitionName).filter(filter).execute();

Returns a list of all Consent Definition Localization objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsentDefinitionLocalizationApi;
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
    String consentDefinitionName = "consentDefinitionName_example"; // Name of the Consent Definition
    String filter = "filter_example"; // SCIM filter
    try {
      ConsentDefinitionLocalizationListResponse result = client
              .consentDefinitionLocalization
              .getAllObjects(consentDefinitionName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentDefinitionLocalizationApi#getAllObjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsentDefinitionLocalizationListResponse> response = client
              .consentDefinitionLocalization
              .getAllObjects(consentDefinitionName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentDefinitionLocalizationApi#getAllObjects");
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
| **consentDefinitionName** | **String**| Name of the Consent Definition | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**ConsentDefinitionLocalizationListResponse**](ConsentDefinitionLocalizationListResponse.md)

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
> ConsentDefinitionLocalizationResponse getSingle(consentDefinitionLocalizationName, consentDefinitionName).execute();

Returns a single Consent Definition Localization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsentDefinitionLocalizationApi;
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
    String consentDefinitionLocalizationName = "consentDefinitionLocalizationName_example"; // Name of the Consent Definition Localization
    String consentDefinitionName = "consentDefinitionName_example"; // Name of the Consent Definition
    try {
      ConsentDefinitionLocalizationResponse result = client
              .consentDefinitionLocalization
              .getSingle(consentDefinitionLocalizationName, consentDefinitionName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getVersion());
      System.out.println(result.getSchemas());
      System.out.println(result.getLocale());
      System.out.println(result.getTitleText());
      System.out.println(result.getDataText());
      System.out.println(result.getPurposeText());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentDefinitionLocalizationApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsentDefinitionLocalizationResponse> response = client
              .consentDefinitionLocalization
              .getSingle(consentDefinitionLocalizationName, consentDefinitionName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentDefinitionLocalizationApi#getSingle");
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
| **consentDefinitionLocalizationName** | **String**| Name of the Consent Definition Localization | |
| **consentDefinitionName** | **String**| Name of the Consent Definition | |

### Return type

[**ConsentDefinitionLocalizationResponse**](ConsentDefinitionLocalizationResponse.md)

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
| **404** | The Consent Definition Localization does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> ConsentDefinitionLocalizationResponse updateByName(consentDefinitionLocalizationName, consentDefinitionName, updateRequest).execute();

Update an existing Consent Definition Localization by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsentDefinitionLocalizationApi;
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
    String consentDefinitionLocalizationName = "consentDefinitionLocalizationName_example"; // Name of the Consent Definition Localization
    String consentDefinitionName = "consentDefinitionName_example"; // Name of the Consent Definition
    try {
      ConsentDefinitionLocalizationResponse result = client
              .consentDefinitionLocalization
              .updateByName(operations, consentDefinitionLocalizationName, consentDefinitionName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getVersion());
      System.out.println(result.getSchemas());
      System.out.println(result.getLocale());
      System.out.println(result.getTitleText());
      System.out.println(result.getDataText());
      System.out.println(result.getPurposeText());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentDefinitionLocalizationApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsentDefinitionLocalizationResponse> response = client
              .consentDefinitionLocalization
              .updateByName(operations, consentDefinitionLocalizationName, consentDefinitionName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsentDefinitionLocalizationApi#updateByName");
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
| **consentDefinitionLocalizationName** | **String**| Name of the Consent Definition Localization | |
| **consentDefinitionName** | **String**| Name of the Consent Definition | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Consent Definition Localization | |

### Return type

[**ConsentDefinitionLocalizationResponse**](ConsentDefinitionLocalizationResponse.md)

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
| **404** | The Consent Definition Localization does not exist |  -  |


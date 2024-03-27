# LdapCorrelationAttributePairApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewPairToConfig**](LdapCorrelationAttributePairApi.md#addNewPairToConfig) | **POST** /scim-resource-types/{scim-resource-type-name}/correlated-ldap-data-views/{correlated-ldap-data-view-name}/ldap-correlation-attribute-pairs | Add a new LDAP Correlation Attribute Pair to the config |
| [**delete**](LdapCorrelationAttributePairApi.md#delete) | **DELETE** /scim-resource-types/{scim-resource-type-name}/correlated-ldap-data-views/{correlated-ldap-data-view-name}/ldap-correlation-attribute-pairs/{ldap-correlation-attribute-pair-name} | Delete a LDAP Correlation Attribute Pair |
| [**getSingle**](LdapCorrelationAttributePairApi.md#getSingle) | **GET** /scim-resource-types/{scim-resource-type-name}/correlated-ldap-data-views/{correlated-ldap-data-view-name}/ldap-correlation-attribute-pairs/{ldap-correlation-attribute-pair-name} | Returns a single LDAP Correlation Attribute Pair |
| [**listCorrelationAttributePairs**](LdapCorrelationAttributePairApi.md#listCorrelationAttributePairs) | **GET** /scim-resource-types/{scim-resource-type-name}/correlated-ldap-data-views/{correlated-ldap-data-view-name}/ldap-correlation-attribute-pairs | Returns a list of all LDAP Correlation Attribute Pair objects |
| [**updateByName**](LdapCorrelationAttributePairApi.md#updateByName) | **PATCH** /scim-resource-types/{scim-resource-type-name}/correlated-ldap-data-views/{correlated-ldap-data-view-name}/ldap-correlation-attribute-pairs/{ldap-correlation-attribute-pair-name} | Update an existing LDAP Correlation Attribute Pair by name |


<a name="addNewPairToConfig"></a>
# **addNewPairToConfig**
> LdapCorrelationAttributePairResponse addNewPairToConfig(correlatedLdapDataViewName, scimResourceTypeName, addLdapCorrelationAttributePairRequest).execute();

Add a new LDAP Correlation Attribute Pair to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LdapCorrelationAttributePairApi;
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
    String pairName = "pairName_example"; // Name of the new LDAP Correlation Attribute Pair
    String correlatedLdapDataViewName = "correlatedLdapDataViewName_example"; // Name of the Correlated LDAP Data View
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    List<EnumldapCorrelationAttributePairSchemaUrn> schemas = Arrays.asList();
    String primaryCorrelationAttribute = "primaryCorrelationAttribute_example"; // The LDAP attribute from the base SCIM Resource Type whose value will be used to match objects in the Correlated LDAP Data View.
    String secondaryCorrelationAttribute = "secondaryCorrelationAttribute_example"; // The LDAP attribute from the Correlated LDAP Data View whose value will be matched.
    try {
      LdapCorrelationAttributePairResponse result = client
              .ldapCorrelationAttributePair
              .addNewPairToConfig(pairName, correlatedLdapDataViewName, scimResourceTypeName)
              .schemas(schemas)
              .primaryCorrelationAttribute(primaryCorrelationAttribute)
              .secondaryCorrelationAttribute(secondaryCorrelationAttribute)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getPrimaryCorrelationAttribute());
      System.out.println(result.getSecondaryCorrelationAttribute());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapCorrelationAttributePairApi#addNewPairToConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LdapCorrelationAttributePairResponse> response = client
              .ldapCorrelationAttributePair
              .addNewPairToConfig(pairName, correlatedLdapDataViewName, scimResourceTypeName)
              .schemas(schemas)
              .primaryCorrelationAttribute(primaryCorrelationAttribute)
              .secondaryCorrelationAttribute(secondaryCorrelationAttribute)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapCorrelationAttributePairApi#addNewPairToConfig");
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
| **correlatedLdapDataViewName** | **String**| Name of the Correlated LDAP Data View | |
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |
| **addLdapCorrelationAttributePairRequest** | [**AddLdapCorrelationAttributePairRequest**](AddLdapCorrelationAttributePairRequest.md)| Create a new LDAP Correlation Attribute Pair in the config | |

### Return type

[**LdapCorrelationAttributePairResponse**](LdapCorrelationAttributePairResponse.md)

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
| **409** | The LDAP Correlation Attribute Pair already exists |  -  |

<a name="delete"></a>
# **delete**
> delete(ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName).execute();

Delete a LDAP Correlation Attribute Pair

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LdapCorrelationAttributePairApi;
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
    String ldapCorrelationAttributePairName = "ldapCorrelationAttributePairName_example"; // Name of the LDAP Correlation Attribute Pair
    String correlatedLdapDataViewName = "correlatedLdapDataViewName_example"; // Name of the Correlated LDAP Data View
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    try {
      client
              .ldapCorrelationAttributePair
              .delete(ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapCorrelationAttributePairApi#delete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ldapCorrelationAttributePair
              .delete(ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapCorrelationAttributePairApi#delete");
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
| **ldapCorrelationAttributePairName** | **String**| Name of the LDAP Correlation Attribute Pair | |
| **correlatedLdapDataViewName** | **String**| Name of the Correlated LDAP Data View | |
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |

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
| **404** | The LDAP Correlation Attribute Pair does not exist |  -  |
| **409** | The LDAP Correlation Attribute Pair cannot be deleted |  -  |

<a name="getSingle"></a>
# **getSingle**
> LdapCorrelationAttributePairResponse getSingle(ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName).execute();

Returns a single LDAP Correlation Attribute Pair

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LdapCorrelationAttributePairApi;
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
    String ldapCorrelationAttributePairName = "ldapCorrelationAttributePairName_example"; // Name of the LDAP Correlation Attribute Pair
    String correlatedLdapDataViewName = "correlatedLdapDataViewName_example"; // Name of the Correlated LDAP Data View
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    try {
      LdapCorrelationAttributePairResponse result = client
              .ldapCorrelationAttributePair
              .getSingle(ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getPrimaryCorrelationAttribute());
      System.out.println(result.getSecondaryCorrelationAttribute());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapCorrelationAttributePairApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LdapCorrelationAttributePairResponse> response = client
              .ldapCorrelationAttributePair
              .getSingle(ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapCorrelationAttributePairApi#getSingle");
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
| **ldapCorrelationAttributePairName** | **String**| Name of the LDAP Correlation Attribute Pair | |
| **correlatedLdapDataViewName** | **String**| Name of the Correlated LDAP Data View | |
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |

### Return type

[**LdapCorrelationAttributePairResponse**](LdapCorrelationAttributePairResponse.md)

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
| **404** | The LDAP Correlation Attribute Pair does not exist |  -  |

<a name="listCorrelationAttributePairs"></a>
# **listCorrelationAttributePairs**
> LdapCorrelationAttributePairListResponse listCorrelationAttributePairs(correlatedLdapDataViewName, scimResourceTypeName).filter(filter).execute();

Returns a list of all LDAP Correlation Attribute Pair objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LdapCorrelationAttributePairApi;
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
    String correlatedLdapDataViewName = "correlatedLdapDataViewName_example"; // Name of the Correlated LDAP Data View
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    String filter = "filter_example"; // SCIM filter
    try {
      LdapCorrelationAttributePairListResponse result = client
              .ldapCorrelationAttributePair
              .listCorrelationAttributePairs(correlatedLdapDataViewName, scimResourceTypeName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapCorrelationAttributePairApi#listCorrelationAttributePairs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LdapCorrelationAttributePairListResponse> response = client
              .ldapCorrelationAttributePair
              .listCorrelationAttributePairs(correlatedLdapDataViewName, scimResourceTypeName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapCorrelationAttributePairApi#listCorrelationAttributePairs");
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
| **correlatedLdapDataViewName** | **String**| Name of the Correlated LDAP Data View | |
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**LdapCorrelationAttributePairListResponse**](LdapCorrelationAttributePairListResponse.md)

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
> LdapCorrelationAttributePairResponse updateByName(ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName, updateRequest).execute();

Update an existing LDAP Correlation Attribute Pair by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LdapCorrelationAttributePairApi;
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
    String ldapCorrelationAttributePairName = "ldapCorrelationAttributePairName_example"; // Name of the LDAP Correlation Attribute Pair
    String correlatedLdapDataViewName = "correlatedLdapDataViewName_example"; // Name of the Correlated LDAP Data View
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    try {
      LdapCorrelationAttributePairResponse result = client
              .ldapCorrelationAttributePair
              .updateByName(operations, ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getPrimaryCorrelationAttribute());
      System.out.println(result.getSecondaryCorrelationAttribute());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapCorrelationAttributePairApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LdapCorrelationAttributePairResponse> response = client
              .ldapCorrelationAttributePair
              .updateByName(operations, ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LdapCorrelationAttributePairApi#updateByName");
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
| **ldapCorrelationAttributePairName** | **String**| Name of the LDAP Correlation Attribute Pair | |
| **correlatedLdapDataViewName** | **String**| Name of the Correlated LDAP Data View | |
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing LDAP Correlation Attribute Pair | |

### Return type

[**LdapCorrelationAttributePairResponse**](LdapCorrelationAttributePairResponse.md)

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
| **404** | The LDAP Correlation Attribute Pair does not exist |  -  |


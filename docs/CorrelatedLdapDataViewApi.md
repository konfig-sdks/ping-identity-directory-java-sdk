# CorrelatedLdapDataViewApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewConfig**](CorrelatedLdapDataViewApi.md#addNewConfig) | **POST** /scim-resource-types/{scim-resource-type-name}/correlated-ldap-data-views | Add a new Correlated LDAP Data View to the config |
| [**deleteCorrelatedLdapDataView**](CorrelatedLdapDataViewApi.md#deleteCorrelatedLdapDataView) | **DELETE** /scim-resource-types/{scim-resource-type-name}/correlated-ldap-data-views/{correlated-ldap-data-view-name} | Delete a Correlated LDAP Data View |
| [**getList**](CorrelatedLdapDataViewApi.md#getList) | **GET** /scim-resource-types/{scim-resource-type-name}/correlated-ldap-data-views | Returns a list of all Correlated LDAP Data View objects |
| [**getSingle**](CorrelatedLdapDataViewApi.md#getSingle) | **GET** /scim-resource-types/{scim-resource-type-name}/correlated-ldap-data-views/{correlated-ldap-data-view-name} | Returns a single Correlated LDAP Data View |
| [**updateByName**](CorrelatedLdapDataViewApi.md#updateByName) | **PATCH** /scim-resource-types/{scim-resource-type-name}/correlated-ldap-data-views/{correlated-ldap-data-view-name} | Update an existing Correlated LDAP Data View by name |


<a name="addNewConfig"></a>
# **addNewConfig**
> CorrelatedLdapDataViewResponse addNewConfig(scimResourceTypeName, addCorrelatedLdapDataViewRequest).execute();

Add a new Correlated LDAP Data View to the config

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CorrelatedLdapDataViewApi;
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
    String viewName = "viewName_example"; // Name of the new Correlated LDAP Data View
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    List<EnumcorrelatedLdapDataViewSchemaUrn> schemas = Arrays.asList();
    String structuralLDAPObjectclass = "structuralLDAPObjectclass_example"; // Specifies the LDAP structural object class that should be exposed by this Correlated LDAP Data View.
    List<String> auxiliaryLDAPObjectclass = Arrays.asList(); // Specifies an auxiliary LDAP object class that should be exposed by this Correlated LDAP Data View.
    String includeBaseDN = "includeBaseDN_example"; // Specifies the base DN of the branch of the LDAP directory that can be accessed by this Correlated LDAP Data View.
    List<String> includeFilter = Arrays.asList(); // The set of LDAP filters that define the LDAP entries that should be included in this Correlated LDAP Data View.
    List<String> includeOperationalAttribute = Arrays.asList(); // Specifies the set of operational LDAP attributes to be provided by this Correlated LDAP Data View.
    String createDNPattern = "createDNPattern_example"; // Specifies the template to use for the DN when creating new entries.
    String primaryCorrelationAttribute = "primaryCorrelationAttribute_example"; // The LDAP attribute from the parent SCIM Resource Type whose value will be used to match objects in the Correlated LDAP Data View. If multiple correlation attributes are required they may be created using additional correlation-attribute-pairs.
    String secondaryCorrelationAttribute = "secondaryCorrelationAttribute_example"; // The LDAP attribute from the Correlated LDAP Data View whose value will be matched with the primary-correlation-attribute. If multiple correlation attributes are required they may be specified by creating additional correlation-attribute-pairs.
    try {
      CorrelatedLdapDataViewResponse result = client
              .correlatedLdapDataView
              .addNewConfig(viewName, scimResourceTypeName)
              .schemas(schemas)
              .structuralLDAPObjectclass(structuralLDAPObjectclass)
              .auxiliaryLDAPObjectclass(auxiliaryLDAPObjectclass)
              .includeBaseDN(includeBaseDN)
              .includeFilter(includeFilter)
              .includeOperationalAttribute(includeOperationalAttribute)
              .createDNPattern(createDNPattern)
              .primaryCorrelationAttribute(primaryCorrelationAttribute)
              .secondaryCorrelationAttribute(secondaryCorrelationAttribute)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getStructuralLDAPObjectclass());
      System.out.println(result.getAuxiliaryLDAPObjectclass());
      System.out.println(result.getIncludeBaseDN());
      System.out.println(result.getIncludeFilter());
      System.out.println(result.getIncludeOperationalAttribute());
      System.out.println(result.getCreateDNPattern());
      System.out.println(result.getPrimaryCorrelationAttribute());
      System.out.println(result.getSecondaryCorrelationAttribute());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling CorrelatedLdapDataViewApi#addNewConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CorrelatedLdapDataViewResponse> response = client
              .correlatedLdapDataView
              .addNewConfig(viewName, scimResourceTypeName)
              .schemas(schemas)
              .structuralLDAPObjectclass(structuralLDAPObjectclass)
              .auxiliaryLDAPObjectclass(auxiliaryLDAPObjectclass)
              .includeBaseDN(includeBaseDN)
              .includeFilter(includeFilter)
              .includeOperationalAttribute(includeOperationalAttribute)
              .createDNPattern(createDNPattern)
              .primaryCorrelationAttribute(primaryCorrelationAttribute)
              .secondaryCorrelationAttribute(secondaryCorrelationAttribute)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CorrelatedLdapDataViewApi#addNewConfig");
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
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |
| **addCorrelatedLdapDataViewRequest** | [**AddCorrelatedLdapDataViewRequest**](AddCorrelatedLdapDataViewRequest.md)| Create a new Correlated LDAP Data View in the config | |

### Return type

[**CorrelatedLdapDataViewResponse**](CorrelatedLdapDataViewResponse.md)

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
| **409** | The Correlated LDAP Data View already exists |  -  |

<a name="deleteCorrelatedLdapDataView"></a>
# **deleteCorrelatedLdapDataView**
> deleteCorrelatedLdapDataView(correlatedLdapDataViewName, scimResourceTypeName).execute();

Delete a Correlated LDAP Data View

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CorrelatedLdapDataViewApi;
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
    try {
      client
              .correlatedLdapDataView
              .deleteCorrelatedLdapDataView(correlatedLdapDataViewName, scimResourceTypeName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CorrelatedLdapDataViewApi#deleteCorrelatedLdapDataView");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .correlatedLdapDataView
              .deleteCorrelatedLdapDataView(correlatedLdapDataViewName, scimResourceTypeName)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CorrelatedLdapDataViewApi#deleteCorrelatedLdapDataView");
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
| **404** | The Correlated LDAP Data View does not exist |  -  |
| **409** | The Correlated LDAP Data View cannot be deleted |  -  |

<a name="getList"></a>
# **getList**
> CorrelatedLdapDataViewListResponse getList(scimResourceTypeName).filter(filter).execute();

Returns a list of all Correlated LDAP Data View objects

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CorrelatedLdapDataViewApi;
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
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    String filter = "filter_example"; // SCIM filter
    try {
      CorrelatedLdapDataViewListResponse result = client
              .correlatedLdapDataView
              .getList(scimResourceTypeName)
              .filter(filter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getTotalResults());
      System.out.println(result.getResources());
    } catch (ApiException e) {
      System.err.println("Exception when calling CorrelatedLdapDataViewApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CorrelatedLdapDataViewListResponse> response = client
              .correlatedLdapDataView
              .getList(scimResourceTypeName)
              .filter(filter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CorrelatedLdapDataViewApi#getList");
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
| **scimResourceTypeName** | **String**| Name of the SCIM Resource Type | |
| **filter** | **String**| SCIM filter | [optional] |

### Return type

[**CorrelatedLdapDataViewListResponse**](CorrelatedLdapDataViewListResponse.md)

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
> CorrelatedLdapDataViewResponse getSingle(correlatedLdapDataViewName, scimResourceTypeName).execute();

Returns a single Correlated LDAP Data View

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CorrelatedLdapDataViewApi;
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
    try {
      CorrelatedLdapDataViewResponse result = client
              .correlatedLdapDataView
              .getSingle(correlatedLdapDataViewName, scimResourceTypeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getStructuralLDAPObjectclass());
      System.out.println(result.getAuxiliaryLDAPObjectclass());
      System.out.println(result.getIncludeBaseDN());
      System.out.println(result.getIncludeFilter());
      System.out.println(result.getIncludeOperationalAttribute());
      System.out.println(result.getCreateDNPattern());
      System.out.println(result.getPrimaryCorrelationAttribute());
      System.out.println(result.getSecondaryCorrelationAttribute());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling CorrelatedLdapDataViewApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CorrelatedLdapDataViewResponse> response = client
              .correlatedLdapDataView
              .getSingle(correlatedLdapDataViewName, scimResourceTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CorrelatedLdapDataViewApi#getSingle");
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

### Return type

[**CorrelatedLdapDataViewResponse**](CorrelatedLdapDataViewResponse.md)

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
| **404** | The Correlated LDAP Data View does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> CorrelatedLdapDataViewResponse updateByName(correlatedLdapDataViewName, scimResourceTypeName, updateRequest).execute();

Update an existing Correlated LDAP Data View by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CorrelatedLdapDataViewApi;
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
    String correlatedLdapDataViewName = "correlatedLdapDataViewName_example"; // Name of the Correlated LDAP Data View
    String scimResourceTypeName = "scimResourceTypeName_example"; // Name of the SCIM Resource Type
    try {
      CorrelatedLdapDataViewResponse result = client
              .correlatedLdapDataView
              .updateByName(operations, correlatedLdapDataViewName, scimResourceTypeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSchemas());
      System.out.println(result.getStructuralLDAPObjectclass());
      System.out.println(result.getAuxiliaryLDAPObjectclass());
      System.out.println(result.getIncludeBaseDN());
      System.out.println(result.getIncludeFilter());
      System.out.println(result.getIncludeOperationalAttribute());
      System.out.println(result.getCreateDNPattern());
      System.out.println(result.getPrimaryCorrelationAttribute());
      System.out.println(result.getSecondaryCorrelationAttribute());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling CorrelatedLdapDataViewApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CorrelatedLdapDataViewResponse> response = client
              .correlatedLdapDataView
              .updateByName(operations, correlatedLdapDataViewName, scimResourceTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CorrelatedLdapDataViewApi#updateByName");
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
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Correlated LDAP Data View | |

### Return type

[**CorrelatedLdapDataViewResponse**](CorrelatedLdapDataViewResponse.md)

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
| **404** | The Correlated LDAP Data View does not exist |  -  |


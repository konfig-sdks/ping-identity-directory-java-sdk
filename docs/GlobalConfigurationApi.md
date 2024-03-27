# GlobalConfigurationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingleConfig**](GlobalConfigurationApi.md#getSingleConfig) | **GET** /global-configuration | Returns a single Global Configuration |
| [**updateByName**](GlobalConfigurationApi.md#updateByName) | **PATCH** /global-configuration | Update an existing Global Configuration by name |


<a name="getSingleConfig"></a>
# **getSingleConfig**
> GlobalConfigurationResponse getSingleConfig().execute();

Returns a single Global Configuration

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalConfigurationApi;
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
      GlobalConfigurationResponse result = client
              .globalConfiguration
              .getSingleConfig()
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getInstanceName());
      System.out.println(result.getLocation());
      System.out.println(result.getConfigurationServerGroup());
      System.out.println(result.getForceAsMasterForMirroredData());
      System.out.println(result.getEncryptData());
      System.out.println(result.getEncryptionSettingsCipherStreamProvider());
      System.out.println(result.getEncryptBackupsByDefault());
      System.out.println(result.getBackupEncryptionSettingsDefinitionID());
      System.out.println(result.getEncryptLDIFExportsByDefault());
      System.out.println(result.getLdifExportEncryptionSettingsDefinitionID());
      System.out.println(result.getAutomaticallyCompressEncryptedLDIFExports());
      System.out.println(result.getRedactSensitiveValuesInConfigLogs());
      System.out.println(result.getSensitiveAttribute());
      System.out.println(result.getRejectInsecureRequests());
      System.out.println(result.getAllowedInsecureRequestCriteria());
      System.out.println(result.getRejectUnauthenticatedRequests());
      System.out.println(result.getAllowedUnauthenticatedRequestCriteria());
      System.out.println(result.getBindWithDNRequiresPassword());
      System.out.println(result.getDisabledPrivilege());
      System.out.println(result.getDefaultPasswordPolicy());
      System.out.println(result.getMaximumUserDataPasswordPoliciesToCache());
      System.out.println(result.getProxiedAuthorizationIdentityMapper());
      System.out.println(result.getVerifyEntryDigests());
      System.out.println(result.getAllowedInsecureTLSProtocol());
      System.out.println(result.getAllowInsecureLocalJMXConnections());
      System.out.println(result.getDefaultInternalOperationClientConnectionPolicy());
      System.out.println(result.getSizeLimit());
      System.out.println(result.getUnauthenticatedSizeLimit());
      System.out.println(result.getTimeLimit());
      System.out.println(result.getUnauthenticatedTimeLimit());
      System.out.println(result.getIdleTimeLimit());
      System.out.println(result.getUnauthenticatedIdleTimeLimit());
      System.out.println(result.getLookthroughLimit());
      System.out.println(result.getUnauthenticatedLookthroughLimit());
      System.out.println(result.getLdapJoinSizeLimit());
      System.out.println(result.getMaximumConcurrentConnections());
      System.out.println(result.getMaximumConcurrentConnectionsPerIPAddress());
      System.out.println(result.getMaximumConcurrentConnectionsPerBindDN());
      System.out.println(result.getMaximumConcurrentUnindexedSearches());
      System.out.println(result.getMaximumAttributesPerAddRequest());
      System.out.println(result.getMaximumModificationsPerModifyRequest());
      System.out.println(result.getBackgroundThreadForEachPersistentSearch());
      System.out.println(result.getAllowAttributeNameExceptions());
      System.out.println(result.getInvalidAttributeSyntaxBehavior());
      System.out.println(result.getPermitSyntaxViolationsForAttribute());
      System.out.println(result.getSingleStructuralObjectclassBehavior());
      System.out.println(result.getAttributesModifiableWithIgnoreNoUserModificationRequestControl());
      System.out.println(result.getMaximumServerOutLogFileSize());
      System.out.println(result.getMaximumServerOutLogFileCount());
      System.out.println(result.getStartupErrorLoggerOutputLocation());
      System.out.println(result.getExitOnJVMError());
      System.out.println(result.getServerErrorResultCode());
      System.out.println(result.getResultCodeMap());
      System.out.println(result.getReturnBindErrorMessages());
      System.out.println(result.getNotifyAbandonedOperations());
      System.out.println(result.getDuplicateErrorLogLimit());
      System.out.println(result.getDuplicateErrorLogTimeLimit());
      System.out.println(result.getDuplicateAlertLimit());
      System.out.println(result.getDuplicateAlertTimeLimit());
      System.out.println(result.getWritabilityMode());
      System.out.println(result.getUseSharedDatabaseCacheAcrossAllLocalDBBackends());
      System.out.println(result.getSharedLocalDBBackendDatabaseCachePercent());
      System.out.println(result.getUnrecoverableDatabaseErrorMode());
      System.out.println(result.getDatabaseOnVirtualizedOrNetworkStorage());
      System.out.println(result.getAutoNameWithEntryUUIDConnectionCriteria());
      System.out.println(result.getAutoNameWithEntryUUIDRequestCriteria());
      System.out.println(result.getSoftDeletePolicy());
      System.out.println(result.getSubtreeAccessibilityAlertTimeLimit());
      System.out.println(result.getWarnForBackendsWithMultipleBaseDns());
      System.out.println(result.getForcedGCPrimeDuration());
      System.out.println(result.getReplicationSetName());
      System.out.println(result.getStartupMinReplicationBacklogCount());
      System.out.println(result.getReplicationBacklogCountAlertThreshold());
      System.out.println(result.getReplicationBacklogDurationAlertThreshold());
      System.out.println(result.getReplicationAssuranceSourceTimeoutSuspendDuration());
      System.out.println(result.getReplicationAssuranceSourceBacklogFastStartThreshold());
      System.out.println(result.getReplicationHistoryLimit());
      System.out.println(result.getAllowInheritedReplicationOfSubordinateBackends());
      System.out.println(result.getReplicationPurgeObsoleteReplicas());
      System.out.println(result.getSmtpServer());
      System.out.println(result.getMaxSMTPConnectionCount());
      System.out.println(result.getMaxSMTPConnectionAge());
      System.out.println(result.getSmtpConnectionHealthCheckInterval());
      System.out.println(result.getAllowedTask());
      System.out.println(result.getEnableSubOperationTimer());
      System.out.println(result.getMaximumShutdownTime());
      System.out.println(result.getNetworkAddressCacheTTL());
      System.out.println(result.getNetworkAddressOutageCacheEnabled());
      System.out.println(result.getTrackedApplication());
      System.out.println(result.getJmxValueBehavior());
      System.out.println(result.getJmxUseLegacyMbeanNames());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalConfigurationApi#getSingleConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GlobalConfigurationResponse> response = client
              .globalConfiguration
              .getSingleConfig()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalConfigurationApi#getSingleConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GlobalConfigurationResponse**](GlobalConfigurationResponse.md)

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
| **404** | The Global Configuration does not exist |  -  |

<a name="updateByName"></a>
# **updateByName**
> GlobalConfigurationResponse updateByName(updateRequest).execute();

Update an existing Global Configuration by name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PingIdentityDirectory;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.GlobalConfigurationApi;
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
    try {
      GlobalConfigurationResponse result = client
              .globalConfiguration
              .updateByName(operations)
              .execute();
      System.out.println(result);
      System.out.println(result.getSchemas());
      System.out.println(result.getInstanceName());
      System.out.println(result.getLocation());
      System.out.println(result.getConfigurationServerGroup());
      System.out.println(result.getForceAsMasterForMirroredData());
      System.out.println(result.getEncryptData());
      System.out.println(result.getEncryptionSettingsCipherStreamProvider());
      System.out.println(result.getEncryptBackupsByDefault());
      System.out.println(result.getBackupEncryptionSettingsDefinitionID());
      System.out.println(result.getEncryptLDIFExportsByDefault());
      System.out.println(result.getLdifExportEncryptionSettingsDefinitionID());
      System.out.println(result.getAutomaticallyCompressEncryptedLDIFExports());
      System.out.println(result.getRedactSensitiveValuesInConfigLogs());
      System.out.println(result.getSensitiveAttribute());
      System.out.println(result.getRejectInsecureRequests());
      System.out.println(result.getAllowedInsecureRequestCriteria());
      System.out.println(result.getRejectUnauthenticatedRequests());
      System.out.println(result.getAllowedUnauthenticatedRequestCriteria());
      System.out.println(result.getBindWithDNRequiresPassword());
      System.out.println(result.getDisabledPrivilege());
      System.out.println(result.getDefaultPasswordPolicy());
      System.out.println(result.getMaximumUserDataPasswordPoliciesToCache());
      System.out.println(result.getProxiedAuthorizationIdentityMapper());
      System.out.println(result.getVerifyEntryDigests());
      System.out.println(result.getAllowedInsecureTLSProtocol());
      System.out.println(result.getAllowInsecureLocalJMXConnections());
      System.out.println(result.getDefaultInternalOperationClientConnectionPolicy());
      System.out.println(result.getSizeLimit());
      System.out.println(result.getUnauthenticatedSizeLimit());
      System.out.println(result.getTimeLimit());
      System.out.println(result.getUnauthenticatedTimeLimit());
      System.out.println(result.getIdleTimeLimit());
      System.out.println(result.getUnauthenticatedIdleTimeLimit());
      System.out.println(result.getLookthroughLimit());
      System.out.println(result.getUnauthenticatedLookthroughLimit());
      System.out.println(result.getLdapJoinSizeLimit());
      System.out.println(result.getMaximumConcurrentConnections());
      System.out.println(result.getMaximumConcurrentConnectionsPerIPAddress());
      System.out.println(result.getMaximumConcurrentConnectionsPerBindDN());
      System.out.println(result.getMaximumConcurrentUnindexedSearches());
      System.out.println(result.getMaximumAttributesPerAddRequest());
      System.out.println(result.getMaximumModificationsPerModifyRequest());
      System.out.println(result.getBackgroundThreadForEachPersistentSearch());
      System.out.println(result.getAllowAttributeNameExceptions());
      System.out.println(result.getInvalidAttributeSyntaxBehavior());
      System.out.println(result.getPermitSyntaxViolationsForAttribute());
      System.out.println(result.getSingleStructuralObjectclassBehavior());
      System.out.println(result.getAttributesModifiableWithIgnoreNoUserModificationRequestControl());
      System.out.println(result.getMaximumServerOutLogFileSize());
      System.out.println(result.getMaximumServerOutLogFileCount());
      System.out.println(result.getStartupErrorLoggerOutputLocation());
      System.out.println(result.getExitOnJVMError());
      System.out.println(result.getServerErrorResultCode());
      System.out.println(result.getResultCodeMap());
      System.out.println(result.getReturnBindErrorMessages());
      System.out.println(result.getNotifyAbandonedOperations());
      System.out.println(result.getDuplicateErrorLogLimit());
      System.out.println(result.getDuplicateErrorLogTimeLimit());
      System.out.println(result.getDuplicateAlertLimit());
      System.out.println(result.getDuplicateAlertTimeLimit());
      System.out.println(result.getWritabilityMode());
      System.out.println(result.getUseSharedDatabaseCacheAcrossAllLocalDBBackends());
      System.out.println(result.getSharedLocalDBBackendDatabaseCachePercent());
      System.out.println(result.getUnrecoverableDatabaseErrorMode());
      System.out.println(result.getDatabaseOnVirtualizedOrNetworkStorage());
      System.out.println(result.getAutoNameWithEntryUUIDConnectionCriteria());
      System.out.println(result.getAutoNameWithEntryUUIDRequestCriteria());
      System.out.println(result.getSoftDeletePolicy());
      System.out.println(result.getSubtreeAccessibilityAlertTimeLimit());
      System.out.println(result.getWarnForBackendsWithMultipleBaseDns());
      System.out.println(result.getForcedGCPrimeDuration());
      System.out.println(result.getReplicationSetName());
      System.out.println(result.getStartupMinReplicationBacklogCount());
      System.out.println(result.getReplicationBacklogCountAlertThreshold());
      System.out.println(result.getReplicationBacklogDurationAlertThreshold());
      System.out.println(result.getReplicationAssuranceSourceTimeoutSuspendDuration());
      System.out.println(result.getReplicationAssuranceSourceBacklogFastStartThreshold());
      System.out.println(result.getReplicationHistoryLimit());
      System.out.println(result.getAllowInheritedReplicationOfSubordinateBackends());
      System.out.println(result.getReplicationPurgeObsoleteReplicas());
      System.out.println(result.getSmtpServer());
      System.out.println(result.getMaxSMTPConnectionCount());
      System.out.println(result.getMaxSMTPConnectionAge());
      System.out.println(result.getSmtpConnectionHealthCheckInterval());
      System.out.println(result.getAllowedTask());
      System.out.println(result.getEnableSubOperationTimer());
      System.out.println(result.getMaximumShutdownTime());
      System.out.println(result.getNetworkAddressCacheTTL());
      System.out.println(result.getNetworkAddressOutageCacheEnabled());
      System.out.println(result.getTrackedApplication());
      System.out.println(result.getJmxValueBehavior());
      System.out.println(result.getJmxUseLegacyMbeanNames());
      System.out.println(result.getMeta());
      System.out.println(result.getUrnColonPingidentityColonSchemasColonConfigurationColonMessagesColon20());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalConfigurationApi#updateByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GlobalConfigurationResponse> response = client
              .globalConfiguration
              .updateByName(operations)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalConfigurationApi#updateByName");
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
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| Update an existing Global Configuration | |

### Return type

[**GlobalConfigurationResponse**](GlobalConfigurationResponse.md)

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
| **404** | The Global Configuration does not exist |  -  |


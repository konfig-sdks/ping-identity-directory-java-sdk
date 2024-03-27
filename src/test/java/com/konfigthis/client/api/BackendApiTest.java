/*
 * PingData Config - OpenAPI 3.0
 * This is the PingData Configuration API
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.AddLocalDbBackendRequest;
import com.konfigthis.client.model.BackendListResponse;
import com.konfigthis.client.model.EnumbackendDefaultCacheModeProp;
import com.konfigthis.client.model.EnumbackendDn2idCacheModeProp;
import com.konfigthis.client.model.EnumbackendDn2uriCacheModeProp;
import com.konfigthis.client.model.EnumbackendExternalTxnDefaultBackendLockBehaviorProp;
import com.konfigthis.client.model.EnumbackendId2childrenCacheModeProp;
import com.konfigthis.client.model.EnumbackendId2entryCacheModeProp;
import com.konfigthis.client.model.EnumbackendId2subtreeCacheModeProp;
import com.konfigthis.client.model.EnumbackendPrimeMethodProp;
import com.konfigthis.client.model.EnumbackendSingleWriterLockBehaviorProp;
import com.konfigthis.client.model.EnumbackendSystemIndexToPrimeInternalNodesOnlyProp;
import com.konfigthis.client.model.EnumbackendSystemIndexToPrimeProp;
import com.konfigthis.client.model.EnumbackendUncachedId2entryCacheModeProp;
import com.konfigthis.client.model.EnumbackendWritabilityModeProp;
import com.konfigthis.client.model.EnumlocalDbBackendSchemaUrn;
import com.konfigthis.client.model.Operation;
import com.konfigthis.client.model.UpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BackendApi
 */
@Disabled
public class BackendApiTest {

    private static BackendApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BackendApi(apiClient);
    }

    /**
     * Add a new Backend to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createConfigTest() throws ApiException {
        String backendName = null;
        String description = null;
        List<EnumlocalDbBackendSchemaUrn> schemas = null;
        EnumbackendUncachedId2entryCacheModeProp uncachedId2entryCacheMode = null;
        String uncachedAttributeCriteria = null;
        String uncachedEntryCriteria = null;
        EnumbackendWritabilityModeProp writabilityMode = null;
        Boolean setDegradedAlertForUntrustedIndex = null;
        Boolean returnUnavailableForUntrustedIndex = null;
        Boolean processFiltersWithUndefinedAttributeTypes = null;
        Boolean isPrivateBackend = null;
        String dbDirectory = null;
        String dbDirectoryPermissions = null;
        List<String> compactCommonParentDN = null;
        Boolean compressEntries = null;
        Boolean hashEntries = null;
        Integer dbNumCleanerThreads = null;
        Integer dbCleanerMinUtilization = null;
        Integer dbEvictorCriticalPercentage = null;
        String dbCheckpointerWakeupInterval = null;
        String dbBackgroundSyncInterval = null;
        Boolean dbUseThreadLocalHandles = null;
        String dbLogFileMax = null;
        String dbLoggingLevel = null;
        List<String> jeProperty = null;
        Integer dbCachePercent = null;
        EnumbackendDefaultCacheModeProp defaultCacheMode = null;
        EnumbackendId2entryCacheModeProp id2entryCacheMode = null;
        EnumbackendDn2idCacheModeProp dn2idCacheMode = null;
        EnumbackendId2childrenCacheModeProp id2childrenCacheMode = null;
        EnumbackendId2subtreeCacheModeProp id2subtreeCacheMode = null;
        EnumbackendDn2uriCacheModeProp dn2uriCacheMode = null;
        List<EnumbackendPrimeMethodProp> primeMethod = null;
        Integer primeThreadCount = null;
        String primeTimeLimit = null;
        Boolean primeAllIndexes = null;
        List<EnumbackendSystemIndexToPrimeProp> systemIndexToPrime = null;
        List<EnumbackendSystemIndexToPrimeInternalNodesOnlyProp> systemIndexToPrimeInternalNodesOnly = null;
        Boolean backgroundPrime = null;
        Integer indexEntryLimit = null;
        Integer compositeIndexEntryLimit = null;
        Integer id2childrenIndexEntryLimit = null;
        Integer id2subtreeIndexEntryLimit = null;
        String importTempDirectory = null;
        Integer importThreadCount = null;
        Integer exportThreadCount = null;
        Integer dbImportCachePercent = null;
        Boolean dbTxnWriteNoSync = null;
        Integer deadlockRetryLimit = null;
        EnumbackendExternalTxnDefaultBackendLockBehaviorProp externalTxnDefaultBackendLockBehavior = null;
        EnumbackendSingleWriterLockBehaviorProp singleWriterLockBehavior = null;
        Integer subtreeDeleteSizeLimit = null;
        Integer numRecentChanges = null;
        String offlineProcessDatabaseOpenTimeout = null;
        String backendID = null;
        Boolean enabled = null;
        List<String> baseDN = null;
        Boolean setDegradedAlertWhenDisabled = null;
        Boolean returnUnavailableWhenDisabled = null;
        String notificationManager = null;
        Object response = api.createConfig(backendName)
                .description(description)
                .schemas(schemas)
                .uncachedId2entryCacheMode(uncachedId2entryCacheMode)
                .uncachedAttributeCriteria(uncachedAttributeCriteria)
                .uncachedEntryCriteria(uncachedEntryCriteria)
                .writabilityMode(writabilityMode)
                .setDegradedAlertForUntrustedIndex(setDegradedAlertForUntrustedIndex)
                .returnUnavailableForUntrustedIndex(returnUnavailableForUntrustedIndex)
                .processFiltersWithUndefinedAttributeTypes(processFiltersWithUndefinedAttributeTypes)
                .isPrivateBackend(isPrivateBackend)
                .dbDirectory(dbDirectory)
                .dbDirectoryPermissions(dbDirectoryPermissions)
                .compactCommonParentDN(compactCommonParentDN)
                .compressEntries(compressEntries)
                .hashEntries(hashEntries)
                .dbNumCleanerThreads(dbNumCleanerThreads)
                .dbCleanerMinUtilization(dbCleanerMinUtilization)
                .dbEvictorCriticalPercentage(dbEvictorCriticalPercentage)
                .dbCheckpointerWakeupInterval(dbCheckpointerWakeupInterval)
                .dbBackgroundSyncInterval(dbBackgroundSyncInterval)
                .dbUseThreadLocalHandles(dbUseThreadLocalHandles)
                .dbLogFileMax(dbLogFileMax)
                .dbLoggingLevel(dbLoggingLevel)
                .jeProperty(jeProperty)
                .dbCachePercent(dbCachePercent)
                .defaultCacheMode(defaultCacheMode)
                .id2entryCacheMode(id2entryCacheMode)
                .dn2idCacheMode(dn2idCacheMode)
                .id2childrenCacheMode(id2childrenCacheMode)
                .id2subtreeCacheMode(id2subtreeCacheMode)
                .dn2uriCacheMode(dn2uriCacheMode)
                .primeMethod(primeMethod)
                .primeThreadCount(primeThreadCount)
                .primeTimeLimit(primeTimeLimit)
                .primeAllIndexes(primeAllIndexes)
                .systemIndexToPrime(systemIndexToPrime)
                .systemIndexToPrimeInternalNodesOnly(systemIndexToPrimeInternalNodesOnly)
                .backgroundPrime(backgroundPrime)
                .indexEntryLimit(indexEntryLimit)
                .compositeIndexEntryLimit(compositeIndexEntryLimit)
                .id2childrenIndexEntryLimit(id2childrenIndexEntryLimit)
                .id2subtreeIndexEntryLimit(id2subtreeIndexEntryLimit)
                .importTempDirectory(importTempDirectory)
                .importThreadCount(importThreadCount)
                .exportThreadCount(exportThreadCount)
                .dbImportCachePercent(dbImportCachePercent)
                .dbTxnWriteNoSync(dbTxnWriteNoSync)
                .deadlockRetryLimit(deadlockRetryLimit)
                .externalTxnDefaultBackendLockBehavior(externalTxnDefaultBackendLockBehavior)
                .singleWriterLockBehavior(singleWriterLockBehavior)
                .subtreeDeleteSizeLimit(subtreeDeleteSizeLimit)
                .numRecentChanges(numRecentChanges)
                .offlineProcessDatabaseOpenTimeout(offlineProcessDatabaseOpenTimeout)
                .backendID(backendID)
                .enabled(enabled)
                .baseDN(baseDN)
                .setDegradedAlertWhenDisabled(setDegradedAlertWhenDisabled)
                .returnUnavailableWhenDisabled(returnUnavailableWhenDisabled)
                .notificationManager(notificationManager)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Backend
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteBackendTest() throws ApiException {
        String backendName = null;
        api.deleteBackend(backendName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Backend objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllObjectsTest() throws ApiException {
        String filter = null;
        BackendListResponse response = api.getAllObjects()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Backend
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String backendName = null;
        Object response = api.getSingle(backendName)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Backend by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String backendName = null;
        Object response = api.updateByName(operations, backendName)
                .execute();
        // TODO: test validations
    }

}

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
import com.konfigthis.client.model.Operation;
import com.konfigthis.client.model.SynchronizationProviderListResponse;
import com.konfigthis.client.model.UpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SynchronizationProviderApi
 */
@Disabled
public class SynchronizationProviderApiTest {

    private static SynchronizationProviderApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SynchronizationProviderApi(apiClient);
    }

    /**
     * Returns a single Synchronization Provider
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String synchronizationProviderName = null;
        Object response = api.getSingle(synchronizationProviderName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Synchronization Provider objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllProvidersTest() throws ApiException {
        String filter = null;
        SynchronizationProviderListResponse response = api.listAllProviders()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Synchronization Provider by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String synchronizationProviderName = null;
        Object response = api.updateByName(operations, synchronizationProviderName)
                .execute();
        // TODO: test validations
    }

}

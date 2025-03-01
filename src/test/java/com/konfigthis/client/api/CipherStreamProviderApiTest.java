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
import com.konfigthis.client.model.CipherStreamProviderListResponse;
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
 * API tests for CipherStreamProviderApi
 */
@Disabled
public class CipherStreamProviderApiTest {

    private static CipherStreamProviderApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CipherStreamProviderApi(apiClient);
    }

    /**
     * Add a new Cipher Stream Provider to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewProviderTest() throws ApiException {
        Object response = api.addNewProvider()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Cipher Stream Provider
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProviderTest() throws ApiException {
        String cipherStreamProviderName = null;
        api.deleteProvider(cipherStreamProviderName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Cipher Stream Provider
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String cipherStreamProviderName = null;
        Object response = api.getSingle(cipherStreamProviderName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Cipher Stream Provider objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllProvidersTest() throws ApiException {
        String filter = null;
        CipherStreamProviderListResponse response = api.listAllProviders()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Cipher Stream Provider by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String cipherStreamProviderName = null;
        Object response = api.updateByName(operations, cipherStreamProviderName)
                .execute();
        // TODO: test validations
    }

}

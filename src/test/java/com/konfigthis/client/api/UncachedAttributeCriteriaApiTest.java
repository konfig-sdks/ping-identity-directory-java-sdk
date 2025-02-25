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
import com.konfigthis.client.model.UncachedAttributeCriteriaListResponse;
import com.konfigthis.client.model.UpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UncachedAttributeCriteriaApi
 */
@Disabled
public class UncachedAttributeCriteriaApiTest {

    private static UncachedAttributeCriteriaApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UncachedAttributeCriteriaApi(apiClient);
    }

    /**
     * Add a new Uncached Attribute Criteria to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewToConfigTest() throws ApiException {
        Object response = api.addNewToConfig()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Uncached Attribute Criteria
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUncachedAttributeCriteriaTest() throws ApiException {
        String uncachedAttributeCriteriaName = null;
        api.deleteUncachedAttributeCriteria(uncachedAttributeCriteriaName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Uncached Attribute Criteria objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllObjectsTest() throws ApiException {
        String filter = null;
        UncachedAttributeCriteriaListResponse response = api.getAllObjects()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Uncached Attribute Criteria
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String uncachedAttributeCriteriaName = null;
        Object response = api.getSingle(uncachedAttributeCriteriaName)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Uncached Attribute Criteria by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String uncachedAttributeCriteriaName = null;
        Object response = api.updateByName(operations, uncachedAttributeCriteriaName)
                .execute();
        // TODO: test validations
    }

}

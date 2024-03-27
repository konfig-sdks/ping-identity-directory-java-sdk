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
import com.konfigthis.client.model.AddObscuredValueRequest;
import com.konfigthis.client.model.EnumobscuredValueSchemaUrn;
import com.konfigthis.client.model.ObscuredValueListResponse;
import com.konfigthis.client.model.ObscuredValueResponse;
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
 * API tests for ObscuredValueApi
 */
@Disabled
public class ObscuredValueApiTest {

    private static ObscuredValueApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ObscuredValueApi(apiClient);
    }

    /**
     * Add a new Obscured Value to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewToConfigTest() throws ApiException {
        String valueName = null;
        String description = null;
        List<EnumobscuredValueSchemaUrn> schemas = null;
        String obscuredValue = null;
        ObscuredValueResponse response = api.addNewToConfig(valueName)
                .description(description)
                .schemas(schemas)
                .obscuredValue(obscuredValue)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Obscured Value
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteObscuredValueTest() throws ApiException {
        String obscuredValueName = null;
        api.deleteObscuredValue(obscuredValueName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Obscured Value
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleValueTest() throws ApiException {
        String obscuredValueName = null;
        ObscuredValueResponse response = api.getSingleValue(obscuredValueName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Obscured Value objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllObjectsTest() throws ApiException {
        String filter = null;
        ObscuredValueListResponse response = api.listAllObjects()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Obscured Value by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String obscuredValueName = null;
        ObscuredValueResponse response = api.updateByName(operations, obscuredValueName)
                .execute();
        // TODO: test validations
    }

}

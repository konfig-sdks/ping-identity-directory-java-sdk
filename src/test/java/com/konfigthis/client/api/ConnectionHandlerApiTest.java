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
import com.konfigthis.client.model.ConnectionHandlerListResponse;
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
 * API tests for ConnectionHandlerApi
 */
@Disabled
public class ConnectionHandlerApiTest {

    private static ConnectionHandlerApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ConnectionHandlerApi(apiClient);
    }

    /**
     * Add a new Connection Handler to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewConfigTest() throws ApiException {
        Object response = api.addNewConfig()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Connection Handler
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteHandlerTest() throws ApiException {
        String connectionHandlerName = null;
        api.deleteHandler(connectionHandlerName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Connection Handler
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String connectionHandlerName = null;
        Object response = api.getSingle(connectionHandlerName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Connection Handler objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listObjectsTest() throws ApiException {
        String filter = null;
        ConnectionHandlerListResponse response = api.listObjects()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Connection Handler by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String connectionHandlerName = null;
        Object response = api.updateByName(operations, connectionHandlerName)
                .execute();
        // TODO: test validations
    }

}

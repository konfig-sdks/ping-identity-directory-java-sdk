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
import com.konfigthis.client.model.ChangeSubscriptionHandlerListResponse;
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
 * API tests for ChangeSubscriptionHandlerApi
 */
@Disabled
public class ChangeSubscriptionHandlerApiTest {

    private static ChangeSubscriptionHandlerApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ChangeSubscriptionHandlerApi(apiClient);
    }

    /**
     * Add a new Change Subscription Handler to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewHandlerTest() throws ApiException {
        Object response = api.addNewHandler()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Change Subscription Handler
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteHandlerTest() throws ApiException {
        String changeSubscriptionHandlerName = null;
        api.deleteHandler(changeSubscriptionHandlerName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Change Subscription Handler
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String changeSubscriptionHandlerName = null;
        Object response = api.getSingle(changeSubscriptionHandlerName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Change Subscription Handler objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllHandlersTest() throws ApiException {
        String filter = null;
        ChangeSubscriptionHandlerListResponse response = api.listAllHandlers()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Change Subscription Handler by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String changeSubscriptionHandlerName = null;
        Object response = api.updateByName(operations, changeSubscriptionHandlerName)
                .execute();
        // TODO: test validations
    }

}

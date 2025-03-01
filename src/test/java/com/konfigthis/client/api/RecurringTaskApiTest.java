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
import com.konfigthis.client.model.RecurringTaskListResponse;
import com.konfigthis.client.model.UpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecurringTaskApi
 */
@Disabled
public class RecurringTaskApiTest {

    private static RecurringTaskApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new RecurringTaskApi(apiClient);
    }

    /**
     * Add a new Recurring Task to the config
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
     * Delete a Recurring Task
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRecurringTaskTest() throws ApiException {
        String recurringTaskName = null;
        api.deleteRecurringTask(recurringTaskName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Recurring Task
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTaskTest() throws ApiException {
        String recurringTaskName = null;
        Object response = api.getSingleTask(recurringTaskName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Recurring Task objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listObjectsTest() throws ApiException {
        String filter = null;
        RecurringTaskListResponse response = api.listObjects()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Recurring Task by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String recurringTaskName = null;
        Object response = api.updateByName(operations, recurringTaskName)
                .execute();
        // TODO: test validations
    }

}

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
import com.konfigthis.client.model.LogRetentionPolicyListResponse;
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
 * API tests for LogRetentionPolicyApi
 */
@Disabled
public class LogRetentionPolicyApiTest {

    private static LogRetentionPolicyApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LogRetentionPolicyApi(apiClient);
    }

    /**
     * Add a new Log Retention Policy to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewLogRetentionPolicyTest() throws ApiException {
        Object response = api.addNewLogRetentionPolicy()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Log Retention Policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteLogRetentionPolicyTest() throws ApiException {
        String logRetentionPolicyName = null;
        api.deleteLogRetentionPolicy(logRetentionPolicyName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Log Retention Policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String logRetentionPolicyName = null;
        Object response = api.getSingle(logRetentionPolicyName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Log Retention Policy objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllLogRetentionPoliciesTest() throws ApiException {
        String filter = null;
        LogRetentionPolicyListResponse response = api.listAllLogRetentionPolicies()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Log Retention Policy by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String logRetentionPolicyName = null;
        Object response = api.updateByName(operations, logRetentionPolicyName)
                .execute();
        // TODO: test validations
    }

}

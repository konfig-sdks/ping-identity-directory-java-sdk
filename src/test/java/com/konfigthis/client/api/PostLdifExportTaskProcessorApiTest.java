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
import com.konfigthis.client.model.PostLdifExportTaskProcessorListResponse;
import com.konfigthis.client.model.UpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PostLdifExportTaskProcessorApi
 */
@Disabled
public class PostLdifExportTaskProcessorApiTest {

    private static PostLdifExportTaskProcessorApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PostLdifExportTaskProcessorApi(apiClient);
    }

    /**
     * Add a new Post LDIF Export Task Processor to the config
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
     * Delete a Post LDIF Export Task Processor
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTaskProcessorTest() throws ApiException {
        String postLdifExportTaskProcessorName = null;
        api.deleteTaskProcessor(postLdifExportTaskProcessorName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Post LDIF Export Task Processor
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String postLdifExportTaskProcessorName = null;
        Object response = api.getSingle(postLdifExportTaskProcessorName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Post LDIF Export Task Processor objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllObjectsTest() throws ApiException {
        String filter = null;
        PostLdifExportTaskProcessorListResponse response = api.listAllObjects()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Post LDIF Export Task Processor by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String postLdifExportTaskProcessorName = null;
        Object response = api.updateByName(operations, postLdifExportTaskProcessorName)
                .execute();
        // TODO: test validations
    }

}

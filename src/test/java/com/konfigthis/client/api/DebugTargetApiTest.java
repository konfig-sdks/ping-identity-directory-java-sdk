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
import com.konfigthis.client.model.AddDebugTargetRequest;
import com.konfigthis.client.model.DebugTargetListResponse;
import com.konfigthis.client.model.DebugTargetResponse;
import com.konfigthis.client.model.EnumdebugTargetDebugCategoryProp;
import com.konfigthis.client.model.EnumdebugTargetDebugLevelProp;
import com.konfigthis.client.model.EnumdebugTargetSchemaUrn;
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
 * API tests for DebugTargetApi
 */
@Disabled
public class DebugTargetApiTest {

    private static DebugTargetApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DebugTargetApi(apiClient);
    }

    /**
     * Add a new Debug Target to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewDebugTargetTest() throws ApiException {
        String targetName = null;
        String logPublisherName = null;
        String description = null;
        List<EnumdebugTargetSchemaUrn> schemas = null;
        String debugScope = null;
        EnumdebugTargetDebugLevelProp debugLevel = null;
        List<EnumdebugTargetDebugCategoryProp> debugCategory = null;
        Boolean omitMethodEntryArguments = null;
        Boolean omitMethodReturnValue = null;
        Boolean includeThrowableCause = null;
        Integer throwableStackFrames = null;
        DebugTargetResponse response = api.addNewDebugTarget(targetName, logPublisherName)
                .description(description)
                .schemas(schemas)
                .debugScope(debugScope)
                .debugLevel(debugLevel)
                .debugCategory(debugCategory)
                .omitMethodEntryArguments(omitMethodEntryArguments)
                .omitMethodReturnValue(omitMethodReturnValue)
                .includeThrowableCause(includeThrowableCause)
                .throwableStackFrames(throwableStackFrames)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Debug Target
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDebugTargetTest() throws ApiException {
        String debugTargetName = null;
        String logPublisherName = null;
        api.deleteDebugTarget(debugTargetName, logPublisherName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Debug Target
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleDebugTargetTest() throws ApiException {
        String debugTargetName = null;
        String logPublisherName = null;
        DebugTargetResponse response = api.getSingleDebugTarget(debugTargetName, logPublisherName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Debug Target objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllDebugTargetsTest() throws ApiException {
        String logPublisherName = null;
        String filter = null;
        DebugTargetListResponse response = api.listAllDebugTargets(logPublisherName)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Debug Target by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String debugTargetName = null;
        String logPublisherName = null;
        DebugTargetResponse response = api.updateByName(operations, debugTargetName, logPublisherName)
                .execute();
        // TODO: test validations
    }

}

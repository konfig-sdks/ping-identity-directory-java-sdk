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
import com.konfigthis.client.model.AddCustomLoggedStatsRequest;
import com.konfigthis.client.model.CustomLoggedStatsListResponse;
import com.konfigthis.client.model.CustomLoggedStatsResponse;
import com.konfigthis.client.model.EnumcustomLoggedStatsSchemaUrn;
import com.konfigthis.client.model.EnumcustomLoggedStatsStatisticTypeProp;
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
 * API tests for CustomLoggedStatsApi
 */
@Disabled
public class CustomLoggedStatsApiTest {

    private static CustomLoggedStatsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CustomLoggedStatsApi(apiClient);
    }

    /**
     * Add a new Custom Logged Stats to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewStatToConfigTest() throws ApiException {
        String statsName = null;
        String pluginName = null;
        String description = null;
        List<EnumcustomLoggedStatsSchemaUrn> schemas = null;
        Boolean enabled = null;
        String monitorObjectclass = null;
        String includeFilter = null;
        List<String> attributeToLog = null;
        List<String> columnName = null;
        List<EnumcustomLoggedStatsStatisticTypeProp> statisticType = null;
        String headerPrefix = null;
        String headerPrefixAttribute = null;
        String regexPattern = null;
        String regexReplacement = null;
        String divideValueBy = null;
        String divideValueByAttribute = null;
        String decimalFormat = null;
        Boolean nonZeroImpliesNotIdle = null;
        CustomLoggedStatsResponse response = api.addNewStatToConfig(statsName, pluginName)
                .description(description)
                .schemas(schemas)
                .enabled(enabled)
                .monitorObjectclass(monitorObjectclass)
                .includeFilter(includeFilter)
                .attributeToLog(attributeToLog)
                .columnName(columnName)
                .statisticType(statisticType)
                .headerPrefix(headerPrefix)
                .headerPrefixAttribute(headerPrefixAttribute)
                .regexPattern(regexPattern)
                .regexReplacement(regexReplacement)
                .divideValueBy(divideValueBy)
                .divideValueByAttribute(divideValueByAttribute)
                .decimalFormat(decimalFormat)
                .nonZeroImpliesNotIdle(nonZeroImpliesNotIdle)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Custom Logged Stats
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteStatTest() throws ApiException {
        String customLoggedStatsName = null;
        String pluginName = null;
        api.deleteStat(customLoggedStatsName, pluginName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Custom Logged Stats
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String customLoggedStatsName = null;
        String pluginName = null;
        CustomLoggedStatsResponse response = api.getSingle(customLoggedStatsName, pluginName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Custom Logged Stats objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllObjectsTest() throws ApiException {
        String pluginName = null;
        String filter = null;
        CustomLoggedStatsListResponse response = api.listAllObjects(pluginName)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Custom Logged Stats by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String customLoggedStatsName = null;
        String pluginName = null;
        CustomLoggedStatsResponse response = api.updateByName(operations, customLoggedStatsName, pluginName)
                .execute();
        // TODO: test validations
    }

}

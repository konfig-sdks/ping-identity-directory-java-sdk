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
import com.konfigthis.client.model.GlobalConfigurationResponse;
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
 * API tests for GlobalConfigurationApi
 */
@Disabled
public class GlobalConfigurationApiTest {

    private static GlobalConfigurationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GlobalConfigurationApi(apiClient);
    }

    /**
     * Returns a single Global Configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleConfigTest() throws ApiException {
        GlobalConfigurationResponse response = api.getSingleConfig()
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Global Configuration by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        GlobalConfigurationResponse response = api.updateByName(operations)
                .execute();
        // TODO: test validations
    }

}

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
import com.konfigthis.client.model.AlarmManagerResponse;
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
 * API tests for AlarmManagerApi
 */
@Disabled
public class AlarmManagerApiTest {

    private static AlarmManagerApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AlarmManagerApi(apiClient);
    }

    /**
     * Returns a single Alarm Manager
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleAlarmManagerTest() throws ApiException {
        AlarmManagerResponse response = api.getSingleAlarmManager()
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Alarm Manager by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        AlarmManagerResponse response = api.updateByName(operations)
                .execute();
        // TODO: test validations
    }

}

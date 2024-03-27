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
import com.konfigthis.client.model.DseeCompatAccessControlHandlerResponse;
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
 * API tests for AccessControlHandlerApi
 */
@Disabled
public class AccessControlHandlerApiTest {

    private static AccessControlHandlerApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AccessControlHandlerApi(apiClient);
    }

    /**
     * Returns a single Access Control Handler
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        DseeCompatAccessControlHandlerResponse response = api.getSingle()
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Access Control Handler by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        DseeCompatAccessControlHandlerResponse response = api.updateByName(operations)
                .execute();
        // TODO: test validations
    }

}

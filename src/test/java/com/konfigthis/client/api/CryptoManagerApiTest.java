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
import com.konfigthis.client.model.CryptoManagerResponse;
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
 * API tests for CryptoManagerApi
 */
@Disabled
public class CryptoManagerApiTest {

    private static CryptoManagerApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CryptoManagerApi(apiClient);
    }

    /**
     * Returns a single Crypto Manager
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleCryptoManagerTest() throws ApiException {
        CryptoManagerResponse response = api.getSingleCryptoManager()
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Crypto Manager by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        CryptoManagerResponse response = api.updateByName(operations)
                .execute();
        // TODO: test validations
    }

}

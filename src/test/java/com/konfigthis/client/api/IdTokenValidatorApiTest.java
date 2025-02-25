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
import com.konfigthis.client.model.IdTokenValidatorListResponse;
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
 * API tests for IdTokenValidatorApi
 */
@Disabled
public class IdTokenValidatorApiTest {

    private static IdTokenValidatorApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IdTokenValidatorApi(apiClient);
    }

    /**
     * Add a new ID Token Validator to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewValidatorTest() throws ApiException {
        Object response = api.addNewValidator()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a ID Token Validator
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteValidatorTest() throws ApiException {
        String idTokenValidatorName = null;
        api.deleteValidator(idTokenValidatorName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single ID Token Validator
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleByIdTokenValidatorTest() throws ApiException {
        String idTokenValidatorName = null;
        Object response = api.getSingleByIdTokenValidator(idTokenValidatorName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all ID Token Validator objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllValidatorsTest() throws ApiException {
        String filter = null;
        IdTokenValidatorListResponse response = api.listAllValidators()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing ID Token Validator by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String idTokenValidatorName = null;
        Object response = api.updateByName(operations, idTokenValidatorName)
                .execute();
        // TODO: test validations
    }

}

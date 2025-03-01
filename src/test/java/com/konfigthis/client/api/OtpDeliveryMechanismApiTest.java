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
import com.konfigthis.client.model.OtpDeliveryMechanismListResponse;
import com.konfigthis.client.model.UpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OtpDeliveryMechanismApi
 */
@Disabled
public class OtpDeliveryMechanismApiTest {

    private static OtpDeliveryMechanismApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new OtpDeliveryMechanismApi(apiClient);
    }

    /**
     * Add a new OTP Delivery Mechanism to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewMethodTest() throws ApiException {
        Object response = api.addNewMethod()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a OTP Delivery Mechanism
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDeliveryMechanismTest() throws ApiException {
        String otpDeliveryMechanismName = null;
        api.deleteDeliveryMechanism(otpDeliveryMechanismName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single OTP Delivery Mechanism
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleDeliveryMechanismTest() throws ApiException {
        String otpDeliveryMechanismName = null;
        Object response = api.getSingleDeliveryMechanism(otpDeliveryMechanismName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all OTP Delivery Mechanism objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        String filter = null;
        OtpDeliveryMechanismListResponse response = api.listAll()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing OTP Delivery Mechanism by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByOtpDeliveryMechanismNameTest() throws ApiException {
        List<Operation> operations = null;
        String otpDeliveryMechanismName = null;
        Object response = api.updateByOtpDeliveryMechanismName(operations, otpDeliveryMechanismName)
                .execute();
        // TODO: test validations
    }

}

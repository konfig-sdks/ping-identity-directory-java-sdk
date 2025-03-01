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
import com.konfigthis.client.model.AddTrustedCertificateRequest;
import com.konfigthis.client.model.EnumtrustedCertificateSchemaUrn;
import com.konfigthis.client.model.Operation;
import com.konfigthis.client.model.TrustedCertificateListResponse;
import com.konfigthis.client.model.TrustedCertificateResponse;
import com.konfigthis.client.model.UpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrustedCertificateApi
 */
@Disabled
public class TrustedCertificateApiTest {

    private static TrustedCertificateApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TrustedCertificateApi(apiClient);
    }

    /**
     * Add a new Trusted Certificate to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewToConfigTest() throws ApiException {
        String certificateName = null;
        List<EnumtrustedCertificateSchemaUrn> schemas = null;
        String certificate = null;
        TrustedCertificateResponse response = api.addNewToConfig(certificateName)
                .schemas(schemas)
                .certificate(certificate)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Trusted Certificate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCertificateTest() throws ApiException {
        String trustedCertificateName = null;
        api.deleteCertificate(trustedCertificateName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Trusted Certificate
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String trustedCertificateName = null;
        TrustedCertificateResponse response = api.getSingle(trustedCertificateName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Trusted Certificate objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllCertificatesTest() throws ApiException {
        String filter = null;
        TrustedCertificateListResponse response = api.listAllCertificates()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Trusted Certificate by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String trustedCertificateName = null;
        TrustedCertificateResponse response = api.updateByName(operations, trustedCertificateName)
                .execute();
        // TODO: test validations
    }

}

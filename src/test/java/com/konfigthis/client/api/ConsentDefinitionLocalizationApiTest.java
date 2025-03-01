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
import com.konfigthis.client.model.AddConsentDefinitionLocalizationRequest;
import com.konfigthis.client.model.ConsentDefinitionLocalizationListResponse;
import com.konfigthis.client.model.ConsentDefinitionLocalizationResponse;
import com.konfigthis.client.model.EnumconsentDefinitionLocalizationSchemaUrn;
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
 * API tests for ConsentDefinitionLocalizationApi
 */
@Disabled
public class ConsentDefinitionLocalizationApiTest {

    private static ConsentDefinitionLocalizationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ConsentDefinitionLocalizationApi(apiClient);
    }

    /**
     * Add a new Consent Definition Localization to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewTest() throws ApiException {
        String localizationName = null;
        String consentDefinitionName = null;
        String version = null;
        List<EnumconsentDefinitionLocalizationSchemaUrn> schemas = null;
        String locale = null;
        String titleText = null;
        String dataText = null;
        String purposeText = null;
        ConsentDefinitionLocalizationResponse response = api.addNew(localizationName, consentDefinitionName)
                .version(version)
                .schemas(schemas)
                .locale(locale)
                .titleText(titleText)
                .dataText(dataText)
                .purposeText(purposeText)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Consent Definition Localization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteLocalizationTest() throws ApiException {
        String consentDefinitionLocalizationName = null;
        String consentDefinitionName = null;
        api.deleteLocalization(consentDefinitionLocalizationName, consentDefinitionName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Consent Definition Localization objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllObjectsTest() throws ApiException {
        String consentDefinitionName = null;
        String filter = null;
        ConsentDefinitionLocalizationListResponse response = api.getAllObjects(consentDefinitionName)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Consent Definition Localization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String consentDefinitionLocalizationName = null;
        String consentDefinitionName = null;
        ConsentDefinitionLocalizationResponse response = api.getSingle(consentDefinitionLocalizationName, consentDefinitionName)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Consent Definition Localization by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String consentDefinitionLocalizationName = null;
        String consentDefinitionName = null;
        ConsentDefinitionLocalizationResponse response = api.updateByName(operations, consentDefinitionLocalizationName, consentDefinitionName)
                .execute();
        // TODO: test validations
    }

}

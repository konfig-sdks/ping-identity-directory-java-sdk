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
import com.konfigthis.client.model.AddLdapCorrelationAttributePairRequest;
import com.konfigthis.client.model.EnumldapCorrelationAttributePairSchemaUrn;
import com.konfigthis.client.model.LdapCorrelationAttributePairListResponse;
import com.konfigthis.client.model.LdapCorrelationAttributePairResponse;
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
 * API tests for LdapCorrelationAttributePairApi
 */
@Disabled
public class LdapCorrelationAttributePairApiTest {

    private static LdapCorrelationAttributePairApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LdapCorrelationAttributePairApi(apiClient);
    }

    /**
     * Add a new LDAP Correlation Attribute Pair to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewPairToConfigTest() throws ApiException {
        String pairName = null;
        String correlatedLdapDataViewName = null;
        String scimResourceTypeName = null;
        List<EnumldapCorrelationAttributePairSchemaUrn> schemas = null;
        String primaryCorrelationAttribute = null;
        String secondaryCorrelationAttribute = null;
        LdapCorrelationAttributePairResponse response = api.addNewPairToConfig(pairName, correlatedLdapDataViewName, scimResourceTypeName)
                .schemas(schemas)
                .primaryCorrelationAttribute(primaryCorrelationAttribute)
                .secondaryCorrelationAttribute(secondaryCorrelationAttribute)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a LDAP Correlation Attribute Pair
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String ldapCorrelationAttributePairName = null;
        String correlatedLdapDataViewName = null;
        String scimResourceTypeName = null;
        api.delete(ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single LDAP Correlation Attribute Pair
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String ldapCorrelationAttributePairName = null;
        String correlatedLdapDataViewName = null;
        String scimResourceTypeName = null;
        LdapCorrelationAttributePairResponse response = api.getSingle(ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all LDAP Correlation Attribute Pair objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCorrelationAttributePairsTest() throws ApiException {
        String correlatedLdapDataViewName = null;
        String scimResourceTypeName = null;
        String filter = null;
        LdapCorrelationAttributePairListResponse response = api.listCorrelationAttributePairs(correlatedLdapDataViewName, scimResourceTypeName)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing LDAP Correlation Attribute Pair by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String ldapCorrelationAttributePairName = null;
        String correlatedLdapDataViewName = null;
        String scimResourceTypeName = null;
        LdapCorrelationAttributePairResponse response = api.updateByName(operations, ldapCorrelationAttributePairName, correlatedLdapDataViewName, scimResourceTypeName)
                .execute();
        // TODO: test validations
    }

}

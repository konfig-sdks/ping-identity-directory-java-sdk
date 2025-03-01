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
import com.konfigthis.client.model.AddDelegatedAdminResourceRightsRequest;
import com.konfigthis.client.model.DelegatedAdminResourceRightsListResponse;
import com.konfigthis.client.model.DelegatedAdminResourceRightsResponse;
import com.konfigthis.client.model.EnumdelegatedAdminResourceRightsAdminPermissionProp;
import com.konfigthis.client.model.EnumdelegatedAdminResourceRightsAdminScopeProp;
import com.konfigthis.client.model.EnumdelegatedAdminResourceRightsSchemaUrn;
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
 * API tests for DelegatedAdminResourceRightsApi
 */
@Disabled
public class DelegatedAdminResourceRightsApiTest {

    private static DelegatedAdminResourceRightsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DelegatedAdminResourceRightsApi(apiClient);
    }

    /**
     * Add a new Delegated Admin Resource Rights to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewToConfigTest() throws ApiException {
        String restResourceType = null;
        String delegatedAdminRightsName = null;
        String description = null;
        List<EnumdelegatedAdminResourceRightsSchemaUrn> schemas = null;
        Boolean enabled = null;
        List<EnumdelegatedAdminResourceRightsAdminPermissionProp> adminPermission = null;
        EnumdelegatedAdminResourceRightsAdminScopeProp adminScope = null;
        List<String> resourceSubtree = null;
        List<String> resourcesInGroup = null;
        DelegatedAdminResourceRightsResponse response = api.addNewToConfig(restResourceType, delegatedAdminRightsName)
                .description(description)
                .schemas(schemas)
                .enabled(enabled)
                .adminPermission(adminPermission)
                .adminScope(adminScope)
                .resourceSubtree(resourceSubtree)
                .resourcesInGroup(resourcesInGroup)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Delegated Admin Resource Rights
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteResourceRightsTest() throws ApiException {
        String delegatedAdminResourceRightsName = null;
        String delegatedAdminRightsName = null;
        api.deleteResourceRights(delegatedAdminResourceRightsName, delegatedAdminRightsName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Delegated Admin Resource Rights
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleResourceRightsTest() throws ApiException {
        String delegatedAdminResourceRightsName = null;
        String delegatedAdminRightsName = null;
        DelegatedAdminResourceRightsResponse response = api.getSingleResourceRights(delegatedAdminResourceRightsName, delegatedAdminRightsName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Delegated Admin Resource Rights objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllObjectsTest() throws ApiException {
        String delegatedAdminRightsName = null;
        String filter = null;
        DelegatedAdminResourceRightsListResponse response = api.listAllObjects(delegatedAdminRightsName)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Delegated Admin Resource Rights by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String delegatedAdminResourceRightsName = null;
        String delegatedAdminRightsName = null;
        DelegatedAdminResourceRightsResponse response = api.updateByName(operations, delegatedAdminResourceRightsName, delegatedAdminRightsName)
                .execute();
        // TODO: test validations
    }

}

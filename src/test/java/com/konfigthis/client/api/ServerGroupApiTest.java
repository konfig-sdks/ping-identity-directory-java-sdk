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
import com.konfigthis.client.model.AddServerGroupRequest;
import com.konfigthis.client.model.EnumserverGroupSchemaUrn;
import com.konfigthis.client.model.Operation;
import com.konfigthis.client.model.ServerGroupListResponse;
import com.konfigthis.client.model.ServerGroupResponse;
import com.konfigthis.client.model.UpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServerGroupApi
 */
@Disabled
public class ServerGroupApiTest {

    private static ServerGroupApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ServerGroupApi(apiClient);
    }

    /**
     * Add a new Server Group to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewServerGroupTest() throws ApiException {
        String groupName = null;
        List<EnumserverGroupSchemaUrn> schemas = null;
        List<String> member = null;
        ServerGroupResponse response = api.addNewServerGroup(groupName)
                .schemas(schemas)
                .member(member)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Server Group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteServerGroupTest() throws ApiException {
        String serverGroupName = null;
        api.deleteServerGroup(serverGroupName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Server Group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String serverGroupName = null;
        ServerGroupResponse response = api.getSingle(serverGroupName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Server Group objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllObjectsTest() throws ApiException {
        String filter = null;
        ServerGroupListResponse response = api.listAllObjects()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Server Group by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String serverGroupName = null;
        ServerGroupResponse response = api.updateByName(operations, serverGroupName)
                .execute();
        // TODO: test validations
    }

}

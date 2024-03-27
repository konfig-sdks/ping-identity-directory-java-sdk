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
import com.konfigthis.client.model.AddReplicationAssurancePolicyRequest;
import com.konfigthis.client.model.EnumreplicationAssurancePolicyLocalLevelProp;
import com.konfigthis.client.model.EnumreplicationAssurancePolicyRemoteLevelProp;
import com.konfigthis.client.model.EnumreplicationAssurancePolicySchemaUrn;
import com.konfigthis.client.model.Operation;
import com.konfigthis.client.model.ReplicationAssurancePolicyListResponse;
import com.konfigthis.client.model.ReplicationAssurancePolicyResponse;
import com.konfigthis.client.model.UpdateRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReplicationAssurancePolicyApi
 */
@Disabled
public class ReplicationAssurancePolicyApiTest {

    private static ReplicationAssurancePolicyApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ReplicationAssurancePolicyApi(apiClient);
    }

    /**
     * Add a new Replication Assurance Policy to the config
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addNewTest() throws ApiException {
        String policyName = null;
        String description = null;
        List<EnumreplicationAssurancePolicySchemaUrn> schemas = null;
        Boolean enabled = null;
        Integer evaluationOrderIndex = null;
        EnumreplicationAssurancePolicyLocalLevelProp localLevel = null;
        EnumreplicationAssurancePolicyRemoteLevelProp remoteLevel = null;
        String timeout = null;
        String connectionCriteria = null;
        String requestCriteria = null;
        ReplicationAssurancePolicyResponse response = api.addNew(policyName)
                .description(description)
                .schemas(schemas)
                .enabled(enabled)
                .evaluationOrderIndex(evaluationOrderIndex)
                .localLevel(localLevel)
                .remoteLevel(remoteLevel)
                .timeout(timeout)
                .connectionCriteria(connectionCriteria)
                .requestCriteria(requestCriteria)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Replication Assurance Policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePolicyTest() throws ApiException {
        String replicationAssurancePolicyName = null;
        api.deletePolicy(replicationAssurancePolicyName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a single Replication Assurance Policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSinglePolicyTest() throws ApiException {
        String replicationAssurancePolicyName = null;
        ReplicationAssurancePolicyResponse response = api.getSinglePolicy(replicationAssurancePolicyName)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of all Replication Assurance Policy objects
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllObjectsTest() throws ApiException {
        String filter = null;
        ReplicationAssurancePolicyListResponse response = api.listAllObjects()
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an existing Replication Assurance Policy by name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByNameTest() throws ApiException {
        List<Operation> operations = null;
        String replicationAssurancePolicyName = null;
        ReplicationAssurancePolicyResponse response = api.updateByName(operations, replicationAssurancePolicyName)
                .execute();
        // TODO: test validations
    }

}

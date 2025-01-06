package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.MerchantConnectorCreate;
import com.hyperswitch.client.model.MerchantConnectorDeleteResponse;
import com.hyperswitch.client.model.MerchantConnectorListResponse;
import com.hyperswitch.client.model.MerchantConnectorResponse;
import com.hyperswitch.client.model.MerchantConnectorUpdate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantConnectorAccountApi
 */
class MerchantConnectorAccountApiTest {

    private MerchantConnectorAccountApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(MerchantConnectorAccountApi.class);
    }

    
    /**
     * Merchant Connector - Create
     *
     * Creates a new Merchant Connector for the merchant account. The connector could be a payment processor/facilitator/acquirer or a provider of specialized services like Fraud/Accounting etc.
     */
    @Test
    void createAMerchantConnectorTest() {
        String accountId = null;
        MerchantConnectorCreate merchantConnectorCreate = null;
        // MerchantConnectorResponse response = api.createAMerchantConnector(accountId, merchantConnectorCreate);

        // TODO: test validations
    }

    
    /**
     * Merchant Connector - Delete
     *
     * Delete or Detach a Merchant Connector from Merchant Account
     */
    @Test
    void deleteAMerchantConnectorTest() {
        String accountId = null;
        Integer connectorId = null;
        // MerchantConnectorDeleteResponse response = api.deleteAMerchantConnector(accountId, connectorId);

        // TODO: test validations
    }

    
    /**
     * Merchant Connector - List
     *
     * List Merchant Connector Details for the merchant
     */
    @Test
    void listAllMerchantConnectorsTest() {
        String accountId = null;
        // List<MerchantConnectorListResponse> response = api.listAllMerchantConnectors(accountId);

        // TODO: test validations
    }

    
    /**
     * Merchant Connector - Retrieve
     *
     * Retrieves details of a Connector account
     */
    @Test
    void retrieveAMerchantConnectorTest() {
        String accountId = null;
        Integer connectorId = null;
        // MerchantConnectorResponse response = api.retrieveAMerchantConnector(accountId, connectorId);

        // TODO: test validations
    }

    
    /**
     * Merchant Connector - Update
     *
     * To update an existing Merchant Connector account. Helpful in enabling/disabling different payment methods and other settings for the connector
     */
    @Test
    void updateAMerchantConnectorTest() {
        String accountId = null;
        Integer connectorId = null;
        MerchantConnectorUpdate merchantConnectorUpdate = null;
        // MerchantConnectorResponse response = api.updateAMerchantConnector(accountId, connectorId, merchantConnectorUpdate);

        // TODO: test validations
    }

    
}

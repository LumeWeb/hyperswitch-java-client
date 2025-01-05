package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.model.MerchantConnectorCreate;
import com.hyperswitch.model.MerchantConnectorDeleteResponse;
import com.hyperswitch.model.MerchantConnectorResponse;
import com.hyperswitch.model.MerchantConnectorUpdate;
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
     * Connector Account - Create
     *
     * Creates a new Connector Account for the merchant account. The connector could be a payment processor/facilitator/acquirer or a provider of specialized services like Fraud/Accounting etc.
     */
    @Test
    void createAMerchantConnectorTest() {
        MerchantConnectorCreate merchantConnectorCreate = null;
        // MerchantConnectorResponse response = api.createAMerchantConnector(merchantConnectorCreate);

        // TODO: test validations
    }

    
    /**
     * Merchant Connector - Delete
     *
     * Delete or Detach a Merchant Connector from Merchant Account
     */
    @Test
    void deleteAMerchantConnectorTest() {
        Integer id = null;
        // MerchantConnectorDeleteResponse response = api.deleteAMerchantConnector(id);

        // TODO: test validations
    }

    
    /**
     * Connector Account - Retrieve
     *
     * Retrieves details of a Connector account
     */
    @Test
    void retrieveAMerchantConnectorTest() {
        Integer id = null;
        // MerchantConnectorResponse response = api.retrieveAMerchantConnector(id);

        // TODO: test validations
    }

    
    /**
     * Connector Account - Update
     *
     * To update an existing Connector account. Helpful in enabling/disabling different payment methods and other settings for the connector
     */
    @Test
    void updateAMerchantConnectorTest() {
        Integer id = null;
        MerchantConnectorUpdate merchantConnectorUpdate = null;
        // MerchantConnectorResponse response = api.updateAMerchantConnector(id, merchantConnectorUpdate);

        // TODO: test validations
    }

    
}

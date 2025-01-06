package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.MerchantAccountCreate;
import com.hyperswitch.client.model.MerchantAccountDeleteResponse;
import com.hyperswitch.client.model.MerchantAccountResponse;
import com.hyperswitch.client.model.MerchantAccountUpdate;
import com.hyperswitch.client.model.ToggleKVRequest;
import com.hyperswitch.client.model.ToggleKVResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantAccountApi
 */
class MerchantAccountApiTest {

    private MerchantAccountApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(MerchantAccountApi.class);
    }

    
    /**
     * Merchant Account - Create
     *
     * Create a new account for a *merchant* and the *merchant* could be a seller or retailer or client who likes to receive and send payments.
     */
    @Test
    void createAMerchantAccountTest() {
        MerchantAccountCreate merchantAccountCreate = null;
        // MerchantAccountResponse response = api.createAMerchantAccount(merchantAccountCreate);

        // TODO: test validations
    }

    
    /**
     * Merchant Account - Delete
     *
     * Delete a *merchant* account
     */
    @Test
    void deleteAMerchantAccountTest() {
        String accountId = null;
        // MerchantAccountDeleteResponse response = api.deleteAMerchantAccount(accountId);

        // TODO: test validations
    }

    
    /**
     * Merchant Account - KV Status
     *
     * Toggle KV mode for the Merchant Account
     */
    @Test
    void enableDisableKVForAMerchantAccountTest() {
        String accountId = null;
        ToggleKVRequest toggleKVRequest = null;
        // ToggleKVResponse response = api.enableDisableKVForAMerchantAccount(accountId, toggleKVRequest);

        // TODO: test validations
    }

    
    /**
     * Merchant Account - Retrieve
     *
     * Retrieve a *merchant* account details.
     */
    @Test
    void retrieveAMerchantAccountTest() {
        String accountId = null;
        // MerchantAccountResponse response = api.retrieveAMerchantAccount(accountId);

        // TODO: test validations
    }

    
    /**
     * Merchant Account - Update
     *
     * Updates details of an existing merchant account. Helpful in updating merchant details such as email, contact details, or other configuration details like webhook, routing algorithm etc
     */
    @Test
    void updateAMerchantAccountTest() {
        String accountId = null;
        MerchantAccountUpdate merchantAccountUpdate = null;
        // MerchantAccountResponse response = api.updateAMerchantAccount(accountId, merchantAccountUpdate);

        // TODO: test validations
    }

    
}

package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.model.MerchantAccountCreate;
import com.hyperswitch.model.MerchantAccountResponse;
import com.hyperswitch.model.MerchantAccountUpdate;
import com.hyperswitch.model.ProfileResponse;
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
     * Create a new account for a *merchant* and the *merchant* could be a seller or retailer or client who likes to receive and send payments.  Before creating the merchant account, it is mandatory to create an organization.
     */
    @Test
    void createAMerchantAccountTest() {
        String xOrganizationId = null;
        MerchantAccountCreate merchantAccountCreate = null;
        // MerchantAccountResponse response = api.createAMerchantAccount(xOrganizationId, merchantAccountCreate);

        // TODO: test validations
    }

    
    /**
     * Merchant Account - Profile List
     *
     * List profiles for an Merchant
     */
    @Test
    void listProfilesTest() {
        String id = null;
        // List<ProfileResponse> response = api.listProfiles(id);

        // TODO: test validations
    }

    
    /**
     * Merchant Account - Retrieve
     *
     * Retrieve a *merchant* account details.
     */
    @Test
    void retrieveAMerchantAccountTest() {
        String id = null;
        // MerchantAccountResponse response = api.retrieveAMerchantAccount(id);

        // TODO: test validations
    }

    
    /**
     * Merchant Account - Update
     *
     * Updates details of an existing merchant account. Helpful in updating merchant details such as email, contact details, or other configuration details like webhook, routing algorithm etc
     */
    @Test
    void updateAMerchantAccountTest() {
        String id = null;
        MerchantAccountUpdate merchantAccountUpdate = null;
        // MerchantAccountResponse response = api.updateAMerchantAccount(id, merchantAccountUpdate);

        // TODO: test validations
    }

    
}

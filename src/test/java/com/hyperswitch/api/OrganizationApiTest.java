package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.model.MerchantAccountResponse;
import com.hyperswitch.model.OrganizationCreateRequest;
import com.hyperswitch.model.OrganizationResponse;
import com.hyperswitch.model.OrganizationUpdateRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationApi
 */
class OrganizationApiTest {

    private OrganizationApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(OrganizationApi.class);
    }

    
    /**
     * Organization - Create
     *
     * Create a new organization
     */
    @Test
    void createAnOrganizationTest() {
        OrganizationCreateRequest organizationCreateRequest = null;
        // OrganizationResponse response = api.createAnOrganization(organizationCreateRequest);

        // TODO: test validations
    }

    
    /**
     * Organization - Merchant Account - List
     *
     * List merchant accounts for an Organization
     */
    @Test
    void listMerchantAccountsTest() {
        String id = null;
        // List<MerchantAccountResponse> response = api.listMerchantAccounts(id);

        // TODO: test validations
    }

    
    /**
     * Organization - Retrieve
     *
     * Retrieve an existing organization
     */
    @Test
    void retrieveAnOrganizationTest() {
        String id = null;
        // OrganizationResponse response = api.retrieveAnOrganization(id);

        // TODO: test validations
    }

    
    /**
     * Organization - Update
     *
     * Create a new organization for .
     */
    @Test
    void updateAnOrganizationTest() {
        String id = null;
        OrganizationUpdateRequest organizationUpdateRequest = null;
        // OrganizationResponse response = api.updateAnOrganization(id, organizationUpdateRequest);

        // TODO: test validations
    }

    
}

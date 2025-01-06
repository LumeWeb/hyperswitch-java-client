package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.MandateResponse;
import com.hyperswitch.client.model.MandateRevokedResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MandatesApi
 */
class MandatesApiTest {

    private MandatesApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(MandatesApi.class);
    }

    
    /**
     * Mandates - Customer Mandates List
     *
     * Lists all the mandates for a particular customer id.
     */
    @Test
    void listMandatesForACustomerTest() {
        String customerId = null;
        // List<MandateResponse> response = api.listMandatesForACustomer(customerId);

        // TODO: test validations
    }

    
    /**
     * Mandates - Retrieve Mandate
     *
     * Retrieves a mandate created using the Payments/Create API
     */
    @Test
    void retrieveAMandateTest() {
        String mandateId = null;
        // MandateResponse response = api.retrieveAMandate(mandateId);

        // TODO: test validations
    }

    
    /**
     * Mandates - Revoke Mandate
     *
     * Revokes a mandate created using the Payments/Create API
     */
    @Test
    void revokeAMandateTest() {
        String mandateId = null;
        // MandateRevokedResponse response = api.revokeAMandate(mandateId);

        // TODO: test validations
    }

    
}

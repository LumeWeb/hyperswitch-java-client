package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.model.MerchantConnectorResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BusinessProfileApi
 */
class BusinessProfileApiTest {

    private BusinessProfileApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(BusinessProfileApi.class);
    }

    
    /**
     * Profile - Connector Accounts List
     *
     * List Connector Accounts for the profile
     */
    @Test
    void listAllConnectorAccountsTest() {
        String id = null;
        String xMerchantId = null;
        // List<MerchantConnectorResponse> response = api.listAllConnectorAccounts(id, xMerchantId);

        // TODO: test validations
    }

    
}

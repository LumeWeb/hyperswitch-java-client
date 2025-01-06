package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.GsmCreateRequest;
import com.hyperswitch.client.model.GsmDeleteRequest;
import com.hyperswitch.client.model.GsmDeleteResponse;
import com.hyperswitch.client.model.GsmResponse;
import com.hyperswitch.client.model.GsmRetrieveRequest;
import com.hyperswitch.client.model.GsmUpdateRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GsmApi
 */
class GsmApiTest {

    private GsmApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(GsmApi.class);
    }

    
    /**
     * Gsm - Create
     *
     * Creates a GSM (Global Status Mapping) Rule. A GSM rule is used to map a connector&#39;s error message/error code combination during a particular payments flow/sub-flow to Hyperswitch&#39;s unified status/error code/error message combination. It is also used to decide the next action in the flow - retry/requeue/do_default
     */
    @Test
    void createGsmRuleTest() {
        GsmCreateRequest gsmCreateRequest = null;
        // GsmResponse response = api.createGsmRule(gsmCreateRequest);

        // TODO: test validations
    }

    
    /**
     * Gsm - Delete
     *
     * Deletes a Gsm Rule
     */
    @Test
    void deleteGsmRuleTest() {
        GsmDeleteRequest gsmDeleteRequest = null;
        // GsmDeleteResponse response = api.deleteGsmRule(gsmDeleteRequest);

        // TODO: test validations
    }

    
    /**
     * Gsm - Get
     *
     * Retrieves a Gsm Rule
     */
    @Test
    void retrieveGsmRuleTest() {
        GsmRetrieveRequest gsmRetrieveRequest = null;
        // GsmResponse response = api.retrieveGsmRule(gsmRetrieveRequest);

        // TODO: test validations
    }

    
    /**
     * Gsm - Update
     *
     * Updates a Gsm Rule
     */
    @Test
    void updateGsmRuleTest() {
        GsmUpdateRequest gsmUpdateRequest = null;
        // GsmResponse response = api.updateGsmRule(gsmUpdateRequest);

        // TODO: test validations
    }

    
}

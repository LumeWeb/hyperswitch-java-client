package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.MerchantRoutingAlgorithm;
import com.hyperswitch.client.model.RoutingConfigRequest;
import com.hyperswitch.client.model.RoutingDictionaryRecord;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoutingApi
 */
class RoutingApiTest {

    private RoutingApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(RoutingApi.class);
    }

    
    /**
     * Routing - Create
     *
     * Create a routing algorithm
     */
    @Test
    void createARoutingAlgprithmTest() {
        RoutingConfigRequest routingConfigRequest = null;
        // RoutingDictionaryRecord response = api.createARoutingAlgprithm(routingConfigRequest);

        // TODO: test validations
    }

    
    /**
     * Routing - Retrieve
     *
     * Retrieve a routing algorithm with its algorithm id
     */
    @Test
    void retrieveARoutingAlgorithmWithItsAlgorithmIdTest() {
        String id = null;
        // MerchantRoutingAlgorithm response = api.retrieveARoutingAlgorithmWithItsAlgorithmId(id);

        // TODO: test validations
    }

    
}

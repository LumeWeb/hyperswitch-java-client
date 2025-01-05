package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.model.LinkedRoutingConfigRetrieveResponse;
import com.hyperswitch.model.ProfileCreate;
import com.hyperswitch.model.ProfileResponse;
import com.hyperswitch.model.RoutableConnectorChoice;
import com.hyperswitch.model.RoutingAlgorithmId;
import com.hyperswitch.model.RoutingDictionaryRecord;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfileApi
 */
class ProfileApiTest {

    private ProfileApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(ProfileApi.class);
    }

    
    /**
     * Profile - Activate routing algorithm
     *
     * Activates a routing algorithm under a profile
     */
    @Test
    void activatesARoutingAlgorithmUnderAProfileTest() {
        String id = null;
        RoutingAlgorithmId routingAlgorithmId = null;
        // RoutingDictionaryRecord response = api.activatesARoutingAlgorithmUnderAProfile(id, routingAlgorithmId);

        // TODO: test validations
    }

    
    /**
     * Profile - Create
     *
     * Creates a new *profile* for a merchant
     */
    @Test
    void createAProfileTest() {
        String xMerchantId = null;
        ProfileCreate profileCreate = null;
        // ProfileResponse response = api.createAProfile(xMerchantId, profileCreate);

        // TODO: test validations
    }

    
    /**
     * Profile - Deactivate routing algorithm
     *
     * Deactivates a routing algorithm under a profile
     */
    @Test
    void deactivatesARoutingAlgorithmUnderAProfileTest() {
        String id = null;
        // RoutingDictionaryRecord response = api.deactivatesARoutingAlgorithmUnderAProfile(id);

        // TODO: test validations
    }

    
    /**
     * Profile - Retrieve
     *
     * Retrieve existing *profile*
     */
    @Test
    void retrieveAProfileTest() {
        String id = null;
        String xMerchantId = null;
        // ProfileResponse response = api.retrieveAProfile(id, xMerchantId);

        // TODO: test validations
    }

    
    /**
     * Profile - Retrieve Active Routing Algorithm
     *
     * Retrieve active routing algorithm under the profile
     */
    @Test
    void retrieveTheActiveRoutingAlgorithmUnderTheProfileTest() {
        String id = null;
        Integer limit = null;
        Integer offset = null;
        // LinkedRoutingConfigRetrieveResponse response = api.retrieveTheActiveRoutingAlgorithmUnderTheProfile(id, limit, offset);

        // TODO: test validations
    }

    /**
     * Profile - Retrieve Active Routing Algorithm
     *
     * Retrieve active routing algorithm under the profile
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void retrieveTheActiveRoutingAlgorithmUnderTheProfileTestQueryMap() {
        String id = null;
        ProfileApi.RetrieveTheActiveRoutingAlgorithmUnderTheProfileQueryParams queryParams = new ProfileApi.RetrieveTheActiveRoutingAlgorithmUnderTheProfileQueryParams()
            .limit(null)
            .offset(null);
        // LinkedRoutingConfigRetrieveResponse response = api.retrieveTheActiveRoutingAlgorithmUnderTheProfile(id, queryParams);

    // TODO: test validations
    }
    
    /**
     * Profile - Retrieve Default Fallback Routing Algorithm
     *
     * Retrieve the default fallback routing algorithm for the profile
     */
    @Test
    void retrieveTheDefaultFallbackRoutingAlgorithmForTheProfileTest() {
        String id = null;
        // List<RoutableConnectorChoice> response = api.retrieveTheDefaultFallbackRoutingAlgorithmForTheProfile(id);

        // TODO: test validations
    }

    
    /**
     * Profile - Update
     *
     * Update the *profile*
     */
    @Test
    void updateAProfileTest() {
        String id = null;
        String xMerchantId = null;
        ProfileCreate profileCreate = null;
        // ProfileResponse response = api.updateAProfile(id, xMerchantId, profileCreate);

        // TODO: test validations
    }

    
    /**
     * Profile - Update Default Fallback Routing Algorithm
     *
     * Update the default fallback routing algorithm for the profile
     */
    @Test
    void updateTheDefaultFallbackRoutingAlgorithmForTheProfileTest() {
        String id = null;
        List<RoutableConnectorChoice> routableConnectorChoice = null;
        // List<RoutableConnectorChoice> response = api.updateTheDefaultFallbackRoutingAlgorithmForTheProfile(id, routableConnectorChoice);

        // TODO: test validations
    }

    
}

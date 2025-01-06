package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.DynamicRoutingFeatures;
import com.hyperswitch.client.model.LinkedRoutingConfigRetrieveResponse;
import com.hyperswitch.client.model.MerchantRoutingAlgorithm;
import com.hyperswitch.client.model.ProfileDefaultRoutingConfig;
import com.hyperswitch.client.model.RoutableConnectorChoice;
import com.hyperswitch.client.model.RoutingConfigRequest;
import com.hyperswitch.client.model.RoutingDictionaryRecord;
import com.hyperswitch.client.model.RoutingKind;
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
     * Routing - Activate config
     *
     * Activate a routing config
     */
    @Test
    void activateARoutingConfigTest() {
        String routingAlgorithmId = null;
        // RoutingDictionaryRecord response = api.activateARoutingConfig(routingAlgorithmId);

        // TODO: test validations
    }

    
    /**
     * Routing - Create
     *
     * Create a routing config
     */
    @Test
    void createARoutingConfigTest() {
        RoutingConfigRequest routingConfigRequest = null;
        // RoutingDictionaryRecord response = api.createARoutingConfig(routingConfigRequest);

        // TODO: test validations
    }

    
    /**
     * Routing - Deactivate
     *
     * Deactivates a routing config
     */
    @Test
    void deactivateARoutingConfigTest() {
        RoutingConfigRequest routingConfigRequest = null;
        // RoutingDictionaryRecord response = api.deactivateARoutingConfig(routingConfigRequest);

        // TODO: test validations
    }

    
    /**
     * Routing - List
     *
     * List all routing configs
     */
    @Test
    void listRoutingConfigsTest() {
        Integer limit = null;
        Integer offset = null;
        String profileId = null;
        // RoutingKind response = api.listRoutingConfigs(limit, offset, profileId);

        // TODO: test validations
    }

    /**
     * Routing - List
     *
     * List all routing configs
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listRoutingConfigsTestQueryMap() {
        RoutingApi.ListRoutingConfigsQueryParams queryParams = new RoutingApi.ListRoutingConfigsQueryParams()
            .limit(null)
            .offset(null)
            .profileId(null);
        // RoutingKind response = api.listRoutingConfigs(queryParams);

    // TODO: test validations
    }
    
    /**
     * Routing - Retrieve
     *
     * Retrieve a routing algorithm
     */
    @Test
    void retrieveARoutingConfigTest() {
        String routingAlgorithmId = null;
        // MerchantRoutingAlgorithm response = api.retrieveARoutingConfig(routingAlgorithmId);

        // TODO: test validations
    }

    
    /**
     * Routing - Retrieve Config
     *
     * Retrieve active config
     */
    @Test
    void retrieveActiveConfigTest() {
        String profileId = null;
        // LinkedRoutingConfigRetrieveResponse response = api.retrieveActiveConfig(profileId);

        // TODO: test validations
    }

    /**
     * Routing - Retrieve Config
     *
     * Retrieve active config
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void retrieveActiveConfigTestQueryMap() {
        RoutingApi.RetrieveActiveConfigQueryParams queryParams = new RoutingApi.RetrieveActiveConfigQueryParams()
            .profileId(null);
        // LinkedRoutingConfigRetrieveResponse response = api.retrieveActiveConfig(queryParams);

    // TODO: test validations
    }
    
    /**
     * Routing - Retrieve Default For Profile
     *
     * Retrieve default config for profiles
     */
    @Test
    void retrieveDefaultConfigsForAllProfilesTest() {
        // ProfileDefaultRoutingConfig response = api.retrieveDefaultConfigsForAllProfiles();

        // TODO: test validations
    }

    
    /**
     * Routing - Retrieve Default Config
     *
     * Retrieve default fallback config
     */
    @Test
    void retrieveDefaultFallbackConfigTest() {
        // List<RoutableConnectorChoice> response = api.retrieveDefaultFallbackConfig();

        // TODO: test validations
    }

    
    /**
     * Routing - Toggle success based dynamic routing for profile
     *
     * Create a success based dynamic routing algorithm
     */
    @Test
    void toggleSuccessBasedDynamicRoutingAlgorithmTest() {
        String accountId = null;
        String profileId = null;
        DynamicRoutingFeatures enable = null;
        // RoutingDictionaryRecord response = api.toggleSuccessBasedDynamicRoutingAlgorithm(accountId, profileId, enable);

        // TODO: test validations
    }

    /**
     * Routing - Toggle success based dynamic routing for profile
     *
     * Create a success based dynamic routing algorithm
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void toggleSuccessBasedDynamicRoutingAlgorithmTestQueryMap() {
        String accountId = null;
        String profileId = null;
        RoutingApi.ToggleSuccessBasedDynamicRoutingAlgorithmQueryParams queryParams = new RoutingApi.ToggleSuccessBasedDynamicRoutingAlgorithmQueryParams()
            .enable(null);
        // RoutingDictionaryRecord response = api.toggleSuccessBasedDynamicRoutingAlgorithm(accountId, profileId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Routing - Update Default For Profile
     *
     * Update default config for profiles
     */
    @Test
    void updateDefaultConfigsForAllProfilesTest() {
        String profileId = null;
        List<RoutableConnectorChoice> routableConnectorChoice = null;
        // ProfileDefaultRoutingConfig response = api.updateDefaultConfigsForAllProfiles(profileId, routableConnectorChoice);

        // TODO: test validations
    }

    
    /**
     * Routing - Update Default Config
     *
     * Update default fallback config
     */
    @Test
    void updateDefaultFallbackConfigTest() {
        List<RoutableConnectorChoice> routableConnectorChoice = null;
        // List<RoutableConnectorChoice> response = api.updateDefaultFallbackConfig(routableConnectorChoice);

        // TODO: test validations
    }

    
}

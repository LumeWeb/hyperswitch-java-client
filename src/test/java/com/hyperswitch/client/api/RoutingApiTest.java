/*
 * Hyperswitch - API Documentation
 *  ## Get started  Hyperswitch provides a collection of APIs that enable you to process and manage payments. Our APIs accept and return JSON in the HTTP body, and return standard HTTP response codes.  You can consume the APIs directly using your favorite HTTP/REST library.  We have a testing environment referred to \"sandbox\", which you can setup to test API calls without affecting production data. Currently, our sandbox environment is live while our production environment is under development and will be available soon. You can sign up on our Dashboard to get API keys to access Hyperswitch API.  ### Environment  Use the following base URLs when making requests to the APIs:  | Environment   |  Base URL                          | |---------------|------------------------------------| | Sandbox       | <https://sandbox.hyperswitch.io>   | | Production    | <https://api.hyperswitch.io>       |  ## Authentication  When you sign up on our [dashboard](https://app.hyperswitch.io) and create a merchant account, you are given a secret key (also referred as api-key) and a publishable key. You may authenticate all API requests with Hyperswitch server by providing the appropriate key in the request Authorization header.  | Key             |  Description                                                                                  | |-----------------|-----------------------------------------------------------------------------------------------| | api-key         | Private key. Used to authenticate all API requests from your merchant server                  | | publishable key | Unique identifier for your account. Used to authenticate API requests from your app's client  |  Never share your secret api keys. Keep them guarded and secure. 
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: hyperswitch@juspay.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.model.DynamicRoutingFeatures;
import com.hyperswitch.client.model.LinkedRoutingConfigRetrieveResponse;
import com.hyperswitch.client.model.MerchantRoutingAlgorithm;
import com.hyperswitch.client.model.ProfileDefaultRoutingConfig;
import com.hyperswitch.client.model.RoutableConnectorChoice;
import com.hyperswitch.client.model.RoutingConfigRequest;
import com.hyperswitch.client.model.RoutingDictionaryRecord;
import com.hyperswitch.client.model.RoutingKind;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoutingApi
 */
@Ignore
public class RoutingApiTest {

    private final RoutingApi api = new RoutingApi();

    /**
     * Routing - Activate config
     *
     * Activate a routing config
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void activateARoutingConfigTest() throws ApiException {
        String routingAlgorithmId = null;
        RoutingDictionaryRecord response = api.activateARoutingConfig(routingAlgorithmId);

        // TODO: test validations
    }
    /**
     * Routing - Create
     *
     * Create a routing config
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createARoutingConfigTest() throws ApiException {
        RoutingConfigRequest routingConfigRequest = null;
        RoutingDictionaryRecord response = api.createARoutingConfig(routingConfigRequest);

        // TODO: test validations
    }
    /**
     * Routing - Deactivate
     *
     * Deactivates a routing config
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deactivateARoutingConfigTest() throws ApiException {
        RoutingConfigRequest routingConfigRequest = null;
        RoutingDictionaryRecord response = api.deactivateARoutingConfig(routingConfigRequest);

        // TODO: test validations
    }
    /**
     * Routing - List
     *
     * List all routing configs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRoutingConfigsTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String profileId = null;
        RoutingKind response = api.listRoutingConfigs(limit, offset, profileId);

        // TODO: test validations
    }
    /**
     * Routing - Retrieve
     *
     * Retrieve a routing algorithm
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveARoutingConfigTest() throws ApiException {
        String routingAlgorithmId = null;
        MerchantRoutingAlgorithm response = api.retrieveARoutingConfig(routingAlgorithmId);

        // TODO: test validations
    }
    /**
     * Routing - Retrieve Config
     *
     * Retrieve active config
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveActiveConfigTest() throws ApiException {
        String profileId = null;
        LinkedRoutingConfigRetrieveResponse response = api.retrieveActiveConfig(profileId);

        // TODO: test validations
    }
    /**
     * Routing - Retrieve Default For Profile
     *
     * Retrieve default config for profiles
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveDefaultConfigsForAllProfilesTest() throws ApiException {
        ProfileDefaultRoutingConfig response = api.retrieveDefaultConfigsForAllProfiles();

        // TODO: test validations
    }
    /**
     * Routing - Retrieve Default Config
     *
     * Retrieve default fallback config
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveDefaultFallbackConfigTest() throws ApiException {
        List<RoutableConnectorChoice> response = api.retrieveDefaultFallbackConfig();

        // TODO: test validations
    }
    /**
     * Routing - Toggle success based dynamic routing for profile
     *
     * Create a success based dynamic routing algorithm
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void toggleSuccessBasedDynamicRoutingAlgorithmTest() throws ApiException {
        String accountId = null;
        String profileId = null;
        DynamicRoutingFeatures enable = null;
        RoutingDictionaryRecord response = api.toggleSuccessBasedDynamicRoutingAlgorithm(accountId, profileId, enable);

        // TODO: test validations
    }
    /**
     * Routing - Update Default For Profile
     *
     * Update default config for profiles
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDefaultConfigsForAllProfilesTest() throws ApiException {
        String profileId = null;
        List<RoutableConnectorChoice> routableConnectorChoice = null;
        ProfileDefaultRoutingConfig response = api.updateDefaultConfigsForAllProfiles(profileId, routableConnectorChoice);

        // TODO: test validations
    }
    /**
     * Routing - Update Default Config
     *
     * Update default fallback config
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDefaultFallbackConfigTest() throws ApiException {
        List<RoutableConnectorChoice> routableConnectorChoice = null;
        List<RoutableConnectorChoice> response = api.updateDefaultFallbackConfig(routableConnectorChoice);

        // TODO: test validations
    }
}

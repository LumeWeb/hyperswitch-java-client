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


package com.hyperswitch.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.client.model.BusinessCollectLinkConfig;
import com.hyperswitch.client.model.MerchantDetails;
import com.hyperswitch.client.model.PrimaryBusinessDetails;
import com.hyperswitch.client.model.ReconStatus;
import com.hyperswitch.client.model.RoutingAlgorithm;
import com.hyperswitch.client.model.WebhookDetails;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;


/**
 * Model tests for MerchantAccountResponse
 */
class MerchantAccountResponseTest {
    private final MerchantAccountResponse model = new MerchantAccountResponse();

    /**
     * Model tests for MerchantAccountResponse
     */
    @Test
    void testMerchantAccountResponse() {
        // TODO: test MerchantAccountResponse
    }

    /**
     * Test the property 'merchantId'
     */
    @Test
    void merchantIdTest() {
        // TODO: test merchantId
    }

    /**
     * Test the property 'merchantName'
     */
    @Test
    void merchantNameTest() {
        // TODO: test merchantName
    }

    /**
     * Test the property 'returnUrl'
     */
    @Test
    void returnUrlTest() {
        // TODO: test returnUrl
    }

    /**
     * Test the property 'enablePaymentResponseHash'
     */
    @Test
    void enablePaymentResponseHashTest() {
        // TODO: test enablePaymentResponseHash
    }

    /**
     * Test the property 'paymentResponseHashKey'
     */
    @Test
    void paymentResponseHashKeyTest() {
        // TODO: test paymentResponseHashKey
    }

    /**
     * Test the property 'redirectToMerchantWithHttpPost'
     */
    @Test
    void redirectToMerchantWithHttpPostTest() {
        // TODO: test redirectToMerchantWithHttpPost
    }

    /**
     * Test the property 'merchantDetails'
     */
    @Test
    void merchantDetailsTest() {
        // TODO: test merchantDetails
    }

    /**
     * Test the property 'webhookDetails'
     */
    @Test
    void webhookDetailsTest() {
        // TODO: test webhookDetails
    }

    /**
     * Test the property 'payoutRoutingAlgorithm'
     */
    @Test
    void payoutRoutingAlgorithmTest() {
        // TODO: test payoutRoutingAlgorithm
    }

    /**
     * Test the property 'subMerchantsEnabled'
     */
    @Test
    void subMerchantsEnabledTest() {
        // TODO: test subMerchantsEnabled
    }

    /**
     * Test the property 'parentMerchantId'
     */
    @Test
    void parentMerchantIdTest() {
        // TODO: test parentMerchantId
    }

    /**
     * Test the property 'publishableKey'
     */
    @Test
    void publishableKeyTest() {
        // TODO: test publishableKey
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'lockerId'
     */
    @Test
    void lockerIdTest() {
        // TODO: test lockerId
    }

    /**
     * Test the property 'primaryBusinessDetails'
     */
    @Test
    void primaryBusinessDetailsTest() {
        // TODO: test primaryBusinessDetails
    }

    /**
     * Test the property 'frmRoutingAlgorithm'
     */
    @Test
    void frmRoutingAlgorithmTest() {
        // TODO: test frmRoutingAlgorithm
    }

    /**
     * Test the property 'organizationId'
     */
    @Test
    void organizationIdTest() {
        // TODO: test organizationId
    }

    /**
     * Test the property 'isReconEnabled'
     */
    @Test
    void isReconEnabledTest() {
        // TODO: test isReconEnabled
    }

    /**
     * Test the property 'defaultProfile'
     */
    @Test
    void defaultProfileTest() {
        // TODO: test defaultProfile
    }

    /**
     * Test the property 'reconStatus'
     */
    @Test
    void reconStatusTest() {
        // TODO: test reconStatus
    }

    /**
     * Test the property 'pmCollectLinkConfig'
     */
    @Test
    void pmCollectLinkConfigTest() {
        // TODO: test pmCollectLinkConfig
    }

}

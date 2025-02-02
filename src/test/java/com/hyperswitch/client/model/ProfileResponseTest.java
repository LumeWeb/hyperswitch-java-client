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
import com.hyperswitch.client.model.AuthenticationConnectorDetails;
import com.hyperswitch.client.model.BusinessPaymentLinkConfig;
import com.hyperswitch.client.model.BusinessPayoutLinkConfig;
import com.hyperswitch.client.model.ExtendedCardInfoConfig;
import com.hyperswitch.client.model.RoutingAlgorithm;
import com.hyperswitch.client.model.WebhookDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for ProfileResponse
 */
class ProfileResponseTest {
    private final ProfileResponse model = new ProfileResponse();

    /**
     * Model tests for ProfileResponse
     */
    @Test
    void testProfileResponse() {
        // TODO: test ProfileResponse
    }

    /**
     * Test the property 'merchantId'
     */
    @Test
    void merchantIdTest() {
        // TODO: test merchantId
    }

    /**
     * Test the property 'profileId'
     */
    @Test
    void profileIdTest() {
        // TODO: test profileId
    }

    /**
     * Test the property 'profileName'
     */
    @Test
    void profileNameTest() {
        // TODO: test profileName
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
     * Test the property 'webhookDetails'
     */
    @Test
    void webhookDetailsTest() {
        // TODO: test webhookDetails
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'routingAlgorithm'
     */
    @Test
    void routingAlgorithmTest() {
        // TODO: test routingAlgorithm
    }

    /**
     * Test the property 'intentFulfillmentTime'
     */
    @Test
    void intentFulfillmentTimeTest() {
        // TODO: test intentFulfillmentTime
    }

    /**
     * Test the property 'frmRoutingAlgorithm'
     */
    @Test
    void frmRoutingAlgorithmTest() {
        // TODO: test frmRoutingAlgorithm
    }

    /**
     * Test the property 'payoutRoutingAlgorithm'
     */
    @Test
    void payoutRoutingAlgorithmTest() {
        // TODO: test payoutRoutingAlgorithm
    }

    /**
     * Test the property 'applepayVerifiedDomains'
     */
    @Test
    void applepayVerifiedDomainsTest() {
        // TODO: test applepayVerifiedDomains
    }

    /**
     * Test the property 'sessionExpiry'
     */
    @Test
    void sessionExpiryTest() {
        // TODO: test sessionExpiry
    }

    /**
     * Test the property 'paymentLinkConfig'
     */
    @Test
    void paymentLinkConfigTest() {
        // TODO: test paymentLinkConfig
    }

    /**
     * Test the property 'authenticationConnectorDetails'
     */
    @Test
    void authenticationConnectorDetailsTest() {
        // TODO: test authenticationConnectorDetails
    }

    /**
     * Test the property 'useBillingAsPaymentMethodBilling'
     */
    @Test
    void useBillingAsPaymentMethodBillingTest() {
        // TODO: test useBillingAsPaymentMethodBilling
    }

    /**
     * Test the property 'extendedCardInfoConfig'
     */
    @Test
    void extendedCardInfoConfigTest() {
        // TODO: test extendedCardInfoConfig
    }

    /**
     * Test the property 'collectShippingDetailsFromWalletConnector'
     */
    @Test
    void collectShippingDetailsFromWalletConnectorTest() {
        // TODO: test collectShippingDetailsFromWalletConnector
    }

    /**
     * Test the property 'collectBillingDetailsFromWalletConnector'
     */
    @Test
    void collectBillingDetailsFromWalletConnectorTest() {
        // TODO: test collectBillingDetailsFromWalletConnector
    }

    /**
     * Test the property 'alwaysCollectShippingDetailsFromWalletConnector'
     */
    @Test
    void alwaysCollectShippingDetailsFromWalletConnectorTest() {
        // TODO: test alwaysCollectShippingDetailsFromWalletConnector
    }

    /**
     * Test the property 'alwaysCollectBillingDetailsFromWalletConnector'
     */
    @Test
    void alwaysCollectBillingDetailsFromWalletConnectorTest() {
        // TODO: test alwaysCollectBillingDetailsFromWalletConnector
    }

    /**
     * Test the property 'isConnectorAgnosticMitEnabled'
     */
    @Test
    void isConnectorAgnosticMitEnabledTest() {
        // TODO: test isConnectorAgnosticMitEnabled
    }

    /**
     * Test the property 'payoutLinkConfig'
     */
    @Test
    void payoutLinkConfigTest() {
        // TODO: test payoutLinkConfig
    }

    /**
     * Test the property 'outgoingWebhookCustomHttpHeaders'
     */
    @Test
    void outgoingWebhookCustomHttpHeadersTest() {
        // TODO: test outgoingWebhookCustomHttpHeaders
    }

    /**
     * Test the property 'taxConnectorId'
     */
    @Test
    void taxConnectorIdTest() {
        // TODO: test taxConnectorId
    }

    /**
     * Test the property 'isTaxConnectorEnabled'
     */
    @Test
    void isTaxConnectorEnabledTest() {
        // TODO: test isTaxConnectorEnabled
    }

    /**
     * Test the property 'isNetworkTokenizationEnabled'
     */
    @Test
    void isNetworkTokenizationEnabledTest() {
        // TODO: test isNetworkTokenizationEnabled
    }

    /**
     * Test the property 'isAutoRetriesEnabled'
     */
    @Test
    void isAutoRetriesEnabledTest() {
        // TODO: test isAutoRetriesEnabled
    }

    /**
     * Test the property 'maxAutoRetriesEnabled'
     */
    @Test
    void maxAutoRetriesEnabledTest() {
        // TODO: test maxAutoRetriesEnabled
    }

}

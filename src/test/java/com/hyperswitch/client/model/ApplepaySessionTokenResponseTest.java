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
import com.hyperswitch.client.model.ApplePayPaymentRequest;
import com.hyperswitch.client.model.ApplePaySessionResponse;
import com.hyperswitch.client.model.SdkNextAction;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;


/**
 * Model tests for ApplepaySessionTokenResponse
 */
class ApplepaySessionTokenResponseTest {
    private final ApplepaySessionTokenResponse model = new ApplepaySessionTokenResponse();

    /**
     * Model tests for ApplepaySessionTokenResponse
     */
    @Test
    void testApplepaySessionTokenResponse() {
        // TODO: test ApplepaySessionTokenResponse
    }

    /**
     * Test the property 'sessionTokenData'
     */
    @Test
    void sessionTokenDataTest() {
        // TODO: test sessionTokenData
    }

    /**
     * Test the property 'paymentRequestData'
     */
    @Test
    void paymentRequestDataTest() {
        // TODO: test paymentRequestData
    }

    /**
     * Test the property 'connector'
     */
    @Test
    void connectorTest() {
        // TODO: test connector
    }

    /**
     * Test the property 'delayedSessionToken'
     */
    @Test
    void delayedSessionTokenTest() {
        // TODO: test delayedSessionToken
    }

    /**
     * Test the property 'sdkNextAction'
     */
    @Test
    void sdkNextActionTest() {
        // TODO: test sdkNextAction
    }

    /**
     * Test the property 'connectorReferenceId'
     */
    @Test
    void connectorReferenceIdTest() {
        // TODO: test connectorReferenceId
    }

    /**
     * Test the property 'connectorSdkPublicKey'
     */
    @Test
    void connectorSdkPublicKeyTest() {
        // TODO: test connectorSdkPublicKey
    }

    /**
     * Test the property 'connectorMerchantId'
     */
    @Test
    void connectorMerchantIdTest() {
        // TODO: test connectorMerchantId
    }

}

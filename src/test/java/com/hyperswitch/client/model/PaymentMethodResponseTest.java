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
import com.hyperswitch.client.model.Bank;
import com.hyperswitch.client.model.CardDetailFromLocker;
import com.hyperswitch.client.model.PaymentExperience;
import com.hyperswitch.client.model.PaymentMethod;
import com.hyperswitch.client.model.PaymentMethodType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;


/**
 * Model tests for PaymentMethodResponse
 */
class PaymentMethodResponseTest {
    private final PaymentMethodResponse model = new PaymentMethodResponse();

    /**
     * Model tests for PaymentMethodResponse
     */
    @Test
    void testPaymentMethodResponse() {
        // TODO: test PaymentMethodResponse
    }

    /**
     * Test the property 'merchantId'
     */
    @Test
    void merchantIdTest() {
        // TODO: test merchantId
    }

    /**
     * Test the property 'customerId'
     */
    @Test
    void customerIdTest() {
        // TODO: test customerId
    }

    /**
     * Test the property 'paymentMethodId'
     */
    @Test
    void paymentMethodIdTest() {
        // TODO: test paymentMethodId
    }

    /**
     * Test the property 'paymentMethod'
     */
    @Test
    void paymentMethodTest() {
        // TODO: test paymentMethod
    }

    /**
     * Test the property 'paymentMethodType'
     */
    @Test
    void paymentMethodTypeTest() {
        // TODO: test paymentMethodType
    }

    /**
     * Test the property 'card'
     */
    @Test
    void cardTest() {
        // TODO: test card
    }

    /**
     * Test the property 'recurringEnabled'
     */
    @Test
    void recurringEnabledTest() {
        // TODO: test recurringEnabled
    }

    /**
     * Test the property 'installmentPaymentEnabled'
     */
    @Test
    void installmentPaymentEnabledTest() {
        // TODO: test installmentPaymentEnabled
    }

    /**
     * Test the property 'paymentExperience'
     */
    @Test
    void paymentExperienceTest() {
        // TODO: test paymentExperience
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'created'
     */
    @Test
    void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'bankTransfer'
     */
    @Test
    void bankTransferTest() {
        // TODO: test bankTransfer
    }

    /**
     * Test the property 'lastUsedAt'
     */
    @Test
    void lastUsedAtTest() {
        // TODO: test lastUsedAt
    }

    /**
     * Test the property 'clientSecret'
     */
    @Test
    void clientSecretTest() {
        // TODO: test clientSecret
    }

}

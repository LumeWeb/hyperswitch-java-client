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
import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.DisputeStage;
import com.hyperswitch.client.model.DisputeStatus;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for DisputeResponse
 */
class DisputeResponseTest {
    private final DisputeResponse model = new DisputeResponse();

    /**
     * Model tests for DisputeResponse
     */
    @Test
    void testDisputeResponse() {
        // TODO: test DisputeResponse
    }

    /**
     * Test the property 'disputeId'
     */
    @Test
    void disputeIdTest() {
        // TODO: test disputeId
    }

    /**
     * Test the property 'paymentId'
     */
    @Test
    void paymentIdTest() {
        // TODO: test paymentId
    }

    /**
     * Test the property 'attemptId'
     */
    @Test
    void attemptIdTest() {
        // TODO: test attemptId
    }

    /**
     * Test the property 'amount'
     */
    @Test
    void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'currency'
     */
    @Test
    void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'disputeStage'
     */
    @Test
    void disputeStageTest() {
        // TODO: test disputeStage
    }

    /**
     * Test the property 'disputeStatus'
     */
    @Test
    void disputeStatusTest() {
        // TODO: test disputeStatus
    }

    /**
     * Test the property 'connector'
     */
    @Test
    void connectorTest() {
        // TODO: test connector
    }

    /**
     * Test the property 'connectorStatus'
     */
    @Test
    void connectorStatusTest() {
        // TODO: test connectorStatus
    }

    /**
     * Test the property 'connectorDisputeId'
     */
    @Test
    void connectorDisputeIdTest() {
        // TODO: test connectorDisputeId
    }

    /**
     * Test the property 'connectorReason'
     */
    @Test
    void connectorReasonTest() {
        // TODO: test connectorReason
    }

    /**
     * Test the property 'connectorReasonCode'
     */
    @Test
    void connectorReasonCodeTest() {
        // TODO: test connectorReasonCode
    }

    /**
     * Test the property 'challengeRequiredBy'
     */
    @Test
    void challengeRequiredByTest() {
        // TODO: test challengeRequiredBy
    }

    /**
     * Test the property 'connectorCreatedAt'
     */
    @Test
    void connectorCreatedAtTest() {
        // TODO: test connectorCreatedAt
    }

    /**
     * Test the property 'connectorUpdatedAt'
     */
    @Test
    void connectorUpdatedAtTest() {
        // TODO: test connectorUpdatedAt
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'profileId'
     */
    @Test
    void profileIdTest() {
        // TODO: test profileId
    }

    /**
     * Test the property 'merchantConnectorId'
     */
    @Test
    void merchantConnectorIdTest() {
        // TODO: test merchantConnectorId
    }

}

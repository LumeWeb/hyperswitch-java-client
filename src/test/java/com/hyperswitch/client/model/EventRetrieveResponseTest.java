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
import com.hyperswitch.client.model.EventClass;
import com.hyperswitch.client.model.EventType;
import com.hyperswitch.client.model.OutgoingWebhookRequestContent;
import com.hyperswitch.client.model.OutgoingWebhookResponseContent;
import com.hyperswitch.client.model.WebhookDeliveryAttempt;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for EventRetrieveResponse
 */
class EventRetrieveResponseTest {
    private final EventRetrieveResponse model = new EventRetrieveResponse();

    /**
     * Model tests for EventRetrieveResponse
     */
    @Test
    void testEventRetrieveResponse() {
        // TODO: test EventRetrieveResponse
    }

    /**
     * Test the property 'eventId'
     */
    @Test
    void eventIdTest() {
        // TODO: test eventId
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
     * Test the property 'objectId'
     */
    @Test
    void objectIdTest() {
        // TODO: test objectId
    }

    /**
     * Test the property 'eventType'
     */
    @Test
    void eventTypeTest() {
        // TODO: test eventType
    }

    /**
     * Test the property 'eventClass'
     */
    @Test
    void eventClassTest() {
        // TODO: test eventClass
    }

    /**
     * Test the property 'isDeliverySuccessful'
     */
    @Test
    void isDeliverySuccessfulTest() {
        // TODO: test isDeliverySuccessful
    }

    /**
     * Test the property 'initialAttemptId'
     */
    @Test
    void initialAttemptIdTest() {
        // TODO: test initialAttemptId
    }

    /**
     * Test the property 'created'
     */
    @Test
    void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'request'
     */
    @Test
    void requestTest() {
        // TODO: test request
    }

    /**
     * Test the property 'response'
     */
    @Test
    void responseTest() {
        // TODO: test response
    }

    /**
     * Test the property 'deliveryAttempt'
     */
    @Test
    void deliveryAttemptTest() {
        // TODO: test deliveryAttempt
    }

}

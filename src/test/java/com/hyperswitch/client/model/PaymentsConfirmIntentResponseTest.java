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
import com.hyperswitch.client.model.BrowserInformation;
import com.hyperswitch.client.model.ConfirmIntentAmountDetailsResponse;
import com.hyperswitch.client.model.ErrorDetails;
import com.hyperswitch.client.model.IntentStatus;
import com.hyperswitch.client.model.NextActionData;
import com.hyperswitch.client.model.PaymentMethod;
import com.hyperswitch.client.model.PaymentMethodDataResponseWithBilling;
import com.hyperswitch.client.model.PaymentMethodType;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;


/**
 * Model tests for PaymentsConfirmIntentResponse
 */
class PaymentsConfirmIntentResponseTest {
    private final PaymentsConfirmIntentResponse model = new PaymentsConfirmIntentResponse();

    /**
     * Model tests for PaymentsConfirmIntentResponse
     */
    @Test
    void testPaymentsConfirmIntentResponse() {
        // TODO: test PaymentsConfirmIntentResponse
    }

    /**
     * Test the property 'id'
     */
    @Test
    void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'status'
     */
    @Test
    void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'amount'
     */
    @Test
    void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'connector'
     */
    @Test
    void connectorTest() {
        // TODO: test connector
    }

    /**
     * Test the property 'clientSecret'
     */
    @Test
    void clientSecretTest() {
        // TODO: test clientSecret
    }

    /**
     * Test the property 'created'
     */
    @Test
    void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'paymentMethodData'
     */
    @Test
    void paymentMethodDataTest() {
        // TODO: test paymentMethodData
    }

    /**
     * Test the property 'paymentMethodType'
     */
    @Test
    void paymentMethodTypeTest() {
        // TODO: test paymentMethodType
    }

    /**
     * Test the property 'paymentMethodSubtype'
     */
    @Test
    void paymentMethodSubtypeTest() {
        // TODO: test paymentMethodSubtype
    }

    /**
     * Test the property 'nextAction'
     */
    @Test
    void nextActionTest() {
        // TODO: test nextAction
    }

    /**
     * Test the property 'connectorTransactionId'
     */
    @Test
    void connectorTransactionIdTest() {
        // TODO: test connectorTransactionId
    }

    /**
     * Test the property 'connectorReferenceId'
     */
    @Test
    void connectorReferenceIdTest() {
        // TODO: test connectorReferenceId
    }

    /**
     * Test the property 'merchantConnectorId'
     */
    @Test
    void merchantConnectorIdTest() {
        // TODO: test merchantConnectorId
    }

    /**
     * Test the property 'browserInfo'
     */
    @Test
    void browserInfoTest() {
        // TODO: test browserInfo
    }

    /**
     * Test the property 'error'
     */
    @Test
    void errorTest() {
        // TODO: test error
    }

}

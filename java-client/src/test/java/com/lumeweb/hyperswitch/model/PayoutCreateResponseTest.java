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


package com.lumeweb.hyperswitch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.lumeweb.hyperswitch.model.Address;
import com.lumeweb.hyperswitch.model.CountryAlpha2;
import com.lumeweb.hyperswitch.model.Currency;
import com.lumeweb.hyperswitch.model.CustomerDetailsResponse;
import com.lumeweb.hyperswitch.model.PayoutAttemptResponse;
import com.lumeweb.hyperswitch.model.PayoutEntityType;
import com.lumeweb.hyperswitch.model.PayoutLinkResponse;
import com.lumeweb.hyperswitch.model.PayoutMethodDataResponse;
import com.lumeweb.hyperswitch.model.PayoutSendPriority;
import com.lumeweb.hyperswitch.model.PayoutStatus;
import com.lumeweb.hyperswitch.model.PayoutType;
import java.time.OffsetDateTime;
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
 * Model tests for PayoutCreateResponse
 */
class PayoutCreateResponseTest {
    private final PayoutCreateResponse model = new PayoutCreateResponse();

    /**
     * Model tests for PayoutCreateResponse
     */
    @Test
    void testPayoutCreateResponse() {
        // TODO: test PayoutCreateResponse
    }

    /**
     * Test the property 'payoutId'
     */
    @Test
    void payoutIdTest() {
        // TODO: test payoutId
    }

    /**
     * Test the property 'merchantId'
     */
    @Test
    void merchantIdTest() {
        // TODO: test merchantId
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
     * Test the property 'connector'
     */
    @Test
    void connectorTest() {
        // TODO: test connector
    }

    /**
     * Test the property 'payoutType'
     */
    @Test
    void payoutTypeTest() {
        // TODO: test payoutType
    }

    /**
     * Test the property 'payoutMethodData'
     */
    @Test
    void payoutMethodDataTest() {
        // TODO: test payoutMethodData
    }

    /**
     * Test the property 'billing'
     */
    @Test
    void billingTest() {
        // TODO: test billing
    }

    /**
     * Test the property 'autoFulfill'
     */
    @Test
    void autoFulfillTest() {
        // TODO: test autoFulfill
    }

    /**
     * Test the property 'customerId'
     */
    @Test
    void customerIdTest() {
        // TODO: test customerId
    }

    /**
     * Test the property 'customer'
     */
    @Test
    void customerTest() {
        // TODO: test customer
    }

    /**
     * Test the property 'clientSecret'
     */
    @Test
    void clientSecretTest() {
        // TODO: test clientSecret
    }

    /**
     * Test the property 'returnUrl'
     */
    @Test
    void returnUrlTest() {
        // TODO: test returnUrl
    }

    /**
     * Test the property 'businessCountry'
     */
    @Test
    void businessCountryTest() {
        // TODO: test businessCountry
    }

    /**
     * Test the property 'businessLabel'
     */
    @Test
    void businessLabelTest() {
        // TODO: test businessLabel
    }

    /**
     * Test the property 'description'
     */
    @Test
    void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'entityType'
     */
    @Test
    void entityTypeTest() {
        // TODO: test entityType
    }

    /**
     * Test the property 'recurring'
     */
    @Test
    void recurringTest() {
        // TODO: test recurring
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'merchantConnectorId'
     */
    @Test
    void merchantConnectorIdTest() {
        // TODO: test merchantConnectorId
    }

    /**
     * Test the property 'status'
     */
    @Test
    void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'errorMessage'
     */
    @Test
    void errorMessageTest() {
        // TODO: test errorMessage
    }

    /**
     * Test the property 'errorCode'
     */
    @Test
    void errorCodeTest() {
        // TODO: test errorCode
    }

    /**
     * Test the property 'profileId'
     */
    @Test
    void profileIdTest() {
        // TODO: test profileId
    }

    /**
     * Test the property 'created'
     */
    @Test
    void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'connectorTransactionId'
     */
    @Test
    void connectorTransactionIdTest() {
        // TODO: test connectorTransactionId
    }

    /**
     * Test the property 'priority'
     */
    @Test
    void priorityTest() {
        // TODO: test priority
    }

    /**
     * Test the property 'attempts'
     */
    @Test
    void attemptsTest() {
        // TODO: test attempts
    }

    /**
     * Test the property 'payoutLink'
     */
    @Test
    void payoutLinkTest() {
        // TODO: test payoutLink
    }

    /**
     * Test the property 'email'
     */
    @Test
    void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'name'
     */
    @Test
    void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'phone'
     */
    @Test
    void phoneTest() {
        // TODO: test phone
    }

    /**
     * Test the property 'phoneCountryCode'
     */
    @Test
    void phoneCountryCodeTest() {
        // TODO: test phoneCountryCode
    }

    /**
     * Test the property 'unifiedCode'
     */
    @Test
    void unifiedCodeTest() {
        // TODO: test unifiedCode
    }

    /**
     * Test the property 'unifiedMessage'
     */
    @Test
    void unifiedMessageTest() {
        // TODO: test unifiedMessage
    }

}

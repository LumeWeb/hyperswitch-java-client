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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.client.model.BankTransferNextStepsData;
import com.hyperswitch.client.model.MobilePaymentConsent;
import com.hyperswitch.client.model.NextActionDataOneOf;
import com.hyperswitch.client.model.NextActionDataOneOf1;
import com.hyperswitch.client.model.NextActionDataOneOf2;
import com.hyperswitch.client.model.NextActionDataOneOf3;
import com.hyperswitch.client.model.NextActionDataOneOf4;
import com.hyperswitch.client.model.NextActionDataOneOf5;
import com.hyperswitch.client.model.NextActionDataOneOf6;
import com.hyperswitch.client.model.NextActionDataOneOf7;
import com.hyperswitch.client.model.NextActionDataOneOf8;
import com.hyperswitch.client.model.NextActionDataOneOf9;
import com.hyperswitch.client.model.SdkNextActionData;
import com.hyperswitch.client.model.SessionToken;
import com.hyperswitch.client.model.ThreeDsData;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for NextActionData
 */
class NextActionDataTest {
    private final NextActionData model = new NextActionData();

    /**
     * Model tests for NextActionData
     */
    @Test
    void testNextActionData() {
        // TODO: test NextActionData
    }

    /**
     * Test the property 'redirectToUrl'
     */
    @Test
    void redirectToUrlTest() {
        // TODO: test redirectToUrl
    }

    /**
     * Test the property 'type'
     */
    @Test
    void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'bankTransferStepsAndChargesDetails'
     */
    @Test
    void bankTransferStepsAndChargesDetailsTest() {
        // TODO: test bankTransferStepsAndChargesDetails
    }

    /**
     * Test the property 'sessionToken'
     */
    @Test
    void sessionTokenTest() {
        // TODO: test sessionToken
    }

    /**
     * Test the property 'imageDataUrl'
     */
    @Test
    void imageDataUrlTest() {
        // TODO: test imageDataUrl
    }

    /**
     * Test the property 'displayToTimestamp'
     */
    @Test
    void displayToTimestampTest() {
        // TODO: test displayToTimestamp
    }

    /**
     * Test the property 'qrCodeUrl'
     */
    @Test
    void qrCodeUrlTest() {
        // TODO: test qrCodeUrl
    }

    /**
     * Test the property 'qrCodeFetchUrl'
     */
    @Test
    void qrCodeFetchUrlTest() {
        // TODO: test qrCodeFetchUrl
    }

    /**
     * Test the property 'voucherDetails'
     */
    @Test
    void voucherDetailsTest() {
        // TODO: test voucherDetails
    }

    /**
     * Test the property 'displayFromTimestamp'
     */
    @Test
    void displayFromTimestampTest() {
        // TODO: test displayFromTimestamp
    }

    /**
     * Test the property 'threeDsData'
     */
    @Test
    void threeDsDataTest() {
        // TODO: test threeDsData
    }

    /**
     * Test the property 'nextActionData'
     */
    @Test
    void nextActionDataTest() {
        // TODO: test nextActionData
    }

    /**
     * Test the property 'consentDataRequired'
     */
    @Test
    void consentDataRequiredTest() {
        // TODO: test consentDataRequired
    }

}

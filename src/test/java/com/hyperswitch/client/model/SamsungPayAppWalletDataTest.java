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
import com.hyperswitch.client.model.SamsungPayCardBrand;
import com.hyperswitch.client.model.SamsungPayTokenData;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for SamsungPayAppWalletData
 */
class SamsungPayAppWalletDataTest {
    private final SamsungPayAppWalletData model = new SamsungPayAppWalletData();

    /**
     * Model tests for SamsungPayAppWalletData
     */
    @Test
    void testSamsungPayAppWalletData() {
        // TODO: test SamsungPayAppWalletData
    }

    /**
     * Test the property '_3dS'
     */
    @Test
    void _3dSTest() {
        // TODO: test _3dS
    }

    /**
     * Test the property 'paymentCardBrand'
     */
    @Test
    void paymentCardBrandTest() {
        // TODO: test paymentCardBrand
    }

    /**
     * Test the property 'paymentCurrencyType'
     */
    @Test
    void paymentCurrencyTypeTest() {
        // TODO: test paymentCurrencyType
    }

    /**
     * Test the property 'paymentLast4Dpan'
     */
    @Test
    void paymentLast4DpanTest() {
        // TODO: test paymentLast4Dpan
    }

    /**
     * Test the property 'paymentLast4Fpan'
     */
    @Test
    void paymentLast4FpanTest() {
        // TODO: test paymentLast4Fpan
    }

    /**
     * Test the property 'merchantRef'
     */
    @Test
    void merchantRefTest() {
        // TODO: test merchantRef
    }

    /**
     * Test the property 'method'
     */
    @Test
    void methodTest() {
        // TODO: test method
    }

    /**
     * Test the property 'recurringPayment'
     */
    @Test
    void recurringPaymentTest() {
        // TODO: test recurringPayment
    }

}

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


package com.hyperswitch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.SamsungPayAmountDetails;
import com.hyperswitch.model.SamsungPayMerchantPaymentInformation;
import com.hyperswitch.model.SamsungPayProtocolType;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;


/**
 * Model tests for SessionTokenOneOf1
 */
class SessionTokenOneOf1Test {
    private final SessionTokenOneOf1 model = new SessionTokenOneOf1();

    /**
     * Model tests for SessionTokenOneOf1
     */
    @Test
    void testSessionTokenOneOf1() {
        // TODO: test SessionTokenOneOf1
    }

    /**
     * Test the property 'version'
     */
    @Test
    void versionTest() {
        // TODO: test version
    }

    /**
     * Test the property 'serviceId'
     */
    @Test
    void serviceIdTest() {
        // TODO: test serviceId
    }

    /**
     * Test the property 'orderNumber'
     */
    @Test
    void orderNumberTest() {
        // TODO: test orderNumber
    }

    /**
     * Test the property 'merchant'
     */
    @Test
    void merchantTest() {
        // TODO: test merchant
    }

    /**
     * Test the property 'amount'
     */
    @Test
    void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'protocol'
     */
    @Test
    void protocolTest() {
        // TODO: test protocol
    }

    /**
     * Test the property 'allowedBrands'
     */
    @Test
    void allowedBrandsTest() {
        // TODO: test allowedBrands
    }

    /**
     * Test the property 'walletName'
     */
    @Test
    void walletNameTest() {
        // TODO: test walletName
    }

}

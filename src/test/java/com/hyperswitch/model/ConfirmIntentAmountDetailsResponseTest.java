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
import com.hyperswitch.model.Currency;
import com.hyperswitch.model.SurchargeCalculationOverride;
import com.hyperswitch.model.TaxCalculationOverride;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;


/**
 * Model tests for ConfirmIntentAmountDetailsResponse
 */
class ConfirmIntentAmountDetailsResponseTest {
    private final ConfirmIntentAmountDetailsResponse model = new ConfirmIntentAmountDetailsResponse();

    /**
     * Model tests for ConfirmIntentAmountDetailsResponse
     */
    @Test
    void testConfirmIntentAmountDetailsResponse() {
        // TODO: test ConfirmIntentAmountDetailsResponse
    }

    /**
     * Test the property 'orderAmount'
     */
    @Test
    void orderAmountTest() {
        // TODO: test orderAmount
    }

    /**
     * Test the property 'currency'
     */
    @Test
    void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'shippingCost'
     */
    @Test
    void shippingCostTest() {
        // TODO: test shippingCost
    }

    /**
     * Test the property 'orderTaxAmount'
     */
    @Test
    void orderTaxAmountTest() {
        // TODO: test orderTaxAmount
    }

    /**
     * Test the property 'skipExternalTaxCalculation'
     */
    @Test
    void skipExternalTaxCalculationTest() {
        // TODO: test skipExternalTaxCalculation
    }

    /**
     * Test the property 'skipSurchargeCalculation'
     */
    @Test
    void skipSurchargeCalculationTest() {
        // TODO: test skipSurchargeCalculation
    }

    /**
     * Test the property 'surchargeAmount'
     */
    @Test
    void surchargeAmountTest() {
        // TODO: test surchargeAmount
    }

    /**
     * Test the property 'taxOnSurcharge'
     */
    @Test
    void taxOnSurchargeTest() {
        // TODO: test taxOnSurcharge
    }

    /**
     * Test the property 'netAmount'
     */
    @Test
    void netAmountTest() {
        // TODO: test netAmount
    }

    /**
     * Test the property 'amountToCapture'
     */
    @Test
    void amountToCaptureTest() {
        // TODO: test amountToCapture
    }

    /**
     * Test the property 'amountCapturable'
     */
    @Test
    void amountCapturableTest() {
        // TODO: test amountCapturable
    }

    /**
     * Test the property 'amountCaptured'
     */
    @Test
    void amountCapturedTest() {
        // TODO: test amountCaptured
    }

}

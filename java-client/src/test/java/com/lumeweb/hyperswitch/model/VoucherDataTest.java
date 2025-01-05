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
import com.lumeweb.hyperswitch.model.AlfamartVoucherData;
import com.lumeweb.hyperswitch.model.BoletoVoucherData;
import com.lumeweb.hyperswitch.model.IndomaretVoucherData;
import com.lumeweb.hyperswitch.model.JCSVoucherData;
import com.lumeweb.hyperswitch.model.VoucherDataOneOf;
import com.lumeweb.hyperswitch.model.VoucherDataOneOf1;
import com.lumeweb.hyperswitch.model.VoucherDataOneOf2;
import com.lumeweb.hyperswitch.model.VoucherDataOneOf3;
import com.lumeweb.hyperswitch.model.VoucherDataOneOf4;
import com.lumeweb.hyperswitch.model.VoucherDataOneOf5;
import com.lumeweb.hyperswitch.model.VoucherDataOneOf6;
import com.lumeweb.hyperswitch.model.VoucherDataOneOf7;
import com.lumeweb.hyperswitch.model.VoucherDataOneOf8;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for VoucherData
 */
class VoucherDataTest {
    private final VoucherData model = new VoucherData();

    /**
     * Model tests for VoucherData
     */
    @Test
    void testVoucherData() {
        // TODO: test VoucherData
    }

    /**
     * Test the property 'boleto'
     */
    @Test
    void boletoTest() {
        // TODO: test boleto
    }

    /**
     * Test the property 'alfamart'
     */
    @Test
    void alfamartTest() {
        // TODO: test alfamart
    }

    /**
     * Test the property 'indomaret'
     */
    @Test
    void indomaretTest() {
        // TODO: test indomaret
    }

    /**
     * Test the property 'sevenEleven'
     */
    @Test
    void sevenElevenTest() {
        // TODO: test sevenEleven
    }

    /**
     * Test the property 'lawson'
     */
    @Test
    void lawsonTest() {
        // TODO: test lawson
    }

    /**
     * Test the property 'miniStop'
     */
    @Test
    void miniStopTest() {
        // TODO: test miniStop
    }

    /**
     * Test the property 'familyMart'
     */
    @Test
    void familyMartTest() {
        // TODO: test familyMart
    }

    /**
     * Test the property 'seicomart'
     */
    @Test
    void seicomartTest() {
        // TODO: test seicomart
    }

    /**
     * Test the property 'payEasy'
     */
    @Test
    void payEasyTest() {
        // TODO: test payEasy
    }

}

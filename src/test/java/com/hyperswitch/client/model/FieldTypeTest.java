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
import com.hyperswitch.client.model.FieldTypeOneOf;
import com.hyperswitch.client.model.FieldTypeOneOf1;
import com.hyperswitch.client.model.FieldTypeOneOf2;
import com.hyperswitch.client.model.FieldTypeOneOf3;
import com.hyperswitch.client.model.FieldTypeOneOf4;
import com.hyperswitch.client.model.FieldTypeOneOf5;
import com.hyperswitch.client.model.FieldTypeOneOfUserCountry;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for FieldType
 */
public class FieldTypeTest {
    private final FieldType model = new FieldType();

    /**
     * Model tests for FieldType
     */
    @Test
    public void testFieldType() {
        // TODO: test FieldType
    }

    /**
     * Test the property 'userCountry'
     */
    @Test
    public void userCountryTest() {
        // TODO: test userCountry
    }

    /**
     * Test the property 'userCurrency'
     */
    @Test
    public void userCurrencyTest() {
        // TODO: test userCurrency
    }

    /**
     * Test the property 'userAddressCountry'
     */
    @Test
    public void userAddressCountryTest() {
        // TODO: test userAddressCountry
    }

    /**
     * Test the property 'userShippingAddressCountry'
     */
    @Test
    public void userShippingAddressCountryTest() {
        // TODO: test userShippingAddressCountry
    }

    /**
     * Test the property 'dropDown'
     */
    @Test
    public void dropDownTest() {
        // TODO: test dropDown
    }

    /**
     * Test the property 'languagePreference'
     */
    @Test
    public void languagePreferenceTest() {
        // TODO: test languagePreference
    }

}

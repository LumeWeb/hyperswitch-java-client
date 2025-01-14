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
import com.hyperswitch.client.model.NoThirdPartySdkSessionResponse;
import com.hyperswitch.client.model.SecretInfoToInitiateSdk;
import com.hyperswitch.client.model.ThirdPartySdkSessionResponse;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ApplePaySessionResponse
 */
public class ApplePaySessionResponseTest {
    private final ApplePaySessionResponse model = new ApplePaySessionResponse();

    /**
     * Model tests for ApplePaySessionResponse
     */
    @Test
    public void testApplePaySessionResponse() {
        // TODO: test ApplePaySessionResponse
    }

    /**
     * Test the property 'secrets'
     */
    @Test
    public void secretsTest() {
        // TODO: test secrets
    }

    /**
     * Test the property 'epochTimestamp'
     */
    @Test
    public void epochTimestampTest() {
        // TODO: test epochTimestamp
    }

    /**
     * Test the property 'expiresAt'
     */
    @Test
    public void expiresAtTest() {
        // TODO: test expiresAt
    }

    /**
     * Test the property 'merchantSessionIdentifier'
     */
    @Test
    public void merchantSessionIdentifierTest() {
        // TODO: test merchantSessionIdentifier
    }

    /**
     * Test the property 'nonce'
     */
    @Test
    public void nonceTest() {
        // TODO: test nonce
    }

    /**
     * Test the property 'merchantIdentifier'
     */
    @Test
    public void merchantIdentifierTest() {
        // TODO: test merchantIdentifier
    }

    /**
     * Test the property 'domainName'
     */
    @Test
    public void domainNameTest() {
        // TODO: test domainName
    }

    /**
     * Test the property 'displayName'
     */
    @Test
    public void displayNameTest() {
        // TODO: test displayName
    }

    /**
     * Test the property 'signature'
     */
    @Test
    public void signatureTest() {
        // TODO: test signature
    }

    /**
     * Test the property 'operationalAnalyticsIdentifier'
     */
    @Test
    public void operationalAnalyticsIdentifierTest() {
        // TODO: test operationalAnalyticsIdentifier
    }

    /**
     * Test the property 'retries'
     */
    @Test
    public void retriesTest() {
        // TODO: test retries
    }

    /**
     * Test the property 'pspId'
     */
    @Test
    public void pspIdTest() {
        // TODO: test pspId
    }

}

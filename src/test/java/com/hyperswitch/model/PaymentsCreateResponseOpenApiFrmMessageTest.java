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
import com.hyperswitch.model.FrmMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;


/**
 * Model tests for PaymentsCreateResponseOpenApiFrmMessage
 */
class PaymentsCreateResponseOpenApiFrmMessageTest {
    private final PaymentsCreateResponseOpenApiFrmMessage model = new PaymentsCreateResponseOpenApiFrmMessage();

    /**
     * Model tests for PaymentsCreateResponseOpenApiFrmMessage
     */
    @Test
    void testPaymentsCreateResponseOpenApiFrmMessage() {
        // TODO: test PaymentsCreateResponseOpenApiFrmMessage
    }

    /**
     * Test the property 'frmName'
     */
    @Test
    void frmNameTest() {
        // TODO: test frmName
    }

    /**
     * Test the property 'frmTransactionId'
     */
    @Test
    void frmTransactionIdTest() {
        // TODO: test frmTransactionId
    }

    /**
     * Test the property 'frmTransactionType'
     */
    @Test
    void frmTransactionTypeTest() {
        // TODO: test frmTransactionType
    }

    /**
     * Test the property 'frmStatus'
     */
    @Test
    void frmStatusTest() {
        // TODO: test frmStatus
    }

    /**
     * Test the property 'frmScore'
     */
    @Test
    void frmScoreTest() {
        // TODO: test frmScore
    }

    /**
     * Test the property 'frmReason'
     */
    @Test
    void frmReasonTest() {
        // TODO: test frmReason
    }

    /**
     * Test the property 'frmError'
     */
    @Test
    void frmErrorTest() {
        // TODO: test frmError
    }

}

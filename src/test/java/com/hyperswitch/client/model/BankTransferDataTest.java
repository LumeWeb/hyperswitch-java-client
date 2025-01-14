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
import com.hyperswitch.client.model.BankTransferAdditionalDataOneOf12;
import com.hyperswitch.client.model.BankTransferDataOneOf;
import com.hyperswitch.client.model.BankTransferDataOneOf1;
import com.hyperswitch.client.model.BankTransferDataOneOf10;
import com.hyperswitch.client.model.BankTransferDataOneOf11;
import com.hyperswitch.client.model.BankTransferDataOneOf11Pix;
import com.hyperswitch.client.model.BankTransferDataOneOf12;
import com.hyperswitch.client.model.BankTransferDataOneOf12LocalBankTransfer;
import com.hyperswitch.client.model.BankTransferDataOneOf1SepaBankTransfer;
import com.hyperswitch.client.model.BankTransferDataOneOf2;
import com.hyperswitch.client.model.BankTransferDataOneOf2BacsBankTransfer;
import com.hyperswitch.client.model.BankTransferDataOneOf3;
import com.hyperswitch.client.model.BankTransferDataOneOf3MultibancoBankTransfer;
import com.hyperswitch.client.model.BankTransferDataOneOf4;
import com.hyperswitch.client.model.BankTransferDataOneOf4PermataBankTransfer;
import com.hyperswitch.client.model.BankTransferDataOneOf5;
import com.hyperswitch.client.model.BankTransferDataOneOf6;
import com.hyperswitch.client.model.BankTransferDataOneOf7;
import com.hyperswitch.client.model.BankTransferDataOneOf8;
import com.hyperswitch.client.model.BankTransferDataOneOf9;
import com.hyperswitch.client.model.BankTransferDataOneOfAchBankTransfer;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for BankTransferData
 */
public class BankTransferDataTest {
    private final BankTransferData model = new BankTransferData();

    /**
     * Model tests for BankTransferData
     */
    @Test
    public void testBankTransferData() {
        // TODO: test BankTransferData
    }

    /**
     * Test the property 'achBankTransfer'
     */
    @Test
    public void achBankTransferTest() {
        // TODO: test achBankTransfer
    }

    /**
     * Test the property 'sepaBankTransfer'
     */
    @Test
    public void sepaBankTransferTest() {
        // TODO: test sepaBankTransfer
    }

    /**
     * Test the property 'bacsBankTransfer'
     */
    @Test
    public void bacsBankTransferTest() {
        // TODO: test bacsBankTransfer
    }

    /**
     * Test the property 'multibancoBankTransfer'
     */
    @Test
    public void multibancoBankTransferTest() {
        // TODO: test multibancoBankTransfer
    }

    /**
     * Test the property 'permataBankTransfer'
     */
    @Test
    public void permataBankTransferTest() {
        // TODO: test permataBankTransfer
    }

    /**
     * Test the property 'bcaBankTransfer'
     */
    @Test
    public void bcaBankTransferTest() {
        // TODO: test bcaBankTransfer
    }

    /**
     * Test the property 'bniVaBankTransfer'
     */
    @Test
    public void bniVaBankTransferTest() {
        // TODO: test bniVaBankTransfer
    }

    /**
     * Test the property 'briVaBankTransfer'
     */
    @Test
    public void briVaBankTransferTest() {
        // TODO: test briVaBankTransfer
    }

    /**
     * Test the property 'cimbVaBankTransfer'
     */
    @Test
    public void cimbVaBankTransferTest() {
        // TODO: test cimbVaBankTransfer
    }

    /**
     * Test the property 'danamonVaBankTransfer'
     */
    @Test
    public void danamonVaBankTransferTest() {
        // TODO: test danamonVaBankTransfer
    }

    /**
     * Test the property 'mandiriVaBankTransfer'
     */
    @Test
    public void mandiriVaBankTransferTest() {
        // TODO: test mandiriVaBankTransfer
    }

    /**
     * Test the property 'pix'
     */
    @Test
    public void pixTest() {
        // TODO: test pix
    }

    /**
     * Test the property 'pse'
     */
    @Test
    public void pseTest() {
        // TODO: test pse
    }

    /**
     * Test the property 'localBankTransfer'
     */
    @Test
    public void localBankTransferTest() {
        // TODO: test localBankTransfer
    }

}

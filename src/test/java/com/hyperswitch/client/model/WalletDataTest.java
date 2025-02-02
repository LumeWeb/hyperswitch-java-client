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
import com.hyperswitch.client.model.ApplePayWalletData;
import com.hyperswitch.client.model.GooglePayWalletData;
import com.hyperswitch.client.model.MbWayRedirection;
import com.hyperswitch.client.model.MifinityData;
import com.hyperswitch.client.model.PayPalWalletData;
import com.hyperswitch.client.model.PaypalRedirection;
import com.hyperswitch.client.model.PazeWalletData;
import com.hyperswitch.client.model.SamsungPayWalletData;
import com.hyperswitch.client.model.WalletDataOneOf;
import com.hyperswitch.client.model.WalletDataOneOf1;
import com.hyperswitch.client.model.WalletDataOneOf10;
import com.hyperswitch.client.model.WalletDataOneOf11;
import com.hyperswitch.client.model.WalletDataOneOf12;
import com.hyperswitch.client.model.WalletDataOneOf13;
import com.hyperswitch.client.model.WalletDataOneOf14;
import com.hyperswitch.client.model.WalletDataOneOf15;
import com.hyperswitch.client.model.WalletDataOneOf16;
import com.hyperswitch.client.model.WalletDataOneOf17;
import com.hyperswitch.client.model.WalletDataOneOf18;
import com.hyperswitch.client.model.WalletDataOneOf19;
import com.hyperswitch.client.model.WalletDataOneOf2;
import com.hyperswitch.client.model.WalletDataOneOf20;
import com.hyperswitch.client.model.WalletDataOneOf21;
import com.hyperswitch.client.model.WalletDataOneOf22;
import com.hyperswitch.client.model.WalletDataOneOf23;
import com.hyperswitch.client.model.WalletDataOneOf24;
import com.hyperswitch.client.model.WalletDataOneOf25;
import com.hyperswitch.client.model.WalletDataOneOf26;
import com.hyperswitch.client.model.WalletDataOneOf27;
import com.hyperswitch.client.model.WalletDataOneOf3;
import com.hyperswitch.client.model.WalletDataOneOf4;
import com.hyperswitch.client.model.WalletDataOneOf5;
import com.hyperswitch.client.model.WalletDataOneOf6;
import com.hyperswitch.client.model.WalletDataOneOf7;
import com.hyperswitch.client.model.WalletDataOneOf8;
import com.hyperswitch.client.model.WalletDataOneOf9;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for WalletData
 */
class WalletDataTest {
    private final WalletData model = new WalletData();

    /**
     * Model tests for WalletData
     */
    @Test
    void testWalletData() {
        // TODO: test WalletData
    }

    /**
     * Test the property 'aliPayQr'
     */
    @Test
    void aliPayQrTest() {
        // TODO: test aliPayQr
    }

    /**
     * Test the property 'aliPayRedirect'
     */
    @Test
    void aliPayRedirectTest() {
        // TODO: test aliPayRedirect
    }

    /**
     * Test the property 'aliPayHkRedirect'
     */
    @Test
    void aliPayHkRedirectTest() {
        // TODO: test aliPayHkRedirect
    }

    /**
     * Test the property 'momoRedirect'
     */
    @Test
    void momoRedirectTest() {
        // TODO: test momoRedirect
    }

    /**
     * Test the property 'kakaoPayRedirect'
     */
    @Test
    void kakaoPayRedirectTest() {
        // TODO: test kakaoPayRedirect
    }

    /**
     * Test the property 'goPayRedirect'
     */
    @Test
    void goPayRedirectTest() {
        // TODO: test goPayRedirect
    }

    /**
     * Test the property 'gcashRedirect'
     */
    @Test
    void gcashRedirectTest() {
        // TODO: test gcashRedirect
    }

    /**
     * Test the property 'applePay'
     */
    @Test
    void applePayTest() {
        // TODO: test applePay
    }

    /**
     * Test the property 'applePayRedirect'
     */
    @Test
    void applePayRedirectTest() {
        // TODO: test applePayRedirect
    }

    /**
     * Test the property 'applePayThirdPartySdk'
     */
    @Test
    void applePayThirdPartySdkTest() {
        // TODO: test applePayThirdPartySdk
    }

    /**
     * Test the property 'danaRedirect'
     */
    @Test
    void danaRedirectTest() {
        // TODO: test danaRedirect
    }

    /**
     * Test the property 'googlePay'
     */
    @Test
    void googlePayTest() {
        // TODO: test googlePay
    }

    /**
     * Test the property 'googlePayRedirect'
     */
    @Test
    void googlePayRedirectTest() {
        // TODO: test googlePayRedirect
    }

    /**
     * Test the property 'googlePayThirdPartySdk'
     */
    @Test
    void googlePayThirdPartySdkTest() {
        // TODO: test googlePayThirdPartySdk
    }

    /**
     * Test the property 'mbWayRedirect'
     */
    @Test
    void mbWayRedirectTest() {
        // TODO: test mbWayRedirect
    }

    /**
     * Test the property 'mobilePayRedirect'
     */
    @Test
    void mobilePayRedirectTest() {
        // TODO: test mobilePayRedirect
    }

    /**
     * Test the property 'paypalRedirect'
     */
    @Test
    void paypalRedirectTest() {
        // TODO: test paypalRedirect
    }

    /**
     * Test the property 'paypalSdk'
     */
    @Test
    void paypalSdkTest() {
        // TODO: test paypalSdk
    }

    /**
     * Test the property 'paze'
     */
    @Test
    void pazeTest() {
        // TODO: test paze
    }

    /**
     * Test the property 'samsungPay'
     */
    @Test
    void samsungPayTest() {
        // TODO: test samsungPay
    }

    /**
     * Test the property 'twintRedirect'
     */
    @Test
    void twintRedirectTest() {
        // TODO: test twintRedirect
    }

    /**
     * Test the property 'vippsRedirect'
     */
    @Test
    void vippsRedirectTest() {
        // TODO: test vippsRedirect
    }

    /**
     * Test the property 'touchNGoRedirect'
     */
    @Test
    void touchNGoRedirectTest() {
        // TODO: test touchNGoRedirect
    }

    /**
     * Test the property 'weChatPayRedirect'
     */
    @Test
    void weChatPayRedirectTest() {
        // TODO: test weChatPayRedirect
    }

    /**
     * Test the property 'weChatPayQr'
     */
    @Test
    void weChatPayQrTest() {
        // TODO: test weChatPayQr
    }

    /**
     * Test the property 'cashappQr'
     */
    @Test
    void cashappQrTest() {
        // TODO: test cashappQr
    }

    /**
     * Test the property 'swishQr'
     */
    @Test
    void swishQrTest() {
        // TODO: test swishQr
    }

    /**
     * Test the property 'mifinity'
     */
    @Test
    void mifinityTest() {
        // TODO: test mifinity
    }

}

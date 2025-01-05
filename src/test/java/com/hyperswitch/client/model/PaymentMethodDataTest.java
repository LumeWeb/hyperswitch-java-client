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
import com.hyperswitch.client.model.BankDebit;
import com.hyperswitch.client.model.BankDebitData;
import com.hyperswitch.client.model.BankRedirect;
import com.hyperswitch.client.model.BankRedirectData;
import com.hyperswitch.client.model.BankTransfer;
import com.hyperswitch.client.model.BankTransferData;
import com.hyperswitch.client.model.Card;
import com.hyperswitch.client.model.Card1;
import com.hyperswitch.client.model.CardRedirect;
import com.hyperswitch.client.model.CardRedirectData;
import com.hyperswitch.client.model.CardToken;
import com.hyperswitch.client.model.CardToken1;
import com.hyperswitch.client.model.Crypto;
import com.hyperswitch.client.model.CryptoData;
import com.hyperswitch.client.model.GiftCard;
import com.hyperswitch.client.model.GiftCardData;
import com.hyperswitch.client.model.OpenBanking;
import com.hyperswitch.client.model.OpenBankingData;
import com.hyperswitch.client.model.PayLater;
import com.hyperswitch.client.model.PayLaterData;
import com.hyperswitch.client.model.RealTimePayment;
import com.hyperswitch.client.model.RealTimePaymentData;
import com.hyperswitch.client.model.Upi;
import com.hyperswitch.client.model.UpiData;
import com.hyperswitch.client.model.Voucher;
import com.hyperswitch.client.model.VoucherData;
import com.hyperswitch.client.model.Wallet1;
import com.hyperswitch.client.model.WalletData;
import org.junit.jupiter.api.Test;


/**
 * Model tests for PaymentMethodData
 */
class PaymentMethodDataTest {
    private final PaymentMethodData model = new PaymentMethodData();

    /**
     * Model tests for PaymentMethodData
     */
    @Test
    void testPaymentMethodData() {
        // TODO: test PaymentMethodData
    }

    /**
     * Test the property 'card'
     */
    @Test
    void cardTest() {
        // TODO: test card
    }

    /**
     * Test the property 'cardRedirect'
     */
    @Test
    void cardRedirectTest() {
        // TODO: test cardRedirect
    }

    /**
     * Test the property 'wallet'
     */
    @Test
    void walletTest() {
        // TODO: test wallet
    }

    /**
     * Test the property 'payLater'
     */
    @Test
    void payLaterTest() {
        // TODO: test payLater
    }

    /**
     * Test the property 'bankRedirect'
     */
    @Test
    void bankRedirectTest() {
        // TODO: test bankRedirect
    }

    /**
     * Test the property 'bankDebit'
     */
    @Test
    void bankDebitTest() {
        // TODO: test bankDebit
    }

    /**
     * Test the property 'bankTransfer'
     */
    @Test
    void bankTransferTest() {
        // TODO: test bankTransfer
    }

    /**
     * Test the property 'realTimePayment'
     */
    @Test
    void realTimePaymentTest() {
        // TODO: test realTimePayment
    }

    /**
     * Test the property 'crypto'
     */
    @Test
    void cryptoTest() {
        // TODO: test crypto
    }

    /**
     * Test the property 'upi'
     */
    @Test
    void upiTest() {
        // TODO: test upi
    }

    /**
     * Test the property 'voucher'
     */
    @Test
    void voucherTest() {
        // TODO: test voucher
    }

    /**
     * Test the property 'giftCard'
     */
    @Test
    void giftCardTest() {
        // TODO: test giftCard
    }

    /**
     * Test the property 'cardToken'
     */
    @Test
    void cardTokenTest() {
        // TODO: test cardToken
    }

    /**
     * Test the property 'openBanking'
     */
    @Test
    void openBankingTest() {
        // TODO: test openBanking
    }

}

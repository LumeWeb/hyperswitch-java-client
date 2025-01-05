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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.ApplePayPaymentRequest;
import com.hyperswitch.model.ApplePaySessionResponse;
import com.hyperswitch.model.Currency;
import com.hyperswitch.model.GpayAllowedPaymentMethods;
import com.hyperswitch.model.GpayMerchantInfo;
import com.hyperswitch.model.GpayShippingAddressParameters;
import com.hyperswitch.model.GpayTransactionInfo;
import com.hyperswitch.model.SamsungPayAmountDetails;
import com.hyperswitch.model.SamsungPayMerchantPaymentInformation;
import com.hyperswitch.model.SamsungPayProtocolType;
import com.hyperswitch.model.SdkNextAction;
import com.hyperswitch.model.SecretInfoToInitiateSdk;
import com.hyperswitch.model.SessionTokenOneOf;
import com.hyperswitch.model.SessionTokenOneOf1;
import com.hyperswitch.model.SessionTokenOneOf2;
import com.hyperswitch.model.SessionTokenOneOf3;
import com.hyperswitch.model.SessionTokenOneOf4;
import com.hyperswitch.model.SessionTokenOneOf5;
import com.hyperswitch.model.SessionTokenOneOf6;
import com.hyperswitch.model.SessionTokenOneOf7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

/**
 * Model tests for SessionToken
 */
class SessionTokenTest {
    private final SessionToken model = new SessionToken();

    /**
     * Model tests for SessionToken
     */
    @Test
    void testSessionToken() {
        // TODO: test SessionToken
    }

    /**
     * Test the property 'delayedSessionToken'
     */
    @Test
    void delayedSessionTokenTest() {
        // TODO: test delayedSessionToken
    }

    /**
     * Test the property 'connector'
     */
    @Test
    void connectorTest() {
        // TODO: test connector
    }

    /**
     * Test the property 'sdkNextAction'
     */
    @Test
    void sdkNextActionTest() {
        // TODO: test sdkNextAction
    }

    /**
     * Test the property 'merchantInfo'
     */
    @Test
    void merchantInfoTest() {
        // TODO: test merchantInfo
    }

    /**
     * Test the property 'shippingAddressRequired'
     */
    @Test
    void shippingAddressRequiredTest() {
        // TODO: test shippingAddressRequired
    }

    /**
     * Test the property 'emailRequired'
     */
    @Test
    void emailRequiredTest() {
        // TODO: test emailRequired
    }

    /**
     * Test the property 'shippingAddressParameters'
     */
    @Test
    void shippingAddressParametersTest() {
        // TODO: test shippingAddressParameters
    }

    /**
     * Test the property 'allowedPaymentMethods'
     */
    @Test
    void allowedPaymentMethodsTest() {
        // TODO: test allowedPaymentMethods
    }

    /**
     * Test the property 'transactionInfo'
     */
    @Test
    void transactionInfoTest() {
        // TODO: test transactionInfo
    }

    /**
     * Test the property 'secrets'
     */
    @Test
    void secretsTest() {
        // TODO: test secrets
    }

    /**
     * Test the property 'walletName'
     */
    @Test
    void walletNameTest() {
        // TODO: test walletName
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
     * Test the property 'sessionToken'
     */
    @Test
    void sessionTokenTest() {
        // TODO: test sessionToken
    }

    /**
     * Test the property 'sessionId'
     */
    @Test
    void sessionIdTest() {
        // TODO: test sessionId
    }

    /**
     * Test the property 'sessionTokenData'
     */
    @Test
    void sessionTokenDataTest() {
        // TODO: test sessionTokenData
    }

    /**
     * Test the property 'paymentRequestData'
     */
    @Test
    void paymentRequestDataTest() {
        // TODO: test paymentRequestData
    }

    /**
     * Test the property 'connectorReferenceId'
     */
    @Test
    void connectorReferenceIdTest() {
        // TODO: test connectorReferenceId
    }

    /**
     * Test the property 'connectorSdkPublicKey'
     */
    @Test
    void connectorSdkPublicKeyTest() {
        // TODO: test connectorSdkPublicKey
    }

    /**
     * Test the property 'connectorMerchantId'
     */
    @Test
    void connectorMerchantIdTest() {
        // TODO: test connectorMerchantId
    }

    /**
     * Test the property 'openBankingSessionToken'
     */
    @Test
    void openBankingSessionTokenTest() {
        // TODO: test openBankingSessionToken
    }

    /**
     * Test the property 'clientId'
     */
    @Test
    void clientIdTest() {
        // TODO: test clientId
    }

    /**
     * Test the property 'clientName'
     */
    @Test
    void clientNameTest() {
        // TODO: test clientName
    }

    /**
     * Test the property 'clientProfileId'
     */
    @Test
    void clientProfileIdTest() {
        // TODO: test clientProfileId
    }

    /**
     * Test the property 'transactionCurrencyCode'
     */
    @Test
    void transactionCurrencyCodeTest() {
        // TODO: test transactionCurrencyCode
    }

    /**
     * Test the property 'transactionAmount'
     */
    @Test
    void transactionAmountTest() {
        // TODO: test transactionAmount
    }

    /**
     * Test the property 'emailAddress'
     */
    @Test
    void emailAddressTest() {
        // TODO: test emailAddress
    }

}

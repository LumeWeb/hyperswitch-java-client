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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.client.model.ApplePayPaymentRequest;
import com.hyperswitch.client.model.ApplePaySessionResponse;
import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.GpayAllowedPaymentMethods;
import com.hyperswitch.client.model.GpayMerchantInfo;
import com.hyperswitch.client.model.GpayShippingAddressParameters;
import com.hyperswitch.client.model.GpayTransactionInfo;
import com.hyperswitch.client.model.SamsungPayAmountDetails;
import com.hyperswitch.client.model.SamsungPayMerchantPaymentInformation;
import com.hyperswitch.client.model.SamsungPayProtocolType;
import com.hyperswitch.client.model.SdkNextAction;
import com.hyperswitch.client.model.SecretInfoToInitiateSdk;
import com.hyperswitch.client.model.SessionTokenOneOf;
import com.hyperswitch.client.model.SessionTokenOneOf1;
import com.hyperswitch.client.model.SessionTokenOneOf2;
import com.hyperswitch.client.model.SessionTokenOneOf3;
import com.hyperswitch.client.model.SessionTokenOneOf4;
import com.hyperswitch.client.model.SessionTokenOneOf5;
import com.hyperswitch.client.model.SessionTokenOneOf6;
import com.hyperswitch.client.model.SessionTokenOneOf7;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for SessionToken
 */
public class SessionTokenTest {
    private final SessionToken model = new SessionToken();

    /**
     * Model tests for SessionToken
     */
    @Test
    public void testSessionToken() {
        // TODO: test SessionToken
    }

    /**
     * Test the property 'delayedSessionToken'
     */
    @Test
    public void delayedSessionTokenTest() {
        // TODO: test delayedSessionToken
    }

    /**
     * Test the property 'connector'
     */
    @Test
    public void connectorTest() {
        // TODO: test connector
    }

    /**
     * Test the property 'sdkNextAction'
     */
    @Test
    public void sdkNextActionTest() {
        // TODO: test sdkNextAction
    }

    /**
     * Test the property 'merchantInfo'
     */
    @Test
    public void merchantInfoTest() {
        // TODO: test merchantInfo
    }

    /**
     * Test the property 'shippingAddressRequired'
     */
    @Test
    public void shippingAddressRequiredTest() {
        // TODO: test shippingAddressRequired
    }

    /**
     * Test the property 'emailRequired'
     */
    @Test
    public void emailRequiredTest() {
        // TODO: test emailRequired
    }

    /**
     * Test the property 'shippingAddressParameters'
     */
    @Test
    public void shippingAddressParametersTest() {
        // TODO: test shippingAddressParameters
    }

    /**
     * Test the property 'allowedPaymentMethods'
     */
    @Test
    public void allowedPaymentMethodsTest() {
        // TODO: test allowedPaymentMethods
    }

    /**
     * Test the property 'transactionInfo'
     */
    @Test
    public void transactionInfoTest() {
        // TODO: test transactionInfo
    }

    /**
     * Test the property 'secrets'
     */
    @Test
    public void secretsTest() {
        // TODO: test secrets
    }

    /**
     * Test the property 'walletName'
     */
    @Test
    public void walletNameTest() {
        // TODO: test walletName
    }

    /**
     * Test the property 'version'
     */
    @Test
    public void versionTest() {
        // TODO: test version
    }

    /**
     * Test the property 'serviceId'
     */
    @Test
    public void serviceIdTest() {
        // TODO: test serviceId
    }

    /**
     * Test the property 'orderNumber'
     */
    @Test
    public void orderNumberTest() {
        // TODO: test orderNumber
    }

    /**
     * Test the property 'merchant'
     */
    @Test
    public void merchantTest() {
        // TODO: test merchant
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'protocol'
     */
    @Test
    public void protocolTest() {
        // TODO: test protocol
    }

    /**
     * Test the property 'allowedBrands'
     */
    @Test
    public void allowedBrandsTest() {
        // TODO: test allowedBrands
    }

    /**
     * Test the property 'sessionToken'
     */
    @Test
    public void sessionTokenTest() {
        // TODO: test sessionToken
    }

    /**
     * Test the property 'sessionId'
     */
    @Test
    public void sessionIdTest() {
        // TODO: test sessionId
    }

    /**
     * Test the property 'sessionTokenData'
     */
    @Test
    public void sessionTokenDataTest() {
        // TODO: test sessionTokenData
    }

    /**
     * Test the property 'paymentRequestData'
     */
    @Test
    public void paymentRequestDataTest() {
        // TODO: test paymentRequestData
    }

    /**
     * Test the property 'connectorReferenceId'
     */
    @Test
    public void connectorReferenceIdTest() {
        // TODO: test connectorReferenceId
    }

    /**
     * Test the property 'connectorSdkPublicKey'
     */
    @Test
    public void connectorSdkPublicKeyTest() {
        // TODO: test connectorSdkPublicKey
    }

    /**
     * Test the property 'connectorMerchantId'
     */
    @Test
    public void connectorMerchantIdTest() {
        // TODO: test connectorMerchantId
    }

    /**
     * Test the property 'openBankingSessionToken'
     */
    @Test
    public void openBankingSessionTokenTest() {
        // TODO: test openBankingSessionToken
    }

    /**
     * Test the property 'clientId'
     */
    @Test
    public void clientIdTest() {
        // TODO: test clientId
    }

    /**
     * Test the property 'clientName'
     */
    @Test
    public void clientNameTest() {
        // TODO: test clientName
    }

    /**
     * Test the property 'clientProfileId'
     */
    @Test
    public void clientProfileIdTest() {
        // TODO: test clientProfileId
    }

    /**
     * Test the property 'transactionCurrencyCode'
     */
    @Test
    public void transactionCurrencyCodeTest() {
        // TODO: test transactionCurrencyCode
    }

    /**
     * Test the property 'transactionAmount'
     */
    @Test
    public void transactionAmountTest() {
        // TODO: test transactionAmount
    }

    /**
     * Test the property 'emailAddress'
     */
    @Test
    public void emailAddressTest() {
        // TODO: test emailAddress
    }

}

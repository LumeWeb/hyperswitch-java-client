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
import com.hyperswitch.client.model.Address;
import com.hyperswitch.client.model.AmountDetails;
import com.hyperswitch.client.model.AuthenticationType;
import com.hyperswitch.client.model.CaptureMethod;
import com.hyperswitch.client.model.ConnectorMetadata;
import com.hyperswitch.client.model.EnablePaymentLinkRequest;
import com.hyperswitch.client.model.External3dsAuthenticationRequest;
import com.hyperswitch.client.model.FeatureMetadata;
import com.hyperswitch.client.model.FutureUsage;
import com.hyperswitch.client.model.MitExemptionRequest;
import com.hyperswitch.client.model.OrderDetailsWithAmount;
import com.hyperswitch.client.model.PaymentLinkConfigRequest;
import com.hyperswitch.client.model.PaymentMethodType;
import com.hyperswitch.client.model.PresenceOfCustomerDuringPayment;
import com.hyperswitch.client.model.RequestIncrementalAuthorization;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;


/**
 * Model tests for PaymentsCreateIntentRequest
 */
class PaymentsCreateIntentRequestTest {
    private final PaymentsCreateIntentRequest model = new PaymentsCreateIntentRequest();

    /**
     * Model tests for PaymentsCreateIntentRequest
     */
    @Test
    void testPaymentsCreateIntentRequest() {
        // TODO: test PaymentsCreateIntentRequest
    }

    /**
     * Test the property 'amountDetails'
     */
    @Test
    void amountDetailsTest() {
        // TODO: test amountDetails
    }

    /**
     * Test the property 'merchantReferenceId'
     */
    @Test
    void merchantReferenceIdTest() {
        // TODO: test merchantReferenceId
    }

    /**
     * Test the property 'routingAlgorithmId'
     */
    @Test
    void routingAlgorithmIdTest() {
        // TODO: test routingAlgorithmId
    }

    /**
     * Test the property 'captureMethod'
     */
    @Test
    void captureMethodTest() {
        // TODO: test captureMethod
    }

    /**
     * Test the property 'authenticationType'
     */
    @Test
    void authenticationTypeTest() {
        // TODO: test authenticationType
    }

    /**
     * Test the property 'billing'
     */
    @Test
    void billingTest() {
        // TODO: test billing
    }

    /**
     * Test the property 'shipping'
     */
    @Test
    void shippingTest() {
        // TODO: test shipping
    }

    /**
     * Test the property 'customerId'
     */
    @Test
    void customerIdTest() {
        // TODO: test customerId
    }

    /**
     * Test the property 'customerPresent'
     */
    @Test
    void customerPresentTest() {
        // TODO: test customerPresent
    }

    /**
     * Test the property 'description'
     */
    @Test
    void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'returnUrl'
     */
    @Test
    void returnUrlTest() {
        // TODO: test returnUrl
    }

    /**
     * Test the property 'setupFutureUsage'
     */
    @Test
    void setupFutureUsageTest() {
        // TODO: test setupFutureUsage
    }

    /**
     * Test the property 'applyMitExemption'
     */
    @Test
    void applyMitExemptionTest() {
        // TODO: test applyMitExemption
    }

    /**
     * Test the property 'statementDescriptor'
     */
    @Test
    void statementDescriptorTest() {
        // TODO: test statementDescriptor
    }

    /**
     * Test the property 'orderDetails'
     */
    @Test
    void orderDetailsTest() {
        // TODO: test orderDetails
    }

    /**
     * Test the property 'allowedPaymentMethodTypes'
     */
    @Test
    void allowedPaymentMethodTypesTest() {
        // TODO: test allowedPaymentMethodTypes
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'connectorMetadata'
     */
    @Test
    void connectorMetadataTest() {
        // TODO: test connectorMetadata
    }

    /**
     * Test the property 'featureMetadata'
     */
    @Test
    void featureMetadataTest() {
        // TODO: test featureMetadata
    }

    /**
     * Test the property 'paymentLinkEnabled'
     */
    @Test
    void paymentLinkEnabledTest() {
        // TODO: test paymentLinkEnabled
    }

    /**
     * Test the property 'paymentLinkConfig'
     */
    @Test
    void paymentLinkConfigTest() {
        // TODO: test paymentLinkConfig
    }

    /**
     * Test the property 'requestIncrementalAuthorization'
     */
    @Test
    void requestIncrementalAuthorizationTest() {
        // TODO: test requestIncrementalAuthorization
    }

    /**
     * Test the property 'sessionExpiry'
     */
    @Test
    void sessionExpiryTest() {
        // TODO: test sessionExpiry
    }

    /**
     * Test the property 'frmMetadata'
     */
    @Test
    void frmMetadataTest() {
        // TODO: test frmMetadata
    }

    /**
     * Test the property 'requestExternalThreeDsAuthentication'
     */
    @Test
    void requestExternalThreeDsAuthenticationTest() {
        // TODO: test requestExternalThreeDsAuthentication
    }

}

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
import com.hyperswitch.client.model.AuthenticationType;
import com.hyperswitch.client.model.BrowserInformation;
import com.hyperswitch.client.model.CaptureMethod;
import com.hyperswitch.client.model.Connector;
import com.hyperswitch.client.model.ConnectorMetadata;
import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.CustomerAcceptance;
import com.hyperswitch.client.model.CustomerDetails;
import com.hyperswitch.client.model.FutureUsage;
import com.hyperswitch.client.model.MandateData;
import com.hyperswitch.client.model.MerchantConnectorDetailsWrap;
import com.hyperswitch.client.model.OrderDetailsWithAmount;
import com.hyperswitch.client.model.PaymentChargeRequest;
import com.hyperswitch.client.model.PaymentCreatePaymentLinkConfig;
import com.hyperswitch.client.model.PaymentExperience;
import com.hyperswitch.client.model.PaymentMethod;
import com.hyperswitch.client.model.PaymentMethodDataRequest;
import com.hyperswitch.client.model.PaymentMethodType;
import com.hyperswitch.client.model.PaymentType;
import com.hyperswitch.client.model.RecurringDetails;
import com.hyperswitch.client.model.RetryAction;
import com.hyperswitch.client.model.ScaExemptionType;
import com.hyperswitch.client.model.StraightThroughAlgorithm;
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
 * Model tests for PaymentsConfirmRequest
 */
public class PaymentsConfirmRequestTest {
    private final PaymentsConfirmRequest model = new PaymentsConfirmRequest();

    /**
     * Model tests for PaymentsConfirmRequest
     */
    @Test
    public void testPaymentsConfirmRequest() {
        // TODO: test PaymentsConfirmRequest
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'currency'
     */
    @Test
    public void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'amountToCapture'
     */
    @Test
    public void amountToCaptureTest() {
        // TODO: test amountToCapture
    }

    /**
     * Test the property 'shippingCost'
     */
    @Test
    public void shippingCostTest() {
        // TODO: test shippingCost
    }

    /**
     * Test the property 'paymentId'
     */
    @Test
    public void paymentIdTest() {
        // TODO: test paymentId
    }

    /**
     * Test the property 'routing'
     */
    @Test
    public void routingTest() {
        // TODO: test routing
    }

    /**
     * Test the property 'connector'
     */
    @Test
    public void connectorTest() {
        // TODO: test connector
    }

    /**
     * Test the property 'captureMethod'
     */
    @Test
    public void captureMethodTest() {
        // TODO: test captureMethod
    }

    /**
     * Test the property 'authenticationType'
     */
    @Test
    public void authenticationTypeTest() {
        // TODO: test authenticationType
    }

    /**
     * Test the property 'billing'
     */
    @Test
    public void billingTest() {
        // TODO: test billing
    }

    /**
     * Test the property 'confirm'
     */
    @Test
    public void confirmTest() {
        // TODO: test confirm
    }

    /**
     * Test the property 'customer'
     */
    @Test
    public void customerTest() {
        // TODO: test customer
    }

    /**
     * Test the property 'customerId'
     */
    @Test
    public void customerIdTest() {
        // TODO: test customerId
    }

    /**
     * Test the property 'offSession'
     */
    @Test
    public void offSessionTest() {
        // TODO: test offSession
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'returnUrl'
     */
    @Test
    public void returnUrlTest() {
        // TODO: test returnUrl
    }

    /**
     * Test the property 'setupFutureUsage'
     */
    @Test
    public void setupFutureUsageTest() {
        // TODO: test setupFutureUsage
    }

    /**
     * Test the property 'paymentMethodData'
     */
    @Test
    public void paymentMethodDataTest() {
        // TODO: test paymentMethodData
    }

    /**
     * Test the property 'paymentMethod'
     */
    @Test
    public void paymentMethodTest() {
        // TODO: test paymentMethod
    }

    /**
     * Test the property 'paymentToken'
     */
    @Test
    public void paymentTokenTest() {
        // TODO: test paymentToken
    }

    /**
     * Test the property 'shipping'
     */
    @Test
    public void shippingTest() {
        // TODO: test shipping
    }

    /**
     * Test the property 'statementDescriptorName'
     */
    @Test
    public void statementDescriptorNameTest() {
        // TODO: test statementDescriptorName
    }

    /**
     * Test the property 'statementDescriptorSuffix'
     */
    @Test
    public void statementDescriptorSuffixTest() {
        // TODO: test statementDescriptorSuffix
    }

    /**
     * Test the property 'orderDetails'
     */
    @Test
    public void orderDetailsTest() {
        // TODO: test orderDetails
    }

    /**
     * Test the property 'clientSecret'
     */
    @Test
    public void clientSecretTest() {
        // TODO: test clientSecret
    }

    /**
     * Test the property 'mandateData'
     */
    @Test
    public void mandateDataTest() {
        // TODO: test mandateData
    }

    /**
     * Test the property 'customerAcceptance'
     */
    @Test
    public void customerAcceptanceTest() {
        // TODO: test customerAcceptance
    }

    /**
     * Test the property 'mandateId'
     */
    @Test
    public void mandateIdTest() {
        // TODO: test mandateId
    }

    /**
     * Test the property 'browserInfo'
     */
    @Test
    public void browserInfoTest() {
        // TODO: test browserInfo
    }

    /**
     * Test the property 'paymentExperience'
     */
    @Test
    public void paymentExperienceTest() {
        // TODO: test paymentExperience
    }

    /**
     * Test the property 'paymentMethodType'
     */
    @Test
    public void paymentMethodTypeTest() {
        // TODO: test paymentMethodType
    }

    /**
     * Test the property 'merchantConnectorDetails'
     */
    @Test
    public void merchantConnectorDetailsTest() {
        // TODO: test merchantConnectorDetails
    }

    /**
     * Test the property 'allowedPaymentMethodTypes'
     */
    @Test
    public void allowedPaymentMethodTypesTest() {
        // TODO: test allowedPaymentMethodTypes
    }

    /**
     * Test the property 'retryAction'
     */
    @Test
    public void retryActionTest() {
        // TODO: test retryAction
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    public void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'connectorMetadata'
     */
    @Test
    public void connectorMetadataTest() {
        // TODO: test connectorMetadata
    }

    /**
     * Test the property 'paymentLink'
     */
    @Test
    public void paymentLinkTest() {
        // TODO: test paymentLink
    }

    /**
     * Test the property 'paymentLinkConfig'
     */
    @Test
    public void paymentLinkConfigTest() {
        // TODO: test paymentLinkConfig
    }

    /**
     * Test the property 'paymentLinkConfigId'
     */
    @Test
    public void paymentLinkConfigIdTest() {
        // TODO: test paymentLinkConfigId
    }

    /**
     * Test the property 'paymentType'
     */
    @Test
    public void paymentTypeTest() {
        // TODO: test paymentType
    }

    /**
     * Test the property 'requestIncrementalAuthorization'
     */
    @Test
    public void requestIncrementalAuthorizationTest() {
        // TODO: test requestIncrementalAuthorization
    }

    /**
     * Test the property 'sessionExpiry'
     */
    @Test
    public void sessionExpiryTest() {
        // TODO: test sessionExpiry
    }

    /**
     * Test the property 'frmMetadata'
     */
    @Test
    public void frmMetadataTest() {
        // TODO: test frmMetadata
    }

    /**
     * Test the property 'requestExternalThreeDsAuthentication'
     */
    @Test
    public void requestExternalThreeDsAuthenticationTest() {
        // TODO: test requestExternalThreeDsAuthentication
    }

    /**
     * Test the property 'recurringDetails'
     */
    @Test
    public void recurringDetailsTest() {
        // TODO: test recurringDetails
    }

    /**
     * Test the property 'charges'
     */
    @Test
    public void chargesTest() {
        // TODO: test charges
    }

    /**
     * Test the property 'merchantOrderReferenceId'
     */
    @Test
    public void merchantOrderReferenceIdTest() {
        // TODO: test merchantOrderReferenceId
    }

    /**
     * Test the property 'skipExternalTaxCalculation'
     */
    @Test
    public void skipExternalTaxCalculationTest() {
        // TODO: test skipExternalTaxCalculation
    }

    /**
     * Test the property 'psd2ScaExemptionType'
     */
    @Test
    public void psd2ScaExemptionTypeTest() {
        // TODO: test psd2ScaExemptionType
    }

}

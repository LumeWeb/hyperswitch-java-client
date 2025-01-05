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


package com.lumeweb.hyperswitch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.lumeweb.hyperswitch.model.Address;
import com.lumeweb.hyperswitch.model.AuthenticationType;
import com.lumeweb.hyperswitch.model.BrowserInformation;
import com.lumeweb.hyperswitch.model.CaptureMethod;
import com.lumeweb.hyperswitch.model.CaptureResponse;
import com.lumeweb.hyperswitch.model.ConnectorMetadata;
import com.lumeweb.hyperswitch.model.CountryAlpha2;
import com.lumeweb.hyperswitch.model.Currency;
import com.lumeweb.hyperswitch.model.DisputeResponsePaymentsRetrieve;
import com.lumeweb.hyperswitch.model.EphemeralKeyCreateResponse;
import com.lumeweb.hyperswitch.model.ExternalAuthenticationDetailsResponse;
import com.lumeweb.hyperswitch.model.FeatureMetadata;
import com.lumeweb.hyperswitch.model.FrmMessage;
import com.lumeweb.hyperswitch.model.FutureUsage;
import com.lumeweb.hyperswitch.model.IncrementalAuthorizationResponse;
import com.lumeweb.hyperswitch.model.IntentStatus;
import com.lumeweb.hyperswitch.model.MandateData;
import com.lumeweb.hyperswitch.model.NextActionData;
import com.lumeweb.hyperswitch.model.OrderDetailsWithAmount;
import com.lumeweb.hyperswitch.model.PaymentAttemptResponse;
import com.lumeweb.hyperswitch.model.PaymentChargeResponse;
import com.lumeweb.hyperswitch.model.PaymentExperience;
import com.lumeweb.hyperswitch.model.PaymentLinkResponse;
import com.lumeweb.hyperswitch.model.PaymentMethod;
import com.lumeweb.hyperswitch.model.PaymentMethodDataResponseWithBilling;
import com.lumeweb.hyperswitch.model.PaymentMethodStatus;
import com.lumeweb.hyperswitch.model.PaymentMethodType;
import com.lumeweb.hyperswitch.model.RefundResponse;
import com.lumeweb.hyperswitch.model.RequestSurchargeDetails;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for PaymentsCreateResponseOpenApi
 */
class PaymentsCreateResponseOpenApiTest {
    private final PaymentsCreateResponseOpenApi model = new PaymentsCreateResponseOpenApi();

    /**
     * Model tests for PaymentsCreateResponseOpenApi
     */
    @Test
    void testPaymentsCreateResponseOpenApi() {
        // TODO: test PaymentsCreateResponseOpenApi
    }

    /**
     * Test the property 'paymentId'
     */
    @Test
    void paymentIdTest() {
        // TODO: test paymentId
    }

    /**
     * Test the property 'merchantId'
     */
    @Test
    void merchantIdTest() {
        // TODO: test merchantId
    }

    /**
     * Test the property 'status'
     */
    @Test
    void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'amount'
     */
    @Test
    void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'netAmount'
     */
    @Test
    void netAmountTest() {
        // TODO: test netAmount
    }

    /**
     * Test the property 'shippingCost'
     */
    @Test
    void shippingCostTest() {
        // TODO: test shippingCost
    }

    /**
     * Test the property 'amountCapturable'
     */
    @Test
    void amountCapturableTest() {
        // TODO: test amountCapturable
    }

    /**
     * Test the property 'amountReceived'
     */
    @Test
    void amountReceivedTest() {
        // TODO: test amountReceived
    }

    /**
     * Test the property 'connector'
     */
    @Test
    void connectorTest() {
        // TODO: test connector
    }

    /**
     * Test the property 'clientSecret'
     */
    @Test
    void clientSecretTest() {
        // TODO: test clientSecret
    }

    /**
     * Test the property 'created'
     */
    @Test
    void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'currency'
     */
    @Test
    void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'customerId'
     */
    @Test
    void customerIdTest() {
        // TODO: test customerId
    }

    /**
     * Test the property 'description'
     */
    @Test
    void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'refunds'
     */
    @Test
    void refundsTest() {
        // TODO: test refunds
    }

    /**
     * Test the property 'disputes'
     */
    @Test
    void disputesTest() {
        // TODO: test disputes
    }

    /**
     * Test the property 'attempts'
     */
    @Test
    void attemptsTest() {
        // TODO: test attempts
    }

    /**
     * Test the property 'captures'
     */
    @Test
    void capturesTest() {
        // TODO: test captures
    }

    /**
     * Test the property 'mandateId'
     */
    @Test
    void mandateIdTest() {
        // TODO: test mandateId
    }

    /**
     * Test the property 'mandateData'
     */
    @Test
    void mandateDataTest() {
        // TODO: test mandateData
    }

    /**
     * Test the property 'setupFutureUsage'
     */
    @Test
    void setupFutureUsageTest() {
        // TODO: test setupFutureUsage
    }

    /**
     * Test the property 'offSession'
     */
    @Test
    void offSessionTest() {
        // TODO: test offSession
    }

    /**
     * Test the property 'captureMethod'
     */
    @Test
    void captureMethodTest() {
        // TODO: test captureMethod
    }

    /**
     * Test the property 'paymentMethod'
     */
    @Test
    void paymentMethodTest() {
        // TODO: test paymentMethod
    }

    /**
     * Test the property 'paymentMethodData'
     */
    @Test
    void paymentMethodDataTest() {
        // TODO: test paymentMethodData
    }

    /**
     * Test the property 'paymentToken'
     */
    @Test
    void paymentTokenTest() {
        // TODO: test paymentToken
    }

    /**
     * Test the property 'shipping'
     */
    @Test
    void shippingTest() {
        // TODO: test shipping
    }

    /**
     * Test the property 'billing'
     */
    @Test
    void billingTest() {
        // TODO: test billing
    }

    /**
     * Test the property 'orderDetails'
     */
    @Test
    void orderDetailsTest() {
        // TODO: test orderDetails
    }

    /**
     * Test the property 'email'
     */
    @Test
    void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'name'
     */
    @Test
    void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'phone'
     */
    @Test
    void phoneTest() {
        // TODO: test phone
    }

    /**
     * Test the property 'returnUrl'
     */
    @Test
    void returnUrlTest() {
        // TODO: test returnUrl
    }

    /**
     * Test the property 'authenticationType'
     */
    @Test
    void authenticationTypeTest() {
        // TODO: test authenticationType
    }

    /**
     * Test the property 'statementDescriptorName'
     */
    @Test
    void statementDescriptorNameTest() {
        // TODO: test statementDescriptorName
    }

    /**
     * Test the property 'statementDescriptorSuffix'
     */
    @Test
    void statementDescriptorSuffixTest() {
        // TODO: test statementDescriptorSuffix
    }

    /**
     * Test the property 'nextAction'
     */
    @Test
    void nextActionTest() {
        // TODO: test nextAction
    }

    /**
     * Test the property 'cancellationReason'
     */
    @Test
    void cancellationReasonTest() {
        // TODO: test cancellationReason
    }

    /**
     * Test the property 'errorCode'
     */
    @Test
    void errorCodeTest() {
        // TODO: test errorCode
    }

    /**
     * Test the property 'errorMessage'
     */
    @Test
    void errorMessageTest() {
        // TODO: test errorMessage
    }

    /**
     * Test the property 'paymentExperience'
     */
    @Test
    void paymentExperienceTest() {
        // TODO: test paymentExperience
    }

    /**
     * Test the property 'paymentMethodType'
     */
    @Test
    void paymentMethodTypeTest() {
        // TODO: test paymentMethodType
    }

    /**
     * Test the property 'connectorLabel'
     */
    @Test
    void connectorLabelTest() {
        // TODO: test connectorLabel
    }

    /**
     * Test the property 'businessCountry'
     */
    @Test
    void businessCountryTest() {
        // TODO: test businessCountry
    }

    /**
     * Test the property 'businessLabel'
     */
    @Test
    void businessLabelTest() {
        // TODO: test businessLabel
    }

    /**
     * Test the property 'businessSubLabel'
     */
    @Test
    void businessSubLabelTest() {
        // TODO: test businessSubLabel
    }

    /**
     * Test the property 'allowedPaymentMethodTypes'
     */
    @Test
    void allowedPaymentMethodTypesTest() {
        // TODO: test allowedPaymentMethodTypes
    }

    /**
     * Test the property 'ephemeralKey'
     */
    @Test
    void ephemeralKeyTest() {
        // TODO: test ephemeralKey
    }

    /**
     * Test the property 'manualRetryAllowed'
     */
    @Test
    void manualRetryAllowedTest() {
        // TODO: test manualRetryAllowed
    }

    /**
     * Test the property 'connectorTransactionId'
     */
    @Test
    void connectorTransactionIdTest() {
        // TODO: test connectorTransactionId
    }

    /**
     * Test the property 'frmMessage'
     */
    @Test
    void frmMessageTest() {
        // TODO: test frmMessage
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
     * Test the property 'referenceId'
     */
    @Test
    void referenceIdTest() {
        // TODO: test referenceId
    }

    /**
     * Test the property 'paymentLink'
     */
    @Test
    void paymentLinkTest() {
        // TODO: test paymentLink
    }

    /**
     * Test the property 'profileId'
     */
    @Test
    void profileIdTest() {
        // TODO: test profileId
    }

    /**
     * Test the property 'surchargeDetails'
     */
    @Test
    void surchargeDetailsTest() {
        // TODO: test surchargeDetails
    }

    /**
     * Test the property 'attemptCount'
     */
    @Test
    void attemptCountTest() {
        // TODO: test attemptCount
    }

    /**
     * Test the property 'merchantDecision'
     */
    @Test
    void merchantDecisionTest() {
        // TODO: test merchantDecision
    }

    /**
     * Test the property 'merchantConnectorId'
     */
    @Test
    void merchantConnectorIdTest() {
        // TODO: test merchantConnectorId
    }

    /**
     * Test the property 'incrementalAuthorizationAllowed'
     */
    @Test
    void incrementalAuthorizationAllowedTest() {
        // TODO: test incrementalAuthorizationAllowed
    }

    /**
     * Test the property 'authorizationCount'
     */
    @Test
    void authorizationCountTest() {
        // TODO: test authorizationCount
    }

    /**
     * Test the property 'incrementalAuthorizations'
     */
    @Test
    void incrementalAuthorizationsTest() {
        // TODO: test incrementalAuthorizations
    }

    /**
     * Test the property 'externalAuthenticationDetails'
     */
    @Test
    void externalAuthenticationDetailsTest() {
        // TODO: test externalAuthenticationDetails
    }

    /**
     * Test the property 'external3dsAuthenticationAttempted'
     */
    @Test
    void external3dsAuthenticationAttemptedTest() {
        // TODO: test external3dsAuthenticationAttempted
    }

    /**
     * Test the property 'expiresOn'
     */
    @Test
    void expiresOnTest() {
        // TODO: test expiresOn
    }

    /**
     * Test the property 'fingerprint'
     */
    @Test
    void fingerprintTest() {
        // TODO: test fingerprint
    }

    /**
     * Test the property 'browserInfo'
     */
    @Test
    void browserInfoTest() {
        // TODO: test browserInfo
    }

    /**
     * Test the property 'paymentMethodId'
     */
    @Test
    void paymentMethodIdTest() {
        // TODO: test paymentMethodId
    }

    /**
     * Test the property 'paymentMethodStatus'
     */
    @Test
    void paymentMethodStatusTest() {
        // TODO: test paymentMethodStatus
    }

    /**
     * Test the property 'updated'
     */
    @Test
    void updatedTest() {
        // TODO: test updated
    }

    /**
     * Test the property 'charges'
     */
    @Test
    void chargesTest() {
        // TODO: test charges
    }

    /**
     * Test the property 'frmMetadata'
     */
    @Test
    void frmMetadataTest() {
        // TODO: test frmMetadata
    }

    /**
     * Test the property 'merchantOrderReferenceId'
     */
    @Test
    void merchantOrderReferenceIdTest() {
        // TODO: test merchantOrderReferenceId
    }

    /**
     * Test the property 'orderTaxAmount'
     */
    @Test
    void orderTaxAmountTest() {
        // TODO: test orderTaxAmount
    }

    /**
     * Test the property 'connectorMandateId'
     */
    @Test
    void connectorMandateIdTest() {
        // TODO: test connectorMandateId
    }

}

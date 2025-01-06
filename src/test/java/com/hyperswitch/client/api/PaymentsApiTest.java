package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import java.time.OffsetDateTime;
import com.hyperswitch.client.model.PaymentListResponse;
import com.hyperswitch.client.model.PaymentRetrieveBody;
import com.hyperswitch.client.model.PaymentsCancelRequest;
import com.hyperswitch.client.model.PaymentsCaptureRequest;
import com.hyperswitch.client.model.PaymentsCompleteAuthorizeRequest;
import com.hyperswitch.client.model.PaymentsConfirmRequest;
import com.hyperswitch.client.model.PaymentsCreateRequest;
import com.hyperswitch.client.model.PaymentsExternalAuthenticationRequest;
import com.hyperswitch.client.model.PaymentsExternalAuthenticationResponse;
import com.hyperswitch.client.model.PaymentsIncrementalAuthorizationRequest;
import com.hyperswitch.client.model.PaymentsPostSessionTokensRequest;
import com.hyperswitch.client.model.PaymentsPostSessionTokensResponse;
import com.hyperswitch.client.model.PaymentsResponse;
import com.hyperswitch.client.model.PaymentsSessionRequest;
import com.hyperswitch.client.model.PaymentsSessionResponse;
import com.hyperswitch.client.model.PaymentsUpdateRequest;
import com.hyperswitch.client.model.RetrievePaymentLinkRequest;
import com.hyperswitch.client.model.RetrievePaymentLinkResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
class PaymentsApiTest {

    private PaymentsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PaymentsApi.class);
    }

    
    /**
     * Payments - Cancel
     *
     * A Payment could can be cancelled when it is in one of these statuses: &#x60;requires_payment_method&#x60;, &#x60;requires_capture&#x60;, &#x60;requires_confirmation&#x60;, &#x60;requires_customer_action&#x60;.
     */
    @Test
    void cancelAPaymentTest() {
        String paymentId = null;
        PaymentsCancelRequest paymentsCancelRequest = null;
        // api.cancelAPayment(paymentId, paymentsCancelRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Capture
     *
     * To capture the funds for an uncaptured payment
     */
    @Test
    void captureAPaymentTest() {
        String paymentId = null;
        PaymentsCaptureRequest paymentsCaptureRequest = null;
        // PaymentsResponse response = api.captureAPayment(paymentId, paymentsCaptureRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Complete Authorize
     *
     * 
     */
    @Test
    void completeAuthorizeAPaymentTest() {
        String paymentId = null;
        PaymentsCompleteAuthorizeRequest paymentsCompleteAuthorizeRequest = null;
        // PaymentsResponse response = api.completeAuthorizeAPayment(paymentId, paymentsCompleteAuthorizeRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Confirm
     *
     * **Use this API to confirm the payment and forward the payment to the payment processor.**  Alternatively you can confirm the payment within the *Payments/Create* API by setting &#x60;confirm&#x3D;true&#x60;. After confirmation, the payment could either:  1. fail with &#x60;failed&#x60; status or  2. transition to a &#x60;requires_customer_action&#x60; status with a &#x60;next_action&#x60; block or  3. succeed with either &#x60;succeeded&#x60; in case of automatic capture or &#x60;requires_capture&#x60; in case of manual capture
     */
    @Test
    void confirmAPaymentTest() {
        String paymentId = null;
        PaymentsConfirmRequest paymentsConfirmRequest = null;
        // PaymentsResponse response = api.confirmAPayment(paymentId, paymentsConfirmRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Create
     *
     * **Creates a payment object when amount and currency are passed.**  This API is also used to create a mandate by passing the &#x60;mandate_object&#x60;.  Depending on the user journey you wish to achieve, you may opt to complete all the steps in a single request **by attaching a payment method, setting &#x60;confirm&#x3D;true&#x60; and &#x60;capture_method &#x3D; automatic&#x60;** in the *Payments/Create API* request.  Otherwise, To completely process a payment you will have to **create a payment, attach a payment method, confirm and capture funds**. For that you could use the following sequence of API requests -  1. Payments - Create  2. Payments - Update  3. Payments - Confirm  4. Payments - Capture.  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the first call, and use the &#39;client secret&#39; returned in this API along with your &#39;publishable key&#39; to make subsequent API calls from your client.  This page lists the various combinations in which the Payments - Create API can be used and the details about the various fields in the requests and responses.
     */
    @Test
    void createAPaymentTest() {
        PaymentsCreateRequest paymentsCreateRequest = null;
        // PaymentsResponse response = api.createAPayment(paymentsCreateRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Post Session Tokens
     *
     * 
     */
    @Test
    void createPostSessionTokensForAPaymentTest() {
        String paymentId = null;
        PaymentsPostSessionTokensRequest paymentsPostSessionTokensRequest = null;
        // PaymentsPostSessionTokensResponse response = api.createPostSessionTokensForAPayment(paymentId, paymentsPostSessionTokensRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Session token
     *
     * Creates a session object or a session token for wallets like Apple Pay, Google Pay, etc. These tokens are used by Hyperswitch&#39;s SDK to initiate these wallets&#39; SDK.
     */
    @Test
    void createSessionTokensForAPaymentTest() {
        PaymentsSessionRequest paymentsSessionRequest = null;
        // PaymentsSessionResponse response = api.createSessionTokensForAPayment(paymentsSessionRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Incremental Authorization
     *
     * Authorized amount for a payment can be incremented if it is in status: requires_capture
     */
    @Test
    void incrementAuthorizedAmountForAPaymentTest() {
        String paymentId = null;
        PaymentsIncrementalAuthorizationRequest paymentsIncrementalAuthorizationRequest = null;
        // PaymentsResponse response = api.incrementAuthorizedAmountForAPayment(paymentId, paymentsIncrementalAuthorizationRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - External 3DS Authentication
     *
     * External 3DS Authentication is performed and returns the AuthenticationResponse
     */
    @Test
    void initiateExternalAuthenticationForAPaymentTest() {
        String paymentId = null;
        PaymentsExternalAuthenticationRequest paymentsExternalAuthenticationRequest = null;
        // PaymentsExternalAuthenticationResponse response = api.initiateExternalAuthenticationForAPayment(paymentId, paymentsExternalAuthenticationRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - List
     *
     * To list the *payments*
     */
    @Test
    void listAllPaymentsTest() {
        String customerId = null;
        String startingAfter = null;
        String endingBefore = null;
        Long limit = null;
        OffsetDateTime created = null;
        OffsetDateTime createdLt = null;
        OffsetDateTime createdGt = null;
        OffsetDateTime createdLte = null;
        OffsetDateTime createdGte = null;
        // List<PaymentListResponse> response = api.listAllPayments(customerId, startingAfter, endingBefore, limit, created, createdLt, createdGt, createdLte, createdGte);

        // TODO: test validations
    }

    /**
     * Payments - List
     *
     * To list the *payments*
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAllPaymentsTestQueryMap() {
        PaymentsApi.ListAllPaymentsQueryParams queryParams = new PaymentsApi.ListAllPaymentsQueryParams()
            .customerId(null)
            .startingAfter(null)
            .endingBefore(null)
            .limit(null)
            .created(null)
            .createdLt(null)
            .createdGt(null)
            .createdLte(null)
            .createdGte(null);
        // List<PaymentListResponse> response = api.listAllPayments(queryParams);

    // TODO: test validations
    }
    
    /**
     * Payments - Retrieve
     *
     * Retrieves a Payment. This API can also be used to get the status of a previously initiated payment or next action for an ongoing payment
     */
    @Test
    void retrieveAPaymentTest() {
        String paymentId = null;
        PaymentRetrieveBody paymentRetrieveBody = null;
        // PaymentsResponse response = api.retrieveAPayment(paymentId, paymentRetrieveBody);

        // TODO: test validations
    }

    
    /**
     * Payments Link - Retrieve
     *
     * To retrieve the properties of a Payment Link. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
     */
    @Test
    void retrieveAPaymentLinkTest() {
        String paymentLinkId = null;
        RetrievePaymentLinkRequest retrievePaymentLinkRequest = null;
        // RetrievePaymentLinkResponse response = api.retrieveAPaymentLink(paymentLinkId, retrievePaymentLinkRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Update
     *
     * To update the properties of a *PaymentIntent* object. This may include attaching a payment method, or attaching customer object or metadata fields after the Payment is created
     */
    @Test
    void updateAPaymentTest() {
        String paymentId = null;
        PaymentsUpdateRequest paymentsUpdateRequest = null;
        // PaymentsResponse response = api.updateAPayment(paymentId, paymentsUpdateRequest);

        // TODO: test validations
    }

    
}

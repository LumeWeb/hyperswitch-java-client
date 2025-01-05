package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.PaymentsConfirmIntentRequest;
import com.hyperswitch.client.model.PaymentsConfirmIntentResponse;
import com.hyperswitch.client.model.PaymentsCreateIntentRequest;
import com.hyperswitch.client.model.PaymentsIntentResponse;
import com.hyperswitch.client.model.PaymentsSessionResponse;
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
     * Payments - Confirm Intent
     *
     * **Confirms a payment intent object with the payment method data**  .
     */
    @Test
    void confirmPaymentIntentTest() {
        String id = null;
        PaymentsConfirmIntentRequest paymentsConfirmIntentRequest = null;
        // PaymentsConfirmIntentResponse response = api.confirmPaymentIntent(id, paymentsConfirmIntentRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Create Intent
     *
     * **Creates a payment intent object when amount_details are passed.**  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the first call, and use the &#39;client secret&#39; returned in this API along with your &#39;publishable key&#39; to make subsequent API calls from your client.
     */
    @Test
    void createAPaymentIntentTest() {
        PaymentsCreateIntentRequest paymentsCreateIntentRequest = null;
        // PaymentsIntentResponse response = api.createAPaymentIntent(paymentsCreateIntentRequest);

        // TODO: test validations
    }

    
    /**
     * Payments - Session token
     *
     * Creates a session object or a session token for wallets like Apple Pay, Google Pay, etc. These tokens are used by Hyperswitch&#39;s SDK to initiate these wallets&#39; SDK.
     */
    @Test
    void createSessionTokensForAPaymentTest() {
        String paymentId = null;
        Object body = null;
        // PaymentsSessionResponse response = api.createSessionTokensForAPayment(paymentId, body);

        // TODO: test validations
    }

    
    /**
     * Payments - Get Intent
     *
     * **Get a payment intent object when id is passed in path**  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the call.
     */
    @Test
    void getThePaymentIntentDetailsTest() {
        String id = null;
        // PaymentsIntentResponse response = api.getThePaymentIntentDetails(id);

        // TODO: test validations
    }

    
}

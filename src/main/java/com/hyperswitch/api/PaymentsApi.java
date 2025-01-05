package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.model.ApiResponse;

import com.hyperswitch.model.PaymentsConfirmIntentRequest;
import com.hyperswitch.model.PaymentsConfirmIntentResponse;
import com.hyperswitch.model.PaymentsCreateIntentRequest;
import com.hyperswitch.model.PaymentsIntentResponse;
import com.hyperswitch.model.PaymentsSessionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface PaymentsApi extends ApiClient.Api {


  /**
   * Payments - Confirm Intent
   * **Confirms a payment intent object with the payment method data**  .
   * @param id The payment identifier (required)
   * @param paymentsConfirmIntentRequest  (required)
   * @return PaymentsConfirmIntentResponse
   */
  @RequestLine("POST /v2/payments/{id}/confirm-intent")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsConfirmIntentResponse confirmPaymentIntent(@Param("id") String id, PaymentsConfirmIntentRequest paymentsConfirmIntentRequest);

  /**
   * Payments - Confirm Intent
   * Similar to <code>confirmPaymentIntent</code> but it also returns the http response headers .
   * **Confirms a payment intent object with the payment method data**  .
   * @param id The payment identifier (required)
   * @param paymentsConfirmIntentRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v2/payments/{id}/confirm-intent")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsConfirmIntentResponse> confirmPaymentIntentWithHttpInfo(@Param("id") String id, PaymentsConfirmIntentRequest paymentsConfirmIntentRequest);



  /**
   * Payments - Create Intent
   * **Creates a payment intent object when amount_details are passed.**  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the first call, and use the &#39;client secret&#39; returned in this API along with your &#39;publishable key&#39; to make subsequent API calls from your client.
   * @param paymentsCreateIntentRequest  (required)
   * @return PaymentsIntentResponse
   */
  @RequestLine("POST /v2/payments/create-intent")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsIntentResponse createAPaymentIntent(PaymentsCreateIntentRequest paymentsCreateIntentRequest);

  /**
   * Payments - Create Intent
   * Similar to <code>createAPaymentIntent</code> but it also returns the http response headers .
   * **Creates a payment intent object when amount_details are passed.**  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the first call, and use the &#39;client secret&#39; returned in this API along with your &#39;publishable key&#39; to make subsequent API calls from your client.
   * @param paymentsCreateIntentRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v2/payments/create-intent")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsIntentResponse> createAPaymentIntentWithHttpInfo(PaymentsCreateIntentRequest paymentsCreateIntentRequest);



  /**
   * Payments - Session token
   * Creates a session object or a session token for wallets like Apple Pay, Google Pay, etc. These tokens are used by Hyperswitch&#39;s SDK to initiate these wallets&#39; SDK.
   * @param paymentId The identifier for payment (required)
   * @param body  (required)
   * @return PaymentsSessionResponse
   */
  @RequestLine("POST /v2/payments/{paymentId}/create-external-sdk-tokens")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsSessionResponse createSessionTokensForAPayment(@Param("paymentId") String paymentId, Object body);

  /**
   * Payments - Session token
   * Similar to <code>createSessionTokensForAPayment</code> but it also returns the http response headers .
   * Creates a session object or a session token for wallets like Apple Pay, Google Pay, etc. These tokens are used by Hyperswitch&#39;s SDK to initiate these wallets&#39; SDK.
   * @param paymentId The identifier for payment (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v2/payments/{paymentId}/create-external-sdk-tokens")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsSessionResponse> createSessionTokensForAPaymentWithHttpInfo(@Param("paymentId") String paymentId, Object body);



  /**
   * Payments - Get Intent
   * **Get a payment intent object when id is passed in path**  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the call.
   * @param id The unique identifier for the Payment Intent (required)
   * @return PaymentsIntentResponse
   */
  @RequestLine("GET /v2/payments/{id}/get-intent")
  @Headers({
    "Accept: application/json",
  })
  PaymentsIntentResponse getThePaymentIntentDetails(@Param("id") String id);

  /**
   * Payments - Get Intent
   * Similar to <code>getThePaymentIntentDetails</code> but it also returns the http response headers .
   * **Get a payment intent object when id is passed in path**  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the call.
   * @param id The unique identifier for the Payment Intent (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/payments/{id}/get-intent")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentsIntentResponse> getThePaymentIntentDetailsWithHttpInfo(@Param("id") String id);


}

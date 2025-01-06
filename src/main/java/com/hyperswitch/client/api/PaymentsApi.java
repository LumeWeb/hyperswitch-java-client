package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface PaymentsApi extends ApiClient.Api {


  /**
   * Payments - Cancel
   * A Payment could can be cancelled when it is in one of these statuses: &#x60;requires_payment_method&#x60;, &#x60;requires_capture&#x60;, &#x60;requires_confirmation&#x60;, &#x60;requires_customer_action&#x60;.
   * @param paymentId The identifier for payment (required)
   * @param paymentsCancelRequest  (required)
   */
  @RequestLine("POST /payments/{paymentId}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void cancelAPayment(@Param("paymentId") String paymentId, PaymentsCancelRequest paymentsCancelRequest);

  /**
   * Payments - Cancel
   * Similar to <code>cancelAPayment</code> but it also returns the http response headers .
   * A Payment could can be cancelled when it is in one of these statuses: &#x60;requires_payment_method&#x60;, &#x60;requires_capture&#x60;, &#x60;requires_confirmation&#x60;, &#x60;requires_customer_action&#x60;.
   * @param paymentId The identifier for payment (required)
   * @param paymentsCancelRequest  (required)
   */
  @RequestLine("POST /payments/{paymentId}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Void> cancelAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsCancelRequest paymentsCancelRequest);



  /**
   * Payments - Capture
   * To capture the funds for an uncaptured payment
   * @param paymentId The identifier for payment (required)
   * @param paymentsCaptureRequest  (required)
   * @return PaymentsResponse
   */
  @RequestLine("POST /payments/{paymentId}/capture")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse captureAPayment(@Param("paymentId") String paymentId, PaymentsCaptureRequest paymentsCaptureRequest);

  /**
   * Payments - Capture
   * Similar to <code>captureAPayment</code> but it also returns the http response headers .
   * To capture the funds for an uncaptured payment
   * @param paymentId The identifier for payment (required)
   * @param paymentsCaptureRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments/{paymentId}/capture")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> captureAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsCaptureRequest paymentsCaptureRequest);



  /**
   * Payments - Complete Authorize
   * 
   * @param paymentId The identifier for payment (required)
   * @param paymentsCompleteAuthorizeRequest  (required)
   * @return PaymentsResponse
   */
  @RequestLine("POST /{paymentId}/complete_authorize")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse completeAuthorizeAPayment(@Param("paymentId") String paymentId, PaymentsCompleteAuthorizeRequest paymentsCompleteAuthorizeRequest);

  /**
   * Payments - Complete Authorize
   * Similar to <code>completeAuthorizeAPayment</code> but it also returns the http response headers .
   * 
   * @param paymentId The identifier for payment (required)
   * @param paymentsCompleteAuthorizeRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /{paymentId}/complete_authorize")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> completeAuthorizeAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsCompleteAuthorizeRequest paymentsCompleteAuthorizeRequest);



  /**
   * Payments - Confirm
   * **Use this API to confirm the payment and forward the payment to the payment processor.**  Alternatively you can confirm the payment within the *Payments/Create* API by setting &#x60;confirm&#x3D;true&#x60;. After confirmation, the payment could either:  1. fail with &#x60;failed&#x60; status or  2. transition to a &#x60;requires_customer_action&#x60; status with a &#x60;next_action&#x60; block or  3. succeed with either &#x60;succeeded&#x60; in case of automatic capture or &#x60;requires_capture&#x60; in case of manual capture
   * @param paymentId The identifier for payment (required)
   * @param paymentsConfirmRequest  (required)
   * @return PaymentsResponse
   */
  @RequestLine("POST /payments/{paymentId}/confirm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse confirmAPayment(@Param("paymentId") String paymentId, PaymentsConfirmRequest paymentsConfirmRequest);

  /**
   * Payments - Confirm
   * Similar to <code>confirmAPayment</code> but it also returns the http response headers .
   * **Use this API to confirm the payment and forward the payment to the payment processor.**  Alternatively you can confirm the payment within the *Payments/Create* API by setting &#x60;confirm&#x3D;true&#x60;. After confirmation, the payment could either:  1. fail with &#x60;failed&#x60; status or  2. transition to a &#x60;requires_customer_action&#x60; status with a &#x60;next_action&#x60; block or  3. succeed with either &#x60;succeeded&#x60; in case of automatic capture or &#x60;requires_capture&#x60; in case of manual capture
   * @param paymentId The identifier for payment (required)
   * @param paymentsConfirmRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments/{paymentId}/confirm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> confirmAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsConfirmRequest paymentsConfirmRequest);



  /**
   * Payments - Create
   * **Creates a payment object when amount and currency are passed.**  This API is also used to create a mandate by passing the &#x60;mandate_object&#x60;.  Depending on the user journey you wish to achieve, you may opt to complete all the steps in a single request **by attaching a payment method, setting &#x60;confirm&#x3D;true&#x60; and &#x60;capture_method &#x3D; automatic&#x60;** in the *Payments/Create API* request.  Otherwise, To completely process a payment you will have to **create a payment, attach a payment method, confirm and capture funds**. For that you could use the following sequence of API requests -  1. Payments - Create  2. Payments - Update  3. Payments - Confirm  4. Payments - Capture.  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the first call, and use the &#39;client secret&#39; returned in this API along with your &#39;publishable key&#39; to make subsequent API calls from your client.  This page lists the various combinations in which the Payments - Create API can be used and the details about the various fields in the requests and responses.
   * @param paymentsCreateRequest  (required)
   * @return PaymentsResponse
   */
  @RequestLine("POST /payments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse createAPayment(PaymentsCreateRequest paymentsCreateRequest);

  /**
   * Payments - Create
   * Similar to <code>createAPayment</code> but it also returns the http response headers .
   * **Creates a payment object when amount and currency are passed.**  This API is also used to create a mandate by passing the &#x60;mandate_object&#x60;.  Depending on the user journey you wish to achieve, you may opt to complete all the steps in a single request **by attaching a payment method, setting &#x60;confirm&#x3D;true&#x60; and &#x60;capture_method &#x3D; automatic&#x60;** in the *Payments/Create API* request.  Otherwise, To completely process a payment you will have to **create a payment, attach a payment method, confirm and capture funds**. For that you could use the following sequence of API requests -  1. Payments - Create  2. Payments - Update  3. Payments - Confirm  4. Payments - Capture.  You will require the &#39;API - Key&#39; from the Hyperswitch dashboard to make the first call, and use the &#39;client secret&#39; returned in this API along with your &#39;publishable key&#39; to make subsequent API calls from your client.  This page lists the various combinations in which the Payments - Create API can be used and the details about the various fields in the requests and responses.
   * @param paymentsCreateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> createAPaymentWithHttpInfo(PaymentsCreateRequest paymentsCreateRequest);



  /**
   * Payments - Post Session Tokens
   * 
   * @param paymentId The unique identifier for the payment (required)
   * @param paymentsPostSessionTokensRequest  (required)
   * @return PaymentsPostSessionTokensResponse
   */
  @RequestLine("POST /payments/{paymentId}/post_session_tokens")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsPostSessionTokensResponse createPostSessionTokensForAPayment(@Param("paymentId") String paymentId, PaymentsPostSessionTokensRequest paymentsPostSessionTokensRequest);

  /**
   * Payments - Post Session Tokens
   * Similar to <code>createPostSessionTokensForAPayment</code> but it also returns the http response headers .
   * 
   * @param paymentId The unique identifier for the payment (required)
   * @param paymentsPostSessionTokensRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments/{paymentId}/post_session_tokens")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsPostSessionTokensResponse> createPostSessionTokensForAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsPostSessionTokensRequest paymentsPostSessionTokensRequest);



  /**
   * Payments - Session token
   * Creates a session object or a session token for wallets like Apple Pay, Google Pay, etc. These tokens are used by Hyperswitch&#39;s SDK to initiate these wallets&#39; SDK.
   * @param paymentsSessionRequest  (required)
   * @return PaymentsSessionResponse
   */
  @RequestLine("POST /payments/session_tokens")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsSessionResponse createSessionTokensForAPayment(PaymentsSessionRequest paymentsSessionRequest);

  /**
   * Payments - Session token
   * Similar to <code>createSessionTokensForAPayment</code> but it also returns the http response headers .
   * Creates a session object or a session token for wallets like Apple Pay, Google Pay, etc. These tokens are used by Hyperswitch&#39;s SDK to initiate these wallets&#39; SDK.
   * @param paymentsSessionRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments/session_tokens")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsSessionResponse> createSessionTokensForAPaymentWithHttpInfo(PaymentsSessionRequest paymentsSessionRequest);



  /**
   * Payments - Incremental Authorization
   * Authorized amount for a payment can be incremented if it is in status: requires_capture
   * @param paymentId The identifier for payment (required)
   * @param paymentsIncrementalAuthorizationRequest  (required)
   * @return PaymentsResponse
   */
  @RequestLine("POST /payments/{paymentId}/incremental_authorization")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse incrementAuthorizedAmountForAPayment(@Param("paymentId") String paymentId, PaymentsIncrementalAuthorizationRequest paymentsIncrementalAuthorizationRequest);

  /**
   * Payments - Incremental Authorization
   * Similar to <code>incrementAuthorizedAmountForAPayment</code> but it also returns the http response headers .
   * Authorized amount for a payment can be incremented if it is in status: requires_capture
   * @param paymentId The identifier for payment (required)
   * @param paymentsIncrementalAuthorizationRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments/{paymentId}/incremental_authorization")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> incrementAuthorizedAmountForAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsIncrementalAuthorizationRequest paymentsIncrementalAuthorizationRequest);



  /**
   * Payments - External 3DS Authentication
   * External 3DS Authentication is performed and returns the AuthenticationResponse
   * @param paymentId The identifier for payment (required)
   * @param paymentsExternalAuthenticationRequest  (required)
   * @return PaymentsExternalAuthenticationResponse
   */
  @RequestLine("POST /payments/{paymentId}/3ds/authentication")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsExternalAuthenticationResponse initiateExternalAuthenticationForAPayment(@Param("paymentId") String paymentId, PaymentsExternalAuthenticationRequest paymentsExternalAuthenticationRequest);

  /**
   * Payments - External 3DS Authentication
   * Similar to <code>initiateExternalAuthenticationForAPayment</code> but it also returns the http response headers .
   * External 3DS Authentication is performed and returns the AuthenticationResponse
   * @param paymentId The identifier for payment (required)
   * @param paymentsExternalAuthenticationRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments/{paymentId}/3ds/authentication")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsExternalAuthenticationResponse> initiateExternalAuthenticationForAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsExternalAuthenticationRequest paymentsExternalAuthenticationRequest);



  /**
   * Payments - List
   * To list the *payments*
   * @param customerId The identifier for the customer (required)
   * @param startingAfter A cursor for use in pagination, fetch the next list after some object (required)
   * @param endingBefore A cursor for use in pagination, fetch the previous list before some object (required)
   * @param limit Limit on the number of objects to return (required)
   * @param created The time at which payment is created (required)
   * @param createdLt Time less than the payment created time (required)
   * @param createdGt Time greater than the payment created time (required)
   * @param createdLte Time less than or equals to the payment created time (required)
   * @param createdGte Time greater than or equals to the payment created time (required)
   * @return List&lt;PaymentListResponse&gt;
   */
  @RequestLine("GET /payments/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&created_lt={createdLt}&created_gt={createdGt}&created_lte={createdLte}&created_gte={createdGte}")
  @Headers({
    "Accept: application/json",
  })
  List<PaymentListResponse> listAllPayments(@Param("customerId") String customerId, @Param("startingAfter") String startingAfter, @Param("endingBefore") String endingBefore, @Param("limit") Long limit, @Param("created") OffsetDateTime created, @Param("createdLt") OffsetDateTime createdLt, @Param("createdGt") OffsetDateTime createdGt, @Param("createdLte") OffsetDateTime createdLte, @Param("createdGte") OffsetDateTime createdGte);

  /**
   * Payments - List
   * Similar to <code>listAllPayments</code> but it also returns the http response headers .
   * To list the *payments*
   * @param customerId The identifier for the customer (required)
   * @param startingAfter A cursor for use in pagination, fetch the next list after some object (required)
   * @param endingBefore A cursor for use in pagination, fetch the previous list before some object (required)
   * @param limit Limit on the number of objects to return (required)
   * @param created The time at which payment is created (required)
   * @param createdLt Time less than the payment created time (required)
   * @param createdGt Time greater than the payment created time (required)
   * @param createdLte Time less than or equals to the payment created time (required)
   * @param createdGte Time greater than or equals to the payment created time (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payments/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&created_lt={createdLt}&created_gt={createdGt}&created_lte={createdLte}&created_gte={createdGte}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<PaymentListResponse>> listAllPaymentsWithHttpInfo(@Param("customerId") String customerId, @Param("startingAfter") String startingAfter, @Param("endingBefore") String endingBefore, @Param("limit") Long limit, @Param("created") OffsetDateTime created, @Param("createdLt") OffsetDateTime createdLt, @Param("createdGt") OffsetDateTime createdGt, @Param("createdLte") OffsetDateTime createdLte, @Param("createdGte") OffsetDateTime createdGte);


  /**
   * Payments - List
   * To list the *payments*
   * Note, this is equivalent to the other <code>listAllPayments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAllPaymentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>customerId - The identifier for the customer (required)</li>
   *   <li>startingAfter - A cursor for use in pagination, fetch the next list after some object (required)</li>
   *   <li>endingBefore - A cursor for use in pagination, fetch the previous list before some object (required)</li>
   *   <li>limit - Limit on the number of objects to return (required)</li>
   *   <li>created - The time at which payment is created (required)</li>
   *   <li>createdLt - Time less than the payment created time (required)</li>
   *   <li>createdGt - Time greater than the payment created time (required)</li>
   *   <li>createdLte - Time less than or equals to the payment created time (required)</li>
   *   <li>createdGte - Time greater than or equals to the payment created time (required)</li>
   *   </ul>
   * @return List&lt;PaymentListResponse&gt;
   */
  @RequestLine("GET /payments/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&created_lt={createdLt}&created_gt={createdGt}&created_lte={createdLte}&created_gte={createdGte}")
  @Headers({
  "Accept: application/json",
  })
  List<PaymentListResponse> listAllPayments(@QueryMap(encoded=true) ListAllPaymentsQueryParams queryParams);

  /**
  * Payments - List
  * To list the *payments*
  * Note, this is equivalent to the other <code>listAllPayments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>customerId - The identifier for the customer (required)</li>
          *   <li>startingAfter - A cursor for use in pagination, fetch the next list after some object (required)</li>
          *   <li>endingBefore - A cursor for use in pagination, fetch the previous list before some object (required)</li>
          *   <li>limit - Limit on the number of objects to return (required)</li>
          *   <li>created - The time at which payment is created (required)</li>
          *   <li>createdLt - Time less than the payment created time (required)</li>
          *   <li>createdGt - Time greater than the payment created time (required)</li>
          *   <li>createdLte - Time less than or equals to the payment created time (required)</li>
          *   <li>createdGte - Time greater than or equals to the payment created time (required)</li>
      *   </ul>
          * @return List&lt;PaymentListResponse&gt;
      */
      @RequestLine("GET /payments/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&created_lt={createdLt}&created_gt={createdGt}&created_lte={createdLte}&created_gte={createdGte}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<List<PaymentListResponse>> listAllPaymentsWithHttpInfo(@QueryMap(encoded=true) ListAllPaymentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAllPayments</code> method in a fluent style.
   */
  public static class ListAllPaymentsQueryParams extends HashMap<String, Object> {
    public ListAllPaymentsQueryParams customerId(final String value) {
      put("customer_id", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams startingAfter(final String value) {
      put("starting_after", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams endingBefore(final String value) {
      put("ending_before", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams limit(final Long value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams created(final OffsetDateTime value) {
      put("created", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams createdLt(final OffsetDateTime value) {
      put("created_lt", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams createdGt(final OffsetDateTime value) {
      put("created_gt", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams createdLte(final OffsetDateTime value) {
      put("created_lte", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentsQueryParams createdGte(final OffsetDateTime value) {
      put("created_gte", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Payments - Retrieve
   * Retrieves a Payment. This API can also be used to get the status of a previously initiated payment or next action for an ongoing payment
   * @param paymentId The identifier for payment (required)
   * @param paymentRetrieveBody  (required)
   * @return PaymentsResponse
   */
  @RequestLine("GET /payments/{paymentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse retrieveAPayment(@Param("paymentId") String paymentId, PaymentRetrieveBody paymentRetrieveBody);

  /**
   * Payments - Retrieve
   * Similar to <code>retrieveAPayment</code> but it also returns the http response headers .
   * Retrieves a Payment. This API can also be used to get the status of a previously initiated payment or next action for an ongoing payment
   * @param paymentId The identifier for payment (required)
   * @param paymentRetrieveBody  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payments/{paymentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> retrieveAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentRetrieveBody paymentRetrieveBody);



  /**
   * Payments Link - Retrieve
   * To retrieve the properties of a Payment Link. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
   * @param paymentLinkId The identifier for payment link (required)
   * @param retrievePaymentLinkRequest  (required)
   * @return RetrievePaymentLinkResponse
   */
  @RequestLine("GET /payment_link/{paymentLinkId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RetrievePaymentLinkResponse retrieveAPaymentLink(@Param("paymentLinkId") String paymentLinkId, RetrievePaymentLinkRequest retrievePaymentLinkRequest);

  /**
   * Payments Link - Retrieve
   * Similar to <code>retrieveAPaymentLink</code> but it also returns the http response headers .
   * To retrieve the properties of a Payment Link. This may be used to get the status of a previously initiated payment or next action for an ongoing payment
   * @param paymentLinkId The identifier for payment link (required)
   * @param retrievePaymentLinkRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payment_link/{paymentLinkId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RetrievePaymentLinkResponse> retrieveAPaymentLinkWithHttpInfo(@Param("paymentLinkId") String paymentLinkId, RetrievePaymentLinkRequest retrievePaymentLinkRequest);



  /**
   * Payments - Update
   * To update the properties of a *PaymentIntent* object. This may include attaching a payment method, or attaching customer object or metadata fields after the Payment is created
   * @param paymentId The identifier for payment (required)
   * @param paymentsUpdateRequest  (required)
   * @return PaymentsResponse
   */
  @RequestLine("POST /payments/{paymentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentsResponse updateAPayment(@Param("paymentId") String paymentId, PaymentsUpdateRequest paymentsUpdateRequest);

  /**
   * Payments - Update
   * Similar to <code>updateAPayment</code> but it also returns the http response headers .
   * To update the properties of a *PaymentIntent* object. This may include attaching a payment method, or attaching customer object or metadata fields after the Payment is created
   * @param paymentId The identifier for payment (required)
   * @param paymentsUpdateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payments/{paymentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentsResponse> updateAPaymentWithHttpInfo(@Param("paymentId") String paymentId, PaymentsUpdateRequest paymentsUpdateRequest);


}

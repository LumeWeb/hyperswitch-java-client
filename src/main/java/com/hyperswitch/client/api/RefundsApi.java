package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.RefundListRequest;
import com.hyperswitch.client.model.RefundListResponse;
import com.hyperswitch.client.model.RefundRequest;
import com.hyperswitch.client.model.RefundResponse;
import com.hyperswitch.client.model.RefundUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface RefundsApi extends ApiClient.Api {


  /**
   * Refunds - Create
   * Creates a refund against an already processed payment. In case of some processors, you can even opt to refund only a partial amount multiple times until the original charge amount has been refunded
   * @param refundRequest  (required)
   * @return RefundResponse
   */
  @RequestLine("POST /refunds")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RefundResponse createARefund(RefundRequest refundRequest);

  /**
   * Refunds - Create
   * Similar to <code>createARefund</code> but it also returns the http response headers .
   * Creates a refund against an already processed payment. In case of some processors, you can even opt to refund only a partial amount multiple times until the original charge amount has been refunded
   * @param refundRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /refunds")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RefundResponse> createARefundWithHttpInfo(RefundRequest refundRequest);



  /**
   * Refunds - List
   * Lists all the refunds associated with the merchant or a payment_id if payment_id is not provided
   * @param refundListRequest  (required)
   * @return RefundListResponse
   */
  @RequestLine("POST /refunds/list")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RefundListResponse listAllRefunds(RefundListRequest refundListRequest);

  /**
   * Refunds - List
   * Similar to <code>listAllRefunds</code> but it also returns the http response headers .
   * Lists all the refunds associated with the merchant or a payment_id if payment_id is not provided
   * @param refundListRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /refunds/list")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RefundListResponse> listAllRefundsWithHttpInfo(RefundListRequest refundListRequest);



  /**
   * Refunds - Retrieve
   * Retrieves a Refund. This may be used to get the status of a previously initiated refund
   * @param refundId The identifier for refund (required)
   * @return RefundResponse
   */
  @RequestLine("GET /refunds/{refundId}")
  @Headers({
    "Accept: application/json",
  })
  RefundResponse retrieveARefund(@Param("refundId") String refundId);

  /**
   * Refunds - Retrieve
   * Similar to <code>retrieveARefund</code> but it also returns the http response headers .
   * Retrieves a Refund. This may be used to get the status of a previously initiated refund
   * @param refundId The identifier for refund (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /refunds/{refundId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<RefundResponse> retrieveARefundWithHttpInfo(@Param("refundId") String refundId);



  /**
   * Refunds - Update
   * Updates the properties of a Refund object. This API can be used to attach a reason for the refund or metadata fields
   * @param refundId The identifier for refund (required)
   * @param refundUpdateRequest  (required)
   * @return RefundResponse
   */
  @RequestLine("POST /refunds/{refundId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RefundResponse updateARefund(@Param("refundId") String refundId, RefundUpdateRequest refundUpdateRequest);

  /**
   * Refunds - Update
   * Similar to <code>updateARefund</code> but it also returns the http response headers .
   * Updates the properties of a Refund object. This API can be used to attach a reason for the refund or metadata fields
   * @param refundId The identifier for refund (required)
   * @param refundUpdateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /refunds/{refundId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RefundResponse> updateARefundWithHttpInfo(@Param("refundId") String refundId, RefundUpdateRequest refundUpdateRequest);


}

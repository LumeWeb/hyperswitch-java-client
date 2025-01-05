package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.model.ApiResponse;

import com.hyperswitch.model.RefundResponse;
import com.hyperswitch.model.RefundsCreateRequest;

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
   * @param refundsCreateRequest  (required)
   * @return RefundResponse
   */
  @RequestLine("POST /v2/refunds")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RefundResponse createARefund(RefundsCreateRequest refundsCreateRequest);

  /**
   * Refunds - Create
   * Similar to <code>createARefund</code> but it also returns the http response headers .
   * Creates a refund against an already processed payment. In case of some processors, you can even opt to refund only a partial amount multiple times until the original charge amount has been refunded
   * @param refundsCreateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v2/refunds")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RefundResponse> createARefundWithHttpInfo(RefundsCreateRequest refundsCreateRequest);


}

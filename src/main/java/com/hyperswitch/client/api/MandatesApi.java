package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.MandateResponse;
import com.hyperswitch.client.model.MandateRevokedResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface MandatesApi extends ApiClient.Api {


  /**
   * Mandates - Customer Mandates List
   * Lists all the mandates for a particular customer id.
   * @param customerId The unique identifier for the customer (required)
   * @return List&lt;MandateResponse&gt;
   */
  @RequestLine("POST /customers/{customerId}/mandates")
  @Headers({
    "Accept: application/json",
  })
  List<MandateResponse> listMandatesForACustomer(@Param("customerId") String customerId);

  /**
   * Mandates - Customer Mandates List
   * Similar to <code>listMandatesForACustomer</code> but it also returns the http response headers .
   * Lists all the mandates for a particular customer id.
   * @param customerId The unique identifier for the customer (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /customers/{customerId}/mandates")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<MandateResponse>> listMandatesForACustomerWithHttpInfo(@Param("customerId") String customerId);



  /**
   * Mandates - Retrieve Mandate
   * Retrieves a mandate created using the Payments/Create API
   * @param mandateId The identifier for mandate (required)
   * @return MandateResponse
   */
  @RequestLine("GET /mandates/{mandateId}")
  @Headers({
    "Accept: application/json",
  })
  MandateResponse retrieveAMandate(@Param("mandateId") String mandateId);

  /**
   * Mandates - Retrieve Mandate
   * Similar to <code>retrieveAMandate</code> but it also returns the http response headers .
   * Retrieves a mandate created using the Payments/Create API
   * @param mandateId The identifier for mandate (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /mandates/{mandateId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MandateResponse> retrieveAMandateWithHttpInfo(@Param("mandateId") String mandateId);



  /**
   * Mandates - Revoke Mandate
   * Revokes a mandate created using the Payments/Create API
   * @param mandateId The identifier for a mandate (required)
   * @return MandateRevokedResponse
   */
  @RequestLine("POST /mandates/revoke/{mandateId}")
  @Headers({
    "Accept: application/json",
  })
  MandateRevokedResponse revokeAMandate(@Param("mandateId") String mandateId);

  /**
   * Mandates - Revoke Mandate
   * Similar to <code>revokeAMandate</code> but it also returns the http response headers .
   * Revokes a mandate created using the Payments/Create API
   * @param mandateId The identifier for a mandate (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /mandates/revoke/{mandateId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MandateRevokedResponse> revokeAMandateWithHttpInfo(@Param("mandateId") String mandateId);


}

package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.GsmCreateRequest;
import com.hyperswitch.client.model.GsmDeleteRequest;
import com.hyperswitch.client.model.GsmDeleteResponse;
import com.hyperswitch.client.model.GsmResponse;
import com.hyperswitch.client.model.GsmRetrieveRequest;
import com.hyperswitch.client.model.GsmUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface GsmApi extends ApiClient.Api {


  /**
   * Gsm - Create
   * Creates a GSM (Global Status Mapping) Rule. A GSM rule is used to map a connector&#39;s error message/error code combination during a particular payments flow/sub-flow to Hyperswitch&#39;s unified status/error code/error message combination. It is also used to decide the next action in the flow - retry/requeue/do_default
   * @param gsmCreateRequest  (required)
   * @return GsmResponse
   */
  @RequestLine("POST /gsm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GsmResponse createGsmRule(GsmCreateRequest gsmCreateRequest);

  /**
   * Gsm - Create
   * Similar to <code>createGsmRule</code> but it also returns the http response headers .
   * Creates a GSM (Global Status Mapping) Rule. A GSM rule is used to map a connector&#39;s error message/error code combination during a particular payments flow/sub-flow to Hyperswitch&#39;s unified status/error code/error message combination. It is also used to decide the next action in the flow - retry/requeue/do_default
   * @param gsmCreateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /gsm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GsmResponse> createGsmRuleWithHttpInfo(GsmCreateRequest gsmCreateRequest);



  /**
   * Gsm - Delete
   * Deletes a Gsm Rule
   * @param gsmDeleteRequest  (required)
   * @return GsmDeleteResponse
   */
  @RequestLine("POST /gsm/delete")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GsmDeleteResponse deleteGsmRule(GsmDeleteRequest gsmDeleteRequest);

  /**
   * Gsm - Delete
   * Similar to <code>deleteGsmRule</code> but it also returns the http response headers .
   * Deletes a Gsm Rule
   * @param gsmDeleteRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /gsm/delete")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GsmDeleteResponse> deleteGsmRuleWithHttpInfo(GsmDeleteRequest gsmDeleteRequest);



  /**
   * Gsm - Get
   * Retrieves a Gsm Rule
   * @param gsmRetrieveRequest  (required)
   * @return GsmResponse
   */
  @RequestLine("POST /gsm/get")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GsmResponse retrieveGsmRule(GsmRetrieveRequest gsmRetrieveRequest);

  /**
   * Gsm - Get
   * Similar to <code>retrieveGsmRule</code> but it also returns the http response headers .
   * Retrieves a Gsm Rule
   * @param gsmRetrieveRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /gsm/get")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GsmResponse> retrieveGsmRuleWithHttpInfo(GsmRetrieveRequest gsmRetrieveRequest);



  /**
   * Gsm - Update
   * Updates a Gsm Rule
   * @param gsmUpdateRequest  (required)
   * @return GsmResponse
   */
  @RequestLine("POST /gsm/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GsmResponse updateGsmRule(GsmUpdateRequest gsmUpdateRequest);

  /**
   * Gsm - Update
   * Similar to <code>updateGsmRule</code> but it also returns the http response headers .
   * Updates a Gsm Rule
   * @param gsmUpdateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /gsm/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GsmResponse> updateGsmRuleWithHttpInfo(GsmUpdateRequest gsmUpdateRequest);


}

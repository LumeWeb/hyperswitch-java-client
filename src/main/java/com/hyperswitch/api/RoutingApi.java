package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.model.ApiResponse;

import com.hyperswitch.model.MerchantRoutingAlgorithm;
import com.hyperswitch.model.RoutingConfigRequest;
import com.hyperswitch.model.RoutingDictionaryRecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface RoutingApi extends ApiClient.Api {


  /**
   * Routing - Create
   * Create a routing algorithm
   * @param routingConfigRequest  (required)
   * @return RoutingDictionaryRecord
   */
  @RequestLine("POST /v2/routing_algorithm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoutingDictionaryRecord createARoutingAlgprithm(RoutingConfigRequest routingConfigRequest);

  /**
   * Routing - Create
   * Similar to <code>createARoutingAlgprithm</code> but it also returns the http response headers .
   * Create a routing algorithm
   * @param routingConfigRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v2/routing_algorithm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoutingDictionaryRecord> createARoutingAlgprithmWithHttpInfo(RoutingConfigRequest routingConfigRequest);



  /**
   * Routing - Retrieve
   * Retrieve a routing algorithm with its algorithm id
   * @param id The unique identifier for a routing algorithm (required)
   * @return MerchantRoutingAlgorithm
   */
  @RequestLine("GET /v2/routing_algorithm/{id}")
  @Headers({
    "Accept: application/json",
  })
  MerchantRoutingAlgorithm retrieveARoutingAlgorithmWithItsAlgorithmId(@Param("id") String id);

  /**
   * Routing - Retrieve
   * Similar to <code>retrieveARoutingAlgorithmWithItsAlgorithmId</code> but it also returns the http response headers .
   * Retrieve a routing algorithm with its algorithm id
   * @param id The unique identifier for a routing algorithm (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/routing_algorithm/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MerchantRoutingAlgorithm> retrieveARoutingAlgorithmWithItsAlgorithmIdWithHttpInfo(@Param("id") String id);


}

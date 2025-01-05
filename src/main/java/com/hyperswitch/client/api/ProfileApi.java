package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.LinkedRoutingConfigRetrieveResponse;
import com.hyperswitch.client.model.ProfileCreate;
import com.hyperswitch.client.model.ProfileResponse;
import com.hyperswitch.client.model.RoutableConnectorChoice;
import com.hyperswitch.client.model.RoutingAlgorithmId;
import com.hyperswitch.client.model.RoutingDictionaryRecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface ProfileApi extends ApiClient.Api {


  /**
   * Profile - Activate routing algorithm
   * Activates a routing algorithm under a profile
   * @param id The unique identifier for the profile (required)
   * @param routingAlgorithmId  (required)
   * @return RoutingDictionaryRecord
   */
  @RequestLine("PATCH /v2/profiles/{id}/activate_routing_algorithm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoutingDictionaryRecord activatesARoutingAlgorithmUnderAProfile(@Param("id") String id, RoutingAlgorithmId routingAlgorithmId);

  /**
   * Profile - Activate routing algorithm
   * Similar to <code>activatesARoutingAlgorithmUnderAProfile</code> but it also returns the http response headers .
   * Activates a routing algorithm under a profile
   * @param id The unique identifier for the profile (required)
   * @param routingAlgorithmId  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /v2/profiles/{id}/activate_routing_algorithm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoutingDictionaryRecord> activatesARoutingAlgorithmUnderAProfileWithHttpInfo(@Param("id") String id, RoutingAlgorithmId routingAlgorithmId);



  /**
   * Profile - Create
   * Creates a new *profile* for a merchant
   * @param xMerchantId Merchant ID of the profile. (required)
   * @param profileCreate  (required)
   * @return ProfileResponse
   */
  @RequestLine("POST /v2/profiles")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "X-Merchant-Id: {xMerchantId}"
  })
  ProfileResponse createAProfile(@Param("xMerchantId") String xMerchantId, ProfileCreate profileCreate);

  /**
   * Profile - Create
   * Similar to <code>createAProfile</code> but it also returns the http response headers .
   * Creates a new *profile* for a merchant
   * @param xMerchantId Merchant ID of the profile. (required)
   * @param profileCreate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v2/profiles")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "X-Merchant-Id: {xMerchantId}"
  })
  ApiResponse<ProfileResponse> createAProfileWithHttpInfo(@Param("xMerchantId") String xMerchantId, ProfileCreate profileCreate);



  /**
   * Profile - Deactivate routing algorithm
   * Deactivates a routing algorithm under a profile
   * @param id The unique identifier for the profile (required)
   * @return RoutingDictionaryRecord
   */
  @RequestLine("PATCH /v2/profiles/{id}/deactivate_routing_algorithm")
  @Headers({
    "Accept: application/json",
  })
  RoutingDictionaryRecord deactivatesARoutingAlgorithmUnderAProfile(@Param("id") String id);

  /**
   * Profile - Deactivate routing algorithm
   * Similar to <code>deactivatesARoutingAlgorithmUnderAProfile</code> but it also returns the http response headers .
   * Deactivates a routing algorithm under a profile
   * @param id The unique identifier for the profile (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /v2/profiles/{id}/deactivate_routing_algorithm")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<RoutingDictionaryRecord> deactivatesARoutingAlgorithmUnderAProfileWithHttpInfo(@Param("id") String id);



  /**
   * Profile - Retrieve
   * Retrieve existing *profile*
   * @param id The unique identifier for the profile (required)
   * @param xMerchantId Merchant ID of the profile. (required)
   * @return ProfileResponse
   */
  @RequestLine("GET /v2/profiles/{id}")
  @Headers({
    "Accept: application/json",
    "X-Merchant-Id: {xMerchantId}"
  })
  ProfileResponse retrieveAProfile(@Param("id") String id, @Param("xMerchantId") String xMerchantId);

  /**
   * Profile - Retrieve
   * Similar to <code>retrieveAProfile</code> but it also returns the http response headers .
   * Retrieve existing *profile*
   * @param id The unique identifier for the profile (required)
   * @param xMerchantId Merchant ID of the profile. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/profiles/{id}")
  @Headers({
    "Accept: application/json",
    "X-Merchant-Id: {xMerchantId}"
  })
  ApiResponse<ProfileResponse> retrieveAProfileWithHttpInfo(@Param("id") String id, @Param("xMerchantId") String xMerchantId);



  /**
   * Profile - Retrieve Active Routing Algorithm
   * Retrieve active routing algorithm under the profile
   * @param id The unique identifier for the profile (required)
   * @param limit The number of records of the algorithms to be returned (optional)
   * @param offset The record offset of the algorithm from which to start gathering the results (optional)
   * @return LinkedRoutingConfigRetrieveResponse
   */
  @RequestLine("GET /v2/profiles/{id}/routing_algorithm?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  LinkedRoutingConfigRetrieveResponse retrieveTheActiveRoutingAlgorithmUnderTheProfile(@Param("id") String id, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * Profile - Retrieve Active Routing Algorithm
   * Similar to <code>retrieveTheActiveRoutingAlgorithmUnderTheProfile</code> but it also returns the http response headers .
   * Retrieve active routing algorithm under the profile
   * @param id The unique identifier for the profile (required)
   * @param limit The number of records of the algorithms to be returned (optional)
   * @param offset The record offset of the algorithm from which to start gathering the results (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/profiles/{id}/routing_algorithm?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<LinkedRoutingConfigRetrieveResponse> retrieveTheActiveRoutingAlgorithmUnderTheProfileWithHttpInfo(@Param("id") String id, @Param("limit") Integer limit, @Param("offset") Integer offset);


  /**
   * Profile - Retrieve Active Routing Algorithm
   * Retrieve active routing algorithm under the profile
   * Note, this is equivalent to the other <code>retrieveTheActiveRoutingAlgorithmUnderTheProfile</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveTheActiveRoutingAlgorithmUnderTheProfileQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id The unique identifier for the profile (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The number of records of the algorithms to be returned (optional)</li>
   *   <li>offset - The record offset of the algorithm from which to start gathering the results (optional)</li>
   *   </ul>
   * @return LinkedRoutingConfigRetrieveResponse
   */
  @RequestLine("GET /v2/profiles/{id}/routing_algorithm?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  LinkedRoutingConfigRetrieveResponse retrieveTheActiveRoutingAlgorithmUnderTheProfile(@Param("id") String id, @QueryMap(encoded=true) RetrieveTheActiveRoutingAlgorithmUnderTheProfileQueryParams queryParams);

  /**
  * Profile - Retrieve Active Routing Algorithm
  * Retrieve active routing algorithm under the profile
  * Note, this is equivalent to the other <code>retrieveTheActiveRoutingAlgorithmUnderTheProfile</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id The unique identifier for the profile (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limit - The number of records of the algorithms to be returned (optional)</li>
          *   <li>offset - The record offset of the algorithm from which to start gathering the results (optional)</li>
      *   </ul>
          * @return LinkedRoutingConfigRetrieveResponse
      */
      @RequestLine("GET /v2/profiles/{id}/routing_algorithm?limit={limit}&offset={offset}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<LinkedRoutingConfigRetrieveResponse> retrieveTheActiveRoutingAlgorithmUnderTheProfileWithHttpInfo(@Param("id") String id, @QueryMap(encoded=true) RetrieveTheActiveRoutingAlgorithmUnderTheProfileQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>retrieveTheActiveRoutingAlgorithmUnderTheProfile</code> method in a fluent style.
   */
  public static class RetrieveTheActiveRoutingAlgorithmUnderTheProfileQueryParams extends HashMap<String, Object> {
    public RetrieveTheActiveRoutingAlgorithmUnderTheProfileQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveTheActiveRoutingAlgorithmUnderTheProfileQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Profile - Retrieve Default Fallback Routing Algorithm
   * Retrieve the default fallback routing algorithm for the profile
   * @param id The unique identifier for the profile (required)
   * @return List&lt;RoutableConnectorChoice&gt;
   */
  @RequestLine("GET /v2/profiles/{id}/fallback_routing")
  @Headers({
    "Accept: application/json",
  })
  List<RoutableConnectorChoice> retrieveTheDefaultFallbackRoutingAlgorithmForTheProfile(@Param("id") String id);

  /**
   * Profile - Retrieve Default Fallback Routing Algorithm
   * Similar to <code>retrieveTheDefaultFallbackRoutingAlgorithmForTheProfile</code> but it also returns the http response headers .
   * Retrieve the default fallback routing algorithm for the profile
   * @param id The unique identifier for the profile (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/profiles/{id}/fallback_routing")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<RoutableConnectorChoice>> retrieveTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo(@Param("id") String id);



  /**
   * Profile - Update
   * Update the *profile*
   * @param id The unique identifier for the profile (required)
   * @param xMerchantId Merchant ID of the profile. (required)
   * @param profileCreate  (required)
   * @return ProfileResponse
   */
  @RequestLine("PUT /v2/profiles/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "X-Merchant-Id: {xMerchantId}"
  })
  ProfileResponse updateAProfile(@Param("id") String id, @Param("xMerchantId") String xMerchantId, ProfileCreate profileCreate);

  /**
   * Profile - Update
   * Similar to <code>updateAProfile</code> but it also returns the http response headers .
   * Update the *profile*
   * @param id The unique identifier for the profile (required)
   * @param xMerchantId Merchant ID of the profile. (required)
   * @param profileCreate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v2/profiles/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "X-Merchant-Id: {xMerchantId}"
  })
  ApiResponse<ProfileResponse> updateAProfileWithHttpInfo(@Param("id") String id, @Param("xMerchantId") String xMerchantId, ProfileCreate profileCreate);



  /**
   * Profile - Update Default Fallback Routing Algorithm
   * Update the default fallback routing algorithm for the profile
   * @param id The unique identifier for the profile (required)
   * @param routableConnectorChoice  (required)
   * @return List&lt;RoutableConnectorChoice&gt;
   */
  @RequestLine("PATCH /v2/profiles/{id}/fallback_routing")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<RoutableConnectorChoice> updateTheDefaultFallbackRoutingAlgorithmForTheProfile(@Param("id") String id, List<RoutableConnectorChoice> routableConnectorChoice);

  /**
   * Profile - Update Default Fallback Routing Algorithm
   * Similar to <code>updateTheDefaultFallbackRoutingAlgorithmForTheProfile</code> but it also returns the http response headers .
   * Update the default fallback routing algorithm for the profile
   * @param id The unique identifier for the profile (required)
   * @param routableConnectorChoice  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PATCH /v2/profiles/{id}/fallback_routing")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<List<RoutableConnectorChoice>> updateTheDefaultFallbackRoutingAlgorithmForTheProfileWithHttpInfo(@Param("id") String id, List<RoutableConnectorChoice> routableConnectorChoice);


}

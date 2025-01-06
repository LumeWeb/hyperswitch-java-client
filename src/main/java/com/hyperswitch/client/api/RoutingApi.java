package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.DynamicRoutingFeatures;
import com.hyperswitch.client.model.LinkedRoutingConfigRetrieveResponse;
import com.hyperswitch.client.model.MerchantRoutingAlgorithm;
import com.hyperswitch.client.model.ProfileDefaultRoutingConfig;
import com.hyperswitch.client.model.RoutableConnectorChoice;
import com.hyperswitch.client.model.RoutingConfigRequest;
import com.hyperswitch.client.model.RoutingDictionaryRecord;
import com.hyperswitch.client.model.RoutingKind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface RoutingApi extends ApiClient.Api {


  /**
   * Routing - Activate config
   * Activate a routing config
   * @param routingAlgorithmId The unique identifier for a config (required)
   * @return RoutingDictionaryRecord
   */
  @RequestLine("POST /routing/{routingAlgorithmId}/activate")
  @Headers({
    "Accept: application/json",
  })
  RoutingDictionaryRecord activateARoutingConfig(@Param("routingAlgorithmId") String routingAlgorithmId);

  /**
   * Routing - Activate config
   * Similar to <code>activateARoutingConfig</code> but it also returns the http response headers .
   * Activate a routing config
   * @param routingAlgorithmId The unique identifier for a config (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /routing/{routingAlgorithmId}/activate")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<RoutingDictionaryRecord> activateARoutingConfigWithHttpInfo(@Param("routingAlgorithmId") String routingAlgorithmId);



  /**
   * Routing - Create
   * Create a routing config
   * @param routingConfigRequest  (required)
   * @return RoutingDictionaryRecord
   */
  @RequestLine("POST /routing")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoutingDictionaryRecord createARoutingConfig(RoutingConfigRequest routingConfigRequest);

  /**
   * Routing - Create
   * Similar to <code>createARoutingConfig</code> but it also returns the http response headers .
   * Create a routing config
   * @param routingConfigRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /routing")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoutingDictionaryRecord> createARoutingConfigWithHttpInfo(RoutingConfigRequest routingConfigRequest);



  /**
   * Routing - Deactivate
   * Deactivates a routing config
   * @param routingConfigRequest  (required)
   * @return RoutingDictionaryRecord
   */
  @RequestLine("POST /routing/deactivate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoutingDictionaryRecord deactivateARoutingConfig(RoutingConfigRequest routingConfigRequest);

  /**
   * Routing - Deactivate
   * Similar to <code>deactivateARoutingConfig</code> but it also returns the http response headers .
   * Deactivates a routing config
   * @param routingConfigRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /routing/deactivate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoutingDictionaryRecord> deactivateARoutingConfigWithHttpInfo(RoutingConfigRequest routingConfigRequest);



  /**
   * Routing - List
   * List all routing configs
   * @param limit The number of records to be returned (optional)
   * @param offset The record offset from which to start gathering of results (optional)
   * @param profileId The unique identifier for a merchant profile (optional)
   * @return RoutingKind
   */
  @RequestLine("GET /routing?limit={limit}&offset={offset}&profile_id={profileId}")
  @Headers({
    "Accept: application/json",
  })
  RoutingKind listRoutingConfigs(@Param("limit") Integer limit, @Param("offset") Integer offset, @Param("profileId") String profileId);

  /**
   * Routing - List
   * Similar to <code>listRoutingConfigs</code> but it also returns the http response headers .
   * List all routing configs
   * @param limit The number of records to be returned (optional)
   * @param offset The record offset from which to start gathering of results (optional)
   * @param profileId The unique identifier for a merchant profile (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /routing?limit={limit}&offset={offset}&profile_id={profileId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<RoutingKind> listRoutingConfigsWithHttpInfo(@Param("limit") Integer limit, @Param("offset") Integer offset, @Param("profileId") String profileId);


  /**
   * Routing - List
   * List all routing configs
   * Note, this is equivalent to the other <code>listRoutingConfigs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListRoutingConfigsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - The number of records to be returned (optional)</li>
   *   <li>offset - The record offset from which to start gathering of results (optional)</li>
   *   <li>profileId - The unique identifier for a merchant profile (optional)</li>
   *   </ul>
   * @return RoutingKind
   */
  @RequestLine("GET /routing?limit={limit}&offset={offset}&profile_id={profileId}")
  @Headers({
  "Accept: application/json",
  })
  RoutingKind listRoutingConfigs(@QueryMap(encoded=true) ListRoutingConfigsQueryParams queryParams);

  /**
  * Routing - List
  * List all routing configs
  * Note, this is equivalent to the other <code>listRoutingConfigs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limit - The number of records to be returned (optional)</li>
          *   <li>offset - The record offset from which to start gathering of results (optional)</li>
          *   <li>profileId - The unique identifier for a merchant profile (optional)</li>
      *   </ul>
          * @return RoutingKind
      */
      @RequestLine("GET /routing?limit={limit}&offset={offset}&profile_id={profileId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<RoutingKind> listRoutingConfigsWithHttpInfo(@QueryMap(encoded=true) ListRoutingConfigsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listRoutingConfigs</code> method in a fluent style.
   */
  public static class ListRoutingConfigsQueryParams extends HashMap<String, Object> {
    public ListRoutingConfigsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListRoutingConfigsQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
    public ListRoutingConfigsQueryParams profileId(final String value) {
      put("profile_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Routing - Retrieve
   * Retrieve a routing algorithm
   * @param routingAlgorithmId The unique identifier for a config (required)
   * @return MerchantRoutingAlgorithm
   */
  @RequestLine("GET /routing/{routingAlgorithmId}")
  @Headers({
    "Accept: application/json",
  })
  MerchantRoutingAlgorithm retrieveARoutingConfig(@Param("routingAlgorithmId") String routingAlgorithmId);

  /**
   * Routing - Retrieve
   * Similar to <code>retrieveARoutingConfig</code> but it also returns the http response headers .
   * Retrieve a routing algorithm
   * @param routingAlgorithmId The unique identifier for a config (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /routing/{routingAlgorithmId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MerchantRoutingAlgorithm> retrieveARoutingConfigWithHttpInfo(@Param("routingAlgorithmId") String routingAlgorithmId);



  /**
   * Routing - Retrieve Config
   * Retrieve active config
   * @param profileId The unique identifier for a merchant profile (optional)
   * @return LinkedRoutingConfigRetrieveResponse
   */
  @RequestLine("GET /routing/active?profile_id={profileId}")
  @Headers({
    "Accept: application/json",
  })
  LinkedRoutingConfigRetrieveResponse retrieveActiveConfig(@Param("profileId") String profileId);

  /**
   * Routing - Retrieve Config
   * Similar to <code>retrieveActiveConfig</code> but it also returns the http response headers .
   * Retrieve active config
   * @param profileId The unique identifier for a merchant profile (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /routing/active?profile_id={profileId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<LinkedRoutingConfigRetrieveResponse> retrieveActiveConfigWithHttpInfo(@Param("profileId") String profileId);


  /**
   * Routing - Retrieve Config
   * Retrieve active config
   * Note, this is equivalent to the other <code>retrieveActiveConfig</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveActiveConfigQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>profileId - The unique identifier for a merchant profile (optional)</li>
   *   </ul>
   * @return LinkedRoutingConfigRetrieveResponse
   */
  @RequestLine("GET /routing/active?profile_id={profileId}")
  @Headers({
  "Accept: application/json",
  })
  LinkedRoutingConfigRetrieveResponse retrieveActiveConfig(@QueryMap(encoded=true) RetrieveActiveConfigQueryParams queryParams);

  /**
  * Routing - Retrieve Config
  * Retrieve active config
  * Note, this is equivalent to the other <code>retrieveActiveConfig</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>profileId - The unique identifier for a merchant profile (optional)</li>
      *   </ul>
          * @return LinkedRoutingConfigRetrieveResponse
      */
      @RequestLine("GET /routing/active?profile_id={profileId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<LinkedRoutingConfigRetrieveResponse> retrieveActiveConfigWithHttpInfo(@QueryMap(encoded=true) RetrieveActiveConfigQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>retrieveActiveConfig</code> method in a fluent style.
   */
  public static class RetrieveActiveConfigQueryParams extends HashMap<String, Object> {
    public RetrieveActiveConfigQueryParams profileId(final String value) {
      put("profile_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Routing - Retrieve Default For Profile
   * Retrieve default config for profiles
   * @return ProfileDefaultRoutingConfig
   */
  @RequestLine("GET /routing/default/profile")
  @Headers({
    "Accept: application/json",
  })
  ProfileDefaultRoutingConfig retrieveDefaultConfigsForAllProfiles();

  /**
   * Routing - Retrieve Default For Profile
   * Similar to <code>retrieveDefaultConfigsForAllProfiles</code> but it also returns the http response headers .
   * Retrieve default config for profiles
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /routing/default/profile")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ProfileDefaultRoutingConfig> retrieveDefaultConfigsForAllProfilesWithHttpInfo();



  /**
   * Routing - Retrieve Default Config
   * Retrieve default fallback config
   * @return List&lt;RoutableConnectorChoice&gt;
   */
  @RequestLine("GET /routing/default")
  @Headers({
    "Accept: application/json",
  })
  List<RoutableConnectorChoice> retrieveDefaultFallbackConfig();

  /**
   * Routing - Retrieve Default Config
   * Similar to <code>retrieveDefaultFallbackConfig</code> but it also returns the http response headers .
   * Retrieve default fallback config
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /routing/default")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<RoutableConnectorChoice>> retrieveDefaultFallbackConfigWithHttpInfo();



  /**
   * Routing - Toggle success based dynamic routing for profile
   * Create a success based dynamic routing algorithm
   * @param accountId Merchant id (required)
   * @param profileId Profile id under which Dynamic routing needs to be toggled (required)
   * @param enable Feature to enable for success based routing (required)
   * @return RoutingDictionaryRecord
   */
  @RequestLine("POST /account/:account_id/business_profile/:profile_id/dynamic_routing/success_based/toggle?enable={enable}")
  @Headers({
    "Accept: application/json",
  })
  RoutingDictionaryRecord toggleSuccessBasedDynamicRoutingAlgorithm(@Param("accountId") String accountId, @Param("profileId") String profileId, @Param("enable") DynamicRoutingFeatures enable);

  /**
   * Routing - Toggle success based dynamic routing for profile
   * Similar to <code>toggleSuccessBasedDynamicRoutingAlgorithm</code> but it also returns the http response headers .
   * Create a success based dynamic routing algorithm
   * @param accountId Merchant id (required)
   * @param profileId Profile id under which Dynamic routing needs to be toggled (required)
   * @param enable Feature to enable for success based routing (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /account/:account_id/business_profile/:profile_id/dynamic_routing/success_based/toggle?enable={enable}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<RoutingDictionaryRecord> toggleSuccessBasedDynamicRoutingAlgorithmWithHttpInfo(@Param("accountId") String accountId, @Param("profileId") String profileId, @Param("enable") DynamicRoutingFeatures enable);


  /**
   * Routing - Toggle success based dynamic routing for profile
   * Create a success based dynamic routing algorithm
   * Note, this is equivalent to the other <code>toggleSuccessBasedDynamicRoutingAlgorithm</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ToggleSuccessBasedDynamicRoutingAlgorithmQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId Merchant id (required)
   * @param profileId Profile id under which Dynamic routing needs to be toggled (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>enable - Feature to enable for success based routing (required)</li>
   *   </ul>
   * @return RoutingDictionaryRecord
   */
  @RequestLine("POST /account/:account_id/business_profile/:profile_id/dynamic_routing/success_based/toggle?enable={enable}")
  @Headers({
  "Accept: application/json",
  })
  RoutingDictionaryRecord toggleSuccessBasedDynamicRoutingAlgorithm(@Param("accountId") String accountId, @Param("profileId") String profileId, @QueryMap(encoded=true) ToggleSuccessBasedDynamicRoutingAlgorithmQueryParams queryParams);

  /**
  * Routing - Toggle success based dynamic routing for profile
  * Create a success based dynamic routing algorithm
  * Note, this is equivalent to the other <code>toggleSuccessBasedDynamicRoutingAlgorithm</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param accountId Merchant id (required)
              * @param profileId Profile id under which Dynamic routing needs to be toggled (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>enable - Feature to enable for success based routing (required)</li>
      *   </ul>
          * @return RoutingDictionaryRecord
      */
      @RequestLine("POST /account/:account_id/business_profile/:profile_id/dynamic_routing/success_based/toggle?enable={enable}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<RoutingDictionaryRecord> toggleSuccessBasedDynamicRoutingAlgorithmWithHttpInfo(@Param("accountId") String accountId, @Param("profileId") String profileId, @QueryMap(encoded=true) ToggleSuccessBasedDynamicRoutingAlgorithmQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>toggleSuccessBasedDynamicRoutingAlgorithm</code> method in a fluent style.
   */
  public static class ToggleSuccessBasedDynamicRoutingAlgorithmQueryParams extends HashMap<String, Object> {
    public ToggleSuccessBasedDynamicRoutingAlgorithmQueryParams enable(final DynamicRoutingFeatures value) {
      put("enable", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Routing - Update Default For Profile
   * Update default config for profiles
   * @param profileId The unique identifier for a profile (required)
   * @param routableConnectorChoice  (required)
   * @return ProfileDefaultRoutingConfig
   */
  @RequestLine("POST /routing/default/profile/{profileId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ProfileDefaultRoutingConfig updateDefaultConfigsForAllProfiles(@Param("profileId") String profileId, List<RoutableConnectorChoice> routableConnectorChoice);

  /**
   * Routing - Update Default For Profile
   * Similar to <code>updateDefaultConfigsForAllProfiles</code> but it also returns the http response headers .
   * Update default config for profiles
   * @param profileId The unique identifier for a profile (required)
   * @param routableConnectorChoice  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /routing/default/profile/{profileId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ProfileDefaultRoutingConfig> updateDefaultConfigsForAllProfilesWithHttpInfo(@Param("profileId") String profileId, List<RoutableConnectorChoice> routableConnectorChoice);



  /**
   * Routing - Update Default Config
   * Update default fallback config
   * @param routableConnectorChoice  (required)
   * @return List&lt;RoutableConnectorChoice&gt;
   */
  @RequestLine("POST /routing/default")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<RoutableConnectorChoice> updateDefaultFallbackConfig(List<RoutableConnectorChoice> routableConnectorChoice);

  /**
   * Routing - Update Default Config
   * Similar to <code>updateDefaultFallbackConfig</code> but it also returns the http response headers .
   * Update default fallback config
   * @param routableConnectorChoice  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /routing/default")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<List<RoutableConnectorChoice>> updateDefaultFallbackConfigWithHttpInfo(List<RoutableConnectorChoice> routableConnectorChoice);


}

package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.ProfileCreate;
import com.hyperswitch.client.model.ProfileResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface ProfileApi extends ApiClient.Api {


  /**
   * Profile - Create
   * Creates a new *profile* for a merchant
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileCreate  (required)
   * @return ProfileResponse
   */
  @RequestLine("POST /account/{accountId}/business_profile")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ProfileResponse createAProfile(@Param("accountId") String accountId, ProfileCreate profileCreate);

  /**
   * Profile - Create
   * Similar to <code>createAProfile</code> but it also returns the http response headers .
   * Creates a new *profile* for a merchant
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileCreate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /account/{accountId}/business_profile")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ProfileResponse> createAProfileWithHttpInfo(@Param("accountId") String accountId, ProfileCreate profileCreate);



  /**
   * Profile - Delete
   * Delete the *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @return Boolean
   */
  @RequestLine("DELETE /account/{accountId}/business_profile/{profileId}")
  @Headers({
    "Accept: text/plain",
  })
  Boolean deleteTheProfile(@Param("accountId") String accountId, @Param("profileId") String profileId);

  /**
   * Profile - Delete
   * Similar to <code>deleteTheProfile</code> but it also returns the http response headers .
   * Delete the *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /account/{accountId}/business_profile/{profileId}")
  @Headers({
    "Accept: text/plain",
  })
  ApiResponse<Boolean> deleteTheProfileWithHttpInfo(@Param("accountId") String accountId, @Param("profileId") String profileId);



  /**
   * Profile - List
   * Lists all the *profiles* under a merchant
   * @param accountId Merchant Identifier (required)
   * @return List&lt;ProfileResponse&gt;
   */
  @RequestLine("GET /account/{accountId}/business_profile")
  @Headers({
    "Accept: application/json",
  })
  List<ProfileResponse> listProfiles(@Param("accountId") String accountId);

  /**
   * Profile - List
   * Similar to <code>listProfiles</code> but it also returns the http response headers .
   * Lists all the *profiles* under a merchant
   * @param accountId Merchant Identifier (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /account/{accountId}/business_profile")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<ProfileResponse>> listProfilesWithHttpInfo(@Param("accountId") String accountId);



  /**
   * Profile - Retrieve
   * Retrieve existing *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @return ProfileResponse
   */
  @RequestLine("GET /account/{accountId}/business_profile/{profileId}")
  @Headers({
    "Accept: application/json",
  })
  ProfileResponse retrieveAProfile(@Param("accountId") String accountId, @Param("profileId") String profileId);

  /**
   * Profile - Retrieve
   * Similar to <code>retrieveAProfile</code> but it also returns the http response headers .
   * Retrieve existing *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /account/{accountId}/business_profile/{profileId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ProfileResponse> retrieveAProfileWithHttpInfo(@Param("accountId") String accountId, @Param("profileId") String profileId);



  /**
   * Profile - Update
   * Update the *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @param profileCreate  (required)
   * @return ProfileResponse
   */
  @RequestLine("POST /account/{accountId}/business_profile/{profileId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ProfileResponse updateAProfile(@Param("accountId") String accountId, @Param("profileId") String profileId, ProfileCreate profileCreate);

  /**
   * Profile - Update
   * Similar to <code>updateAProfile</code> but it also returns the http response headers .
   * Update the *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @param profileCreate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /account/{accountId}/business_profile/{profileId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ProfileResponse> updateAProfileWithHttpInfo(@Param("accountId") String accountId, @Param("profileId") String profileId, ProfileCreate profileCreate);


}

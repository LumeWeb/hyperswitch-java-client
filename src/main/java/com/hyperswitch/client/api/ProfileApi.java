/*
 * Hyperswitch - API Documentation
 *  ## Get started  Hyperswitch provides a collection of APIs that enable you to process and manage payments. Our APIs accept and return JSON in the HTTP body, and return standard HTTP response codes.  You can consume the APIs directly using your favorite HTTP/REST library.  We have a testing environment referred to \"sandbox\", which you can setup to test API calls without affecting production data. Currently, our sandbox environment is live while our production environment is under development and will be available soon. You can sign up on our Dashboard to get API keys to access Hyperswitch API.  ### Environment  Use the following base URLs when making requests to the APIs:  | Environment   |  Base URL                          | |---------------|------------------------------------| | Sandbox       | <https://sandbox.hyperswitch.io>   | | Production    | <https://api.hyperswitch.io>       |  ## Authentication  When you sign up on our [dashboard](https://app.hyperswitch.io) and create a merchant account, you are given a secret key (also referred as api-key) and a publishable key. You may authenticate all API requests with Hyperswitch server by providing the appropriate key in the request Authorization header.  | Key             |  Description                                                                                  | |-----------------|-----------------------------------------------------------------------------------------------| | api-key         | Private key. Used to authenticate all API requests from your merchant server                  | | publishable key | Unique identifier for your account. Used to authenticate API requests from your app's client  |  Never share your secret api keys. Keep them guarded and secure. 
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: hyperswitch@juspay.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.hyperswitch.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.model.*;
import com.hyperswitch.client.Pair;

import com.hyperswitch.client.model.ProfileCreate;
import com.hyperswitch.client.model.ProfileResponse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProfileApi {


  private ApiClient apiClient;

  public ProfileApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProfileApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Profile - Create
   * Creates a new *profile* for a merchant
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileCreate  (required)
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   */
  public ProfileResponse createAProfile(String accountId, ProfileCreate profileCreate) throws ApiException {
    return this.createAProfile(accountId, profileCreate, Collections.emptyMap());
  }


  /**
   * Profile - Create
   * Creates a new *profile* for a merchant
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileCreate  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   */
  public ProfileResponse createAProfile(String accountId, ProfileCreate profileCreate, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = profileCreate;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createAProfile");
    }
    
    // verify the required parameter 'profileCreate' is set
    if (profileCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'profileCreate' when calling createAProfile");
    }
    
    // create path and map variables
    String localVarPath = "/account/{account_id}/business_profile"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "admin_api_key" };

    TypeReference<ProfileResponse> localVarReturnType = new TypeReference<ProfileResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Profile - Delete
   * Delete the *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean deleteTheProfile(String accountId, String profileId) throws ApiException {
    return this.deleteTheProfile(accountId, profileId, Collections.emptyMap());
  }


  /**
   * Profile - Delete
   * Delete the *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return Boolean
   * @throws ApiException if fails to make API call
   */
  public Boolean deleteTheProfile(String accountId, String profileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTheProfile");
    }
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling deleteTheProfile");
    }
    
    // create path and map variables
    String localVarPath = "/account/{account_id}/business_profile/{profile_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "profile_id" + "\\}", apiClient.escapeString(profileId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    TypeReference<Boolean> localVarReturnType = new TypeReference<Boolean>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Profile - List
   * Lists all the *profiles* under a merchant
   * @param accountId Merchant Identifier (required)
   * @return List&lt;ProfileResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ProfileResponse> listProfiles(String accountId) throws ApiException {
    return this.listProfiles(accountId, Collections.emptyMap());
  }


  /**
   * Profile - List
   * Lists all the *profiles* under a merchant
   * @param accountId Merchant Identifier (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;ProfileResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ProfileResponse> listProfiles(String accountId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listProfiles");
    }
    
    // create path and map variables
    String localVarPath = "/account/{account_id}/business_profile"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    TypeReference<List<ProfileResponse>> localVarReturnType = new TypeReference<List<ProfileResponse>>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Profile - Retrieve
   * Retrieve existing *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   */
  public ProfileResponse retrieveAProfile(String accountId, String profileId) throws ApiException {
    return this.retrieveAProfile(accountId, profileId, Collections.emptyMap());
  }


  /**
   * Profile - Retrieve
   * Retrieve existing *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   */
  public ProfileResponse retrieveAProfile(String accountId, String profileId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling retrieveAProfile");
    }
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling retrieveAProfile");
    }
    
    // create path and map variables
    String localVarPath = "/account/{account_id}/business_profile/{profile_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "profile_id" + "\\}", apiClient.escapeString(profileId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "admin_api_key" };

    TypeReference<ProfileResponse> localVarReturnType = new TypeReference<ProfileResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Profile - Update
   * Update the *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @param profileCreate  (required)
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   */
  public ProfileResponse updateAProfile(String accountId, String profileId, ProfileCreate profileCreate) throws ApiException {
    return this.updateAProfile(accountId, profileId, profileCreate, Collections.emptyMap());
  }


  /**
   * Profile - Update
   * Update the *profile*
   * @param accountId The unique identifier for the merchant account (required)
   * @param profileId The unique identifier for the profile (required)
   * @param profileCreate  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   */
  public ProfileResponse updateAProfile(String accountId, String profileId, ProfileCreate profileCreate, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = profileCreate;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateAProfile");
    }
    
    // verify the required parameter 'profileId' is set
    if (profileId == null) {
      throw new ApiException(400, "Missing the required parameter 'profileId' when calling updateAProfile");
    }
    
    // verify the required parameter 'profileCreate' is set
    if (profileCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'profileCreate' when calling updateAProfile");
    }
    
    // create path and map variables
    String localVarPath = "/account/{account_id}/business_profile/{profile_id}"
      .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "profile_id" + "\\}", apiClient.escapeString(profileId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "admin_api_key" };

    TypeReference<ProfileResponse> localVarReturnType = new TypeReference<ProfileResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

}

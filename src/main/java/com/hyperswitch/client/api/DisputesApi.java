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
import com.hyperswitch.client.BaseApi;
import com.hyperswitch.client.Configuration;
import com.hyperswitch.client.Pair;

import com.hyperswitch.client.model.DisputeResponse;
import com.hyperswitch.client.model.DisputeStage;
import com.hyperswitch.client.model.DisputeStatus;
import java.time.OffsetDateTime;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class DisputesApi extends BaseApi {

  public DisputesApi() {
    super(Configuration.getDefaultApiClient());
  }

  public DisputesApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Disputes - List Disputes
   * Lists all the Disputes for a merchant
   * @param limit The maximum number of Dispute Objects to include in the response (optional)
   * @param disputeStatus The status of dispute (optional)
   * @param disputeStage The stage of dispute (optional)
   * @param reason The reason for dispute (optional)
   * @param connector The connector linked to dispute (optional)
   * @param receivedTime The time at which dispute is received (optional)
   * @param receivedTimeLt Time less than the dispute received time (optional)
   * @param receivedTimeGt Time greater than the dispute received time (optional)
   * @param receivedTimeLte Time less than or equals to the dispute received time (optional)
   * @param receivedTimeGte Time greater than or equals to the dispute received time (optional)
   * @return List&lt;DisputeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public List<DisputeResponse> listDisputes(Long limit, DisputeStatus disputeStatus, DisputeStage disputeStage, String reason, String connector, OffsetDateTime receivedTime, OffsetDateTime receivedTimeLt, OffsetDateTime receivedTimeGt, OffsetDateTime receivedTimeLte, OffsetDateTime receivedTimeGte) throws ApiException {
    return this.listDisputes(limit, disputeStatus, disputeStage, reason, connector, receivedTime, receivedTimeLt, receivedTimeGt, receivedTimeLte, receivedTimeGte, Collections.emptyMap());
  }


  /**
   * Disputes - List Disputes
   * Lists all the Disputes for a merchant
   * @param limit The maximum number of Dispute Objects to include in the response (optional)
   * @param disputeStatus The status of dispute (optional)
   * @param disputeStage The stage of dispute (optional)
   * @param reason The reason for dispute (optional)
   * @param connector The connector linked to dispute (optional)
   * @param receivedTime The time at which dispute is received (optional)
   * @param receivedTimeLt Time less than the dispute received time (optional)
   * @param receivedTimeGt Time greater than the dispute received time (optional)
   * @param receivedTimeLte Time less than or equals to the dispute received time (optional)
   * @param receivedTimeGte Time greater than or equals to the dispute received time (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return List&lt;DisputeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public List<DisputeResponse> listDisputes(Long limit, DisputeStatus disputeStatus, DisputeStage disputeStage, String reason, String connector, OffsetDateTime receivedTime, OffsetDateTime receivedTimeLt, OffsetDateTime receivedTimeGt, OffsetDateTime receivedTimeLte, OffsetDateTime receivedTimeGte, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/disputes/list";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("dispute_status", disputeStatus));
    localVarQueryParams.addAll(apiClient.parameterToPair("dispute_stage", disputeStage));
    localVarQueryParams.addAll(apiClient.parameterToPair("reason", reason));
    localVarQueryParams.addAll(apiClient.parameterToPair("connector", connector));
    localVarQueryParams.addAll(apiClient.parameterToPair("received_time", receivedTime));
    localVarQueryParams.addAll(apiClient.parameterToPair("received_time.lt", receivedTimeLt));
    localVarQueryParams.addAll(apiClient.parameterToPair("received_time.gt", receivedTimeGt));
    localVarQueryParams.addAll(apiClient.parameterToPair("received_time.lte", receivedTimeLte));
    localVarQueryParams.addAll(apiClient.parameterToPair("received_time.gte", receivedTimeGte));
    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "api_key" };

    TypeReference<List<DisputeResponse>> localVarReturnType = new TypeReference<List<DisputeResponse>>() {};
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
   * Disputes - Retrieve Dispute
   * Retrieves a dispute
   * @param disputeId The identifier for dispute (required)
   * @return DisputeResponse
   * @throws ApiException if fails to make API call
   */
  public DisputeResponse retrieveADispute(String disputeId) throws ApiException {
    return this.retrieveADispute(disputeId, Collections.emptyMap());
  }


  /**
   * Disputes - Retrieve Dispute
   * Retrieves a dispute
   * @param disputeId The identifier for dispute (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return DisputeResponse
   * @throws ApiException if fails to make API call
   */
  public DisputeResponse retrieveADispute(String disputeId, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'disputeId' is set
    if (disputeId == null) {
      throw new ApiException(400, "Missing the required parameter 'disputeId' when calling retrieveADispute");
    }
    
    // create path and map variables
    String localVarPath = "/disputes/{dispute_id}"
      .replaceAll("\\{" + "dispute_id" + "\\}", apiClient.escapeString(apiClient.parameterToString(disputeId)));

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

    TypeReference<DisputeResponse> localVarReturnType = new TypeReference<DisputeResponse>() {};
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

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
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

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}

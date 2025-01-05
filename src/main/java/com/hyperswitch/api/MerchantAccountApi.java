package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.model.ApiResponse;

import com.hyperswitch.model.MerchantAccountCreate;
import com.hyperswitch.model.MerchantAccountResponse;
import com.hyperswitch.model.MerchantAccountUpdate;
import com.hyperswitch.model.ProfileResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public interface MerchantAccountApi extends ApiClient.Api {


  /**
   * Merchant Account - Create
   * Create a new account for a *merchant* and the *merchant* could be a seller or retailer or client who likes to receive and send payments.  Before creating the merchant account, it is mandatory to create an organization.
   * @param xOrganizationId Organization ID for which the merchant account has to be created. (required)
   * @param merchantAccountCreate  (required)
   * @return MerchantAccountResponse
   */
  @RequestLine("POST /v2/merchant_accounts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "X-Organization-Id: {xOrganizationId}"
  })
  MerchantAccountResponse createAMerchantAccount(@Param("xOrganizationId") String xOrganizationId, MerchantAccountCreate merchantAccountCreate);

  /**
   * Merchant Account - Create
   * Similar to <code>createAMerchantAccount</code> but it also returns the http response headers .
   * Create a new account for a *merchant* and the *merchant* could be a seller or retailer or client who likes to receive and send payments.  Before creating the merchant account, it is mandatory to create an organization.
   * @param xOrganizationId Organization ID for which the merchant account has to be created. (required)
   * @param merchantAccountCreate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v2/merchant_accounts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "X-Organization-Id: {xOrganizationId}"
  })
  ApiResponse<MerchantAccountResponse> createAMerchantAccountWithHttpInfo(@Param("xOrganizationId") String xOrganizationId, MerchantAccountCreate merchantAccountCreate);



  /**
   * Merchant Account - Profile List
   * List profiles for an Merchant
   * @param id The unique identifier for the Merchant (required)
   * @return List&lt;ProfileResponse&gt;
   */
  @RequestLine("GET /v2/merchant_accounts/{id}/profiles")
  @Headers({
    "Accept: application/json",
  })
  List<ProfileResponse> listProfiles(@Param("id") String id);

  /**
   * Merchant Account - Profile List
   * Similar to <code>listProfiles</code> but it also returns the http response headers .
   * List profiles for an Merchant
   * @param id The unique identifier for the Merchant (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/merchant_accounts/{id}/profiles")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<ProfileResponse>> listProfilesWithHttpInfo(@Param("id") String id);



  /**
   * Merchant Account - Retrieve
   * Retrieve a *merchant* account details.
   * @param id The unique identifier for the merchant account (required)
   * @return MerchantAccountResponse
   */
  @RequestLine("GET /v2/merchant_accounts/{id}")
  @Headers({
    "Accept: application/json",
  })
  MerchantAccountResponse retrieveAMerchantAccount(@Param("id") String id);

  /**
   * Merchant Account - Retrieve
   * Similar to <code>retrieveAMerchantAccount</code> but it also returns the http response headers .
   * Retrieve a *merchant* account details.
   * @param id The unique identifier for the merchant account (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/merchant_accounts/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MerchantAccountResponse> retrieveAMerchantAccountWithHttpInfo(@Param("id") String id);



  /**
   * Merchant Account - Update
   * Updates details of an existing merchant account. Helpful in updating merchant details such as email, contact details, or other configuration details like webhook, routing algorithm etc
   * @param id The unique identifier for the merchant account (required)
   * @param merchantAccountUpdate  (required)
   * @return MerchantAccountResponse
   */
  @RequestLine("PUT /v2/merchant_accounts/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MerchantAccountResponse updateAMerchantAccount(@Param("id") String id, MerchantAccountUpdate merchantAccountUpdate);

  /**
   * Merchant Account - Update
   * Similar to <code>updateAMerchantAccount</code> but it also returns the http response headers .
   * Updates details of an existing merchant account. Helpful in updating merchant details such as email, contact details, or other configuration details like webhook, routing algorithm etc
   * @param id The unique identifier for the merchant account (required)
   * @param merchantAccountUpdate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v2/merchant_accounts/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MerchantAccountResponse> updateAMerchantAccountWithHttpInfo(@Param("id") String id, MerchantAccountUpdate merchantAccountUpdate);


}

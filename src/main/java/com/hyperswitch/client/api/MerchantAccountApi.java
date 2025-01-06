package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.MerchantAccountCreate;
import com.hyperswitch.client.model.MerchantAccountDeleteResponse;
import com.hyperswitch.client.model.MerchantAccountResponse;
import com.hyperswitch.client.model.MerchantAccountUpdate;
import com.hyperswitch.client.model.ToggleKVRequest;
import com.hyperswitch.client.model.ToggleKVResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface MerchantAccountApi extends ApiClient.Api {


  /**
   * Merchant Account - Create
   * Create a new account for a *merchant* and the *merchant* could be a seller or retailer or client who likes to receive and send payments.
   * @param merchantAccountCreate  (required)
   * @return MerchantAccountResponse
   */
  @RequestLine("POST /accounts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MerchantAccountResponse createAMerchantAccount(MerchantAccountCreate merchantAccountCreate);

  /**
   * Merchant Account - Create
   * Similar to <code>createAMerchantAccount</code> but it also returns the http response headers .
   * Create a new account for a *merchant* and the *merchant* could be a seller or retailer or client who likes to receive and send payments.
   * @param merchantAccountCreate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /accounts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MerchantAccountResponse> createAMerchantAccountWithHttpInfo(MerchantAccountCreate merchantAccountCreate);



  /**
   * Merchant Account - Delete
   * Delete a *merchant* account
   * @param accountId The unique identifier for the merchant account (required)
   * @return MerchantAccountDeleteResponse
   */
  @RequestLine("DELETE /accounts/{accountId}")
  @Headers({
    "Accept: application/json",
  })
  MerchantAccountDeleteResponse deleteAMerchantAccount(@Param("accountId") String accountId);

  /**
   * Merchant Account - Delete
   * Similar to <code>deleteAMerchantAccount</code> but it also returns the http response headers .
   * Delete a *merchant* account
   * @param accountId The unique identifier for the merchant account (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /accounts/{accountId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MerchantAccountDeleteResponse> deleteAMerchantAccountWithHttpInfo(@Param("accountId") String accountId);



  /**
   * Merchant Account - KV Status
   * Toggle KV mode for the Merchant Account
   * @param accountId The unique identifier for the merchant account (required)
   * @param toggleKVRequest  (required)
   * @return ToggleKVResponse
   */
  @RequestLine("POST /accounts/{accountId}/kv")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ToggleKVResponse enableDisableKVForAMerchantAccount(@Param("accountId") String accountId, ToggleKVRequest toggleKVRequest);

  /**
   * Merchant Account - KV Status
   * Similar to <code>enableDisableKVForAMerchantAccount</code> but it also returns the http response headers .
   * Toggle KV mode for the Merchant Account
   * @param accountId The unique identifier for the merchant account (required)
   * @param toggleKVRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /accounts/{accountId}/kv")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ToggleKVResponse> enableDisableKVForAMerchantAccountWithHttpInfo(@Param("accountId") String accountId, ToggleKVRequest toggleKVRequest);



  /**
   * Merchant Account - Retrieve
   * Retrieve a *merchant* account details.
   * @param accountId The unique identifier for the merchant account (required)
   * @return MerchantAccountResponse
   */
  @RequestLine("GET /accounts/{accountId}")
  @Headers({
    "Accept: application/json",
  })
  MerchantAccountResponse retrieveAMerchantAccount(@Param("accountId") String accountId);

  /**
   * Merchant Account - Retrieve
   * Similar to <code>retrieveAMerchantAccount</code> but it also returns the http response headers .
   * Retrieve a *merchant* account details.
   * @param accountId The unique identifier for the merchant account (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /accounts/{accountId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MerchantAccountResponse> retrieveAMerchantAccountWithHttpInfo(@Param("accountId") String accountId);



  /**
   * Merchant Account - Update
   * Updates details of an existing merchant account. Helpful in updating merchant details such as email, contact details, or other configuration details like webhook, routing algorithm etc
   * @param accountId The unique identifier for the merchant account (required)
   * @param merchantAccountUpdate  (required)
   * @return MerchantAccountResponse
   */
  @RequestLine("POST /accounts/{accountId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MerchantAccountResponse updateAMerchantAccount(@Param("accountId") String accountId, MerchantAccountUpdate merchantAccountUpdate);

  /**
   * Merchant Account - Update
   * Similar to <code>updateAMerchantAccount</code> but it also returns the http response headers .
   * Updates details of an existing merchant account. Helpful in updating merchant details such as email, contact details, or other configuration details like webhook, routing algorithm etc
   * @param accountId The unique identifier for the merchant account (required)
   * @param merchantAccountUpdate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /accounts/{accountId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MerchantAccountResponse> updateAMerchantAccountWithHttpInfo(@Param("accountId") String accountId, MerchantAccountUpdate merchantAccountUpdate);


}

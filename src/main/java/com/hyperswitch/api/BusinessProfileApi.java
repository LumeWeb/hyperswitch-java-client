package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.model.ApiResponse;

import com.hyperswitch.model.MerchantConnectorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public interface BusinessProfileApi extends ApiClient.Api {


  /**
   * Profile - Connector Accounts List
   * List Connector Accounts for the profile
   * @param id The unique identifier for the business profile (required)
   * @param xMerchantId Merchant ID of the profile. (required)
   * @return List&lt;MerchantConnectorResponse&gt;
   */
  @RequestLine("GET /v2/profiles/{id}/connector_accounts")
  @Headers({
    "Accept: application/json",
    "X-Merchant-Id: {xMerchantId}"
  })
  List<MerchantConnectorResponse> listAllConnectorAccounts(@Param("id") String id, @Param("xMerchantId") String xMerchantId);

  /**
   * Profile - Connector Accounts List
   * Similar to <code>listAllConnectorAccounts</code> but it also returns the http response headers .
   * List Connector Accounts for the profile
   * @param id The unique identifier for the business profile (required)
   * @param xMerchantId Merchant ID of the profile. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/profiles/{id}/connector_accounts")
  @Headers({
    "Accept: application/json",
    "X-Merchant-Id: {xMerchantId}"
  })
  ApiResponse<List<MerchantConnectorResponse>> listAllConnectorAccountsWithHttpInfo(@Param("id") String id, @Param("xMerchantId") String xMerchantId);


}

package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.MerchantConnectorCreate;
import com.hyperswitch.client.model.MerchantConnectorDeleteResponse;
import com.hyperswitch.client.model.MerchantConnectorResponse;
import com.hyperswitch.client.model.MerchantConnectorUpdate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface MerchantConnectorAccountApi extends ApiClient.Api {


  /**
   * Connector Account - Create
   * Creates a new Connector Account for the merchant account. The connector could be a payment processor/facilitator/acquirer or a provider of specialized services like Fraud/Accounting etc.
   * @param merchantConnectorCreate  (required)
   * @return MerchantConnectorResponse
   */
  @RequestLine("POST /v2/connector_accounts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MerchantConnectorResponse createAMerchantConnector(MerchantConnectorCreate merchantConnectorCreate);

  /**
   * Connector Account - Create
   * Similar to <code>createAMerchantConnector</code> but it also returns the http response headers .
   * Creates a new Connector Account for the merchant account. The connector could be a payment processor/facilitator/acquirer or a provider of specialized services like Fraud/Accounting etc.
   * @param merchantConnectorCreate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v2/connector_accounts")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorResponse> createAMerchantConnectorWithHttpInfo(MerchantConnectorCreate merchantConnectorCreate);



  /**
   * Merchant Connector - Delete
   * Delete or Detach a Merchant Connector from Merchant Account
   * @param id The unique identifier for the Merchant Connector (required)
   * @return MerchantConnectorDeleteResponse
   */
  @RequestLine("DELETE /v2/connector_accounts/{id}")
  @Headers({
    "Accept: application/json",
  })
  MerchantConnectorDeleteResponse deleteAMerchantConnector(@Param("id") Integer id);

  /**
   * Merchant Connector - Delete
   * Similar to <code>deleteAMerchantConnector</code> but it also returns the http response headers .
   * Delete or Detach a Merchant Connector from Merchant Account
   * @param id The unique identifier for the Merchant Connector (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v2/connector_accounts/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorDeleteResponse> deleteAMerchantConnectorWithHttpInfo(@Param("id") Integer id);



  /**
   * Connector Account - Retrieve
   * Retrieves details of a Connector account
   * @param id The unique identifier for the Merchant Connector (required)
   * @return MerchantConnectorResponse
   */
  @RequestLine("GET /v2/connector_accounts/{id}")
  @Headers({
    "Accept: application/json",
  })
  MerchantConnectorResponse retrieveAMerchantConnector(@Param("id") Integer id);

  /**
   * Connector Account - Retrieve
   * Similar to <code>retrieveAMerchantConnector</code> but it also returns the http response headers .
   * Retrieves details of a Connector account
   * @param id The unique identifier for the Merchant Connector (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/connector_accounts/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorResponse> retrieveAMerchantConnectorWithHttpInfo(@Param("id") Integer id);



  /**
   * Connector Account - Update
   * To update an existing Connector account. Helpful in enabling/disabling different payment methods and other settings for the connector
   * @param id The unique identifier for the Merchant Connector (required)
   * @param merchantConnectorUpdate  (required)
   * @return MerchantConnectorResponse
   */
  @RequestLine("PUT /v2/connector_accounts/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MerchantConnectorResponse updateAMerchantConnector(@Param("id") Integer id, MerchantConnectorUpdate merchantConnectorUpdate);

  /**
   * Connector Account - Update
   * Similar to <code>updateAMerchantConnector</code> but it also returns the http response headers .
   * To update an existing Connector account. Helpful in enabling/disabling different payment methods and other settings for the connector
   * @param id The unique identifier for the Merchant Connector (required)
   * @param merchantConnectorUpdate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /v2/connector_accounts/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorResponse> updateAMerchantConnectorWithHttpInfo(@Param("id") Integer id, MerchantConnectorUpdate merchantConnectorUpdate);


}

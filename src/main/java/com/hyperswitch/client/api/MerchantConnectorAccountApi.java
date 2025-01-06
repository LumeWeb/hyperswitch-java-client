package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.MerchantConnectorCreate;
import com.hyperswitch.client.model.MerchantConnectorDeleteResponse;
import com.hyperswitch.client.model.MerchantConnectorListResponse;
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
   * Merchant Connector - Create
   * Creates a new Merchant Connector for the merchant account. The connector could be a payment processor/facilitator/acquirer or a provider of specialized services like Fraud/Accounting etc.
   * @param accountId The unique identifier for the merchant account (required)
   * @param merchantConnectorCreate  (required)
   * @return MerchantConnectorResponse
   */
  @RequestLine("POST /accounts/{accountId}/connectors")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MerchantConnectorResponse createAMerchantConnector(@Param("accountId") String accountId, MerchantConnectorCreate merchantConnectorCreate);

  /**
   * Merchant Connector - Create
   * Similar to <code>createAMerchantConnector</code> but it also returns the http response headers .
   * Creates a new Merchant Connector for the merchant account. The connector could be a payment processor/facilitator/acquirer or a provider of specialized services like Fraud/Accounting etc.
   * @param accountId The unique identifier for the merchant account (required)
   * @param merchantConnectorCreate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /accounts/{accountId}/connectors")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorResponse> createAMerchantConnectorWithHttpInfo(@Param("accountId") String accountId, MerchantConnectorCreate merchantConnectorCreate);



  /**
   * Merchant Connector - Delete
   * Delete or Detach a Merchant Connector from Merchant Account
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @return MerchantConnectorDeleteResponse
   */
  @RequestLine("DELETE /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Accept: application/json",
  })
  MerchantConnectorDeleteResponse deleteAMerchantConnector(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId);

  /**
   * Merchant Connector - Delete
   * Similar to <code>deleteAMerchantConnector</code> but it also returns the http response headers .
   * Delete or Detach a Merchant Connector from Merchant Account
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorDeleteResponse> deleteAMerchantConnectorWithHttpInfo(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId);



  /**
   * Merchant Connector - List
   * List Merchant Connector Details for the merchant
   * @param accountId The unique identifier for the merchant account (required)
   * @return List&lt;MerchantConnectorListResponse&gt;
   */
  @RequestLine("GET /accounts/{accountId}/connectors")
  @Headers({
    "Accept: application/json",
  })
  List<MerchantConnectorListResponse> listAllMerchantConnectors(@Param("accountId") String accountId);

  /**
   * Merchant Connector - List
   * Similar to <code>listAllMerchantConnectors</code> but it also returns the http response headers .
   * List Merchant Connector Details for the merchant
   * @param accountId The unique identifier for the merchant account (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /accounts/{accountId}/connectors")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<MerchantConnectorListResponse>> listAllMerchantConnectorsWithHttpInfo(@Param("accountId") String accountId);



  /**
   * Merchant Connector - Retrieve
   * Retrieves details of a Connector account
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @return MerchantConnectorResponse
   */
  @RequestLine("GET /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Accept: application/json",
  })
  MerchantConnectorResponse retrieveAMerchantConnector(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId);

  /**
   * Merchant Connector - Retrieve
   * Similar to <code>retrieveAMerchantConnector</code> but it also returns the http response headers .
   * Retrieves details of a Connector account
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorResponse> retrieveAMerchantConnectorWithHttpInfo(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId);



  /**
   * Merchant Connector - Update
   * To update an existing Merchant Connector account. Helpful in enabling/disabling different payment methods and other settings for the connector
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @param merchantConnectorUpdate  (required)
   * @return MerchantConnectorResponse
   */
  @RequestLine("POST /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MerchantConnectorResponse updateAMerchantConnector(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId, MerchantConnectorUpdate merchantConnectorUpdate);

  /**
   * Merchant Connector - Update
   * Similar to <code>updateAMerchantConnector</code> but it also returns the http response headers .
   * To update an existing Merchant Connector account. Helpful in enabling/disabling different payment methods and other settings for the connector
   * @param accountId The unique identifier for the merchant account (required)
   * @param connectorId The unique identifier for the Merchant Connector (required)
   * @param merchantConnectorUpdate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /accounts/{accountId}/connectors/{connectorId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MerchantConnectorResponse> updateAMerchantConnectorWithHttpInfo(@Param("accountId") String accountId, @Param("connectorId") Integer connectorId, MerchantConnectorUpdate merchantConnectorUpdate);


}

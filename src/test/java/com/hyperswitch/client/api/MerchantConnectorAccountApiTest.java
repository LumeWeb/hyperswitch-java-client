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

import com.hyperswitch.client.ApiException;
import com.hyperswitch.client.model.MerchantConnectorCreate;
import com.hyperswitch.client.model.MerchantConnectorDeleteResponse;
import com.hyperswitch.client.model.MerchantConnectorListResponse;
import com.hyperswitch.client.model.MerchantConnectorResponse;
import com.hyperswitch.client.model.MerchantConnectorUpdate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantConnectorAccountApi
 */
@Disabled
public class MerchantConnectorAccountApiTest {

    private final MerchantConnectorAccountApi api = new MerchantConnectorAccountApi();

    /**
     * Merchant Connector - Create
     *
     * Creates a new Merchant Connector for the merchant account. The connector could be a payment processor/facilitator/acquirer or a provider of specialized services like Fraud/Accounting etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAMerchantConnectorTest() throws ApiException {
        String accountId = null;
        MerchantConnectorCreate merchantConnectorCreate = null;
        MerchantConnectorResponse response = api.createAMerchantConnector(accountId, merchantConnectorCreate);

        // TODO: test validations
    }
    /**
     * Merchant Connector - Delete
     *
     * Delete or Detach a Merchant Connector from Merchant Account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAMerchantConnectorTest() throws ApiException {
        String accountId = null;
        Integer connectorId = null;
        MerchantConnectorDeleteResponse response = api.deleteAMerchantConnector(accountId, connectorId);

        // TODO: test validations
    }
    /**
     * Merchant Connector - List
     *
     * List Merchant Connector Details for the merchant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllMerchantConnectorsTest() throws ApiException {
        String accountId = null;
        List<MerchantConnectorListResponse> response = api.listAllMerchantConnectors(accountId);

        // TODO: test validations
    }
    /**
     * Merchant Connector - Retrieve
     *
     * Retrieves details of a Connector account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAMerchantConnectorTest() throws ApiException {
        String accountId = null;
        Integer connectorId = null;
        MerchantConnectorResponse response = api.retrieveAMerchantConnector(accountId, connectorId);

        // TODO: test validations
    }
    /**
     * Merchant Connector - Update
     *
     * To update an existing Merchant Connector account. Helpful in enabling/disabling different payment methods and other settings for the connector
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAMerchantConnectorTest() throws ApiException {
        String accountId = null;
        Integer connectorId = null;
        MerchantConnectorUpdate merchantConnectorUpdate = null;
        MerchantConnectorResponse response = api.updateAMerchantConnector(accountId, connectorId, merchantConnectorUpdate);

        // TODO: test validations
    }
}

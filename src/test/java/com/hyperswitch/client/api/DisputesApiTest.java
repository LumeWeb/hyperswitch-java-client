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
import com.hyperswitch.client.model.DisputeResponse;
import com.hyperswitch.client.model.DisputeStage;
import com.hyperswitch.client.model.DisputeStatus;
import java.time.OffsetDateTime;
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
 * API tests for DisputesApi
 */
@Disabled
public class DisputesApiTest {

    private final DisputesApi api = new DisputesApi();

    /**
     * Disputes - List Disputes
     *
     * Lists all the Disputes for a merchant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDisputesTest() throws ApiException {
        Long limit = null;
        DisputeStatus disputeStatus = null;
        DisputeStage disputeStage = null;
        String reason = null;
        String connector = null;
        OffsetDateTime receivedTime = null;
        OffsetDateTime receivedTimeLt = null;
        OffsetDateTime receivedTimeGt = null;
        OffsetDateTime receivedTimeLte = null;
        OffsetDateTime receivedTimeGte = null;
        List<DisputeResponse> response = api.listDisputes(limit, disputeStatus, disputeStage, reason, connector, receivedTime, receivedTimeLt, receivedTimeGt, receivedTimeLte, receivedTimeGte);

        // TODO: test validations
    }
    /**
     * Disputes - Retrieve Dispute
     *
     * Retrieves a dispute
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveADisputeTest() throws ApiException {
        String disputeId = null;
        DisputeResponse response = api.retrieveADispute(disputeId);

        // TODO: test validations
    }
}

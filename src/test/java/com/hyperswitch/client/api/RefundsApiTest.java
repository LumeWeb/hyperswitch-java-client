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
import com.hyperswitch.client.model.RefundListRequest;
import com.hyperswitch.client.model.RefundListResponse;
import com.hyperswitch.client.model.RefundRequest;
import com.hyperswitch.client.model.RefundResponse;
import com.hyperswitch.client.model.RefundUpdateRequest;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RefundsApi
 */
@Ignore
public class RefundsApiTest {

    private final RefundsApi api = new RefundsApi();

    /**
     * Refunds - Create
     *
     * Creates a refund against an already processed payment. In case of some processors, you can even opt to refund only a partial amount multiple times until the original charge amount has been refunded
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createARefundTest() throws ApiException {
        RefundRequest refundRequest = null;
        RefundResponse response = api.createARefund(refundRequest);

        // TODO: test validations
    }
    /**
     * Refunds - List
     *
     * Lists all the refunds associated with the merchant or a payment_id if payment_id is not provided
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllRefundsTest() throws ApiException {
        RefundListRequest refundListRequest = null;
        RefundListResponse response = api.listAllRefunds(refundListRequest);

        // TODO: test validations
    }
    /**
     * Refunds - Retrieve
     *
     * Retrieves a Refund. This may be used to get the status of a previously initiated refund
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveARefundTest() throws ApiException {
        String refundId = null;
        RefundResponse response = api.retrieveARefund(refundId);

        // TODO: test validations
    }
    /**
     * Refunds - Update
     *
     * Updates the properties of a Refund object. This API can be used to attach a reason for the refund or metadata fields
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateARefundTest() throws ApiException {
        String refundId = null;
        RefundUpdateRequest refundUpdateRequest = null;
        RefundResponse response = api.updateARefund(refundId, refundUpdateRequest);

        // TODO: test validations
    }
}

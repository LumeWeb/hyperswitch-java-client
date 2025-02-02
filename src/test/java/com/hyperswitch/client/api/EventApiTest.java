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
import com.hyperswitch.client.model.EventListItemResponse;
import com.hyperswitch.client.model.EventRetrieveResponse;
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
 * API tests for EventApi
 */
@Disabled
public class EventApiTest {

    private final EventApi api = new EventApi();

    /**
     * Events - Delivery Attempt List
     *
     * List all delivery attempts for the specified Event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllDeliveryAttemptsForAnEventTest() throws ApiException {
        String merchantId = null;
        String eventId = null;
        List<EventRetrieveResponse> response = api.listAllDeliveryAttemptsForAnEvent(merchantId, eventId);

        // TODO: test validations
    }
    /**
     * Events - List
     *
     * List all Events associated with a Merchant Account or Profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllEventsAssociatedWithAMerchantAccountOrProfileTest() throws ApiException {
        String merchantId = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        Long limit = null;
        Long offset = null;
        String objectId = null;
        String profileId = null;
        List<EventListItemResponse> response = api.listAllEventsAssociatedWithAMerchantAccountOrProfile(merchantId, createdAfter, createdBefore, limit, offset, objectId, profileId);

        // TODO: test validations
    }
    /**
     * Events - Manual Retry
     *
     * Manually retry the delivery of the specified Event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void manuallyRetryTheDeliveryOfAnEventTest() throws ApiException {
        String merchantId = null;
        String eventId = null;
        EventRetrieveResponse response = api.manuallyRetryTheDeliveryOfAnEvent(merchantId, eventId);

        // TODO: test validations
    }
}

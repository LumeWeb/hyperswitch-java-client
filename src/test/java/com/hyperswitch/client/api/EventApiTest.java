package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.EventListItemResponse;
import com.hyperswitch.client.model.EventRetrieveResponse;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventApi
 */
class EventApiTest {

    private EventApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(EventApi.class);
    }

    
    /**
     * Events - Delivery Attempt List
     *
     * List all delivery attempts for the specified Event.
     */
    @Test
    void listAllDeliveryAttemptsForAnEventTest() {
        String merchantId = null;
        String eventId = null;
        // List<EventRetrieveResponse> response = api.listAllDeliveryAttemptsForAnEvent(merchantId, eventId);

        // TODO: test validations
    }

    
    /**
     * Events - List
     *
     * List all Events associated with a Merchant Account or Profile.
     */
    @Test
    void listAllEventsAssociatedWithAMerchantAccountOrProfileTest() {
        String merchantId = null;
        OffsetDateTime createdAfter = null;
        OffsetDateTime createdBefore = null;
        Long limit = null;
        Long offset = null;
        String objectId = null;
        String profileId = null;
        // List<EventListItemResponse> response = api.listAllEventsAssociatedWithAMerchantAccountOrProfile(merchantId, createdAfter, createdBefore, limit, offset, objectId, profileId);

        // TODO: test validations
    }

    /**
     * Events - List
     *
     * List all Events associated with a Merchant Account or Profile.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAllEventsAssociatedWithAMerchantAccountOrProfileTestQueryMap() {
        String merchantId = null;
        EventApi.ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams queryParams = new EventApi.ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams()
            .createdAfter(null)
            .createdBefore(null)
            .limit(null)
            .offset(null)
            .objectId(null)
            .profileId(null);
        // List<EventListItemResponse> response = api.listAllEventsAssociatedWithAMerchantAccountOrProfile(merchantId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Events - Manual Retry
     *
     * Manually retry the delivery of the specified Event.
     */
    @Test
    void manuallyRetryTheDeliveryOfAnEventTest() {
        String merchantId = null;
        String eventId = null;
        // EventRetrieveResponse response = api.manuallyRetryTheDeliveryOfAnEvent(merchantId, eventId);

        // TODO: test validations
    }

    
}

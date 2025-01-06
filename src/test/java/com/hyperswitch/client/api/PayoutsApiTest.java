package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.PayoutCancelRequest;
import com.hyperswitch.client.model.PayoutConfirmRequest;
import com.hyperswitch.client.model.PayoutCreateResponse;
import com.hyperswitch.client.model.PayoutFulfillRequest;
import com.hyperswitch.client.model.PayoutListFilterConstraints;
import com.hyperswitch.client.model.PayoutListFilters;
import com.hyperswitch.client.model.PayoutListResponse;
import com.hyperswitch.client.model.PayoutUpdateRequest;
import com.hyperswitch.client.model.PayoutsCreateRequest;
import com.hyperswitch.client.model.TimeRange;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayoutsApi
 */
class PayoutsApiTest {

    private PayoutsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PayoutsApi.class);
    }

    
    /**
     * Payouts - Cancel
     *
     * 
     */
    @Test
    void cancelAPayoutTest() {
        String payoutId = null;
        PayoutCancelRequest payoutCancelRequest = null;
        // PayoutCreateResponse response = api.cancelAPayout(payoutId, payoutCancelRequest);

        // TODO: test validations
    }

    
    /**
     * Payouts - Confirm
     *
     * 
     */
    @Test
    void confirmAPayoutTest() {
        String payoutId = null;
        PayoutConfirmRequest payoutConfirmRequest = null;
        // PayoutCreateResponse response = api.confirmAPayout(payoutId, payoutConfirmRequest);

        // TODO: test validations
    }

    
    /**
     * Payouts - Create
     *
     * 
     */
    @Test
    void createAPayoutTest() {
        PayoutsCreateRequest payoutsCreateRequest = null;
        // PayoutCreateResponse response = api.createAPayout(payoutsCreateRequest);

        // TODO: test validations
    }

    
    /**
     * Payouts - List using filters
     *
     * 
     */
    @Test
    void filterPayoutsUsingSpecificConstraintsTest() {
        PayoutListFilterConstraints payoutListFilterConstraints = null;
        // PayoutListResponse response = api.filterPayoutsUsingSpecificConstraints(payoutListFilterConstraints);

        // TODO: test validations
    }

    
    /**
     * Payouts - Fulfill
     *
     * 
     */
    @Test
    void fulfillAPayoutTest() {
        String payoutId = null;
        PayoutFulfillRequest payoutFulfillRequest = null;
        // PayoutCreateResponse response = api.fulfillAPayout(payoutId, payoutFulfillRequest);

        // TODO: test validations
    }

    
    /**
     * Payouts - List available filters
     *
     * 
     */
    @Test
    void listAvailablePayoutFiltersTest() {
        TimeRange timeRange = null;
        // PayoutListFilters response = api.listAvailablePayoutFilters(timeRange);

        // TODO: test validations
    }

    
    /**
     * Payouts - List
     *
     * 
     */
    @Test
    void listPayoutsUsingGenericConstraintsTest() {
        String customerId = null;
        String startingAfter = null;
        String endingBefore = null;
        String limit = null;
        String created = null;
        String timeRange = null;
        // PayoutListResponse response = api.listPayoutsUsingGenericConstraints(customerId, startingAfter, endingBefore, limit, created, timeRange);

        // TODO: test validations
    }

    /**
     * Payouts - List
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listPayoutsUsingGenericConstraintsTestQueryMap() {
        PayoutsApi.ListPayoutsUsingGenericConstraintsQueryParams queryParams = new PayoutsApi.ListPayoutsUsingGenericConstraintsQueryParams()
            .customerId(null)
            .startingAfter(null)
            .endingBefore(null)
            .limit(null)
            .created(null)
            .timeRange(null);
        // PayoutListResponse response = api.listPayoutsUsingGenericConstraints(queryParams);

    // TODO: test validations
    }
    
    /**
     * Payouts - Retrieve
     *
     * 
     */
    @Test
    void retrieveAPayoutTest() {
        String payoutId = null;
        Boolean forceSync = null;
        // PayoutCreateResponse response = api.retrieveAPayout(payoutId, forceSync);

        // TODO: test validations
    }

    /**
     * Payouts - Retrieve
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void retrieveAPayoutTestQueryMap() {
        String payoutId = null;
        PayoutsApi.RetrieveAPayoutQueryParams queryParams = new PayoutsApi.RetrieveAPayoutQueryParams()
            .forceSync(null);
        // PayoutCreateResponse response = api.retrieveAPayout(payoutId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Payouts - Update
     *
     * 
     */
    @Test
    void updateAPayoutTest() {
        String payoutId = null;
        PayoutUpdateRequest payoutUpdateRequest = null;
        // PayoutCreateResponse response = api.updateAPayout(payoutId, payoutUpdateRequest);

        // TODO: test validations
    }

    
}

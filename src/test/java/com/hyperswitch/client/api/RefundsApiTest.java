package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.RefundListRequest;
import com.hyperswitch.client.model.RefundListResponse;
import com.hyperswitch.client.model.RefundRequest;
import com.hyperswitch.client.model.RefundResponse;
import com.hyperswitch.client.model.RefundUpdateRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RefundsApi
 */
class RefundsApiTest {

    private RefundsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(RefundsApi.class);
    }

    
    /**
     * Refunds - Create
     *
     * Creates a refund against an already processed payment. In case of some processors, you can even opt to refund only a partial amount multiple times until the original charge amount has been refunded
     */
    @Test
    void createARefundTest() {
        RefundRequest refundRequest = null;
        // RefundResponse response = api.createARefund(refundRequest);

        // TODO: test validations
    }

    
    /**
     * Refunds - List
     *
     * Lists all the refunds associated with the merchant or a payment_id if payment_id is not provided
     */
    @Test
    void listAllRefundsTest() {
        RefundListRequest refundListRequest = null;
        // RefundListResponse response = api.listAllRefunds(refundListRequest);

        // TODO: test validations
    }

    
    /**
     * Refunds - Retrieve
     *
     * Retrieves a Refund. This may be used to get the status of a previously initiated refund
     */
    @Test
    void retrieveARefundTest() {
        String refundId = null;
        // RefundResponse response = api.retrieveARefund(refundId);

        // TODO: test validations
    }

    
    /**
     * Refunds - Update
     *
     * Updates the properties of a Refund object. This API can be used to attach a reason for the refund or metadata fields
     */
    @Test
    void updateARefundTest() {
        String refundId = null;
        RefundUpdateRequest refundUpdateRequest = null;
        // RefundResponse response = api.updateARefund(refundId, refundUpdateRequest);

        // TODO: test validations
    }

    
}

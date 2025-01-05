package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.RefundResponse;
import com.hyperswitch.client.model.RefundsCreateRequest;
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
        RefundsCreateRequest refundsCreateRequest = null;
        // RefundResponse response = api.createARefund(refundsCreateRequest);

        // TODO: test validations
    }

    
}

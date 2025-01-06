package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.PollResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PollApi
 */
class PollApiTest {

    private PollApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PollApi.class);
    }

    
    /**
     * Poll - Retrieve Poll Status
     *
     * 
     */
    @Test
    void retrievePollStatusTest() {
        String pollId = null;
        // PollResponse response = api.retrievePollStatus(pollId);

        // TODO: test validations
    }

    
}

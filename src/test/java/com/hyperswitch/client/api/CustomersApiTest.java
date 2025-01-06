package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.CustomerDeleteResponse;
import com.hyperswitch.client.model.CustomerRequest;
import com.hyperswitch.client.model.CustomerResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomersApi
 */
class CustomersApiTest {

    private CustomersApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(CustomersApi.class);
    }

    
    /**
     * Customers - Create
     *
     * Creates a customer object and stores the customer details to be reused for future payments. Incase the customer already exists in the system, this API will respond with the customer details.
     */
    @Test
    void createACustomerTest() {
        CustomerRequest customerRequest = null;
        // CustomerResponse response = api.createACustomer(customerRequest);

        // TODO: test validations
    }

    
    /**
     * Customers - Delete
     *
     * Delete a customer record.
     */
    @Test
    void deleteACustomerTest() {
        String customerId = null;
        // CustomerDeleteResponse response = api.deleteACustomer(customerId);

        // TODO: test validations
    }

    
    /**
     * Customers - List
     *
     * Lists all the customers for a particular merchant id.
     */
    @Test
    void listAllCustomersForAMerchantTest() {
        // List<CustomerResponse> response = api.listAllCustomersForAMerchant();

        // TODO: test validations
    }

    
    /**
     * Customers - Retrieve
     *
     * Retrieves a customer&#39;s details.
     */
    @Test
    void retrieveACustomerTest() {
        String customerId = null;
        // CustomerResponse response = api.retrieveACustomer(customerId);

        // TODO: test validations
    }

    
    /**
     * Customers - Update
     *
     * Updates the customer&#39;s details in a customer object.
     */
    @Test
    void updateACustomerTest() {
        String customerId = null;
        CustomerRequest customerRequest = null;
        // CustomerResponse response = api.updateACustomer(customerId, customerRequest);

        // TODO: test validations
    }

    
}

package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.CustomerDefaultPaymentMethodResponse;
import com.hyperswitch.client.model.CustomerPaymentMethodsListResponse;
import com.hyperswitch.client.model.PaymentMethodCreate;
import com.hyperswitch.client.model.PaymentMethodDeleteResponse;
import com.hyperswitch.client.model.PaymentMethodListResponse;
import com.hyperswitch.client.model.PaymentMethodResponse;
import com.hyperswitch.client.model.PaymentMethodUpdate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentMethodsApi
 */
class PaymentMethodsApiTest {

    private PaymentMethodsApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(PaymentMethodsApi.class);
    }

    
    /**
     * PaymentMethods - Create
     *
     * Creates and stores a payment method against a customer. In case of cards, this API should be used only by PCI compliant merchants.
     */
    @Test
    void createAPaymentMethodTest() {
        PaymentMethodCreate paymentMethodCreate = null;
        // PaymentMethodResponse response = api.createAPaymentMethod(paymentMethodCreate);

        // TODO: test validations
    }

    
    /**
     * Payment Method - Delete
     *
     * Deletes a payment method of a customer.
     */
    @Test
    void deleteAPaymentMethodTest() {
        String methodId = null;
        // PaymentMethodDeleteResponse response = api.deleteAPaymentMethod(methodId);

        // TODO: test validations
    }

    
    /**
     * List payment methods for a Customer
     *
     * Lists all the applicable payment methods for a particular Customer ID.
     */
    @Test
    void listAllPaymentMethodsForACustomerTest() {
        String customerId = null;
        List<String> acceptedCountry = null;
        List<Currency> acceptedCurrency = null;
        Long minimumAmount = null;
        Long maximumAmount = null;
        Boolean recurringPaymentEnabled = null;
        Boolean installmentPaymentEnabled = null;
        // CustomerPaymentMethodsListResponse response = api.listAllPaymentMethodsForACustomer(customerId, acceptedCountry, acceptedCurrency, minimumAmount, maximumAmount, recurringPaymentEnabled, installmentPaymentEnabled);

        // TODO: test validations
    }

    /**
     * List payment methods for a Customer
     *
     * Lists all the applicable payment methods for a particular Customer ID.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAllPaymentMethodsForACustomerTestQueryMap() {
        String customerId = null;
        List<Currency> acceptedCurrency = null;
        PaymentMethodsApi.ListAllPaymentMethodsForACustomerQueryParams queryParams = new PaymentMethodsApi.ListAllPaymentMethodsForACustomerQueryParams()
            .acceptedCountry(null)
            .minimumAmount(null)
            .maximumAmount(null)
            .recurringPaymentEnabled(null)
            .installmentPaymentEnabled(null);
        // CustomerPaymentMethodsListResponse response = api.listAllPaymentMethodsForACustomer(customerId, acceptedCurrency, queryParams);

    // TODO: test validations
    }
    
    /**
     * List payment methods for a Merchant
     *
     * Lists the applicable payment methods for a particular Merchant ID. Use the client secret and publishable key authorization to list all relevant payment methods of the merchant for the payment corresponding to the client secret.
     */
    @Test
    void listAllPaymentMethodsForAMerchantTest() {
        String accountId = null;
        List<String> acceptedCountry = null;
        List<Currency> acceptedCurrency = null;
        Long minimumAmount = null;
        Long maximumAmount = null;
        Boolean recurringPaymentEnabled = null;
        Boolean installmentPaymentEnabled = null;
        // PaymentMethodListResponse response = api.listAllPaymentMethodsForAMerchant(accountId, acceptedCountry, acceptedCurrency, minimumAmount, maximumAmount, recurringPaymentEnabled, installmentPaymentEnabled);

        // TODO: test validations
    }

    /**
     * List payment methods for a Merchant
     *
     * Lists the applicable payment methods for a particular Merchant ID. Use the client secret and publishable key authorization to list all relevant payment methods of the merchant for the payment corresponding to the client secret.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listAllPaymentMethodsForAMerchantTestQueryMap() {
        String accountId = null;
        List<Currency> acceptedCurrency = null;
        PaymentMethodsApi.ListAllPaymentMethodsForAMerchantQueryParams queryParams = new PaymentMethodsApi.ListAllPaymentMethodsForAMerchantQueryParams()
            .acceptedCountry(null)
            .minimumAmount(null)
            .maximumAmount(null)
            .recurringPaymentEnabled(null)
            .installmentPaymentEnabled(null);
        // PaymentMethodListResponse response = api.listAllPaymentMethodsForAMerchant(accountId, acceptedCurrency, queryParams);

    // TODO: test validations
    }
    
    /**
     * List customer saved payment methods for a Payment
     *
     * Lists all the applicable payment methods for a particular payment tied to the &#x60;client_secret&#x60;.
     */
    @Test
    void listCustomerPaymentMethodsTest() {
        String clientSecret = null;
        String customerId = null;
        List<String> acceptedCountry = null;
        List<Currency> acceptedCurrency = null;
        Long minimumAmount = null;
        Long maximumAmount = null;
        Boolean recurringPaymentEnabled = null;
        Boolean installmentPaymentEnabled = null;
        // CustomerPaymentMethodsListResponse response = api.listCustomerPaymentMethods(clientSecret, customerId, acceptedCountry, acceptedCurrency, minimumAmount, maximumAmount, recurringPaymentEnabled, installmentPaymentEnabled);

        // TODO: test validations
    }

    /**
     * List customer saved payment methods for a Payment
     *
     * Lists all the applicable payment methods for a particular payment tied to the &#x60;client_secret&#x60;.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listCustomerPaymentMethodsTestQueryMap() {
        String clientSecret = null;
        String customerId = null;
        List<Currency> acceptedCurrency = null;
        PaymentMethodsApi.ListCustomerPaymentMethodsQueryParams queryParams = new PaymentMethodsApi.ListCustomerPaymentMethodsQueryParams()
            .acceptedCountry(null)
            .minimumAmount(null)
            .maximumAmount(null)
            .recurringPaymentEnabled(null)
            .installmentPaymentEnabled(null);
        // CustomerPaymentMethodsListResponse response = api.listCustomerPaymentMethods(clientSecret, customerId, acceptedCurrency, queryParams);

    // TODO: test validations
    }
    
    /**
     * Payment Method - Retrieve
     *
     * Retrieves a payment method of a customer.
     */
    @Test
    void retrieveAPaymentMethodTest() {
        String methodId = null;
        // PaymentMethodResponse response = api.retrieveAPaymentMethod(methodId);

        // TODO: test validations
    }

    
    /**
     * Payment Method - Set Default Payment Method for Customer
     *
     * Set the Payment Method as Default for the Customer.
     */
    @Test
    void setThePaymentMethodAsDefaultTest() {
        String customerId = null;
        String paymentMethodId = null;
        // CustomerDefaultPaymentMethodResponse response = api.setThePaymentMethodAsDefault(customerId, paymentMethodId);

        // TODO: test validations
    }

    
    /**
     * Payment Method - Update
     *
     * Update an existing payment method of a customer. This API is useful for use cases such as updating the card number for expired cards to prevent discontinuity in recurring payments.
     */
    @Test
    void updateAPaymentMethodTest() {
        String methodId = null;
        PaymentMethodUpdate paymentMethodUpdate = null;
        // PaymentMethodResponse response = api.updateAPaymentMethod(methodId, paymentMethodUpdate);

        // TODO: test validations
    }

    
}

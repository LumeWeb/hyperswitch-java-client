package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.CustomerDeleteResponse;
import com.hyperswitch.client.model.CustomerRequest;
import com.hyperswitch.client.model.CustomerResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface CustomersApi extends ApiClient.Api {


  /**
   * Customers - Create
   * Creates a customer object and stores the customer details to be reused for future payments. Incase the customer already exists in the system, this API will respond with the customer details.
   * @param customerRequest  (required)
   * @return CustomerResponse
   */
  @RequestLine("POST /customers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomerResponse createACustomer(CustomerRequest customerRequest);

  /**
   * Customers - Create
   * Similar to <code>createACustomer</code> but it also returns the http response headers .
   * Creates a customer object and stores the customer details to be reused for future payments. Incase the customer already exists in the system, this API will respond with the customer details.
   * @param customerRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /customers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomerResponse> createACustomerWithHttpInfo(CustomerRequest customerRequest);



  /**
   * Customers - Delete
   * Delete a customer record.
   * @param customerId The unique identifier for the Customer (required)
   * @return CustomerDeleteResponse
   */
  @RequestLine("DELETE /customers/{customerId}")
  @Headers({
    "Accept: application/json",
  })
  CustomerDeleteResponse deleteACustomer(@Param("customerId") String customerId);

  /**
   * Customers - Delete
   * Similar to <code>deleteACustomer</code> but it also returns the http response headers .
   * Delete a customer record.
   * @param customerId The unique identifier for the Customer (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /customers/{customerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerDeleteResponse> deleteACustomerWithHttpInfo(@Param("customerId") String customerId);



  /**
   * Customers - List
   * Lists all the customers for a particular merchant id.
   * @return List&lt;CustomerResponse&gt;
   */
  @RequestLine("GET /customers/list")
  @Headers({
    "Accept: application/json",
  })
  List<CustomerResponse> listAllCustomersForAMerchant();

  /**
   * Customers - List
   * Similar to <code>listAllCustomersForAMerchant</code> but it also returns the http response headers .
   * Lists all the customers for a particular merchant id.
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers/list")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<CustomerResponse>> listAllCustomersForAMerchantWithHttpInfo();



  /**
   * Customers - Retrieve
   * Retrieves a customer&#39;s details.
   * @param customerId The unique identifier for the Customer (required)
   * @return CustomerResponse
   */
  @RequestLine("GET /customers/{customerId}")
  @Headers({
    "Accept: application/json",
  })
  CustomerResponse retrieveACustomer(@Param("customerId") String customerId);

  /**
   * Customers - Retrieve
   * Similar to <code>retrieveACustomer</code> but it also returns the http response headers .
   * Retrieves a customer&#39;s details.
   * @param customerId The unique identifier for the Customer (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers/{customerId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerResponse> retrieveACustomerWithHttpInfo(@Param("customerId") String customerId);



  /**
   * Customers - Update
   * Updates the customer&#39;s details in a customer object.
   * @param customerId The unique identifier for the Customer (required)
   * @param customerRequest  (required)
   * @return CustomerResponse
   */
  @RequestLine("POST /customers/{customerId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomerResponse updateACustomer(@Param("customerId") String customerId, CustomerRequest customerRequest);

  /**
   * Customers - Update
   * Similar to <code>updateACustomer</code> but it also returns the http response headers .
   * Updates the customer&#39;s details in a customer object.
   * @param customerId The unique identifier for the Customer (required)
   * @param customerRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /customers/{customerId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomerResponse> updateACustomerWithHttpInfo(@Param("customerId") String customerId, CustomerRequest customerRequest);


}

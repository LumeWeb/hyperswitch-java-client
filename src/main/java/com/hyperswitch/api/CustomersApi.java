package com.hyperswitch.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.model.ApiResponse;

import com.hyperswitch.model.CustomerDeleteResponse;
import com.hyperswitch.model.CustomerRequest;
import com.hyperswitch.model.CustomerResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public interface CustomersApi extends ApiClient.Api {


  /**
   * Customers - Create
   * Creates a customer object and stores the customer details to be reused for future payments. Incase the customer already exists in the system, this API will respond with the customer details.
   * @param customerRequest  (required)
   * @return CustomerResponse
   */
  @RequestLine("POST /v2/customers")
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
  @RequestLine("POST /v2/customers")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomerResponse> createACustomerWithHttpInfo(CustomerRequest customerRequest);



  /**
   * Customers - Delete
   * Delete a customer record.
   * @param id The unique identifier for the Customer (required)
   * @return CustomerDeleteResponse
   */
  @RequestLine("DELETE /v2/customers/{id}")
  @Headers({
    "Accept: application/json",
  })
  CustomerDeleteResponse deleteACustomer(@Param("id") String id);

  /**
   * Customers - Delete
   * Similar to <code>deleteACustomer</code> but it also returns the http response headers .
   * Delete a customer record.
   * @param id The unique identifier for the Customer (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /v2/customers/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerDeleteResponse> deleteACustomerWithHttpInfo(@Param("id") String id);



  /**
   * Customers - List
   * Lists all the customers for a particular merchant id.
   * @return List&lt;CustomerResponse&gt;
   */
  @RequestLine("GET /v2/customers/list")
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
  @RequestLine("GET /v2/customers/list")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<CustomerResponse>> listAllCustomersForAMerchantWithHttpInfo();



  /**
   * Customers - Retrieve
   * Retrieves a customer&#39;s details.
   * @param id The unique identifier for the Customer (required)
   * @return CustomerResponse
   */
  @RequestLine("GET /v2/customers/{id}")
  @Headers({
    "Accept: application/json",
  })
  CustomerResponse retrieveACustomer(@Param("id") String id);

  /**
   * Customers - Retrieve
   * Similar to <code>retrieveACustomer</code> but it also returns the http response headers .
   * Retrieves a customer&#39;s details.
   * @param id The unique identifier for the Customer (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /v2/customers/{id}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerResponse> retrieveACustomerWithHttpInfo(@Param("id") String id);



  /**
   * Customers - Update
   * Updates the customer&#39;s details in a customer object.
   * @param id The unique identifier for the Customer (required)
   * @param customerRequest  (required)
   * @return CustomerResponse
   */
  @RequestLine("POST /v2/customers/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomerResponse updateACustomer(@Param("id") String id, CustomerRequest customerRequest);

  /**
   * Customers - Update
   * Similar to <code>updateACustomer</code> but it also returns the http response headers .
   * Updates the customer&#39;s details in a customer object.
   * @param id The unique identifier for the Customer (required)
   * @param customerRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /v2/customers/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomerResponse> updateACustomerWithHttpInfo(@Param("id") String id, CustomerRequest customerRequest);


}

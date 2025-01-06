package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.Currency;
import com.hyperswitch.client.model.CustomerDefaultPaymentMethodResponse;
import com.hyperswitch.client.model.CustomerPaymentMethodsListResponse;
import com.hyperswitch.client.model.PaymentMethodCreate;
import com.hyperswitch.client.model.PaymentMethodDeleteResponse;
import com.hyperswitch.client.model.PaymentMethodListResponse;
import com.hyperswitch.client.model.PaymentMethodResponse;
import com.hyperswitch.client.model.PaymentMethodUpdate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface PaymentMethodsApi extends ApiClient.Api {


  /**
   * PaymentMethods - Create
   * Creates and stores a payment method against a customer. In case of cards, this API should be used only by PCI compliant merchants.
   * @param paymentMethodCreate  (required)
   * @return PaymentMethodResponse
   */
  @RequestLine("POST /payment_methods")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentMethodResponse createAPaymentMethod(PaymentMethodCreate paymentMethodCreate);

  /**
   * PaymentMethods - Create
   * Similar to <code>createAPaymentMethod</code> but it also returns the http response headers .
   * Creates and stores a payment method against a customer. In case of cards, this API should be used only by PCI compliant merchants.
   * @param paymentMethodCreate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payment_methods")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentMethodResponse> createAPaymentMethodWithHttpInfo(PaymentMethodCreate paymentMethodCreate);



  /**
   * Payment Method - Delete
   * Deletes a payment method of a customer.
   * @param methodId The unique identifier for the Payment Method (required)
   * @return PaymentMethodDeleteResponse
   */
  @RequestLine("DELETE /payment_methods/{methodId}")
  @Headers({
    "Accept: application/json",
  })
  PaymentMethodDeleteResponse deleteAPaymentMethod(@Param("methodId") String methodId);

  /**
   * Payment Method - Delete
   * Similar to <code>deleteAPaymentMethod</code> but it also returns the http response headers .
   * Deletes a payment method of a customer.
   * @param methodId The unique identifier for the Payment Method (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /payment_methods/{methodId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentMethodDeleteResponse> deleteAPaymentMethodWithHttpInfo(@Param("methodId") String methodId);



  /**
   * List payment methods for a Customer
   * Lists all the applicable payment methods for a particular Customer ID.
   * @param customerId The unique identifier for the customer account (required)
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return CustomerPaymentMethodsListResponse
   */
  @RequestLine("GET /customers/{customerId}/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  CustomerPaymentMethodsListResponse listAllPaymentMethodsForACustomer(@Param("customerId") String customerId, @Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);

  /**
   * List payment methods for a Customer
   * Similar to <code>listAllPaymentMethodsForACustomer</code> but it also returns the http response headers .
   * Lists all the applicable payment methods for a particular Customer ID.
   * @param customerId The unique identifier for the customer account (required)
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers/{customerId}/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerPaymentMethodsListResponse> listAllPaymentMethodsForACustomerWithHttpInfo(@Param("customerId") String customerId, @Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);


  /**
   * List payment methods for a Customer
   * Lists all the applicable payment methods for a particular Customer ID.
   * Note, this is equivalent to the other <code>listAllPaymentMethodsForACustomer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAllPaymentMethodsForACustomerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param customerId The unique identifier for the customer account (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
   *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
   *   <li>maximumAmount - The maximum amount accepted for processing by the particular payment method. (required)</li>
   *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
   *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
   *   </ul>
   * @return CustomerPaymentMethodsListResponse
   */
  @RequestLine("GET /customers/{customerId}/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
  "Accept: application/json",
  })
  CustomerPaymentMethodsListResponse listAllPaymentMethodsForACustomer(@Param("customerId") String customerId, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListAllPaymentMethodsForACustomerQueryParams queryParams);

  /**
  * List payment methods for a Customer
  * Lists all the applicable payment methods for a particular Customer ID.
  * Note, this is equivalent to the other <code>listAllPaymentMethodsForACustomer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param customerId The unique identifier for the customer account (required)
              * @param acceptedCurrency The three-letter ISO currency code (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
          *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
          *   <li>maximumAmount - The maximum amount accepted for processing by the particular payment method. (required)</li>
          *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
          *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
      *   </ul>
          * @return CustomerPaymentMethodsListResponse
      */
      @RequestLine("GET /customers/{customerId}/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<CustomerPaymentMethodsListResponse> listAllPaymentMethodsForACustomerWithHttpInfo(@Param("customerId") String customerId, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListAllPaymentMethodsForACustomerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAllPaymentMethodsForACustomer</code> method in a fluent style.
   */
  public static class ListAllPaymentMethodsForACustomerQueryParams extends HashMap<String, Object> {
    public ListAllPaymentMethodsForACustomerQueryParams acceptedCountry(final List<String> value) {
      put("accepted_country", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAllPaymentMethodsForACustomerQueryParams minimumAmount(final Long value) {
      put("minimum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForACustomerQueryParams maximumAmount(final Long value) {
      put("maximum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForACustomerQueryParams recurringPaymentEnabled(final Boolean value) {
      put("recurring_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForACustomerQueryParams installmentPaymentEnabled(final Boolean value) {
      put("installment_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List payment methods for a Merchant
   * Lists the applicable payment methods for a particular Merchant ID. Use the client secret and publishable key authorization to list all relevant payment methods of the merchant for the payment corresponding to the client secret.
   * @param accountId The unique identifier for the merchant account (required)
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return PaymentMethodListResponse
   */
  @RequestLine("GET /account/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  PaymentMethodListResponse listAllPaymentMethodsForAMerchant(@Param("accountId") String accountId, @Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);

  /**
   * List payment methods for a Merchant
   * Similar to <code>listAllPaymentMethodsForAMerchant</code> but it also returns the http response headers .
   * Lists the applicable payment methods for a particular Merchant ID. Use the client secret and publishable key authorization to list all relevant payment methods of the merchant for the payment corresponding to the client secret.
   * @param accountId The unique identifier for the merchant account (required)
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /account/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentMethodListResponse> listAllPaymentMethodsForAMerchantWithHttpInfo(@Param("accountId") String accountId, @Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);


  /**
   * List payment methods for a Merchant
   * Lists the applicable payment methods for a particular Merchant ID. Use the client secret and publishable key authorization to list all relevant payment methods of the merchant for the payment corresponding to the client secret.
   * Note, this is equivalent to the other <code>listAllPaymentMethodsForAMerchant</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAllPaymentMethodsForAMerchantQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param accountId The unique identifier for the merchant account (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
   *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
   *   <li>maximumAmount - The maximum amount accepted for processing by the particular payment method. (required)</li>
   *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
   *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
   *   </ul>
   * @return PaymentMethodListResponse
   */
  @RequestLine("GET /account/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
  "Accept: application/json",
  })
  PaymentMethodListResponse listAllPaymentMethodsForAMerchant(@Param("accountId") String accountId, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListAllPaymentMethodsForAMerchantQueryParams queryParams);

  /**
  * List payment methods for a Merchant
  * Lists the applicable payment methods for a particular Merchant ID. Use the client secret and publishable key authorization to list all relevant payment methods of the merchant for the payment corresponding to the client secret.
  * Note, this is equivalent to the other <code>listAllPaymentMethodsForAMerchant</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param accountId The unique identifier for the merchant account (required)
              * @param acceptedCurrency The three-letter ISO currency code (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
          *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
          *   <li>maximumAmount - The maximum amount accepted for processing by the particular payment method. (required)</li>
          *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
          *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
      *   </ul>
          * @return PaymentMethodListResponse
      */
      @RequestLine("GET /account/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PaymentMethodListResponse> listAllPaymentMethodsForAMerchantWithHttpInfo(@Param("accountId") String accountId, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListAllPaymentMethodsForAMerchantQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAllPaymentMethodsForAMerchant</code> method in a fluent style.
   */
  public static class ListAllPaymentMethodsForAMerchantQueryParams extends HashMap<String, Object> {
    public ListAllPaymentMethodsForAMerchantQueryParams acceptedCountry(final List<String> value) {
      put("accepted_country", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListAllPaymentMethodsForAMerchantQueryParams minimumAmount(final Long value) {
      put("minimum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForAMerchantQueryParams maximumAmount(final Long value) {
      put("maximum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForAMerchantQueryParams recurringPaymentEnabled(final Boolean value) {
      put("recurring_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
    public ListAllPaymentMethodsForAMerchantQueryParams installmentPaymentEnabled(final Boolean value) {
      put("installment_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * List customer saved payment methods for a Payment
   * Lists all the applicable payment methods for a particular payment tied to the &#x60;client_secret&#x60;.
   * @param clientSecret A secret known only to your client and the authorization server. Used for client side authentication (required)
   * @param customerId The unique identifier for the customer account (required)
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return CustomerPaymentMethodsListResponse
   */
  @RequestLine("GET /customers/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  CustomerPaymentMethodsListResponse listCustomerPaymentMethods(@Param("clientSecret") String clientSecret, @Param("customerId") String customerId, @Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);

  /**
   * List customer saved payment methods for a Payment
   * Similar to <code>listCustomerPaymentMethods</code> but it also returns the http response headers .
   * Lists all the applicable payment methods for a particular payment tied to the &#x60;client_secret&#x60;.
   * @param clientSecret A secret known only to your client and the authorization server. Used for client side authentication (required)
   * @param customerId The unique identifier for the customer account (required)
   * @param acceptedCountry The two-letter ISO currency code (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param minimumAmount The minimum amount accepted for processing by the particular payment method. (required)
   * @param maximumAmount The maximum amount accepted for processing by the particular payment method. (required)
   * @param recurringPaymentEnabled Indicates whether the payment method is eligible for recurring payments (required)
   * @param installmentPaymentEnabled Indicates whether the payment method is eligible for installment payments (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /customers/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerPaymentMethodsListResponse> listCustomerPaymentMethodsWithHttpInfo(@Param("clientSecret") String clientSecret, @Param("customerId") String customerId, @Param("acceptedCountry") List<String> acceptedCountry, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @Param("minimumAmount") Long minimumAmount, @Param("maximumAmount") Long maximumAmount, @Param("recurringPaymentEnabled") Boolean recurringPaymentEnabled, @Param("installmentPaymentEnabled") Boolean installmentPaymentEnabled);


  /**
   * List customer saved payment methods for a Payment
   * Lists all the applicable payment methods for a particular payment tied to the &#x60;client_secret&#x60;.
   * Note, this is equivalent to the other <code>listCustomerPaymentMethods</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListCustomerPaymentMethodsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param clientSecret A secret known only to your client and the authorization server. Used for client side authentication (required)
   * @param customerId The unique identifier for the customer account (required)
   * @param acceptedCurrency The three-letter ISO currency code (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
   *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
   *   <li>maximumAmount - The maximum amount accepted for processing by the particular payment method. (required)</li>
   *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
   *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
   *   </ul>
   * @return CustomerPaymentMethodsListResponse
   */
  @RequestLine("GET /customers/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
  @Headers({
  "Accept: application/json",
  })
  CustomerPaymentMethodsListResponse listCustomerPaymentMethods(@Param("clientSecret") String clientSecret, @Param("customerId") String customerId, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListCustomerPaymentMethodsQueryParams queryParams);

  /**
  * List customer saved payment methods for a Payment
  * Lists all the applicable payment methods for a particular payment tied to the &#x60;client_secret&#x60;.
  * Note, this is equivalent to the other <code>listCustomerPaymentMethods</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param clientSecret A secret known only to your client and the authorization server. Used for client side authentication (required)
              * @param customerId The unique identifier for the customer account (required)
              * @param acceptedCurrency The three-letter ISO currency code (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>acceptedCountry - The two-letter ISO currency code (required)</li>
          *   <li>minimumAmount - The minimum amount accepted for processing by the particular payment method. (required)</li>
          *   <li>maximumAmount - The maximum amount accepted for processing by the particular payment method. (required)</li>
          *   <li>recurringPaymentEnabled - Indicates whether the payment method is eligible for recurring payments (required)</li>
          *   <li>installmentPaymentEnabled - Indicates whether the payment method is eligible for installment payments (required)</li>
      *   </ul>
          * @return CustomerPaymentMethodsListResponse
      */
      @RequestLine("GET /customers/payment_methods?accepted_country={acceptedCountry}&minimum_amount={minimumAmount}&maximum_amount={maximumAmount}&recurring_payment_enabled={recurringPaymentEnabled}&installment_payment_enabled={installmentPaymentEnabled}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<CustomerPaymentMethodsListResponse> listCustomerPaymentMethodsWithHttpInfo(@Param("clientSecret") String clientSecret, @Param("customerId") String customerId, @Param("acceptedCurrency") List<Currency> acceptedCurrency, @QueryMap(encoded=true) ListCustomerPaymentMethodsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listCustomerPaymentMethods</code> method in a fluent style.
   */
  public static class ListCustomerPaymentMethodsQueryParams extends HashMap<String, Object> {
    public ListCustomerPaymentMethodsQueryParams acceptedCountry(final List<String> value) {
      put("accepted_country", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public ListCustomerPaymentMethodsQueryParams minimumAmount(final Long value) {
      put("minimum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListCustomerPaymentMethodsQueryParams maximumAmount(final Long value) {
      put("maximum_amount", EncodingUtils.encode(value));
      return this;
    }
    public ListCustomerPaymentMethodsQueryParams recurringPaymentEnabled(final Boolean value) {
      put("recurring_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
    public ListCustomerPaymentMethodsQueryParams installmentPaymentEnabled(final Boolean value) {
      put("installment_payment_enabled", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Payment Method - Retrieve
   * Retrieves a payment method of a customer.
   * @param methodId The unique identifier for the Payment Method (required)
   * @return PaymentMethodResponse
   */
  @RequestLine("GET /payment_methods/{methodId}")
  @Headers({
    "Accept: application/json",
  })
  PaymentMethodResponse retrieveAPaymentMethod(@Param("methodId") String methodId);

  /**
   * Payment Method - Retrieve
   * Similar to <code>retrieveAPaymentMethod</code> but it also returns the http response headers .
   * Retrieves a payment method of a customer.
   * @param methodId The unique identifier for the Payment Method (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payment_methods/{methodId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaymentMethodResponse> retrieveAPaymentMethodWithHttpInfo(@Param("methodId") String methodId);



  /**
   * Payment Method - Set Default Payment Method for Customer
   * Set the Payment Method as Default for the Customer.
   * @param customerId The unique identifier for the Customer (required)
   * @param paymentMethodId The unique identifier for the Payment Method (required)
   * @return CustomerDefaultPaymentMethodResponse
   */
  @RequestLine("GET /{customerId}/payment_methods/{paymentMethodId}/default")
  @Headers({
    "Accept: application/json",
  })
  CustomerDefaultPaymentMethodResponse setThePaymentMethodAsDefault(@Param("customerId") String customerId, @Param("paymentMethodId") String paymentMethodId);

  /**
   * Payment Method - Set Default Payment Method for Customer
   * Similar to <code>setThePaymentMethodAsDefault</code> but it also returns the http response headers .
   * Set the Payment Method as Default for the Customer.
   * @param customerId The unique identifier for the Customer (required)
   * @param paymentMethodId The unique identifier for the Payment Method (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /{customerId}/payment_methods/{paymentMethodId}/default")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CustomerDefaultPaymentMethodResponse> setThePaymentMethodAsDefaultWithHttpInfo(@Param("customerId") String customerId, @Param("paymentMethodId") String paymentMethodId);



  /**
   * Payment Method - Update
   * Update an existing payment method of a customer. This API is useful for use cases such as updating the card number for expired cards to prevent discontinuity in recurring payments.
   * @param methodId The unique identifier for the Payment Method (required)
   * @param paymentMethodUpdate  (required)
   * @return PaymentMethodResponse
   */
  @RequestLine("POST /payment_methods/{methodId}/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PaymentMethodResponse updateAPaymentMethod(@Param("methodId") String methodId, PaymentMethodUpdate paymentMethodUpdate);

  /**
   * Payment Method - Update
   * Similar to <code>updateAPaymentMethod</code> but it also returns the http response headers .
   * Update an existing payment method of a customer. This API is useful for use cases such as updating the card number for expired cards to prevent discontinuity in recurring payments.
   * @param methodId The unique identifier for the Payment Method (required)
   * @param paymentMethodUpdate  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payment_methods/{methodId}/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PaymentMethodResponse> updateAPaymentMethodWithHttpInfo(@Param("methodId") String methodId, PaymentMethodUpdate paymentMethodUpdate);


}

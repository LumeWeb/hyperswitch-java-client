package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface PayoutsApi extends ApiClient.Api {


  /**
   * Payouts - Cancel
   * 
   * @param payoutId The identifier for payout (required)
   * @param payoutCancelRequest  (required)
   * @return PayoutCreateResponse
   */
  @RequestLine("POST /payouts/{payoutId}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PayoutCreateResponse cancelAPayout(@Param("payoutId") String payoutId, PayoutCancelRequest payoutCancelRequest);

  /**
   * Payouts - Cancel
   * Similar to <code>cancelAPayout</code> but it also returns the http response headers .
   * 
   * @param payoutId The identifier for payout (required)
   * @param payoutCancelRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payouts/{payoutId}/cancel")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PayoutCreateResponse> cancelAPayoutWithHttpInfo(@Param("payoutId") String payoutId, PayoutCancelRequest payoutCancelRequest);



  /**
   * Payouts - Confirm
   * 
   * @param payoutId The identifier for payout (required)
   * @param payoutConfirmRequest  (required)
   * @return PayoutCreateResponse
   */
  @RequestLine("POST /payouts/{payoutId}/confirm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PayoutCreateResponse confirmAPayout(@Param("payoutId") String payoutId, PayoutConfirmRequest payoutConfirmRequest);

  /**
   * Payouts - Confirm
   * Similar to <code>confirmAPayout</code> but it also returns the http response headers .
   * 
   * @param payoutId The identifier for payout (required)
   * @param payoutConfirmRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payouts/{payoutId}/confirm")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PayoutCreateResponse> confirmAPayoutWithHttpInfo(@Param("payoutId") String payoutId, PayoutConfirmRequest payoutConfirmRequest);



  /**
   * Payouts - Create
   * 
   * @param payoutsCreateRequest  (required)
   * @return PayoutCreateResponse
   */
  @RequestLine("POST /payouts/create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PayoutCreateResponse createAPayout(PayoutsCreateRequest payoutsCreateRequest);

  /**
   * Payouts - Create
   * Similar to <code>createAPayout</code> but it also returns the http response headers .
   * 
   * @param payoutsCreateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payouts/create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PayoutCreateResponse> createAPayoutWithHttpInfo(PayoutsCreateRequest payoutsCreateRequest);



  /**
   * Payouts - List using filters
   * 
   * @param payoutListFilterConstraints  (required)
   * @return PayoutListResponse
   */
  @RequestLine("POST /payouts/list")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PayoutListResponse filterPayoutsUsingSpecificConstraints(PayoutListFilterConstraints payoutListFilterConstraints);

  /**
   * Payouts - List using filters
   * Similar to <code>filterPayoutsUsingSpecificConstraints</code> but it also returns the http response headers .
   * 
   * @param payoutListFilterConstraints  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payouts/list")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PayoutListResponse> filterPayoutsUsingSpecificConstraintsWithHttpInfo(PayoutListFilterConstraints payoutListFilterConstraints);



  /**
   * Payouts - Fulfill
   * 
   * @param payoutId The identifier for payout (required)
   * @param payoutFulfillRequest  (required)
   * @return PayoutCreateResponse
   */
  @RequestLine("POST /payouts/{payoutId}/fulfill")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PayoutCreateResponse fulfillAPayout(@Param("payoutId") String payoutId, PayoutFulfillRequest payoutFulfillRequest);

  /**
   * Payouts - Fulfill
   * Similar to <code>fulfillAPayout</code> but it also returns the http response headers .
   * 
   * @param payoutId The identifier for payout (required)
   * @param payoutFulfillRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payouts/{payoutId}/fulfill")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PayoutCreateResponse> fulfillAPayoutWithHttpInfo(@Param("payoutId") String payoutId, PayoutFulfillRequest payoutFulfillRequest);



  /**
   * Payouts - List available filters
   * 
   * @param timeRange  (required)
   * @return PayoutListFilters
   */
  @RequestLine("POST /payouts/filter")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PayoutListFilters listAvailablePayoutFilters(TimeRange timeRange);

  /**
   * Payouts - List available filters
   * Similar to <code>listAvailablePayoutFilters</code> but it also returns the http response headers .
   * 
   * @param timeRange  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payouts/filter")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PayoutListFilters> listAvailablePayoutFiltersWithHttpInfo(TimeRange timeRange);



  /**
   * Payouts - List
   * 
   * @param customerId The identifier for customer (required)
   * @param startingAfter A cursor for use in pagination, fetch the next list after some object (required)
   * @param endingBefore A cursor for use in pagination, fetch the previous list before some object (required)
   * @param limit limit on the number of objects to return (required)
   * @param created The time at which payout is created (required)
   * @param timeRange The time range for which objects are needed. TimeRange has two fields start_time and end_time from which objects can be filtered as per required scenarios (created_at, time less than, greater than etc). (required)
   * @return PayoutListResponse
   */
  @RequestLine("GET /payouts/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&time_range={timeRange}")
  @Headers({
    "Accept: application/json",
  })
  PayoutListResponse listPayoutsUsingGenericConstraints(@Param("customerId") String customerId, @Param("startingAfter") String startingAfter, @Param("endingBefore") String endingBefore, @Param("limit") String limit, @Param("created") String created, @Param("timeRange") String timeRange);

  /**
   * Payouts - List
   * Similar to <code>listPayoutsUsingGenericConstraints</code> but it also returns the http response headers .
   * 
   * @param customerId The identifier for customer (required)
   * @param startingAfter A cursor for use in pagination, fetch the next list after some object (required)
   * @param endingBefore A cursor for use in pagination, fetch the previous list before some object (required)
   * @param limit limit on the number of objects to return (required)
   * @param created The time at which payout is created (required)
   * @param timeRange The time range for which objects are needed. TimeRange has two fields start_time and end_time from which objects can be filtered as per required scenarios (created_at, time less than, greater than etc). (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payouts/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&time_range={timeRange}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PayoutListResponse> listPayoutsUsingGenericConstraintsWithHttpInfo(@Param("customerId") String customerId, @Param("startingAfter") String startingAfter, @Param("endingBefore") String endingBefore, @Param("limit") String limit, @Param("created") String created, @Param("timeRange") String timeRange);


  /**
   * Payouts - List
   * 
   * Note, this is equivalent to the other <code>listPayoutsUsingGenericConstraints</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListPayoutsUsingGenericConstraintsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>customerId - The identifier for customer (required)</li>
   *   <li>startingAfter - A cursor for use in pagination, fetch the next list after some object (required)</li>
   *   <li>endingBefore - A cursor for use in pagination, fetch the previous list before some object (required)</li>
   *   <li>limit - limit on the number of objects to return (required)</li>
   *   <li>created - The time at which payout is created (required)</li>
   *   <li>timeRange - The time range for which objects are needed. TimeRange has two fields start_time and end_time from which objects can be filtered as per required scenarios (created_at, time less than, greater than etc). (required)</li>
   *   </ul>
   * @return PayoutListResponse
   */
  @RequestLine("GET /payouts/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&time_range={timeRange}")
  @Headers({
  "Accept: application/json",
  })
  PayoutListResponse listPayoutsUsingGenericConstraints(@QueryMap(encoded=true) ListPayoutsUsingGenericConstraintsQueryParams queryParams);

  /**
  * Payouts - List
  * 
  * Note, this is equivalent to the other <code>listPayoutsUsingGenericConstraints</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>customerId - The identifier for customer (required)</li>
          *   <li>startingAfter - A cursor for use in pagination, fetch the next list after some object (required)</li>
          *   <li>endingBefore - A cursor for use in pagination, fetch the previous list before some object (required)</li>
          *   <li>limit - limit on the number of objects to return (required)</li>
          *   <li>created - The time at which payout is created (required)</li>
          *   <li>timeRange - The time range for which objects are needed. TimeRange has two fields start_time and end_time from which objects can be filtered as per required scenarios (created_at, time less than, greater than etc). (required)</li>
      *   </ul>
          * @return PayoutListResponse
      */
      @RequestLine("GET /payouts/list?customer_id={customerId}&starting_after={startingAfter}&ending_before={endingBefore}&limit={limit}&created={created}&time_range={timeRange}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PayoutListResponse> listPayoutsUsingGenericConstraintsWithHttpInfo(@QueryMap(encoded=true) ListPayoutsUsingGenericConstraintsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listPayoutsUsingGenericConstraints</code> method in a fluent style.
   */
  public static class ListPayoutsUsingGenericConstraintsQueryParams extends HashMap<String, Object> {
    public ListPayoutsUsingGenericConstraintsQueryParams customerId(final String value) {
      put("customer_id", EncodingUtils.encode(value));
      return this;
    }
    public ListPayoutsUsingGenericConstraintsQueryParams startingAfter(final String value) {
      put("starting_after", EncodingUtils.encode(value));
      return this;
    }
    public ListPayoutsUsingGenericConstraintsQueryParams endingBefore(final String value) {
      put("ending_before", EncodingUtils.encode(value));
      return this;
    }
    public ListPayoutsUsingGenericConstraintsQueryParams limit(final String value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListPayoutsUsingGenericConstraintsQueryParams created(final String value) {
      put("created", EncodingUtils.encode(value));
      return this;
    }
    public ListPayoutsUsingGenericConstraintsQueryParams timeRange(final String value) {
      put("time_range", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Payouts - Retrieve
   * 
   * @param payoutId The identifier for payout (required)
   * @param forceSync Sync with the connector to get the payout details (defaults to false) (optional)
   * @return PayoutCreateResponse
   */
  @RequestLine("GET /payouts/{payoutId}?force_sync={forceSync}")
  @Headers({
    "Accept: application/json",
  })
  PayoutCreateResponse retrieveAPayout(@Param("payoutId") String payoutId, @Param("forceSync") Boolean forceSync);

  /**
   * Payouts - Retrieve
   * Similar to <code>retrieveAPayout</code> but it also returns the http response headers .
   * 
   * @param payoutId The identifier for payout (required)
   * @param forceSync Sync with the connector to get the payout details (defaults to false) (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /payouts/{payoutId}?force_sync={forceSync}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PayoutCreateResponse> retrieveAPayoutWithHttpInfo(@Param("payoutId") String payoutId, @Param("forceSync") Boolean forceSync);


  /**
   * Payouts - Retrieve
   * 
   * Note, this is equivalent to the other <code>retrieveAPayout</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAPayoutQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param payoutId The identifier for payout (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>forceSync - Sync with the connector to get the payout details (defaults to false) (optional)</li>
   *   </ul>
   * @return PayoutCreateResponse
   */
  @RequestLine("GET /payouts/{payoutId}?force_sync={forceSync}")
  @Headers({
  "Accept: application/json",
  })
  PayoutCreateResponse retrieveAPayout(@Param("payoutId") String payoutId, @QueryMap(encoded=true) RetrieveAPayoutQueryParams queryParams);

  /**
  * Payouts - Retrieve
  * 
  * Note, this is equivalent to the other <code>retrieveAPayout</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param payoutId The identifier for payout (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>forceSync - Sync with the connector to get the payout details (defaults to false) (optional)</li>
      *   </ul>
          * @return PayoutCreateResponse
      */
      @RequestLine("GET /payouts/{payoutId}?force_sync={forceSync}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PayoutCreateResponse> retrieveAPayoutWithHttpInfo(@Param("payoutId") String payoutId, @QueryMap(encoded=true) RetrieveAPayoutQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAPayout</code> method in a fluent style.
   */
  public static class RetrieveAPayoutQueryParams extends HashMap<String, Object> {
    public RetrieveAPayoutQueryParams forceSync(final Boolean value) {
      put("force_sync", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Payouts - Update
   * 
   * @param payoutId The identifier for payout (required)
   * @param payoutUpdateRequest  (required)
   * @return PayoutCreateResponse
   */
  @RequestLine("POST /payouts/{payoutId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PayoutCreateResponse updateAPayout(@Param("payoutId") String payoutId, PayoutUpdateRequest payoutUpdateRequest);

  /**
   * Payouts - Update
   * Similar to <code>updateAPayout</code> but it also returns the http response headers .
   * 
   * @param payoutId The identifier for payout (required)
   * @param payoutUpdateRequest  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /payouts/{payoutId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PayoutCreateResponse> updateAPayoutWithHttpInfo(@Param("payoutId") String payoutId, PayoutUpdateRequest payoutUpdateRequest);


}

package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.EncodingUtils;
import com.hyperswitch.client.model.ApiResponse;

import com.hyperswitch.client.model.EventListItemResponse;
import com.hyperswitch.client.model.EventRetrieveResponse;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public interface EventApi extends ApiClient.Api {


  /**
   * Events - Delivery Attempt List
   * List all delivery attempts for the specified Event.
   * @param merchantId The unique identifier for the Merchant Account. (required)
   * @param eventId The unique identifier for the Event (required)
   * @return List&lt;EventRetrieveResponse&gt;
   */
  @RequestLine("GET /events/{merchantId}/{eventId}/attempts")
  @Headers({
    "Accept: application/json",
  })
  List<EventRetrieveResponse> listAllDeliveryAttemptsForAnEvent(@Param("merchantId") String merchantId, @Param("eventId") String eventId);

  /**
   * Events - Delivery Attempt List
   * Similar to <code>listAllDeliveryAttemptsForAnEvent</code> but it also returns the http response headers .
   * List all delivery attempts for the specified Event.
   * @param merchantId The unique identifier for the Merchant Account. (required)
   * @param eventId The unique identifier for the Event (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /events/{merchantId}/{eventId}/attempts")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<EventRetrieveResponse>> listAllDeliveryAttemptsForAnEventWithHttpInfo(@Param("merchantId") String merchantId, @Param("eventId") String eventId);



  /**
   * Events - List
   * List all Events associated with a Merchant Account or Profile.
   * @param merchantId The unique identifier for the Merchant Account. (required)
   * @param createdAfter Only include Events created after the specified time. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)
   * @param createdBefore Only include Events created before the specified time. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)
   * @param limit The maximum number of Events to include in the response. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)
   * @param offset The number of Events to skip when retrieving the list of Events.                            Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)
   * @param objectId Only include Events associated with the specified object (Payment Intent ID, Refund ID, etc.). Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)
   * @param profileId Only include Events associated with the Profile identified by the specified Profile ID. (optional)
   * @return List&lt;EventListItemResponse&gt;
   */
  @RequestLine("GET /events/{merchantId}?created_after={createdAfter}&created_before={createdBefore}&limit={limit}&offset={offset}&object_id={objectId}&profile_id={profileId}")
  @Headers({
    "Accept: application/json",
  })
  List<EventListItemResponse> listAllEventsAssociatedWithAMerchantAccountOrProfile(@Param("merchantId") String merchantId, @Param("createdAfter") OffsetDateTime createdAfter, @Param("createdBefore") OffsetDateTime createdBefore, @Param("limit") Long limit, @Param("offset") Long offset, @Param("objectId") String objectId, @Param("profileId") String profileId);

  /**
   * Events - List
   * Similar to <code>listAllEventsAssociatedWithAMerchantAccountOrProfile</code> but it also returns the http response headers .
   * List all Events associated with a Merchant Account or Profile.
   * @param merchantId The unique identifier for the Merchant Account. (required)
   * @param createdAfter Only include Events created after the specified time. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)
   * @param createdBefore Only include Events created before the specified time. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)
   * @param limit The maximum number of Events to include in the response. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)
   * @param offset The number of Events to skip when retrieving the list of Events.                            Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)
   * @param objectId Only include Events associated with the specified object (Payment Intent ID, Refund ID, etc.). Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)
   * @param profileId Only include Events associated with the Profile identified by the specified Profile ID. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /events/{merchantId}?created_after={createdAfter}&created_before={createdBefore}&limit={limit}&offset={offset}&object_id={objectId}&profile_id={profileId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<EventListItemResponse>> listAllEventsAssociatedWithAMerchantAccountOrProfileWithHttpInfo(@Param("merchantId") String merchantId, @Param("createdAfter") OffsetDateTime createdAfter, @Param("createdBefore") OffsetDateTime createdBefore, @Param("limit") Long limit, @Param("offset") Long offset, @Param("objectId") String objectId, @Param("profileId") String profileId);


  /**
   * Events - List
   * List all Events associated with a Merchant Account or Profile.
   * Note, this is equivalent to the other <code>listAllEventsAssociatedWithAMerchantAccountOrProfile</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param merchantId The unique identifier for the Merchant Account. (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>createdAfter - Only include Events created after the specified time. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)</li>
   *   <li>createdBefore - Only include Events created before the specified time. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)</li>
   *   <li>limit - The maximum number of Events to include in the response. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)</li>
   *   <li>offset - The number of Events to skip when retrieving the list of Events.                            Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)</li>
   *   <li>objectId - Only include Events associated with the specified object (Payment Intent ID, Refund ID, etc.). Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)</li>
   *   <li>profileId - Only include Events associated with the Profile identified by the specified Profile ID. (optional)</li>
   *   </ul>
   * @return List&lt;EventListItemResponse&gt;
   */
  @RequestLine("GET /events/{merchantId}?created_after={createdAfter}&created_before={createdBefore}&limit={limit}&offset={offset}&object_id={objectId}&profile_id={profileId}")
  @Headers({
  "Accept: application/json",
  })
  List<EventListItemResponse> listAllEventsAssociatedWithAMerchantAccountOrProfile(@Param("merchantId") String merchantId, @QueryMap(encoded=true) ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams queryParams);

  /**
  * Events - List
  * List all Events associated with a Merchant Account or Profile.
  * Note, this is equivalent to the other <code>listAllEventsAssociatedWithAMerchantAccountOrProfile</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param merchantId The unique identifier for the Merchant Account. (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>createdAfter - Only include Events created after the specified time. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)</li>
          *   <li>createdBefore - Only include Events created before the specified time. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)</li>
          *   <li>limit - The maximum number of Events to include in the response. Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)</li>
          *   <li>offset - The number of Events to skip when retrieving the list of Events.                            Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)</li>
          *   <li>objectId - Only include Events associated with the specified object (Payment Intent ID, Refund ID, etc.). Either only &#x60;object_id&#x60; must be specified, or one or more of &#x60;created_after&#x60;, &#x60;created_before&#x60;, &#x60;limit&#x60; and &#x60;offset&#x60; must be specified. (optional)</li>
          *   <li>profileId - Only include Events associated with the Profile identified by the specified Profile ID. (optional)</li>
      *   </ul>
          * @return List&lt;EventListItemResponse&gt;
      */
      @RequestLine("GET /events/{merchantId}?created_after={createdAfter}&created_before={createdBefore}&limit={limit}&offset={offset}&object_id={objectId}&profile_id={profileId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<List<EventListItemResponse>> listAllEventsAssociatedWithAMerchantAccountOrProfileWithHttpInfo(@Param("merchantId") String merchantId, @QueryMap(encoded=true) ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>listAllEventsAssociatedWithAMerchantAccountOrProfile</code> method in a fluent style.
   */
  public static class ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams extends HashMap<String, Object> {
    public ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams createdAfter(final OffsetDateTime value) {
      put("created_after", EncodingUtils.encode(value));
      return this;
    }
    public ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams createdBefore(final OffsetDateTime value) {
      put("created_before", EncodingUtils.encode(value));
      return this;
    }
    public ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams limit(final Long value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams offset(final Long value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
    public ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams objectId(final String value) {
      put("object_id", EncodingUtils.encode(value));
      return this;
    }
    public ListAllEventsAssociatedWithAMerchantAccountOrProfileQueryParams profileId(final String value) {
      put("profile_id", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Events - Manual Retry
   * Manually retry the delivery of the specified Event.
   * @param merchantId The unique identifier for the Merchant Account. (required)
   * @param eventId The unique identifier for the Event (required)
   * @return EventRetrieveResponse
   */
  @RequestLine("POST /events/{merchantId}/{eventId}/retry")
  @Headers({
    "Accept: application/json",
  })
  EventRetrieveResponse manuallyRetryTheDeliveryOfAnEvent(@Param("merchantId") String merchantId, @Param("eventId") String eventId);

  /**
   * Events - Manual Retry
   * Similar to <code>manuallyRetryTheDeliveryOfAnEvent</code> but it also returns the http response headers .
   * Manually retry the delivery of the specified Event.
   * @param merchantId The unique identifier for the Merchant Account. (required)
   * @param eventId The unique identifier for the Event (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /events/{merchantId}/{eventId}/retry")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EventRetrieveResponse> manuallyRetryTheDeliveryOfAnEventWithHttpInfo(@Param("merchantId") String merchantId, @Param("eventId") String eventId);


}

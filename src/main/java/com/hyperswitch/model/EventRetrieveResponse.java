/*
 * Hyperswitch - API Documentation
 *  ## Get started  Hyperswitch provides a collection of APIs that enable you to process and manage payments. Our APIs accept and return JSON in the HTTP body, and return standard HTTP response codes.  You can consume the APIs directly using your favorite HTTP/REST library.  We have a testing environment referred to \"sandbox\", which you can setup to test API calls without affecting production data. Currently, our sandbox environment is live while our production environment is under development and will be available soon. You can sign up on our Dashboard to get API keys to access Hyperswitch API.  ### Environment  Use the following base URLs when making requests to the APIs:  | Environment   |  Base URL                          | |---------------|------------------------------------| | Sandbox       | <https://sandbox.hyperswitch.io>   | | Production    | <https://api.hyperswitch.io>       |  ## Authentication  When you sign up on our [dashboard](https://app.hyperswitch.io) and create a merchant account, you are given a secret key (also referred as api-key) and a publishable key. You may authenticate all API requests with Hyperswitch server by providing the appropriate key in the request Authorization header.  | Key             |  Description                                                                                  | |-----------------|-----------------------------------------------------------------------------------------------| | api-key         | Private key. Used to authenticate all API requests from your merchant server                  | | publishable key | Unique identifier for your account. Used to authenticate API requests from your app's client  |  Never share your secret api keys. Keep them guarded and secure. 
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: hyperswitch@juspay.in
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hyperswitch.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.EventClass;
import com.hyperswitch.model.EventType;
import com.hyperswitch.model.OutgoingWebhookRequestContent;
import com.hyperswitch.model.OutgoingWebhookResponseContent;
import com.hyperswitch.model.WebhookDeliveryAttempt;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The response body for retrieving an event.
 */
@JsonPropertyOrder({
  EventRetrieveResponse.JSON_PROPERTY_EVENT_ID,
  EventRetrieveResponse.JSON_PROPERTY_MERCHANT_ID,
  EventRetrieveResponse.JSON_PROPERTY_PROFILE_ID,
  EventRetrieveResponse.JSON_PROPERTY_OBJECT_ID,
  EventRetrieveResponse.JSON_PROPERTY_EVENT_TYPE,
  EventRetrieveResponse.JSON_PROPERTY_EVENT_CLASS,
  EventRetrieveResponse.JSON_PROPERTY_IS_DELIVERY_SUCCESSFUL,
  EventRetrieveResponse.JSON_PROPERTY_INITIAL_ATTEMPT_ID,
  EventRetrieveResponse.JSON_PROPERTY_CREATED,
  EventRetrieveResponse.JSON_PROPERTY_REQUEST,
  EventRetrieveResponse.JSON_PROPERTY_RESPONSE,
  EventRetrieveResponse.JSON_PROPERTY_DELIVERY_ATTEMPT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventRetrieveResponse {
  public static final String JSON_PROPERTY_EVENT_ID = "event_id";
  private String eventId;

  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  private String merchantId;

  public static final String JSON_PROPERTY_PROFILE_ID = "profile_id";
  private String profileId;

  public static final String JSON_PROPERTY_OBJECT_ID = "object_id";
  private String objectId;

  public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
  private EventType eventType;

  public static final String JSON_PROPERTY_EVENT_CLASS = "event_class";
  private EventClass eventClass;

  public static final String JSON_PROPERTY_IS_DELIVERY_SUCCESSFUL = "is_delivery_successful";
  private Boolean isDeliverySuccessful;

  public static final String JSON_PROPERTY_INITIAL_ATTEMPT_ID = "initial_attempt_id";
  private String initialAttemptId;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private OutgoingWebhookRequestContent request;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private OutgoingWebhookResponseContent response;

  public static final String JSON_PROPERTY_DELIVERY_ATTEMPT = "delivery_attempt";
  private JsonNullable<WebhookDeliveryAttempt> deliveryAttempt = JsonNullable.<WebhookDeliveryAttempt>undefined();

  public EventRetrieveResponse() {
  }

  public EventRetrieveResponse eventId(String eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * The identifier for the Event.
   * @return eventId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventId() {
    return eventId;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public EventRetrieveResponse merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The identifier for the Merchant Account.
   * @return merchantId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantId() {
    return merchantId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public EventRetrieveResponse profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * The identifier for the Business Profile.
   * @return profileId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProfileId() {
    return profileId;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public EventRetrieveResponse objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * The identifier for the object (Payment Intent ID, Refund ID, etc.)
   * @return objectId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObjectId() {
    return objectId;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public EventRetrieveResponse eventType(EventType eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EventType getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }


  public EventRetrieveResponse eventClass(EventClass eventClass) {
    
    this.eventClass = eventClass;
    return this;
  }

   /**
   * Get eventClass
   * @return eventClass
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EventClass getEventClass() {
    return eventClass;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventClass(EventClass eventClass) {
    this.eventClass = eventClass;
  }


  public EventRetrieveResponse isDeliverySuccessful(Boolean isDeliverySuccessful) {
    
    this.isDeliverySuccessful = isDeliverySuccessful;
    return this;
  }

   /**
   * Indicates whether the webhook delivery attempt was successful.
   * @return isDeliverySuccessful
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_DELIVERY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsDeliverySuccessful() {
    return isDeliverySuccessful;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELIVERY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDeliverySuccessful(Boolean isDeliverySuccessful) {
    this.isDeliverySuccessful = isDeliverySuccessful;
  }


  public EventRetrieveResponse initialAttemptId(String initialAttemptId) {
    
    this.initialAttemptId = initialAttemptId;
    return this;
  }

   /**
   * The identifier for the initial delivery attempt. This will be the same as &#x60;event_id&#x60; for the initial delivery attempt.
   * @return initialAttemptId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INITIAL_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInitialAttemptId() {
    return initialAttemptId;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInitialAttemptId(String initialAttemptId) {
    this.initialAttemptId = initialAttemptId;
  }


  public EventRetrieveResponse created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Time at which the event was created.
   * @return created
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public EventRetrieveResponse request(OutgoingWebhookRequestContent request) {
    
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OutgoingWebhookRequestContent getRequest() {
    return request;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequest(OutgoingWebhookRequestContent request) {
    this.request = request;
  }


  public EventRetrieveResponse response(OutgoingWebhookResponseContent response) {
    
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OutgoingWebhookResponseContent getResponse() {
    return response;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResponse(OutgoingWebhookResponseContent response) {
    this.response = response;
  }


  public EventRetrieveResponse deliveryAttempt(WebhookDeliveryAttempt deliveryAttempt) {
    this.deliveryAttempt = JsonNullable.<WebhookDeliveryAttempt>of(deliveryAttempt);
    
    return this;
  }

   /**
   * Get deliveryAttempt
   * @return deliveryAttempt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public WebhookDeliveryAttempt getDeliveryAttempt() {
        return deliveryAttempt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELIVERY_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<WebhookDeliveryAttempt> getDeliveryAttempt_JsonNullable() {
    return deliveryAttempt;
  }
  
  @JsonProperty(JSON_PROPERTY_DELIVERY_ATTEMPT)
  public void setDeliveryAttempt_JsonNullable(JsonNullable<WebhookDeliveryAttempt> deliveryAttempt) {
    this.deliveryAttempt = deliveryAttempt;
  }

  public void setDeliveryAttempt(WebhookDeliveryAttempt deliveryAttempt) {
    this.deliveryAttempt = JsonNullable.<WebhookDeliveryAttempt>of(deliveryAttempt);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRetrieveResponse eventRetrieveResponse = (EventRetrieveResponse) o;
    return Objects.equals(this.eventId, eventRetrieveResponse.eventId) &&
        Objects.equals(this.merchantId, eventRetrieveResponse.merchantId) &&
        Objects.equals(this.profileId, eventRetrieveResponse.profileId) &&
        Objects.equals(this.objectId, eventRetrieveResponse.objectId) &&
        Objects.equals(this.eventType, eventRetrieveResponse.eventType) &&
        Objects.equals(this.eventClass, eventRetrieveResponse.eventClass) &&
        Objects.equals(this.isDeliverySuccessful, eventRetrieveResponse.isDeliverySuccessful) &&
        Objects.equals(this.initialAttemptId, eventRetrieveResponse.initialAttemptId) &&
        Objects.equals(this.created, eventRetrieveResponse.created) &&
        Objects.equals(this.request, eventRetrieveResponse.request) &&
        Objects.equals(this.response, eventRetrieveResponse.response) &&
        equalsNullable(this.deliveryAttempt, eventRetrieveResponse.deliveryAttempt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, merchantId, profileId, objectId, eventType, eventClass, isDeliverySuccessful, initialAttemptId, created, request, response, hashCodeNullable(deliveryAttempt));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRetrieveResponse {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventClass: ").append(toIndentedString(eventClass)).append("\n");
    sb.append("    isDeliverySuccessful: ").append(toIndentedString(isDeliverySuccessful)).append("\n");
    sb.append("    initialAttemptId: ").append(toIndentedString(initialAttemptId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    deliveryAttempt: ").append(toIndentedString(deliveryAttempt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


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


package com.hyperswitch.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.client.model.EventClass;
import com.hyperswitch.client.model.EventType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
* The response body for each item when listing events.
*/
    @JsonPropertyOrder({
        EventListItemResponse.JSON_PROPERTY_EVENT_ID,
        EventListItemResponse.JSON_PROPERTY_MERCHANT_ID,
        EventListItemResponse.JSON_PROPERTY_PROFILE_ID,
        EventListItemResponse.JSON_PROPERTY_OBJECT_ID,
        EventListItemResponse.JSON_PROPERTY_EVENT_TYPE,
        EventListItemResponse.JSON_PROPERTY_EVENT_CLASS,
        EventListItemResponse.JSON_PROPERTY_IS_DELIVERY_SUCCESSFUL,
        EventListItemResponse.JSON_PROPERTY_INITIAL_ATTEMPT_ID,
        EventListItemResponse.JSON_PROPERTY_CREATED
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class EventListItemResponse {
        public static final String JSON_PROPERTY_EVENT_ID = "event_id";
    @javax.annotation.Nonnull
            private String eventId;

        public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
    @javax.annotation.Nonnull
            private String merchantId;

        public static final String JSON_PROPERTY_PROFILE_ID = "profile_id";
    @javax.annotation.Nonnull
            private String profileId;

        public static final String JSON_PROPERTY_OBJECT_ID = "object_id";
    @javax.annotation.Nonnull
            private String objectId;

        public static final String JSON_PROPERTY_EVENT_TYPE = "event_type";
    @javax.annotation.Nonnull
            private EventType eventType;

        public static final String JSON_PROPERTY_EVENT_CLASS = "event_class";
    @javax.annotation.Nonnull
            private EventClass eventClass;

        public static final String JSON_PROPERTY_IS_DELIVERY_SUCCESSFUL = "is_delivery_successful";
    @javax.annotation.Nonnull
            private Boolean isDeliverySuccessful;

        public static final String JSON_PROPERTY_INITIAL_ATTEMPT_ID = "initial_attempt_id";
    @javax.annotation.Nonnull
            private String initialAttemptId;

        public static final String JSON_PROPERTY_CREATED = "created";
    @javax.annotation.Nonnull
            private OffsetDateTime created;

public EventListItemResponse() {
}

        public EventListItemResponse eventId(@javax.annotation.Nonnull String eventId) {
        
        this.eventId = eventId;
        return this;
        }

    /**
        * The identifier for the Event.
    * @return eventId
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getEventId() {
        return eventId;
    }


          @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventId(@javax.annotation.Nonnull String eventId) {
            this.eventId = eventId;
        }

        public EventListItemResponse merchantId(@javax.annotation.Nonnull String merchantId) {
        
        this.merchantId = merchantId;
        return this;
        }

    /**
        * The identifier for the Merchant Account.
    * @return merchantId
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getMerchantId() {
        return merchantId;
    }


          @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantId(@javax.annotation.Nonnull String merchantId) {
            this.merchantId = merchantId;
        }

        public EventListItemResponse profileId(@javax.annotation.Nonnull String profileId) {
        
        this.profileId = profileId;
        return this;
        }

    /**
        * The identifier for the Business Profile.
    * @return profileId
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getProfileId() {
        return profileId;
    }


          @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileId(@javax.annotation.Nonnull String profileId) {
            this.profileId = profileId;
        }

        public EventListItemResponse objectId(@javax.annotation.Nonnull String objectId) {
        
        this.objectId = objectId;
        return this;
        }

    /**
        * The identifier for the object (Payment Intent ID, Refund ID, etc.)
    * @return objectId
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getObjectId() {
        return objectId;
    }


          @JsonProperty(JSON_PROPERTY_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObjectId(@javax.annotation.Nonnull String objectId) {
            this.objectId = objectId;
        }

        public EventListItemResponse eventType(@javax.annotation.Nonnull EventType eventType) {
        
        this.eventType = eventType;
        return this;
        }

    /**
        * Get eventType
    * @return eventType
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public EventType getEventType() {
        return eventType;
    }


          @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventType(@javax.annotation.Nonnull EventType eventType) {
            this.eventType = eventType;
        }

        public EventListItemResponse eventClass(@javax.annotation.Nonnull EventClass eventClass) {
        
        this.eventClass = eventClass;
        return this;
        }

    /**
        * Get eventClass
    * @return eventClass
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_EVENT_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public EventClass getEventClass() {
        return eventClass;
    }


          @JsonProperty(JSON_PROPERTY_EVENT_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventClass(@javax.annotation.Nonnull EventClass eventClass) {
            this.eventClass = eventClass;
        }

        public EventListItemResponse isDeliverySuccessful(@javax.annotation.Nonnull Boolean isDeliverySuccessful) {
        
        this.isDeliverySuccessful = isDeliverySuccessful;
        return this;
        }

    /**
        * Indicates whether the webhook delivery attempt was successful.
    * @return isDeliverySuccessful
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_IS_DELIVERY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Boolean getIsDeliverySuccessful() {
        return isDeliverySuccessful;
    }


          @JsonProperty(JSON_PROPERTY_IS_DELIVERY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsDeliverySuccessful(@javax.annotation.Nonnull Boolean isDeliverySuccessful) {
            this.isDeliverySuccessful = isDeliverySuccessful;
        }

        public EventListItemResponse initialAttemptId(@javax.annotation.Nonnull String initialAttemptId) {
        
        this.initialAttemptId = initialAttemptId;
        return this;
        }

    /**
        * The identifier for the initial delivery attempt. This will be the same as &#x60;event_id&#x60; for the initial delivery attempt.
    * @return initialAttemptId
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_INITIAL_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getInitialAttemptId() {
        return initialAttemptId;
    }


          @JsonProperty(JSON_PROPERTY_INITIAL_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInitialAttemptId(@javax.annotation.Nonnull String initialAttemptId) {
            this.initialAttemptId = initialAttemptId;
        }

        public EventListItemResponse created(@javax.annotation.Nonnull OffsetDateTime created) {
        
        this.created = created;
        return this;
        }

    /**
        * Time at which the event was created.
    * @return created
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public OffsetDateTime getCreated() {
        return created;
    }


          @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(@javax.annotation.Nonnull OffsetDateTime created) {
            this.created = created;
        }

@Override
public boolean equals(Object o) {
    if (this == o) {
    return true;
    }
    if (o == null || getClass() != o.getClass()) {
    return false;
    }
        EventListItemResponse eventListItemResponse = (EventListItemResponse) o;
        return Objects.equals(this.eventId, eventListItemResponse.eventId) &&
        Objects.equals(this.merchantId, eventListItemResponse.merchantId) &&
        Objects.equals(this.profileId, eventListItemResponse.profileId) &&
        Objects.equals(this.objectId, eventListItemResponse.objectId) &&
        Objects.equals(this.eventType, eventListItemResponse.eventType) &&
        Objects.equals(this.eventClass, eventListItemResponse.eventClass) &&
        Objects.equals(this.isDeliverySuccessful, eventListItemResponse.isDeliverySuccessful) &&
        Objects.equals(this.initialAttemptId, eventListItemResponse.initialAttemptId) &&
        Objects.equals(this.created, eventListItemResponse.created);
}

    @Override
    public int hashCode() {
        return Objects.hash(eventId, merchantId, profileId, objectId, eventType, eventClass, isDeliverySuccessful, initialAttemptId, created);
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventListItemResponse {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
        sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventClass: ").append(toIndentedString(eventClass)).append("\n");
        sb.append("    isDeliverySuccessful: ").append(toIndentedString(isDeliverySuccessful)).append("\n");
        sb.append("    initialAttemptId: ").append(toIndentedString(initialAttemptId)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

        /**
        * Convert the instance into URL query string.
        *
        * @return URL query string
        */
        public String toUrlQueryString() {
        return toUrlQueryString(null);
        }

        /**
        * Convert the instance into URL query string.
        *
        * @param prefix prefix of the query string
        * @return URL query string
        */
        public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
        // style=form, explode=true, e.g. /pet?name=cat&type=manx
        prefix = "";
        } else {
        // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
        prefix = prefix + "[";
        suffix = "]";
        containerSuffix = "]";
        containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

            // add `event_id` to the URL query string
                        if (getEventId() != null) {
                        try {
                        joiner.add(String.format("%sevent_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventId()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `merchant_id` to the URL query string
                        if (getMerchantId() != null) {
                        try {
                        joiner.add(String.format("%smerchant_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantId()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `profile_id` to the URL query string
                        if (getProfileId() != null) {
                        try {
                        joiner.add(String.format("%sprofile_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProfileId()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `object_id` to the URL query string
                        if (getObjectId() != null) {
                        try {
                        joiner.add(String.format("%sobject_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getObjectId()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `event_type` to the URL query string
                            if (getEventType() != null) {
                            try {
                            joiner.add(String.format("%sevent_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventType()), "UTF-8").replaceAll("\\+", "%20")));
                            } catch (UnsupportedEncodingException e) {
                            // Should never happen, UTF-8 is always supported
                            throw new RuntimeException(e);
                            }
                            }

            // add `event_class` to the URL query string
                            if (getEventClass() != null) {
                            try {
                            joiner.add(String.format("%sevent_class%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventClass()), "UTF-8").replaceAll("\\+", "%20")));
                            } catch (UnsupportedEncodingException e) {
                            // Should never happen, UTF-8 is always supported
                            throw new RuntimeException(e);
                            }
                            }

            // add `is_delivery_successful` to the URL query string
                        if (getIsDeliverySuccessful() != null) {
                        try {
                        joiner.add(String.format("%sis_delivery_successful%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsDeliverySuccessful()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `initial_attempt_id` to the URL query string
                        if (getInitialAttemptId() != null) {
                        try {
                        joiner.add(String.format("%sinitial_attempt_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInitialAttemptId()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `created` to the URL query string
                            if (getCreated() != null) {
                            try {
                            joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreated()), "UTF-8").replaceAll("\\+", "%20")));
                            } catch (UnsupportedEncodingException e) {
                            // Should never happen, UTF-8 is always supported
                            throw new RuntimeException(e);
                            }
                            }

        return joiner.toString();
        }

    }


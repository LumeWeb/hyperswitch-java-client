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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PayoutListConstraintsAllOf
 */
@JsonPropertyOrder({
  PayoutListConstraintsAllOf.JSON_PROPERTY_CUSTOMER_ID,
  PayoutListConstraintsAllOf.JSON_PROPERTY_STARTING_AFTER,
  PayoutListConstraintsAllOf.JSON_PROPERTY_ENDING_BEFORE,
  PayoutListConstraintsAllOf.JSON_PROPERTY_LIMIT,
  PayoutListConstraintsAllOf.JSON_PROPERTY_CREATED
})
@JsonTypeName("PayoutListConstraints_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PayoutListConstraintsAllOf {
  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STARTING_AFTER = "starting_after";
  private JsonNullable<String> startingAfter = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENDING_BEFORE = "ending_before";
  private JsonNullable<String> endingBefore = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit = 10;

  public static final String JSON_PROPERTY_CREATED = "created";
  private JsonNullable<OffsetDateTime> created = JsonNullable.<OffsetDateTime>undefined();

  public PayoutListConstraintsAllOf() {
  }

  public PayoutListConstraintsAllOf customerId(String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
    
    return this;
  }

   /**
   * The identifier for customer
   * @return customerId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCustomerId() {
        return customerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomerId_JsonNullable() {
    return customerId;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  public void setCustomerId_JsonNullable(JsonNullable<String> customerId) {
    this.customerId = customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
  }


  public PayoutListConstraintsAllOf startingAfter(String startingAfter) {
    this.startingAfter = JsonNullable.<String>of(startingAfter);
    
    return this;
  }

   /**
   * A cursor for use in pagination, fetch the next list after some object
   * @return startingAfter
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getStartingAfter() {
        return startingAfter.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STARTING_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStartingAfter_JsonNullable() {
    return startingAfter;
  }
  
  @JsonProperty(JSON_PROPERTY_STARTING_AFTER)
  public void setStartingAfter_JsonNullable(JsonNullable<String> startingAfter) {
    this.startingAfter = startingAfter;
  }

  public void setStartingAfter(String startingAfter) {
    this.startingAfter = JsonNullable.<String>of(startingAfter);
  }


  public PayoutListConstraintsAllOf endingBefore(String endingBefore) {
    this.endingBefore = JsonNullable.<String>of(endingBefore);
    
    return this;
  }

   /**
   * A cursor for use in pagination, fetch the previous list before some object
   * @return endingBefore
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEndingBefore() {
        return endingBefore.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENDING_BEFORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEndingBefore_JsonNullable() {
    return endingBefore;
  }
  
  @JsonProperty(JSON_PROPERTY_ENDING_BEFORE)
  public void setEndingBefore_JsonNullable(JsonNullable<String> endingBefore) {
    this.endingBefore = endingBefore;
  }

  public void setEndingBefore(String endingBefore) {
    this.endingBefore = JsonNullable.<String>of(endingBefore);
  }


  public PayoutListConstraintsAllOf limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * limit on the number of objects to return
   * minimum: 0
   * maximum: 100
   * @return limit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public PayoutListConstraintsAllOf created(OffsetDateTime created) {
    this.created = JsonNullable.<OffsetDateTime>of(created);
    
    return this;
  }

   /**
   * The time at which payout is created
   * @return created
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getCreated() {
        return created.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreated_JsonNullable() {
    return created;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED)
  public void setCreated_JsonNullable(JsonNullable<OffsetDateTime> created) {
    this.created = created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = JsonNullable.<OffsetDateTime>of(created);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutListConstraintsAllOf payoutListConstraintsAllOf = (PayoutListConstraintsAllOf) o;
    return equalsNullable(this.customerId, payoutListConstraintsAllOf.customerId) &&
        equalsNullable(this.startingAfter, payoutListConstraintsAllOf.startingAfter) &&
        equalsNullable(this.endingBefore, payoutListConstraintsAllOf.endingBefore) &&
        Objects.equals(this.limit, payoutListConstraintsAllOf.limit) &&
        equalsNullable(this.created, payoutListConstraintsAllOf.created);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(customerId), hashCodeNullable(startingAfter), hashCodeNullable(endingBefore), limit, hashCodeNullable(created));
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
    sb.append("class PayoutListConstraintsAllOf {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    startingAfter: ").append(toIndentedString(startingAfter)).append("\n");
    sb.append("    endingBefore: ").append(toIndentedString(endingBefore)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

}


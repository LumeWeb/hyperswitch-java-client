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


package com.lumeweb.hyperswitch.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * AmountFilter
 */
@JsonPropertyOrder({
  AmountFilter.JSON_PROPERTY_START_AMOUNT,
  AmountFilter.JSON_PROPERTY_END_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class AmountFilter {
  public static final String JSON_PROPERTY_START_AMOUNT = "start_amount";
  private JsonNullable<Long> startAmount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_END_AMOUNT = "end_amount";
  private JsonNullable<Long> endAmount = JsonNullable.<Long>undefined();

  public AmountFilter() { 
  }

  public AmountFilter startAmount(@javax.annotation.Nullable Long startAmount) {
    this.startAmount = JsonNullable.<Long>of(startAmount);
    return this;
  }

  /**
   * The start amount to filter list of transactions which are greater than or equal to the start amount
   * @return startAmount
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Long getStartAmount() {
        return startAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getStartAmount_JsonNullable() {
    return startAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_START_AMOUNT)
  public void setStartAmount_JsonNullable(JsonNullable<Long> startAmount) {
    this.startAmount = startAmount;
  }

  public void setStartAmount(@javax.annotation.Nullable Long startAmount) {
    this.startAmount = JsonNullable.<Long>of(startAmount);
  }


  public AmountFilter endAmount(@javax.annotation.Nullable Long endAmount) {
    this.endAmount = JsonNullable.<Long>of(endAmount);
    return this;
  }

  /**
   * The end amount to filter list of transactions which are less than or equal to the end amount
   * @return endAmount
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Long getEndAmount() {
        return endAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getEndAmount_JsonNullable() {
    return endAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_END_AMOUNT)
  public void setEndAmount_JsonNullable(JsonNullable<Long> endAmount) {
    this.endAmount = endAmount;
  }

  public void setEndAmount(@javax.annotation.Nullable Long endAmount) {
    this.endAmount = JsonNullable.<Long>of(endAmount);
  }


  /**
   * Return true if this AmountFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountFilter amountFilter = (AmountFilter) o;
    return equalsNullable(this.startAmount, amountFilter.startAmount) &&
        equalsNullable(this.endAmount, amountFilter.endAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(startAmount), hashCodeNullable(endAmount));
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
    sb.append("class AmountFilter {\n");
    sb.append("    startAmount: ").append(toIndentedString(startAmount)).append("\n");
    sb.append("    endAmount: ").append(toIndentedString(endAmount)).append("\n");
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

    // add `start_amount` to the URL query string
    if (getStartAmount() != null) {
      joiner.add(String.format("%sstart_amount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStartAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `end_amount` to the URL query string
    if (getEndAmount() != null) {
      joiner.add(String.format("%send_amount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEndAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


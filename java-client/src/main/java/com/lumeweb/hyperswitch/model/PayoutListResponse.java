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
import com.lumeweb.hyperswitch.model.PayoutCreateResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * PayoutListResponse
 */
@JsonPropertyOrder({
  PayoutListResponse.JSON_PROPERTY_SIZE,
  PayoutListResponse.JSON_PROPERTY_DATA,
  PayoutListResponse.JSON_PROPERTY_TOTAL_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class PayoutListResponse {
  public static final String JSON_PROPERTY_SIZE = "size";
  @javax.annotation.Nonnull
  private Integer size;

  public static final String JSON_PROPERTY_DATA = "data";
  @javax.annotation.Nonnull
  private List<PayoutCreateResponse> data = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private JsonNullable<Long> totalCount = JsonNullable.<Long>undefined();

  public PayoutListResponse() { 
  }

  public PayoutListResponse size(@javax.annotation.Nonnull Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The number of payouts included in the list
   * minimum: 0
   * @return size
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(@javax.annotation.Nonnull Integer size) {
    this.size = size;
  }


  public PayoutListResponse data(@javax.annotation.Nonnull List<PayoutCreateResponse> data) {
    this.data = data;
    return this;
  }

  public PayoutListResponse addDataItem(PayoutCreateResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * The list of payouts response objects
   * @return data
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<PayoutCreateResponse> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(@javax.annotation.Nonnull List<PayoutCreateResponse> data) {
    this.data = data;
  }


  public PayoutListResponse totalCount(@javax.annotation.Nullable Long totalCount) {
    this.totalCount = JsonNullable.<Long>of(totalCount);
    return this;
  }

  /**
   * The total number of available payouts for given constraints
   * @return totalCount
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Long getTotalCount() {
        return totalCount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getTotalCount_JsonNullable() {
    return totalCount;
  }
  
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  public void setTotalCount_JsonNullable(JsonNullable<Long> totalCount) {
    this.totalCount = totalCount;
  }

  public void setTotalCount(@javax.annotation.Nullable Long totalCount) {
    this.totalCount = JsonNullable.<Long>of(totalCount);
  }


  /**
   * Return true if this PayoutListResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutListResponse payoutListResponse = (PayoutListResponse) o;
    return Objects.equals(this.size, payoutListResponse.size) &&
        Objects.equals(this.data, payoutListResponse.data) &&
        equalsNullable(this.totalCount, payoutListResponse.totalCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, data, hashCodeNullable(totalCount));
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
    sb.append("class PayoutListResponse {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `data` to the URL query string
    if (getData() != null) {
      for (int i = 0; i < getData().size(); i++) {
        if (getData().get(i) != null) {
          joiner.add(getData().get(i).toUrlQueryString(String.format("%sdata%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `total_count` to the URL query string
    if (getTotalCount() != null) {
      joiner.add(String.format("%stotal_count%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTotalCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


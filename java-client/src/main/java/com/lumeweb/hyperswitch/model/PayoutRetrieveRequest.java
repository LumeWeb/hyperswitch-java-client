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
 * PayoutRetrieveRequest
 */
@JsonPropertyOrder({
  PayoutRetrieveRequest.JSON_PROPERTY_PAYOUT_ID,
  PayoutRetrieveRequest.JSON_PROPERTY_FORCE_SYNC,
  PayoutRetrieveRequest.JSON_PROPERTY_MERCHANT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class PayoutRetrieveRequest {
  public static final String JSON_PROPERTY_PAYOUT_ID = "payout_id";
  @javax.annotation.Nonnull
  private String payoutId;

  public static final String JSON_PROPERTY_FORCE_SYNC = "force_sync";
  private JsonNullable<Boolean> forceSync = JsonNullable.<Boolean>of(false);

  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  private JsonNullable<String> merchantId = JsonNullable.<String>undefined();

  public PayoutRetrieveRequest() { 
  }

  public PayoutRetrieveRequest payoutId(@javax.annotation.Nonnull String payoutId) {
    this.payoutId = payoutId;
    return this;
  }

  /**
   * Unique identifier for the payout. This ensures idempotency for multiple payouts that have been done by a single merchant. This field is auto generated and is returned in the API response.
   * @return payoutId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYOUT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPayoutId() {
    return payoutId;
  }


  @JsonProperty(JSON_PROPERTY_PAYOUT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayoutId(@javax.annotation.Nonnull String payoutId) {
    this.payoutId = payoutId;
  }


  public PayoutRetrieveRequest forceSync(@javax.annotation.Nullable Boolean forceSync) {
    this.forceSync = JsonNullable.<Boolean>of(forceSync);
    return this;
  }

  /**
   * &#x60;force_sync&#x60; with the connector to get payout details (defaults to false)
   * @return forceSync
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Boolean getForceSync() {
        return forceSync.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORCE_SYNC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getForceSync_JsonNullable() {
    return forceSync;
  }
  
  @JsonProperty(JSON_PROPERTY_FORCE_SYNC)
  public void setForceSync_JsonNullable(JsonNullable<Boolean> forceSync) {
    this.forceSync = forceSync;
  }

  public void setForceSync(@javax.annotation.Nullable Boolean forceSync) {
    this.forceSync = JsonNullable.<Boolean>of(forceSync);
  }


  public PayoutRetrieveRequest merchantId(@javax.annotation.Nullable String merchantId) {
    this.merchantId = JsonNullable.<String>of(merchantId);
    return this;
  }

  /**
   * The identifier for the Merchant Account.
   * @return merchantId
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getMerchantId() {
        return merchantId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMerchantId_JsonNullable() {
    return merchantId;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  public void setMerchantId_JsonNullable(JsonNullable<String> merchantId) {
    this.merchantId = merchantId;
  }

  public void setMerchantId(@javax.annotation.Nullable String merchantId) {
    this.merchantId = JsonNullable.<String>of(merchantId);
  }


  /**
   * Return true if this PayoutRetrieveRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutRetrieveRequest payoutRetrieveRequest = (PayoutRetrieveRequest) o;
    return Objects.equals(this.payoutId, payoutRetrieveRequest.payoutId) &&
        equalsNullable(this.forceSync, payoutRetrieveRequest.forceSync) &&
        equalsNullable(this.merchantId, payoutRetrieveRequest.merchantId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(payoutId, hashCodeNullable(forceSync), hashCodeNullable(merchantId));
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
    sb.append("class PayoutRetrieveRequest {\n");
    sb.append("    payoutId: ").append(toIndentedString(payoutId)).append("\n");
    sb.append("    forceSync: ").append(toIndentedString(forceSync)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

    // add `payout_id` to the URL query string
    if (getPayoutId() != null) {
      joiner.add(String.format("%spayout_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPayoutId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `force_sync` to the URL query string
    if (getForceSync() != null) {
      joiner.add(String.format("%sforce_sync%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getForceSync()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `merchant_id` to the URL query string
    if (getMerchantId() != null) {
      joiner.add(String.format("%smerchant_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMerchantId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


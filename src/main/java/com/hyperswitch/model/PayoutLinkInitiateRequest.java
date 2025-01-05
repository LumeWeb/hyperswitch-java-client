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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.hyperswitch.client.ApiClient;
/**
 * PayoutLinkInitiateRequest
 */
@JsonPropertyOrder({
  PayoutLinkInitiateRequest.JSON_PROPERTY_MERCHANT_ID,
  PayoutLinkInitiateRequest.JSON_PROPERTY_PAYOUT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class PayoutLinkInitiateRequest {
  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  @javax.annotation.Nonnull
  private String merchantId;

  public static final String JSON_PROPERTY_PAYOUT_ID = "payout_id";
  @javax.annotation.Nonnull
  private String payoutId;

  public PayoutLinkInitiateRequest() { 
  }

  public PayoutLinkInitiateRequest merchantId(@javax.annotation.Nonnull String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * Get merchantId
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


  public PayoutLinkInitiateRequest payoutId(@javax.annotation.Nonnull String payoutId) {
    this.payoutId = payoutId;
    return this;
  }

  /**
   * Get payoutId
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


  /**
   * Return true if this PayoutLinkInitiateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutLinkInitiateRequest payoutLinkInitiateRequest = (PayoutLinkInitiateRequest) o;
    return Objects.equals(this.merchantId, payoutLinkInitiateRequest.merchantId) &&
        Objects.equals(this.payoutId, payoutLinkInitiateRequest.payoutId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, payoutId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutLinkInitiateRequest {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    payoutId: ").append(toIndentedString(payoutId)).append("\n");
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

    // add `merchant_id` to the URL query string
    if (getMerchantId() != null) {
      joiner.add(String.format("%smerchant_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMerchantId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `payout_id` to the URL query string
    if (getPayoutId() != null) {
      joiner.add(String.format("%spayout_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPayoutId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


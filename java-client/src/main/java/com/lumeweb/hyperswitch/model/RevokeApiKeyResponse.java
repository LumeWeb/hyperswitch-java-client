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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * The response body for revoking an API Key.
 */
@JsonPropertyOrder({
  RevokeApiKeyResponse.JSON_PROPERTY_MERCHANT_ID,
  RevokeApiKeyResponse.JSON_PROPERTY_KEY_ID,
  RevokeApiKeyResponse.JSON_PROPERTY_REVOKED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class RevokeApiKeyResponse {
  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  @javax.annotation.Nonnull
  private String merchantId;

  public static final String JSON_PROPERTY_KEY_ID = "key_id";
  @javax.annotation.Nonnull
  private String keyId;

  public static final String JSON_PROPERTY_REVOKED = "revoked";
  @javax.annotation.Nonnull
  private Boolean revoked;

  public RevokeApiKeyResponse() { 
  }

  public RevokeApiKeyResponse merchantId(@javax.annotation.Nonnull String merchantId) {
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


  public RevokeApiKeyResponse keyId(@javax.annotation.Nonnull String keyId) {
    this.keyId = keyId;
    return this;
  }

  /**
   * The identifier for the API Key.
   * @return keyId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKeyId() {
    return keyId;
  }


  @JsonProperty(JSON_PROPERTY_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeyId(@javax.annotation.Nonnull String keyId) {
    this.keyId = keyId;
  }


  public RevokeApiKeyResponse revoked(@javax.annotation.Nonnull Boolean revoked) {
    this.revoked = revoked;
    return this;
  }

  /**
   * Indicates whether the API key was revoked or not.
   * @return revoked
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REVOKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRevoked() {
    return revoked;
  }


  @JsonProperty(JSON_PROPERTY_REVOKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRevoked(@javax.annotation.Nonnull Boolean revoked) {
    this.revoked = revoked;
  }


  /**
   * Return true if this RevokeApiKeyResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevokeApiKeyResponse revokeApiKeyResponse = (RevokeApiKeyResponse) o;
    return Objects.equals(this.merchantId, revokeApiKeyResponse.merchantId) &&
        Objects.equals(this.keyId, revokeApiKeyResponse.keyId) &&
        Objects.equals(this.revoked, revokeApiKeyResponse.revoked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, keyId, revoked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevokeApiKeyResponse {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
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

    // add `key_id` to the URL query string
    if (getKeyId() != null) {
      joiner.add(String.format("%skey_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getKeyId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `revoked` to the URL query string
    if (getRevoked() != null) {
      joiner.add(String.format("%srevoked%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRevoked()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MerchantConnectorId
 */
@JsonPropertyOrder({
  MerchantConnectorId.JSON_PROPERTY_MERCHANT_ID,
  MerchantConnectorId.JSON_PROPERTY_MERCHANT_CONNECTOR_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantConnectorId {
  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  private String merchantId;

  public static final String JSON_PROPERTY_MERCHANT_CONNECTOR_ID = "merchant_connector_id";
  private String merchantConnectorId;

  public MerchantConnectorId() {
  }

  public MerchantConnectorId merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
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


  public MerchantConnectorId merchantConnectorId(String merchantConnectorId) {
    
    this.merchantConnectorId = merchantConnectorId;
    return this;
  }

   /**
   * Get merchantConnectorId
   * @return merchantConnectorId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantConnectorId() {
    return merchantConnectorId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantConnectorId(String merchantConnectorId) {
    this.merchantConnectorId = merchantConnectorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantConnectorId merchantConnectorId = (MerchantConnectorId) o;
    return Objects.equals(this.merchantId, merchantConnectorId.merchantId) &&
        Objects.equals(this.merchantConnectorId, merchantConnectorId.merchantConnectorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, merchantConnectorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantConnectorId {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantConnectorId: ").append(toIndentedString(merchantConnectorId)).append("\n");
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
      try {
        joiner.add(String.format("%smerchant_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchant_connector_id` to the URL query string
    if (getMerchantConnectorId() != null) {
      try {
        joiner.add(String.format("%smerchant_connector_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantConnectorId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


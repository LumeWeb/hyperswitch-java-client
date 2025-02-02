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
import com.hyperswitch.client.model.GooglePayPaymentMethodInfo;
import com.hyperswitch.client.model.GpayTokenizationData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GooglePayWalletData
 */
@JsonPropertyOrder({
  GooglePayWalletData.JSON_PROPERTY_TYPE,
  GooglePayWalletData.JSON_PROPERTY_DESCRIPTION,
  GooglePayWalletData.JSON_PROPERTY_INFO,
  GooglePayWalletData.JSON_PROPERTY_TOKENIZATION_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class GooglePayWalletData {
  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nonnull
  private String type;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nonnull
  private String description;

  public static final String JSON_PROPERTY_INFO = "info";
  @javax.annotation.Nonnull
  private GooglePayPaymentMethodInfo info;

  public static final String JSON_PROPERTY_TOKENIZATION_DATA = "tokenization_data";
  @javax.annotation.Nonnull
  private GpayTokenizationData tokenizationData;

  public GooglePayWalletData() {
  }

  public GooglePayWalletData type(@javax.annotation.Nonnull String type) {
    
    this.type = type;
    return this;
  }

  /**
   * The type of payment method
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(@javax.annotation.Nonnull String type) {
    this.type = type;
  }

  public GooglePayWalletData description(@javax.annotation.Nonnull String description) {
    
    this.description = description;
    return this;
  }

  /**
   * User-facing message to describe the payment method that funds this transaction.
   * @return description
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }

  public GooglePayWalletData info(@javax.annotation.Nonnull GooglePayPaymentMethodInfo info) {
    
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GooglePayPaymentMethodInfo getInfo() {
    return info;
  }


  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInfo(@javax.annotation.Nonnull GooglePayPaymentMethodInfo info) {
    this.info = info;
  }

  public GooglePayWalletData tokenizationData(@javax.annotation.Nonnull GpayTokenizationData tokenizationData) {
    
    this.tokenizationData = tokenizationData;
    return this;
  }

  /**
   * Get tokenizationData
   * @return tokenizationData
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOKENIZATION_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GpayTokenizationData getTokenizationData() {
    return tokenizationData;
  }


  @JsonProperty(JSON_PROPERTY_TOKENIZATION_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokenizationData(@javax.annotation.Nonnull GpayTokenizationData tokenizationData) {
    this.tokenizationData = tokenizationData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePayWalletData googlePayWalletData = (GooglePayWalletData) o;
    return Objects.equals(this.type, googlePayWalletData.type) &&
        Objects.equals(this.description, googlePayWalletData.description) &&
        Objects.equals(this.info, googlePayWalletData.info) &&
        Objects.equals(this.tokenizationData, googlePayWalletData.tokenizationData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, info, tokenizationData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePayWalletData {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    tokenizationData: ").append(toIndentedString(tokenizationData)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `info` to the URL query string
    if (getInfo() != null) {
      joiner.add(getInfo().toUrlQueryString(prefix + "info" + suffix));
    }

    // add `tokenization_data` to the URL query string
    if (getTokenizationData() != null) {
      joiner.add(getTokenizationData().toUrlQueryString(prefix + "tokenization_data" + suffix));
    }

    return joiner.toString();
  }

}


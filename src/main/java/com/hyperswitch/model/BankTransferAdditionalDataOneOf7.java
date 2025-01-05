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
 * BankTransferAdditionalDataOneOf7
 */
@JsonPropertyOrder({
  BankTransferAdditionalDataOneOf7.JSON_PROPERTY_BRI_VA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class BankTransferAdditionalDataOneOf7 {
  public static final String JSON_PROPERTY_BRI_VA = "bri_va";
  @javax.annotation.Nonnull
  private Object briVa;

  public BankTransferAdditionalDataOneOf7() { 
  }

  public BankTransferAdditionalDataOneOf7 briVa(@javax.annotation.Nonnull Object briVa) {
    this.briVa = briVa;
    return this;
  }

  /**
   * Get briVa
   * @return briVa
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BRI_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Object getBriVa() {
    return briVa;
  }


  @JsonProperty(JSON_PROPERTY_BRI_VA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBriVa(@javax.annotation.Nonnull Object briVa) {
    this.briVa = briVa;
  }


  /**
   * Return true if this BankTransferAdditionalData_oneOf_7 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferAdditionalDataOneOf7 bankTransferAdditionalDataOneOf7 = (BankTransferAdditionalDataOneOf7) o;
    return Objects.equals(this.briVa, bankTransferAdditionalDataOneOf7.briVa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(briVa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferAdditionalDataOneOf7 {\n");
    sb.append("    briVa: ").append(toIndentedString(briVa)).append("\n");
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

    // add `bri_va` to the URL query string
    if (getBriVa() != null) {
      joiner.add(String.format("%sbri_va%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBriVa()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


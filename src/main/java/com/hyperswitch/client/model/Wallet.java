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
import com.hyperswitch.client.model.Paypal;
import com.hyperswitch.client.model.Venmo;
import com.hyperswitch.client.model.WalletOneOf;
import com.hyperswitch.client.model.WalletOneOf1;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Wallet
 */
@JsonPropertyOrder({
  Wallet.JSON_PROPERTY_PAYPAL,
  Wallet.JSON_PROPERTY_VENMO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class Wallet {
  public static final String JSON_PROPERTY_PAYPAL = "paypal";
  @javax.annotation.Nonnull
  private Paypal paypal;

  public static final String JSON_PROPERTY_VENMO = "venmo";
  @javax.annotation.Nonnull
  private Venmo venmo;

  public Wallet() {
  }

  public Wallet paypal(@javax.annotation.Nonnull Paypal paypal) {
    
    this.paypal = paypal;
    return this;
  }

  /**
   * Get paypal
   * @return paypal
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYPAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Paypal getPaypal() {
    return paypal;
  }


  @JsonProperty(JSON_PROPERTY_PAYPAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaypal(@javax.annotation.Nonnull Paypal paypal) {
    this.paypal = paypal;
  }

  public Wallet venmo(@javax.annotation.Nonnull Venmo venmo) {
    
    this.venmo = venmo;
    return this;
  }

  /**
   * Get venmo
   * @return venmo
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VENMO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Venmo getVenmo() {
    return venmo;
  }


  @JsonProperty(JSON_PROPERTY_VENMO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVenmo(@javax.annotation.Nonnull Venmo venmo) {
    this.venmo = venmo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wallet wallet = (Wallet) o;
    return Objects.equals(this.paypal, wallet.paypal) &&
        Objects.equals(this.venmo, wallet.venmo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paypal, venmo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wallet {\n");
    sb.append("    paypal: ").append(toIndentedString(paypal)).append("\n");
    sb.append("    venmo: ").append(toIndentedString(venmo)).append("\n");
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

    // add `paypal` to the URL query string
    if (getPaypal() != null) {
      joiner.add(getPaypal().toUrlQueryString(prefix + "paypal" + suffix));
    }

    // add `venmo` to the URL query string
    if (getVenmo() != null) {
      joiner.add(getVenmo().toUrlQueryString(prefix + "venmo" + suffix));
    }

    return joiner.toString();
  }

}


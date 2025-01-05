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
import com.lumeweb.hyperswitch.model.PaymentMethod;
import com.lumeweb.hyperswitch.model.RequestPaymentMethodTypes;
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
 * Details of all the payment methods enabled for the connector for the given merchant account
 */
@JsonPropertyOrder({
  PaymentMethodsEnabled.JSON_PROPERTY_PAYMENT_METHOD,
  PaymentMethodsEnabled.JSON_PROPERTY_PAYMENT_METHOD_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class PaymentMethodsEnabled {
  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  @javax.annotation.Nonnull
  private PaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPES = "payment_method_types";
  private JsonNullable<List<RequestPaymentMethodTypes>> paymentMethodTypes = JsonNullable.<List<RequestPaymentMethodTypes>>undefined();

  public PaymentMethodsEnabled() { 
  }

  public PaymentMethodsEnabled paymentMethod(@javax.annotation.Nonnull PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethod(@javax.annotation.Nonnull PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentMethodsEnabled paymentMethodTypes(@javax.annotation.Nullable List<RequestPaymentMethodTypes> paymentMethodTypes) {
    this.paymentMethodTypes = JsonNullable.<List<RequestPaymentMethodTypes>>of(paymentMethodTypes);
    return this;
  }

  public PaymentMethodsEnabled addPaymentMethodTypesItem(RequestPaymentMethodTypes paymentMethodTypesItem) {
    if (this.paymentMethodTypes == null || !this.paymentMethodTypes.isPresent()) {
      this.paymentMethodTypes = JsonNullable.<List<RequestPaymentMethodTypes>>of(new ArrayList<>());
    }
    try {
      this.paymentMethodTypes.get().add(paymentMethodTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Subtype of payment method
   * @return paymentMethodTypes
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<RequestPaymentMethodTypes> getPaymentMethodTypes() {
        return paymentMethodTypes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<RequestPaymentMethodTypes>> getPaymentMethodTypes_JsonNullable() {
    return paymentMethodTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPES)
  public void setPaymentMethodTypes_JsonNullable(JsonNullable<List<RequestPaymentMethodTypes>> paymentMethodTypes) {
    this.paymentMethodTypes = paymentMethodTypes;
  }

  public void setPaymentMethodTypes(@javax.annotation.Nullable List<RequestPaymentMethodTypes> paymentMethodTypes) {
    this.paymentMethodTypes = JsonNullable.<List<RequestPaymentMethodTypes>>of(paymentMethodTypes);
  }


  /**
   * Return true if this PaymentMethodsEnabled object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodsEnabled paymentMethodsEnabled = (PaymentMethodsEnabled) o;
    return Objects.equals(this.paymentMethod, paymentMethodsEnabled.paymentMethod) &&
        equalsNullable(this.paymentMethodTypes, paymentMethodsEnabled.paymentMethodTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, hashCodeNullable(paymentMethodTypes));
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
    sb.append("class PaymentMethodsEnabled {\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentMethodTypes: ").append(toIndentedString(paymentMethodTypes)).append("\n");
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

    // add `payment_method` to the URL query string
    if (getPaymentMethod() != null) {
      joiner.add(String.format("%spayment_method%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPaymentMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `payment_method_types` to the URL query string
    if (getPaymentMethodTypes() != null) {
      for (int i = 0; i < getPaymentMethodTypes().size(); i++) {
        if (getPaymentMethodTypes().get(i) != null) {
          joiner.add(getPaymentMethodTypes().get(i).toUrlQueryString(String.format("%spayment_method_types%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}


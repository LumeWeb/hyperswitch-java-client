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
import com.hyperswitch.client.model.Address;
import com.hyperswitch.client.model.PaymentMethodType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentsDynamicTaxCalculationRequest
 */
@JsonPropertyOrder({
  PaymentsDynamicTaxCalculationRequest.JSON_PROPERTY_SHIPPING,
  PaymentsDynamicTaxCalculationRequest.JSON_PROPERTY_CLIENT_SECRET,
  PaymentsDynamicTaxCalculationRequest.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  PaymentsDynamicTaxCalculationRequest.JSON_PROPERTY_SESSION_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PaymentsDynamicTaxCalculationRequest {
  public static final String JSON_PROPERTY_SHIPPING = "shipping";
  @javax.annotation.Nonnull
  private Address shipping;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  @javax.annotation.Nonnull
  private String clientSecret;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "payment_method_type";
  @javax.annotation.Nonnull
  private PaymentMethodType paymentMethodType;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  @javax.annotation.Nullable
  private JsonNullable<String> sessionId = JsonNullable.<String>undefined();

  public PaymentsDynamicTaxCalculationRequest() {
  }

  public PaymentsDynamicTaxCalculationRequest shipping(@javax.annotation.Nonnull Address shipping) {
    
    this.shipping = shipping;
    return this;
  }

  /**
   * Get shipping
   * @return shipping
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHIPPING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Address getShipping() {
    return shipping;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShipping(@javax.annotation.Nonnull Address shipping) {
    this.shipping = shipping;
  }

  public PaymentsDynamicTaxCalculationRequest clientSecret(@javax.annotation.Nonnull String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Client Secret
   * @return clientSecret
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientSecret() {
    return clientSecret;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientSecret(@javax.annotation.Nonnull String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public PaymentsDynamicTaxCalculationRequest paymentMethodType(@javax.annotation.Nonnull PaymentMethodType paymentMethodType) {
    
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  /**
   * Get paymentMethodType
   * @return paymentMethodType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentMethodType getPaymentMethodType() {
    return paymentMethodType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethodType(@javax.annotation.Nonnull PaymentMethodType paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public PaymentsDynamicTaxCalculationRequest sessionId(@javax.annotation.Nullable String sessionId) {
    this.sessionId = JsonNullable.<String>of(sessionId);
    
    return this;
  }

  /**
   * Session Id
   * @return sessionId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getSessionId() {
        return sessionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSessionId_JsonNullable() {
    return sessionId;
  }
  
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  public void setSessionId_JsonNullable(JsonNullable<String> sessionId) {
    this.sessionId = sessionId;
  }

  public void setSessionId(@javax.annotation.Nullable String sessionId) {
    this.sessionId = JsonNullable.<String>of(sessionId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsDynamicTaxCalculationRequest paymentsDynamicTaxCalculationRequest = (PaymentsDynamicTaxCalculationRequest) o;
    return Objects.equals(this.shipping, paymentsDynamicTaxCalculationRequest.shipping) &&
        Objects.equals(this.clientSecret, paymentsDynamicTaxCalculationRequest.clientSecret) &&
        Objects.equals(this.paymentMethodType, paymentsDynamicTaxCalculationRequest.paymentMethodType) &&
        equalsNullable(this.sessionId, paymentsDynamicTaxCalculationRequest.sessionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipping, clientSecret, paymentMethodType, hashCodeNullable(sessionId));
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
    sb.append("class PaymentsDynamicTaxCalculationRequest {\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

    // add `shipping` to the URL query string
    if (getShipping() != null) {
      joiner.add(getShipping().toUrlQueryString(prefix + "shipping" + suffix));
    }

    // add `client_secret` to the URL query string
    if (getClientSecret() != null) {
      try {
        joiner.add(String.format("%sclient_secret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientSecret()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_method_type` to the URL query string
    if (getPaymentMethodType() != null) {
      try {
        joiner.add(String.format("%spayment_method_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentMethodType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `session_id` to the URL query string
    if (getSessionId() != null) {
      try {
        joiner.add(String.format("%ssession_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSessionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


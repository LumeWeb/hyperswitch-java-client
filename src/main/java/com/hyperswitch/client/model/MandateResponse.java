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
import com.hyperswitch.client.model.CustomerAcceptance;
import com.hyperswitch.client.model.MandateCardDetails;
import com.hyperswitch.client.model.MandateStatus;
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
 * MandateResponse
 */
@JsonPropertyOrder({
  MandateResponse.JSON_PROPERTY_MANDATE_ID,
  MandateResponse.JSON_PROPERTY_STATUS,
  MandateResponse.JSON_PROPERTY_PAYMENT_METHOD_ID,
  MandateResponse.JSON_PROPERTY_PAYMENT_METHOD,
  MandateResponse.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  MandateResponse.JSON_PROPERTY_CARD,
  MandateResponse.JSON_PROPERTY_CUSTOMER_ACCEPTANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class MandateResponse {
  public static final String JSON_PROPERTY_MANDATE_ID = "mandate_id";
  @javax.annotation.Nonnull
  private String mandateId;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private MandateStatus status;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_ID = "payment_method_id";
  @javax.annotation.Nonnull
  private String paymentMethodId;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  @javax.annotation.Nonnull
  private String paymentMethod;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "payment_method_type";
  @javax.annotation.Nullable
  private JsonNullable<String> paymentMethodType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD = "card";
  @javax.annotation.Nullable
  private JsonNullable<MandateCardDetails> card = JsonNullable.<MandateCardDetails>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_ACCEPTANCE = "customer_acceptance";
  @javax.annotation.Nullable
  private JsonNullable<CustomerAcceptance> customerAcceptance = JsonNullable.<CustomerAcceptance>undefined();

  public MandateResponse() {
  }

  public MandateResponse mandateId(@javax.annotation.Nonnull String mandateId) {
    
    this.mandateId = mandateId;
    return this;
  }

  /**
   * The identifier for mandate
   * @return mandateId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MANDATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMandateId() {
    return mandateId;
  }


  @JsonProperty(JSON_PROPERTY_MANDATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMandateId(@javax.annotation.Nonnull String mandateId) {
    this.mandateId = mandateId;
  }

  public MandateResponse status(@javax.annotation.Nonnull MandateStatus status) {
    
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MandateStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull MandateStatus status) {
    this.status = status;
  }

  public MandateResponse paymentMethodId(@javax.annotation.Nonnull String paymentMethodId) {
    
    this.paymentMethodId = paymentMethodId;
    return this;
  }

  /**
   * The identifier for payment method
   * @return paymentMethodId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentMethodId() {
    return paymentMethodId;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethodId(@javax.annotation.Nonnull String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public MandateResponse paymentMethod(@javax.annotation.Nonnull String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * The payment method
   * @return paymentMethod
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethod(@javax.annotation.Nonnull String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public MandateResponse paymentMethodType(@javax.annotation.Nullable String paymentMethodType) {
    this.paymentMethodType = JsonNullable.<String>of(paymentMethodType);
    
    return this;
  }

  /**
   * The payment method type
   * @return paymentMethodType
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPaymentMethodType() {
        return paymentMethodType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPaymentMethodType_JsonNullable() {
    return paymentMethodType;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  public void setPaymentMethodType_JsonNullable(JsonNullable<String> paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public void setPaymentMethodType(@javax.annotation.Nullable String paymentMethodType) {
    this.paymentMethodType = JsonNullable.<String>of(paymentMethodType);
  }

  public MandateResponse card(@javax.annotation.Nullable MandateCardDetails card) {
    this.card = JsonNullable.<MandateCardDetails>of(card);
    
    return this;
  }

  /**
   * Get card
   * @return card
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public MandateCardDetails getCard() {
        return card.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MandateCardDetails> getCard_JsonNullable() {
    return card;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD)
  public void setCard_JsonNullable(JsonNullable<MandateCardDetails> card) {
    this.card = card;
  }

  public void setCard(@javax.annotation.Nullable MandateCardDetails card) {
    this.card = JsonNullable.<MandateCardDetails>of(card);
  }

  public MandateResponse customerAcceptance(@javax.annotation.Nullable CustomerAcceptance customerAcceptance) {
    this.customerAcceptance = JsonNullable.<CustomerAcceptance>of(customerAcceptance);
    
    return this;
  }

  /**
   * Get customerAcceptance
   * @return customerAcceptance
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public CustomerAcceptance getCustomerAcceptance() {
        return customerAcceptance.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ACCEPTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CustomerAcceptance> getCustomerAcceptance_JsonNullable() {
    return customerAcceptance;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ACCEPTANCE)
  public void setCustomerAcceptance_JsonNullable(JsonNullable<CustomerAcceptance> customerAcceptance) {
    this.customerAcceptance = customerAcceptance;
  }

  public void setCustomerAcceptance(@javax.annotation.Nullable CustomerAcceptance customerAcceptance) {
    this.customerAcceptance = JsonNullable.<CustomerAcceptance>of(customerAcceptance);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateResponse mandateResponse = (MandateResponse) o;
    return Objects.equals(this.mandateId, mandateResponse.mandateId) &&
        Objects.equals(this.status, mandateResponse.status) &&
        Objects.equals(this.paymentMethodId, mandateResponse.paymentMethodId) &&
        Objects.equals(this.paymentMethod, mandateResponse.paymentMethod) &&
        equalsNullable(this.paymentMethodType, mandateResponse.paymentMethodType) &&
        equalsNullable(this.card, mandateResponse.card) &&
        equalsNullable(this.customerAcceptance, mandateResponse.customerAcceptance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandateId, status, paymentMethodId, paymentMethod, hashCodeNullable(paymentMethodType), hashCodeNullable(card), hashCodeNullable(customerAcceptance));
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
    sb.append("class MandateResponse {\n");
    sb.append("    mandateId: ").append(toIndentedString(mandateId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    customerAcceptance: ").append(toIndentedString(customerAcceptance)).append("\n");
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

    // add `mandate_id` to the URL query string
    if (getMandateId() != null) {
      try {
        joiner.add(String.format("%smandate_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMandateId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_method_id` to the URL query string
    if (getPaymentMethodId() != null) {
      try {
        joiner.add(String.format("%spayment_method_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentMethodId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_method` to the URL query string
    if (getPaymentMethod() != null) {
      try {
        joiner.add(String.format("%spayment_method%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentMethod()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `card` to the URL query string
    if (getCard() != null) {
      joiner.add(getCard().toUrlQueryString(prefix + "card" + suffix));
    }

    // add `customer_acceptance` to the URL query string
    if (getCustomerAcceptance() != null) {
      joiner.add(getCustomerAcceptance().toUrlQueryString(prefix + "customer_acceptance" + suffix));
    }

    return joiner.toString();
  }

}


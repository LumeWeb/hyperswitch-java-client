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
import com.hyperswitch.client.model.DisplayAmountOnSdk;
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
 * PaymentsDynamicTaxCalculationResponse
 */
@JsonPropertyOrder({
  PaymentsDynamicTaxCalculationResponse.JSON_PROPERTY_PAYMENT_ID,
  PaymentsDynamicTaxCalculationResponse.JSON_PROPERTY_NET_AMOUNT,
  PaymentsDynamicTaxCalculationResponse.JSON_PROPERTY_ORDER_TAX_AMOUNT,
  PaymentsDynamicTaxCalculationResponse.JSON_PROPERTY_SHIPPING_COST,
  PaymentsDynamicTaxCalculationResponse.JSON_PROPERTY_DISPLAY_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PaymentsDynamicTaxCalculationResponse {
  public static final String JSON_PROPERTY_PAYMENT_ID = "payment_id";
  @javax.annotation.Nonnull
  private String paymentId;

  public static final String JSON_PROPERTY_NET_AMOUNT = "net_amount";
  @javax.annotation.Nonnull
  private Long netAmount;

  public static final String JSON_PROPERTY_ORDER_TAX_AMOUNT = "order_tax_amount";
  @javax.annotation.Nullable
  private JsonNullable<Long> orderTaxAmount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SHIPPING_COST = "shipping_cost";
  @javax.annotation.Nullable
  private JsonNullable<Long> shippingCost = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_DISPLAY_AMOUNT = "display_amount";
  @javax.annotation.Nonnull
  private DisplayAmountOnSdk displayAmount;

  public PaymentsDynamicTaxCalculationResponse() {
  }

  public PaymentsDynamicTaxCalculationResponse paymentId(@javax.annotation.Nonnull String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

  /**
   * The identifier for the payment
   * @return paymentId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentId() {
    return paymentId;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentId(@javax.annotation.Nonnull String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentsDynamicTaxCalculationResponse netAmount(@javax.annotation.Nonnull Long netAmount) {
    
    this.netAmount = netAmount;
    return this;
  }

  /**
   * This Unit struct represents MinorUnit in which core amount works
   * @return netAmount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getNetAmount() {
    return netAmount;
  }


  @JsonProperty(JSON_PROPERTY_NET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetAmount(@javax.annotation.Nonnull Long netAmount) {
    this.netAmount = netAmount;
  }

  public PaymentsDynamicTaxCalculationResponse orderTaxAmount(@javax.annotation.Nullable Long orderTaxAmount) {
    this.orderTaxAmount = JsonNullable.<Long>of(orderTaxAmount);
    
    return this;
  }

  /**
   * This Unit struct represents MinorUnit in which core amount works
   * @return orderTaxAmount
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getOrderTaxAmount() {
        return orderTaxAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDER_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getOrderTaxAmount_JsonNullable() {
    return orderTaxAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER_TAX_AMOUNT)
  public void setOrderTaxAmount_JsonNullable(JsonNullable<Long> orderTaxAmount) {
    this.orderTaxAmount = orderTaxAmount;
  }

  public void setOrderTaxAmount(@javax.annotation.Nullable Long orderTaxAmount) {
    this.orderTaxAmount = JsonNullable.<Long>of(orderTaxAmount);
  }

  public PaymentsDynamicTaxCalculationResponse shippingCost(@javax.annotation.Nullable Long shippingCost) {
    this.shippingCost = JsonNullable.<Long>of(shippingCost);
    
    return this;
  }

  /**
   * This Unit struct represents MinorUnit in which core amount works
   * @return shippingCost
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getShippingCost() {
        return shippingCost.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHIPPING_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getShippingCost_JsonNullable() {
    return shippingCost;
  }
  
  @JsonProperty(JSON_PROPERTY_SHIPPING_COST)
  public void setShippingCost_JsonNullable(JsonNullable<Long> shippingCost) {
    this.shippingCost = shippingCost;
  }

  public void setShippingCost(@javax.annotation.Nullable Long shippingCost) {
    this.shippingCost = JsonNullable.<Long>of(shippingCost);
  }

  public PaymentsDynamicTaxCalculationResponse displayAmount(@javax.annotation.Nonnull DisplayAmountOnSdk displayAmount) {
    
    this.displayAmount = displayAmount;
    return this;
  }

  /**
   * Get displayAmount
   * @return displayAmount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DisplayAmountOnSdk getDisplayAmount() {
    return displayAmount;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayAmount(@javax.annotation.Nonnull DisplayAmountOnSdk displayAmount) {
    this.displayAmount = displayAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsDynamicTaxCalculationResponse paymentsDynamicTaxCalculationResponse = (PaymentsDynamicTaxCalculationResponse) o;
    return Objects.equals(this.paymentId, paymentsDynamicTaxCalculationResponse.paymentId) &&
        Objects.equals(this.netAmount, paymentsDynamicTaxCalculationResponse.netAmount) &&
        equalsNullable(this.orderTaxAmount, paymentsDynamicTaxCalculationResponse.orderTaxAmount) &&
        equalsNullable(this.shippingCost, paymentsDynamicTaxCalculationResponse.shippingCost) &&
        Objects.equals(this.displayAmount, paymentsDynamicTaxCalculationResponse.displayAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, netAmount, hashCodeNullable(orderTaxAmount), hashCodeNullable(shippingCost), displayAmount);
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
    sb.append("class PaymentsDynamicTaxCalculationResponse {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    orderTaxAmount: ").append(toIndentedString(orderTaxAmount)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    displayAmount: ").append(toIndentedString(displayAmount)).append("\n");
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

    // add `payment_id` to the URL query string
    if (getPaymentId() != null) {
      try {
        joiner.add(String.format("%spayment_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `net_amount` to the URL query string
    if (getNetAmount() != null) {
      try {
        joiner.add(String.format("%snet_amount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNetAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `order_tax_amount` to the URL query string
    if (getOrderTaxAmount() != null) {
      try {
        joiner.add(String.format("%sorder_tax_amount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrderTaxAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shipping_cost` to the URL query string
    if (getShippingCost() != null) {
      try {
        joiner.add(String.format("%sshipping_cost%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShippingCost()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `display_amount` to the URL query string
    if (getDisplayAmount() != null) {
      joiner.add(getDisplayAmount().toUrlQueryString(prefix + "display_amount" + suffix));
    }

    return joiner.toString();
  }

}


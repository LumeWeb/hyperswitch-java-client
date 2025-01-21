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
import com.hyperswitch.client.model.SamsungPayAppWalletData;
import com.hyperswitch.client.model.SamsungPayCardBrand;
import com.hyperswitch.client.model.SamsungPayTokenData;
import com.hyperswitch.client.model.SamsungPayWebWalletData;
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
 * SamsungPayWalletCredentials
 */
@JsonPropertyOrder({
  SamsungPayWalletCredentials.JSON_PROPERTY_METHOD,
  SamsungPayWalletCredentials.JSON_PROPERTY_RECURRING_PAYMENT,
  SamsungPayWalletCredentials.JSON_PROPERTY_CARD_BRAND,
  SamsungPayWalletCredentials.JSON_PROPERTY_CARD_LAST4DIGITS,
  SamsungPayWalletCredentials.JSON_PROPERTY_3D_S,
  SamsungPayWalletCredentials.JSON_PROPERTY_PAYMENT_CARD_BRAND,
  SamsungPayWalletCredentials.JSON_PROPERTY_PAYMENT_CURRENCY_TYPE,
  SamsungPayWalletCredentials.JSON_PROPERTY_PAYMENT_LAST4_DPAN,
  SamsungPayWalletCredentials.JSON_PROPERTY_PAYMENT_LAST4_FPAN,
  SamsungPayWalletCredentials.JSON_PROPERTY_MERCHANT_REF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class SamsungPayWalletCredentials {
  public static final String JSON_PROPERTY_METHOD = "method";
  @javax.annotation.Nullable
  private JsonNullable<String> method = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RECURRING_PAYMENT = "recurring_payment";
  @javax.annotation.Nullable
  private JsonNullable<Boolean> recurringPayment = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CARD_BRAND = "card_brand";
  @javax.annotation.Nonnull
  private SamsungPayCardBrand cardBrand;

  public static final String JSON_PROPERTY_CARD_LAST4DIGITS = "card_last4digits";
  @javax.annotation.Nonnull
  private String cardLast4digits;

  public static final String JSON_PROPERTY_3D_S = "3_d_s";
  @javax.annotation.Nonnull
  private SamsungPayTokenData _3dS;

  public static final String JSON_PROPERTY_PAYMENT_CARD_BRAND = "payment_card_brand";
  @javax.annotation.Nonnull
  private SamsungPayCardBrand paymentCardBrand;

  public static final String JSON_PROPERTY_PAYMENT_CURRENCY_TYPE = "payment_currency_type";
  @javax.annotation.Nonnull
  private String paymentCurrencyType;

  public static final String JSON_PROPERTY_PAYMENT_LAST4_DPAN = "payment_last4_dpan";
  @javax.annotation.Nullable
  private JsonNullable<String> paymentLast4Dpan = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYMENT_LAST4_FPAN = "payment_last4_fpan";
  @javax.annotation.Nonnull
  private String paymentLast4Fpan;

  public static final String JSON_PROPERTY_MERCHANT_REF = "merchant_ref";
  @javax.annotation.Nullable
  private JsonNullable<String> merchantRef = JsonNullable.<String>undefined();

  public SamsungPayWalletCredentials() {
  }

  public SamsungPayWalletCredentials method(@javax.annotation.Nullable String method) {
    this.method = JsonNullable.<String>of(method);
    
    return this;
  }

  /**
   * Specifies authentication method used
   * @return method
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMethod() {
        return method.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMethod_JsonNullable() {
    return method;
  }
  
  @JsonProperty(JSON_PROPERTY_METHOD)
  public void setMethod_JsonNullable(JsonNullable<String> method) {
    this.method = method;
  }

  public void setMethod(@javax.annotation.Nullable String method) {
    this.method = JsonNullable.<String>of(method);
  }

  public SamsungPayWalletCredentials recurringPayment(@javax.annotation.Nullable Boolean recurringPayment) {
    this.recurringPayment = JsonNullable.<Boolean>of(recurringPayment);
    
    return this;
  }

  /**
   * Value if credential is enabled for recurring payment
   * @return recurringPayment
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getRecurringPayment() {
        return recurringPayment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getRecurringPayment_JsonNullable() {
    return recurringPayment;
  }
  
  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT)
  public void setRecurringPayment_JsonNullable(JsonNullable<Boolean> recurringPayment) {
    this.recurringPayment = recurringPayment;
  }

  public void setRecurringPayment(@javax.annotation.Nullable Boolean recurringPayment) {
    this.recurringPayment = JsonNullable.<Boolean>of(recurringPayment);
  }

  public SamsungPayWalletCredentials cardBrand(@javax.annotation.Nonnull SamsungPayCardBrand cardBrand) {
    
    this.cardBrand = cardBrand;
    return this;
  }

  /**
   * Get cardBrand
   * @return cardBrand
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_BRAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SamsungPayCardBrand getCardBrand() {
    return cardBrand;
  }


  @JsonProperty(JSON_PROPERTY_CARD_BRAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardBrand(@javax.annotation.Nonnull SamsungPayCardBrand cardBrand) {
    this.cardBrand = cardBrand;
  }

  public SamsungPayWalletCredentials cardLast4digits(@javax.annotation.Nonnull String cardLast4digits) {
    
    this.cardLast4digits = cardLast4digits;
    return this;
  }

  /**
   * Last 4 digits of the card number
   * @return cardLast4digits
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_LAST4DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCardLast4digits() {
    return cardLast4digits;
  }


  @JsonProperty(JSON_PROPERTY_CARD_LAST4DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardLast4digits(@javax.annotation.Nonnull String cardLast4digits) {
    this.cardLast4digits = cardLast4digits;
  }

  public SamsungPayWalletCredentials _3dS(@javax.annotation.Nonnull SamsungPayTokenData _3dS) {
    
    this._3dS = _3dS;
    return this;
  }

  /**
   * Get _3dS
   * @return _3dS
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_3D_S)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SamsungPayTokenData get3dS() {
    return _3dS;
  }


  @JsonProperty(JSON_PROPERTY_3D_S)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void set3dS(@javax.annotation.Nonnull SamsungPayTokenData _3dS) {
    this._3dS = _3dS;
  }

  public SamsungPayWalletCredentials paymentCardBrand(@javax.annotation.Nonnull SamsungPayCardBrand paymentCardBrand) {
    
    this.paymentCardBrand = paymentCardBrand;
    return this;
  }

  /**
   * Get paymentCardBrand
   * @return paymentCardBrand
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_CARD_BRAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SamsungPayCardBrand getPaymentCardBrand() {
    return paymentCardBrand;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_CARD_BRAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentCardBrand(@javax.annotation.Nonnull SamsungPayCardBrand paymentCardBrand) {
    this.paymentCardBrand = paymentCardBrand;
  }

  public SamsungPayWalletCredentials paymentCurrencyType(@javax.annotation.Nonnull String paymentCurrencyType) {
    
    this.paymentCurrencyType = paymentCurrencyType;
    return this;
  }

  /**
   * Currency type of the payment
   * @return paymentCurrencyType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_CURRENCY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentCurrencyType() {
    return paymentCurrencyType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_CURRENCY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentCurrencyType(@javax.annotation.Nonnull String paymentCurrencyType) {
    this.paymentCurrencyType = paymentCurrencyType;
  }

  public SamsungPayWalletCredentials paymentLast4Dpan(@javax.annotation.Nullable String paymentLast4Dpan) {
    this.paymentLast4Dpan = JsonNullable.<String>of(paymentLast4Dpan);
    
    return this;
  }

  /**
   * Last 4 digits of the device specific card number
   * @return paymentLast4Dpan
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPaymentLast4Dpan() {
        return paymentLast4Dpan.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_LAST4_DPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPaymentLast4Dpan_JsonNullable() {
    return paymentLast4Dpan;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_LAST4_DPAN)
  public void setPaymentLast4Dpan_JsonNullable(JsonNullable<String> paymentLast4Dpan) {
    this.paymentLast4Dpan = paymentLast4Dpan;
  }

  public void setPaymentLast4Dpan(@javax.annotation.Nullable String paymentLast4Dpan) {
    this.paymentLast4Dpan = JsonNullable.<String>of(paymentLast4Dpan);
  }

  public SamsungPayWalletCredentials paymentLast4Fpan(@javax.annotation.Nonnull String paymentLast4Fpan) {
    
    this.paymentLast4Fpan = paymentLast4Fpan;
    return this;
  }

  /**
   * Last 4 digits of the card number
   * @return paymentLast4Fpan
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_LAST4_FPAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentLast4Fpan() {
    return paymentLast4Fpan;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_LAST4_FPAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentLast4Fpan(@javax.annotation.Nonnull String paymentLast4Fpan) {
    this.paymentLast4Fpan = paymentLast4Fpan;
  }

  public SamsungPayWalletCredentials merchantRef(@javax.annotation.Nullable String merchantRef) {
    this.merchantRef = JsonNullable.<String>of(merchantRef);
    
    return this;
  }

  /**
   * Merchant reference id that was passed in the session call request
   * @return merchantRef
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMerchantRef() {
        return merchantRef.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMerchantRef_JsonNullable() {
    return merchantRef;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_REF)
  public void setMerchantRef_JsonNullable(JsonNullable<String> merchantRef) {
    this.merchantRef = merchantRef;
  }

  public void setMerchantRef(@javax.annotation.Nullable String merchantRef) {
    this.merchantRef = JsonNullable.<String>of(merchantRef);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamsungPayWalletCredentials samsungPayWalletCredentials = (SamsungPayWalletCredentials) o;
    return equalsNullable(this.method, samsungPayWalletCredentials.method) &&
        equalsNullable(this.recurringPayment, samsungPayWalletCredentials.recurringPayment) &&
        Objects.equals(this.cardBrand, samsungPayWalletCredentials.cardBrand) &&
        Objects.equals(this.cardLast4digits, samsungPayWalletCredentials.cardLast4digits) &&
        Objects.equals(this._3dS, samsungPayWalletCredentials._3dS) &&
        Objects.equals(this.paymentCardBrand, samsungPayWalletCredentials.paymentCardBrand) &&
        Objects.equals(this.paymentCurrencyType, samsungPayWalletCredentials.paymentCurrencyType) &&
        equalsNullable(this.paymentLast4Dpan, samsungPayWalletCredentials.paymentLast4Dpan) &&
        Objects.equals(this.paymentLast4Fpan, samsungPayWalletCredentials.paymentLast4Fpan) &&
        equalsNullable(this.merchantRef, samsungPayWalletCredentials.merchantRef);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(method), hashCodeNullable(recurringPayment), cardBrand, cardLast4digits, _3dS, paymentCardBrand, paymentCurrencyType, hashCodeNullable(paymentLast4Dpan), paymentLast4Fpan, hashCodeNullable(merchantRef));
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
    sb.append("class SamsungPayWalletCredentials {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    recurringPayment: ").append(toIndentedString(recurringPayment)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    cardLast4digits: ").append(toIndentedString(cardLast4digits)).append("\n");
    sb.append("    _3dS: ").append(toIndentedString(_3dS)).append("\n");
    sb.append("    paymentCardBrand: ").append(toIndentedString(paymentCardBrand)).append("\n");
    sb.append("    paymentCurrencyType: ").append(toIndentedString(paymentCurrencyType)).append("\n");
    sb.append("    paymentLast4Dpan: ").append(toIndentedString(paymentLast4Dpan)).append("\n");
    sb.append("    paymentLast4Fpan: ").append(toIndentedString(paymentLast4Fpan)).append("\n");
    sb.append("    merchantRef: ").append(toIndentedString(merchantRef)).append("\n");
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

    // add `method` to the URL query string
    if (getMethod() != null) {
      try {
        joiner.add(String.format("%smethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMethod()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recurring_payment` to the URL query string
    if (getRecurringPayment() != null) {
      try {
        joiner.add(String.format("%srecurring_payment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecurringPayment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `card_brand` to the URL query string
    if (getCardBrand() != null) {
      try {
        joiner.add(String.format("%scard_brand%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardBrand()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `card_last4digits` to the URL query string
    if (getCardLast4digits() != null) {
      try {
        joiner.add(String.format("%scard_last4digits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardLast4digits()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `3_d_s` to the URL query string
    if (get3dS() != null) {
      joiner.add(get3dS().toUrlQueryString(prefix + "3_d_s" + suffix));
    }

    // add `payment_card_brand` to the URL query string
    if (getPaymentCardBrand() != null) {
      try {
        joiner.add(String.format("%spayment_card_brand%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentCardBrand()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_currency_type` to the URL query string
    if (getPaymentCurrencyType() != null) {
      try {
        joiner.add(String.format("%spayment_currency_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentCurrencyType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_last4_dpan` to the URL query string
    if (getPaymentLast4Dpan() != null) {
      try {
        joiner.add(String.format("%spayment_last4_dpan%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentLast4Dpan()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `payment_last4_fpan` to the URL query string
    if (getPaymentLast4Fpan() != null) {
      try {
        joiner.add(String.format("%spayment_last4_fpan%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentLast4Fpan()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchant_ref` to the URL query string
    if (getMerchantRef() != null) {
      try {
        joiner.add(String.format("%smerchant_ref%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantRef()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


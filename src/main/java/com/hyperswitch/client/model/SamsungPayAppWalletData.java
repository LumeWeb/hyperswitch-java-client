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
import com.hyperswitch.client.model.SamsungPayCardBrand;
import com.hyperswitch.client.model.SamsungPayTokenData;
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
 * SamsungPayAppWalletData
 */
@JsonPropertyOrder({
  SamsungPayAppWalletData.JSON_PROPERTY_3D_S,
  SamsungPayAppWalletData.JSON_PROPERTY_PAYMENT_CARD_BRAND,
  SamsungPayAppWalletData.JSON_PROPERTY_PAYMENT_CURRENCY_TYPE,
  SamsungPayAppWalletData.JSON_PROPERTY_PAYMENT_LAST4_DPAN,
  SamsungPayAppWalletData.JSON_PROPERTY_PAYMENT_LAST4_FPAN,
  SamsungPayAppWalletData.JSON_PROPERTY_MERCHANT_REF,
  SamsungPayAppWalletData.JSON_PROPERTY_METHOD,
  SamsungPayAppWalletData.JSON_PROPERTY_RECURRING_PAYMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SamsungPayAppWalletData {
  public static final String JSON_PROPERTY_3D_S = "3_d_s";
  private SamsungPayTokenData _3dS;

  public static final String JSON_PROPERTY_PAYMENT_CARD_BRAND = "payment_card_brand";
  private SamsungPayCardBrand paymentCardBrand;

  public static final String JSON_PROPERTY_PAYMENT_CURRENCY_TYPE = "payment_currency_type";
  private String paymentCurrencyType;

  public static final String JSON_PROPERTY_PAYMENT_LAST4_DPAN = "payment_last4_dpan";
  private JsonNullable<String> paymentLast4Dpan = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYMENT_LAST4_FPAN = "payment_last4_fpan";
  private String paymentLast4Fpan;

  public static final String JSON_PROPERTY_MERCHANT_REF = "merchant_ref";
  private JsonNullable<String> merchantRef = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_METHOD = "method";
  private JsonNullable<String> method = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RECURRING_PAYMENT = "recurring_payment";
  private JsonNullable<Boolean> recurringPayment = JsonNullable.<Boolean>undefined();

  public SamsungPayAppWalletData() {
  }

  public SamsungPayAppWalletData _3dS(SamsungPayTokenData _3dS) {
    
    this._3dS = _3dS;
    return this;
  }

   /**
   * Get _3dS
   * @return _3dS
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_3D_S)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SamsungPayTokenData get3dS() {
    return _3dS;
  }


  @JsonProperty(JSON_PROPERTY_3D_S)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void set3dS(SamsungPayTokenData _3dS) {
    this._3dS = _3dS;
  }


  public SamsungPayAppWalletData paymentCardBrand(SamsungPayCardBrand paymentCardBrand) {
    
    this.paymentCardBrand = paymentCardBrand;
    return this;
  }

   /**
   * Get paymentCardBrand
   * @return paymentCardBrand
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_CARD_BRAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SamsungPayCardBrand getPaymentCardBrand() {
    return paymentCardBrand;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_CARD_BRAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentCardBrand(SamsungPayCardBrand paymentCardBrand) {
    this.paymentCardBrand = paymentCardBrand;
  }


  public SamsungPayAppWalletData paymentCurrencyType(String paymentCurrencyType) {
    
    this.paymentCurrencyType = paymentCurrencyType;
    return this;
  }

   /**
   * Currency type of the payment
   * @return paymentCurrencyType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_CURRENCY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentCurrencyType() {
    return paymentCurrencyType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_CURRENCY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentCurrencyType(String paymentCurrencyType) {
    this.paymentCurrencyType = paymentCurrencyType;
  }


  public SamsungPayAppWalletData paymentLast4Dpan(String paymentLast4Dpan) {
    this.paymentLast4Dpan = JsonNullable.<String>of(paymentLast4Dpan);
    
    return this;
  }

   /**
   * Last 4 digits of the device specific card number
   * @return paymentLast4Dpan
  **/
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

  public void setPaymentLast4Dpan(String paymentLast4Dpan) {
    this.paymentLast4Dpan = JsonNullable.<String>of(paymentLast4Dpan);
  }


  public SamsungPayAppWalletData paymentLast4Fpan(String paymentLast4Fpan) {
    
    this.paymentLast4Fpan = paymentLast4Fpan;
    return this;
  }

   /**
   * Last 4 digits of the card number
   * @return paymentLast4Fpan
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_LAST4_FPAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentLast4Fpan() {
    return paymentLast4Fpan;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_LAST4_FPAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentLast4Fpan(String paymentLast4Fpan) {
    this.paymentLast4Fpan = paymentLast4Fpan;
  }


  public SamsungPayAppWalletData merchantRef(String merchantRef) {
    this.merchantRef = JsonNullable.<String>of(merchantRef);
    
    return this;
  }

   /**
   * Merchant reference id that was passed in the session call request
   * @return merchantRef
  **/
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

  public void setMerchantRef(String merchantRef) {
    this.merchantRef = JsonNullable.<String>of(merchantRef);
  }


  public SamsungPayAppWalletData method(String method) {
    this.method = JsonNullable.<String>of(method);
    
    return this;
  }

   /**
   * Specifies authentication method used
   * @return method
  **/
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

  public void setMethod(String method) {
    this.method = JsonNullable.<String>of(method);
  }


  public SamsungPayAppWalletData recurringPayment(Boolean recurringPayment) {
    this.recurringPayment = JsonNullable.<Boolean>of(recurringPayment);
    
    return this;
  }

   /**
   * Value if credential is enabled for recurring payment
   * @return recurringPayment
  **/
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

  public void setRecurringPayment(Boolean recurringPayment) {
    this.recurringPayment = JsonNullable.<Boolean>of(recurringPayment);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamsungPayAppWalletData samsungPayAppWalletData = (SamsungPayAppWalletData) o;
    return Objects.equals(this._3dS, samsungPayAppWalletData._3dS) &&
        Objects.equals(this.paymentCardBrand, samsungPayAppWalletData.paymentCardBrand) &&
        Objects.equals(this.paymentCurrencyType, samsungPayAppWalletData.paymentCurrencyType) &&
        equalsNullable(this.paymentLast4Dpan, samsungPayAppWalletData.paymentLast4Dpan) &&
        Objects.equals(this.paymentLast4Fpan, samsungPayAppWalletData.paymentLast4Fpan) &&
        equalsNullable(this.merchantRef, samsungPayAppWalletData.merchantRef) &&
        equalsNullable(this.method, samsungPayAppWalletData.method) &&
        equalsNullable(this.recurringPayment, samsungPayAppWalletData.recurringPayment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_3dS, paymentCardBrand, paymentCurrencyType, hashCodeNullable(paymentLast4Dpan), paymentLast4Fpan, hashCodeNullable(merchantRef), hashCodeNullable(method), hashCodeNullable(recurringPayment));
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
    sb.append("class SamsungPayAppWalletData {\n");
    sb.append("    _3dS: ").append(toIndentedString(_3dS)).append("\n");
    sb.append("    paymentCardBrand: ").append(toIndentedString(paymentCardBrand)).append("\n");
    sb.append("    paymentCurrencyType: ").append(toIndentedString(paymentCurrencyType)).append("\n");
    sb.append("    paymentLast4Dpan: ").append(toIndentedString(paymentLast4Dpan)).append("\n");
    sb.append("    paymentLast4Fpan: ").append(toIndentedString(paymentLast4Fpan)).append("\n");
    sb.append("    merchantRef: ").append(toIndentedString(merchantRef)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    recurringPayment: ").append(toIndentedString(recurringPayment)).append("\n");
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

    return joiner.toString();
  }

}


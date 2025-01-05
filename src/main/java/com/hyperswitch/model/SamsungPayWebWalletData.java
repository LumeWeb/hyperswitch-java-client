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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.SamsungPayCardBrand;
import com.hyperswitch.model.SamsungPayTokenData;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SamsungPayWebWalletData
 */
@JsonPropertyOrder({
  SamsungPayWebWalletData.JSON_PROPERTY_METHOD,
  SamsungPayWebWalletData.JSON_PROPERTY_RECURRING_PAYMENT,
  SamsungPayWebWalletData.JSON_PROPERTY_CARD_BRAND,
  SamsungPayWebWalletData.JSON_PROPERTY_CARD_LAST4DIGITS,
  SamsungPayWebWalletData.JSON_PROPERTY_3D_S
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class SamsungPayWebWalletData {
  public static final String JSON_PROPERTY_METHOD = "method";
  private JsonNullable<String> method = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RECURRING_PAYMENT = "recurring_payment";
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

  public SamsungPayWebWalletData() {
  }

  public SamsungPayWebWalletData method(@javax.annotation.Nullable String method) {
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


  public SamsungPayWebWalletData recurringPayment(@javax.annotation.Nullable Boolean recurringPayment) {
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


  public SamsungPayWebWalletData cardBrand(@javax.annotation.Nonnull SamsungPayCardBrand cardBrand) {
    
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


  public SamsungPayWebWalletData cardLast4digits(@javax.annotation.Nonnull String cardLast4digits) {
    
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


  public SamsungPayWebWalletData _3dS(@javax.annotation.Nonnull SamsungPayTokenData _3dS) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamsungPayWebWalletData samsungPayWebWalletData = (SamsungPayWebWalletData) o;
    return equalsNullable(this.method, samsungPayWebWalletData.method) &&
        equalsNullable(this.recurringPayment, samsungPayWebWalletData.recurringPayment) &&
        Objects.equals(this.cardBrand, samsungPayWebWalletData.cardBrand) &&
        Objects.equals(this.cardLast4digits, samsungPayWebWalletData.cardLast4digits) &&
        Objects.equals(this._3dS, samsungPayWebWalletData._3dS);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(method), hashCodeNullable(recurringPayment), cardBrand, cardLast4digits, _3dS);
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
    sb.append("class SamsungPayWebWalletData {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    recurringPayment: ").append(toIndentedString(recurringPayment)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    cardLast4digits: ").append(toIndentedString(cardLast4digits)).append("\n");
    sb.append("    _3dS: ").append(toIndentedString(_3dS)).append("\n");
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

}


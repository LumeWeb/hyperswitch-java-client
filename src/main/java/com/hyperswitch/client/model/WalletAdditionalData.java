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
import com.hyperswitch.client.model.PaypalAdditionalData;
import com.hyperswitch.client.model.VenmoAdditionalData;
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
 * Masked payout method details for wallet payout method
 */
@JsonPropertyOrder({
  WalletAdditionalData.JSON_PROPERTY_EMAIL,
  WalletAdditionalData.JSON_PROPERTY_TELEPHONE_NUMBER,
  WalletAdditionalData.JSON_PROPERTY_PAYPAL_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WalletAdditionalData {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TELEPHONE_NUMBER = "telephone_number";
  private JsonNullable<String> telephoneNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYPAL_ID = "paypal_id";
  private JsonNullable<String> paypalId = JsonNullable.<String>undefined();

  public WalletAdditionalData() {
  }

  public WalletAdditionalData email(String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

   /**
   * Email linked with paypal account
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(String email) {
    this.email = JsonNullable.<String>of(email);
  }


  public WalletAdditionalData telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = JsonNullable.<String>of(telephoneNumber);
    
    return this;
  }

   /**
   * mobile number linked to venmo account
   * @return telephoneNumber
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTelephoneNumber() {
        return telephoneNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTelephoneNumber_JsonNullable() {
    return telephoneNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  public void setTelephoneNumber_JsonNullable(JsonNullable<String> telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = JsonNullable.<String>of(telephoneNumber);
  }


  public WalletAdditionalData paypalId(String paypalId) {
    this.paypalId = JsonNullable.<String>of(paypalId);
    
    return this;
  }

   /**
   * id of the paypal account
   * @return paypalId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPaypalId() {
        return paypalId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYPAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPaypalId_JsonNullable() {
    return paypalId;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYPAL_ID)
  public void setPaypalId_JsonNullable(JsonNullable<String> paypalId) {
    this.paypalId = paypalId;
  }

  public void setPaypalId(String paypalId) {
    this.paypalId = JsonNullable.<String>of(paypalId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletAdditionalData walletAdditionalData = (WalletAdditionalData) o;
    return equalsNullable(this.email, walletAdditionalData.email) &&
        equalsNullable(this.telephoneNumber, walletAdditionalData.telephoneNumber) &&
        equalsNullable(this.paypalId, walletAdditionalData.paypalId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(email), hashCodeNullable(telephoneNumber), hashCodeNullable(paypalId));
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
    sb.append("class WalletAdditionalData {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    paypalId: ").append(toIndentedString(paypalId)).append("\n");
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `telephone_number` to the URL query string
    if (getTelephoneNumber() != null) {
      try {
        joiner.add(String.format("%stelephone_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTelephoneNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paypal_id` to the URL query string
    if (getPaypalId() != null) {
      try {
        joiner.add(String.format("%spaypal_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaypalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


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
import com.hyperswitch.client.model.CountryAlpha2;
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
 * AchBankTransfer
 */
@JsonPropertyOrder({
  AchBankTransfer.JSON_PROPERTY_BANK_NAME,
  AchBankTransfer.JSON_PROPERTY_BANK_COUNTRY_CODE,
  AchBankTransfer.JSON_PROPERTY_BANK_CITY,
  AchBankTransfer.JSON_PROPERTY_BANK_ACCOUNT_NUMBER,
  AchBankTransfer.JSON_PROPERTY_BANK_ROUTING_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class AchBankTransfer {
  public static final String JSON_PROPERTY_BANK_NAME = "bank_name";
  @javax.annotation.Nullable
  private JsonNullable<String> bankName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BANK_COUNTRY_CODE = "bank_country_code";
  @javax.annotation.Nullable
  private JsonNullable<CountryAlpha2> bankCountryCode = JsonNullable.<CountryAlpha2>undefined();

  public static final String JSON_PROPERTY_BANK_CITY = "bank_city";
  @javax.annotation.Nullable
  private JsonNullable<String> bankCity = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BANK_ACCOUNT_NUMBER = "bank_account_number";
  @javax.annotation.Nonnull
  private String bankAccountNumber;

  public static final String JSON_PROPERTY_BANK_ROUTING_NUMBER = "bank_routing_number";
  @javax.annotation.Nonnull
  private String bankRoutingNumber;

  public AchBankTransfer() {
  }

  public AchBankTransfer bankName(@javax.annotation.Nullable String bankName) {
    this.bankName = JsonNullable.<String>of(bankName);
    
    return this;
  }

  /**
   * Bank name
   * @return bankName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBankName() {
        return bankName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBankName_JsonNullable() {
    return bankName;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  public void setBankName_JsonNullable(JsonNullable<String> bankName) {
    this.bankName = bankName;
  }

  public void setBankName(@javax.annotation.Nullable String bankName) {
    this.bankName = JsonNullable.<String>of(bankName);
  }

  public AchBankTransfer bankCountryCode(@javax.annotation.Nullable CountryAlpha2 bankCountryCode) {
    this.bankCountryCode = JsonNullable.<CountryAlpha2>of(bankCountryCode);
    
    return this;
  }

  /**
   * Get bankCountryCode
   * @return bankCountryCode
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public CountryAlpha2 getBankCountryCode() {
        return bankCountryCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CountryAlpha2> getBankCountryCode_JsonNullable() {
    return bankCountryCode;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_COUNTRY_CODE)
  public void setBankCountryCode_JsonNullable(JsonNullable<CountryAlpha2> bankCountryCode) {
    this.bankCountryCode = bankCountryCode;
  }

  public void setBankCountryCode(@javax.annotation.Nullable CountryAlpha2 bankCountryCode) {
    this.bankCountryCode = JsonNullable.<CountryAlpha2>of(bankCountryCode);
  }

  public AchBankTransfer bankCity(@javax.annotation.Nullable String bankCity) {
    this.bankCity = JsonNullable.<String>of(bankCity);
    
    return this;
  }

  /**
   * Bank city
   * @return bankCity
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBankCity() {
        return bankCity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBankCity_JsonNullable() {
    return bankCity;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_CITY)
  public void setBankCity_JsonNullable(JsonNullable<String> bankCity) {
    this.bankCity = bankCity;
  }

  public void setBankCity(@javax.annotation.Nullable String bankCity) {
    this.bankCity = JsonNullable.<String>of(bankCity);
  }

  public AchBankTransfer bankAccountNumber(@javax.annotation.Nonnull String bankAccountNumber) {
    
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

  /**
   * Bank account number is an unique identifier assigned by a bank to a customer.
   * @return bankAccountNumber
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBankAccountNumber() {
    return bankAccountNumber;
  }


  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankAccountNumber(@javax.annotation.Nonnull String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  public AchBankTransfer bankRoutingNumber(@javax.annotation.Nonnull String bankRoutingNumber) {
    
    this.bankRoutingNumber = bankRoutingNumber;
    return this;
  }

  /**
   * [9 digits] Routing number - used in USA for identifying a specific bank.
   * @return bankRoutingNumber
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBankRoutingNumber() {
    return bankRoutingNumber;
  }


  @JsonProperty(JSON_PROPERTY_BANK_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankRoutingNumber(@javax.annotation.Nonnull String bankRoutingNumber) {
    this.bankRoutingNumber = bankRoutingNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchBankTransfer achBankTransfer = (AchBankTransfer) o;
    return equalsNullable(this.bankName, achBankTransfer.bankName) &&
        equalsNullable(this.bankCountryCode, achBankTransfer.bankCountryCode) &&
        equalsNullable(this.bankCity, achBankTransfer.bankCity) &&
        Objects.equals(this.bankAccountNumber, achBankTransfer.bankAccountNumber) &&
        Objects.equals(this.bankRoutingNumber, achBankTransfer.bankRoutingNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bankName), hashCodeNullable(bankCountryCode), hashCodeNullable(bankCity), bankAccountNumber, bankRoutingNumber);
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
    sb.append("class AchBankTransfer {\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankCountryCode: ").append(toIndentedString(bankCountryCode)).append("\n");
    sb.append("    bankCity: ").append(toIndentedString(bankCity)).append("\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankRoutingNumber: ").append(toIndentedString(bankRoutingNumber)).append("\n");
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

    // add `bank_name` to the URL query string
    if (getBankName() != null) {
      try {
        joiner.add(String.format("%sbank_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bank_country_code` to the URL query string
    if (getBankCountryCode() != null) {
      try {
        joiner.add(String.format("%sbank_country_code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankCountryCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bank_city` to the URL query string
    if (getBankCity() != null) {
      try {
        joiner.add(String.format("%sbank_city%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankCity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bank_account_number` to the URL query string
    if (getBankAccountNumber() != null) {
      try {
        joiner.add(String.format("%sbank_account_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankAccountNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bank_routing_number` to the URL query string
    if (getBankRoutingNumber() != null) {
      try {
        joiner.add(String.format("%sbank_routing_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankRoutingNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


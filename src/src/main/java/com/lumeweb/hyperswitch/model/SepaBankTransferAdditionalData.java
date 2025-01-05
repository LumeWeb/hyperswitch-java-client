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
import com.lumeweb.hyperswitch.model.CountryAlpha2;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * Masked payout method details for sepa bank transfer payout method
 */
@JsonPropertyOrder({
  SepaBankTransferAdditionalData.JSON_PROPERTY_IBAN,
  SepaBankTransferAdditionalData.JSON_PROPERTY_BANK_NAME,
  SepaBankTransferAdditionalData.JSON_PROPERTY_BANK_COUNTRY_CODE,
  SepaBankTransferAdditionalData.JSON_PROPERTY_BANK_CITY,
  SepaBankTransferAdditionalData.JSON_PROPERTY_BIC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class SepaBankTransferAdditionalData {
  public static final String JSON_PROPERTY_IBAN = "iban";
  @javax.annotation.Nonnull
  private String iban;

  public static final String JSON_PROPERTY_BANK_NAME = "bank_name";
  private JsonNullable<String> bankName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BANK_COUNTRY_CODE = "bank_country_code";
  private JsonNullable<CountryAlpha2> bankCountryCode = JsonNullable.<CountryAlpha2>undefined();

  public static final String JSON_PROPERTY_BANK_CITY = "bank_city";
  private JsonNullable<String> bankCity = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BIC = "bic";
  private JsonNullable<String> bic = JsonNullable.<String>undefined();

  public SepaBankTransferAdditionalData() { 
  }

  public SepaBankTransferAdditionalData iban(@javax.annotation.Nonnull String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Partially masked international bank account number (iban) for SEPA
   * @return iban
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIban() {
    return iban;
  }


  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIban(@javax.annotation.Nonnull String iban) {
    this.iban = iban;
  }


  public SepaBankTransferAdditionalData bankName(@javax.annotation.Nullable String bankName) {
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


  public SepaBankTransferAdditionalData bankCountryCode(@javax.annotation.Nullable CountryAlpha2 bankCountryCode) {
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


  public SepaBankTransferAdditionalData bankCity(@javax.annotation.Nullable String bankCity) {
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


  public SepaBankTransferAdditionalData bic(@javax.annotation.Nullable String bic) {
    this.bic = JsonNullable.<String>of(bic);
    return this;
  }

  /**
   * [8 / 11 digits] Bank Identifier Code (bic) / Swift Code - used in many countries for identifying a bank and it&#39;s branches
   * @return bic
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getBic() {
        return bic.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBic_JsonNullable() {
    return bic;
  }
  
  @JsonProperty(JSON_PROPERTY_BIC)
  public void setBic_JsonNullable(JsonNullable<String> bic) {
    this.bic = bic;
  }

  public void setBic(@javax.annotation.Nullable String bic) {
    this.bic = JsonNullable.<String>of(bic);
  }


  /**
   * Return true if this SepaBankTransferAdditionalData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SepaBankTransferAdditionalData sepaBankTransferAdditionalData = (SepaBankTransferAdditionalData) o;
    return Objects.equals(this.iban, sepaBankTransferAdditionalData.iban) &&
        equalsNullable(this.bankName, sepaBankTransferAdditionalData.bankName) &&
        equalsNullable(this.bankCountryCode, sepaBankTransferAdditionalData.bankCountryCode) &&
        equalsNullable(this.bankCity, sepaBankTransferAdditionalData.bankCity) &&
        equalsNullable(this.bic, sepaBankTransferAdditionalData.bic);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, hashCodeNullable(bankName), hashCodeNullable(bankCountryCode), hashCodeNullable(bankCity), hashCodeNullable(bic));
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
    sb.append("class SepaBankTransferAdditionalData {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankCountryCode: ").append(toIndentedString(bankCountryCode)).append("\n");
    sb.append("    bankCity: ").append(toIndentedString(bankCity)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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

    // add `iban` to the URL query string
    if (getIban() != null) {
      joiner.add(String.format("%siban%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIban()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bank_name` to the URL query string
    if (getBankName() != null) {
      joiner.add(String.format("%sbank_name%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBankName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bank_country_code` to the URL query string
    if (getBankCountryCode() != null) {
      joiner.add(String.format("%sbank_country_code%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBankCountryCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bank_city` to the URL query string
    if (getBankCity() != null) {
      joiner.add(String.format("%sbank_city%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBankCity()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bic` to the URL query string
    if (getBic() != null) {
      joiner.add(String.format("%sbic%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBic()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


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
import com.lumeweb.hyperswitch.model.BankNames;
import com.lumeweb.hyperswitch.model.CountryAlpha2;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * BankRedirectDataOneOf11OpenBankingUk
 */
@JsonPropertyOrder({
  BankRedirectDataOneOf11OpenBankingUk.JSON_PROPERTY_ISSUER,
  BankRedirectDataOneOf11OpenBankingUk.JSON_PROPERTY_COUNTRY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class BankRedirectDataOneOf11OpenBankingUk {
  public static final String JSON_PROPERTY_ISSUER = "issuer";
  @javax.annotation.Nonnull
  private BankNames issuer;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nonnull
  private CountryAlpha2 country;

  public BankRedirectDataOneOf11OpenBankingUk() { 
  }

  public BankRedirectDataOneOf11OpenBankingUk issuer(@javax.annotation.Nonnull BankNames issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BankNames getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssuer(@javax.annotation.Nonnull BankNames issuer) {
    this.issuer = issuer;
  }


  public BankRedirectDataOneOf11OpenBankingUk country(@javax.annotation.Nonnull CountryAlpha2 country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CountryAlpha2 getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(@javax.annotation.Nonnull CountryAlpha2 country) {
    this.country = country;
  }


  /**
   * Return true if this BankRedirectData_oneOf_11_open_banking_uk object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankRedirectDataOneOf11OpenBankingUk bankRedirectDataOneOf11OpenBankingUk = (BankRedirectDataOneOf11OpenBankingUk) o;
    return Objects.equals(this.issuer, bankRedirectDataOneOf11OpenBankingUk.issuer) &&
        Objects.equals(this.country, bankRedirectDataOneOf11OpenBankingUk.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuer, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankRedirectDataOneOf11OpenBankingUk {\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

    // add `issuer` to the URL query string
    if (getIssuer() != null) {
      joiner.add(String.format("%sissuer%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIssuer()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCountry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


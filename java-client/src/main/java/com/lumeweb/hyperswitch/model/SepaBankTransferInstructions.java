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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * SepaBankTransferInstructions
 */
@JsonPropertyOrder({
  SepaBankTransferInstructions.JSON_PROPERTY_ACCOUNT_HOLDER_NAME,
  SepaBankTransferInstructions.JSON_PROPERTY_BIC,
  SepaBankTransferInstructions.JSON_PROPERTY_COUNTRY,
  SepaBankTransferInstructions.JSON_PROPERTY_IBAN,
  SepaBankTransferInstructions.JSON_PROPERTY_REFERENCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class SepaBankTransferInstructions {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_NAME = "account_holder_name";
  @javax.annotation.Nonnull
  private String accountHolderName;

  public static final String JSON_PROPERTY_BIC = "bic";
  @javax.annotation.Nonnull
  private String bic;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  @javax.annotation.Nonnull
  private String country;

  public static final String JSON_PROPERTY_IBAN = "iban";
  @javax.annotation.Nonnull
  private String iban;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  @javax.annotation.Nonnull
  private String reference;

  public SepaBankTransferInstructions() { 
  }

  public SepaBankTransferInstructions accountHolderName(@javax.annotation.Nonnull String accountHolderName) {
    this.accountHolderName = accountHolderName;
    return this;
  }

  /**
   * Get accountHolderName
   * @return accountHolderName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountHolderName() {
    return accountHolderName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountHolderName(@javax.annotation.Nonnull String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }


  public SepaBankTransferInstructions bic(@javax.annotation.Nonnull String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * Get bic
   * @return bic
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBic() {
    return bic;
  }


  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBic(@javax.annotation.Nonnull String bic) {
    this.bic = bic;
  }


  public SepaBankTransferInstructions country(@javax.annotation.Nonnull String country) {
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
  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(@javax.annotation.Nonnull String country) {
    this.country = country;
  }


  public SepaBankTransferInstructions iban(@javax.annotation.Nonnull String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Get iban
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


  public SepaBankTransferInstructions reference(@javax.annotation.Nonnull String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReference(@javax.annotation.Nonnull String reference) {
    this.reference = reference;
  }


  /**
   * Return true if this SepaBankTransferInstructions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SepaBankTransferInstructions sepaBankTransferInstructions = (SepaBankTransferInstructions) o;
    return Objects.equals(this.accountHolderName, sepaBankTransferInstructions.accountHolderName) &&
        Objects.equals(this.bic, sepaBankTransferInstructions.bic) &&
        Objects.equals(this.country, sepaBankTransferInstructions.country) &&
        Objects.equals(this.iban, sepaBankTransferInstructions.iban) &&
        Objects.equals(this.reference, sepaBankTransferInstructions.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderName, bic, country, iban, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SepaBankTransferInstructions {\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

    // add `account_holder_name` to the URL query string
    if (getAccountHolderName() != null) {
      joiner.add(String.format("%saccount_holder_name%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccountHolderName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bic` to the URL query string
    if (getBic() != null) {
      joiner.add(String.format("%sbic%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBic()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCountry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `iban` to the URL query string
    if (getIban() != null) {
      joiner.add(String.format("%siban%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIban()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `reference` to the URL query string
    if (getReference() != null) {
      joiner.add(String.format("%sreference%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReference()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


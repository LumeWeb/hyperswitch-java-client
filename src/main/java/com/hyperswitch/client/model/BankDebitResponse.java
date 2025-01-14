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
import com.hyperswitch.client.model.AchBankDebitAdditionalData;
import com.hyperswitch.client.model.BacsBankDebitAdditionalData;
import com.hyperswitch.client.model.BecsBankDebitAdditionalData;
import com.hyperswitch.client.model.SepaBankDebitAdditionalData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * BankDebitResponse
 */
@JsonPropertyOrder({
  BankDebitResponse.JSON_PROPERTY_ACH,
  BankDebitResponse.JSON_PROPERTY_BACS,
  BankDebitResponse.JSON_PROPERTY_BECS,
  BankDebitResponse.JSON_PROPERTY_SEPA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BankDebitResponse {
  public static final String JSON_PROPERTY_ACH = "ach";
  private AchBankDebitAdditionalData ach;

  public static final String JSON_PROPERTY_BACS = "bacs";
  private BacsBankDebitAdditionalData bacs;

  public static final String JSON_PROPERTY_BECS = "becs";
  private BecsBankDebitAdditionalData becs;

  public static final String JSON_PROPERTY_SEPA = "sepa";
  private SepaBankDebitAdditionalData sepa;

  public BankDebitResponse() {
  }

  public BankDebitResponse ach(AchBankDebitAdditionalData ach) {
    
    this.ach = ach;
    return this;
  }

   /**
   * Get ach
   * @return ach
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AchBankDebitAdditionalData getAch() {
    return ach;
  }


  @JsonProperty(JSON_PROPERTY_ACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAch(AchBankDebitAdditionalData ach) {
    this.ach = ach;
  }


  public BankDebitResponse bacs(BacsBankDebitAdditionalData bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BACS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BacsBankDebitAdditionalData getBacs() {
    return bacs;
  }


  @JsonProperty(JSON_PROPERTY_BACS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBacs(BacsBankDebitAdditionalData bacs) {
    this.bacs = bacs;
  }


  public BankDebitResponse becs(BecsBankDebitAdditionalData becs) {
    
    this.becs = becs;
    return this;
  }

   /**
   * Get becs
   * @return becs
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BECS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BecsBankDebitAdditionalData getBecs() {
    return becs;
  }


  @JsonProperty(JSON_PROPERTY_BECS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBecs(BecsBankDebitAdditionalData becs) {
    this.becs = becs;
  }


  public BankDebitResponse sepa(SepaBankDebitAdditionalData sepa) {
    
    this.sepa = sepa;
    return this;
  }

   /**
   * Get sepa
   * @return sepa
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEPA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SepaBankDebitAdditionalData getSepa() {
    return sepa;
  }


  @JsonProperty(JSON_PROPERTY_SEPA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSepa(SepaBankDebitAdditionalData sepa) {
    this.sepa = sepa;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankDebitResponse bankDebitResponse = (BankDebitResponse) o;
    return Objects.equals(this.ach, bankDebitResponse.ach) &&
        Objects.equals(this.bacs, bankDebitResponse.bacs) &&
        Objects.equals(this.becs, bankDebitResponse.becs) &&
        Objects.equals(this.sepa, bankDebitResponse.sepa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ach, bacs, becs, sepa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankDebitResponse {\n");
    sb.append("    ach: ").append(toIndentedString(ach)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
    sb.append("    becs: ").append(toIndentedString(becs)).append("\n");
    sb.append("    sepa: ").append(toIndentedString(sepa)).append("\n");
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

    // add `ach` to the URL query string
    if (getAch() != null) {
      joiner.add(getAch().toUrlQueryString(prefix + "ach" + suffix));
    }

    // add `bacs` to the URL query string
    if (getBacs() != null) {
      joiner.add(getBacs().toUrlQueryString(prefix + "bacs" + suffix));
    }

    // add `becs` to the URL query string
    if (getBecs() != null) {
      joiner.add(getBecs().toUrlQueryString(prefix + "becs" + suffix));
    }

    // add `sepa` to the URL query string
    if (getSepa() != null) {
      joiner.add(getSepa().toUrlQueryString(prefix + "sepa" + suffix));
    }

    return joiner.toString();
  }

}


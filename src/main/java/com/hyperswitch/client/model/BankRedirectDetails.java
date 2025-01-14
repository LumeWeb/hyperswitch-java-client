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
import com.hyperswitch.client.model.BancontactBankRedirectAdditionalData;
import com.hyperswitch.client.model.BankRedirectDetailsOneOf;
import com.hyperswitch.client.model.BankRedirectDetailsOneOf1;
import com.hyperswitch.client.model.BankRedirectDetailsOneOf2;
import com.hyperswitch.client.model.BlikBankRedirectAdditionalData;
import com.hyperswitch.client.model.GiropayBankRedirectAdditionalData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * BankRedirectDetails
 */
@JsonPropertyOrder({
  BankRedirectDetails.JSON_PROPERTY_BANCONTACT_CARD,
  BankRedirectDetails.JSON_PROPERTY_BLIK,
  BankRedirectDetails.JSON_PROPERTY_GIROPAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BankRedirectDetails {
  public static final String JSON_PROPERTY_BANCONTACT_CARD = "BancontactCard";
  private BancontactBankRedirectAdditionalData bancontactCard;

  public static final String JSON_PROPERTY_BLIK = "Blik";
  private BlikBankRedirectAdditionalData blik;

  public static final String JSON_PROPERTY_GIROPAY = "Giropay";
  private GiropayBankRedirectAdditionalData giropay;

  public BankRedirectDetails() {
  }

  public BankRedirectDetails bancontactCard(BancontactBankRedirectAdditionalData bancontactCard) {
    
    this.bancontactCard = bancontactCard;
    return this;
  }

   /**
   * Get bancontactCard
   * @return bancontactCard
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANCONTACT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BancontactBankRedirectAdditionalData getBancontactCard() {
    return bancontactCard;
  }


  @JsonProperty(JSON_PROPERTY_BANCONTACT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBancontactCard(BancontactBankRedirectAdditionalData bancontactCard) {
    this.bancontactCard = bancontactCard;
  }


  public BankRedirectDetails blik(BlikBankRedirectAdditionalData blik) {
    
    this.blik = blik;
    return this;
  }

   /**
   * Get blik
   * @return blik
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BLIK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BlikBankRedirectAdditionalData getBlik() {
    return blik;
  }


  @JsonProperty(JSON_PROPERTY_BLIK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlik(BlikBankRedirectAdditionalData blik) {
    this.blik = blik;
  }


  public BankRedirectDetails giropay(GiropayBankRedirectAdditionalData giropay) {
    
    this.giropay = giropay;
    return this;
  }

   /**
   * Get giropay
   * @return giropay
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GIROPAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GiropayBankRedirectAdditionalData getGiropay() {
    return giropay;
  }


  @JsonProperty(JSON_PROPERTY_GIROPAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGiropay(GiropayBankRedirectAdditionalData giropay) {
    this.giropay = giropay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankRedirectDetails bankRedirectDetails = (BankRedirectDetails) o;
    return Objects.equals(this.bancontactCard, bankRedirectDetails.bancontactCard) &&
        Objects.equals(this.blik, bankRedirectDetails.blik) &&
        Objects.equals(this.giropay, bankRedirectDetails.giropay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bancontactCard, blik, giropay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankRedirectDetails {\n");
    sb.append("    bancontactCard: ").append(toIndentedString(bancontactCard)).append("\n");
    sb.append("    blik: ").append(toIndentedString(blik)).append("\n");
    sb.append("    giropay: ").append(toIndentedString(giropay)).append("\n");
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

    // add `BancontactCard` to the URL query string
    if (getBancontactCard() != null) {
      joiner.add(getBancontactCard().toUrlQueryString(prefix + "BancontactCard" + suffix));
    }

    // add `Blik` to the URL query string
    if (getBlik() != null) {
      joiner.add(getBlik().toUrlQueryString(prefix + "Blik" + suffix));
    }

    // add `Giropay` to the URL query string
    if (getGiropay() != null) {
      joiner.add(getGiropay().toUrlQueryString(prefix + "Giropay" + suffix));
    }

    return joiner.toString();
  }

}


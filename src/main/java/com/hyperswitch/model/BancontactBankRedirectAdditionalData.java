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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BancontactBankRedirectAdditionalData
 */
@JsonPropertyOrder({
  BancontactBankRedirectAdditionalData.JSON_PROPERTY_LAST4,
  BancontactBankRedirectAdditionalData.JSON_PROPERTY_CARD_EXP_MONTH,
  BancontactBankRedirectAdditionalData.JSON_PROPERTY_CARD_EXP_YEAR,
  BancontactBankRedirectAdditionalData.JSON_PROPERTY_CARD_HOLDER_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class BancontactBankRedirectAdditionalData {
  public static final String JSON_PROPERTY_LAST4 = "last4";
  private JsonNullable<String> last4 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_EXP_MONTH = "card_exp_month";
  private JsonNullable<String> cardExpMonth = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_EXP_YEAR = "card_exp_year";
  private JsonNullable<String> cardExpYear = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_HOLDER_NAME = "card_holder_name";
  private JsonNullable<String> cardHolderName = JsonNullable.<String>undefined();

  public BancontactBankRedirectAdditionalData() {
  }

  public BancontactBankRedirectAdditionalData last4(@javax.annotation.Nullable String last4) {
    this.last4 = JsonNullable.<String>of(last4);
    
    return this;
  }

  /**
   * Last 4 digits of the card number
   * @return last4
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLast4() {
        return last4.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLast4_JsonNullable() {
    return last4;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST4)
  public void setLast4_JsonNullable(JsonNullable<String> last4) {
    this.last4 = last4;
  }

  public void setLast4(@javax.annotation.Nullable String last4) {
    this.last4 = JsonNullable.<String>of(last4);
  }


  public BancontactBankRedirectAdditionalData cardExpMonth(@javax.annotation.Nullable String cardExpMonth) {
    this.cardExpMonth = JsonNullable.<String>of(cardExpMonth);
    
    return this;
  }

  /**
   * The card&#39;s expiry month
   * @return cardExpMonth
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardExpMonth() {
        return cardExpMonth.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardExpMonth_JsonNullable() {
    return cardExpMonth;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_EXP_MONTH)
  public void setCardExpMonth_JsonNullable(JsonNullable<String> cardExpMonth) {
    this.cardExpMonth = cardExpMonth;
  }

  public void setCardExpMonth(@javax.annotation.Nullable String cardExpMonth) {
    this.cardExpMonth = JsonNullable.<String>of(cardExpMonth);
  }


  public BancontactBankRedirectAdditionalData cardExpYear(@javax.annotation.Nullable String cardExpYear) {
    this.cardExpYear = JsonNullable.<String>of(cardExpYear);
    
    return this;
  }

  /**
   * The card&#39;s expiry year
   * @return cardExpYear
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardExpYear() {
        return cardExpYear.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardExpYear_JsonNullable() {
    return cardExpYear;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_EXP_YEAR)
  public void setCardExpYear_JsonNullable(JsonNullable<String> cardExpYear) {
    this.cardExpYear = cardExpYear;
  }

  public void setCardExpYear(@javax.annotation.Nullable String cardExpYear) {
    this.cardExpYear = JsonNullable.<String>of(cardExpYear);
  }


  public BancontactBankRedirectAdditionalData cardHolderName(@javax.annotation.Nullable String cardHolderName) {
    this.cardHolderName = JsonNullable.<String>of(cardHolderName);
    
    return this;
  }

  /**
   * The card holder&#39;s name
   * @return cardHolderName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardHolderName() {
        return cardHolderName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardHolderName_JsonNullable() {
    return cardHolderName;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  public void setCardHolderName_JsonNullable(JsonNullable<String> cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public void setCardHolderName(@javax.annotation.Nullable String cardHolderName) {
    this.cardHolderName = JsonNullable.<String>of(cardHolderName);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BancontactBankRedirectAdditionalData bancontactBankRedirectAdditionalData = (BancontactBankRedirectAdditionalData) o;
    return equalsNullable(this.last4, bancontactBankRedirectAdditionalData.last4) &&
        equalsNullable(this.cardExpMonth, bancontactBankRedirectAdditionalData.cardExpMonth) &&
        equalsNullable(this.cardExpYear, bancontactBankRedirectAdditionalData.cardExpYear) &&
        equalsNullable(this.cardHolderName, bancontactBankRedirectAdditionalData.cardHolderName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(last4), hashCodeNullable(cardExpMonth), hashCodeNullable(cardExpYear), hashCodeNullable(cardHolderName));
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
    sb.append("class BancontactBankRedirectAdditionalData {\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    cardExpMonth: ").append(toIndentedString(cardExpMonth)).append("\n");
    sb.append("    cardExpYear: ").append(toIndentedString(cardExpYear)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
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


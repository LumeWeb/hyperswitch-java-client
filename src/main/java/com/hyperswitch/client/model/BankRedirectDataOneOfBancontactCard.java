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
import com.hyperswitch.client.model.BankRedirectBilling;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankRedirectDataOneOfBancontactCard
 */
@JsonPropertyOrder({
  BankRedirectDataOneOfBancontactCard.JSON_PROPERTY_CARD_NUMBER,
  BankRedirectDataOneOfBancontactCard.JSON_PROPERTY_CARD_EXP_MONTH,
  BankRedirectDataOneOfBancontactCard.JSON_PROPERTY_CARD_EXP_YEAR,
  BankRedirectDataOneOfBancontactCard.JSON_PROPERTY_CARD_HOLDER_NAME,
  BankRedirectDataOneOfBancontactCard.JSON_PROPERTY_BILLING_DETAILS
})
@JsonTypeName("BankRedirectData_oneOf_bancontact_card")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BankRedirectDataOneOfBancontactCard {
  public static final String JSON_PROPERTY_CARD_NUMBER = "card_number";
  private String cardNumber;

  public static final String JSON_PROPERTY_CARD_EXP_MONTH = "card_exp_month";
  private String cardExpMonth;

  public static final String JSON_PROPERTY_CARD_EXP_YEAR = "card_exp_year";
  private String cardExpYear;

  public static final String JSON_PROPERTY_CARD_HOLDER_NAME = "card_holder_name";
  private String cardHolderName;

  public static final String JSON_PROPERTY_BILLING_DETAILS = "billing_details";
  private JsonNullable<BankRedirectBilling> billingDetails = JsonNullable.<BankRedirectBilling>undefined();

  public BankRedirectDataOneOfBancontactCard() {
  }

  public BankRedirectDataOneOfBancontactCard cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * The card number
   * @return cardNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCardNumber() {
    return cardNumber;
  }


  @JsonProperty(JSON_PROPERTY_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public BankRedirectDataOneOfBancontactCard cardExpMonth(String cardExpMonth) {
    
    this.cardExpMonth = cardExpMonth;
    return this;
  }

   /**
   * The card&#39;s expiry month
   * @return cardExpMonth
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCardExpMonth() {
    return cardExpMonth;
  }


  @JsonProperty(JSON_PROPERTY_CARD_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardExpMonth(String cardExpMonth) {
    this.cardExpMonth = cardExpMonth;
  }


  public BankRedirectDataOneOfBancontactCard cardExpYear(String cardExpYear) {
    
    this.cardExpYear = cardExpYear;
    return this;
  }

   /**
   * The card&#39;s expiry year
   * @return cardExpYear
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCardExpYear() {
    return cardExpYear;
  }


  @JsonProperty(JSON_PROPERTY_CARD_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardExpYear(String cardExpYear) {
    this.cardExpYear = cardExpYear;
  }


  public BankRedirectDataOneOfBancontactCard cardHolderName(String cardHolderName) {
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * The card holder&#39;s name
   * @return cardHolderName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCardHolderName() {
    return cardHolderName;
  }


  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }


  public BankRedirectDataOneOfBancontactCard billingDetails(BankRedirectBilling billingDetails) {
    this.billingDetails = JsonNullable.<BankRedirectBilling>of(billingDetails);
    
    return this;
  }

   /**
   * Get billingDetails
   * @return billingDetails
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public BankRedirectBilling getBillingDetails() {
        return billingDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BankRedirectBilling> getBillingDetails_JsonNullable() {
    return billingDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_BILLING_DETAILS)
  public void setBillingDetails_JsonNullable(JsonNullable<BankRedirectBilling> billingDetails) {
    this.billingDetails = billingDetails;
  }

  public void setBillingDetails(BankRedirectBilling billingDetails) {
    this.billingDetails = JsonNullable.<BankRedirectBilling>of(billingDetails);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankRedirectDataOneOfBancontactCard bankRedirectDataOneOfBancontactCard = (BankRedirectDataOneOfBancontactCard) o;
    return Objects.equals(this.cardNumber, bankRedirectDataOneOfBancontactCard.cardNumber) &&
        Objects.equals(this.cardExpMonth, bankRedirectDataOneOfBancontactCard.cardExpMonth) &&
        Objects.equals(this.cardExpYear, bankRedirectDataOneOfBancontactCard.cardExpYear) &&
        Objects.equals(this.cardHolderName, bankRedirectDataOneOfBancontactCard.cardHolderName) &&
        equalsNullable(this.billingDetails, bankRedirectDataOneOfBancontactCard.billingDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, cardExpMonth, cardExpYear, cardHolderName, hashCodeNullable(billingDetails));
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
    sb.append("class BankRedirectDataOneOfBancontactCard {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardExpMonth: ").append(toIndentedString(cardExpMonth)).append("\n");
    sb.append("    cardExpYear: ").append(toIndentedString(cardExpYear)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    billingDetails: ").append(toIndentedString(billingDetails)).append("\n");
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


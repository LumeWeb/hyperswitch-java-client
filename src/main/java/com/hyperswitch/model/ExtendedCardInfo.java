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
import com.hyperswitch.model.CardNetwork;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ExtendedCardInfo
 */
@JsonPropertyOrder({
  ExtendedCardInfo.JSON_PROPERTY_CARD_NUMBER,
  ExtendedCardInfo.JSON_PROPERTY_CARD_EXP_MONTH,
  ExtendedCardInfo.JSON_PROPERTY_CARD_EXP_YEAR,
  ExtendedCardInfo.JSON_PROPERTY_CARD_HOLDER_NAME,
  ExtendedCardInfo.JSON_PROPERTY_CARD_CVC,
  ExtendedCardInfo.JSON_PROPERTY_CARD_ISSUER,
  ExtendedCardInfo.JSON_PROPERTY_CARD_NETWORK,
  ExtendedCardInfo.JSON_PROPERTY_CARD_TYPE,
  ExtendedCardInfo.JSON_PROPERTY_CARD_ISSUING_COUNTRY,
  ExtendedCardInfo.JSON_PROPERTY_BANK_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExtendedCardInfo {
  public static final String JSON_PROPERTY_CARD_NUMBER = "card_number";
  private String cardNumber;

  public static final String JSON_PROPERTY_CARD_EXP_MONTH = "card_exp_month";
  private String cardExpMonth;

  public static final String JSON_PROPERTY_CARD_EXP_YEAR = "card_exp_year";
  private String cardExpYear;

  public static final String JSON_PROPERTY_CARD_HOLDER_NAME = "card_holder_name";
  private String cardHolderName;

  public static final String JSON_PROPERTY_CARD_CVC = "card_cvc";
  private String cardCvc;

  public static final String JSON_PROPERTY_CARD_ISSUER = "card_issuer";
  private JsonNullable<String> cardIssuer = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_NETWORK = "card_network";
  private JsonNullable<CardNetwork> cardNetwork = JsonNullable.<CardNetwork>undefined();

  public static final String JSON_PROPERTY_CARD_TYPE = "card_type";
  private JsonNullable<String> cardType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_ISSUING_COUNTRY = "card_issuing_country";
  private JsonNullable<String> cardIssuingCountry = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BANK_CODE = "bank_code";
  private JsonNullable<String> bankCode = JsonNullable.<String>undefined();

  public ExtendedCardInfo() { 
  }

  public ExtendedCardInfo cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * The card number
   * @return cardNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4242424242424242", required = true, value = "The card number")
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


  public ExtendedCardInfo cardExpMonth(String cardExpMonth) {
    
    this.cardExpMonth = cardExpMonth;
    return this;
  }

   /**
   * The card&#39;s expiry month
   * @return cardExpMonth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "24", required = true, value = "The card's expiry month")
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


  public ExtendedCardInfo cardExpYear(String cardExpYear) {
    
    this.cardExpYear = cardExpYear;
    return this;
  }

   /**
   * The card&#39;s expiry year
   * @return cardExpYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "24", required = true, value = "The card's expiry year")
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


  public ExtendedCardInfo cardHolderName(String cardHolderName) {
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * The card holder&#39;s name
   * @return cardHolderName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "John Test", required = true, value = "The card holder's name")
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


  public ExtendedCardInfo cardCvc(String cardCvc) {
    
    this.cardCvc = cardCvc;
    return this;
  }

   /**
   * The CVC number for the card
   * @return cardCvc
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "242", required = true, value = "The CVC number for the card")
  @JsonProperty(JSON_PROPERTY_CARD_CVC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCardCvc() {
    return cardCvc;
  }


  @JsonProperty(JSON_PROPERTY_CARD_CVC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardCvc(String cardCvc) {
    this.cardCvc = cardCvc;
  }


  public ExtendedCardInfo cardIssuer(String cardIssuer) {
    this.cardIssuer = JsonNullable.<String>of(cardIssuer);
    
    return this;
  }

   /**
   * The name of the issuer of card
   * @return cardIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "chase", value = "The name of the issuer of card")
  @JsonIgnore

  public String getCardIssuer() {
        return cardIssuer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardIssuer_JsonNullable() {
    return cardIssuer;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_ISSUER)
  public void setCardIssuer_JsonNullable(JsonNullable<String> cardIssuer) {
    this.cardIssuer = cardIssuer;
  }

  public void setCardIssuer(String cardIssuer) {
    this.cardIssuer = JsonNullable.<String>of(cardIssuer);
  }


  public ExtendedCardInfo cardNetwork(CardNetwork cardNetwork) {
    this.cardNetwork = JsonNullable.<CardNetwork>of(cardNetwork);
    
    return this;
  }

   /**
   * Get cardNetwork
   * @return cardNetwork
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public CardNetwork getCardNetwork() {
        return cardNetwork.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CardNetwork> getCardNetwork_JsonNullable() {
    return cardNetwork;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_NETWORK)
  public void setCardNetwork_JsonNullable(JsonNullable<CardNetwork> cardNetwork) {
    this.cardNetwork = cardNetwork;
  }

  public void setCardNetwork(CardNetwork cardNetwork) {
    this.cardNetwork = JsonNullable.<CardNetwork>of(cardNetwork);
  }


  public ExtendedCardInfo cardType(String cardType) {
    this.cardType = JsonNullable.<String>of(cardType);
    
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREDIT", value = "")
  @JsonIgnore

  public String getCardType() {
        return cardType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardType_JsonNullable() {
    return cardType;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_TYPE)
  public void setCardType_JsonNullable(JsonNullable<String> cardType) {
    this.cardType = cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = JsonNullable.<String>of(cardType);
  }


  public ExtendedCardInfo cardIssuingCountry(String cardIssuingCountry) {
    this.cardIssuingCountry = JsonNullable.<String>of(cardIssuingCountry);
    
    return this;
  }

   /**
   * Get cardIssuingCountry
   * @return cardIssuingCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "INDIA", value = "")
  @JsonIgnore

  public String getCardIssuingCountry() {
        return cardIssuingCountry.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_ISSUING_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardIssuingCountry_JsonNullable() {
    return cardIssuingCountry;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_ISSUING_COUNTRY)
  public void setCardIssuingCountry_JsonNullable(JsonNullable<String> cardIssuingCountry) {
    this.cardIssuingCountry = cardIssuingCountry;
  }

  public void setCardIssuingCountry(String cardIssuingCountry) {
    this.cardIssuingCountry = JsonNullable.<String>of(cardIssuingCountry);
  }


  public ExtendedCardInfo bankCode(String bankCode) {
    this.bankCode = JsonNullable.<String>of(bankCode);
    
    return this;
  }

   /**
   * Get bankCode
   * @return bankCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JP_AMEX", value = "")
  @JsonIgnore

  public String getBankCode() {
        return bankCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBankCode_JsonNullable() {
    return bankCode;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_CODE)
  public void setBankCode_JsonNullable(JsonNullable<String> bankCode) {
    this.bankCode = bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = JsonNullable.<String>of(bankCode);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedCardInfo extendedCardInfo = (ExtendedCardInfo) o;
    return Objects.equals(this.cardNumber, extendedCardInfo.cardNumber) &&
        Objects.equals(this.cardExpMonth, extendedCardInfo.cardExpMonth) &&
        Objects.equals(this.cardExpYear, extendedCardInfo.cardExpYear) &&
        Objects.equals(this.cardHolderName, extendedCardInfo.cardHolderName) &&
        Objects.equals(this.cardCvc, extendedCardInfo.cardCvc) &&
        equalsNullable(this.cardIssuer, extendedCardInfo.cardIssuer) &&
        equalsNullable(this.cardNetwork, extendedCardInfo.cardNetwork) &&
        equalsNullable(this.cardType, extendedCardInfo.cardType) &&
        equalsNullable(this.cardIssuingCountry, extendedCardInfo.cardIssuingCountry) &&
        equalsNullable(this.bankCode, extendedCardInfo.bankCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, cardExpMonth, cardExpYear, cardHolderName, cardCvc, hashCodeNullable(cardIssuer), hashCodeNullable(cardNetwork), hashCodeNullable(cardType), hashCodeNullable(cardIssuingCountry), hashCodeNullable(bankCode));
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
    sb.append("class ExtendedCardInfo {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardExpMonth: ").append(toIndentedString(cardExpMonth)).append("\n");
    sb.append("    cardExpYear: ").append(toIndentedString(cardExpYear)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardCvc: ").append(toIndentedString(cardCvc)).append("\n");
    sb.append("    cardIssuer: ").append(toIndentedString(cardIssuer)).append("\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardIssuingCountry: ").append(toIndentedString(cardIssuingCountry)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
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


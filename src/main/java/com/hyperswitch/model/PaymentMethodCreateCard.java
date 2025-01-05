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
import com.hyperswitch.model.CardDetail;
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
 * PaymentMethodCreateCard
 */
@JsonPropertyOrder({
  PaymentMethodCreateCard.JSON_PROPERTY_CARD_NUMBER,
  PaymentMethodCreateCard.JSON_PROPERTY_CARD_EXP_MONTH,
  PaymentMethodCreateCard.JSON_PROPERTY_CARD_EXP_YEAR,
  PaymentMethodCreateCard.JSON_PROPERTY_CARD_HOLDER_NAME,
  PaymentMethodCreateCard.JSON_PROPERTY_NICK_NAME,
  PaymentMethodCreateCard.JSON_PROPERTY_CARD_ISSUING_COUNTRY,
  PaymentMethodCreateCard.JSON_PROPERTY_CARD_NETWORK,
  PaymentMethodCreateCard.JSON_PROPERTY_CARD_ISSUER,
  PaymentMethodCreateCard.JSON_PROPERTY_CARD_TYPE
})
@JsonTypeName("PaymentMethodCreate_card")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentMethodCreateCard {
  public static final String JSON_PROPERTY_CARD_NUMBER = "card_number";
  private String cardNumber;

  public static final String JSON_PROPERTY_CARD_EXP_MONTH = "card_exp_month";
  private String cardExpMonth;

  public static final String JSON_PROPERTY_CARD_EXP_YEAR = "card_exp_year";
  private String cardExpYear;

  public static final String JSON_PROPERTY_CARD_HOLDER_NAME = "card_holder_name";
  private String cardHolderName;

  public static final String JSON_PROPERTY_NICK_NAME = "nick_name";
  private JsonNullable<String> nickName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_ISSUING_COUNTRY = "card_issuing_country";
  private JsonNullable<String> cardIssuingCountry = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_NETWORK = "card_network";
  private JsonNullable<CardNetwork> cardNetwork = JsonNullable.<CardNetwork>undefined();

  public static final String JSON_PROPERTY_CARD_ISSUER = "card_issuer";
  private JsonNullable<String> cardIssuer = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_TYPE = "card_type";
  private JsonNullable<String> cardType = JsonNullable.<String>undefined();

  public PaymentMethodCreateCard() { 
  }

  public PaymentMethodCreateCard cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Card Number
   * @return cardNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4111111145551142", required = true, value = "Card Number")
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


  public PaymentMethodCreateCard cardExpMonth(String cardExpMonth) {
    
    this.cardExpMonth = cardExpMonth;
    return this;
  }

   /**
   * Card Expiry Month
   * @return cardExpMonth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "Card Expiry Month")
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


  public PaymentMethodCreateCard cardExpYear(String cardExpYear) {
    
    this.cardExpYear = cardExpYear;
    return this;
  }

   /**
   * Card Expiry Year
   * @return cardExpYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "25", required = true, value = "Card Expiry Year")
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


  public PaymentMethodCreateCard cardHolderName(String cardHolderName) {
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * Card Holder Name
   * @return cardHolderName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "John Doe", required = true, value = "Card Holder Name")
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


  public PaymentMethodCreateCard nickName(String nickName) {
    this.nickName = JsonNullable.<String>of(nickName);
    
    return this;
  }

   /**
   * Card Holder&#39;s Nick Name
   * @return nickName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "Card Holder's Nick Name")
  @JsonIgnore

  public String getNickName() {
        return nickName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NICK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNickName_JsonNullable() {
    return nickName;
  }
  
  @JsonProperty(JSON_PROPERTY_NICK_NAME)
  public void setNickName_JsonNullable(JsonNullable<String> nickName) {
    this.nickName = nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = JsonNullable.<String>of(nickName);
  }


  public PaymentMethodCreateCard cardIssuingCountry(String cardIssuingCountry) {
    this.cardIssuingCountry = JsonNullable.<String>of(cardIssuingCountry);
    
    return this;
  }

   /**
   * Card Issuing Country
   * @return cardIssuingCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card Issuing Country")
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


  public PaymentMethodCreateCard cardNetwork(CardNetwork cardNetwork) {
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


  public PaymentMethodCreateCard cardIssuer(String cardIssuer) {
    this.cardIssuer = JsonNullable.<String>of(cardIssuer);
    
    return this;
  }

   /**
   * Issuer Bank for Card
   * @return cardIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Issuer Bank for Card")
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


  public PaymentMethodCreateCard cardType(String cardType) {
    this.cardType = JsonNullable.<String>of(cardType);
    
    return this;
  }

   /**
   * Card Type
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card Type")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCreateCard paymentMethodCreateCard = (PaymentMethodCreateCard) o;
    return Objects.equals(this.cardNumber, paymentMethodCreateCard.cardNumber) &&
        Objects.equals(this.cardExpMonth, paymentMethodCreateCard.cardExpMonth) &&
        Objects.equals(this.cardExpYear, paymentMethodCreateCard.cardExpYear) &&
        Objects.equals(this.cardHolderName, paymentMethodCreateCard.cardHolderName) &&
        equalsNullable(this.nickName, paymentMethodCreateCard.nickName) &&
        equalsNullable(this.cardIssuingCountry, paymentMethodCreateCard.cardIssuingCountry) &&
        equalsNullable(this.cardNetwork, paymentMethodCreateCard.cardNetwork) &&
        equalsNullable(this.cardIssuer, paymentMethodCreateCard.cardIssuer) &&
        equalsNullable(this.cardType, paymentMethodCreateCard.cardType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, cardExpMonth, cardExpYear, cardHolderName, hashCodeNullable(nickName), hashCodeNullable(cardIssuingCountry), hashCodeNullable(cardNetwork), hashCodeNullable(cardIssuer), hashCodeNullable(cardType));
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
    sb.append("class PaymentMethodCreateCard {\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardExpMonth: ").append(toIndentedString(cardExpMonth)).append("\n");
    sb.append("    cardExpYear: ").append(toIndentedString(cardExpYear)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    cardIssuingCountry: ").append(toIndentedString(cardIssuingCountry)).append("\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
    sb.append("    cardIssuer: ").append(toIndentedString(cardIssuer)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
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


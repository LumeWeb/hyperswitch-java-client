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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Masked payout method details for card payout method
 */
@JsonPropertyOrder({
  CardAdditionalData.JSON_PROPERTY_CARD_ISSUER,
  CardAdditionalData.JSON_PROPERTY_CARD_NETWORK,
  CardAdditionalData.JSON_PROPERTY_CARD_TYPE,
  CardAdditionalData.JSON_PROPERTY_CARD_ISSUING_COUNTRY,
  CardAdditionalData.JSON_PROPERTY_BANK_CODE,
  CardAdditionalData.JSON_PROPERTY_LAST4,
  CardAdditionalData.JSON_PROPERTY_CARD_ISIN,
  CardAdditionalData.JSON_PROPERTY_CARD_EXTENDED_BIN,
  CardAdditionalData.JSON_PROPERTY_CARD_EXP_MONTH,
  CardAdditionalData.JSON_PROPERTY_CARD_EXP_YEAR,
  CardAdditionalData.JSON_PROPERTY_CARD_HOLDER_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class CardAdditionalData {
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

  public static final String JSON_PROPERTY_LAST4 = "last4";
  private JsonNullable<String> last4 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_ISIN = "card_isin";
  private JsonNullable<String> cardIsin = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_EXTENDED_BIN = "card_extended_bin";
  private JsonNullable<String> cardExtendedBin = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CARD_EXP_MONTH = "card_exp_month";
  @javax.annotation.Nonnull
  private String cardExpMonth;

  public static final String JSON_PROPERTY_CARD_EXP_YEAR = "card_exp_year";
  @javax.annotation.Nonnull
  private String cardExpYear;

  public static final String JSON_PROPERTY_CARD_HOLDER_NAME = "card_holder_name";
  @javax.annotation.Nonnull
  private String cardHolderName;

  public CardAdditionalData() {
  }

  public CardAdditionalData cardIssuer(@javax.annotation.Nullable String cardIssuer) {
    this.cardIssuer = JsonNullable.<String>of(cardIssuer);
    
    return this;
  }

  /**
   * Issuer of the card
   * @return cardIssuer
   */
  @javax.annotation.Nullable
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

  public void setCardIssuer(@javax.annotation.Nullable String cardIssuer) {
    this.cardIssuer = JsonNullable.<String>of(cardIssuer);
  }


  public CardAdditionalData cardNetwork(@javax.annotation.Nullable CardNetwork cardNetwork) {
    this.cardNetwork = JsonNullable.<CardNetwork>of(cardNetwork);
    
    return this;
  }

  /**
   * Get cardNetwork
   * @return cardNetwork
   */
  @javax.annotation.Nullable
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

  public void setCardNetwork(@javax.annotation.Nullable CardNetwork cardNetwork) {
    this.cardNetwork = JsonNullable.<CardNetwork>of(cardNetwork);
  }


  public CardAdditionalData cardType(@javax.annotation.Nullable String cardType) {
    this.cardType = JsonNullable.<String>of(cardType);
    
    return this;
  }

  /**
   * Card type, can be either &#x60;credit&#x60; or &#x60;debit&#x60;
   * @return cardType
   */
  @javax.annotation.Nullable
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

  public void setCardType(@javax.annotation.Nullable String cardType) {
    this.cardType = JsonNullable.<String>of(cardType);
  }


  public CardAdditionalData cardIssuingCountry(@javax.annotation.Nullable String cardIssuingCountry) {
    this.cardIssuingCountry = JsonNullable.<String>of(cardIssuingCountry);
    
    return this;
  }

  /**
   * Card issuing country
   * @return cardIssuingCountry
   */
  @javax.annotation.Nullable
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

  public void setCardIssuingCountry(@javax.annotation.Nullable String cardIssuingCountry) {
    this.cardIssuingCountry = JsonNullable.<String>of(cardIssuingCountry);
  }


  public CardAdditionalData bankCode(@javax.annotation.Nullable String bankCode) {
    this.bankCode = JsonNullable.<String>of(bankCode);
    
    return this;
  }

  /**
   * Code for Card issuing bank
   * @return bankCode
   */
  @javax.annotation.Nullable
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

  public void setBankCode(@javax.annotation.Nullable String bankCode) {
    this.bankCode = JsonNullable.<String>of(bankCode);
  }


  public CardAdditionalData last4(@javax.annotation.Nullable String last4) {
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


  public CardAdditionalData cardIsin(@javax.annotation.Nullable String cardIsin) {
    this.cardIsin = JsonNullable.<String>of(cardIsin);
    
    return this;
  }

  /**
   * The ISIN of the card
   * @return cardIsin
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardIsin() {
        return cardIsin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardIsin_JsonNullable() {
    return cardIsin;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_ISIN)
  public void setCardIsin_JsonNullable(JsonNullable<String> cardIsin) {
    this.cardIsin = cardIsin;
  }

  public void setCardIsin(@javax.annotation.Nullable String cardIsin) {
    this.cardIsin = JsonNullable.<String>of(cardIsin);
  }


  public CardAdditionalData cardExtendedBin(@javax.annotation.Nullable String cardExtendedBin) {
    this.cardExtendedBin = JsonNullable.<String>of(cardExtendedBin);
    
    return this;
  }

  /**
   * Extended bin of card, contains the first 8 digits of card number
   * @return cardExtendedBin
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCardExtendedBin() {
        return cardExtendedBin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CARD_EXTENDED_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCardExtendedBin_JsonNullable() {
    return cardExtendedBin;
  }
  
  @JsonProperty(JSON_PROPERTY_CARD_EXTENDED_BIN)
  public void setCardExtendedBin_JsonNullable(JsonNullable<String> cardExtendedBin) {
    this.cardExtendedBin = cardExtendedBin;
  }

  public void setCardExtendedBin(@javax.annotation.Nullable String cardExtendedBin) {
    this.cardExtendedBin = JsonNullable.<String>of(cardExtendedBin);
  }


  public CardAdditionalData cardExpMonth(@javax.annotation.Nonnull String cardExpMonth) {
    
    this.cardExpMonth = cardExpMonth;
    return this;
  }

  /**
   * Card expiry month
   * @return cardExpMonth
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCardExpMonth() {
    return cardExpMonth;
  }


  @JsonProperty(JSON_PROPERTY_CARD_EXP_MONTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardExpMonth(@javax.annotation.Nonnull String cardExpMonth) {
    this.cardExpMonth = cardExpMonth;
  }


  public CardAdditionalData cardExpYear(@javax.annotation.Nonnull String cardExpYear) {
    
    this.cardExpYear = cardExpYear;
    return this;
  }

  /**
   * Card expiry year
   * @return cardExpYear
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCardExpYear() {
    return cardExpYear;
  }


  @JsonProperty(JSON_PROPERTY_CARD_EXP_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardExpYear(@javax.annotation.Nonnull String cardExpYear) {
    this.cardExpYear = cardExpYear;
  }


  public CardAdditionalData cardHolderName(@javax.annotation.Nonnull String cardHolderName) {
    
    this.cardHolderName = cardHolderName;
    return this;
  }

  /**
   * Card holder name
   * @return cardHolderName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCardHolderName() {
    return cardHolderName;
  }


  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardHolderName(@javax.annotation.Nonnull String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardAdditionalData cardAdditionalData = (CardAdditionalData) o;
    return equalsNullable(this.cardIssuer, cardAdditionalData.cardIssuer) &&
        equalsNullable(this.cardNetwork, cardAdditionalData.cardNetwork) &&
        equalsNullable(this.cardType, cardAdditionalData.cardType) &&
        equalsNullable(this.cardIssuingCountry, cardAdditionalData.cardIssuingCountry) &&
        equalsNullable(this.bankCode, cardAdditionalData.bankCode) &&
        equalsNullable(this.last4, cardAdditionalData.last4) &&
        equalsNullable(this.cardIsin, cardAdditionalData.cardIsin) &&
        equalsNullable(this.cardExtendedBin, cardAdditionalData.cardExtendedBin) &&
        Objects.equals(this.cardExpMonth, cardAdditionalData.cardExpMonth) &&
        Objects.equals(this.cardExpYear, cardAdditionalData.cardExpYear) &&
        Objects.equals(this.cardHolderName, cardAdditionalData.cardHolderName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(cardIssuer), hashCodeNullable(cardNetwork), hashCodeNullable(cardType), hashCodeNullable(cardIssuingCountry), hashCodeNullable(bankCode), hashCodeNullable(last4), hashCodeNullable(cardIsin), hashCodeNullable(cardExtendedBin), cardExpMonth, cardExpYear, cardHolderName);
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
    sb.append("class CardAdditionalData {\n");
    sb.append("    cardIssuer: ").append(toIndentedString(cardIssuer)).append("\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardIssuingCountry: ").append(toIndentedString(cardIssuingCountry)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    cardIsin: ").append(toIndentedString(cardIsin)).append("\n");
    sb.append("    cardExtendedBin: ").append(toIndentedString(cardExtendedBin)).append("\n");
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


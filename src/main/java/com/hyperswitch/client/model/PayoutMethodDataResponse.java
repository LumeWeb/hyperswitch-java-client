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
import com.hyperswitch.client.model.BankAdditionalData;
import com.hyperswitch.client.model.CardAdditionalData;
import com.hyperswitch.client.model.PayoutMethodDataResponseOneOf;
import com.hyperswitch.client.model.PayoutMethodDataResponseOneOf1;
import com.hyperswitch.client.model.PayoutMethodDataResponseOneOf2;
import com.hyperswitch.client.model.WalletAdditionalData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The payout method information for response
 */
@JsonPropertyOrder({
  PayoutMethodDataResponse.JSON_PROPERTY_CARD,
  PayoutMethodDataResponse.JSON_PROPERTY_BANK,
  PayoutMethodDataResponse.JSON_PROPERTY_WALLET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PayoutMethodDataResponse {
  public static final String JSON_PROPERTY_CARD = "card";
  @javax.annotation.Nonnull
  private CardAdditionalData card;

  public static final String JSON_PROPERTY_BANK = "bank";
  @javax.annotation.Nonnull
  private BankAdditionalData bank;

  public static final String JSON_PROPERTY_WALLET = "wallet";
  @javax.annotation.Nonnull
  private WalletAdditionalData wallet;

  public PayoutMethodDataResponse() {
  }

  public PayoutMethodDataResponse card(@javax.annotation.Nonnull CardAdditionalData card) {
    
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CardAdditionalData getCard() {
    return card;
  }


  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCard(@javax.annotation.Nonnull CardAdditionalData card) {
    this.card = card;
  }

  public PayoutMethodDataResponse bank(@javax.annotation.Nonnull BankAdditionalData bank) {
    
    this.bank = bank;
    return this;
  }

  /**
   * Get bank
   * @return bank
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankAdditionalData getBank() {
    return bank;
  }


  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBank(@javax.annotation.Nonnull BankAdditionalData bank) {
    this.bank = bank;
  }

  public PayoutMethodDataResponse wallet(@javax.annotation.Nonnull WalletAdditionalData wallet) {
    
    this.wallet = wallet;
    return this;
  }

  /**
   * Get wallet
   * @return wallet
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WalletAdditionalData getWallet() {
    return wallet;
  }


  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWallet(@javax.annotation.Nonnull WalletAdditionalData wallet) {
    this.wallet = wallet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutMethodDataResponse payoutMethodDataResponse = (PayoutMethodDataResponse) o;
    return Objects.equals(this.card, payoutMethodDataResponse.card) &&
        Objects.equals(this.bank, payoutMethodDataResponse.bank) &&
        Objects.equals(this.wallet, payoutMethodDataResponse.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, bank, wallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutMethodDataResponse {\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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

    // add `card` to the URL query string
    if (getCard() != null) {
      joiner.add(getCard().toUrlQueryString(prefix + "card" + suffix));
    }

    // add `bank` to the URL query string
    if (getBank() != null) {
      joiner.add(getBank().toUrlQueryString(prefix + "bank" + suffix));
    }

    // add `wallet` to the URL query string
    if (getWallet() != null) {
      joiner.add(getWallet().toUrlQueryString(prefix + "wallet" + suffix));
    }

    return joiner.toString();
  }

}


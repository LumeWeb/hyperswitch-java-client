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
import com.hyperswitch.model.BankAdditionalData;
import com.hyperswitch.model.CardAdditionalData;
import com.hyperswitch.model.PayoutMethodDataResponse;
import com.hyperswitch.model.WalletAdditionalData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PayoutCreateResponsePayoutMethodData
 */
@JsonPropertyOrder({
  PayoutCreateResponsePayoutMethodData.JSON_PROPERTY_CARD,
  PayoutCreateResponsePayoutMethodData.JSON_PROPERTY_BANK,
  PayoutCreateResponsePayoutMethodData.JSON_PROPERTY_WALLET
})
@JsonTypeName("PayoutCreateResponse_payout_method_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PayoutCreateResponsePayoutMethodData {
  public static final String JSON_PROPERTY_CARD = "card";
  private CardAdditionalData card;

  public static final String JSON_PROPERTY_BANK = "bank";
  private BankAdditionalData bank;

  public static final String JSON_PROPERTY_WALLET = "wallet";
  private WalletAdditionalData wallet;

  public PayoutCreateResponsePayoutMethodData() { 
  }

  public PayoutCreateResponsePayoutMethodData card(CardAdditionalData card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CardAdditionalData getCard() {
    return card;
  }


  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCard(CardAdditionalData card) {
    this.card = card;
  }


  public PayoutCreateResponsePayoutMethodData bank(BankAdditionalData bank) {
    
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankAdditionalData getBank() {
    return bank;
  }


  @JsonProperty(JSON_PROPERTY_BANK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBank(BankAdditionalData bank) {
    this.bank = bank;
  }


  public PayoutCreateResponsePayoutMethodData wallet(WalletAdditionalData wallet) {
    
    this.wallet = wallet;
    return this;
  }

   /**
   * Get wallet
   * @return wallet
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WalletAdditionalData getWallet() {
    return wallet;
  }


  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWallet(WalletAdditionalData wallet) {
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
    PayoutCreateResponsePayoutMethodData payoutCreateResponsePayoutMethodData = (PayoutCreateResponsePayoutMethodData) o;
    return Objects.equals(this.card, payoutCreateResponsePayoutMethodData.card) &&
        Objects.equals(this.bank, payoutCreateResponsePayoutMethodData.bank) &&
        Objects.equals(this.wallet, payoutCreateResponsePayoutMethodData.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, bank, wallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutCreateResponsePayoutMethodData {\n");
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

}


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
import com.hyperswitch.model.Address;
import com.hyperswitch.model.BankDebitResponse;
import com.hyperswitch.model.BankRedirectResponse;
import com.hyperswitch.model.BankTransferResponse;
import com.hyperswitch.model.CardRedirectResponse;
import com.hyperswitch.model.CardResponse;
import com.hyperswitch.model.CardTokenResponse;
import com.hyperswitch.model.CryptoResponse;
import com.hyperswitch.model.GiftCardResponse;
import com.hyperswitch.model.OpenBankingResponse;
import com.hyperswitch.model.PaylaterResponse;
import com.hyperswitch.model.PaymentMethodDataRequestAllOf;
import com.hyperswitch.model.RealTimePaymentDataResponse;
import com.hyperswitch.model.UpiResponse;
import com.hyperswitch.model.VoucherResponse;
import com.hyperswitch.model.WalletResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PaymentMethodDataResponseWithBilling
 */
@JsonPropertyOrder({
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_BILLING,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_CARD,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_BANK_TRANSFER,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_WALLET,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_PAY_LATER,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_BANK_REDIRECT,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_CRYPTO,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_BANK_DEBIT,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_MANDATE_PAYMENT,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_REWARD,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_REAL_TIME_PAYMENT,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_UPI,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_VOUCHER,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_GIFT_CARD,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_CARD_REDIRECT,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_CARD_TOKEN,
  PaymentMethodDataResponseWithBilling.JSON_PROPERTY_OPEN_BANKING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentMethodDataResponseWithBilling {
  public static final String JSON_PROPERTY_BILLING = "billing";
  private JsonNullable<Address> billing = JsonNullable.<Address>undefined();

  public static final String JSON_PROPERTY_CARD = "card";
  private CardResponse card;

  public static final String JSON_PROPERTY_BANK_TRANSFER = "bank_transfer";
  private BankTransferResponse bankTransfer;

  public static final String JSON_PROPERTY_WALLET = "wallet";
  private WalletResponse wallet;

  public static final String JSON_PROPERTY_PAY_LATER = "pay_later";
  private PaylaterResponse payLater;

  public static final String JSON_PROPERTY_BANK_REDIRECT = "bank_redirect";
  private BankRedirectResponse bankRedirect;

  public static final String JSON_PROPERTY_CRYPTO = "crypto";
  private CryptoResponse crypto;

  public static final String JSON_PROPERTY_BANK_DEBIT = "bank_debit";
  private BankDebitResponse bankDebit;

  public static final String JSON_PROPERTY_MANDATE_PAYMENT = "mandate_payment";
  private Object mandatePayment;

  public static final String JSON_PROPERTY_REWARD = "reward";
  private Object reward;

  public static final String JSON_PROPERTY_REAL_TIME_PAYMENT = "real_time_payment";
  private RealTimePaymentDataResponse realTimePayment;

  public static final String JSON_PROPERTY_UPI = "upi";
  private UpiResponse upi;

  public static final String JSON_PROPERTY_VOUCHER = "voucher";
  private VoucherResponse voucher;

  public static final String JSON_PROPERTY_GIFT_CARD = "gift_card";
  private GiftCardResponse giftCard;

  public static final String JSON_PROPERTY_CARD_REDIRECT = "card_redirect";
  private CardRedirectResponse cardRedirect;

  public static final String JSON_PROPERTY_CARD_TOKEN = "card_token";
  private CardTokenResponse cardToken;

  public static final String JSON_PROPERTY_OPEN_BANKING = "open_banking";
  private OpenBankingResponse openBanking;

  public PaymentMethodDataResponseWithBilling() { 
  }

  public PaymentMethodDataResponseWithBilling billing(Address billing) {
    this.billing = JsonNullable.<Address>of(billing);
    
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Address getBilling() {
        return billing.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Address> getBilling_JsonNullable() {
    return billing;
  }
  
  @JsonProperty(JSON_PROPERTY_BILLING)
  public void setBilling_JsonNullable(JsonNullable<Address> billing) {
    this.billing = billing;
  }

  public void setBilling(Address billing) {
    this.billing = JsonNullable.<Address>of(billing);
  }


  public PaymentMethodDataResponseWithBilling card(CardResponse card) {
    
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

  public CardResponse getCard() {
    return card;
  }


  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCard(CardResponse card) {
    this.card = card;
  }


  public PaymentMethodDataResponseWithBilling bankTransfer(BankTransferResponse bankTransfer) {
    
    this.bankTransfer = bankTransfer;
    return this;
  }

   /**
   * Get bankTransfer
   * @return bankTransfer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferResponse getBankTransfer() {
    return bankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankTransfer(BankTransferResponse bankTransfer) {
    this.bankTransfer = bankTransfer;
  }


  public PaymentMethodDataResponseWithBilling wallet(WalletResponse wallet) {
    
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

  public WalletResponse getWallet() {
    return wallet;
  }


  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWallet(WalletResponse wallet) {
    this.wallet = wallet;
  }


  public PaymentMethodDataResponseWithBilling payLater(PaylaterResponse payLater) {
    
    this.payLater = payLater;
    return this;
  }

   /**
   * Get payLater
   * @return payLater
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PAY_LATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaylaterResponse getPayLater() {
    return payLater;
  }


  @JsonProperty(JSON_PROPERTY_PAY_LATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayLater(PaylaterResponse payLater) {
    this.payLater = payLater;
  }


  public PaymentMethodDataResponseWithBilling bankRedirect(BankRedirectResponse bankRedirect) {
    
    this.bankRedirect = bankRedirect;
    return this;
  }

   /**
   * Get bankRedirect
   * @return bankRedirect
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BANK_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectResponse getBankRedirect() {
    return bankRedirect;
  }


  @JsonProperty(JSON_PROPERTY_BANK_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankRedirect(BankRedirectResponse bankRedirect) {
    this.bankRedirect = bankRedirect;
  }


  public PaymentMethodDataResponseWithBilling crypto(CryptoResponse crypto) {
    
    this.crypto = crypto;
    return this;
  }

   /**
   * Get crypto
   * @return crypto
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CryptoResponse getCrypto() {
    return crypto;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCrypto(CryptoResponse crypto) {
    this.crypto = crypto;
  }


  public PaymentMethodDataResponseWithBilling bankDebit(BankDebitResponse bankDebit) {
    
    this.bankDebit = bankDebit;
    return this;
  }

   /**
   * Get bankDebit
   * @return bankDebit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankDebitResponse getBankDebit() {
    return bankDebit;
  }


  @JsonProperty(JSON_PROPERTY_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankDebit(BankDebitResponse bankDebit) {
    this.bankDebit = bankDebit;
  }


  public PaymentMethodDataResponseWithBilling mandatePayment(Object mandatePayment) {
    
    this.mandatePayment = mandatePayment;
    return this;
  }

   /**
   * Get mandatePayment
   * @return mandatePayment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MANDATE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMandatePayment() {
    return mandatePayment;
  }


  @JsonProperty(JSON_PROPERTY_MANDATE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMandatePayment(Object mandatePayment) {
    this.mandatePayment = mandatePayment;
  }


  public PaymentMethodDataResponseWithBilling reward(Object reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REWARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getReward() {
    return reward;
  }


  @JsonProperty(JSON_PROPERTY_REWARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReward(Object reward) {
    this.reward = reward;
  }


  public PaymentMethodDataResponseWithBilling realTimePayment(RealTimePaymentDataResponse realTimePayment) {
    
    this.realTimePayment = realTimePayment;
    return this;
  }

   /**
   * Get realTimePayment
   * @return realTimePayment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REAL_TIME_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RealTimePaymentDataResponse getRealTimePayment() {
    return realTimePayment;
  }


  @JsonProperty(JSON_PROPERTY_REAL_TIME_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRealTimePayment(RealTimePaymentDataResponse realTimePayment) {
    this.realTimePayment = realTimePayment;
  }


  public PaymentMethodDataResponseWithBilling upi(UpiResponse upi) {
    
    this.upi = upi;
    return this;
  }

   /**
   * Get upi
   * @return upi
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UPI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UpiResponse getUpi() {
    return upi;
  }


  @JsonProperty(JSON_PROPERTY_UPI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpi(UpiResponse upi) {
    this.upi = upi;
  }


  public PaymentMethodDataResponseWithBilling voucher(VoucherResponse voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VOUCHER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VoucherResponse getVoucher() {
    return voucher;
  }


  @JsonProperty(JSON_PROPERTY_VOUCHER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVoucher(VoucherResponse voucher) {
    this.voucher = voucher;
  }


  public PaymentMethodDataResponseWithBilling giftCard(GiftCardResponse giftCard) {
    
    this.giftCard = giftCard;
    return this;
  }

   /**
   * Get giftCard
   * @return giftCard
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_GIFT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GiftCardResponse getGiftCard() {
    return giftCard;
  }


  @JsonProperty(JSON_PROPERTY_GIFT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGiftCard(GiftCardResponse giftCard) {
    this.giftCard = giftCard;
  }


  public PaymentMethodDataResponseWithBilling cardRedirect(CardRedirectResponse cardRedirect) {
    
    this.cardRedirect = cardRedirect;
    return this;
  }

   /**
   * Get cardRedirect
   * @return cardRedirect
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CARD_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CardRedirectResponse getCardRedirect() {
    return cardRedirect;
  }


  @JsonProperty(JSON_PROPERTY_CARD_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardRedirect(CardRedirectResponse cardRedirect) {
    this.cardRedirect = cardRedirect;
  }


  public PaymentMethodDataResponseWithBilling cardToken(CardTokenResponse cardToken) {
    
    this.cardToken = cardToken;
    return this;
  }

   /**
   * Get cardToken
   * @return cardToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CardTokenResponse getCardToken() {
    return cardToken;
  }


  @JsonProperty(JSON_PROPERTY_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardToken(CardTokenResponse cardToken) {
    this.cardToken = cardToken;
  }


  public PaymentMethodDataResponseWithBilling openBanking(OpenBankingResponse openBanking) {
    
    this.openBanking = openBanking;
    return this;
  }

   /**
   * Get openBanking
   * @return openBanking
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPEN_BANKING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OpenBankingResponse getOpenBanking() {
    return openBanking;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_BANKING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpenBanking(OpenBankingResponse openBanking) {
    this.openBanking = openBanking;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodDataResponseWithBilling paymentMethodDataResponseWithBilling = (PaymentMethodDataResponseWithBilling) o;
    return equalsNullable(this.billing, paymentMethodDataResponseWithBilling.billing) &&
        Objects.equals(this.card, paymentMethodDataResponseWithBilling.card) &&
        Objects.equals(this.bankTransfer, paymentMethodDataResponseWithBilling.bankTransfer) &&
        Objects.equals(this.wallet, paymentMethodDataResponseWithBilling.wallet) &&
        Objects.equals(this.payLater, paymentMethodDataResponseWithBilling.payLater) &&
        Objects.equals(this.bankRedirect, paymentMethodDataResponseWithBilling.bankRedirect) &&
        Objects.equals(this.crypto, paymentMethodDataResponseWithBilling.crypto) &&
        Objects.equals(this.bankDebit, paymentMethodDataResponseWithBilling.bankDebit) &&
        Objects.equals(this.mandatePayment, paymentMethodDataResponseWithBilling.mandatePayment) &&
        Objects.equals(this.reward, paymentMethodDataResponseWithBilling.reward) &&
        Objects.equals(this.realTimePayment, paymentMethodDataResponseWithBilling.realTimePayment) &&
        Objects.equals(this.upi, paymentMethodDataResponseWithBilling.upi) &&
        Objects.equals(this.voucher, paymentMethodDataResponseWithBilling.voucher) &&
        Objects.equals(this.giftCard, paymentMethodDataResponseWithBilling.giftCard) &&
        Objects.equals(this.cardRedirect, paymentMethodDataResponseWithBilling.cardRedirect) &&
        Objects.equals(this.cardToken, paymentMethodDataResponseWithBilling.cardToken) &&
        Objects.equals(this.openBanking, paymentMethodDataResponseWithBilling.openBanking);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(billing), card, bankTransfer, wallet, payLater, bankRedirect, crypto, bankDebit, mandatePayment, reward, realTimePayment, upi, voucher, giftCard, cardRedirect, cardToken, openBanking);
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
    sb.append("class PaymentMethodDataResponseWithBilling {\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    bankTransfer: ").append(toIndentedString(bankTransfer)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    payLater: ").append(toIndentedString(payLater)).append("\n");
    sb.append("    bankRedirect: ").append(toIndentedString(bankRedirect)).append("\n");
    sb.append("    crypto: ").append(toIndentedString(crypto)).append("\n");
    sb.append("    bankDebit: ").append(toIndentedString(bankDebit)).append("\n");
    sb.append("    mandatePayment: ").append(toIndentedString(mandatePayment)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    realTimePayment: ").append(toIndentedString(realTimePayment)).append("\n");
    sb.append("    upi: ").append(toIndentedString(upi)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    giftCard: ").append(toIndentedString(giftCard)).append("\n");
    sb.append("    cardRedirect: ").append(toIndentedString(cardRedirect)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    openBanking: ").append(toIndentedString(openBanking)).append("\n");
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


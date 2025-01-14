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
import com.hyperswitch.client.model.Address;
import com.hyperswitch.client.model.BankDebitData;
import com.hyperswitch.client.model.BankRedirectData;
import com.hyperswitch.client.model.BankTransferData;
import com.hyperswitch.client.model.Card;
import com.hyperswitch.client.model.CardRedirectData;
import com.hyperswitch.client.model.CardToken;
import com.hyperswitch.client.model.CryptoData;
import com.hyperswitch.client.model.GiftCardData;
import com.hyperswitch.client.model.MobilePaymentData;
import com.hyperswitch.client.model.OpenBankingData;
import com.hyperswitch.client.model.PayLaterData;
import com.hyperswitch.client.model.RealTimePaymentData;
import com.hyperswitch.client.model.UpiData;
import com.hyperswitch.client.model.VoucherData;
import com.hyperswitch.client.model.WalletData;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The payment method information provided for making a payment
 */
@JsonPropertyOrder({
  PaymentMethodDataRequest.JSON_PROPERTY_BILLING,
  PaymentMethodDataRequest.JSON_PROPERTY_CARD,
  PaymentMethodDataRequest.JSON_PROPERTY_CARD_REDIRECT,
  PaymentMethodDataRequest.JSON_PROPERTY_WALLET,
  PaymentMethodDataRequest.JSON_PROPERTY_PAY_LATER,
  PaymentMethodDataRequest.JSON_PROPERTY_BANK_REDIRECT,
  PaymentMethodDataRequest.JSON_PROPERTY_BANK_DEBIT,
  PaymentMethodDataRequest.JSON_PROPERTY_BANK_TRANSFER,
  PaymentMethodDataRequest.JSON_PROPERTY_REAL_TIME_PAYMENT,
  PaymentMethodDataRequest.JSON_PROPERTY_CRYPTO,
  PaymentMethodDataRequest.JSON_PROPERTY_UPI,
  PaymentMethodDataRequest.JSON_PROPERTY_VOUCHER,
  PaymentMethodDataRequest.JSON_PROPERTY_GIFT_CARD,
  PaymentMethodDataRequest.JSON_PROPERTY_CARD_TOKEN,
  PaymentMethodDataRequest.JSON_PROPERTY_OPEN_BANKING,
  PaymentMethodDataRequest.JSON_PROPERTY_MOBILE_PAYMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentMethodDataRequest {
  public static final String JSON_PROPERTY_BILLING = "billing";
  private JsonNullable<Address> billing = JsonNullable.<Address>undefined();

  public static final String JSON_PROPERTY_CARD = "card";
  private Card card;

  public static final String JSON_PROPERTY_CARD_REDIRECT = "card_redirect";
  private CardRedirectData cardRedirect;

  public static final String JSON_PROPERTY_WALLET = "wallet";
  private WalletData wallet;

  public static final String JSON_PROPERTY_PAY_LATER = "pay_later";
  private PayLaterData payLater;

  public static final String JSON_PROPERTY_BANK_REDIRECT = "bank_redirect";
  private BankRedirectData bankRedirect;

  public static final String JSON_PROPERTY_BANK_DEBIT = "bank_debit";
  private BankDebitData bankDebit;

  public static final String JSON_PROPERTY_BANK_TRANSFER = "bank_transfer";
  private BankTransferData bankTransfer;

  public static final String JSON_PROPERTY_REAL_TIME_PAYMENT = "real_time_payment";
  private RealTimePaymentData realTimePayment;

  public static final String JSON_PROPERTY_CRYPTO = "crypto";
  private CryptoData crypto;

  public static final String JSON_PROPERTY_UPI = "upi";
  private UpiData upi;

  public static final String JSON_PROPERTY_VOUCHER = "voucher";
  private VoucherData voucher;

  public static final String JSON_PROPERTY_GIFT_CARD = "gift_card";
  private GiftCardData giftCard;

  public static final String JSON_PROPERTY_CARD_TOKEN = "card_token";
  private CardToken cardToken;

  public static final String JSON_PROPERTY_OPEN_BANKING = "open_banking";
  private OpenBankingData openBanking;

  public static final String JSON_PROPERTY_MOBILE_PAYMENT = "mobile_payment";
  private MobilePaymentData mobilePayment;

  public PaymentMethodDataRequest() {
  }

  public PaymentMethodDataRequest billing(Address billing) {
    this.billing = JsonNullable.<Address>of(billing);
    
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @javax.annotation.Nullable
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


  public PaymentMethodDataRequest card(Card card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Card getCard() {
    return card;
  }


  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCard(Card card) {
    this.card = card;
  }


  public PaymentMethodDataRequest cardRedirect(CardRedirectData cardRedirect) {
    
    this.cardRedirect = cardRedirect;
    return this;
  }

   /**
   * Get cardRedirect
   * @return cardRedirect
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CardRedirectData getCardRedirect() {
    return cardRedirect;
  }


  @JsonProperty(JSON_PROPERTY_CARD_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardRedirect(CardRedirectData cardRedirect) {
    this.cardRedirect = cardRedirect;
  }


  public PaymentMethodDataRequest wallet(WalletData wallet) {
    
    this.wallet = wallet;
    return this;
  }

   /**
   * Get wallet
   * @return wallet
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WalletData getWallet() {
    return wallet;
  }


  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWallet(WalletData wallet) {
    this.wallet = wallet;
  }


  public PaymentMethodDataRequest payLater(PayLaterData payLater) {
    
    this.payLater = payLater;
    return this;
  }

   /**
   * Get payLater
   * @return payLater
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAY_LATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PayLaterData getPayLater() {
    return payLater;
  }


  @JsonProperty(JSON_PROPERTY_PAY_LATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayLater(PayLaterData payLater) {
    this.payLater = payLater;
  }


  public PaymentMethodDataRequest bankRedirect(BankRedirectData bankRedirect) {
    
    this.bankRedirect = bankRedirect;
    return this;
  }

   /**
   * Get bankRedirect
   * @return bankRedirect
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectData getBankRedirect() {
    return bankRedirect;
  }


  @JsonProperty(JSON_PROPERTY_BANK_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankRedirect(BankRedirectData bankRedirect) {
    this.bankRedirect = bankRedirect;
  }


  public PaymentMethodDataRequest bankDebit(BankDebitData bankDebit) {
    
    this.bankDebit = bankDebit;
    return this;
  }

   /**
   * Get bankDebit
   * @return bankDebit
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankDebitData getBankDebit() {
    return bankDebit;
  }


  @JsonProperty(JSON_PROPERTY_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankDebit(BankDebitData bankDebit) {
    this.bankDebit = bankDebit;
  }


  public PaymentMethodDataRequest bankTransfer(BankTransferData bankTransfer) {
    
    this.bankTransfer = bankTransfer;
    return this;
  }

   /**
   * Get bankTransfer
   * @return bankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferData getBankTransfer() {
    return bankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankTransfer(BankTransferData bankTransfer) {
    this.bankTransfer = bankTransfer;
  }


  public PaymentMethodDataRequest realTimePayment(RealTimePaymentData realTimePayment) {
    
    this.realTimePayment = realTimePayment;
    return this;
  }

   /**
   * Get realTimePayment
   * @return realTimePayment
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REAL_TIME_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RealTimePaymentData getRealTimePayment() {
    return realTimePayment;
  }


  @JsonProperty(JSON_PROPERTY_REAL_TIME_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRealTimePayment(RealTimePaymentData realTimePayment) {
    this.realTimePayment = realTimePayment;
  }


  public PaymentMethodDataRequest crypto(CryptoData crypto) {
    
    this.crypto = crypto;
    return this;
  }

   /**
   * Get crypto
   * @return crypto
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CryptoData getCrypto() {
    return crypto;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCrypto(CryptoData crypto) {
    this.crypto = crypto;
  }


  public PaymentMethodDataRequest upi(UpiData upi) {
    
    this.upi = upi;
    return this;
  }

   /**
   * Get upi
   * @return upi
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UpiData getUpi() {
    return upi;
  }


  @JsonProperty(JSON_PROPERTY_UPI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpi(UpiData upi) {
    this.upi = upi;
  }


  public PaymentMethodDataRequest voucher(VoucherData voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VOUCHER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VoucherData getVoucher() {
    return voucher;
  }


  @JsonProperty(JSON_PROPERTY_VOUCHER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVoucher(VoucherData voucher) {
    this.voucher = voucher;
  }


  public PaymentMethodDataRequest giftCard(GiftCardData giftCard) {
    
    this.giftCard = giftCard;
    return this;
  }

   /**
   * Get giftCard
   * @return giftCard
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GIFT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GiftCardData getGiftCard() {
    return giftCard;
  }


  @JsonProperty(JSON_PROPERTY_GIFT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGiftCard(GiftCardData giftCard) {
    this.giftCard = giftCard;
  }


  public PaymentMethodDataRequest cardToken(CardToken cardToken) {
    
    this.cardToken = cardToken;
    return this;
  }

   /**
   * Get cardToken
   * @return cardToken
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CardToken getCardToken() {
    return cardToken;
  }


  @JsonProperty(JSON_PROPERTY_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardToken(CardToken cardToken) {
    this.cardToken = cardToken;
  }


  public PaymentMethodDataRequest openBanking(OpenBankingData openBanking) {
    
    this.openBanking = openBanking;
    return this;
  }

   /**
   * Get openBanking
   * @return openBanking
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPEN_BANKING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OpenBankingData getOpenBanking() {
    return openBanking;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_BANKING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpenBanking(OpenBankingData openBanking) {
    this.openBanking = openBanking;
  }


  public PaymentMethodDataRequest mobilePayment(MobilePaymentData mobilePayment) {
    
    this.mobilePayment = mobilePayment;
    return this;
  }

   /**
   * Get mobilePayment
   * @return mobilePayment
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MobilePaymentData getMobilePayment() {
    return mobilePayment;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMobilePayment(MobilePaymentData mobilePayment) {
    this.mobilePayment = mobilePayment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodDataRequest paymentMethodDataRequest = (PaymentMethodDataRequest) o;
    return equalsNullable(this.billing, paymentMethodDataRequest.billing) &&
        Objects.equals(this.card, paymentMethodDataRequest.card) &&
        Objects.equals(this.cardRedirect, paymentMethodDataRequest.cardRedirect) &&
        Objects.equals(this.wallet, paymentMethodDataRequest.wallet) &&
        Objects.equals(this.payLater, paymentMethodDataRequest.payLater) &&
        Objects.equals(this.bankRedirect, paymentMethodDataRequest.bankRedirect) &&
        Objects.equals(this.bankDebit, paymentMethodDataRequest.bankDebit) &&
        Objects.equals(this.bankTransfer, paymentMethodDataRequest.bankTransfer) &&
        Objects.equals(this.realTimePayment, paymentMethodDataRequest.realTimePayment) &&
        Objects.equals(this.crypto, paymentMethodDataRequest.crypto) &&
        Objects.equals(this.upi, paymentMethodDataRequest.upi) &&
        Objects.equals(this.voucher, paymentMethodDataRequest.voucher) &&
        Objects.equals(this.giftCard, paymentMethodDataRequest.giftCard) &&
        Objects.equals(this.cardToken, paymentMethodDataRequest.cardToken) &&
        Objects.equals(this.openBanking, paymentMethodDataRequest.openBanking) &&
        Objects.equals(this.mobilePayment, paymentMethodDataRequest.mobilePayment);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(billing), card, cardRedirect, wallet, payLater, bankRedirect, bankDebit, bankTransfer, realTimePayment, crypto, upi, voucher, giftCard, cardToken, openBanking, mobilePayment);
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
    sb.append("class PaymentMethodDataRequest {\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    cardRedirect: ").append(toIndentedString(cardRedirect)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    payLater: ").append(toIndentedString(payLater)).append("\n");
    sb.append("    bankRedirect: ").append(toIndentedString(bankRedirect)).append("\n");
    sb.append("    bankDebit: ").append(toIndentedString(bankDebit)).append("\n");
    sb.append("    bankTransfer: ").append(toIndentedString(bankTransfer)).append("\n");
    sb.append("    realTimePayment: ").append(toIndentedString(realTimePayment)).append("\n");
    sb.append("    crypto: ").append(toIndentedString(crypto)).append("\n");
    sb.append("    upi: ").append(toIndentedString(upi)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    giftCard: ").append(toIndentedString(giftCard)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    openBanking: ").append(toIndentedString(openBanking)).append("\n");
    sb.append("    mobilePayment: ").append(toIndentedString(mobilePayment)).append("\n");
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

    // add `billing` to the URL query string
    if (getBilling() != null) {
      joiner.add(getBilling().toUrlQueryString(prefix + "billing" + suffix));
    }

    // add `card` to the URL query string
    if (getCard() != null) {
      joiner.add(getCard().toUrlQueryString(prefix + "card" + suffix));
    }

    // add `card_redirect` to the URL query string
    if (getCardRedirect() != null) {
      joiner.add(getCardRedirect().toUrlQueryString(prefix + "card_redirect" + suffix));
    }

    // add `wallet` to the URL query string
    if (getWallet() != null) {
      joiner.add(getWallet().toUrlQueryString(prefix + "wallet" + suffix));
    }

    // add `pay_later` to the URL query string
    if (getPayLater() != null) {
      joiner.add(getPayLater().toUrlQueryString(prefix + "pay_later" + suffix));
    }

    // add `bank_redirect` to the URL query string
    if (getBankRedirect() != null) {
      joiner.add(getBankRedirect().toUrlQueryString(prefix + "bank_redirect" + suffix));
    }

    // add `bank_debit` to the URL query string
    if (getBankDebit() != null) {
      joiner.add(getBankDebit().toUrlQueryString(prefix + "bank_debit" + suffix));
    }

    // add `bank_transfer` to the URL query string
    if (getBankTransfer() != null) {
      joiner.add(getBankTransfer().toUrlQueryString(prefix + "bank_transfer" + suffix));
    }

    // add `real_time_payment` to the URL query string
    if (getRealTimePayment() != null) {
      joiner.add(getRealTimePayment().toUrlQueryString(prefix + "real_time_payment" + suffix));
    }

    // add `crypto` to the URL query string
    if (getCrypto() != null) {
      joiner.add(getCrypto().toUrlQueryString(prefix + "crypto" + suffix));
    }

    // add `upi` to the URL query string
    if (getUpi() != null) {
      joiner.add(getUpi().toUrlQueryString(prefix + "upi" + suffix));
    }

    // add `voucher` to the URL query string
    if (getVoucher() != null) {
      joiner.add(getVoucher().toUrlQueryString(prefix + "voucher" + suffix));
    }

    // add `gift_card` to the URL query string
    if (getGiftCard() != null) {
      joiner.add(getGiftCard().toUrlQueryString(prefix + "gift_card" + suffix));
    }

    // add `card_token` to the URL query string
    if (getCardToken() != null) {
      joiner.add(getCardToken().toUrlQueryString(prefix + "card_token" + suffix));
    }

    // add `open_banking` to the URL query string
    if (getOpenBanking() != null) {
      joiner.add(getOpenBanking().toUrlQueryString(prefix + "open_banking" + suffix));
    }

    // add `mobile_payment` to the URL query string
    if (getMobilePayment() != null) {
      joiner.add(getMobilePayment().toUrlQueryString(prefix + "mobile_payment" + suffix));
    }

    return joiner.toString();
  }

}


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
import com.hyperswitch.client.model.BankDebit;
import com.hyperswitch.client.model.BankDebitData;
import com.hyperswitch.client.model.BankRedirect;
import com.hyperswitch.client.model.BankRedirectData;
import com.hyperswitch.client.model.BankTransfer;
import com.hyperswitch.client.model.BankTransferData;
import com.hyperswitch.client.model.Card;
import com.hyperswitch.client.model.Card1;
import com.hyperswitch.client.model.CardRedirect;
import com.hyperswitch.client.model.CardRedirectData;
import com.hyperswitch.client.model.CardToken;
import com.hyperswitch.client.model.CardToken1;
import com.hyperswitch.client.model.Crypto;
import com.hyperswitch.client.model.CryptoData;
import com.hyperswitch.client.model.GiftCard;
import com.hyperswitch.client.model.GiftCardData;
import com.hyperswitch.client.model.MobilePayment;
import com.hyperswitch.client.model.MobilePaymentData;
import com.hyperswitch.client.model.OpenBanking;
import com.hyperswitch.client.model.OpenBankingData;
import com.hyperswitch.client.model.PayLater;
import com.hyperswitch.client.model.PayLaterData;
import com.hyperswitch.client.model.RealTimePayment;
import com.hyperswitch.client.model.RealTimePaymentData;
import com.hyperswitch.client.model.Upi;
import com.hyperswitch.client.model.UpiData;
import com.hyperswitch.client.model.Voucher;
import com.hyperswitch.client.model.VoucherData;
import com.hyperswitch.client.model.Wallet1;
import com.hyperswitch.client.model.WalletData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentMethodData
 */
@JsonPropertyOrder({
  PaymentMethodData.JSON_PROPERTY_CARD,
  PaymentMethodData.JSON_PROPERTY_CARD_REDIRECT,
  PaymentMethodData.JSON_PROPERTY_WALLET,
  PaymentMethodData.JSON_PROPERTY_PAY_LATER,
  PaymentMethodData.JSON_PROPERTY_BANK_REDIRECT,
  PaymentMethodData.JSON_PROPERTY_BANK_DEBIT,
  PaymentMethodData.JSON_PROPERTY_BANK_TRANSFER,
  PaymentMethodData.JSON_PROPERTY_REAL_TIME_PAYMENT,
  PaymentMethodData.JSON_PROPERTY_CRYPTO,
  PaymentMethodData.JSON_PROPERTY_UPI,
  PaymentMethodData.JSON_PROPERTY_VOUCHER,
  PaymentMethodData.JSON_PROPERTY_GIFT_CARD,
  PaymentMethodData.JSON_PROPERTY_CARD_TOKEN,
  PaymentMethodData.JSON_PROPERTY_OPEN_BANKING,
  PaymentMethodData.JSON_PROPERTY_MOBILE_PAYMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PaymentMethodData {
  public static final String JSON_PROPERTY_CARD = "card";
  @javax.annotation.Nonnull
  private Card card;

  public static final String JSON_PROPERTY_CARD_REDIRECT = "card_redirect";
  @javax.annotation.Nonnull
  private CardRedirectData cardRedirect;

  public static final String JSON_PROPERTY_WALLET = "wallet";
  @javax.annotation.Nonnull
  private WalletData wallet;

  public static final String JSON_PROPERTY_PAY_LATER = "pay_later";
  @javax.annotation.Nonnull
  private PayLaterData payLater;

  public static final String JSON_PROPERTY_BANK_REDIRECT = "bank_redirect";
  @javax.annotation.Nonnull
  private BankRedirectData bankRedirect;

  public static final String JSON_PROPERTY_BANK_DEBIT = "bank_debit";
  @javax.annotation.Nonnull
  private BankDebitData bankDebit;

  public static final String JSON_PROPERTY_BANK_TRANSFER = "bank_transfer";
  @javax.annotation.Nonnull
  private BankTransferData bankTransfer;

  public static final String JSON_PROPERTY_REAL_TIME_PAYMENT = "real_time_payment";
  @javax.annotation.Nonnull
  private RealTimePaymentData realTimePayment;

  public static final String JSON_PROPERTY_CRYPTO = "crypto";
  @javax.annotation.Nonnull
  private CryptoData crypto;

  public static final String JSON_PROPERTY_UPI = "upi";
  @javax.annotation.Nonnull
  private UpiData upi;

  public static final String JSON_PROPERTY_VOUCHER = "voucher";
  @javax.annotation.Nonnull
  private VoucherData voucher;

  public static final String JSON_PROPERTY_GIFT_CARD = "gift_card";
  @javax.annotation.Nonnull
  private GiftCardData giftCard;

  public static final String JSON_PROPERTY_CARD_TOKEN = "card_token";
  @javax.annotation.Nonnull
  private CardToken cardToken;

  public static final String JSON_PROPERTY_OPEN_BANKING = "open_banking";
  @javax.annotation.Nonnull
  private OpenBankingData openBanking;

  public static final String JSON_PROPERTY_MOBILE_PAYMENT = "mobile_payment";
  @javax.annotation.Nonnull
  private MobilePaymentData mobilePayment;

  public PaymentMethodData() {
  }

  public PaymentMethodData card(@javax.annotation.Nonnull Card card) {
    
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

  public Card getCard() {
    return card;
  }


  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCard(@javax.annotation.Nonnull Card card) {
    this.card = card;
  }

  public PaymentMethodData cardRedirect(@javax.annotation.Nonnull CardRedirectData cardRedirect) {
    
    this.cardRedirect = cardRedirect;
    return this;
  }

  /**
   * Get cardRedirect
   * @return cardRedirect
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CardRedirectData getCardRedirect() {
    return cardRedirect;
  }


  @JsonProperty(JSON_PROPERTY_CARD_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardRedirect(@javax.annotation.Nonnull CardRedirectData cardRedirect) {
    this.cardRedirect = cardRedirect;
  }

  public PaymentMethodData wallet(@javax.annotation.Nonnull WalletData wallet) {
    
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

  public WalletData getWallet() {
    return wallet;
  }


  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWallet(@javax.annotation.Nonnull WalletData wallet) {
    this.wallet = wallet;
  }

  public PaymentMethodData payLater(@javax.annotation.Nonnull PayLaterData payLater) {
    
    this.payLater = payLater;
    return this;
  }

  /**
   * Get payLater
   * @return payLater
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAY_LATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PayLaterData getPayLater() {
    return payLater;
  }


  @JsonProperty(JSON_PROPERTY_PAY_LATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayLater(@javax.annotation.Nonnull PayLaterData payLater) {
    this.payLater = payLater;
  }

  public PaymentMethodData bankRedirect(@javax.annotation.Nonnull BankRedirectData bankRedirect) {
    
    this.bankRedirect = bankRedirect;
    return this;
  }

  /**
   * Get bankRedirect
   * @return bankRedirect
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankRedirectData getBankRedirect() {
    return bankRedirect;
  }


  @JsonProperty(JSON_PROPERTY_BANK_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankRedirect(@javax.annotation.Nonnull BankRedirectData bankRedirect) {
    this.bankRedirect = bankRedirect;
  }

  public PaymentMethodData bankDebit(@javax.annotation.Nonnull BankDebitData bankDebit) {
    
    this.bankDebit = bankDebit;
    return this;
  }

  /**
   * Get bankDebit
   * @return bankDebit
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankDebitData getBankDebit() {
    return bankDebit;
  }


  @JsonProperty(JSON_PROPERTY_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankDebit(@javax.annotation.Nonnull BankDebitData bankDebit) {
    this.bankDebit = bankDebit;
  }

  public PaymentMethodData bankTransfer(@javax.annotation.Nonnull BankTransferData bankTransfer) {
    
    this.bankTransfer = bankTransfer;
    return this;
  }

  /**
   * Get bankTransfer
   * @return bankTransfer
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferData getBankTransfer() {
    return bankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankTransfer(@javax.annotation.Nonnull BankTransferData bankTransfer) {
    this.bankTransfer = bankTransfer;
  }

  public PaymentMethodData realTimePayment(@javax.annotation.Nonnull RealTimePaymentData realTimePayment) {
    
    this.realTimePayment = realTimePayment;
    return this;
  }

  /**
   * Get realTimePayment
   * @return realTimePayment
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REAL_TIME_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RealTimePaymentData getRealTimePayment() {
    return realTimePayment;
  }


  @JsonProperty(JSON_PROPERTY_REAL_TIME_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRealTimePayment(@javax.annotation.Nonnull RealTimePaymentData realTimePayment) {
    this.realTimePayment = realTimePayment;
  }

  public PaymentMethodData crypto(@javax.annotation.Nonnull CryptoData crypto) {
    
    this.crypto = crypto;
    return this;
  }

  /**
   * Get crypto
   * @return crypto
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CryptoData getCrypto() {
    return crypto;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCrypto(@javax.annotation.Nonnull CryptoData crypto) {
    this.crypto = crypto;
  }

  public PaymentMethodData upi(@javax.annotation.Nonnull UpiData upi) {
    
    this.upi = upi;
    return this;
  }

  /**
   * Get upi
   * @return upi
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UpiData getUpi() {
    return upi;
  }


  @JsonProperty(JSON_PROPERTY_UPI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpi(@javax.annotation.Nonnull UpiData upi) {
    this.upi = upi;
  }

  public PaymentMethodData voucher(@javax.annotation.Nonnull VoucherData voucher) {
    
    this.voucher = voucher;
    return this;
  }

  /**
   * Get voucher
   * @return voucher
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VOUCHER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VoucherData getVoucher() {
    return voucher;
  }


  @JsonProperty(JSON_PROPERTY_VOUCHER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVoucher(@javax.annotation.Nonnull VoucherData voucher) {
    this.voucher = voucher;
  }

  public PaymentMethodData giftCard(@javax.annotation.Nonnull GiftCardData giftCard) {
    
    this.giftCard = giftCard;
    return this;
  }

  /**
   * Get giftCard
   * @return giftCard
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GIFT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GiftCardData getGiftCard() {
    return giftCard;
  }


  @JsonProperty(JSON_PROPERTY_GIFT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGiftCard(@javax.annotation.Nonnull GiftCardData giftCard) {
    this.giftCard = giftCard;
  }

  public PaymentMethodData cardToken(@javax.annotation.Nonnull CardToken cardToken) {
    
    this.cardToken = cardToken;
    return this;
  }

  /**
   * Get cardToken
   * @return cardToken
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CardToken getCardToken() {
    return cardToken;
  }


  @JsonProperty(JSON_PROPERTY_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardToken(@javax.annotation.Nonnull CardToken cardToken) {
    this.cardToken = cardToken;
  }

  public PaymentMethodData openBanking(@javax.annotation.Nonnull OpenBankingData openBanking) {
    
    this.openBanking = openBanking;
    return this;
  }

  /**
   * Get openBanking
   * @return openBanking
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPEN_BANKING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OpenBankingData getOpenBanking() {
    return openBanking;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_BANKING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpenBanking(@javax.annotation.Nonnull OpenBankingData openBanking) {
    this.openBanking = openBanking;
  }

  public PaymentMethodData mobilePayment(@javax.annotation.Nonnull MobilePaymentData mobilePayment) {
    
    this.mobilePayment = mobilePayment;
    return this;
  }

  /**
   * Get mobilePayment
   * @return mobilePayment
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MobilePaymentData getMobilePayment() {
    return mobilePayment;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMobilePayment(@javax.annotation.Nonnull MobilePaymentData mobilePayment) {
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
    PaymentMethodData paymentMethodData = (PaymentMethodData) o;
    return Objects.equals(this.card, paymentMethodData.card) &&
        Objects.equals(this.cardRedirect, paymentMethodData.cardRedirect) &&
        Objects.equals(this.wallet, paymentMethodData.wallet) &&
        Objects.equals(this.payLater, paymentMethodData.payLater) &&
        Objects.equals(this.bankRedirect, paymentMethodData.bankRedirect) &&
        Objects.equals(this.bankDebit, paymentMethodData.bankDebit) &&
        Objects.equals(this.bankTransfer, paymentMethodData.bankTransfer) &&
        Objects.equals(this.realTimePayment, paymentMethodData.realTimePayment) &&
        Objects.equals(this.crypto, paymentMethodData.crypto) &&
        Objects.equals(this.upi, paymentMethodData.upi) &&
        Objects.equals(this.voucher, paymentMethodData.voucher) &&
        Objects.equals(this.giftCard, paymentMethodData.giftCard) &&
        Objects.equals(this.cardToken, paymentMethodData.cardToken) &&
        Objects.equals(this.openBanking, paymentMethodData.openBanking) &&
        Objects.equals(this.mobilePayment, paymentMethodData.mobilePayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, cardRedirect, wallet, payLater, bankRedirect, bankDebit, bankTransfer, realTimePayment, crypto, upi, voucher, giftCard, cardToken, openBanking, mobilePayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodData {\n");
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


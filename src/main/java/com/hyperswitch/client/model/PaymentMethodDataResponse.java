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
import com.hyperswitch.client.model.BankDebitResponse;
import com.hyperswitch.client.model.BankRedirectResponse;
import com.hyperswitch.client.model.BankTransferResponse;
import com.hyperswitch.client.model.CardRedirectResponse;
import com.hyperswitch.client.model.CardResponse;
import com.hyperswitch.client.model.CardTokenResponse;
import com.hyperswitch.client.model.CryptoResponse;
import com.hyperswitch.client.model.GiftCardResponse;
import com.hyperswitch.client.model.MobilePaymentResponse;
import com.hyperswitch.client.model.OpenBankingResponse;
import com.hyperswitch.client.model.PaylaterResponse;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf1;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf10;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf11;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf12;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf13;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf14;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf15;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf16;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf2;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf3;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf4;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf5;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf6;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf7;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf8;
import com.hyperswitch.client.model.PaymentMethodDataResponseOneOf9;
import com.hyperswitch.client.model.RealTimePaymentDataResponse;
import com.hyperswitch.client.model.UpiResponse;
import com.hyperswitch.client.model.VoucherResponse;
import com.hyperswitch.client.model.WalletResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentMethodDataResponse
 */
@JsonPropertyOrder({
  PaymentMethodDataResponse.JSON_PROPERTY_CARD,
  PaymentMethodDataResponse.JSON_PROPERTY_BANK_TRANSFER,
  PaymentMethodDataResponse.JSON_PROPERTY_WALLET,
  PaymentMethodDataResponse.JSON_PROPERTY_PAY_LATER,
  PaymentMethodDataResponse.JSON_PROPERTY_BANK_REDIRECT,
  PaymentMethodDataResponse.JSON_PROPERTY_CRYPTO,
  PaymentMethodDataResponse.JSON_PROPERTY_BANK_DEBIT,
  PaymentMethodDataResponse.JSON_PROPERTY_MANDATE_PAYMENT,
  PaymentMethodDataResponse.JSON_PROPERTY_REWARD,
  PaymentMethodDataResponse.JSON_PROPERTY_REAL_TIME_PAYMENT,
  PaymentMethodDataResponse.JSON_PROPERTY_UPI,
  PaymentMethodDataResponse.JSON_PROPERTY_VOUCHER,
  PaymentMethodDataResponse.JSON_PROPERTY_GIFT_CARD,
  PaymentMethodDataResponse.JSON_PROPERTY_CARD_REDIRECT,
  PaymentMethodDataResponse.JSON_PROPERTY_CARD_TOKEN,
  PaymentMethodDataResponse.JSON_PROPERTY_OPEN_BANKING,
  PaymentMethodDataResponse.JSON_PROPERTY_MOBILE_PAYMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentMethodDataResponse {
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

  public static final String JSON_PROPERTY_MOBILE_PAYMENT = "mobile_payment";
  private MobilePaymentResponse mobilePayment;

  public PaymentMethodDataResponse() {
  }

  public PaymentMethodDataResponse card(CardResponse card) {
    
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

  public CardResponse getCard() {
    return card;
  }


  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCard(CardResponse card) {
    this.card = card;
  }


  public PaymentMethodDataResponse bankTransfer(BankTransferResponse bankTransfer) {
    
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

  public BankTransferResponse getBankTransfer() {
    return bankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankTransfer(BankTransferResponse bankTransfer) {
    this.bankTransfer = bankTransfer;
  }


  public PaymentMethodDataResponse wallet(WalletResponse wallet) {
    
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

  public WalletResponse getWallet() {
    return wallet;
  }


  @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWallet(WalletResponse wallet) {
    this.wallet = wallet;
  }


  public PaymentMethodDataResponse payLater(PaylaterResponse payLater) {
    
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

  public PaylaterResponse getPayLater() {
    return payLater;
  }


  @JsonProperty(JSON_PROPERTY_PAY_LATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayLater(PaylaterResponse payLater) {
    this.payLater = payLater;
  }


  public PaymentMethodDataResponse bankRedirect(BankRedirectResponse bankRedirect) {
    
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

  public BankRedirectResponse getBankRedirect() {
    return bankRedirect;
  }


  @JsonProperty(JSON_PROPERTY_BANK_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankRedirect(BankRedirectResponse bankRedirect) {
    this.bankRedirect = bankRedirect;
  }


  public PaymentMethodDataResponse crypto(CryptoResponse crypto) {
    
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

  public CryptoResponse getCrypto() {
    return crypto;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCrypto(CryptoResponse crypto) {
    this.crypto = crypto;
  }


  public PaymentMethodDataResponse bankDebit(BankDebitResponse bankDebit) {
    
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

  public BankDebitResponse getBankDebit() {
    return bankDebit;
  }


  @JsonProperty(JSON_PROPERTY_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankDebit(BankDebitResponse bankDebit) {
    this.bankDebit = bankDebit;
  }


  public PaymentMethodDataResponse mandatePayment(Object mandatePayment) {
    
    this.mandatePayment = mandatePayment;
    return this;
  }

   /**
   * Get mandatePayment
   * @return mandatePayment
  **/
  @javax.annotation.Nonnull
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


  public PaymentMethodDataResponse reward(Object reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @javax.annotation.Nonnull
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


  public PaymentMethodDataResponse realTimePayment(RealTimePaymentDataResponse realTimePayment) {
    
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

  public RealTimePaymentDataResponse getRealTimePayment() {
    return realTimePayment;
  }


  @JsonProperty(JSON_PROPERTY_REAL_TIME_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRealTimePayment(RealTimePaymentDataResponse realTimePayment) {
    this.realTimePayment = realTimePayment;
  }


  public PaymentMethodDataResponse upi(UpiResponse upi) {
    
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

  public UpiResponse getUpi() {
    return upi;
  }


  @JsonProperty(JSON_PROPERTY_UPI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpi(UpiResponse upi) {
    this.upi = upi;
  }


  public PaymentMethodDataResponse voucher(VoucherResponse voucher) {
    
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

  public VoucherResponse getVoucher() {
    return voucher;
  }


  @JsonProperty(JSON_PROPERTY_VOUCHER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVoucher(VoucherResponse voucher) {
    this.voucher = voucher;
  }


  public PaymentMethodDataResponse giftCard(GiftCardResponse giftCard) {
    
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

  public GiftCardResponse getGiftCard() {
    return giftCard;
  }


  @JsonProperty(JSON_PROPERTY_GIFT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGiftCard(GiftCardResponse giftCard) {
    this.giftCard = giftCard;
  }


  public PaymentMethodDataResponse cardRedirect(CardRedirectResponse cardRedirect) {
    
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

  public CardRedirectResponse getCardRedirect() {
    return cardRedirect;
  }


  @JsonProperty(JSON_PROPERTY_CARD_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardRedirect(CardRedirectResponse cardRedirect) {
    this.cardRedirect = cardRedirect;
  }


  public PaymentMethodDataResponse cardToken(CardTokenResponse cardToken) {
    
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

  public CardTokenResponse getCardToken() {
    return cardToken;
  }


  @JsonProperty(JSON_PROPERTY_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardToken(CardTokenResponse cardToken) {
    this.cardToken = cardToken;
  }


  public PaymentMethodDataResponse openBanking(OpenBankingResponse openBanking) {
    
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

  public OpenBankingResponse getOpenBanking() {
    return openBanking;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_BANKING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpenBanking(OpenBankingResponse openBanking) {
    this.openBanking = openBanking;
  }


  public PaymentMethodDataResponse mobilePayment(MobilePaymentResponse mobilePayment) {
    
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

  public MobilePaymentResponse getMobilePayment() {
    return mobilePayment;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMobilePayment(MobilePaymentResponse mobilePayment) {
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
    PaymentMethodDataResponse paymentMethodDataResponse = (PaymentMethodDataResponse) o;
    return Objects.equals(this.card, paymentMethodDataResponse.card) &&
        Objects.equals(this.bankTransfer, paymentMethodDataResponse.bankTransfer) &&
        Objects.equals(this.wallet, paymentMethodDataResponse.wallet) &&
        Objects.equals(this.payLater, paymentMethodDataResponse.payLater) &&
        Objects.equals(this.bankRedirect, paymentMethodDataResponse.bankRedirect) &&
        Objects.equals(this.crypto, paymentMethodDataResponse.crypto) &&
        Objects.equals(this.bankDebit, paymentMethodDataResponse.bankDebit) &&
        Objects.equals(this.mandatePayment, paymentMethodDataResponse.mandatePayment) &&
        Objects.equals(this.reward, paymentMethodDataResponse.reward) &&
        Objects.equals(this.realTimePayment, paymentMethodDataResponse.realTimePayment) &&
        Objects.equals(this.upi, paymentMethodDataResponse.upi) &&
        Objects.equals(this.voucher, paymentMethodDataResponse.voucher) &&
        Objects.equals(this.giftCard, paymentMethodDataResponse.giftCard) &&
        Objects.equals(this.cardRedirect, paymentMethodDataResponse.cardRedirect) &&
        Objects.equals(this.cardToken, paymentMethodDataResponse.cardToken) &&
        Objects.equals(this.openBanking, paymentMethodDataResponse.openBanking) &&
        Objects.equals(this.mobilePayment, paymentMethodDataResponse.mobilePayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, bankTransfer, wallet, payLater, bankRedirect, crypto, bankDebit, mandatePayment, reward, realTimePayment, upi, voucher, giftCard, cardRedirect, cardToken, openBanking, mobilePayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodDataResponse {\n");
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

    // add `bank_transfer` to the URL query string
    if (getBankTransfer() != null) {
      joiner.add(getBankTransfer().toUrlQueryString(prefix + "bank_transfer" + suffix));
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

    // add `crypto` to the URL query string
    if (getCrypto() != null) {
      joiner.add(getCrypto().toUrlQueryString(prefix + "crypto" + suffix));
    }

    // add `bank_debit` to the URL query string
    if (getBankDebit() != null) {
      joiner.add(getBankDebit().toUrlQueryString(prefix + "bank_debit" + suffix));
    }

    // add `mandate_payment` to the URL query string
    if (getMandatePayment() != null) {
      try {
        joiner.add(String.format("%smandate_payment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMandatePayment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reward` to the URL query string
    if (getReward() != null) {
      try {
        joiner.add(String.format("%sreward%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReward()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `real_time_payment` to the URL query string
    if (getRealTimePayment() != null) {
      joiner.add(getRealTimePayment().toUrlQueryString(prefix + "real_time_payment" + suffix));
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

    // add `card_redirect` to the URL query string
    if (getCardRedirect() != null) {
      joiner.add(getCardRedirect().toUrlQueryString(prefix + "card_redirect" + suffix));
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


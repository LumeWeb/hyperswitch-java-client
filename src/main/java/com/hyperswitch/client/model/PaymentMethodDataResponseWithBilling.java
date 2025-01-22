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
import com.hyperswitch.client.model.RealTimePaymentDataResponse;
import com.hyperswitch.client.model.UpiResponse;
import com.hyperswitch.client.model.VoucherResponse;
import com.hyperswitch.client.model.WalletResponse;
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
* PaymentMethodDataResponseWithBilling
*/
    @JsonPropertyOrder({
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
        PaymentMethodDataResponseWithBilling.JSON_PROPERTY_OPEN_BANKING,
        PaymentMethodDataResponseWithBilling.JSON_PROPERTY_MOBILE_PAYMENT,
        PaymentMethodDataResponseWithBilling.JSON_PROPERTY_BILLING
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PaymentMethodDataResponseWithBilling {
        public static final String JSON_PROPERTY_CARD = "card";
    @javax.annotation.Nonnull
            private CardResponse card;

        public static final String JSON_PROPERTY_BANK_TRANSFER = "bank_transfer";
    @javax.annotation.Nonnull
            private BankTransferResponse bankTransfer;

        public static final String JSON_PROPERTY_WALLET = "wallet";
    @javax.annotation.Nonnull
            private WalletResponse wallet;

        public static final String JSON_PROPERTY_PAY_LATER = "pay_later";
    @javax.annotation.Nonnull
            private PaylaterResponse payLater;

        public static final String JSON_PROPERTY_BANK_REDIRECT = "bank_redirect";
    @javax.annotation.Nonnull
            private BankRedirectResponse bankRedirect;

        public static final String JSON_PROPERTY_CRYPTO = "crypto";
    @javax.annotation.Nonnull
            private CryptoResponse crypto;

        public static final String JSON_PROPERTY_BANK_DEBIT = "bank_debit";
    @javax.annotation.Nonnull
            private BankDebitResponse bankDebit;

        public static final String JSON_PROPERTY_MANDATE_PAYMENT = "mandate_payment";
    @javax.annotation.Nonnull
            private Object mandatePayment;

        public static final String JSON_PROPERTY_REWARD = "reward";
    @javax.annotation.Nonnull
            private Object reward;

        public static final String JSON_PROPERTY_REAL_TIME_PAYMENT = "real_time_payment";
    @javax.annotation.Nonnull
            private RealTimePaymentDataResponse realTimePayment;

        public static final String JSON_PROPERTY_UPI = "upi";
    @javax.annotation.Nonnull
            private UpiResponse upi;

        public static final String JSON_PROPERTY_VOUCHER = "voucher";
    @javax.annotation.Nonnull
            private VoucherResponse voucher;

        public static final String JSON_PROPERTY_GIFT_CARD = "gift_card";
    @javax.annotation.Nonnull
            private GiftCardResponse giftCard;

        public static final String JSON_PROPERTY_CARD_REDIRECT = "card_redirect";
    @javax.annotation.Nonnull
            private CardRedirectResponse cardRedirect;

        public static final String JSON_PROPERTY_CARD_TOKEN = "card_token";
    @javax.annotation.Nonnull
            private CardTokenResponse cardToken;

        public static final String JSON_PROPERTY_OPEN_BANKING = "open_banking";
    @javax.annotation.Nonnull
            private OpenBankingResponse openBanking;

        public static final String JSON_PROPERTY_MOBILE_PAYMENT = "mobile_payment";
    @javax.annotation.Nonnull
            private MobilePaymentResponse mobilePayment;

        public static final String JSON_PROPERTY_BILLING = "billing";
    @javax.annotation.Nullable
            private JsonNullable<Address> billing = JsonNullable.<Address>undefined();

public PaymentMethodDataResponseWithBilling() {
}

        public PaymentMethodDataResponseWithBilling card(@javax.annotation.Nonnull CardResponse card) {
        
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

    public CardResponse getCard() {
        return card;
    }


          @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCard(@javax.annotation.Nonnull CardResponse card) {
            this.card = card;
        }

        public PaymentMethodDataResponseWithBilling bankTransfer(@javax.annotation.Nonnull BankTransferResponse bankTransfer) {
        
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

    public BankTransferResponse getBankTransfer() {
        return bankTransfer;
    }


          @JsonProperty(JSON_PROPERTY_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankTransfer(@javax.annotation.Nonnull BankTransferResponse bankTransfer) {
            this.bankTransfer = bankTransfer;
        }

        public PaymentMethodDataResponseWithBilling wallet(@javax.annotation.Nonnull WalletResponse wallet) {
        
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

    public WalletResponse getWallet() {
        return wallet;
    }


          @JsonProperty(JSON_PROPERTY_WALLET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWallet(@javax.annotation.Nonnull WalletResponse wallet) {
            this.wallet = wallet;
        }

        public PaymentMethodDataResponseWithBilling payLater(@javax.annotation.Nonnull PaylaterResponse payLater) {
        
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

    public PaylaterResponse getPayLater() {
        return payLater;
    }


          @JsonProperty(JSON_PROPERTY_PAY_LATER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayLater(@javax.annotation.Nonnull PaylaterResponse payLater) {
            this.payLater = payLater;
        }

        public PaymentMethodDataResponseWithBilling bankRedirect(@javax.annotation.Nonnull BankRedirectResponse bankRedirect) {
        
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

    public BankRedirectResponse getBankRedirect() {
        return bankRedirect;
    }


          @JsonProperty(JSON_PROPERTY_BANK_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankRedirect(@javax.annotation.Nonnull BankRedirectResponse bankRedirect) {
            this.bankRedirect = bankRedirect;
        }

        public PaymentMethodDataResponseWithBilling crypto(@javax.annotation.Nonnull CryptoResponse crypto) {
        
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

    public CryptoResponse getCrypto() {
        return crypto;
    }


          @JsonProperty(JSON_PROPERTY_CRYPTO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCrypto(@javax.annotation.Nonnull CryptoResponse crypto) {
            this.crypto = crypto;
        }

        public PaymentMethodDataResponseWithBilling bankDebit(@javax.annotation.Nonnull BankDebitResponse bankDebit) {
        
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

    public BankDebitResponse getBankDebit() {
        return bankDebit;
    }


          @JsonProperty(JSON_PROPERTY_BANK_DEBIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankDebit(@javax.annotation.Nonnull BankDebitResponse bankDebit) {
            this.bankDebit = bankDebit;
        }

        public PaymentMethodDataResponseWithBilling mandatePayment(@javax.annotation.Nonnull Object mandatePayment) {
        
        this.mandatePayment = mandatePayment;
        return this;
        }

    /**
        * Get mandatePayment
    * @return mandatePayment
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_MANDATE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Object getMandatePayment() {
        return mandatePayment;
    }


          @JsonProperty(JSON_PROPERTY_MANDATE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMandatePayment(@javax.annotation.Nonnull Object mandatePayment) {
            this.mandatePayment = mandatePayment;
        }

        public PaymentMethodDataResponseWithBilling reward(@javax.annotation.Nonnull Object reward) {
        
        this.reward = reward;
        return this;
        }

    /**
        * Get reward
    * @return reward
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_REWARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Object getReward() {
        return reward;
    }


          @JsonProperty(JSON_PROPERTY_REWARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReward(@javax.annotation.Nonnull Object reward) {
            this.reward = reward;
        }

        public PaymentMethodDataResponseWithBilling realTimePayment(@javax.annotation.Nonnull RealTimePaymentDataResponse realTimePayment) {
        
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

    public RealTimePaymentDataResponse getRealTimePayment() {
        return realTimePayment;
    }


          @JsonProperty(JSON_PROPERTY_REAL_TIME_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRealTimePayment(@javax.annotation.Nonnull RealTimePaymentDataResponse realTimePayment) {
            this.realTimePayment = realTimePayment;
        }

        public PaymentMethodDataResponseWithBilling upi(@javax.annotation.Nonnull UpiResponse upi) {
        
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

    public UpiResponse getUpi() {
        return upi;
    }


          @JsonProperty(JSON_PROPERTY_UPI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpi(@javax.annotation.Nonnull UpiResponse upi) {
            this.upi = upi;
        }

        public PaymentMethodDataResponseWithBilling voucher(@javax.annotation.Nonnull VoucherResponse voucher) {
        
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

    public VoucherResponse getVoucher() {
        return voucher;
    }


          @JsonProperty(JSON_PROPERTY_VOUCHER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVoucher(@javax.annotation.Nonnull VoucherResponse voucher) {
            this.voucher = voucher;
        }

        public PaymentMethodDataResponseWithBilling giftCard(@javax.annotation.Nonnull GiftCardResponse giftCard) {
        
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

    public GiftCardResponse getGiftCard() {
        return giftCard;
    }


          @JsonProperty(JSON_PROPERTY_GIFT_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGiftCard(@javax.annotation.Nonnull GiftCardResponse giftCard) {
            this.giftCard = giftCard;
        }

        public PaymentMethodDataResponseWithBilling cardRedirect(@javax.annotation.Nonnull CardRedirectResponse cardRedirect) {
        
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

    public CardRedirectResponse getCardRedirect() {
        return cardRedirect;
    }


          @JsonProperty(JSON_PROPERTY_CARD_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardRedirect(@javax.annotation.Nonnull CardRedirectResponse cardRedirect) {
            this.cardRedirect = cardRedirect;
        }

        public PaymentMethodDataResponseWithBilling cardToken(@javax.annotation.Nonnull CardTokenResponse cardToken) {
        
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

    public CardTokenResponse getCardToken() {
        return cardToken;
    }


          @JsonProperty(JSON_PROPERTY_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardToken(@javax.annotation.Nonnull CardTokenResponse cardToken) {
            this.cardToken = cardToken;
        }

        public PaymentMethodDataResponseWithBilling openBanking(@javax.annotation.Nonnull OpenBankingResponse openBanking) {
        
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

    public OpenBankingResponse getOpenBanking() {
        return openBanking;
    }


          @JsonProperty(JSON_PROPERTY_OPEN_BANKING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpenBanking(@javax.annotation.Nonnull OpenBankingResponse openBanking) {
            this.openBanking = openBanking;
        }

        public PaymentMethodDataResponseWithBilling mobilePayment(@javax.annotation.Nonnull MobilePaymentResponse mobilePayment) {
        
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

    public MobilePaymentResponse getMobilePayment() {
        return mobilePayment;
    }


          @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMobilePayment(@javax.annotation.Nonnull MobilePaymentResponse mobilePayment) {
            this.mobilePayment = mobilePayment;
        }

        public PaymentMethodDataResponseWithBilling billing(@javax.annotation.Nullable Address billing) {
        this.billing = JsonNullable.<Address>of(billing);
        
        return this;
        }

    /**
        * Get billing
    * @return billing
    */
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

          public void setBilling(@javax.annotation.Nullable Address billing) {
            this.billing = JsonNullable.<Address>of(billing);
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
        return Objects.equals(this.card, paymentMethodDataResponseWithBilling.card) &&
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
        Objects.equals(this.openBanking, paymentMethodDataResponseWithBilling.openBanking) &&
        Objects.equals(this.mobilePayment, paymentMethodDataResponseWithBilling.mobilePayment) &&
        equalsNullable(this.billing, paymentMethodDataResponseWithBilling.billing);
}

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
        }

    @Override
    public int hashCode() {
        return Objects.hash(card, bankTransfer, wallet, payLater, bankRedirect, crypto, bankDebit, mandatePayment, reward, realTimePayment, upi, voucher, giftCard, cardRedirect, cardToken, openBanking, mobilePayment, hashCodeNullable(billing));
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
        sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
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

            // add `billing` to the URL query string
                            if (getBilling() != null) {
                            joiner.add(getBilling().toUrlQueryString(prefix + "billing" + suffix));
                            }

        return joiner.toString();
        }

    }


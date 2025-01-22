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
import com.hyperswitch.client.model.CardNetwork;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ExtendedCardInfo {
        public static final String JSON_PROPERTY_CARD_NUMBER = "card_number";
    @javax.annotation.Nonnull
            private String cardNumber;

        public static final String JSON_PROPERTY_CARD_EXP_MONTH = "card_exp_month";
    @javax.annotation.Nonnull
            private String cardExpMonth;

        public static final String JSON_PROPERTY_CARD_EXP_YEAR = "card_exp_year";
    @javax.annotation.Nonnull
            private String cardExpYear;

        public static final String JSON_PROPERTY_CARD_HOLDER_NAME = "card_holder_name";
    @javax.annotation.Nonnull
            private String cardHolderName;

        public static final String JSON_PROPERTY_CARD_CVC = "card_cvc";
    @javax.annotation.Nonnull
            private String cardCvc;

        public static final String JSON_PROPERTY_CARD_ISSUER = "card_issuer";
    @javax.annotation.Nullable
            private JsonNullable<String> cardIssuer = JsonNullable.<String>undefined();

        public static final String JSON_PROPERTY_CARD_NETWORK = "card_network";
    @javax.annotation.Nullable
            private JsonNullable<CardNetwork> cardNetwork = JsonNullable.<CardNetwork>undefined();

        public static final String JSON_PROPERTY_CARD_TYPE = "card_type";
    @javax.annotation.Nullable
            private JsonNullable<String> cardType = JsonNullable.<String>undefined();

        public static final String JSON_PROPERTY_CARD_ISSUING_COUNTRY = "card_issuing_country";
    @javax.annotation.Nullable
            private JsonNullable<String> cardIssuingCountry = JsonNullable.<String>undefined();

        public static final String JSON_PROPERTY_BANK_CODE = "bank_code";
    @javax.annotation.Nullable
            private JsonNullable<String> bankCode = JsonNullable.<String>undefined();

public ExtendedCardInfo() {
}

        public ExtendedCardInfo cardNumber(@javax.annotation.Nonnull String cardNumber) {
        
        this.cardNumber = cardNumber;
        return this;
        }

    /**
        * The card number
    * @return cardNumber
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getCardNumber() {
        return cardNumber;
    }


          @JsonProperty(JSON_PROPERTY_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardNumber(@javax.annotation.Nonnull String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public ExtendedCardInfo cardExpMonth(@javax.annotation.Nonnull String cardExpMonth) {
        
        this.cardExpMonth = cardExpMonth;
        return this;
        }

    /**
        * The card&#39;s expiry month
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

        public ExtendedCardInfo cardExpYear(@javax.annotation.Nonnull String cardExpYear) {
        
        this.cardExpYear = cardExpYear;
        return this;
        }

    /**
        * The card&#39;s expiry year
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

        public ExtendedCardInfo cardHolderName(@javax.annotation.Nonnull String cardHolderName) {
        
        this.cardHolderName = cardHolderName;
        return this;
        }

    /**
        * The card holder&#39;s name
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

        public ExtendedCardInfo cardCvc(@javax.annotation.Nonnull String cardCvc) {
        
        this.cardCvc = cardCvc;
        return this;
        }

    /**
        * The CVC number for the card
    * @return cardCvc
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_CARD_CVC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getCardCvc() {
        return cardCvc;
    }


          @JsonProperty(JSON_PROPERTY_CARD_CVC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardCvc(@javax.annotation.Nonnull String cardCvc) {
            this.cardCvc = cardCvc;
        }

        public ExtendedCardInfo cardIssuer(@javax.annotation.Nullable String cardIssuer) {
        this.cardIssuer = JsonNullable.<String>of(cardIssuer);
        
        return this;
        }

    /**
        * The name of the issuer of card
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

        public ExtendedCardInfo cardNetwork(@javax.annotation.Nullable CardNetwork cardNetwork) {
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

        public ExtendedCardInfo cardType(@javax.annotation.Nullable String cardType) {
        this.cardType = JsonNullable.<String>of(cardType);
        
        return this;
        }

    /**
        * Get cardType
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

        public ExtendedCardInfo cardIssuingCountry(@javax.annotation.Nullable String cardIssuingCountry) {
        this.cardIssuingCountry = JsonNullable.<String>of(cardIssuingCountry);
        
        return this;
        }

    /**
        * Get cardIssuingCountry
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

        public ExtendedCardInfo bankCode(@javax.annotation.Nullable String bankCode) {
        this.bankCode = JsonNullable.<String>of(bankCode);
        
        return this;
        }

    /**
        * Get bankCode
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

            // add `card_number` to the URL query string
                        if (getCardNumber() != null) {
                        try {
                        joiner.add(String.format("%scard_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardNumber()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `card_exp_month` to the URL query string
                        if (getCardExpMonth() != null) {
                        try {
                        joiner.add(String.format("%scard_exp_month%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardExpMonth()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `card_exp_year` to the URL query string
                        if (getCardExpYear() != null) {
                        try {
                        joiner.add(String.format("%scard_exp_year%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardExpYear()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `card_holder_name` to the URL query string
                        if (getCardHolderName() != null) {
                        try {
                        joiner.add(String.format("%scard_holder_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardHolderName()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `card_cvc` to the URL query string
                        if (getCardCvc() != null) {
                        try {
                        joiner.add(String.format("%scard_cvc%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardCvc()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `card_issuer` to the URL query string
                        if (getCardIssuer() != null) {
                        try {
                        joiner.add(String.format("%scard_issuer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardIssuer()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `card_network` to the URL query string
                            if (getCardNetwork() != null) {
                            try {
                            joiner.add(String.format("%scard_network%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardNetwork()), "UTF-8").replaceAll("\\+", "%20")));
                            } catch (UnsupportedEncodingException e) {
                            // Should never happen, UTF-8 is always supported
                            throw new RuntimeException(e);
                            }
                            }

            // add `card_type` to the URL query string
                        if (getCardType() != null) {
                        try {
                        joiner.add(String.format("%scard_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardType()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `card_issuing_country` to the URL query string
                        if (getCardIssuingCountry() != null) {
                        try {
                        joiner.add(String.format("%scard_issuing_country%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardIssuingCountry()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `bank_code` to the URL query string
                        if (getBankCode() != null) {
                        try {
                        joiner.add(String.format("%sbank_code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankCode()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

        return joiner.toString();
        }

    }


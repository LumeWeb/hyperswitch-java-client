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
* NetworkTransactionIdAndCardDetails
*/
    @JsonPropertyOrder({
        NetworkTransactionIdAndCardDetails.JSON_PROPERTY_CARD_NUMBER,
        NetworkTransactionIdAndCardDetails.JSON_PROPERTY_CARD_EXP_MONTH,
        NetworkTransactionIdAndCardDetails.JSON_PROPERTY_CARD_EXP_YEAR,
        NetworkTransactionIdAndCardDetails.JSON_PROPERTY_CARD_HOLDER_NAME,
        NetworkTransactionIdAndCardDetails.JSON_PROPERTY_CARD_ISSUER,
        NetworkTransactionIdAndCardDetails.JSON_PROPERTY_CARD_NETWORK,
        NetworkTransactionIdAndCardDetails.JSON_PROPERTY_CARD_TYPE,
        NetworkTransactionIdAndCardDetails.JSON_PROPERTY_CARD_ISSUING_COUNTRY,
        NetworkTransactionIdAndCardDetails.JSON_PROPERTY_BANK_CODE,
        NetworkTransactionIdAndCardDetails.JSON_PROPERTY_NICK_NAME,
        NetworkTransactionIdAndCardDetails.JSON_PROPERTY_NETWORK_TRANSACTION_ID
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class NetworkTransactionIdAndCardDetails {
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

        public static final String JSON_PROPERTY_NICK_NAME = "nick_name";
    @javax.annotation.Nullable
            private JsonNullable<String> nickName = JsonNullable.<String>undefined();

        public static final String JSON_PROPERTY_NETWORK_TRANSACTION_ID = "network_transaction_id";
    @javax.annotation.Nonnull
            private String networkTransactionId;

public NetworkTransactionIdAndCardDetails() {
}

        public NetworkTransactionIdAndCardDetails cardNumber(@javax.annotation.Nonnull String cardNumber) {
        
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

        public NetworkTransactionIdAndCardDetails cardExpMonth(@javax.annotation.Nonnull String cardExpMonth) {
        
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

        public NetworkTransactionIdAndCardDetails cardExpYear(@javax.annotation.Nonnull String cardExpYear) {
        
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

        public NetworkTransactionIdAndCardDetails cardHolderName(@javax.annotation.Nonnull String cardHolderName) {
        
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

        public NetworkTransactionIdAndCardDetails cardIssuer(@javax.annotation.Nullable String cardIssuer) {
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

        public NetworkTransactionIdAndCardDetails cardNetwork(@javax.annotation.Nullable CardNetwork cardNetwork) {
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

        public NetworkTransactionIdAndCardDetails cardType(@javax.annotation.Nullable String cardType) {
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

        public NetworkTransactionIdAndCardDetails cardIssuingCountry(@javax.annotation.Nullable String cardIssuingCountry) {
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

        public NetworkTransactionIdAndCardDetails bankCode(@javax.annotation.Nullable String bankCode) {
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

        public NetworkTransactionIdAndCardDetails nickName(@javax.annotation.Nullable String nickName) {
        this.nickName = JsonNullable.<String>of(nickName);
        
        return this;
        }

    /**
        * The card holder&#39;s nick name
    * @return nickName
    */
    @javax.annotation.Nullable
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

          public void setNickName(@javax.annotation.Nullable String nickName) {
            this.nickName = JsonNullable.<String>of(nickName);
        }

        public NetworkTransactionIdAndCardDetails networkTransactionId(@javax.annotation.Nonnull String networkTransactionId) {
        
        this.networkTransactionId = networkTransactionId;
        return this;
        }

    /**
        * The network transaction ID provided by the card network during a CIT (Customer Initiated Transaction), where &#x60;setup_future_usage&#x60; is set to &#x60;off_session&#x60;.
    * @return networkTransactionId
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_NETWORK_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getNetworkTransactionId() {
        return networkTransactionId;
    }


          @JsonProperty(JSON_PROPERTY_NETWORK_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetworkTransactionId(@javax.annotation.Nonnull String networkTransactionId) {
            this.networkTransactionId = networkTransactionId;
        }

@Override
public boolean equals(Object o) {
    if (this == o) {
    return true;
    }
    if (o == null || getClass() != o.getClass()) {
    return false;
    }
        NetworkTransactionIdAndCardDetails networkTransactionIdAndCardDetails = (NetworkTransactionIdAndCardDetails) o;
        return Objects.equals(this.cardNumber, networkTransactionIdAndCardDetails.cardNumber) &&
        Objects.equals(this.cardExpMonth, networkTransactionIdAndCardDetails.cardExpMonth) &&
        Objects.equals(this.cardExpYear, networkTransactionIdAndCardDetails.cardExpYear) &&
        Objects.equals(this.cardHolderName, networkTransactionIdAndCardDetails.cardHolderName) &&
        equalsNullable(this.cardIssuer, networkTransactionIdAndCardDetails.cardIssuer) &&
        equalsNullable(this.cardNetwork, networkTransactionIdAndCardDetails.cardNetwork) &&
        equalsNullable(this.cardType, networkTransactionIdAndCardDetails.cardType) &&
        equalsNullable(this.cardIssuingCountry, networkTransactionIdAndCardDetails.cardIssuingCountry) &&
        equalsNullable(this.bankCode, networkTransactionIdAndCardDetails.bankCode) &&
        equalsNullable(this.nickName, networkTransactionIdAndCardDetails.nickName) &&
        Objects.equals(this.networkTransactionId, networkTransactionIdAndCardDetails.networkTransactionId);
}

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
        }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cardExpMonth, cardExpYear, cardHolderName, hashCodeNullable(cardIssuer), hashCodeNullable(cardNetwork), hashCodeNullable(cardType), hashCodeNullable(cardIssuingCountry), hashCodeNullable(bankCode), hashCodeNullable(nickName), networkTransactionId);
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
    sb.append("class NetworkTransactionIdAndCardDetails {\n");
        sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
        sb.append("    cardExpMonth: ").append(toIndentedString(cardExpMonth)).append("\n");
        sb.append("    cardExpYear: ").append(toIndentedString(cardExpYear)).append("\n");
        sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
        sb.append("    cardIssuer: ").append(toIndentedString(cardIssuer)).append("\n");
        sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
        sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
        sb.append("    cardIssuingCountry: ").append(toIndentedString(cardIssuingCountry)).append("\n");
        sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    networkTransactionId: ").append(toIndentedString(networkTransactionId)).append("\n");
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

            // add `nick_name` to the URL query string
                        if (getNickName() != null) {
                        try {
                        joiner.add(String.format("%snick_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNickName()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `network_transaction_id` to the URL query string
                        if (getNetworkTransactionId() != null) {
                        try {
                        joiner.add(String.format("%snetwork_transaction_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNetworkTransactionId()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

        return joiner.toString();
        }

    }


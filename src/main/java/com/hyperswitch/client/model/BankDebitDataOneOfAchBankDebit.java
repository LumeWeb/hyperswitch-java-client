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
import com.hyperswitch.client.model.BankDebitBilling;
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
* Payment Method data for Ach bank debit
*/
    @JsonPropertyOrder({
        BankDebitDataOneOfAchBankDebit.JSON_PROPERTY_BILLING_DETAILS,
        BankDebitDataOneOfAchBankDebit.JSON_PROPERTY_ACCOUNT_NUMBER,
        BankDebitDataOneOfAchBankDebit.JSON_PROPERTY_ROUTING_NUMBER,
        BankDebitDataOneOfAchBankDebit.JSON_PROPERTY_CARD_HOLDER_NAME,
        BankDebitDataOneOfAchBankDebit.JSON_PROPERTY_BANK_ACCOUNT_HOLDER_NAME,
        BankDebitDataOneOfAchBankDebit.JSON_PROPERTY_BANK_NAME,
        BankDebitDataOneOfAchBankDebit.JSON_PROPERTY_BANK_TYPE,
        BankDebitDataOneOfAchBankDebit.JSON_PROPERTY_BANK_HOLDER_TYPE
    })
            @JsonTypeName("BankDebitData_oneOf_ach_bank_debit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class BankDebitDataOneOfAchBankDebit {
        public static final String JSON_PROPERTY_BILLING_DETAILS = "billing_details";
    @javax.annotation.Nullable
            private JsonNullable<BankDebitBilling> billingDetails = JsonNullable.<BankDebitBilling>undefined();

        public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "account_number";
    @javax.annotation.Nonnull
            private String accountNumber;

        public static final String JSON_PROPERTY_ROUTING_NUMBER = "routing_number";
    @javax.annotation.Nonnull
            private String routingNumber;

        public static final String JSON_PROPERTY_CARD_HOLDER_NAME = "card_holder_name";
    @javax.annotation.Nonnull
            private String cardHolderName;

        public static final String JSON_PROPERTY_BANK_ACCOUNT_HOLDER_NAME = "bank_account_holder_name";
    @javax.annotation.Nonnull
            private String bankAccountHolderName;

        public static final String JSON_PROPERTY_BANK_NAME = "bank_name";
    @javax.annotation.Nonnull
            private String bankName;

        public static final String JSON_PROPERTY_BANK_TYPE = "bank_type";
    @javax.annotation.Nonnull
            private String bankType;

        public static final String JSON_PROPERTY_BANK_HOLDER_TYPE = "bank_holder_type";
    @javax.annotation.Nonnull
            private String bankHolderType;

public BankDebitDataOneOfAchBankDebit() {
}

        public BankDebitDataOneOfAchBankDebit billingDetails(@javax.annotation.Nullable BankDebitBilling billingDetails) {
        this.billingDetails = JsonNullable.<BankDebitBilling>of(billingDetails);
        
        return this;
        }

    /**
        * Get billingDetails
    * @return billingDetails
    */
    @javax.annotation.Nullable
        @JsonIgnore
    
    public BankDebitBilling getBillingDetails() {
                return billingDetails.orElse(null);
    }

          @JsonProperty(JSON_PROPERTY_BILLING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

        public JsonNullable<BankDebitBilling> getBillingDetails_JsonNullable() {
        return billingDetails;
        }
    
        @JsonProperty(JSON_PROPERTY_BILLING_DETAILS)
        public void setBillingDetails_JsonNullable(JsonNullable<BankDebitBilling> billingDetails) {
        this.billingDetails = billingDetails;
        }

          public void setBillingDetails(@javax.annotation.Nullable BankDebitBilling billingDetails) {
            this.billingDetails = JsonNullable.<BankDebitBilling>of(billingDetails);
        }

        public BankDebitDataOneOfAchBankDebit accountNumber(@javax.annotation.Nonnull String accountNumber) {
        
        this.accountNumber = accountNumber;
        return this;
        }

    /**
        * Account number for ach bank debit payment
    * @return accountNumber
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getAccountNumber() {
        return accountNumber;
    }


          @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountNumber(@javax.annotation.Nonnull String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public BankDebitDataOneOfAchBankDebit routingNumber(@javax.annotation.Nonnull String routingNumber) {
        
        this.routingNumber = routingNumber;
        return this;
        }

    /**
        * Routing number for ach bank debit payment
    * @return routingNumber
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getRoutingNumber() {
        return routingNumber;
    }


          @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoutingNumber(@javax.annotation.Nonnull String routingNumber) {
            this.routingNumber = routingNumber;
        }

        public BankDebitDataOneOfAchBankDebit cardHolderName(@javax.annotation.Nonnull String cardHolderName) {
        
        this.cardHolderName = cardHolderName;
        return this;
        }

    /**
        * Get cardHolderName
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

        public BankDebitDataOneOfAchBankDebit bankAccountHolderName(@javax.annotation.Nonnull String bankAccountHolderName) {
        
        this.bankAccountHolderName = bankAccountHolderName;
        return this;
        }

    /**
        * Get bankAccountHolderName
    * @return bankAccountHolderName
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }


          @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankAccountHolderName(@javax.annotation.Nonnull String bankAccountHolderName) {
            this.bankAccountHolderName = bankAccountHolderName;
        }

        public BankDebitDataOneOfAchBankDebit bankName(@javax.annotation.Nonnull String bankName) {
        
        this.bankName = bankName;
        return this;
        }

    /**
        * Get bankName
    * @return bankName
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getBankName() {
        return bankName;
    }


          @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankName(@javax.annotation.Nonnull String bankName) {
            this.bankName = bankName;
        }

        public BankDebitDataOneOfAchBankDebit bankType(@javax.annotation.Nonnull String bankType) {
        
        this.bankType = bankType;
        return this;
        }

    /**
        * Get bankType
    * @return bankType
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_BANK_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getBankType() {
        return bankType;
    }


          @JsonProperty(JSON_PROPERTY_BANK_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankType(@javax.annotation.Nonnull String bankType) {
            this.bankType = bankType;
        }

        public BankDebitDataOneOfAchBankDebit bankHolderType(@javax.annotation.Nonnull String bankHolderType) {
        
        this.bankHolderType = bankHolderType;
        return this;
        }

    /**
        * Get bankHolderType
    * @return bankHolderType
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_BANK_HOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getBankHolderType() {
        return bankHolderType;
    }


          @JsonProperty(JSON_PROPERTY_BANK_HOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankHolderType(@javax.annotation.Nonnull String bankHolderType) {
            this.bankHolderType = bankHolderType;
        }

@Override
public boolean equals(Object o) {
    if (this == o) {
    return true;
    }
    if (o == null || getClass() != o.getClass()) {
    return false;
    }
        BankDebitDataOneOfAchBankDebit bankDebitDataOneOfAchBankDebit = (BankDebitDataOneOfAchBankDebit) o;
        return equalsNullable(this.billingDetails, bankDebitDataOneOfAchBankDebit.billingDetails) &&
        Objects.equals(this.accountNumber, bankDebitDataOneOfAchBankDebit.accountNumber) &&
        Objects.equals(this.routingNumber, bankDebitDataOneOfAchBankDebit.routingNumber) &&
        Objects.equals(this.cardHolderName, bankDebitDataOneOfAchBankDebit.cardHolderName) &&
        Objects.equals(this.bankAccountHolderName, bankDebitDataOneOfAchBankDebit.bankAccountHolderName) &&
        Objects.equals(this.bankName, bankDebitDataOneOfAchBankDebit.bankName) &&
        Objects.equals(this.bankType, bankDebitDataOneOfAchBankDebit.bankType) &&
        Objects.equals(this.bankHolderType, bankDebitDataOneOfAchBankDebit.bankHolderType);
}

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
        }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(billingDetails), accountNumber, routingNumber, cardHolderName, bankAccountHolderName, bankName, bankType, bankHolderType);
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
    sb.append("class BankDebitDataOneOfAchBankDebit {\n");
        sb.append("    billingDetails: ").append(toIndentedString(billingDetails)).append("\n");
        sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
        sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
        sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
        sb.append("    bankAccountHolderName: ").append(toIndentedString(bankAccountHolderName)).append("\n");
        sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
        sb.append("    bankType: ").append(toIndentedString(bankType)).append("\n");
        sb.append("    bankHolderType: ").append(toIndentedString(bankHolderType)).append("\n");
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

            // add `billing_details` to the URL query string
                            if (getBillingDetails() != null) {
                            joiner.add(getBillingDetails().toUrlQueryString(prefix + "billing_details" + suffix));
                            }

            // add `account_number` to the URL query string
                        if (getAccountNumber() != null) {
                        try {
                        joiner.add(String.format("%saccount_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountNumber()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `routing_number` to the URL query string
                        if (getRoutingNumber() != null) {
                        try {
                        joiner.add(String.format("%srouting_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoutingNumber()), "UTF-8").replaceAll("\\+", "%20")));
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

            // add `bank_account_holder_name` to the URL query string
                        if (getBankAccountHolderName() != null) {
                        try {
                        joiner.add(String.format("%sbank_account_holder_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankAccountHolderName()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `bank_name` to the URL query string
                        if (getBankName() != null) {
                        try {
                        joiner.add(String.format("%sbank_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankName()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `bank_type` to the URL query string
                        if (getBankType() != null) {
                        try {
                        joiner.add(String.format("%sbank_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankType()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `bank_holder_type` to the URL query string
                        if (getBankHolderType() != null) {
                        try {
                        joiner.add(String.format("%sbank_holder_type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankHolderType()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

        return joiner.toString();
        }

    }


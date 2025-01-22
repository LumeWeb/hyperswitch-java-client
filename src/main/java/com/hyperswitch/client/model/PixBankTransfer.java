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
* PixBankTransfer
*/
    @JsonPropertyOrder({
        PixBankTransfer.JSON_PROPERTY_BANK_NAME,
        PixBankTransfer.JSON_PROPERTY_BANK_BRANCH,
        PixBankTransfer.JSON_PROPERTY_BANK_ACCOUNT_NUMBER,
        PixBankTransfer.JSON_PROPERTY_PIX_KEY,
        PixBankTransfer.JSON_PROPERTY_TAX_ID
    })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PixBankTransfer {
        public static final String JSON_PROPERTY_BANK_NAME = "bank_name";
    @javax.annotation.Nullable
            private JsonNullable<String> bankName = JsonNullable.<String>undefined();

        public static final String JSON_PROPERTY_BANK_BRANCH = "bank_branch";
    @javax.annotation.Nullable
            private JsonNullable<String> bankBranch = JsonNullable.<String>undefined();

        public static final String JSON_PROPERTY_BANK_ACCOUNT_NUMBER = "bank_account_number";
    @javax.annotation.Nonnull
            private String bankAccountNumber;

        public static final String JSON_PROPERTY_PIX_KEY = "pix_key";
    @javax.annotation.Nonnull
            private String pixKey;

        public static final String JSON_PROPERTY_TAX_ID = "tax_id";
    @javax.annotation.Nullable
            private JsonNullable<String> taxId = JsonNullable.<String>undefined();

public PixBankTransfer() {
}

        public PixBankTransfer bankName(@javax.annotation.Nullable String bankName) {
        this.bankName = JsonNullable.<String>of(bankName);
        
        return this;
        }

    /**
        * Bank name
    * @return bankName
    */
    @javax.annotation.Nullable
        @JsonIgnore
    
    public String getBankName() {
                return bankName.orElse(null);
    }

          @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

        public JsonNullable<String> getBankName_JsonNullable() {
        return bankName;
        }
    
        @JsonProperty(JSON_PROPERTY_BANK_NAME)
        public void setBankName_JsonNullable(JsonNullable<String> bankName) {
        this.bankName = bankName;
        }

          public void setBankName(@javax.annotation.Nullable String bankName) {
            this.bankName = JsonNullable.<String>of(bankName);
        }

        public PixBankTransfer bankBranch(@javax.annotation.Nullable String bankBranch) {
        this.bankBranch = JsonNullable.<String>of(bankBranch);
        
        return this;
        }

    /**
        * Bank branch
    * @return bankBranch
    */
    @javax.annotation.Nullable
        @JsonIgnore
    
    public String getBankBranch() {
                return bankBranch.orElse(null);
    }

          @JsonProperty(JSON_PROPERTY_BANK_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

        public JsonNullable<String> getBankBranch_JsonNullable() {
        return bankBranch;
        }
    
        @JsonProperty(JSON_PROPERTY_BANK_BRANCH)
        public void setBankBranch_JsonNullable(JsonNullable<String> bankBranch) {
        this.bankBranch = bankBranch;
        }

          public void setBankBranch(@javax.annotation.Nullable String bankBranch) {
            this.bankBranch = JsonNullable.<String>of(bankBranch);
        }

        public PixBankTransfer bankAccountNumber(@javax.annotation.Nonnull String bankAccountNumber) {
        
        this.bankAccountNumber = bankAccountNumber;
        return this;
        }

    /**
        * Bank account number is an unique identifier assigned by a bank to a customer.
    * @return bankAccountNumber
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }


          @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankAccountNumber(@javax.annotation.Nonnull String bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
        }

        public PixBankTransfer pixKey(@javax.annotation.Nonnull String pixKey) {
        
        this.pixKey = pixKey;
        return this;
        }

    /**
        * Unique key for pix customer
    * @return pixKey
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_PIX_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getPixKey() {
        return pixKey;
    }


          @JsonProperty(JSON_PROPERTY_PIX_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPixKey(@javax.annotation.Nonnull String pixKey) {
            this.pixKey = pixKey;
        }

        public PixBankTransfer taxId(@javax.annotation.Nullable String taxId) {
        this.taxId = JsonNullable.<String>of(taxId);
        
        return this;
        }

    /**
        * Individual taxpayer identification number
    * @return taxId
    */
    @javax.annotation.Nullable
        @JsonIgnore
    
    public String getTaxId() {
                return taxId.orElse(null);
    }

          @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

        public JsonNullable<String> getTaxId_JsonNullable() {
        return taxId;
        }
    
        @JsonProperty(JSON_PROPERTY_TAX_ID)
        public void setTaxId_JsonNullable(JsonNullable<String> taxId) {
        this.taxId = taxId;
        }

          public void setTaxId(@javax.annotation.Nullable String taxId) {
            this.taxId = JsonNullable.<String>of(taxId);
        }

@Override
public boolean equals(Object o) {
    if (this == o) {
    return true;
    }
    if (o == null || getClass() != o.getClass()) {
    return false;
    }
        PixBankTransfer pixBankTransfer = (PixBankTransfer) o;
        return equalsNullable(this.bankName, pixBankTransfer.bankName) &&
        equalsNullable(this.bankBranch, pixBankTransfer.bankBranch) &&
        Objects.equals(this.bankAccountNumber, pixBankTransfer.bankAccountNumber) &&
        Objects.equals(this.pixKey, pixBankTransfer.pixKey) &&
        equalsNullable(this.taxId, pixBankTransfer.taxId);
}

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
        }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(bankName), hashCodeNullable(bankBranch), bankAccountNumber, pixKey, hashCodeNullable(taxId));
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
    sb.append("class PixBankTransfer {\n");
        sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
        sb.append("    bankBranch: ").append(toIndentedString(bankBranch)).append("\n");
        sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
        sb.append("    pixKey: ").append(toIndentedString(pixKey)).append("\n");
        sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
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

            // add `bank_name` to the URL query string
                        if (getBankName() != null) {
                        try {
                        joiner.add(String.format("%sbank_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankName()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `bank_branch` to the URL query string
                        if (getBankBranch() != null) {
                        try {
                        joiner.add(String.format("%sbank_branch%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankBranch()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `bank_account_number` to the URL query string
                        if (getBankAccountNumber() != null) {
                        try {
                        joiner.add(String.format("%sbank_account_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankAccountNumber()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `pix_key` to the URL query string
                        if (getPixKey() != null) {
                        try {
                        joiner.add(String.format("%spix_key%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPixKey()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `tax_id` to the URL query string
                        if (getTaxId() != null) {
                        try {
                        joiner.add(String.format("%stax_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxId()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

        return joiner.toString();
        }

    }


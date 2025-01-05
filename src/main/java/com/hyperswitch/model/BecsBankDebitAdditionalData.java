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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BecsBankDebitAdditionalData
 */
@JsonPropertyOrder({
  BecsBankDebitAdditionalData.JSON_PROPERTY_ACCOUNT_NUMBER,
  BecsBankDebitAdditionalData.JSON_PROPERTY_BSB_NUMBER,
  BecsBankDebitAdditionalData.JSON_PROPERTY_BANK_ACCOUNT_HOLDER_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class BecsBankDebitAdditionalData {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "account_number";
  @javax.annotation.Nonnull
  private String accountNumber;

  public static final String JSON_PROPERTY_BSB_NUMBER = "bsb_number";
  @javax.annotation.Nonnull
  private String bsbNumber;

  public static final String JSON_PROPERTY_BANK_ACCOUNT_HOLDER_NAME = "bank_account_holder_name";
  private JsonNullable<String> bankAccountHolderName = JsonNullable.<String>undefined();

  public BecsBankDebitAdditionalData() {
  }

  public BecsBankDebitAdditionalData accountNumber(@javax.annotation.Nonnull String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Partially masked account number for Becs payment method
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


  public BecsBankDebitAdditionalData bsbNumber(@javax.annotation.Nonnull String bsbNumber) {
    
    this.bsbNumber = bsbNumber;
    return this;
  }

  /**
   * Bank-State-Branch (bsb) number
   * @return bsbNumber
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BSB_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBsbNumber() {
    return bsbNumber;
  }


  @JsonProperty(JSON_PROPERTY_BSB_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBsbNumber(@javax.annotation.Nonnull String bsbNumber) {
    this.bsbNumber = bsbNumber;
  }


  public BecsBankDebitAdditionalData bankAccountHolderName(@javax.annotation.Nullable String bankAccountHolderName) {
    this.bankAccountHolderName = JsonNullable.<String>of(bankAccountHolderName);
    
    return this;
  }

  /**
   * Bank account&#39;s owner name
   * @return bankAccountHolderName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBankAccountHolderName() {
        return bankAccountHolderName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBankAccountHolderName_JsonNullable() {
    return bankAccountHolderName;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_HOLDER_NAME)
  public void setBankAccountHolderName_JsonNullable(JsonNullable<String> bankAccountHolderName) {
    this.bankAccountHolderName = bankAccountHolderName;
  }

  public void setBankAccountHolderName(@javax.annotation.Nullable String bankAccountHolderName) {
    this.bankAccountHolderName = JsonNullable.<String>of(bankAccountHolderName);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BecsBankDebitAdditionalData becsBankDebitAdditionalData = (BecsBankDebitAdditionalData) o;
    return Objects.equals(this.accountNumber, becsBankDebitAdditionalData.accountNumber) &&
        Objects.equals(this.bsbNumber, becsBankDebitAdditionalData.bsbNumber) &&
        equalsNullable(this.bankAccountHolderName, becsBankDebitAdditionalData.bankAccountHolderName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bsbNumber, hashCodeNullable(bankAccountHolderName));
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
    sb.append("class BecsBankDebitAdditionalData {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bsbNumber: ").append(toIndentedString(bsbNumber)).append("\n");
    sb.append("    bankAccountHolderName: ").append(toIndentedString(bankAccountHolderName)).append("\n");
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


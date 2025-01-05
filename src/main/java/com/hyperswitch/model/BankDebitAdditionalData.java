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
import com.hyperswitch.model.AchBankDebitAdditionalData;
import com.hyperswitch.model.BacsBankDebitAdditionalData;
import com.hyperswitch.model.BankDebitAdditionalDataOneOf;
import com.hyperswitch.model.BankDebitAdditionalDataOneOf1;
import com.hyperswitch.model.BankDebitAdditionalDataOneOf2;
import com.hyperswitch.model.BankDebitAdditionalDataOneOf3;
import com.hyperswitch.model.BecsBankDebitAdditionalData;
import com.hyperswitch.model.SepaBankDebitAdditionalData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankDebitAdditionalData
 */
@JsonPropertyOrder({
  BankDebitAdditionalData.JSON_PROPERTY_ACH,
  BankDebitAdditionalData.JSON_PROPERTY_BACS,
  BankDebitAdditionalData.JSON_PROPERTY_BECS,
  BankDebitAdditionalData.JSON_PROPERTY_SEPA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class BankDebitAdditionalData {
  public static final String JSON_PROPERTY_ACH = "ach";
  @javax.annotation.Nonnull
  private AchBankDebitAdditionalData ach;

  public static final String JSON_PROPERTY_BACS = "bacs";
  @javax.annotation.Nonnull
  private BacsBankDebitAdditionalData bacs;

  public static final String JSON_PROPERTY_BECS = "becs";
  @javax.annotation.Nonnull
  private BecsBankDebitAdditionalData becs;

  public static final String JSON_PROPERTY_SEPA = "sepa";
  @javax.annotation.Nonnull
  private SepaBankDebitAdditionalData sepa;

  public BankDebitAdditionalData() {
  }

  public BankDebitAdditionalData ach(@javax.annotation.Nonnull AchBankDebitAdditionalData ach) {
    
    this.ach = ach;
    return this;
  }

  /**
   * Get ach
   * @return ach
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AchBankDebitAdditionalData getAch() {
    return ach;
  }


  @JsonProperty(JSON_PROPERTY_ACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAch(@javax.annotation.Nonnull AchBankDebitAdditionalData ach) {
    this.ach = ach;
  }


  public BankDebitAdditionalData bacs(@javax.annotation.Nonnull BacsBankDebitAdditionalData bacs) {
    
    this.bacs = bacs;
    return this;
  }

  /**
   * Get bacs
   * @return bacs
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BACS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BacsBankDebitAdditionalData getBacs() {
    return bacs;
  }


  @JsonProperty(JSON_PROPERTY_BACS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBacs(@javax.annotation.Nonnull BacsBankDebitAdditionalData bacs) {
    this.bacs = bacs;
  }


  public BankDebitAdditionalData becs(@javax.annotation.Nonnull BecsBankDebitAdditionalData becs) {
    
    this.becs = becs;
    return this;
  }

  /**
   * Get becs
   * @return becs
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BECS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BecsBankDebitAdditionalData getBecs() {
    return becs;
  }


  @JsonProperty(JSON_PROPERTY_BECS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBecs(@javax.annotation.Nonnull BecsBankDebitAdditionalData becs) {
    this.becs = becs;
  }


  public BankDebitAdditionalData sepa(@javax.annotation.Nonnull SepaBankDebitAdditionalData sepa) {
    
    this.sepa = sepa;
    return this;
  }

  /**
   * Get sepa
   * @return sepa
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEPA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SepaBankDebitAdditionalData getSepa() {
    return sepa;
  }


  @JsonProperty(JSON_PROPERTY_SEPA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSepa(@javax.annotation.Nonnull SepaBankDebitAdditionalData sepa) {
    this.sepa = sepa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankDebitAdditionalData bankDebitAdditionalData = (BankDebitAdditionalData) o;
    return Objects.equals(this.ach, bankDebitAdditionalData.ach) &&
        Objects.equals(this.bacs, bankDebitAdditionalData.bacs) &&
        Objects.equals(this.becs, bankDebitAdditionalData.becs) &&
        Objects.equals(this.sepa, bankDebitAdditionalData.sepa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ach, bacs, becs, sepa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankDebitAdditionalData {\n");
    sb.append("    ach: ").append(toIndentedString(ach)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
    sb.append("    becs: ").append(toIndentedString(becs)).append("\n");
    sb.append("    sepa: ").append(toIndentedString(sepa)).append("\n");
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


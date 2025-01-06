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
import com.hyperswitch.client.model.AchTransfer;
import com.hyperswitch.client.model.BacsBankTransferInstructions;
import com.hyperswitch.client.model.DokuBankTransferInstructions;
import com.hyperswitch.client.model.MultibancoTransferInstructions;
import com.hyperswitch.client.model.ReceiverDetails;
import com.hyperswitch.client.model.SepaBankTransferInstructions;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankTransferNextStepsData
 */
@JsonPropertyOrder({
  BankTransferNextStepsData.JSON_PROPERTY_DOKU_BANK_TRANSFER_INSTRUCTIONS,
  BankTransferNextStepsData.JSON_PROPERTY_ACH_CREDIT_TRANSFER,
  BankTransferNextStepsData.JSON_PROPERTY_SEPA_BANK_INSTRUCTIONS,
  BankTransferNextStepsData.JSON_PROPERTY_BACS_BANK_INSTRUCTIONS,
  BankTransferNextStepsData.JSON_PROPERTY_MULTIBANCO,
  BankTransferNextStepsData.JSON_PROPERTY_RECEIVER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BankTransferNextStepsData {
  public static final String JSON_PROPERTY_DOKU_BANK_TRANSFER_INSTRUCTIONS = "doku_bank_transfer_instructions";
  private DokuBankTransferInstructions dokuBankTransferInstructions;

  public static final String JSON_PROPERTY_ACH_CREDIT_TRANSFER = "ach_credit_transfer";
  private AchTransfer achCreditTransfer;

  public static final String JSON_PROPERTY_SEPA_BANK_INSTRUCTIONS = "sepa_bank_instructions";
  private SepaBankTransferInstructions sepaBankInstructions;

  public static final String JSON_PROPERTY_BACS_BANK_INSTRUCTIONS = "bacs_bank_instructions";
  private BacsBankTransferInstructions bacsBankInstructions;

  public static final String JSON_PROPERTY_MULTIBANCO = "multibanco";
  private MultibancoTransferInstructions multibanco;

  public static final String JSON_PROPERTY_RECEIVER = "receiver";
  private JsonNullable<ReceiverDetails> receiver = JsonNullable.<ReceiverDetails>undefined();

  public BankTransferNextStepsData() {
  }

  public BankTransferNextStepsData dokuBankTransferInstructions(DokuBankTransferInstructions dokuBankTransferInstructions) {
    
    this.dokuBankTransferInstructions = dokuBankTransferInstructions;
    return this;
  }

   /**
   * Get dokuBankTransferInstructions
   * @return dokuBankTransferInstructions
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOKU_BANK_TRANSFER_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DokuBankTransferInstructions getDokuBankTransferInstructions() {
    return dokuBankTransferInstructions;
  }


  @JsonProperty(JSON_PROPERTY_DOKU_BANK_TRANSFER_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDokuBankTransferInstructions(DokuBankTransferInstructions dokuBankTransferInstructions) {
    this.dokuBankTransferInstructions = dokuBankTransferInstructions;
  }


  public BankTransferNextStepsData achCreditTransfer(AchTransfer achCreditTransfer) {
    
    this.achCreditTransfer = achCreditTransfer;
    return this;
  }

   /**
   * Get achCreditTransfer
   * @return achCreditTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACH_CREDIT_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AchTransfer getAchCreditTransfer() {
    return achCreditTransfer;
  }


  @JsonProperty(JSON_PROPERTY_ACH_CREDIT_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAchCreditTransfer(AchTransfer achCreditTransfer) {
    this.achCreditTransfer = achCreditTransfer;
  }


  public BankTransferNextStepsData sepaBankInstructions(SepaBankTransferInstructions sepaBankInstructions) {
    
    this.sepaBankInstructions = sepaBankInstructions;
    return this;
  }

   /**
   * Get sepaBankInstructions
   * @return sepaBankInstructions
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEPA_BANK_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SepaBankTransferInstructions getSepaBankInstructions() {
    return sepaBankInstructions;
  }


  @JsonProperty(JSON_PROPERTY_SEPA_BANK_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSepaBankInstructions(SepaBankTransferInstructions sepaBankInstructions) {
    this.sepaBankInstructions = sepaBankInstructions;
  }


  public BankTransferNextStepsData bacsBankInstructions(BacsBankTransferInstructions bacsBankInstructions) {
    
    this.bacsBankInstructions = bacsBankInstructions;
    return this;
  }

   /**
   * Get bacsBankInstructions
   * @return bacsBankInstructions
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BACS_BANK_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BacsBankTransferInstructions getBacsBankInstructions() {
    return bacsBankInstructions;
  }


  @JsonProperty(JSON_PROPERTY_BACS_BANK_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBacsBankInstructions(BacsBankTransferInstructions bacsBankInstructions) {
    this.bacsBankInstructions = bacsBankInstructions;
  }


  public BankTransferNextStepsData multibanco(MultibancoTransferInstructions multibanco) {
    
    this.multibanco = multibanco;
    return this;
  }

   /**
   * Get multibanco
   * @return multibanco
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MULTIBANCO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MultibancoTransferInstructions getMultibanco() {
    return multibanco;
  }


  @JsonProperty(JSON_PROPERTY_MULTIBANCO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMultibanco(MultibancoTransferInstructions multibanco) {
    this.multibanco = multibanco;
  }


  public BankTransferNextStepsData receiver(ReceiverDetails receiver) {
    this.receiver = JsonNullable.<ReceiverDetails>of(receiver);
    
    return this;
  }

   /**
   * Get receiver
   * @return receiver
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public ReceiverDetails getReceiver() {
        return receiver.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECEIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ReceiverDetails> getReceiver_JsonNullable() {
    return receiver;
  }
  
  @JsonProperty(JSON_PROPERTY_RECEIVER)
  public void setReceiver_JsonNullable(JsonNullable<ReceiverDetails> receiver) {
    this.receiver = receiver;
  }

  public void setReceiver(ReceiverDetails receiver) {
    this.receiver = JsonNullable.<ReceiverDetails>of(receiver);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferNextStepsData bankTransferNextStepsData = (BankTransferNextStepsData) o;
    return Objects.equals(this.dokuBankTransferInstructions, bankTransferNextStepsData.dokuBankTransferInstructions) &&
        Objects.equals(this.achCreditTransfer, bankTransferNextStepsData.achCreditTransfer) &&
        Objects.equals(this.sepaBankInstructions, bankTransferNextStepsData.sepaBankInstructions) &&
        Objects.equals(this.bacsBankInstructions, bankTransferNextStepsData.bacsBankInstructions) &&
        Objects.equals(this.multibanco, bankTransferNextStepsData.multibanco) &&
        equalsNullable(this.receiver, bankTransferNextStepsData.receiver);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dokuBankTransferInstructions, achCreditTransfer, sepaBankInstructions, bacsBankInstructions, multibanco, hashCodeNullable(receiver));
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
    sb.append("class BankTransferNextStepsData {\n");
    sb.append("    dokuBankTransferInstructions: ").append(toIndentedString(dokuBankTransferInstructions)).append("\n");
    sb.append("    achCreditTransfer: ").append(toIndentedString(achCreditTransfer)).append("\n");
    sb.append("    sepaBankInstructions: ").append(toIndentedString(sepaBankInstructions)).append("\n");
    sb.append("    bacsBankInstructions: ").append(toIndentedString(bacsBankInstructions)).append("\n");
    sb.append("    multibanco: ").append(toIndentedString(multibanco)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
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


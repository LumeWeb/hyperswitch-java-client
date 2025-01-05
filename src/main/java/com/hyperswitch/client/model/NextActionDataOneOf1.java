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
import com.hyperswitch.client.model.BankTransferNextStepsData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Informs the next steps for bank transfer and also contains the charges details (ex: amount received, amount charged etc)
 */
@JsonPropertyOrder({
  NextActionDataOneOf1.JSON_PROPERTY_BANK_TRANSFER_STEPS_AND_CHARGES_DETAILS,
  NextActionDataOneOf1.JSON_PROPERTY_TYPE
})
@JsonTypeName("NextActionData_oneOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NextActionDataOneOf1 {
  public static final String JSON_PROPERTY_BANK_TRANSFER_STEPS_AND_CHARGES_DETAILS = "bank_transfer_steps_and_charges_details";
  private BankTransferNextStepsData bankTransferStepsAndChargesDetails;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    DISPLAY_BANK_TRANSFER_INFORMATION("display_bank_transfer_information");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public NextActionDataOneOf1() {
  }

  public NextActionDataOneOf1 bankTransferStepsAndChargesDetails(BankTransferNextStepsData bankTransferStepsAndChargesDetails) {
    
    this.bankTransferStepsAndChargesDetails = bankTransferStepsAndChargesDetails;
    return this;
  }

   /**
   * Get bankTransferStepsAndChargesDetails
   * @return bankTransferStepsAndChargesDetails
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER_STEPS_AND_CHARGES_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferNextStepsData getBankTransferStepsAndChargesDetails() {
    return bankTransferStepsAndChargesDetails;
  }


  @JsonProperty(JSON_PROPERTY_BANK_TRANSFER_STEPS_AND_CHARGES_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankTransferStepsAndChargesDetails(BankTransferNextStepsData bankTransferStepsAndChargesDetails) {
    this.bankTransferStepsAndChargesDetails = bankTransferStepsAndChargesDetails;
  }


  public NextActionDataOneOf1 type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextActionDataOneOf1 nextActionDataOneOf1 = (NextActionDataOneOf1) o;
    return Objects.equals(this.bankTransferStepsAndChargesDetails, nextActionDataOneOf1.bankTransferStepsAndChargesDetails) &&
        Objects.equals(this.type, nextActionDataOneOf1.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankTransferStepsAndChargesDetails, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextActionDataOneOf1 {\n");
    sb.append("    bankTransferStepsAndChargesDetails: ").append(toIndentedString(bankTransferStepsAndChargesDetails)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


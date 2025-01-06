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
import com.hyperswitch.client.model.BankTransferDataOneOf4PermataBankTransfer;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankTransferDataOneOf9
 */
@JsonPropertyOrder({
  BankTransferDataOneOf9.JSON_PROPERTY_DANAMON_VA_BANK_TRANSFER
})
@JsonTypeName("BankTransferData_oneOf_9")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BankTransferDataOneOf9 {
  public static final String JSON_PROPERTY_DANAMON_VA_BANK_TRANSFER = "danamon_va_bank_transfer";
  private BankTransferDataOneOf4PermataBankTransfer danamonVaBankTransfer;

  public BankTransferDataOneOf9() {
  }

  public BankTransferDataOneOf9 danamonVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer danamonVaBankTransfer) {
    
    this.danamonVaBankTransfer = danamonVaBankTransfer;
    return this;
  }

   /**
   * Get danamonVaBankTransfer
   * @return danamonVaBankTransfer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DANAMON_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankTransferDataOneOf4PermataBankTransfer getDanamonVaBankTransfer() {
    return danamonVaBankTransfer;
  }


  @JsonProperty(JSON_PROPERTY_DANAMON_VA_BANK_TRANSFER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDanamonVaBankTransfer(BankTransferDataOneOf4PermataBankTransfer danamonVaBankTransfer) {
    this.danamonVaBankTransfer = danamonVaBankTransfer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferDataOneOf9 bankTransferDataOneOf9 = (BankTransferDataOneOf9) o;
    return Objects.equals(this.danamonVaBankTransfer, bankTransferDataOneOf9.danamonVaBankTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(danamonVaBankTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferDataOneOf9 {\n");
    sb.append("    danamonVaBankTransfer: ").append(toIndentedString(danamonVaBankTransfer)).append("\n");
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


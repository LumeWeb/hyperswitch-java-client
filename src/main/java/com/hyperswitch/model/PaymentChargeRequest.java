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
import com.hyperswitch.model.PaymentChargeType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Fee information to be charged on the payment being collected
 */
@JsonPropertyOrder({
  PaymentChargeRequest.JSON_PROPERTY_CHARGE_TYPE,
  PaymentChargeRequest.JSON_PROPERTY_FEES,
  PaymentChargeRequest.JSON_PROPERTY_TRANSFER_ACCOUNT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class PaymentChargeRequest {
  public static final String JSON_PROPERTY_CHARGE_TYPE = "charge_type";
  @javax.annotation.Nonnull
  private PaymentChargeType chargeType;

  public static final String JSON_PROPERTY_FEES = "fees";
  @javax.annotation.Nonnull
  private Long fees;

  public static final String JSON_PROPERTY_TRANSFER_ACCOUNT_ID = "transfer_account_id";
  @javax.annotation.Nonnull
  private String transferAccountId;

  public PaymentChargeRequest() {
  }

  public PaymentChargeRequest chargeType(@javax.annotation.Nonnull PaymentChargeType chargeType) {
    
    this.chargeType = chargeType;
    return this;
  }

  /**
   * Get chargeType
   * @return chargeType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHARGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentChargeType getChargeType() {
    return chargeType;
  }


  @JsonProperty(JSON_PROPERTY_CHARGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChargeType(@javax.annotation.Nonnull PaymentChargeType chargeType) {
    this.chargeType = chargeType;
  }


  public PaymentChargeRequest fees(@javax.annotation.Nonnull Long fees) {
    
    this.fees = fees;
    return this;
  }

  /**
   * Platform fees to be collected on the payment
   * @return fees
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getFees() {
    return fees;
  }


  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFees(@javax.annotation.Nonnull Long fees) {
    this.fees = fees;
  }


  public PaymentChargeRequest transferAccountId(@javax.annotation.Nonnull String transferAccountId) {
    
    this.transferAccountId = transferAccountId;
    return this;
  }

  /**
   * Identifier for the reseller&#39;s account to send the funds to
   * @return transferAccountId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSFER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransferAccountId() {
    return transferAccountId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransferAccountId(@javax.annotation.Nonnull String transferAccountId) {
    this.transferAccountId = transferAccountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentChargeRequest paymentChargeRequest = (PaymentChargeRequest) o;
    return Objects.equals(this.chargeType, paymentChargeRequest.chargeType) &&
        Objects.equals(this.fees, paymentChargeRequest.fees) &&
        Objects.equals(this.transferAccountId, paymentChargeRequest.transferAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeType, fees, transferAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentChargeRequest {\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    transferAccountId: ").append(toIndentedString(transferAccountId)).append("\n");
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


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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PaymentProcessingDetailsAtOneOf1
 */
@JsonPropertyOrder({
  PaymentProcessingDetailsAtOneOf1.JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT
})
@JsonTypeName("PaymentProcessingDetailsAt_oneOf_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentProcessingDetailsAtOneOf1 {
  /**
   * Gets or Sets paymentProcessingDetailsAt
   */
  public enum PaymentProcessingDetailsAtEnum {
    CONNECTOR("Connector");

    private String value;

    PaymentProcessingDetailsAtEnum(String value) {
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
    public static PaymentProcessingDetailsAtEnum fromValue(String value) {
      for (PaymentProcessingDetailsAtEnum b : PaymentProcessingDetailsAtEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT = "payment_processing_details_at";
  private PaymentProcessingDetailsAtEnum paymentProcessingDetailsAt;

  public PaymentProcessingDetailsAtOneOf1() {
  }

  public PaymentProcessingDetailsAtOneOf1 paymentProcessingDetailsAt(PaymentProcessingDetailsAtEnum paymentProcessingDetailsAt) {
    
    this.paymentProcessingDetailsAt = paymentProcessingDetailsAt;
    return this;
  }

   /**
   * Get paymentProcessingDetailsAt
   * @return paymentProcessingDetailsAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentProcessingDetailsAtEnum getPaymentProcessingDetailsAt() {
    return paymentProcessingDetailsAt;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_DETAILS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentProcessingDetailsAt(PaymentProcessingDetailsAtEnum paymentProcessingDetailsAt) {
    this.paymentProcessingDetailsAt = paymentProcessingDetailsAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProcessingDetailsAtOneOf1 paymentProcessingDetailsAtOneOf1 = (PaymentProcessingDetailsAtOneOf1) o;
    return Objects.equals(this.paymentProcessingDetailsAt, paymentProcessingDetailsAtOneOf1.paymentProcessingDetailsAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProcessingDetailsAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProcessingDetailsAtOneOf1 {\n");
    sb.append("    paymentProcessingDetailsAt: ").append(toIndentedString(paymentProcessingDetailsAt)).append("\n");
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


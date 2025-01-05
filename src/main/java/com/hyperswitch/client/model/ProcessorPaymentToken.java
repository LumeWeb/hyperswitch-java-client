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

/**
 * Processor payment token for MIT payments where payment_method_data is not available
 */
@JsonPropertyOrder({
  ProcessorPaymentToken.JSON_PROPERTY_PROCESSOR_PAYMENT_TOKEN,
  ProcessorPaymentToken.JSON_PROPERTY_MERCHANT_CONNECTOR_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessorPaymentToken {
  public static final String JSON_PROPERTY_PROCESSOR_PAYMENT_TOKEN = "processor_payment_token";
  private String processorPaymentToken;

  public static final String JSON_PROPERTY_MERCHANT_CONNECTOR_ID = "merchant_connector_id";
  private JsonNullable<String> merchantConnectorId = JsonNullable.<String>undefined();

  public ProcessorPaymentToken() {
  }

  public ProcessorPaymentToken processorPaymentToken(String processorPaymentToken) {
    
    this.processorPaymentToken = processorPaymentToken;
    return this;
  }

   /**
   * Get processorPaymentToken
   * @return processorPaymentToken
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROCESSOR_PAYMENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProcessorPaymentToken() {
    return processorPaymentToken;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSOR_PAYMENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProcessorPaymentToken(String processorPaymentToken) {
    this.processorPaymentToken = processorPaymentToken;
  }


  public ProcessorPaymentToken merchantConnectorId(String merchantConnectorId) {
    this.merchantConnectorId = JsonNullable.<String>of(merchantConnectorId);
    
    return this;
  }

   /**
   * Get merchantConnectorId
   * @return merchantConnectorId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMerchantConnectorId() {
        return merchantConnectorId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMerchantConnectorId_JsonNullable() {
    return merchantConnectorId;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  public void setMerchantConnectorId_JsonNullable(JsonNullable<String> merchantConnectorId) {
    this.merchantConnectorId = merchantConnectorId;
  }

  public void setMerchantConnectorId(String merchantConnectorId) {
    this.merchantConnectorId = JsonNullable.<String>of(merchantConnectorId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorPaymentToken processorPaymentToken = (ProcessorPaymentToken) o;
    return Objects.equals(this.processorPaymentToken, processorPaymentToken.processorPaymentToken) &&
        equalsNullable(this.merchantConnectorId, processorPaymentToken.merchantConnectorId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(processorPaymentToken, hashCodeNullable(merchantConnectorId));
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
    sb.append("class ProcessorPaymentToken {\n");
    sb.append("    processorPaymentToken: ").append(toIndentedString(processorPaymentToken)).append("\n");
    sb.append("    merchantConnectorId: ").append(toIndentedString(merchantConnectorId)).append("\n");
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


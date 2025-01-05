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
import com.hyperswitch.model.RefundType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RefundsCreateRequest
 */
@JsonPropertyOrder({
  RefundsCreateRequest.JSON_PROPERTY_PAYMENT_ID,
  RefundsCreateRequest.JSON_PROPERTY_MERCHANT_REFERENCE_ID,
  RefundsCreateRequest.JSON_PROPERTY_AMOUNT,
  RefundsCreateRequest.JSON_PROPERTY_REASON,
  RefundsCreateRequest.JSON_PROPERTY_REFUND_TYPE,
  RefundsCreateRequest.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RefundsCreateRequest {
  public static final String JSON_PROPERTY_PAYMENT_ID = "payment_id";
  private String paymentId;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE_ID = "merchant_reference_id";
  private JsonNullable<String> merchantReferenceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private JsonNullable<Long> amount = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_REASON = "reason";
  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REFUND_TYPE = "refund_type";
  private JsonNullable<RefundType> refundType = JsonNullable.<RefundType>of(RefundType.INSTANT);

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public RefundsCreateRequest() {
  }

  public RefundsCreateRequest paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The payment id against which refund is initiated
   * @return paymentId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentId() {
    return paymentId;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public RefundsCreateRequest merchantReferenceId(String merchantReferenceId) {
    this.merchantReferenceId = JsonNullable.<String>of(merchantReferenceId);
    
    return this;
  }

   /**
   * Unique Identifier for the Refund. This is to ensure idempotency for multiple partial refunds initiated against the same payment.
   * @return merchantReferenceId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getMerchantReferenceId() {
        return merchantReferenceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMerchantReferenceId_JsonNullable() {
    return merchantReferenceId;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE_ID)
  public void setMerchantReferenceId_JsonNullable(JsonNullable<String> merchantReferenceId) {
    this.merchantReferenceId = merchantReferenceId;
  }

  public void setMerchantReferenceId(String merchantReferenceId) {
    this.merchantReferenceId = JsonNullable.<String>of(merchantReferenceId);
  }


  public RefundsCreateRequest amount(Long amount) {
    this.amount = JsonNullable.<Long>of(amount);
    
    return this;
  }

   /**
   * Total amount for which the refund is to be initiated. Amount for the payment in lowest denomination of the currency. (i.e) in cents for USD denomination, in paisa for INR denomination etc., If not provided, this will default to the amount_captured of the payment
   * minimum: 100
   * @return amount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getAmount() {
        return amount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getAmount_JsonNullable() {
    return amount;
  }
  
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  public void setAmount_JsonNullable(JsonNullable<Long> amount) {
    this.amount = amount;
  }

  public void setAmount(Long amount) {
    this.amount = JsonNullable.<Long>of(amount);
  }


  public RefundsCreateRequest reason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
    
    return this;
  }

   /**
   * Reason for the refund. Often useful for displaying to users and your customer support executive.
   * @return reason
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getReason() {
        return reason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReason_JsonNullable() {
    return reason;
  }
  
  @JsonProperty(JSON_PROPERTY_REASON)
  public void setReason_JsonNullable(JsonNullable<String> reason) {
    this.reason = reason;
  }

  public void setReason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
  }


  public RefundsCreateRequest refundType(RefundType refundType) {
    this.refundType = JsonNullable.<RefundType>of(refundType);
    
    return this;
  }

   /**
   * Get refundType
   * @return refundType
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public RefundType getRefundType() {
        return refundType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFUND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RefundType> getRefundType_JsonNullable() {
    return refundType;
  }
  
  @JsonProperty(JSON_PROPERTY_REFUND_TYPE)
  public void setRefundType_JsonNullable(JsonNullable<RefundType> refundType) {
    this.refundType = refundType;
  }

  public void setRefundType(RefundType refundType) {
    this.refundType = JsonNullable.<RefundType>of(refundType);
  }


  public RefundsCreateRequest metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Metadata is useful for storing additional, unstructured information on an object.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundsCreateRequest refundsCreateRequest = (RefundsCreateRequest) o;
    return Objects.equals(this.paymentId, refundsCreateRequest.paymentId) &&
        equalsNullable(this.merchantReferenceId, refundsCreateRequest.merchantReferenceId) &&
        equalsNullable(this.amount, refundsCreateRequest.amount) &&
        equalsNullable(this.reason, refundsCreateRequest.reason) &&
        equalsNullable(this.refundType, refundsCreateRequest.refundType) &&
        equalsNullable(this.metadata, refundsCreateRequest.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, hashCodeNullable(merchantReferenceId), hashCodeNullable(amount), hashCodeNullable(reason), hashCodeNullable(refundType), hashCodeNullable(metadata));
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
    sb.append("class RefundsCreateRequest {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    merchantReferenceId: ").append(toIndentedString(merchantReferenceId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    refundType: ").append(toIndentedString(refundType)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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


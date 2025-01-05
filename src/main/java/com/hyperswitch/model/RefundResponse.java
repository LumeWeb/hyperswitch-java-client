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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.Connector;
import com.hyperswitch.model.Currency;
import com.hyperswitch.model.RefundErrorDetails;
import com.hyperswitch.model.RefundStatus;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.hyperswitch.client.ApiClient;
/**
 * RefundResponse
 */
@JsonPropertyOrder({
  RefundResponse.JSON_PROPERTY_ID,
  RefundResponse.JSON_PROPERTY_PAYMENT_ID,
  RefundResponse.JSON_PROPERTY_MERCHANT_REFERENCE_ID,
  RefundResponse.JSON_PROPERTY_AMOUNT,
  RefundResponse.JSON_PROPERTY_CURRENCY,
  RefundResponse.JSON_PROPERTY_STATUS,
  RefundResponse.JSON_PROPERTY_REASON,
  RefundResponse.JSON_PROPERTY_METADATA,
  RefundResponse.JSON_PROPERTY_ERROR_DETAILS,
  RefundResponse.JSON_PROPERTY_CREATED_AT,
  RefundResponse.JSON_PROPERTY_UPDATED_AT,
  RefundResponse.JSON_PROPERTY_CONNECTOR,
  RefundResponse.JSON_PROPERTY_PROFILE_ID,
  RefundResponse.JSON_PROPERTY_MERCHANT_CONNECTOR_ID,
  RefundResponse.JSON_PROPERTY_CONNECTOR_REFUND_REFERENCE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class RefundResponse {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private String id;

  public static final String JSON_PROPERTY_PAYMENT_ID = "payment_id";
  @javax.annotation.Nonnull
  private String paymentId;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE_ID = "merchant_reference_id";
  private JsonNullable<String> merchantReferenceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nonnull
  private Long amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private Currency currency;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private RefundStatus status;

  public static final String JSON_PROPERTY_REASON = "reason";
  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_ERROR_DETAILS = "error_details";
  private JsonNullable<RefundErrorDetails> errorDetails = JsonNullable.<RefundErrorDetails>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  @javax.annotation.Nonnull
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  @javax.annotation.Nonnull
  private Connector connector;

  public static final String JSON_PROPERTY_PROFILE_ID = "profile_id";
  @javax.annotation.Nonnull
  private String profileId;

  public static final String JSON_PROPERTY_MERCHANT_CONNECTOR_ID = "merchant_connector_id";
  @javax.annotation.Nonnull
  private String merchantConnectorId;

  public static final String JSON_PROPERTY_CONNECTOR_REFUND_REFERENCE_ID = "connector_refund_reference_id";
  private JsonNullable<String> connectorRefundReferenceId = JsonNullable.<String>undefined();

  public RefundResponse() { 
  }

  public RefundResponse id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Global Refund Id for the refund
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@javax.annotation.Nonnull String id) {
    this.id = id;
  }


  public RefundResponse paymentId(@javax.annotation.Nonnull String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * The payment id against which refund is initiated
   * @return paymentId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPaymentId() {
    return paymentId;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentId(@javax.annotation.Nonnull String paymentId) {
    this.paymentId = paymentId;
  }


  public RefundResponse merchantReferenceId(@javax.annotation.Nullable String merchantReferenceId) {
    this.merchantReferenceId = JsonNullable.<String>of(merchantReferenceId);
    return this;
  }

  /**
   * Unique Identifier for the Refund. This is to ensure idempotency for multiple partial refunds initiated against the same payment.
   * @return merchantReferenceId
   */
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

  public void setMerchantReferenceId(@javax.annotation.Nullable String merchantReferenceId) {
    this.merchantReferenceId = JsonNullable.<String>of(merchantReferenceId);
  }


  public RefundResponse amount(@javax.annotation.Nonnull Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The refund amount
   * minimum: 100
   * @return amount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(@javax.annotation.Nonnull Long amount) {
    this.amount = amount;
  }


  public RefundResponse currency(@javax.annotation.Nonnull Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(@javax.annotation.Nonnull Currency currency) {
    this.currency = currency;
  }


  public RefundResponse status(@javax.annotation.Nonnull RefundStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RefundStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull RefundStatus status) {
    this.status = status;
  }


  public RefundResponse reason(@javax.annotation.Nullable String reason) {
    this.reason = JsonNullable.<String>of(reason);
    return this;
  }

  /**
   * An arbitrary string attached to the object
   * @return reason
   */
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

  public void setReason(@javax.annotation.Nullable String reason) {
    this.reason = JsonNullable.<String>of(reason);
  }


  public RefundResponse metadata(@javax.annotation.Nullable Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    return this;
  }

  /**
   * Metadata is useful for storing additional, unstructured information on an object
   * @return metadata
   */
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

  public void setMetadata(@javax.annotation.Nullable Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }


  public RefundResponse errorDetails(@javax.annotation.Nullable RefundErrorDetails errorDetails) {
    this.errorDetails = JsonNullable.<RefundErrorDetails>of(errorDetails);
    return this;
  }

  /**
   * Get errorDetails
   * @return errorDetails
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public RefundErrorDetails getErrorDetails() {
        return errorDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RefundErrorDetails> getErrorDetails_JsonNullable() {
    return errorDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  public void setErrorDetails_JsonNullable(JsonNullable<RefundErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
  }

  public void setErrorDetails(@javax.annotation.Nullable RefundErrorDetails errorDetails) {
    this.errorDetails = JsonNullable.<RefundErrorDetails>of(errorDetails);
  }


  public RefundResponse createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp at which refund is created
   * @return createdAt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public RefundResponse updatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp at which refund is updated
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(@javax.annotation.Nonnull OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public RefundResponse connector(@javax.annotation.Nonnull Connector connector) {
    this.connector = connector;
    return this;
  }

  /**
   * Get connector
   * @return connector
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Connector getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(@javax.annotation.Nonnull Connector connector) {
    this.connector = connector;
  }


  public RefundResponse profileId(@javax.annotation.Nonnull String profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * The id of business profile for this refund
   * @return profileId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProfileId() {
    return profileId;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProfileId(@javax.annotation.Nonnull String profileId) {
    this.profileId = profileId;
  }


  public RefundResponse merchantConnectorId(@javax.annotation.Nonnull String merchantConnectorId) {
    this.merchantConnectorId = merchantConnectorId;
    return this;
  }

  /**
   * The merchant_connector_id of the processor through which this payment went through
   * @return merchantConnectorId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMerchantConnectorId() {
    return merchantConnectorId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantConnectorId(@javax.annotation.Nonnull String merchantConnectorId) {
    this.merchantConnectorId = merchantConnectorId;
  }


  public RefundResponse connectorRefundReferenceId(@javax.annotation.Nullable String connectorRefundReferenceId) {
    this.connectorRefundReferenceId = JsonNullable.<String>of(connectorRefundReferenceId);
    return this;
  }

  /**
   * The reference id of the connector for the refund
   * @return connectorRefundReferenceId
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getConnectorRefundReferenceId() {
        return connectorRefundReferenceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_REFUND_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorRefundReferenceId_JsonNullable() {
    return connectorRefundReferenceId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_REFUND_REFERENCE_ID)
  public void setConnectorRefundReferenceId_JsonNullable(JsonNullable<String> connectorRefundReferenceId) {
    this.connectorRefundReferenceId = connectorRefundReferenceId;
  }

  public void setConnectorRefundReferenceId(@javax.annotation.Nullable String connectorRefundReferenceId) {
    this.connectorRefundReferenceId = JsonNullable.<String>of(connectorRefundReferenceId);
  }


  /**
   * Return true if this RefundResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundResponse refundResponse = (RefundResponse) o;
    return Objects.equals(this.id, refundResponse.id) &&
        Objects.equals(this.paymentId, refundResponse.paymentId) &&
        equalsNullable(this.merchantReferenceId, refundResponse.merchantReferenceId) &&
        Objects.equals(this.amount, refundResponse.amount) &&
        Objects.equals(this.currency, refundResponse.currency) &&
        Objects.equals(this.status, refundResponse.status) &&
        equalsNullable(this.reason, refundResponse.reason) &&
        equalsNullable(this.metadata, refundResponse.metadata) &&
        equalsNullable(this.errorDetails, refundResponse.errorDetails) &&
        Objects.equals(this.createdAt, refundResponse.createdAt) &&
        Objects.equals(this.updatedAt, refundResponse.updatedAt) &&
        Objects.equals(this.connector, refundResponse.connector) &&
        Objects.equals(this.profileId, refundResponse.profileId) &&
        Objects.equals(this.merchantConnectorId, refundResponse.merchantConnectorId) &&
        equalsNullable(this.connectorRefundReferenceId, refundResponse.connectorRefundReferenceId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentId, hashCodeNullable(merchantReferenceId), amount, currency, status, hashCodeNullable(reason), hashCodeNullable(metadata), hashCodeNullable(errorDetails), createdAt, updatedAt, connector, profileId, merchantConnectorId, hashCodeNullable(connectorRefundReferenceId));
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
    sb.append("class RefundResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    merchantReferenceId: ").append(toIndentedString(merchantReferenceId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    merchantConnectorId: ").append(toIndentedString(merchantConnectorId)).append("\n");
    sb.append("    connectorRefundReferenceId: ").append(toIndentedString(connectorRefundReferenceId)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `payment_id` to the URL query string
    if (getPaymentId() != null) {
      joiner.add(String.format("%spayment_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPaymentId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `merchant_reference_id` to the URL query string
    if (getMerchantReferenceId() != null) {
      joiner.add(String.format("%smerchant_reference_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMerchantReferenceId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCurrency()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `reason` to the URL query string
    if (getReason() != null) {
      joiner.add(String.format("%sreason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      joiner.add(String.format("%smetadata%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMetadata()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `error_details` to the URL query string
    if (getErrorDetails() != null) {
      joiner.add(getErrorDetails().toUrlQueryString(prefix + "error_details" + suffix));
    }

    // add `created_at` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screated_at%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `updated_at` to the URL query string
    if (getUpdatedAt() != null) {
      joiner.add(String.format("%supdated_at%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUpdatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector` to the URL query string
    if (getConnector() != null) {
      joiner.add(String.format("%sconnector%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnector()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `profile_id` to the URL query string
    if (getProfileId() != null) {
      joiner.add(String.format("%sprofile_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getProfileId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `merchant_connector_id` to the URL query string
    if (getMerchantConnectorId() != null) {
      joiner.add(String.format("%smerchant_connector_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMerchantConnectorId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector_refund_reference_id` to the URL query string
    if (getConnectorRefundReferenceId() != null) {
      joiner.add(String.format("%sconnector_refund_reference_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnectorRefundReferenceId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


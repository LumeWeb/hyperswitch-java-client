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


package com.lumeweb.hyperswitch.model;

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
import com.lumeweb.hyperswitch.model.DisputeStage;
import com.lumeweb.hyperswitch.model.DisputeStatus;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * DisputeResponsePaymentsRetrieve
 */
@JsonPropertyOrder({
  DisputeResponsePaymentsRetrieve.JSON_PROPERTY_DISPUTE_ID,
  DisputeResponsePaymentsRetrieve.JSON_PROPERTY_DISPUTE_STAGE,
  DisputeResponsePaymentsRetrieve.JSON_PROPERTY_DISPUTE_STATUS,
  DisputeResponsePaymentsRetrieve.JSON_PROPERTY_CONNECTOR_STATUS,
  DisputeResponsePaymentsRetrieve.JSON_PROPERTY_CONNECTOR_DISPUTE_ID,
  DisputeResponsePaymentsRetrieve.JSON_PROPERTY_CONNECTOR_REASON,
  DisputeResponsePaymentsRetrieve.JSON_PROPERTY_CONNECTOR_REASON_CODE,
  DisputeResponsePaymentsRetrieve.JSON_PROPERTY_CHALLENGE_REQUIRED_BY,
  DisputeResponsePaymentsRetrieve.JSON_PROPERTY_CONNECTOR_CREATED_AT,
  DisputeResponsePaymentsRetrieve.JSON_PROPERTY_CONNECTOR_UPDATED_AT,
  DisputeResponsePaymentsRetrieve.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class DisputeResponsePaymentsRetrieve {
  public static final String JSON_PROPERTY_DISPUTE_ID = "dispute_id";
  @javax.annotation.Nonnull
  private String disputeId;

  public static final String JSON_PROPERTY_DISPUTE_STAGE = "dispute_stage";
  @javax.annotation.Nonnull
  private DisputeStage disputeStage;

  public static final String JSON_PROPERTY_DISPUTE_STATUS = "dispute_status";
  @javax.annotation.Nonnull
  private DisputeStatus disputeStatus;

  public static final String JSON_PROPERTY_CONNECTOR_STATUS = "connector_status";
  @javax.annotation.Nonnull
  private String connectorStatus;

  public static final String JSON_PROPERTY_CONNECTOR_DISPUTE_ID = "connector_dispute_id";
  @javax.annotation.Nonnull
  private String connectorDisputeId;

  public static final String JSON_PROPERTY_CONNECTOR_REASON = "connector_reason";
  private JsonNullable<String> connectorReason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_REASON_CODE = "connector_reason_code";
  private JsonNullable<String> connectorReasonCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CHALLENGE_REQUIRED_BY = "challenge_required_by";
  private JsonNullable<OffsetDateTime> challengeRequiredBy = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_CREATED_AT = "connector_created_at";
  private JsonNullable<OffsetDateTime> connectorCreatedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_UPDATED_AT = "connector_updated_at";
  private JsonNullable<OffsetDateTime> connectorUpdatedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @javax.annotation.Nonnull
  private OffsetDateTime createdAt;

  public DisputeResponsePaymentsRetrieve() { 
  }

  public DisputeResponsePaymentsRetrieve disputeId(@javax.annotation.Nonnull String disputeId) {
    this.disputeId = disputeId;
    return this;
  }

  /**
   * The identifier for dispute
   * @return disputeId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDisputeId() {
    return disputeId;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisputeId(@javax.annotation.Nonnull String disputeId) {
    this.disputeId = disputeId;
  }


  public DisputeResponsePaymentsRetrieve disputeStage(@javax.annotation.Nonnull DisputeStage disputeStage) {
    this.disputeStage = disputeStage;
    return this;
  }

  /**
   * Get disputeStage
   * @return disputeStage
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPUTE_STAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DisputeStage getDisputeStage() {
    return disputeStage;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTE_STAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisputeStage(@javax.annotation.Nonnull DisputeStage disputeStage) {
    this.disputeStage = disputeStage;
  }


  public DisputeResponsePaymentsRetrieve disputeStatus(@javax.annotation.Nonnull DisputeStatus disputeStatus) {
    this.disputeStatus = disputeStatus;
    return this;
  }

  /**
   * Get disputeStatus
   * @return disputeStatus
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPUTE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DisputeStatus getDisputeStatus() {
    return disputeStatus;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisputeStatus(@javax.annotation.Nonnull DisputeStatus disputeStatus) {
    this.disputeStatus = disputeStatus;
  }


  public DisputeResponsePaymentsRetrieve connectorStatus(@javax.annotation.Nonnull String connectorStatus) {
    this.connectorStatus = connectorStatus;
    return this;
  }

  /**
   * Status of the dispute sent by connector
   * @return connectorStatus
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConnectorStatus() {
    return connectorStatus;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorStatus(@javax.annotation.Nonnull String connectorStatus) {
    this.connectorStatus = connectorStatus;
  }


  public DisputeResponsePaymentsRetrieve connectorDisputeId(@javax.annotation.Nonnull String connectorDisputeId) {
    this.connectorDisputeId = connectorDisputeId;
    return this;
  }

  /**
   * Dispute id sent by connector
   * @return connectorDisputeId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR_DISPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConnectorDisputeId() {
    return connectorDisputeId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_DISPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorDisputeId(@javax.annotation.Nonnull String connectorDisputeId) {
    this.connectorDisputeId = connectorDisputeId;
  }


  public DisputeResponsePaymentsRetrieve connectorReason(@javax.annotation.Nullable String connectorReason) {
    this.connectorReason = JsonNullable.<String>of(connectorReason);
    return this;
  }

  /**
   * Reason of dispute sent by connector
   * @return connectorReason
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getConnectorReason() {
        return connectorReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorReason_JsonNullable() {
    return connectorReason;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_REASON)
  public void setConnectorReason_JsonNullable(JsonNullable<String> connectorReason) {
    this.connectorReason = connectorReason;
  }

  public void setConnectorReason(@javax.annotation.Nullable String connectorReason) {
    this.connectorReason = JsonNullable.<String>of(connectorReason);
  }


  public DisputeResponsePaymentsRetrieve connectorReasonCode(@javax.annotation.Nullable String connectorReasonCode) {
    this.connectorReasonCode = JsonNullable.<String>of(connectorReasonCode);
    return this;
  }

  /**
   * Reason code of dispute sent by connector
   * @return connectorReasonCode
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getConnectorReasonCode() {
        return connectorReasonCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorReasonCode_JsonNullable() {
    return connectorReasonCode;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_REASON_CODE)
  public void setConnectorReasonCode_JsonNullable(JsonNullable<String> connectorReasonCode) {
    this.connectorReasonCode = connectorReasonCode;
  }

  public void setConnectorReasonCode(@javax.annotation.Nullable String connectorReasonCode) {
    this.connectorReasonCode = JsonNullable.<String>of(connectorReasonCode);
  }


  public DisputeResponsePaymentsRetrieve challengeRequiredBy(@javax.annotation.Nullable OffsetDateTime challengeRequiredBy) {
    this.challengeRequiredBy = JsonNullable.<OffsetDateTime>of(challengeRequiredBy);
    return this;
  }

  /**
   * Evidence deadline of dispute sent by connector
   * @return challengeRequiredBy
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getChallengeRequiredBy() {
        return challengeRequiredBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHALLENGE_REQUIRED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getChallengeRequiredBy_JsonNullable() {
    return challengeRequiredBy;
  }
  
  @JsonProperty(JSON_PROPERTY_CHALLENGE_REQUIRED_BY)
  public void setChallengeRequiredBy_JsonNullable(JsonNullable<OffsetDateTime> challengeRequiredBy) {
    this.challengeRequiredBy = challengeRequiredBy;
  }

  public void setChallengeRequiredBy(@javax.annotation.Nullable OffsetDateTime challengeRequiredBy) {
    this.challengeRequiredBy = JsonNullable.<OffsetDateTime>of(challengeRequiredBy);
  }


  public DisputeResponsePaymentsRetrieve connectorCreatedAt(@javax.annotation.Nullable OffsetDateTime connectorCreatedAt) {
    this.connectorCreatedAt = JsonNullable.<OffsetDateTime>of(connectorCreatedAt);
    return this;
  }

  /**
   * Dispute created time sent by connector
   * @return connectorCreatedAt
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getConnectorCreatedAt() {
        return connectorCreatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getConnectorCreatedAt_JsonNullable() {
    return connectorCreatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_CREATED_AT)
  public void setConnectorCreatedAt_JsonNullable(JsonNullable<OffsetDateTime> connectorCreatedAt) {
    this.connectorCreatedAt = connectorCreatedAt;
  }

  public void setConnectorCreatedAt(@javax.annotation.Nullable OffsetDateTime connectorCreatedAt) {
    this.connectorCreatedAt = JsonNullable.<OffsetDateTime>of(connectorCreatedAt);
  }


  public DisputeResponsePaymentsRetrieve connectorUpdatedAt(@javax.annotation.Nullable OffsetDateTime connectorUpdatedAt) {
    this.connectorUpdatedAt = JsonNullable.<OffsetDateTime>of(connectorUpdatedAt);
    return this;
  }

  /**
   * Dispute updated time sent by connector
   * @return connectorUpdatedAt
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getConnectorUpdatedAt() {
        return connectorUpdatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getConnectorUpdatedAt_JsonNullable() {
    return connectorUpdatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_UPDATED_AT)
  public void setConnectorUpdatedAt_JsonNullable(JsonNullable<OffsetDateTime> connectorUpdatedAt) {
    this.connectorUpdatedAt = connectorUpdatedAt;
  }

  public void setConnectorUpdatedAt(@javax.annotation.Nullable OffsetDateTime connectorUpdatedAt) {
    this.connectorUpdatedAt = JsonNullable.<OffsetDateTime>of(connectorUpdatedAt);
  }


  public DisputeResponsePaymentsRetrieve createdAt(@javax.annotation.Nonnull OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time at which dispute is received
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


  /**
   * Return true if this DisputeResponsePaymentsRetrieve object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeResponsePaymentsRetrieve disputeResponsePaymentsRetrieve = (DisputeResponsePaymentsRetrieve) o;
    return Objects.equals(this.disputeId, disputeResponsePaymentsRetrieve.disputeId) &&
        Objects.equals(this.disputeStage, disputeResponsePaymentsRetrieve.disputeStage) &&
        Objects.equals(this.disputeStatus, disputeResponsePaymentsRetrieve.disputeStatus) &&
        Objects.equals(this.connectorStatus, disputeResponsePaymentsRetrieve.connectorStatus) &&
        Objects.equals(this.connectorDisputeId, disputeResponsePaymentsRetrieve.connectorDisputeId) &&
        equalsNullable(this.connectorReason, disputeResponsePaymentsRetrieve.connectorReason) &&
        equalsNullable(this.connectorReasonCode, disputeResponsePaymentsRetrieve.connectorReasonCode) &&
        equalsNullable(this.challengeRequiredBy, disputeResponsePaymentsRetrieve.challengeRequiredBy) &&
        equalsNullable(this.connectorCreatedAt, disputeResponsePaymentsRetrieve.connectorCreatedAt) &&
        equalsNullable(this.connectorUpdatedAt, disputeResponsePaymentsRetrieve.connectorUpdatedAt) &&
        Objects.equals(this.createdAt, disputeResponsePaymentsRetrieve.createdAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputeId, disputeStage, disputeStatus, connectorStatus, connectorDisputeId, hashCodeNullable(connectorReason), hashCodeNullable(connectorReasonCode), hashCodeNullable(challengeRequiredBy), hashCodeNullable(connectorCreatedAt), hashCodeNullable(connectorUpdatedAt), createdAt);
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
    sb.append("class DisputeResponsePaymentsRetrieve {\n");
    sb.append("    disputeId: ").append(toIndentedString(disputeId)).append("\n");
    sb.append("    disputeStage: ").append(toIndentedString(disputeStage)).append("\n");
    sb.append("    disputeStatus: ").append(toIndentedString(disputeStatus)).append("\n");
    sb.append("    connectorStatus: ").append(toIndentedString(connectorStatus)).append("\n");
    sb.append("    connectorDisputeId: ").append(toIndentedString(connectorDisputeId)).append("\n");
    sb.append("    connectorReason: ").append(toIndentedString(connectorReason)).append("\n");
    sb.append("    connectorReasonCode: ").append(toIndentedString(connectorReasonCode)).append("\n");
    sb.append("    challengeRequiredBy: ").append(toIndentedString(challengeRequiredBy)).append("\n");
    sb.append("    connectorCreatedAt: ").append(toIndentedString(connectorCreatedAt)).append("\n");
    sb.append("    connectorUpdatedAt: ").append(toIndentedString(connectorUpdatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

    // add `dispute_id` to the URL query string
    if (getDisputeId() != null) {
      joiner.add(String.format("%sdispute_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDisputeId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dispute_stage` to the URL query string
    if (getDisputeStage() != null) {
      joiner.add(String.format("%sdispute_stage%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDisputeStage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dispute_status` to the URL query string
    if (getDisputeStatus() != null) {
      joiner.add(String.format("%sdispute_status%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDisputeStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector_status` to the URL query string
    if (getConnectorStatus() != null) {
      joiner.add(String.format("%sconnector_status%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnectorStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector_dispute_id` to the URL query string
    if (getConnectorDisputeId() != null) {
      joiner.add(String.format("%sconnector_dispute_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnectorDisputeId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector_reason` to the URL query string
    if (getConnectorReason() != null) {
      joiner.add(String.format("%sconnector_reason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnectorReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector_reason_code` to the URL query string
    if (getConnectorReasonCode() != null) {
      joiner.add(String.format("%sconnector_reason_code%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnectorReasonCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `challenge_required_by` to the URL query string
    if (getChallengeRequiredBy() != null) {
      joiner.add(String.format("%schallenge_required_by%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getChallengeRequiredBy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector_created_at` to the URL query string
    if (getConnectorCreatedAt() != null) {
      joiner.add(String.format("%sconnector_created_at%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnectorCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector_updated_at` to the URL query string
    if (getConnectorUpdatedAt() != null) {
      joiner.add(String.format("%sconnector_updated_at%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnectorUpdatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `created_at` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screated_at%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


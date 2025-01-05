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
import com.lumeweb.hyperswitch.model.CaptureStatus;
import com.lumeweb.hyperswitch.model.Currency;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * CaptureResponse
 */
@JsonPropertyOrder({
  CaptureResponse.JSON_PROPERTY_CAPTURE_ID,
  CaptureResponse.JSON_PROPERTY_STATUS,
  CaptureResponse.JSON_PROPERTY_AMOUNT,
  CaptureResponse.JSON_PROPERTY_CURRENCY,
  CaptureResponse.JSON_PROPERTY_CONNECTOR,
  CaptureResponse.JSON_PROPERTY_AUTHORIZED_ATTEMPT_ID,
  CaptureResponse.JSON_PROPERTY_CONNECTOR_CAPTURE_ID,
  CaptureResponse.JSON_PROPERTY_CAPTURE_SEQUENCE,
  CaptureResponse.JSON_PROPERTY_ERROR_MESSAGE,
  CaptureResponse.JSON_PROPERTY_ERROR_CODE,
  CaptureResponse.JSON_PROPERTY_ERROR_REASON,
  CaptureResponse.JSON_PROPERTY_REFERENCE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class CaptureResponse {
  public static final String JSON_PROPERTY_CAPTURE_ID = "capture_id";
  @javax.annotation.Nonnull
  private String captureId;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private CaptureStatus status;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nonnull
  private Long amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<Currency> currency = JsonNullable.<Currency>undefined();

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  @javax.annotation.Nonnull
  private String connector;

  public static final String JSON_PROPERTY_AUTHORIZED_ATTEMPT_ID = "authorized_attempt_id";
  @javax.annotation.Nonnull
  private String authorizedAttemptId;

  public static final String JSON_PROPERTY_CONNECTOR_CAPTURE_ID = "connector_capture_id";
  private JsonNullable<String> connectorCaptureId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAPTURE_SEQUENCE = "capture_sequence";
  @javax.annotation.Nonnull
  private Integer captureSequence;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
  private JsonNullable<String> errorCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_REASON = "error_reason";
  private JsonNullable<String> errorReason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REFERENCE_ID = "reference_id";
  private JsonNullable<String> referenceId = JsonNullable.<String>undefined();

  public CaptureResponse() { 
  }

  public CaptureResponse captureId(@javax.annotation.Nonnull String captureId) {
    this.captureId = captureId;
    return this;
  }

  /**
   * Unique identifier for the capture
   * @return captureId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAPTURE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCaptureId() {
    return captureId;
  }


  @JsonProperty(JSON_PROPERTY_CAPTURE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCaptureId(@javax.annotation.Nonnull String captureId) {
    this.captureId = captureId;
  }


  public CaptureResponse status(@javax.annotation.Nonnull CaptureStatus status) {
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
  public CaptureStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull CaptureStatus status) {
    this.status = status;
  }


  public CaptureResponse amount(@javax.annotation.Nonnull Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The capture amount. Amount for the payment in lowest denomination of the currency. (i.e) in cents for USD denomination, in paisa for INR denomination etc.,
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


  public CaptureResponse currency(@javax.annotation.Nullable Currency currency) {
    this.currency = JsonNullable.<Currency>of(currency);
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Currency getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Currency> getCurrency_JsonNullable() {
    return currency;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  public void setCurrency_JsonNullable(JsonNullable<Currency> currency) {
    this.currency = currency;
  }

  public void setCurrency(@javax.annotation.Nullable Currency currency) {
    this.currency = JsonNullable.<Currency>of(currency);
  }


  public CaptureResponse connector(@javax.annotation.Nonnull String connector) {
    this.connector = connector;
    return this;
  }

  /**
   * The connector used for the payment
   * @return connector
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(@javax.annotation.Nonnull String connector) {
    this.connector = connector;
  }


  public CaptureResponse authorizedAttemptId(@javax.annotation.Nonnull String authorizedAttemptId) {
    this.authorizedAttemptId = authorizedAttemptId;
    return this;
  }

  /**
   * Unique identifier for the parent attempt on which this capture is made
   * @return authorizedAttemptId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHORIZED_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAuthorizedAttemptId() {
    return authorizedAttemptId;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZED_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthorizedAttemptId(@javax.annotation.Nonnull String authorizedAttemptId) {
    this.authorizedAttemptId = authorizedAttemptId;
  }


  public CaptureResponse connectorCaptureId(@javax.annotation.Nullable String connectorCaptureId) {
    this.connectorCaptureId = JsonNullable.<String>of(connectorCaptureId);
    return this;
  }

  /**
   * A unique identifier for this capture provided by the connector
   * @return connectorCaptureId
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getConnectorCaptureId() {
        return connectorCaptureId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_CAPTURE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorCaptureId_JsonNullable() {
    return connectorCaptureId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_CAPTURE_ID)
  public void setConnectorCaptureId_JsonNullable(JsonNullable<String> connectorCaptureId) {
    this.connectorCaptureId = connectorCaptureId;
  }

  public void setConnectorCaptureId(@javax.annotation.Nullable String connectorCaptureId) {
    this.connectorCaptureId = JsonNullable.<String>of(connectorCaptureId);
  }


  public CaptureResponse captureSequence(@javax.annotation.Nonnull Integer captureSequence) {
    this.captureSequence = captureSequence;
    return this;
  }

  /**
   * Sequence number of this capture, in the series of captures made for the parent attempt
   * @return captureSequence
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAPTURE_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getCaptureSequence() {
    return captureSequence;
  }


  @JsonProperty(JSON_PROPERTY_CAPTURE_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCaptureSequence(@javax.annotation.Nonnull Integer captureSequence) {
    this.captureSequence = captureSequence;
  }


  public CaptureResponse errorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    return this;
  }

  /**
   * If there was an error while calling the connector the error message is received here
   * @return errorMessage
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getErrorMessage() {
        return errorMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorMessage_JsonNullable() {
    return errorMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  public void setErrorMessage_JsonNullable(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void setErrorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
  }


  public CaptureResponse errorCode(@javax.annotation.Nullable String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
    return this;
  }

  /**
   * If there was an error while calling the connectors the code is received here
   * @return errorCode
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getErrorCode() {
        return errorCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorCode_JsonNullable() {
    return errorCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  public void setErrorCode_JsonNullable(JsonNullable<String> errorCode) {
    this.errorCode = errorCode;
  }

  public void setErrorCode(@javax.annotation.Nullable String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
  }


  public CaptureResponse errorReason(@javax.annotation.Nullable String errorReason) {
    this.errorReason = JsonNullable.<String>of(errorReason);
    return this;
  }

  /**
   * If there was an error while calling the connectors the reason is received here
   * @return errorReason
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getErrorReason() {
        return errorReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getErrorReason_JsonNullable() {
    return errorReason;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR_REASON)
  public void setErrorReason_JsonNullable(JsonNullable<String> errorReason) {
    this.errorReason = errorReason;
  }

  public void setErrorReason(@javax.annotation.Nullable String errorReason) {
    this.errorReason = JsonNullable.<String>of(errorReason);
  }


  public CaptureResponse referenceId(@javax.annotation.Nullable String referenceId) {
    this.referenceId = JsonNullable.<String>of(referenceId);
    return this;
  }

  /**
   * Reference to the capture at connector side
   * @return referenceId
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getReferenceId() {
        return referenceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReferenceId_JsonNullable() {
    return referenceId;
  }
  
  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  public void setReferenceId_JsonNullable(JsonNullable<String> referenceId) {
    this.referenceId = referenceId;
  }

  public void setReferenceId(@javax.annotation.Nullable String referenceId) {
    this.referenceId = JsonNullable.<String>of(referenceId);
  }


  /**
   * Return true if this CaptureResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptureResponse captureResponse = (CaptureResponse) o;
    return Objects.equals(this.captureId, captureResponse.captureId) &&
        Objects.equals(this.status, captureResponse.status) &&
        Objects.equals(this.amount, captureResponse.amount) &&
        equalsNullable(this.currency, captureResponse.currency) &&
        Objects.equals(this.connector, captureResponse.connector) &&
        Objects.equals(this.authorizedAttemptId, captureResponse.authorizedAttemptId) &&
        equalsNullable(this.connectorCaptureId, captureResponse.connectorCaptureId) &&
        Objects.equals(this.captureSequence, captureResponse.captureSequence) &&
        equalsNullable(this.errorMessage, captureResponse.errorMessage) &&
        equalsNullable(this.errorCode, captureResponse.errorCode) &&
        equalsNullable(this.errorReason, captureResponse.errorReason) &&
        equalsNullable(this.referenceId, captureResponse.referenceId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(captureId, status, amount, hashCodeNullable(currency), connector, authorizedAttemptId, hashCodeNullable(connectorCaptureId), captureSequence, hashCodeNullable(errorMessage), hashCodeNullable(errorCode), hashCodeNullable(errorReason), hashCodeNullable(referenceId));
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
    sb.append("class CaptureResponse {\n");
    sb.append("    captureId: ").append(toIndentedString(captureId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    authorizedAttemptId: ").append(toIndentedString(authorizedAttemptId)).append("\n");
    sb.append("    connectorCaptureId: ").append(toIndentedString(connectorCaptureId)).append("\n");
    sb.append("    captureSequence: ").append(toIndentedString(captureSequence)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

    // add `capture_id` to the URL query string
    if (getCaptureId() != null) {
      joiner.add(String.format("%scapture_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCaptureId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCurrency()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector` to the URL query string
    if (getConnector() != null) {
      joiner.add(String.format("%sconnector%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnector()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authorized_attempt_id` to the URL query string
    if (getAuthorizedAttemptId() != null) {
      joiner.add(String.format("%sauthorized_attempt_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAuthorizedAttemptId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector_capture_id` to the URL query string
    if (getConnectorCaptureId() != null) {
      joiner.add(String.format("%sconnector_capture_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnectorCaptureId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `capture_sequence` to the URL query string
    if (getCaptureSequence() != null) {
      joiner.add(String.format("%scapture_sequence%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCaptureSequence()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `error_message` to the URL query string
    if (getErrorMessage() != null) {
      joiner.add(String.format("%serror_message%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getErrorMessage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `error_code` to the URL query string
    if (getErrorCode() != null) {
      joiner.add(String.format("%serror_code%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getErrorCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `error_reason` to the URL query string
    if (getErrorReason() != null) {
      joiner.add(String.format("%serror_reason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getErrorReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `reference_id` to the URL query string
    if (getReferenceId() != null) {
      joiner.add(String.format("%sreference_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReferenceId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


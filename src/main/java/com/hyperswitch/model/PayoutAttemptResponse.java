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
import com.hyperswitch.model.Currency;
import com.hyperswitch.model.PaymentMethodType;
import com.hyperswitch.model.PayoutStatus;
import com.hyperswitch.model.PayoutType;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.hyperswitch.client.ApiClient;
/**
 * PayoutAttemptResponse
 */
@JsonPropertyOrder({
  PayoutAttemptResponse.JSON_PROPERTY_ATTEMPT_ID,
  PayoutAttemptResponse.JSON_PROPERTY_STATUS,
  PayoutAttemptResponse.JSON_PROPERTY_AMOUNT,
  PayoutAttemptResponse.JSON_PROPERTY_CURRENCY,
  PayoutAttemptResponse.JSON_PROPERTY_CONNECTOR,
  PayoutAttemptResponse.JSON_PROPERTY_ERROR_CODE,
  PayoutAttemptResponse.JSON_PROPERTY_ERROR_MESSAGE,
  PayoutAttemptResponse.JSON_PROPERTY_PAYMENT_METHOD,
  PayoutAttemptResponse.JSON_PROPERTY_PAYOUT_METHOD_TYPE,
  PayoutAttemptResponse.JSON_PROPERTY_CONNECTOR_TRANSACTION_ID,
  PayoutAttemptResponse.JSON_PROPERTY_CANCELLATION_REASON,
  PayoutAttemptResponse.JSON_PROPERTY_UNIFIED_CODE,
  PayoutAttemptResponse.JSON_PROPERTY_UNIFIED_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class PayoutAttemptResponse {
  public static final String JSON_PROPERTY_ATTEMPT_ID = "attempt_id";
  @javax.annotation.Nonnull
  private String attemptId;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private PayoutStatus status;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nonnull
  private Long amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<Currency> currency = JsonNullable.<Currency>undefined();

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private JsonNullable<String> connector = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
  private JsonNullable<String> errorCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  private JsonNullable<PayoutType> paymentMethod = JsonNullable.<PayoutType>undefined();

  public static final String JSON_PROPERTY_PAYOUT_METHOD_TYPE = "payout_method_type";
  private JsonNullable<PaymentMethodType> payoutMethodType = JsonNullable.<PaymentMethodType>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_TRANSACTION_ID = "connector_transaction_id";
  private JsonNullable<String> connectorTransactionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CANCELLATION_REASON = "cancellation_reason";
  private JsonNullable<String> cancellationReason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNIFIED_CODE = "unified_code";
  private JsonNullable<String> unifiedCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNIFIED_MESSAGE = "unified_message";
  private JsonNullable<String> unifiedMessage = JsonNullable.<String>undefined();

  public PayoutAttemptResponse() { 
  }

  public PayoutAttemptResponse attemptId(@javax.annotation.Nonnull String attemptId) {
    this.attemptId = attemptId;
    return this;
  }

  /**
   * Unique identifier for the attempt
   * @return attemptId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAttemptId() {
    return attemptId;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttemptId(@javax.annotation.Nonnull String attemptId) {
    this.attemptId = attemptId;
  }


  public PayoutAttemptResponse status(@javax.annotation.Nonnull PayoutStatus status) {
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
  public PayoutStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull PayoutStatus status) {
    this.status = status;
  }


  public PayoutAttemptResponse amount(@javax.annotation.Nonnull Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The payout attempt amount. Amount for the payout in lowest denomination of the currency. (i.e) in cents for USD denomination, in paisa for INR denomination etc.,
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


  public PayoutAttemptResponse currency(@javax.annotation.Nullable Currency currency) {
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


  public PayoutAttemptResponse connector(@javax.annotation.Nullable String connector) {
    this.connector = JsonNullable.<String>of(connector);
    return this;
  }

  /**
   * The connector used for the payout
   * @return connector
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getConnector() {
        return connector.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnector_JsonNullable() {
    return connector;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  public void setConnector_JsonNullable(JsonNullable<String> connector) {
    this.connector = connector;
  }

  public void setConnector(@javax.annotation.Nullable String connector) {
    this.connector = JsonNullable.<String>of(connector);
  }


  public PayoutAttemptResponse errorCode(@javax.annotation.Nullable String errorCode) {
    this.errorCode = JsonNullable.<String>of(errorCode);
    return this;
  }

  /**
   * Connector&#39;s error code in case of failures
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


  public PayoutAttemptResponse errorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = JsonNullable.<String>of(errorMessage);
    return this;
  }

  /**
   * Connector&#39;s error message in case of failures
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


  public PayoutAttemptResponse paymentMethod(@javax.annotation.Nullable PayoutType paymentMethod) {
    this.paymentMethod = JsonNullable.<PayoutType>of(paymentMethod);
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public PayoutType getPaymentMethod() {
        return paymentMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PayoutType> getPaymentMethod_JsonNullable() {
    return paymentMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  public void setPaymentMethod_JsonNullable(JsonNullable<PayoutType> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void setPaymentMethod(@javax.annotation.Nullable PayoutType paymentMethod) {
    this.paymentMethod = JsonNullable.<PayoutType>of(paymentMethod);
  }


  public PayoutAttemptResponse payoutMethodType(@javax.annotation.Nullable PaymentMethodType payoutMethodType) {
    this.payoutMethodType = JsonNullable.<PaymentMethodType>of(payoutMethodType);
    return this;
  }

  /**
   * Get payoutMethodType
   * @return payoutMethodType
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public PaymentMethodType getPayoutMethodType() {
        return payoutMethodType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYOUT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PaymentMethodType> getPayoutMethodType_JsonNullable() {
    return payoutMethodType;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYOUT_METHOD_TYPE)
  public void setPayoutMethodType_JsonNullable(JsonNullable<PaymentMethodType> payoutMethodType) {
    this.payoutMethodType = payoutMethodType;
  }

  public void setPayoutMethodType(@javax.annotation.Nullable PaymentMethodType payoutMethodType) {
    this.payoutMethodType = JsonNullable.<PaymentMethodType>of(payoutMethodType);
  }


  public PayoutAttemptResponse connectorTransactionId(@javax.annotation.Nullable String connectorTransactionId) {
    this.connectorTransactionId = JsonNullable.<String>of(connectorTransactionId);
    return this;
  }

  /**
   * A unique identifier for a payout provided by the connector
   * @return connectorTransactionId
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getConnectorTransactionId() {
        return connectorTransactionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorTransactionId_JsonNullable() {
    return connectorTransactionId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_TRANSACTION_ID)
  public void setConnectorTransactionId_JsonNullable(JsonNullable<String> connectorTransactionId) {
    this.connectorTransactionId = connectorTransactionId;
  }

  public void setConnectorTransactionId(@javax.annotation.Nullable String connectorTransactionId) {
    this.connectorTransactionId = JsonNullable.<String>of(connectorTransactionId);
  }


  public PayoutAttemptResponse cancellationReason(@javax.annotation.Nullable String cancellationReason) {
    this.cancellationReason = JsonNullable.<String>of(cancellationReason);
    return this;
  }

  /**
   * If the payout was cancelled the reason provided here
   * @return cancellationReason
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getCancellationReason() {
        return cancellationReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CANCELLATION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCancellationReason_JsonNullable() {
    return cancellationReason;
  }
  
  @JsonProperty(JSON_PROPERTY_CANCELLATION_REASON)
  public void setCancellationReason_JsonNullable(JsonNullable<String> cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public void setCancellationReason(@javax.annotation.Nullable String cancellationReason) {
    this.cancellationReason = JsonNullable.<String>of(cancellationReason);
  }


  public PayoutAttemptResponse unifiedCode(@javax.annotation.Nullable String unifiedCode) {
    this.unifiedCode = JsonNullable.<String>of(unifiedCode);
    return this;
  }

  /**
   * (This field is not live yet) Error code unified across the connectors is received here in case of errors while calling the underlying connector
   * @return unifiedCode
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getUnifiedCode() {
        return unifiedCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIFIED_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUnifiedCode_JsonNullable() {
    return unifiedCode;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIFIED_CODE)
  public void setUnifiedCode_JsonNullable(JsonNullable<String> unifiedCode) {
    this.unifiedCode = unifiedCode;
  }

  public void setUnifiedCode(@javax.annotation.Nullable String unifiedCode) {
    this.unifiedCode = JsonNullable.<String>of(unifiedCode);
  }


  public PayoutAttemptResponse unifiedMessage(@javax.annotation.Nullable String unifiedMessage) {
    this.unifiedMessage = JsonNullable.<String>of(unifiedMessage);
    return this;
  }

  /**
   * (This field is not live yet) Error message unified across the connectors is received here in case of errors while calling the underlying connector
   * @return unifiedMessage
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getUnifiedMessage() {
        return unifiedMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIFIED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUnifiedMessage_JsonNullable() {
    return unifiedMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIFIED_MESSAGE)
  public void setUnifiedMessage_JsonNullable(JsonNullable<String> unifiedMessage) {
    this.unifiedMessage = unifiedMessage;
  }

  public void setUnifiedMessage(@javax.annotation.Nullable String unifiedMessage) {
    this.unifiedMessage = JsonNullable.<String>of(unifiedMessage);
  }


  /**
   * Return true if this PayoutAttemptResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutAttemptResponse payoutAttemptResponse = (PayoutAttemptResponse) o;
    return Objects.equals(this.attemptId, payoutAttemptResponse.attemptId) &&
        Objects.equals(this.status, payoutAttemptResponse.status) &&
        Objects.equals(this.amount, payoutAttemptResponse.amount) &&
        equalsNullable(this.currency, payoutAttemptResponse.currency) &&
        equalsNullable(this.connector, payoutAttemptResponse.connector) &&
        equalsNullable(this.errorCode, payoutAttemptResponse.errorCode) &&
        equalsNullable(this.errorMessage, payoutAttemptResponse.errorMessage) &&
        equalsNullable(this.paymentMethod, payoutAttemptResponse.paymentMethod) &&
        equalsNullable(this.payoutMethodType, payoutAttemptResponse.payoutMethodType) &&
        equalsNullable(this.connectorTransactionId, payoutAttemptResponse.connectorTransactionId) &&
        equalsNullable(this.cancellationReason, payoutAttemptResponse.cancellationReason) &&
        equalsNullable(this.unifiedCode, payoutAttemptResponse.unifiedCode) &&
        equalsNullable(this.unifiedMessage, payoutAttemptResponse.unifiedMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptId, status, amount, hashCodeNullable(currency), hashCodeNullable(connector), hashCodeNullable(errorCode), hashCodeNullable(errorMessage), hashCodeNullable(paymentMethod), hashCodeNullable(payoutMethodType), hashCodeNullable(connectorTransactionId), hashCodeNullable(cancellationReason), hashCodeNullable(unifiedCode), hashCodeNullable(unifiedMessage));
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
    sb.append("class PayoutAttemptResponse {\n");
    sb.append("    attemptId: ").append(toIndentedString(attemptId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    payoutMethodType: ").append(toIndentedString(payoutMethodType)).append("\n");
    sb.append("    connectorTransactionId: ").append(toIndentedString(connectorTransactionId)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    unifiedCode: ").append(toIndentedString(unifiedCode)).append("\n");
    sb.append("    unifiedMessage: ").append(toIndentedString(unifiedMessage)).append("\n");
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

    // add `attempt_id` to the URL query string
    if (getAttemptId() != null) {
      joiner.add(String.format("%sattempt_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAttemptId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `error_code` to the URL query string
    if (getErrorCode() != null) {
      joiner.add(String.format("%serror_code%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getErrorCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `error_message` to the URL query string
    if (getErrorMessage() != null) {
      joiner.add(String.format("%serror_message%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getErrorMessage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `payment_method` to the URL query string
    if (getPaymentMethod() != null) {
      joiner.add(String.format("%spayment_method%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPaymentMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `payout_method_type` to the URL query string
    if (getPayoutMethodType() != null) {
      joiner.add(String.format("%spayout_method_type%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPayoutMethodType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector_transaction_id` to the URL query string
    if (getConnectorTransactionId() != null) {
      joiner.add(String.format("%sconnector_transaction_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnectorTransactionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cancellation_reason` to the URL query string
    if (getCancellationReason() != null) {
      joiner.add(String.format("%scancellation_reason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCancellationReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `unified_code` to the URL query string
    if (getUnifiedCode() != null) {
      joiner.add(String.format("%sunified_code%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUnifiedCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `unified_message` to the URL query string
    if (getUnifiedMessage() != null) {
      joiner.add(String.format("%sunified_message%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUnifiedMessage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


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
import com.lumeweb.hyperswitch.model.BrowserInformation;
import com.lumeweb.hyperswitch.model.ConfirmIntentAmountDetailsResponse;
import com.lumeweb.hyperswitch.model.ErrorDetails;
import com.lumeweb.hyperswitch.model.IntentStatus;
import com.lumeweb.hyperswitch.model.NextActionData;
import com.lumeweb.hyperswitch.model.PaymentMethod;
import com.lumeweb.hyperswitch.model.PaymentMethodDataResponseWithBilling;
import com.lumeweb.hyperswitch.model.PaymentMethodType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * Response for Payment Intent Confirm
 */
@JsonPropertyOrder({
  PaymentsConfirmIntentResponse.JSON_PROPERTY_ID,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_STATUS,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_AMOUNT,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_CONNECTOR,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_CLIENT_SECRET,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_CREATED,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_PAYMENT_METHOD_DATA,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_PAYMENT_METHOD_SUBTYPE,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_NEXT_ACTION,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_CONNECTOR_TRANSACTION_ID,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_CONNECTOR_REFERENCE_ID,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_MERCHANT_CONNECTOR_ID,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_BROWSER_INFO,
  PaymentsConfirmIntentResponse.JSON_PROPERTY_ERROR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class PaymentsConfirmIntentResponse {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nonnull
  private String id;

  public static final String JSON_PROPERTY_STATUS = "status";
  @javax.annotation.Nonnull
  private IntentStatus status;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nonnull
  private ConfirmIntentAmountDetailsResponse amount;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  @javax.annotation.Nonnull
  private String connector;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  @javax.annotation.Nonnull
  private String clientSecret;

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nonnull
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_DATA = "payment_method_data";
  private JsonNullable<PaymentMethodDataResponseWithBilling> paymentMethodData = JsonNullable.<PaymentMethodDataResponseWithBilling>undefined();

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "payment_method_type";
  @javax.annotation.Nonnull
  private PaymentMethod paymentMethodType;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_SUBTYPE = "payment_method_subtype";
  @javax.annotation.Nonnull
  private PaymentMethodType paymentMethodSubtype;

  public static final String JSON_PROPERTY_NEXT_ACTION = "next_action";
  private JsonNullable<NextActionData> nextAction = JsonNullable.<NextActionData>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_TRANSACTION_ID = "connector_transaction_id";
  private JsonNullable<String> connectorTransactionId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CONNECTOR_REFERENCE_ID = "connector_reference_id";
  private JsonNullable<String> connectorReferenceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_CONNECTOR_ID = "merchant_connector_id";
  @javax.annotation.Nonnull
  private String merchantConnectorId;

  public static final String JSON_PROPERTY_BROWSER_INFO = "browser_info";
  private JsonNullable<BrowserInformation> browserInfo = JsonNullable.<BrowserInformation>undefined();

  public static final String JSON_PROPERTY_ERROR = "error";
  private JsonNullable<ErrorDetails> error = JsonNullable.<ErrorDetails>undefined();

  public PaymentsConfirmIntentResponse() { 
  }

  public PaymentsConfirmIntentResponse id(@javax.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the payment. This ensures idempotency for multiple payments that have been done by a single merchant.
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


  public PaymentsConfirmIntentResponse status(@javax.annotation.Nonnull IntentStatus status) {
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
  public IntentStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(@javax.annotation.Nonnull IntentStatus status) {
    this.status = status;
  }


  public PaymentsConfirmIntentResponse amount(@javax.annotation.Nonnull ConfirmIntentAmountDetailsResponse amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ConfirmIntentAmountDetailsResponse getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(@javax.annotation.Nonnull ConfirmIntentAmountDetailsResponse amount) {
    this.amount = amount;
  }


  public PaymentsConfirmIntentResponse connector(@javax.annotation.Nonnull String connector) {
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


  public PaymentsConfirmIntentResponse clientSecret(@javax.annotation.Nonnull String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * It&#39;s a token used for client side verification.
   * @return clientSecret
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientSecret() {
    return clientSecret;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientSecret(@javax.annotation.Nonnull String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public PaymentsConfirmIntentResponse created(@javax.annotation.Nonnull OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Time when the payment was created
   * @return created
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(@javax.annotation.Nonnull OffsetDateTime created) {
    this.created = created;
  }


  public PaymentsConfirmIntentResponse paymentMethodData(@javax.annotation.Nullable PaymentMethodDataResponseWithBilling paymentMethodData) {
    this.paymentMethodData = JsonNullable.<PaymentMethodDataResponseWithBilling>of(paymentMethodData);
    return this;
  }

  /**
   * Get paymentMethodData
   * @return paymentMethodData
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public PaymentMethodDataResponseWithBilling getPaymentMethodData() {
        return paymentMethodData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PaymentMethodDataResponseWithBilling> getPaymentMethodData_JsonNullable() {
    return paymentMethodData;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_DATA)
  public void setPaymentMethodData_JsonNullable(JsonNullable<PaymentMethodDataResponseWithBilling> paymentMethodData) {
    this.paymentMethodData = paymentMethodData;
  }

  public void setPaymentMethodData(@javax.annotation.Nullable PaymentMethodDataResponseWithBilling paymentMethodData) {
    this.paymentMethodData = JsonNullable.<PaymentMethodDataResponseWithBilling>of(paymentMethodData);
  }


  public PaymentsConfirmIntentResponse paymentMethodType(@javax.annotation.Nonnull PaymentMethod paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  /**
   * Get paymentMethodType
   * @return paymentMethodType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PaymentMethod getPaymentMethodType() {
    return paymentMethodType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethodType(@javax.annotation.Nonnull PaymentMethod paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }


  public PaymentsConfirmIntentResponse paymentMethodSubtype(@javax.annotation.Nonnull PaymentMethodType paymentMethodSubtype) {
    this.paymentMethodSubtype = paymentMethodSubtype;
    return this;
  }

  /**
   * Get paymentMethodSubtype
   * @return paymentMethodSubtype
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PaymentMethodType getPaymentMethodSubtype() {
    return paymentMethodSubtype;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethodSubtype(@javax.annotation.Nonnull PaymentMethodType paymentMethodSubtype) {
    this.paymentMethodSubtype = paymentMethodSubtype;
  }


  public PaymentsConfirmIntentResponse nextAction(@javax.annotation.Nullable NextActionData nextAction) {
    this.nextAction = JsonNullable.<NextActionData>of(nextAction);
    return this;
  }

  /**
   * Get nextAction
   * @return nextAction
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public NextActionData getNextAction() {
        return nextAction.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NextActionData> getNextAction_JsonNullable() {
    return nextAction;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_ACTION)
  public void setNextAction_JsonNullable(JsonNullable<NextActionData> nextAction) {
    this.nextAction = nextAction;
  }

  public void setNextAction(@javax.annotation.Nullable NextActionData nextAction) {
    this.nextAction = JsonNullable.<NextActionData>of(nextAction);
  }


  public PaymentsConfirmIntentResponse connectorTransactionId(@javax.annotation.Nullable String connectorTransactionId) {
    this.connectorTransactionId = JsonNullable.<String>of(connectorTransactionId);
    return this;
  }

  /**
   * A unique identifier for a payment provided by the connector
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


  public PaymentsConfirmIntentResponse connectorReferenceId(@javax.annotation.Nullable String connectorReferenceId) {
    this.connectorReferenceId = JsonNullable.<String>of(connectorReferenceId);
    return this;
  }

  /**
   * reference(Identifier) to the payment at connector side
   * @return connectorReferenceId
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getConnectorReferenceId() {
        return connectorReferenceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorReferenceId_JsonNullable() {
    return connectorReferenceId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_REFERENCE_ID)
  public void setConnectorReferenceId_JsonNullable(JsonNullable<String> connectorReferenceId) {
    this.connectorReferenceId = connectorReferenceId;
  }

  public void setConnectorReferenceId(@javax.annotation.Nullable String connectorReferenceId) {
    this.connectorReferenceId = JsonNullable.<String>of(connectorReferenceId);
  }


  public PaymentsConfirmIntentResponse merchantConnectorId(@javax.annotation.Nonnull String merchantConnectorId) {
    this.merchantConnectorId = merchantConnectorId;
    return this;
  }

  /**
   * Identifier of the connector ( merchant connector account ) which was chosen to make the payment
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


  public PaymentsConfirmIntentResponse browserInfo(@javax.annotation.Nullable BrowserInformation browserInfo) {
    this.browserInfo = JsonNullable.<BrowserInformation>of(browserInfo);
    return this;
  }

  /**
   * Get browserInfo
   * @return browserInfo
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public BrowserInformation getBrowserInfo() {
        return browserInfo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BROWSER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BrowserInformation> getBrowserInfo_JsonNullable() {
    return browserInfo;
  }
  
  @JsonProperty(JSON_PROPERTY_BROWSER_INFO)
  public void setBrowserInfo_JsonNullable(JsonNullable<BrowserInformation> browserInfo) {
    this.browserInfo = browserInfo;
  }

  public void setBrowserInfo(@javax.annotation.Nullable BrowserInformation browserInfo) {
    this.browserInfo = JsonNullable.<BrowserInformation>of(browserInfo);
  }


  public PaymentsConfirmIntentResponse error(@javax.annotation.Nullable ErrorDetails error) {
    this.error = JsonNullable.<ErrorDetails>of(error);
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public ErrorDetails getError() {
        return error.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ErrorDetails> getError_JsonNullable() {
    return error;
  }
  
  @JsonProperty(JSON_PROPERTY_ERROR)
  public void setError_JsonNullable(JsonNullable<ErrorDetails> error) {
    this.error = error;
  }

  public void setError(@javax.annotation.Nullable ErrorDetails error) {
    this.error = JsonNullable.<ErrorDetails>of(error);
  }


  /**
   * Return true if this PaymentsConfirmIntentResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsConfirmIntentResponse paymentsConfirmIntentResponse = (PaymentsConfirmIntentResponse) o;
    return Objects.equals(this.id, paymentsConfirmIntentResponse.id) &&
        Objects.equals(this.status, paymentsConfirmIntentResponse.status) &&
        Objects.equals(this.amount, paymentsConfirmIntentResponse.amount) &&
        Objects.equals(this.connector, paymentsConfirmIntentResponse.connector) &&
        Objects.equals(this.clientSecret, paymentsConfirmIntentResponse.clientSecret) &&
        Objects.equals(this.created, paymentsConfirmIntentResponse.created) &&
        equalsNullable(this.paymentMethodData, paymentsConfirmIntentResponse.paymentMethodData) &&
        Objects.equals(this.paymentMethodType, paymentsConfirmIntentResponse.paymentMethodType) &&
        Objects.equals(this.paymentMethodSubtype, paymentsConfirmIntentResponse.paymentMethodSubtype) &&
        equalsNullable(this.nextAction, paymentsConfirmIntentResponse.nextAction) &&
        equalsNullable(this.connectorTransactionId, paymentsConfirmIntentResponse.connectorTransactionId) &&
        equalsNullable(this.connectorReferenceId, paymentsConfirmIntentResponse.connectorReferenceId) &&
        Objects.equals(this.merchantConnectorId, paymentsConfirmIntentResponse.merchantConnectorId) &&
        equalsNullable(this.browserInfo, paymentsConfirmIntentResponse.browserInfo) &&
        equalsNullable(this.error, paymentsConfirmIntentResponse.error);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, amount, connector, clientSecret, created, hashCodeNullable(paymentMethodData), paymentMethodType, paymentMethodSubtype, hashCodeNullable(nextAction), hashCodeNullable(connectorTransactionId), hashCodeNullable(connectorReferenceId), merchantConnectorId, hashCodeNullable(browserInfo), hashCodeNullable(error));
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
    sb.append("class PaymentsConfirmIntentResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    paymentMethodData: ").append(toIndentedString(paymentMethodData)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    paymentMethodSubtype: ").append(toIndentedString(paymentMethodSubtype)).append("\n");
    sb.append("    nextAction: ").append(toIndentedString(nextAction)).append("\n");
    sb.append("    connectorTransactionId: ").append(toIndentedString(connectorTransactionId)).append("\n");
    sb.append("    connectorReferenceId: ").append(toIndentedString(connectorReferenceId)).append("\n");
    sb.append("    merchantConnectorId: ").append(toIndentedString(merchantConnectorId)).append("\n");
    sb.append("    browserInfo: ").append(toIndentedString(browserInfo)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(getAmount().toUrlQueryString(prefix + "amount" + suffix));
    }

    // add `connector` to the URL query string
    if (getConnector() != null) {
      joiner.add(String.format("%sconnector%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnector()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `client_secret` to the URL query string
    if (getClientSecret() != null) {
      joiner.add(String.format("%sclient_secret%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getClientSecret()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `payment_method_data` to the URL query string
    if (getPaymentMethodData() != null) {
      joiner.add(getPaymentMethodData().toUrlQueryString(prefix + "payment_method_data" + suffix));
    }

    // add `payment_method_type` to the URL query string
    if (getPaymentMethodType() != null) {
      joiner.add(String.format("%spayment_method_type%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPaymentMethodType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `payment_method_subtype` to the URL query string
    if (getPaymentMethodSubtype() != null) {
      joiner.add(String.format("%spayment_method_subtype%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPaymentMethodSubtype()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `next_action` to the URL query string
    if (getNextAction() != null) {
      joiner.add(getNextAction().toUrlQueryString(prefix + "next_action" + suffix));
    }

    // add `connector_transaction_id` to the URL query string
    if (getConnectorTransactionId() != null) {
      joiner.add(String.format("%sconnector_transaction_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnectorTransactionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `connector_reference_id` to the URL query string
    if (getConnectorReferenceId() != null) {
      joiner.add(String.format("%sconnector_reference_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnectorReferenceId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `merchant_connector_id` to the URL query string
    if (getMerchantConnectorId() != null) {
      joiner.add(String.format("%smerchant_connector_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMerchantConnectorId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `browser_info` to the URL query string
    if (getBrowserInfo() != null) {
      joiner.add(getBrowserInfo().toUrlQueryString(prefix + "browser_info" + suffix));
    }

    // add `error` to the URL query string
    if (getError() != null) {
      joiner.add(getError().toUrlQueryString(prefix + "error" + suffix));
    }

    return joiner.toString();
  }
}


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
import com.lumeweb.hyperswitch.model.AmountFilter;
import com.lumeweb.hyperswitch.model.Currency;
import com.lumeweb.hyperswitch.model.RefundStatus;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * RefundListRequest
 */
@JsonPropertyOrder({
  RefundListRequest.JSON_PROPERTY_START_TIME,
  RefundListRequest.JSON_PROPERTY_END_TIME,
  RefundListRequest.JSON_PROPERTY_PAYMENT_ID,
  RefundListRequest.JSON_PROPERTY_REFUND_ID,
  RefundListRequest.JSON_PROPERTY_PROFILE_ID,
  RefundListRequest.JSON_PROPERTY_LIMIT,
  RefundListRequest.JSON_PROPERTY_OFFSET,
  RefundListRequest.JSON_PROPERTY_AMOUNT_FILTER,
  RefundListRequest.JSON_PROPERTY_CONNECTOR,
  RefundListRequest.JSON_PROPERTY_MERCHANT_CONNECTOR_ID,
  RefundListRequest.JSON_PROPERTY_CURRENCY,
  RefundListRequest.JSON_PROPERTY_REFUND_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class RefundListRequest {
  public static final String JSON_PROPERTY_START_TIME = "start_time";
  @javax.annotation.Nonnull
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private JsonNullable<OffsetDateTime> endTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_PAYMENT_ID = "payment_id";
  private JsonNullable<String> paymentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REFUND_ID = "refund_id";
  private JsonNullable<String> refundId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROFILE_ID = "profile_id";
  private JsonNullable<String> profileId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private JsonNullable<Long> limit = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private JsonNullable<Long> offset = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_AMOUNT_FILTER = "amount_filter";
  private JsonNullable<AmountFilter> amountFilter = JsonNullable.<AmountFilter>undefined();

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private JsonNullable<List<String>> connector = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_MERCHANT_CONNECTOR_ID = "merchant_connector_id";
  private JsonNullable<List<String>> merchantConnectorId = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<List<Currency>> currency = JsonNullable.<List<Currency>>undefined();

  public static final String JSON_PROPERTY_REFUND_STATUS = "refund_status";
  private JsonNullable<List<RefundStatus>> refundStatus = JsonNullable.<List<RefundStatus>>undefined();

  public RefundListRequest() { 
  }

  public RefundListRequest startTime(@javax.annotation.Nonnull OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The start time to filter payments list or to get list of filters. To get list of filters start time is needed to be passed
   * @return startTime
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartTime(@javax.annotation.Nonnull OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public RefundListRequest endTime(@javax.annotation.Nullable OffsetDateTime endTime) {
    this.endTime = JsonNullable.<OffsetDateTime>of(endTime);
    return this;
  }

  /**
   * The end time to filter payments list or to get list of filters. If not passed the default time is now
   * @return endTime
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getEndTime() {
        return endTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getEndTime_JsonNullable() {
    return endTime;
  }
  
  @JsonProperty(JSON_PROPERTY_END_TIME)
  public void setEndTime_JsonNullable(JsonNullable<OffsetDateTime> endTime) {
    this.endTime = endTime;
  }

  public void setEndTime(@javax.annotation.Nullable OffsetDateTime endTime) {
    this.endTime = JsonNullable.<OffsetDateTime>of(endTime);
  }


  public RefundListRequest paymentId(@javax.annotation.Nullable String paymentId) {
    this.paymentId = JsonNullable.<String>of(paymentId);
    return this;
  }

  /**
   * The identifier for the payment
   * @return paymentId
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getPaymentId() {
        return paymentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPaymentId_JsonNullable() {
    return paymentId;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  public void setPaymentId_JsonNullable(JsonNullable<String> paymentId) {
    this.paymentId = paymentId;
  }

  public void setPaymentId(@javax.annotation.Nullable String paymentId) {
    this.paymentId = JsonNullable.<String>of(paymentId);
  }


  public RefundListRequest refundId(@javax.annotation.Nullable String refundId) {
    this.refundId = JsonNullable.<String>of(refundId);
    return this;
  }

  /**
   * The identifier for the refund
   * @return refundId
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getRefundId() {
        return refundId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRefundId_JsonNullable() {
    return refundId;
  }
  
  @JsonProperty(JSON_PROPERTY_REFUND_ID)
  public void setRefundId_JsonNullable(JsonNullable<String> refundId) {
    this.refundId = refundId;
  }

  public void setRefundId(@javax.annotation.Nullable String refundId) {
    this.refundId = JsonNullable.<String>of(refundId);
  }


  public RefundListRequest profileId(@javax.annotation.Nullable String profileId) {
    this.profileId = JsonNullable.<String>of(profileId);
    return this;
  }

  /**
   * The identifier for business profile
   * @return profileId
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getProfileId() {
        return profileId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProfileId_JsonNullable() {
    return profileId;
  }
  
  @JsonProperty(JSON_PROPERTY_PROFILE_ID)
  public void setProfileId_JsonNullable(JsonNullable<String> profileId) {
    this.profileId = profileId;
  }

  public void setProfileId(@javax.annotation.Nullable String profileId) {
    this.profileId = JsonNullable.<String>of(profileId);
  }


  public RefundListRequest limit(@javax.annotation.Nullable Long limit) {
    this.limit = JsonNullable.<Long>of(limit);
    return this;
  }

  /**
   * Limit on the number of objects to return
   * @return limit
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Long getLimit() {
        return limit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getLimit_JsonNullable() {
    return limit;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMIT)
  public void setLimit_JsonNullable(JsonNullable<Long> limit) {
    this.limit = limit;
  }

  public void setLimit(@javax.annotation.Nullable Long limit) {
    this.limit = JsonNullable.<Long>of(limit);
  }


  public RefundListRequest offset(@javax.annotation.Nullable Long offset) {
    this.offset = JsonNullable.<Long>of(offset);
    return this;
  }

  /**
   * The starting point within a list of objects
   * @return offset
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Long getOffset() {
        return offset.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getOffset_JsonNullable() {
    return offset;
  }
  
  @JsonProperty(JSON_PROPERTY_OFFSET)
  public void setOffset_JsonNullable(JsonNullable<Long> offset) {
    this.offset = offset;
  }

  public void setOffset(@javax.annotation.Nullable Long offset) {
    this.offset = JsonNullable.<Long>of(offset);
  }


  public RefundListRequest amountFilter(@javax.annotation.Nullable AmountFilter amountFilter) {
    this.amountFilter = JsonNullable.<AmountFilter>of(amountFilter);
    return this;
  }

  /**
   * Get amountFilter
   * @return amountFilter
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public AmountFilter getAmountFilter() {
        return amountFilter.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AmountFilter> getAmountFilter_JsonNullable() {
    return amountFilter;
  }
  
  @JsonProperty(JSON_PROPERTY_AMOUNT_FILTER)
  public void setAmountFilter_JsonNullable(JsonNullable<AmountFilter> amountFilter) {
    this.amountFilter = amountFilter;
  }

  public void setAmountFilter(@javax.annotation.Nullable AmountFilter amountFilter) {
    this.amountFilter = JsonNullable.<AmountFilter>of(amountFilter);
  }


  public RefundListRequest connector(@javax.annotation.Nullable List<String> connector) {
    this.connector = JsonNullable.<List<String>>of(connector);
    return this;
  }

  public RefundListRequest addConnectorItem(String connectorItem) {
    if (this.connector == null || !this.connector.isPresent()) {
      this.connector = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.connector.get().add(connectorItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of connectors to filter refunds list
   * @return connector
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<String> getConnector() {
        return connector.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getConnector_JsonNullable() {
    return connector;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  public void setConnector_JsonNullable(JsonNullable<List<String>> connector) {
    this.connector = connector;
  }

  public void setConnector(@javax.annotation.Nullable List<String> connector) {
    this.connector = JsonNullable.<List<String>>of(connector);
  }


  public RefundListRequest merchantConnectorId(@javax.annotation.Nullable List<String> merchantConnectorId) {
    this.merchantConnectorId = JsonNullable.<List<String>>of(merchantConnectorId);
    return this;
  }

  public RefundListRequest addMerchantConnectorIdItem(String merchantConnectorIdItem) {
    if (this.merchantConnectorId == null || !this.merchantConnectorId.isPresent()) {
      this.merchantConnectorId = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.merchantConnectorId.get().add(merchantConnectorIdItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of merchant connector ids to filter the refunds list for selected label
   * @return merchantConnectorId
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<String> getMerchantConnectorId() {
        return merchantConnectorId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getMerchantConnectorId_JsonNullable() {
    return merchantConnectorId;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_CONNECTOR_ID)
  public void setMerchantConnectorId_JsonNullable(JsonNullable<List<String>> merchantConnectorId) {
    this.merchantConnectorId = merchantConnectorId;
  }

  public void setMerchantConnectorId(@javax.annotation.Nullable List<String> merchantConnectorId) {
    this.merchantConnectorId = JsonNullable.<List<String>>of(merchantConnectorId);
  }


  public RefundListRequest currency(@javax.annotation.Nullable List<Currency> currency) {
    this.currency = JsonNullable.<List<Currency>>of(currency);
    return this;
  }

  public RefundListRequest addCurrencyItem(Currency currencyItem) {
    if (this.currency == null || !this.currency.isPresent()) {
      this.currency = JsonNullable.<List<Currency>>of(new ArrayList<>());
    }
    try {
      this.currency.get().add(currencyItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of currencies to filter refunds list
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<Currency> getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<Currency>> getCurrency_JsonNullable() {
    return currency;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  public void setCurrency_JsonNullable(JsonNullable<List<Currency>> currency) {
    this.currency = currency;
  }

  public void setCurrency(@javax.annotation.Nullable List<Currency> currency) {
    this.currency = JsonNullable.<List<Currency>>of(currency);
  }


  public RefundListRequest refundStatus(@javax.annotation.Nullable List<RefundStatus> refundStatus) {
    this.refundStatus = JsonNullable.<List<RefundStatus>>of(refundStatus);
    return this;
  }

  public RefundListRequest addRefundStatusItem(RefundStatus refundStatusItem) {
    if (this.refundStatus == null || !this.refundStatus.isPresent()) {
      this.refundStatus = JsonNullable.<List<RefundStatus>>of(new ArrayList<>());
    }
    try {
      this.refundStatus.get().add(refundStatusItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The list of refund statuses to filter refunds list
   * @return refundStatus
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<RefundStatus> getRefundStatus() {
        return refundStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFUND_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<RefundStatus>> getRefundStatus_JsonNullable() {
    return refundStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_REFUND_STATUS)
  public void setRefundStatus_JsonNullable(JsonNullable<List<RefundStatus>> refundStatus) {
    this.refundStatus = refundStatus;
  }

  public void setRefundStatus(@javax.annotation.Nullable List<RefundStatus> refundStatus) {
    this.refundStatus = JsonNullable.<List<RefundStatus>>of(refundStatus);
  }


  /**
   * Return true if this RefundListRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundListRequest refundListRequest = (RefundListRequest) o;
    return Objects.equals(this.startTime, refundListRequest.startTime) &&
        equalsNullable(this.endTime, refundListRequest.endTime) &&
        equalsNullable(this.paymentId, refundListRequest.paymentId) &&
        equalsNullable(this.refundId, refundListRequest.refundId) &&
        equalsNullable(this.profileId, refundListRequest.profileId) &&
        equalsNullable(this.limit, refundListRequest.limit) &&
        equalsNullable(this.offset, refundListRequest.offset) &&
        equalsNullable(this.amountFilter, refundListRequest.amountFilter) &&
        equalsNullable(this.connector, refundListRequest.connector) &&
        equalsNullable(this.merchantConnectorId, refundListRequest.merchantConnectorId) &&
        equalsNullable(this.currency, refundListRequest.currency) &&
        equalsNullable(this.refundStatus, refundListRequest.refundStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, hashCodeNullable(endTime), hashCodeNullable(paymentId), hashCodeNullable(refundId), hashCodeNullable(profileId), hashCodeNullable(limit), hashCodeNullable(offset), hashCodeNullable(amountFilter), hashCodeNullable(connector), hashCodeNullable(merchantConnectorId), hashCodeNullable(currency), hashCodeNullable(refundStatus));
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
    sb.append("class RefundListRequest {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    amountFilter: ").append(toIndentedString(amountFilter)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    merchantConnectorId: ").append(toIndentedString(merchantConnectorId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
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

    // add `start_time` to the URL query string
    if (getStartTime() != null) {
      joiner.add(String.format("%sstart_time%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `end_time` to the URL query string
    if (getEndTime() != null) {
      joiner.add(String.format("%send_time%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEndTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `payment_id` to the URL query string
    if (getPaymentId() != null) {
      joiner.add(String.format("%spayment_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPaymentId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `refund_id` to the URL query string
    if (getRefundId() != null) {
      joiner.add(String.format("%srefund_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRefundId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `profile_id` to the URL query string
    if (getProfileId() != null) {
      joiner.add(String.format("%sprofile_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getProfileId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `limit` to the URL query string
    if (getLimit() != null) {
      joiner.add(String.format("%slimit%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `offset` to the URL query string
    if (getOffset() != null) {
      joiner.add(String.format("%soffset%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOffset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount_filter` to the URL query string
    if (getAmountFilter() != null) {
      joiner.add(getAmountFilter().toUrlQueryString(prefix + "amount_filter" + suffix));
    }

    // add `connector` to the URL query string
    if (getConnector() != null) {
      for (int i = 0; i < getConnector().size(); i++) {
        joiner.add(String.format("%sconnector%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getConnector().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `merchant_connector_id` to the URL query string
    if (getMerchantConnectorId() != null) {
      for (int i = 0; i < getMerchantConnectorId().size(); i++) {
        joiner.add(String.format("%smerchant_connector_id%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getMerchantConnectorId().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      for (int i = 0; i < getCurrency().size(); i++) {
        if (getCurrency().get(i) != null) {
          joiner.add(String.format("%scurrency%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(ApiClient.valueToString(getCurrency().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    // add `refund_status` to the URL query string
    if (getRefundStatus() != null) {
      for (int i = 0; i < getRefundStatus().size(); i++) {
        if (getRefundStatus().get(i) != null) {
          joiner.add(String.format("%srefund_status%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(ApiClient.valueToString(getRefundStatus().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    return joiner.toString();
  }
}


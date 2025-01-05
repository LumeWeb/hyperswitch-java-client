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
import com.hyperswitch.model.AmountFilter;
import com.hyperswitch.model.Currency;
import com.hyperswitch.model.RefundStatus;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RefundListRequestAllOf
 */
@JsonPropertyOrder({
  RefundListRequestAllOf.JSON_PROPERTY_PAYMENT_ID,
  RefundListRequestAllOf.JSON_PROPERTY_REFUND_ID,
  RefundListRequestAllOf.JSON_PROPERTY_PROFILE_ID,
  RefundListRequestAllOf.JSON_PROPERTY_LIMIT,
  RefundListRequestAllOf.JSON_PROPERTY_OFFSET,
  RefundListRequestAllOf.JSON_PROPERTY_AMOUNT_FILTER,
  RefundListRequestAllOf.JSON_PROPERTY_CONNECTOR,
  RefundListRequestAllOf.JSON_PROPERTY_MERCHANT_CONNECTOR_ID,
  RefundListRequestAllOf.JSON_PROPERTY_CURRENCY,
  RefundListRequestAllOf.JSON_PROPERTY_REFUND_STATUS
})
@JsonTypeName("RefundListRequest_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RefundListRequestAllOf {
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

  public RefundListRequestAllOf() {
  }

  public RefundListRequestAllOf paymentId(String paymentId) {
    this.paymentId = JsonNullable.<String>of(paymentId);
    
    return this;
  }

   /**
   * The identifier for the payment
   * @return paymentId
  **/
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

  public void setPaymentId(String paymentId) {
    this.paymentId = JsonNullable.<String>of(paymentId);
  }


  public RefundListRequestAllOf refundId(String refundId) {
    this.refundId = JsonNullable.<String>of(refundId);
    
    return this;
  }

   /**
   * The identifier for the refund
   * @return refundId
  **/
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

  public void setRefundId(String refundId) {
    this.refundId = JsonNullable.<String>of(refundId);
  }


  public RefundListRequestAllOf profileId(String profileId) {
    this.profileId = JsonNullable.<String>of(profileId);
    
    return this;
  }

   /**
   * The identifier for business profile
   * @return profileId
  **/
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

  public void setProfileId(String profileId) {
    this.profileId = JsonNullable.<String>of(profileId);
  }


  public RefundListRequestAllOf limit(Long limit) {
    this.limit = JsonNullable.<Long>of(limit);
    
    return this;
  }

   /**
   * Limit on the number of objects to return
   * @return limit
  **/
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

  public void setLimit(Long limit) {
    this.limit = JsonNullable.<Long>of(limit);
  }


  public RefundListRequestAllOf offset(Long offset) {
    this.offset = JsonNullable.<Long>of(offset);
    
    return this;
  }

   /**
   * The starting point within a list of objects
   * @return offset
  **/
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

  public void setOffset(Long offset) {
    this.offset = JsonNullable.<Long>of(offset);
  }


  public RefundListRequestAllOf amountFilter(AmountFilter amountFilter) {
    this.amountFilter = JsonNullable.<AmountFilter>of(amountFilter);
    
    return this;
  }

   /**
   * Get amountFilter
   * @return amountFilter
  **/
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

  public void setAmountFilter(AmountFilter amountFilter) {
    this.amountFilter = JsonNullable.<AmountFilter>of(amountFilter);
  }


  public RefundListRequestAllOf connector(List<String> connector) {
    this.connector = JsonNullable.<List<String>>of(connector);
    
    return this;
  }

  public RefundListRequestAllOf addConnectorItem(String connectorItem) {
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
  **/
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

  public void setConnector(List<String> connector) {
    this.connector = JsonNullable.<List<String>>of(connector);
  }


  public RefundListRequestAllOf merchantConnectorId(List<String> merchantConnectorId) {
    this.merchantConnectorId = JsonNullable.<List<String>>of(merchantConnectorId);
    
    return this;
  }

  public RefundListRequestAllOf addMerchantConnectorIdItem(String merchantConnectorIdItem) {
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
  **/
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

  public void setMerchantConnectorId(List<String> merchantConnectorId) {
    this.merchantConnectorId = JsonNullable.<List<String>>of(merchantConnectorId);
  }


  public RefundListRequestAllOf currency(List<Currency> currency) {
    this.currency = JsonNullable.<List<Currency>>of(currency);
    
    return this;
  }

  public RefundListRequestAllOf addCurrencyItem(Currency currencyItem) {
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
  **/
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

  public void setCurrency(List<Currency> currency) {
    this.currency = JsonNullable.<List<Currency>>of(currency);
  }


  public RefundListRequestAllOf refundStatus(List<RefundStatus> refundStatus) {
    this.refundStatus = JsonNullable.<List<RefundStatus>>of(refundStatus);
    
    return this;
  }

  public RefundListRequestAllOf addRefundStatusItem(RefundStatus refundStatusItem) {
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
  **/
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

  public void setRefundStatus(List<RefundStatus> refundStatus) {
    this.refundStatus = JsonNullable.<List<RefundStatus>>of(refundStatus);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundListRequestAllOf refundListRequestAllOf = (RefundListRequestAllOf) o;
    return equalsNullable(this.paymentId, refundListRequestAllOf.paymentId) &&
        equalsNullable(this.refundId, refundListRequestAllOf.refundId) &&
        equalsNullable(this.profileId, refundListRequestAllOf.profileId) &&
        equalsNullable(this.limit, refundListRequestAllOf.limit) &&
        equalsNullable(this.offset, refundListRequestAllOf.offset) &&
        equalsNullable(this.amountFilter, refundListRequestAllOf.amountFilter) &&
        equalsNullable(this.connector, refundListRequestAllOf.connector) &&
        equalsNullable(this.merchantConnectorId, refundListRequestAllOf.merchantConnectorId) &&
        equalsNullable(this.currency, refundListRequestAllOf.currency) &&
        equalsNullable(this.refundStatus, refundListRequestAllOf.refundStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(paymentId), hashCodeNullable(refundId), hashCodeNullable(profileId), hashCodeNullable(limit), hashCodeNullable(offset), hashCodeNullable(amountFilter), hashCodeNullable(connector), hashCodeNullable(merchantConnectorId), hashCodeNullable(currency), hashCodeNullable(refundStatus));
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
    sb.append("class RefundListRequestAllOf {\n");
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

}


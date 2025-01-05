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
import com.hyperswitch.model.Currency;
import com.hyperswitch.model.PayoutConnectors;
import com.hyperswitch.model.PayoutEntityType;
import com.hyperswitch.model.PayoutStatus;
import com.hyperswitch.model.PayoutType;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PayoutListFilterConstraintsAllOf
 */
@JsonPropertyOrder({
  PayoutListFilterConstraintsAllOf.JSON_PROPERTY_PAYOUT_ID,
  PayoutListFilterConstraintsAllOf.JSON_PROPERTY_PROFILE_ID,
  PayoutListFilterConstraintsAllOf.JSON_PROPERTY_CUSTOMER_ID,
  PayoutListFilterConstraintsAllOf.JSON_PROPERTY_LIMIT,
  PayoutListFilterConstraintsAllOf.JSON_PROPERTY_OFFSET,
  PayoutListFilterConstraintsAllOf.JSON_PROPERTY_CONNECTOR,
  PayoutListFilterConstraintsAllOf.JSON_PROPERTY_CURRENCY,
  PayoutListFilterConstraintsAllOf.JSON_PROPERTY_STATUS,
  PayoutListFilterConstraintsAllOf.JSON_PROPERTY_PAYOUT_METHOD,
  PayoutListFilterConstraintsAllOf.JSON_PROPERTY_ENTITY_TYPE
})
@JsonTypeName("PayoutListFilterConstraints_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PayoutListFilterConstraintsAllOf {
  public static final String JSON_PROPERTY_PAYOUT_ID = "payout_id";
  private JsonNullable<String> payoutId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROFILE_ID = "profile_id";
  private JsonNullable<String> profileId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private JsonNullable<Integer> offset = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private JsonNullable<List<PayoutConnectors>> connector = JsonNullable.<List<PayoutConnectors>>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<List<PayoutStatus>> status = JsonNullable.<List<PayoutStatus>>undefined();

  public static final String JSON_PROPERTY_PAYOUT_METHOD = "payout_method";
  private JsonNullable<List<PayoutType>> payoutMethod = JsonNullable.<List<PayoutType>>undefined();

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entity_type";
  private PayoutEntityType entityType;

  public PayoutListFilterConstraintsAllOf() {
  }

  public PayoutListFilterConstraintsAllOf payoutId(String payoutId) {
    this.payoutId = JsonNullable.<String>of(payoutId);
    
    return this;
  }

   /**
   * The identifier for payout
   * @return payoutId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPayoutId() {
        return payoutId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYOUT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPayoutId_JsonNullable() {
    return payoutId;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYOUT_ID)
  public void setPayoutId_JsonNullable(JsonNullable<String> payoutId) {
    this.payoutId = payoutId;
  }

  public void setPayoutId(String payoutId) {
    this.payoutId = JsonNullable.<String>of(payoutId);
  }


  public PayoutListFilterConstraintsAllOf profileId(String profileId) {
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


  public PayoutListFilterConstraintsAllOf customerId(String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
    
    return this;
  }

   /**
   * The identifier for customer
   * @return customerId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCustomerId() {
        return customerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomerId_JsonNullable() {
    return customerId;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  public void setCustomerId_JsonNullable(JsonNullable<String> customerId) {
    this.customerId = customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
  }


  public PayoutListFilterConstraintsAllOf limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The limit on the number of objects. The default limit is 10 and max limit is 20
   * minimum: 0
   * @return limit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public PayoutListFilterConstraintsAllOf offset(Integer offset) {
    this.offset = JsonNullable.<Integer>of(offset);
    
    return this;
  }

   /**
   * The starting point within a list of objects
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getOffset() {
        return offset.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getOffset_JsonNullable() {
    return offset;
  }
  
  @JsonProperty(JSON_PROPERTY_OFFSET)
  public void setOffset_JsonNullable(JsonNullable<Integer> offset) {
    this.offset = offset;
  }

  public void setOffset(Integer offset) {
    this.offset = JsonNullable.<Integer>of(offset);
  }


  public PayoutListFilterConstraintsAllOf connector(List<PayoutConnectors> connector) {
    this.connector = JsonNullable.<List<PayoutConnectors>>of(connector);
    
    return this;
  }

  public PayoutListFilterConstraintsAllOf addConnectorItem(PayoutConnectors connectorItem) {
    if (this.connector == null || !this.connector.isPresent()) {
      this.connector = JsonNullable.<List<PayoutConnectors>>of(new ArrayList<>());
    }
    try {
      this.connector.get().add(connectorItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The list of connectors to filter payouts list
   * @return connector
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<PayoutConnectors> getConnector() {
        return connector.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<PayoutConnectors>> getConnector_JsonNullable() {
    return connector;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  public void setConnector_JsonNullable(JsonNullable<List<PayoutConnectors>> connector) {
    this.connector = connector;
  }

  public void setConnector(List<PayoutConnectors> connector) {
    this.connector = JsonNullable.<List<PayoutConnectors>>of(connector);
  }


  public PayoutListFilterConstraintsAllOf currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public PayoutListFilterConstraintsAllOf status(List<PayoutStatus> status) {
    this.status = JsonNullable.<List<PayoutStatus>>of(status);
    
    return this;
  }

  public PayoutListFilterConstraintsAllOf addStatusItem(PayoutStatus statusItem) {
    if (this.status == null || !this.status.isPresent()) {
      this.status = JsonNullable.<List<PayoutStatus>>of(new ArrayList<>());
    }
    try {
      this.status.get().add(statusItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The list of payout status to filter payouts list
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<PayoutStatus> getStatus() {
        return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<PayoutStatus>> getStatus_JsonNullable() {
    return status;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<List<PayoutStatus>> status) {
    this.status = status;
  }

  public void setStatus(List<PayoutStatus> status) {
    this.status = JsonNullable.<List<PayoutStatus>>of(status);
  }


  public PayoutListFilterConstraintsAllOf payoutMethod(List<PayoutType> payoutMethod) {
    this.payoutMethod = JsonNullable.<List<PayoutType>>of(payoutMethod);
    
    return this;
  }

  public PayoutListFilterConstraintsAllOf addPayoutMethodItem(PayoutType payoutMethodItem) {
    if (this.payoutMethod == null || !this.payoutMethod.isPresent()) {
      this.payoutMethod = JsonNullable.<List<PayoutType>>of(new ArrayList<>());
    }
    try {
      this.payoutMethod.get().add(payoutMethodItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * The list of payout methods to filter payouts list
   * @return payoutMethod
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<PayoutType> getPayoutMethod() {
        return payoutMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYOUT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<PayoutType>> getPayoutMethod_JsonNullable() {
    return payoutMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYOUT_METHOD)
  public void setPayoutMethod_JsonNullable(JsonNullable<List<PayoutType>> payoutMethod) {
    this.payoutMethod = payoutMethod;
  }

  public void setPayoutMethod(List<PayoutType> payoutMethod) {
    this.payoutMethod = JsonNullable.<List<PayoutType>>of(payoutMethod);
  }


  public PayoutListFilterConstraintsAllOf entityType(PayoutEntityType entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PayoutEntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntityType(PayoutEntityType entityType) {
    this.entityType = entityType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutListFilterConstraintsAllOf payoutListFilterConstraintsAllOf = (PayoutListFilterConstraintsAllOf) o;
    return equalsNullable(this.payoutId, payoutListFilterConstraintsAllOf.payoutId) &&
        equalsNullable(this.profileId, payoutListFilterConstraintsAllOf.profileId) &&
        equalsNullable(this.customerId, payoutListFilterConstraintsAllOf.customerId) &&
        Objects.equals(this.limit, payoutListFilterConstraintsAllOf.limit) &&
        equalsNullable(this.offset, payoutListFilterConstraintsAllOf.offset) &&
        equalsNullable(this.connector, payoutListFilterConstraintsAllOf.connector) &&
        Objects.equals(this.currency, payoutListFilterConstraintsAllOf.currency) &&
        equalsNullable(this.status, payoutListFilterConstraintsAllOf.status) &&
        equalsNullable(this.payoutMethod, payoutListFilterConstraintsAllOf.payoutMethod) &&
        Objects.equals(this.entityType, payoutListFilterConstraintsAllOf.entityType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(payoutId), hashCodeNullable(profileId), hashCodeNullable(customerId), limit, hashCodeNullable(offset), hashCodeNullable(connector), currency, hashCodeNullable(status), hashCodeNullable(payoutMethod), entityType);
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
    sb.append("class PayoutListFilterConstraintsAllOf {\n");
    sb.append("    payoutId: ").append(toIndentedString(payoutId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    payoutMethod: ").append(toIndentedString(payoutMethod)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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


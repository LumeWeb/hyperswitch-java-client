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
import com.hyperswitch.client.model.RoutingDictionaryRecord;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RoutingDictionary
 */
@JsonPropertyOrder({
  RoutingDictionary.JSON_PROPERTY_MERCHANT_ID,
  RoutingDictionary.JSON_PROPERTY_ACTIVE_ID,
  RoutingDictionary.JSON_PROPERTY_RECORDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoutingDictionary {
  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  private String merchantId;

  public static final String JSON_PROPERTY_ACTIVE_ID = "active_id";
  private JsonNullable<String> activeId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RECORDS = "records";
  private List<RoutingDictionaryRecord> records = new ArrayList<>();

  public RoutingDictionary() {
  }

  public RoutingDictionary merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantId() {
    return merchantId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public RoutingDictionary activeId(String activeId) {
    this.activeId = JsonNullable.<String>of(activeId);
    
    return this;
  }

   /**
   * Get activeId
   * @return activeId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getActiveId() {
        return activeId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTIVE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getActiveId_JsonNullable() {
    return activeId;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTIVE_ID)
  public void setActiveId_JsonNullable(JsonNullable<String> activeId) {
    this.activeId = activeId;
  }

  public void setActiveId(String activeId) {
    this.activeId = JsonNullable.<String>of(activeId);
  }


  public RoutingDictionary records(List<RoutingDictionaryRecord> records) {
    
    this.records = records;
    return this;
  }

  public RoutingDictionary addRecordsItem(RoutingDictionaryRecord recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RoutingDictionaryRecord> getRecords() {
    return records;
  }


  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecords(List<RoutingDictionaryRecord> records) {
    this.records = records;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingDictionary routingDictionary = (RoutingDictionary) o;
    return Objects.equals(this.merchantId, routingDictionary.merchantId) &&
        equalsNullable(this.activeId, routingDictionary.activeId) &&
        Objects.equals(this.records, routingDictionary.records);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, hashCodeNullable(activeId), records);
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
    sb.append("class RoutingDictionary {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    activeId: ").append(toIndentedString(activeId)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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


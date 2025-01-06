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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details of surcharge applied on this payment, if applicable
 */
@JsonPropertyOrder({
  RequestSurchargeDetails.JSON_PROPERTY_SURCHARGE_AMOUNT,
  RequestSurchargeDetails.JSON_PROPERTY_TAX_AMOUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestSurchargeDetails {
  public static final String JSON_PROPERTY_SURCHARGE_AMOUNT = "surcharge_amount";
  private Long surchargeAmount;

  public static final String JSON_PROPERTY_TAX_AMOUNT = "tax_amount";
  private JsonNullable<Long> taxAmount = JsonNullable.<Long>undefined();

  public RequestSurchargeDetails() {
  }

  public RequestSurchargeDetails surchargeAmount(Long surchargeAmount) {
    
    this.surchargeAmount = surchargeAmount;
    return this;
  }

   /**
   * Get surchargeAmount
   * @return surchargeAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SURCHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSurchargeAmount() {
    return surchargeAmount;
  }


  @JsonProperty(JSON_PROPERTY_SURCHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSurchargeAmount(Long surchargeAmount) {
    this.surchargeAmount = surchargeAmount;
  }


  public RequestSurchargeDetails taxAmount(Long taxAmount) {
    this.taxAmount = JsonNullable.<Long>of(taxAmount);
    
    return this;
  }

   /**
   * This Unit struct represents MinorUnit in which core amount works
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getTaxAmount() {
        return taxAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getTaxAmount_JsonNullable() {
    return taxAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  public void setTaxAmount_JsonNullable(JsonNullable<Long> taxAmount) {
    this.taxAmount = taxAmount;
  }

  public void setTaxAmount(Long taxAmount) {
    this.taxAmount = JsonNullable.<Long>of(taxAmount);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestSurchargeDetails requestSurchargeDetails = (RequestSurchargeDetails) o;
    return Objects.equals(this.surchargeAmount, requestSurchargeDetails.surchargeAmount) &&
        equalsNullable(this.taxAmount, requestSurchargeDetails.taxAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(surchargeAmount, hashCodeNullable(taxAmount));
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
    sb.append("class RequestSurchargeDetails {\n");
    sb.append("    surchargeAmount: ").append(toIndentedString(surchargeAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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


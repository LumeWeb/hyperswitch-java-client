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
import com.hyperswitch.model.PaymentMethod;
import com.hyperswitch.model.PaymentMethodType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomerDefaultPaymentMethodResponse
 */
@JsonPropertyOrder({
  CustomerDefaultPaymentMethodResponse.JSON_PROPERTY_DEFAULT_PAYMENT_METHOD_ID,
  CustomerDefaultPaymentMethodResponse.JSON_PROPERTY_CUSTOMER_ID,
  CustomerDefaultPaymentMethodResponse.JSON_PROPERTY_PAYMENT_METHOD,
  CustomerDefaultPaymentMethodResponse.JSON_PROPERTY_PAYMENT_METHOD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerDefaultPaymentMethodResponse {
  public static final String JSON_PROPERTY_DEFAULT_PAYMENT_METHOD_ID = "default_payment_method_id";
  private JsonNullable<String> defaultPaymentMethodId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private String customerId;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  private PaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "payment_method_type";
  private JsonNullable<PaymentMethodType> paymentMethodType = JsonNullable.<PaymentMethodType>undefined();

  public CustomerDefaultPaymentMethodResponse() { 
  }

  public CustomerDefaultPaymentMethodResponse defaultPaymentMethodId(String defaultPaymentMethodId) {
    this.defaultPaymentMethodId = JsonNullable.<String>of(defaultPaymentMethodId);
    
    return this;
  }

   /**
   * The unique identifier of the Payment method
   * @return defaultPaymentMethodId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "card_rGK4Vi5iSW70MY7J2mIg", value = "The unique identifier of the Payment method")
  @JsonIgnore

  public String getDefaultPaymentMethodId() {
        return defaultPaymentMethodId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDefaultPaymentMethodId_JsonNullable() {
    return defaultPaymentMethodId;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_PAYMENT_METHOD_ID)
  public void setDefaultPaymentMethodId_JsonNullable(JsonNullable<String> defaultPaymentMethodId) {
    this.defaultPaymentMethodId = defaultPaymentMethodId;
  }

  public void setDefaultPaymentMethodId(String defaultPaymentMethodId) {
    this.defaultPaymentMethodId = JsonNullable.<String>of(defaultPaymentMethodId);
  }


  public CustomerDefaultPaymentMethodResponse customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * The unique identifier of the customer.
   * @return customerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "cus_y3oqhf46pyzuxjbcn2giaqnb44", required = true, value = "The unique identifier of the customer.")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCustomerId() {
    return customerId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public CustomerDefaultPaymentMethodResponse paymentMethod(PaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public CustomerDefaultPaymentMethodResponse paymentMethodType(PaymentMethodType paymentMethodType) {
    this.paymentMethodType = JsonNullable.<PaymentMethodType>of(paymentMethodType);
    
    return this;
  }

   /**
   * Get paymentMethodType
   * @return paymentMethodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PaymentMethodType> getPaymentMethodType_JsonNullable() {
    return paymentMethodType;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  public void setPaymentMethodType_JsonNullable(JsonNullable<PaymentMethodType> paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
    this.paymentMethodType = JsonNullable.<PaymentMethodType>of(paymentMethodType);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDefaultPaymentMethodResponse customerDefaultPaymentMethodResponse = (CustomerDefaultPaymentMethodResponse) o;
    return equalsNullable(this.defaultPaymentMethodId, customerDefaultPaymentMethodResponse.defaultPaymentMethodId) &&
        Objects.equals(this.customerId, customerDefaultPaymentMethodResponse.customerId) &&
        Objects.equals(this.paymentMethod, customerDefaultPaymentMethodResponse.paymentMethod) &&
        equalsNullable(this.paymentMethodType, customerDefaultPaymentMethodResponse.paymentMethodType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(defaultPaymentMethodId), customerId, paymentMethod, hashCodeNullable(paymentMethodType));
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
    sb.append("class CustomerDefaultPaymentMethodResponse {\n");
    sb.append("    defaultPaymentMethodId: ").append(toIndentedString(defaultPaymentMethodId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
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


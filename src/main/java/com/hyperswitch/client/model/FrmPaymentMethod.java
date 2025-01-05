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
import com.hyperswitch.client.model.FrmPaymentMethodType;
import com.hyperswitch.client.model.FrmPreferredFlowTypes;
import com.hyperswitch.client.model.PaymentMethod;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details of FrmPaymentMethod are mentioned here... it should be passed in payment connector create api call, and stored in merchant_connector_table
 */
@JsonPropertyOrder({
  FrmPaymentMethod.JSON_PROPERTY_PAYMENT_METHOD,
  FrmPaymentMethod.JSON_PROPERTY_PAYMENT_METHOD_TYPES,
  FrmPaymentMethod.JSON_PROPERTY_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FrmPaymentMethod {
  public static final String JSON_PROPERTY_PAYMENT_METHOD = "payment_method";
  private PaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPES = "payment_method_types";
  private JsonNullable<List<FrmPaymentMethodType>> paymentMethodTypes = JsonNullable.<List<FrmPaymentMethodType>>undefined();

  public static final String JSON_PROPERTY_FLOW = "flow";
  private JsonNullable<FrmPreferredFlowTypes> flow = JsonNullable.<FrmPreferredFlowTypes>undefined();

  public FrmPaymentMethod() {
  }

  public FrmPaymentMethod paymentMethod(PaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nonnull
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


  public FrmPaymentMethod paymentMethodTypes(List<FrmPaymentMethodType> paymentMethodTypes) {
    this.paymentMethodTypes = JsonNullable.<List<FrmPaymentMethodType>>of(paymentMethodTypes);
    
    return this;
  }

  public FrmPaymentMethod addPaymentMethodTypesItem(FrmPaymentMethodType paymentMethodTypesItem) {
    if (this.paymentMethodTypes == null || !this.paymentMethodTypes.isPresent()) {
      this.paymentMethodTypes = JsonNullable.<List<FrmPaymentMethodType>>of(new ArrayList<>());
    }
    try {
      this.paymentMethodTypes.get().add(paymentMethodTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * payment method types(credit, debit) that can be used in the payment. This field is deprecated. It has not been removed to provide backward compatibility.
   * @return paymentMethodTypes
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<FrmPaymentMethodType> getPaymentMethodTypes() {
        return paymentMethodTypes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<FrmPaymentMethodType>> getPaymentMethodTypes_JsonNullable() {
    return paymentMethodTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPES)
  public void setPaymentMethodTypes_JsonNullable(JsonNullable<List<FrmPaymentMethodType>> paymentMethodTypes) {
    this.paymentMethodTypes = paymentMethodTypes;
  }

  public void setPaymentMethodTypes(List<FrmPaymentMethodType> paymentMethodTypes) {
    this.paymentMethodTypes = JsonNullable.<List<FrmPaymentMethodType>>of(paymentMethodTypes);
  }


  public FrmPaymentMethod flow(FrmPreferredFlowTypes flow) {
    this.flow = JsonNullable.<FrmPreferredFlowTypes>of(flow);
    
    return this;
  }

   /**
   * Get flow
   * @return flow
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public FrmPreferredFlowTypes getFlow() {
        return flow.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<FrmPreferredFlowTypes> getFlow_JsonNullable() {
    return flow;
  }
  
  @JsonProperty(JSON_PROPERTY_FLOW)
  public void setFlow_JsonNullable(JsonNullable<FrmPreferredFlowTypes> flow) {
    this.flow = flow;
  }

  public void setFlow(FrmPreferredFlowTypes flow) {
    this.flow = JsonNullable.<FrmPreferredFlowTypes>of(flow);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FrmPaymentMethod frmPaymentMethod = (FrmPaymentMethod) o;
    return Objects.equals(this.paymentMethod, frmPaymentMethod.paymentMethod) &&
        equalsNullable(this.paymentMethodTypes, frmPaymentMethod.paymentMethodTypes) &&
        equalsNullable(this.flow, frmPaymentMethod.flow);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, hashCodeNullable(paymentMethodTypes), hashCodeNullable(flow));
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
    sb.append("class FrmPaymentMethod {\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentMethodTypes: ").append(toIndentedString(paymentMethodTypes)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
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


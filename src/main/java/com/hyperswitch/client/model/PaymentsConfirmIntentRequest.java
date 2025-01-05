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
import com.hyperswitch.client.model.Address;
import com.hyperswitch.client.model.BrowserInformation;
import com.hyperswitch.client.model.CustomerAcceptance;
import com.hyperswitch.client.model.PaymentMethod;
import com.hyperswitch.client.model.PaymentMethodDataRequest;
import com.hyperswitch.client.model.PaymentMethodType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request for Payment Intent Confirm
 */
@JsonPropertyOrder({
  PaymentsConfirmIntentRequest.JSON_PROPERTY_RETURN_URL,
  PaymentsConfirmIntentRequest.JSON_PROPERTY_PAYMENT_METHOD_DATA,
  PaymentsConfirmIntentRequest.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  PaymentsConfirmIntentRequest.JSON_PROPERTY_PAYMENT_METHOD_SUBTYPE,
  PaymentsConfirmIntentRequest.JSON_PROPERTY_SHIPPING,
  PaymentsConfirmIntentRequest.JSON_PROPERTY_CUSTOMER_ACCEPTANCE,
  PaymentsConfirmIntentRequest.JSON_PROPERTY_BROWSER_INFO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentsConfirmIntentRequest {
  public static final String JSON_PROPERTY_RETURN_URL = "return_url";
  private JsonNullable<String> returnUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYMENT_METHOD_DATA = "payment_method_data";
  private PaymentMethodDataRequest paymentMethodData;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "payment_method_type";
  private PaymentMethod paymentMethodType;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_SUBTYPE = "payment_method_subtype";
  private PaymentMethodType paymentMethodSubtype;

  public static final String JSON_PROPERTY_SHIPPING = "shipping";
  private JsonNullable<Address> shipping = JsonNullable.<Address>undefined();

  public static final String JSON_PROPERTY_CUSTOMER_ACCEPTANCE = "customer_acceptance";
  private JsonNullable<CustomerAcceptance> customerAcceptance = JsonNullable.<CustomerAcceptance>undefined();

  public static final String JSON_PROPERTY_BROWSER_INFO = "browser_info";
  private JsonNullable<BrowserInformation> browserInfo = JsonNullable.<BrowserInformation>undefined();

  public PaymentsConfirmIntentRequest() {
  }

  public PaymentsConfirmIntentRequest returnUrl(String returnUrl) {
    this.returnUrl = JsonNullable.<String>of(returnUrl);
    
    return this;
  }

   /**
   * The URL to which you want the user to be redirected after the completion of the payment operation If this url is not passed, the url configured in the business profile will be used
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getReturnUrl() {
        return returnUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReturnUrl_JsonNullable() {
    return returnUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  public void setReturnUrl_JsonNullable(JsonNullable<String> returnUrl) {
    this.returnUrl = returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = JsonNullable.<String>of(returnUrl);
  }


  public PaymentsConfirmIntentRequest paymentMethodData(PaymentMethodDataRequest paymentMethodData) {
    
    this.paymentMethodData = paymentMethodData;
    return this;
  }

   /**
   * Get paymentMethodData
   * @return paymentMethodData
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentMethodDataRequest getPaymentMethodData() {
    return paymentMethodData;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethodData(PaymentMethodDataRequest paymentMethodData) {
    this.paymentMethodData = paymentMethodData;
  }


  public PaymentsConfirmIntentRequest paymentMethodType(PaymentMethod paymentMethodType) {
    
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * Get paymentMethodType
   * @return paymentMethodType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentMethod getPaymentMethodType() {
    return paymentMethodType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethodType(PaymentMethod paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }


  public PaymentsConfirmIntentRequest paymentMethodSubtype(PaymentMethodType paymentMethodSubtype) {
    
    this.paymentMethodSubtype = paymentMethodSubtype;
    return this;
  }

   /**
   * Get paymentMethodSubtype
   * @return paymentMethodSubtype
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentMethodType getPaymentMethodSubtype() {
    return paymentMethodSubtype;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethodSubtype(PaymentMethodType paymentMethodSubtype) {
    this.paymentMethodSubtype = paymentMethodSubtype;
  }


  public PaymentsConfirmIntentRequest shipping(Address shipping) {
    this.shipping = JsonNullable.<Address>of(shipping);
    
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Address getShipping() {
        return shipping.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHIPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Address> getShipping_JsonNullable() {
    return shipping;
  }
  
  @JsonProperty(JSON_PROPERTY_SHIPPING)
  public void setShipping_JsonNullable(JsonNullable<Address> shipping) {
    this.shipping = shipping;
  }

  public void setShipping(Address shipping) {
    this.shipping = JsonNullable.<Address>of(shipping);
  }


  public PaymentsConfirmIntentRequest customerAcceptance(CustomerAcceptance customerAcceptance) {
    this.customerAcceptance = JsonNullable.<CustomerAcceptance>of(customerAcceptance);
    
    return this;
  }

   /**
   * Get customerAcceptance
   * @return customerAcceptance
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public CustomerAcceptance getCustomerAcceptance() {
        return customerAcceptance.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ACCEPTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CustomerAcceptance> getCustomerAcceptance_JsonNullable() {
    return customerAcceptance;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ACCEPTANCE)
  public void setCustomerAcceptance_JsonNullable(JsonNullable<CustomerAcceptance> customerAcceptance) {
    this.customerAcceptance = customerAcceptance;
  }

  public void setCustomerAcceptance(CustomerAcceptance customerAcceptance) {
    this.customerAcceptance = JsonNullable.<CustomerAcceptance>of(customerAcceptance);
  }


  public PaymentsConfirmIntentRequest browserInfo(BrowserInformation browserInfo) {
    this.browserInfo = JsonNullable.<BrowserInformation>of(browserInfo);
    
    return this;
  }

   /**
   * Get browserInfo
   * @return browserInfo
  **/
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

  public void setBrowserInfo(BrowserInformation browserInfo) {
    this.browserInfo = JsonNullable.<BrowserInformation>of(browserInfo);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsConfirmIntentRequest paymentsConfirmIntentRequest = (PaymentsConfirmIntentRequest) o;
    return equalsNullable(this.returnUrl, paymentsConfirmIntentRequest.returnUrl) &&
        Objects.equals(this.paymentMethodData, paymentsConfirmIntentRequest.paymentMethodData) &&
        Objects.equals(this.paymentMethodType, paymentsConfirmIntentRequest.paymentMethodType) &&
        Objects.equals(this.paymentMethodSubtype, paymentsConfirmIntentRequest.paymentMethodSubtype) &&
        equalsNullable(this.shipping, paymentsConfirmIntentRequest.shipping) &&
        equalsNullable(this.customerAcceptance, paymentsConfirmIntentRequest.customerAcceptance) &&
        equalsNullable(this.browserInfo, paymentsConfirmIntentRequest.browserInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(returnUrl), paymentMethodData, paymentMethodType, paymentMethodSubtype, hashCodeNullable(shipping), hashCodeNullable(customerAcceptance), hashCodeNullable(browserInfo));
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
    sb.append("class PaymentsConfirmIntentRequest {\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    paymentMethodData: ").append(toIndentedString(paymentMethodData)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    paymentMethodSubtype: ").append(toIndentedString(paymentMethodSubtype)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    customerAcceptance: ").append(toIndentedString(customerAcceptance)).append("\n");
    sb.append("    browserInfo: ").append(toIndentedString(browserInfo)).append("\n");
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


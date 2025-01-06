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
 * For AfterpayClearpay redirect as PayLater Option
 */
@JsonPropertyOrder({
  PayLaterDataOneOf3AfterpayClearpayRedirect.JSON_PROPERTY_BILLING_EMAIL,
  PayLaterDataOneOf3AfterpayClearpayRedirect.JSON_PROPERTY_BILLING_NAME
})
@JsonTypeName("PayLaterData_oneOf_3_afterpay_clearpay_redirect")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PayLaterDataOneOf3AfterpayClearpayRedirect {
  public static final String JSON_PROPERTY_BILLING_EMAIL = "billing_email";
  private JsonNullable<String> billingEmail = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BILLING_NAME = "billing_name";
  private JsonNullable<String> billingName = JsonNullable.<String>undefined();

  public PayLaterDataOneOf3AfterpayClearpayRedirect() {
  }

  public PayLaterDataOneOf3AfterpayClearpayRedirect billingEmail(String billingEmail) {
    this.billingEmail = JsonNullable.<String>of(billingEmail);
    
    return this;
  }

   /**
   * The billing email
   * @return billingEmail
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBillingEmail() {
        return billingEmail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLING_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBillingEmail_JsonNullable() {
    return billingEmail;
  }
  
  @JsonProperty(JSON_PROPERTY_BILLING_EMAIL)
  public void setBillingEmail_JsonNullable(JsonNullable<String> billingEmail) {
    this.billingEmail = billingEmail;
  }

  public void setBillingEmail(String billingEmail) {
    this.billingEmail = JsonNullable.<String>of(billingEmail);
  }


  public PayLaterDataOneOf3AfterpayClearpayRedirect billingName(String billingName) {
    this.billingName = JsonNullable.<String>of(billingName);
    
    return this;
  }

   /**
   * The billing name
   * @return billingName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getBillingName() {
        return billingName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBillingName_JsonNullable() {
    return billingName;
  }
  
  @JsonProperty(JSON_PROPERTY_BILLING_NAME)
  public void setBillingName_JsonNullable(JsonNullable<String> billingName) {
    this.billingName = billingName;
  }

  public void setBillingName(String billingName) {
    this.billingName = JsonNullable.<String>of(billingName);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayLaterDataOneOf3AfterpayClearpayRedirect payLaterDataOneOf3AfterpayClearpayRedirect = (PayLaterDataOneOf3AfterpayClearpayRedirect) o;
    return equalsNullable(this.billingEmail, payLaterDataOneOf3AfterpayClearpayRedirect.billingEmail) &&
        equalsNullable(this.billingName, payLaterDataOneOf3AfterpayClearpayRedirect.billingName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(billingEmail), hashCodeNullable(billingName));
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
    sb.append("class PayLaterDataOneOf3AfterpayClearpayRedirect {\n");
    sb.append("    billingEmail: ").append(toIndentedString(billingEmail)).append("\n");
    sb.append("    billingName: ").append(toIndentedString(billingName)).append("\n");
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


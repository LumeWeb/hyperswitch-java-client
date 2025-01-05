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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details of customer attached to this payment
 */
@JsonPropertyOrder({
  CustomerDetailsResponse.JSON_PROPERTY_ID,
  CustomerDetailsResponse.JSON_PROPERTY_NAME,
  CustomerDetailsResponse.JSON_PROPERTY_EMAIL,
  CustomerDetailsResponse.JSON_PROPERTY_PHONE,
  CustomerDetailsResponse.JSON_PROPERTY_PHONE_COUNTRY_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerDetailsResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE = "phone";
  private JsonNullable<String> phone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE_COUNTRY_CODE = "phone_country_code";
  private JsonNullable<String> phoneCountryCode = JsonNullable.<String>undefined();

  public CustomerDetailsResponse() {
  }

  public CustomerDetailsResponse id(String id) {
    this.id = JsonNullable.<String>of(id);
    
    return this;
  }

   /**
   * The identifier for the customer.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public CustomerDetailsResponse name(String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

   /**
   * The customer&#39;s name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public CustomerDetailsResponse email(String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

   /**
   * The customer&#39;s email address
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(String email) {
    this.email = JsonNullable.<String>of(email);
  }


  public CustomerDetailsResponse phone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
    
    return this;
  }

   /**
   * The customer&#39;s phone number
   * @return phone
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPhone() {
        return phone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhone_JsonNullable() {
    return phone;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE)
  public void setPhone_JsonNullable(JsonNullable<String> phone) {
    this.phone = phone;
  }

  public void setPhone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
  }


  public CustomerDetailsResponse phoneCountryCode(String phoneCountryCode) {
    this.phoneCountryCode = JsonNullable.<String>of(phoneCountryCode);
    
    return this;
  }

   /**
   * The country code for the customer&#39;s phone number
   * @return phoneCountryCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPhoneCountryCode() {
        return phoneCountryCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHONE_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhoneCountryCode_JsonNullable() {
    return phoneCountryCode;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE_COUNTRY_CODE)
  public void setPhoneCountryCode_JsonNullable(JsonNullable<String> phoneCountryCode) {
    this.phoneCountryCode = phoneCountryCode;
  }

  public void setPhoneCountryCode(String phoneCountryCode) {
    this.phoneCountryCode = JsonNullable.<String>of(phoneCountryCode);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDetailsResponse customerDetailsResponse = (CustomerDetailsResponse) o;
    return equalsNullable(this.id, customerDetailsResponse.id) &&
        equalsNullable(this.name, customerDetailsResponse.name) &&
        equalsNullable(this.email, customerDetailsResponse.email) &&
        equalsNullable(this.phone, customerDetailsResponse.phone) &&
        equalsNullable(this.phoneCountryCode, customerDetailsResponse.phoneCountryCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(name), hashCodeNullable(email), hashCodeNullable(phone), hashCodeNullable(phoneCountryCode));
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
    sb.append("class CustomerDetailsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneCountryCode: ").append(toIndentedString(phoneCountryCode)).append("\n");
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


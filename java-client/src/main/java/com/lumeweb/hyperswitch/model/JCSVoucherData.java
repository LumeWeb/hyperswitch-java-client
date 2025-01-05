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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * JCSVoucherData
 */
@JsonPropertyOrder({
  JCSVoucherData.JSON_PROPERTY_FIRST_NAME,
  JCSVoucherData.JSON_PROPERTY_LAST_NAME,
  JCSVoucherData.JSON_PROPERTY_EMAIL,
  JCSVoucherData.JSON_PROPERTY_PHONE_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class JCSVoucherData {
  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private JsonNullable<String> firstName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private JsonNullable<String> lastName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private JsonNullable<String> phoneNumber = JsonNullable.<String>undefined();

  public JCSVoucherData() { 
  }

  public JCSVoucherData firstName(@javax.annotation.Nullable String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
    return this;
  }

  /**
   * The billing first name for Japanese convenience stores
   * @return firstName
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getFirstName() {
        return firstName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFirstName_JsonNullable() {
    return firstName;
  }
  
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  public void setFirstName_JsonNullable(JsonNullable<String> firstName) {
    this.firstName = firstName;
  }

  public void setFirstName(@javax.annotation.Nullable String firstName) {
    this.firstName = JsonNullable.<String>of(firstName);
  }


  public JCSVoucherData lastName(@javax.annotation.Nullable String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
    return this;
  }

  /**
   * The billing second name Japanese convenience stores
   * @return lastName
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getLastName() {
        return lastName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastName_JsonNullable() {
    return lastName;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  public void setLastName_JsonNullable(JsonNullable<String> lastName) {
    this.lastName = lastName;
  }

  public void setLastName(@javax.annotation.Nullable String lastName) {
    this.lastName = JsonNullable.<String>of(lastName);
  }


  public JCSVoucherData email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    return this;
  }

  /**
   * The Email ID for Japanese convenience stores
   * @return email
   */
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

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
  }


  public JCSVoucherData phoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = JsonNullable.<String>of(phoneNumber);
    return this;
  }

  /**
   * The telephone number for Japanese convenience stores
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getPhoneNumber() {
        return phoneNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhoneNumber_JsonNullable() {
    return phoneNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  public void setPhoneNumber_JsonNullable(JsonNullable<String> phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setPhoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = JsonNullable.<String>of(phoneNumber);
  }


  /**
   * Return true if this JCSVoucherData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JCSVoucherData jcSVoucherData = (JCSVoucherData) o;
    return equalsNullable(this.firstName, jcSVoucherData.firstName) &&
        equalsNullable(this.lastName, jcSVoucherData.lastName) &&
        equalsNullable(this.email, jcSVoucherData.email) &&
        equalsNullable(this.phoneNumber, jcSVoucherData.phoneNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(firstName), hashCodeNullable(lastName), hashCodeNullable(email), hashCodeNullable(phoneNumber));
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
    sb.append("class JCSVoucherData {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

    // add `first_name` to the URL query string
    if (getFirstName() != null) {
      joiner.add(String.format("%sfirst_name%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFirstName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `last_name` to the URL query string
    if (getLastName() != null) {
      joiner.add(String.format("%slast_name%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLastName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phone_number` to the URL query string
    if (getPhoneNumber() != null) {
      joiner.add(String.format("%sphone_number%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPhoneNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


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
import com.hyperswitch.client.model.AddressDetails;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomerResponse
 */
@JsonPropertyOrder({
  CustomerResponse.JSON_PROPERTY_CUSTOMER_ID,
  CustomerResponse.JSON_PROPERTY_NAME,
  CustomerResponse.JSON_PROPERTY_EMAIL,
  CustomerResponse.JSON_PROPERTY_PHONE,
  CustomerResponse.JSON_PROPERTY_PHONE_COUNTRY_CODE,
  CustomerResponse.JSON_PROPERTY_DESCRIPTION,
  CustomerResponse.JSON_PROPERTY_ADDRESS,
  CustomerResponse.JSON_PROPERTY_CREATED_AT,
  CustomerResponse.JSON_PROPERTY_METADATA,
  CustomerResponse.JSON_PROPERTY_DEFAULT_PAYMENT_METHOD_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerResponse {
  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private String customerId;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE = "phone";
  private JsonNullable<String> phone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE_COUNTRY_CODE = "phone_country_code";
  private JsonNullable<String> phoneCountryCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private JsonNullable<AddressDetails> address = JsonNullable.<AddressDetails>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_DEFAULT_PAYMENT_METHOD_ID = "default_payment_method_id";
  private JsonNullable<String> defaultPaymentMethodId = JsonNullable.<String>undefined();

  public CustomerResponse() {
  }

  public CustomerResponse customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * The identifier for the customer object
   * @return customerId
  **/
  @javax.annotation.Nonnull
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


  public CustomerResponse name(String name) {
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


  public CustomerResponse email(String email) {
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


  public CustomerResponse phone(String phone) {
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


  public CustomerResponse phoneCountryCode(String phoneCountryCode) {
    this.phoneCountryCode = JsonNullable.<String>of(phoneCountryCode);
    
    return this;
  }

   /**
   * The country code for the customer phone number
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


  public CustomerResponse description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * An arbitrary string that you can attach to a customer object.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public CustomerResponse address(AddressDetails address) {
    this.address = JsonNullable.<AddressDetails>of(address);
    
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public AddressDetails getAddress() {
        return address.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AddressDetails> getAddress_JsonNullable() {
    return address;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  public void setAddress_JsonNullable(JsonNullable<AddressDetails> address) {
    this.address = address;
  }

  public void setAddress(AddressDetails address) {
    this.address = JsonNullable.<AddressDetails>of(address);
  }


  public CustomerResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A timestamp (ISO 8601 code) that determines when the customer was created
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CustomerResponse metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * You can specify up to 50 keys, with key names up to 40 characters long and values up to 500 characters long. Metadata is useful for storing additional, structured information on an object.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }


  public CustomerResponse defaultPaymentMethodId(String defaultPaymentMethodId) {
    this.defaultPaymentMethodId = JsonNullable.<String>of(defaultPaymentMethodId);
    
    return this;
  }

   /**
   * The identifier for the default payment method.
   * @return defaultPaymentMethodId
  **/
  @javax.annotation.Nullable
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerResponse customerResponse = (CustomerResponse) o;
    return Objects.equals(this.customerId, customerResponse.customerId) &&
        equalsNullable(this.name, customerResponse.name) &&
        equalsNullable(this.email, customerResponse.email) &&
        equalsNullable(this.phone, customerResponse.phone) &&
        equalsNullable(this.phoneCountryCode, customerResponse.phoneCountryCode) &&
        equalsNullable(this.description, customerResponse.description) &&
        equalsNullable(this.address, customerResponse.address) &&
        Objects.equals(this.createdAt, customerResponse.createdAt) &&
        equalsNullable(this.metadata, customerResponse.metadata) &&
        equalsNullable(this.defaultPaymentMethodId, customerResponse.defaultPaymentMethodId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, hashCodeNullable(name), hashCodeNullable(email), hashCodeNullable(phone), hashCodeNullable(phoneCountryCode), hashCodeNullable(description), hashCodeNullable(address), createdAt, hashCodeNullable(metadata), hashCodeNullable(defaultPaymentMethodId));
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
    sb.append("class CustomerResponse {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneCountryCode: ").append(toIndentedString(phoneCountryCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    defaultPaymentMethodId: ").append(toIndentedString(defaultPaymentMethodId)).append("\n");
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


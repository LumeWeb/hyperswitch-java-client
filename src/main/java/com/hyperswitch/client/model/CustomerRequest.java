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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The customer details
 */
@JsonPropertyOrder({
  CustomerRequest.JSON_PROPERTY_CUSTOMER_ID,
  CustomerRequest.JSON_PROPERTY_NAME,
  CustomerRequest.JSON_PROPERTY_EMAIL,
  CustomerRequest.JSON_PROPERTY_PHONE,
  CustomerRequest.JSON_PROPERTY_DESCRIPTION,
  CustomerRequest.JSON_PROPERTY_PHONE_COUNTRY_CODE,
  CustomerRequest.JSON_PROPERTY_ADDRESS,
  CustomerRequest.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CustomerRequest {
  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  @javax.annotation.Nullable
  private JsonNullable<String> customerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  @javax.annotation.Nullable
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE = "phone";
  @javax.annotation.Nullable
  private JsonNullable<String> phone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE_COUNTRY_CODE = "phone_country_code";
  @javax.annotation.Nullable
  private JsonNullable<String> phoneCountryCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ADDRESS = "address";
  @javax.annotation.Nullable
  private JsonNullable<AddressDetails> address = JsonNullable.<AddressDetails>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public CustomerRequest() {
  }

  public CustomerRequest customerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
    
    return this;
  }

  /**
   * The identifier for the customer object. If not provided the customer ID will be autogenerated.
   * @return customerId
   */
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

  public void setCustomerId(@javax.annotation.Nullable String customerId) {
    this.customerId = JsonNullable.<String>of(customerId);
  }

  public CustomerRequest name(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
    
    return this;
  }

  /**
   * The customer&#39;s name
   * @return name
   */
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

  public void setName(@javax.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public CustomerRequest email(@javax.annotation.Nullable String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

  /**
   * The customer&#39;s email address
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

  public CustomerRequest phone(@javax.annotation.Nullable String phone) {
    this.phone = JsonNullable.<String>of(phone);
    
    return this;
  }

  /**
   * The customer&#39;s phone number
   * @return phone
   */
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

  public void setPhone(@javax.annotation.Nullable String phone) {
    this.phone = JsonNullable.<String>of(phone);
  }

  public CustomerRequest description(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

  /**
   * An arbitrary string that you can attach to a customer object.
   * @return description
   */
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

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public CustomerRequest phoneCountryCode(@javax.annotation.Nullable String phoneCountryCode) {
    this.phoneCountryCode = JsonNullable.<String>of(phoneCountryCode);
    
    return this;
  }

  /**
   * The country code for the customer phone number
   * @return phoneCountryCode
   */
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

  public void setPhoneCountryCode(@javax.annotation.Nullable String phoneCountryCode) {
    this.phoneCountryCode = JsonNullable.<String>of(phoneCountryCode);
  }

  public CustomerRequest address(@javax.annotation.Nullable AddressDetails address) {
    this.address = JsonNullable.<AddressDetails>of(address);
    
    return this;
  }

  /**
   * Get address
   * @return address
   */
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

  public void setAddress(@javax.annotation.Nullable AddressDetails address) {
    this.address = JsonNullable.<AddressDetails>of(address);
  }

  public CustomerRequest metadata(@javax.annotation.Nullable Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

  /**
   * You can specify up to 50 keys, with key names up to 40 characters long and values up to 500 characters long. Metadata is useful for storing additional, structured information on an object.
   * @return metadata
   */
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

  public void setMetadata(@javax.annotation.Nullable Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRequest customerRequest = (CustomerRequest) o;
    return equalsNullable(this.customerId, customerRequest.customerId) &&
        equalsNullable(this.name, customerRequest.name) &&
        equalsNullable(this.email, customerRequest.email) &&
        equalsNullable(this.phone, customerRequest.phone) &&
        equalsNullable(this.description, customerRequest.description) &&
        equalsNullable(this.phoneCountryCode, customerRequest.phoneCountryCode) &&
        equalsNullable(this.address, customerRequest.address) &&
        equalsNullable(this.metadata, customerRequest.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(customerId), hashCodeNullable(name), hashCodeNullable(email), hashCodeNullable(phone), hashCodeNullable(description), hashCodeNullable(phoneCountryCode), hashCodeNullable(address), hashCodeNullable(metadata));
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
    sb.append("class CustomerRequest {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    phoneCountryCode: ").append(toIndentedString(phoneCountryCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

    // add `customer_id` to the URL query string
    if (getCustomerId() != null) {
      try {
        joiner.add(String.format("%scustomer_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      try {
        joiner.add(String.format("%sphone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `phone_country_code` to the URL query string
    if (getPhoneCountryCode() != null) {
      try {
        joiner.add(String.format("%sphone_country_code%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhoneCountryCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      try {
        joiner.add(String.format("%smetadata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetadata()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


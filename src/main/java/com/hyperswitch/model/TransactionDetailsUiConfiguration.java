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
 * TransactionDetailsUiConfiguration
 */
@JsonPropertyOrder({
  TransactionDetailsUiConfiguration.JSON_PROPERTY_POSITION,
  TransactionDetailsUiConfiguration.JSON_PROPERTY_IS_KEY_BOLD,
  TransactionDetailsUiConfiguration.JSON_PROPERTY_IS_VALUE_BOLD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class TransactionDetailsUiConfiguration {
  public static final String JSON_PROPERTY_POSITION = "position";
  private JsonNullable<Integer> position = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_IS_KEY_BOLD = "is_key_bold";
  private JsonNullable<Boolean> isKeyBold = JsonNullable.<Boolean>of(false);

  public static final String JSON_PROPERTY_IS_VALUE_BOLD = "is_value_bold";
  private JsonNullable<Boolean> isValueBold = JsonNullable.<Boolean>of(false);

  public TransactionDetailsUiConfiguration() {
  }

  public TransactionDetailsUiConfiguration position(@javax.annotation.Nullable Integer position) {
    this.position = JsonNullable.<Integer>of(position);
    
    return this;
  }

  /**
   * Position of the key-value pair in the UI
   * @return position
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getPosition() {
        return position.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPosition_JsonNullable() {
    return position;
  }
  
  @JsonProperty(JSON_PROPERTY_POSITION)
  public void setPosition_JsonNullable(JsonNullable<Integer> position) {
    this.position = position;
  }

  public void setPosition(@javax.annotation.Nullable Integer position) {
    this.position = JsonNullable.<Integer>of(position);
  }


  public TransactionDetailsUiConfiguration isKeyBold(@javax.annotation.Nullable Boolean isKeyBold) {
    this.isKeyBold = JsonNullable.<Boolean>of(isKeyBold);
    
    return this;
  }

  /**
   * Whether the key should be bold
   * @return isKeyBold
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIsKeyBold() {
        return isKeyBold.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_KEY_BOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsKeyBold_JsonNullable() {
    return isKeyBold;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_KEY_BOLD)
  public void setIsKeyBold_JsonNullable(JsonNullable<Boolean> isKeyBold) {
    this.isKeyBold = isKeyBold;
  }

  public void setIsKeyBold(@javax.annotation.Nullable Boolean isKeyBold) {
    this.isKeyBold = JsonNullable.<Boolean>of(isKeyBold);
  }


  public TransactionDetailsUiConfiguration isValueBold(@javax.annotation.Nullable Boolean isValueBold) {
    this.isValueBold = JsonNullable.<Boolean>of(isValueBold);
    
    return this;
  }

  /**
   * Whether the value should be bold
   * @return isValueBold
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIsValueBold() {
        return isValueBold.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_VALUE_BOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsValueBold_JsonNullable() {
    return isValueBold;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_VALUE_BOLD)
  public void setIsValueBold_JsonNullable(JsonNullable<Boolean> isValueBold) {
    this.isValueBold = isValueBold;
  }

  public void setIsValueBold(@javax.annotation.Nullable Boolean isValueBold) {
    this.isValueBold = JsonNullable.<Boolean>of(isValueBold);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetailsUiConfiguration transactionDetailsUiConfiguration = (TransactionDetailsUiConfiguration) o;
    return equalsNullable(this.position, transactionDetailsUiConfiguration.position) &&
        equalsNullable(this.isKeyBold, transactionDetailsUiConfiguration.isKeyBold) &&
        equalsNullable(this.isValueBold, transactionDetailsUiConfiguration.isValueBold);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(position), hashCodeNullable(isKeyBold), hashCodeNullable(isValueBold));
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
    sb.append("class TransactionDetailsUiConfiguration {\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    isKeyBold: ").append(toIndentedString(isKeyBold)).append("\n");
    sb.append("    isValueBold: ").append(toIndentedString(isValueBold)).append("\n");
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


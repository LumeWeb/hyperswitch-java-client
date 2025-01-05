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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.hyperswitch.model.ThreeDsMethodDataOneOf;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ThreeDsMethodData
 */
@JsonPropertyOrder({
  ThreeDsMethodData.JSON_PROPERTY_THREE_DS_METHOD_DATA_SUBMISSION,
  ThreeDsMethodData.JSON_PROPERTY_THREE_DS_METHOD_DATA,
  ThreeDsMethodData.JSON_PROPERTY_THREE_DS_METHOD_URL,
  ThreeDsMethodData.JSON_PROPERTY_THREE_DS_METHOD_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "three_ds_method_key", // ignore manually set three_ds_method_key, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the three_ds_method_key to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "three_ds_method_key", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ThreeDsMethodDataOneOf.class, name = "ThreeDsMethodData_oneOf"),
})

public class ThreeDsMethodData {
  public static final String JSON_PROPERTY_THREE_DS_METHOD_DATA_SUBMISSION = "three_ds_method_data_submission";
  private Boolean threeDsMethodDataSubmission;

  public static final String JSON_PROPERTY_THREE_DS_METHOD_DATA = "three_ds_method_data";
  private JsonNullable<String> threeDsMethodData = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_THREE_DS_METHOD_URL = "three_ds_method_url";
  private JsonNullable<String> threeDsMethodUrl = JsonNullable.<String>undefined();

  /**
   * Gets or Sets threeDsMethodKey
   */
  public enum ThreeDsMethodKeyEnum {
    THREEDSMETHODDATA("threeDSMethodData");

    private String value;

    ThreeDsMethodKeyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ThreeDsMethodKeyEnum fromValue(String value) {
      for (ThreeDsMethodKeyEnum b : ThreeDsMethodKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_THREE_DS_METHOD_KEY = "three_ds_method_key";
  protected ThreeDsMethodKeyEnum threeDsMethodKey;

  public ThreeDsMethodData() {
  }

  public ThreeDsMethodData threeDsMethodDataSubmission(Boolean threeDsMethodDataSubmission) {
    
    this.threeDsMethodDataSubmission = threeDsMethodDataSubmission;
    return this;
  }

   /**
   * Whether ThreeDS method data submission is required
   * @return threeDsMethodDataSubmission
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_THREE_DS_METHOD_DATA_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getThreeDsMethodDataSubmission() {
    return threeDsMethodDataSubmission;
  }


  @JsonProperty(JSON_PROPERTY_THREE_DS_METHOD_DATA_SUBMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreeDsMethodDataSubmission(Boolean threeDsMethodDataSubmission) {
    this.threeDsMethodDataSubmission = threeDsMethodDataSubmission;
  }


  public ThreeDsMethodData threeDsMethodData(String threeDsMethodData) {
    this.threeDsMethodData = JsonNullable.<String>of(threeDsMethodData);
    
    return this;
  }

   /**
   * ThreeDS method data
   * @return threeDsMethodData
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getThreeDsMethodData() {
        return threeDsMethodData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_THREE_DS_METHOD_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getThreeDsMethodData_JsonNullable() {
    return threeDsMethodData;
  }
  
  @JsonProperty(JSON_PROPERTY_THREE_DS_METHOD_DATA)
  public void setThreeDsMethodData_JsonNullable(JsonNullable<String> threeDsMethodData) {
    this.threeDsMethodData = threeDsMethodData;
  }

  public void setThreeDsMethodData(String threeDsMethodData) {
    this.threeDsMethodData = JsonNullable.<String>of(threeDsMethodData);
  }


  public ThreeDsMethodData threeDsMethodUrl(String threeDsMethodUrl) {
    this.threeDsMethodUrl = JsonNullable.<String>of(threeDsMethodUrl);
    
    return this;
  }

   /**
   * ThreeDS method url
   * @return threeDsMethodUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getThreeDsMethodUrl() {
        return threeDsMethodUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_THREE_DS_METHOD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getThreeDsMethodUrl_JsonNullable() {
    return threeDsMethodUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_THREE_DS_METHOD_URL)
  public void setThreeDsMethodUrl_JsonNullable(JsonNullable<String> threeDsMethodUrl) {
    this.threeDsMethodUrl = threeDsMethodUrl;
  }

  public void setThreeDsMethodUrl(String threeDsMethodUrl) {
    this.threeDsMethodUrl = JsonNullable.<String>of(threeDsMethodUrl);
  }


  public ThreeDsMethodData threeDsMethodKey(ThreeDsMethodKeyEnum threeDsMethodKey) {
    
    this.threeDsMethodKey = threeDsMethodKey;
    return this;
  }

   /**
   * Get threeDsMethodKey
   * @return threeDsMethodKey
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_THREE_DS_METHOD_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ThreeDsMethodKeyEnum getThreeDsMethodKey() {
    return threeDsMethodKey;
  }


  @JsonProperty(JSON_PROPERTY_THREE_DS_METHOD_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreeDsMethodKey(ThreeDsMethodKeyEnum threeDsMethodKey) {
    this.threeDsMethodKey = threeDsMethodKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDsMethodData threeDsMethodData = (ThreeDsMethodData) o;
    return Objects.equals(this.threeDsMethodDataSubmission, threeDsMethodData.threeDsMethodDataSubmission) &&
        equalsNullable(this.threeDsMethodData, threeDsMethodData.threeDsMethodData) &&
        equalsNullable(this.threeDsMethodUrl, threeDsMethodData.threeDsMethodUrl) &&
        Objects.equals(this.threeDsMethodKey, threeDsMethodData.threeDsMethodKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDsMethodDataSubmission, hashCodeNullable(threeDsMethodData), hashCodeNullable(threeDsMethodUrl), threeDsMethodKey);
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
    sb.append("class ThreeDsMethodData {\n");
    sb.append("    threeDsMethodDataSubmission: ").append(toIndentedString(threeDsMethodDataSubmission)).append("\n");
    sb.append("    threeDsMethodData: ").append(toIndentedString(threeDsMethodData)).append("\n");
    sb.append("    threeDsMethodUrl: ").append(toIndentedString(threeDsMethodUrl)).append("\n");
    sb.append("    threeDsMethodKey: ").append(toIndentedString(threeDsMethodKey)).append("\n");
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


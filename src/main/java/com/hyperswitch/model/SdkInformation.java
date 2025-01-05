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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SDK Information if request is from SDK
 */
@JsonPropertyOrder({
  SdkInformation.JSON_PROPERTY_SDK_APP_ID,
  SdkInformation.JSON_PROPERTY_SDK_ENC_DATA,
  SdkInformation.JSON_PROPERTY_SDK_EPHEM_PUB_KEY,
  SdkInformation.JSON_PROPERTY_SDK_TRANS_ID,
  SdkInformation.JSON_PROPERTY_SDK_REFERENCE_NUMBER,
  SdkInformation.JSON_PROPERTY_SDK_MAX_TIMEOUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class SdkInformation {
  public static final String JSON_PROPERTY_SDK_APP_ID = "sdk_app_id";
  @javax.annotation.Nonnull
  private String sdkAppId;

  public static final String JSON_PROPERTY_SDK_ENC_DATA = "sdk_enc_data";
  @javax.annotation.Nonnull
  private String sdkEncData;

  public static final String JSON_PROPERTY_SDK_EPHEM_PUB_KEY = "sdk_ephem_pub_key";
  @javax.annotation.Nonnull
  private Map<String, String> sdkEphemPubKey = new HashMap<>();

  public static final String JSON_PROPERTY_SDK_TRANS_ID = "sdk_trans_id";
  @javax.annotation.Nonnull
  private String sdkTransId;

  public static final String JSON_PROPERTY_SDK_REFERENCE_NUMBER = "sdk_reference_number";
  @javax.annotation.Nonnull
  private String sdkReferenceNumber;

  public static final String JSON_PROPERTY_SDK_MAX_TIMEOUT = "sdk_max_timeout";
  @javax.annotation.Nonnull
  private Integer sdkMaxTimeout;

  public SdkInformation() {
  }

  public SdkInformation sdkAppId(@javax.annotation.Nonnull String sdkAppId) {
    
    this.sdkAppId = sdkAppId;
    return this;
  }

  /**
   * Unique ID created on installations of the 3DS Requestor App on a Consumer Device
   * @return sdkAppId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SDK_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSdkAppId() {
    return sdkAppId;
  }


  @JsonProperty(JSON_PROPERTY_SDK_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSdkAppId(@javax.annotation.Nonnull String sdkAppId) {
    this.sdkAppId = sdkAppId;
  }


  public SdkInformation sdkEncData(@javax.annotation.Nonnull String sdkEncData) {
    
    this.sdkEncData = sdkEncData;
    return this;
  }

  /**
   * JWE Object containing data encrypted by the SDK for the DS to decrypt
   * @return sdkEncData
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SDK_ENC_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSdkEncData() {
    return sdkEncData;
  }


  @JsonProperty(JSON_PROPERTY_SDK_ENC_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSdkEncData(@javax.annotation.Nonnull String sdkEncData) {
    this.sdkEncData = sdkEncData;
  }


  public SdkInformation sdkEphemPubKey(@javax.annotation.Nonnull Map<String, String> sdkEphemPubKey) {
    
    this.sdkEphemPubKey = sdkEphemPubKey;
    return this;
  }

  public SdkInformation putSdkEphemPubKeyItem(String key, String sdkEphemPubKeyItem) {
    this.sdkEphemPubKey.put(key, sdkEphemPubKeyItem);
    return this;
  }

  /**
   * Public key component of the ephemeral key pair generated by the 3DS SDK
   * @return sdkEphemPubKey
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SDK_EPHEM_PUB_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, String> getSdkEphemPubKey() {
    return sdkEphemPubKey;
  }


  @JsonProperty(JSON_PROPERTY_SDK_EPHEM_PUB_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSdkEphemPubKey(@javax.annotation.Nonnull Map<String, String> sdkEphemPubKey) {
    this.sdkEphemPubKey = sdkEphemPubKey;
  }


  public SdkInformation sdkTransId(@javax.annotation.Nonnull String sdkTransId) {
    
    this.sdkTransId = sdkTransId;
    return this;
  }

  /**
   * Unique transaction identifier assigned by the 3DS SDK
   * @return sdkTransId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SDK_TRANS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSdkTransId() {
    return sdkTransId;
  }


  @JsonProperty(JSON_PROPERTY_SDK_TRANS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSdkTransId(@javax.annotation.Nonnull String sdkTransId) {
    this.sdkTransId = sdkTransId;
  }


  public SdkInformation sdkReferenceNumber(@javax.annotation.Nonnull String sdkReferenceNumber) {
    
    this.sdkReferenceNumber = sdkReferenceNumber;
    return this;
  }

  /**
   * Identifies the vendor and version for the 3DS SDK that is integrated in a 3DS Requestor App
   * @return sdkReferenceNumber
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SDK_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSdkReferenceNumber() {
    return sdkReferenceNumber;
  }


  @JsonProperty(JSON_PROPERTY_SDK_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSdkReferenceNumber(@javax.annotation.Nonnull String sdkReferenceNumber) {
    this.sdkReferenceNumber = sdkReferenceNumber;
  }


  public SdkInformation sdkMaxTimeout(@javax.annotation.Nonnull Integer sdkMaxTimeout) {
    
    this.sdkMaxTimeout = sdkMaxTimeout;
    return this;
  }

  /**
   * Indicates maximum amount of time in minutes
   * minimum: 0
   * @return sdkMaxTimeout
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SDK_MAX_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSdkMaxTimeout() {
    return sdkMaxTimeout;
  }


  @JsonProperty(JSON_PROPERTY_SDK_MAX_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSdkMaxTimeout(@javax.annotation.Nonnull Integer sdkMaxTimeout) {
    this.sdkMaxTimeout = sdkMaxTimeout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SdkInformation sdkInformation = (SdkInformation) o;
    return Objects.equals(this.sdkAppId, sdkInformation.sdkAppId) &&
        Objects.equals(this.sdkEncData, sdkInformation.sdkEncData) &&
        Objects.equals(this.sdkEphemPubKey, sdkInformation.sdkEphemPubKey) &&
        Objects.equals(this.sdkTransId, sdkInformation.sdkTransId) &&
        Objects.equals(this.sdkReferenceNumber, sdkInformation.sdkReferenceNumber) &&
        Objects.equals(this.sdkMaxTimeout, sdkInformation.sdkMaxTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdkAppId, sdkEncData, sdkEphemPubKey, sdkTransId, sdkReferenceNumber, sdkMaxTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SdkInformation {\n");
    sb.append("    sdkAppId: ").append(toIndentedString(sdkAppId)).append("\n");
    sb.append("    sdkEncData: ").append(toIndentedString(sdkEncData)).append("\n");
    sb.append("    sdkEphemPubKey: ").append(toIndentedString(sdkEphemPubKey)).append("\n");
    sb.append("    sdkTransId: ").append(toIndentedString(sdkTransId)).append("\n");
    sb.append("    sdkReferenceNumber: ").append(toIndentedString(sdkReferenceNumber)).append("\n");
    sb.append("    sdkMaxTimeout: ").append(toIndentedString(sdkMaxTimeout)).append("\n");
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


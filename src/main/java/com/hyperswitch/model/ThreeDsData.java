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
import com.hyperswitch.model.PollConfigResponse;
import com.hyperswitch.model.ThreeDsMethodData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ThreeDsData
 */
@JsonPropertyOrder({
  ThreeDsData.JSON_PROPERTY_THREE_DS_AUTHENTICATION_URL,
  ThreeDsData.JSON_PROPERTY_THREE_DS_AUTHORIZE_URL,
  ThreeDsData.JSON_PROPERTY_THREE_DS_METHOD_DETAILS,
  ThreeDsData.JSON_PROPERTY_POLL_CONFIG,
  ThreeDsData.JSON_PROPERTY_MESSAGE_VERSION,
  ThreeDsData.JSON_PROPERTY_DIRECTORY_SERVER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ThreeDsData {
  public static final String JSON_PROPERTY_THREE_DS_AUTHENTICATION_URL = "three_ds_authentication_url";
  private String threeDsAuthenticationUrl;

  public static final String JSON_PROPERTY_THREE_DS_AUTHORIZE_URL = "three_ds_authorize_url";
  private String threeDsAuthorizeUrl;

  public static final String JSON_PROPERTY_THREE_DS_METHOD_DETAILS = "three_ds_method_details";
  private ThreeDsMethodData threeDsMethodDetails;

  public static final String JSON_PROPERTY_POLL_CONFIG = "poll_config";
  private PollConfigResponse pollConfig;

  public static final String JSON_PROPERTY_MESSAGE_VERSION = "message_version";
  private JsonNullable<String> messageVersion = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DIRECTORY_SERVER_ID = "directory_server_id";
  private JsonNullable<String> directoryServerId = JsonNullable.<String>undefined();

  public ThreeDsData() { 
  }

  public ThreeDsData threeDsAuthenticationUrl(String threeDsAuthenticationUrl) {
    
    this.threeDsAuthenticationUrl = threeDsAuthenticationUrl;
    return this;
  }

   /**
   * ThreeDS authentication url - to initiate authentication
   * @return threeDsAuthenticationUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ThreeDS authentication url - to initiate authentication")
  @JsonProperty(JSON_PROPERTY_THREE_DS_AUTHENTICATION_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getThreeDsAuthenticationUrl() {
    return threeDsAuthenticationUrl;
  }


  @JsonProperty(JSON_PROPERTY_THREE_DS_AUTHENTICATION_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreeDsAuthenticationUrl(String threeDsAuthenticationUrl) {
    this.threeDsAuthenticationUrl = threeDsAuthenticationUrl;
  }


  public ThreeDsData threeDsAuthorizeUrl(String threeDsAuthorizeUrl) {
    
    this.threeDsAuthorizeUrl = threeDsAuthorizeUrl;
    return this;
  }

   /**
   * ThreeDS authorize url - to complete the payment authorization after authentication
   * @return threeDsAuthorizeUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ThreeDS authorize url - to complete the payment authorization after authentication")
  @JsonProperty(JSON_PROPERTY_THREE_DS_AUTHORIZE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getThreeDsAuthorizeUrl() {
    return threeDsAuthorizeUrl;
  }


  @JsonProperty(JSON_PROPERTY_THREE_DS_AUTHORIZE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreeDsAuthorizeUrl(String threeDsAuthorizeUrl) {
    this.threeDsAuthorizeUrl = threeDsAuthorizeUrl;
  }


  public ThreeDsData threeDsMethodDetails(ThreeDsMethodData threeDsMethodDetails) {
    
    this.threeDsMethodDetails = threeDsMethodDetails;
    return this;
  }

   /**
   * Get threeDsMethodDetails
   * @return threeDsMethodDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_THREE_DS_METHOD_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ThreeDsMethodData getThreeDsMethodDetails() {
    return threeDsMethodDetails;
  }


  @JsonProperty(JSON_PROPERTY_THREE_DS_METHOD_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreeDsMethodDetails(ThreeDsMethodData threeDsMethodDetails) {
    this.threeDsMethodDetails = threeDsMethodDetails;
  }


  public ThreeDsData pollConfig(PollConfigResponse pollConfig) {
    
    this.pollConfig = pollConfig;
    return this;
  }

   /**
   * Get pollConfig
   * @return pollConfig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_POLL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PollConfigResponse getPollConfig() {
    return pollConfig;
  }


  @JsonProperty(JSON_PROPERTY_POLL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPollConfig(PollConfigResponse pollConfig) {
    this.pollConfig = pollConfig;
  }


  public ThreeDsData messageVersion(String messageVersion) {
    this.messageVersion = JsonNullable.<String>of(messageVersion);
    
    return this;
  }

   /**
   * Message Version
   * @return messageVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message Version")
  @JsonIgnore

  public String getMessageVersion() {
        return messageVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMessageVersion_JsonNullable() {
    return messageVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE_VERSION)
  public void setMessageVersion_JsonNullable(JsonNullable<String> messageVersion) {
    this.messageVersion = messageVersion;
  }

  public void setMessageVersion(String messageVersion) {
    this.messageVersion = JsonNullable.<String>of(messageVersion);
  }


  public ThreeDsData directoryServerId(String directoryServerId) {
    this.directoryServerId = JsonNullable.<String>of(directoryServerId);
    
    return this;
  }

   /**
   * Directory Server ID
   * @return directoryServerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Directory Server ID")
  @JsonIgnore

  public String getDirectoryServerId() {
        return directoryServerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIRECTORY_SERVER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDirectoryServerId_JsonNullable() {
    return directoryServerId;
  }
  
  @JsonProperty(JSON_PROPERTY_DIRECTORY_SERVER_ID)
  public void setDirectoryServerId_JsonNullable(JsonNullable<String> directoryServerId) {
    this.directoryServerId = directoryServerId;
  }

  public void setDirectoryServerId(String directoryServerId) {
    this.directoryServerId = JsonNullable.<String>of(directoryServerId);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDsData threeDsData = (ThreeDsData) o;
    return Objects.equals(this.threeDsAuthenticationUrl, threeDsData.threeDsAuthenticationUrl) &&
        Objects.equals(this.threeDsAuthorizeUrl, threeDsData.threeDsAuthorizeUrl) &&
        Objects.equals(this.threeDsMethodDetails, threeDsData.threeDsMethodDetails) &&
        Objects.equals(this.pollConfig, threeDsData.pollConfig) &&
        equalsNullable(this.messageVersion, threeDsData.messageVersion) &&
        equalsNullable(this.directoryServerId, threeDsData.directoryServerId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDsAuthenticationUrl, threeDsAuthorizeUrl, threeDsMethodDetails, pollConfig, hashCodeNullable(messageVersion), hashCodeNullable(directoryServerId));
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
    sb.append("class ThreeDsData {\n");
    sb.append("    threeDsAuthenticationUrl: ").append(toIndentedString(threeDsAuthenticationUrl)).append("\n");
    sb.append("    threeDsAuthorizeUrl: ").append(toIndentedString(threeDsAuthorizeUrl)).append("\n");
    sb.append("    threeDsMethodDetails: ").append(toIndentedString(threeDsMethodDetails)).append("\n");
    sb.append("    pollConfig: ").append(toIndentedString(pollConfig)).append("\n");
    sb.append("    messageVersion: ").append(toIndentedString(messageVersion)).append("\n");
    sb.append("    directoryServerId: ").append(toIndentedString(directoryServerId)).append("\n");
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


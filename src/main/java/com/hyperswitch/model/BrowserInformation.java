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
 * Browser information to be used for 3DS 2.0
 */
@JsonPropertyOrder({
  BrowserInformation.JSON_PROPERTY_COLOR_DEPTH,
  BrowserInformation.JSON_PROPERTY_JAVA_ENABLED,
  BrowserInformation.JSON_PROPERTY_JAVA_SCRIPT_ENABLED,
  BrowserInformation.JSON_PROPERTY_LANGUAGE,
  BrowserInformation.JSON_PROPERTY_SCREEN_HEIGHT,
  BrowserInformation.JSON_PROPERTY_SCREEN_WIDTH,
  BrowserInformation.JSON_PROPERTY_TIME_ZONE,
  BrowserInformation.JSON_PROPERTY_IP_ADDRESS,
  BrowserInformation.JSON_PROPERTY_ACCEPT_HEADER,
  BrowserInformation.JSON_PROPERTY_USER_AGENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BrowserInformation {
  public static final String JSON_PROPERTY_COLOR_DEPTH = "color_depth";
  private JsonNullable<Integer> colorDepth = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_JAVA_ENABLED = "java_enabled";
  private JsonNullable<Boolean> javaEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_JAVA_SCRIPT_ENABLED = "java_script_enabled";
  private JsonNullable<Boolean> javaScriptEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private JsonNullable<String> language = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SCREEN_HEIGHT = "screen_height";
  private JsonNullable<Integer> screenHeight = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SCREEN_WIDTH = "screen_width";
  private JsonNullable<Integer> screenWidth = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TIME_ZONE = "time_zone";
  private JsonNullable<Integer> timeZone = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private JsonNullable<String> ipAddress = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCEPT_HEADER = "accept_header";
  private JsonNullable<String> acceptHeader = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_AGENT = "user_agent";
  private JsonNullable<String> userAgent = JsonNullable.<String>undefined();

  public BrowserInformation() {
  }

  public BrowserInformation colorDepth(Integer colorDepth) {
    this.colorDepth = JsonNullable.<Integer>of(colorDepth);
    
    return this;
  }

   /**
   * Color depth supported by the browser
   * minimum: 0
   * @return colorDepth
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getColorDepth() {
        return colorDepth.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COLOR_DEPTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getColorDepth_JsonNullable() {
    return colorDepth;
  }
  
  @JsonProperty(JSON_PROPERTY_COLOR_DEPTH)
  public void setColorDepth_JsonNullable(JsonNullable<Integer> colorDepth) {
    this.colorDepth = colorDepth;
  }

  public void setColorDepth(Integer colorDepth) {
    this.colorDepth = JsonNullable.<Integer>of(colorDepth);
  }


  public BrowserInformation javaEnabled(Boolean javaEnabled) {
    this.javaEnabled = JsonNullable.<Boolean>of(javaEnabled);
    
    return this;
  }

   /**
   * Whether java is enabled in the browser
   * @return javaEnabled
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getJavaEnabled() {
        return javaEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JAVA_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getJavaEnabled_JsonNullable() {
    return javaEnabled;
  }
  
  @JsonProperty(JSON_PROPERTY_JAVA_ENABLED)
  public void setJavaEnabled_JsonNullable(JsonNullable<Boolean> javaEnabled) {
    this.javaEnabled = javaEnabled;
  }

  public void setJavaEnabled(Boolean javaEnabled) {
    this.javaEnabled = JsonNullable.<Boolean>of(javaEnabled);
  }


  public BrowserInformation javaScriptEnabled(Boolean javaScriptEnabled) {
    this.javaScriptEnabled = JsonNullable.<Boolean>of(javaScriptEnabled);
    
    return this;
  }

   /**
   * Whether javascript is enabled in the browser
   * @return javaScriptEnabled
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getJavaScriptEnabled() {
        return javaScriptEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getJavaScriptEnabled_JsonNullable() {
    return javaScriptEnabled;
  }
  
  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_ENABLED)
  public void setJavaScriptEnabled_JsonNullable(JsonNullable<Boolean> javaScriptEnabled) {
    this.javaScriptEnabled = javaScriptEnabled;
  }

  public void setJavaScriptEnabled(Boolean javaScriptEnabled) {
    this.javaScriptEnabled = JsonNullable.<Boolean>of(javaScriptEnabled);
  }


  public BrowserInformation language(String language) {
    this.language = JsonNullable.<String>of(language);
    
    return this;
  }

   /**
   * Language supported
   * @return language
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLanguage() {
        return language.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLanguage_JsonNullable() {
    return language;
  }
  
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  public void setLanguage_JsonNullable(JsonNullable<String> language) {
    this.language = language;
  }

  public void setLanguage(String language) {
    this.language = JsonNullable.<String>of(language);
  }


  public BrowserInformation screenHeight(Integer screenHeight) {
    this.screenHeight = JsonNullable.<Integer>of(screenHeight);
    
    return this;
  }

   /**
   * The screen height in pixels
   * minimum: 0
   * @return screenHeight
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getScreenHeight() {
        return screenHeight.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCREEN_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getScreenHeight_JsonNullable() {
    return screenHeight;
  }
  
  @JsonProperty(JSON_PROPERTY_SCREEN_HEIGHT)
  public void setScreenHeight_JsonNullable(JsonNullable<Integer> screenHeight) {
    this.screenHeight = screenHeight;
  }

  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = JsonNullable.<Integer>of(screenHeight);
  }


  public BrowserInformation screenWidth(Integer screenWidth) {
    this.screenWidth = JsonNullable.<Integer>of(screenWidth);
    
    return this;
  }

   /**
   * The screen width in pixels
   * minimum: 0
   * @return screenWidth
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getScreenWidth() {
        return screenWidth.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCREEN_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getScreenWidth_JsonNullable() {
    return screenWidth;
  }
  
  @JsonProperty(JSON_PROPERTY_SCREEN_WIDTH)
  public void setScreenWidth_JsonNullable(JsonNullable<Integer> screenWidth) {
    this.screenWidth = screenWidth;
  }

  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = JsonNullable.<Integer>of(screenWidth);
  }


  public BrowserInformation timeZone(Integer timeZone) {
    this.timeZone = JsonNullable.<Integer>of(timeZone);
    
    return this;
  }

   /**
   * Time zone of the client
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getTimeZone() {
        return timeZone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getTimeZone_JsonNullable() {
    return timeZone;
  }
  
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  public void setTimeZone_JsonNullable(JsonNullable<Integer> timeZone) {
    this.timeZone = timeZone;
  }

  public void setTimeZone(Integer timeZone) {
    this.timeZone = JsonNullable.<Integer>of(timeZone);
  }


  public BrowserInformation ipAddress(String ipAddress) {
    this.ipAddress = JsonNullable.<String>of(ipAddress);
    
    return this;
  }

   /**
   * Ip address of the client
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getIpAddress() {
        return ipAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIpAddress_JsonNullable() {
    return ipAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  public void setIpAddress_JsonNullable(JsonNullable<String> ipAddress) {
    this.ipAddress = ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = JsonNullable.<String>of(ipAddress);
  }


  public BrowserInformation acceptHeader(String acceptHeader) {
    this.acceptHeader = JsonNullable.<String>of(acceptHeader);
    
    return this;
  }

   /**
   * List of headers that are accepted
   * @return acceptHeader
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAcceptHeader() {
        return acceptHeader.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCEPT_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAcceptHeader_JsonNullable() {
    return acceptHeader;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCEPT_HEADER)
  public void setAcceptHeader_JsonNullable(JsonNullable<String> acceptHeader) {
    this.acceptHeader = acceptHeader;
  }

  public void setAcceptHeader(String acceptHeader) {
    this.acceptHeader = JsonNullable.<String>of(acceptHeader);
  }


  public BrowserInformation userAgent(String userAgent) {
    this.userAgent = JsonNullable.<String>of(userAgent);
    
    return this;
  }

   /**
   * User-agent of the browser
   * @return userAgent
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUserAgent() {
        return userAgent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUserAgent_JsonNullable() {
    return userAgent;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  public void setUserAgent_JsonNullable(JsonNullable<String> userAgent) {
    this.userAgent = userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = JsonNullable.<String>of(userAgent);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowserInformation browserInformation = (BrowserInformation) o;
    return equalsNullable(this.colorDepth, browserInformation.colorDepth) &&
        equalsNullable(this.javaEnabled, browserInformation.javaEnabled) &&
        equalsNullable(this.javaScriptEnabled, browserInformation.javaScriptEnabled) &&
        equalsNullable(this.language, browserInformation.language) &&
        equalsNullable(this.screenHeight, browserInformation.screenHeight) &&
        equalsNullable(this.screenWidth, browserInformation.screenWidth) &&
        equalsNullable(this.timeZone, browserInformation.timeZone) &&
        equalsNullable(this.ipAddress, browserInformation.ipAddress) &&
        equalsNullable(this.acceptHeader, browserInformation.acceptHeader) &&
        equalsNullable(this.userAgent, browserInformation.userAgent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(colorDepth), hashCodeNullable(javaEnabled), hashCodeNullable(javaScriptEnabled), hashCodeNullable(language), hashCodeNullable(screenHeight), hashCodeNullable(screenWidth), hashCodeNullable(timeZone), hashCodeNullable(ipAddress), hashCodeNullable(acceptHeader), hashCodeNullable(userAgent));
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
    sb.append("class BrowserInformation {\n");
    sb.append("    colorDepth: ").append(toIndentedString(colorDepth)).append("\n");
    sb.append("    javaEnabled: ").append(toIndentedString(javaEnabled)).append("\n");
    sb.append("    javaScriptEnabled: ").append(toIndentedString(javaScriptEnabled)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    acceptHeader: ").append(toIndentedString(acceptHeader)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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


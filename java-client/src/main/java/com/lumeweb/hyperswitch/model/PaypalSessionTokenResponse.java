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
import com.lumeweb.hyperswitch.model.SdkNextAction;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * PaypalSessionTokenResponse
 */
@JsonPropertyOrder({
  PaypalSessionTokenResponse.JSON_PROPERTY_CONNECTOR,
  PaypalSessionTokenResponse.JSON_PROPERTY_SESSION_TOKEN,
  PaypalSessionTokenResponse.JSON_PROPERTY_SDK_NEXT_ACTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class PaypalSessionTokenResponse {
  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  @javax.annotation.Nonnull
  private String connector;

  public static final String JSON_PROPERTY_SESSION_TOKEN = "session_token";
  @javax.annotation.Nonnull
  private String sessionToken;

  public static final String JSON_PROPERTY_SDK_NEXT_ACTION = "sdk_next_action";
  @javax.annotation.Nonnull
  private SdkNextAction sdkNextAction;

  public PaypalSessionTokenResponse() { 
  }

  public PaypalSessionTokenResponse connector(@javax.annotation.Nonnull String connector) {
    this.connector = connector;
    return this;
  }

  /**
   * Name of the connector
   * @return connector
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(@javax.annotation.Nonnull String connector) {
    this.connector = connector;
  }


  public PaypalSessionTokenResponse sessionToken(@javax.annotation.Nonnull String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

  /**
   * The session token for PayPal
   * @return sessionToken
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SESSION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSessionToken() {
    return sessionToken;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessionToken(@javax.annotation.Nonnull String sessionToken) {
    this.sessionToken = sessionToken;
  }


  public PaypalSessionTokenResponse sdkNextAction(@javax.annotation.Nonnull SdkNextAction sdkNextAction) {
    this.sdkNextAction = sdkNextAction;
    return this;
  }

  /**
   * Get sdkNextAction
   * @return sdkNextAction
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SDK_NEXT_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SdkNextAction getSdkNextAction() {
    return sdkNextAction;
  }


  @JsonProperty(JSON_PROPERTY_SDK_NEXT_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSdkNextAction(@javax.annotation.Nonnull SdkNextAction sdkNextAction) {
    this.sdkNextAction = sdkNextAction;
  }


  /**
   * Return true if this PaypalSessionTokenResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaypalSessionTokenResponse paypalSessionTokenResponse = (PaypalSessionTokenResponse) o;
    return Objects.equals(this.connector, paypalSessionTokenResponse.connector) &&
        Objects.equals(this.sessionToken, paypalSessionTokenResponse.sessionToken) &&
        Objects.equals(this.sdkNextAction, paypalSessionTokenResponse.sdkNextAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector, sessionToken, sdkNextAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaypalSessionTokenResponse {\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("    sdkNextAction: ").append(toIndentedString(sdkNextAction)).append("\n");
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

    // add `connector` to the URL query string
    if (getConnector() != null) {
      joiner.add(String.format("%sconnector%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConnector()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `session_token` to the URL query string
    if (getSessionToken() != null) {
      joiner.add(String.format("%ssession_token%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSessionToken()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sdk_next_action` to the URL query string
    if (getSdkNextAction() != null) {
      joiner.add(getSdkNextAction().toUrlQueryString(prefix + "sdk_next_action" + suffix));
    }

    return joiner.toString();
  }
}


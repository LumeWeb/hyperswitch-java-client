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
 * SessionTokenOneOf3
 */
@JsonPropertyOrder({
  SessionTokenOneOf3.JSON_PROPERTY_CONNECTOR,
  SessionTokenOneOf3.JSON_PROPERTY_SESSION_TOKEN,
  SessionTokenOneOf3.JSON_PROPERTY_SDK_NEXT_ACTION,
  SessionTokenOneOf3.JSON_PROPERTY_WALLET_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class SessionTokenOneOf3 {
  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  @javax.annotation.Nonnull
  private String connector;

  public static final String JSON_PROPERTY_SESSION_TOKEN = "session_token";
  @javax.annotation.Nonnull
  private String sessionToken;

  public static final String JSON_PROPERTY_SDK_NEXT_ACTION = "sdk_next_action";
  @javax.annotation.Nonnull
  private SdkNextAction sdkNextAction;

  /**
   * Gets or Sets walletName
   */
  public enum WalletNameEnum {
    PAYPAL(String.valueOf("paypal"));

    private String value;

    WalletNameEnum(String value) {
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
    public static WalletNameEnum fromValue(String value) {
      for (WalletNameEnum b : WalletNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WALLET_NAME = "wallet_name";
  @javax.annotation.Nonnull
  private WalletNameEnum walletName;

  public SessionTokenOneOf3() { 
  }

  public SessionTokenOneOf3 connector(@javax.annotation.Nonnull String connector) {
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


  public SessionTokenOneOf3 sessionToken(@javax.annotation.Nonnull String sessionToken) {
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


  public SessionTokenOneOf3 sdkNextAction(@javax.annotation.Nonnull SdkNextAction sdkNextAction) {
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


  public SessionTokenOneOf3 walletName(@javax.annotation.Nonnull WalletNameEnum walletName) {
    this.walletName = walletName;
    return this;
  }

  /**
   * Get walletName
   * @return walletName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WALLET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WalletNameEnum getWalletName() {
    return walletName;
  }


  @JsonProperty(JSON_PROPERTY_WALLET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWalletName(@javax.annotation.Nonnull WalletNameEnum walletName) {
    this.walletName = walletName;
  }


  /**
   * Return true if this SessionToken_oneOf_3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionTokenOneOf3 sessionTokenOneOf3 = (SessionTokenOneOf3) o;
    return Objects.equals(this.connector, sessionTokenOneOf3.connector) &&
        Objects.equals(this.sessionToken, sessionTokenOneOf3.sessionToken) &&
        Objects.equals(this.sdkNextAction, sessionTokenOneOf3.sdkNextAction) &&
        Objects.equals(this.walletName, sessionTokenOneOf3.walletName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector, sessionToken, sdkNextAction, walletName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionTokenOneOf3 {\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("    sdkNextAction: ").append(toIndentedString(sdkNextAction)).append("\n");
    sb.append("    walletName: ").append(toIndentedString(walletName)).append("\n");
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

    // add `wallet_name` to the URL query string
    if (getWalletName() != null) {
      joiner.add(String.format("%swallet_name%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getWalletName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
* SessionTokenOneOf2
*/
    @JsonPropertyOrder({
        SessionTokenOneOf2.JSON_PROPERTY_SESSION_TOKEN,
        SessionTokenOneOf2.JSON_PROPERTY_SESSION_ID,
        SessionTokenOneOf2.JSON_PROPERTY_WALLET_NAME
    })
            @JsonTypeName("SessionToken_oneOf_2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class SessionTokenOneOf2 {
        public static final String JSON_PROPERTY_SESSION_TOKEN = "session_token";
    @javax.annotation.Nonnull
            private String sessionToken;

        public static final String JSON_PROPERTY_SESSION_ID = "session_id";
    @javax.annotation.Nonnull
            private String sessionId;

              /**
   * Gets or Sets walletName
   */
  public enum WalletNameEnum {
    KLARNA(String.valueOf("klarna"));

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

public SessionTokenOneOf2() {
}

        public SessionTokenOneOf2 sessionToken(@javax.annotation.Nonnull String sessionToken) {
        
        this.sessionToken = sessionToken;
        return this;
        }

    /**
        * The session token for Klarna
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

        public SessionTokenOneOf2 sessionId(@javax.annotation.Nonnull String sessionId) {
        
        this.sessionId = sessionId;
        return this;
        }

    /**
        * The identifier for the session
    * @return sessionId
    */
    @javax.annotation.Nonnull
      @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getSessionId() {
        return sessionId;
    }


          @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessionId(@javax.annotation.Nonnull String sessionId) {
            this.sessionId = sessionId;
        }

        public SessionTokenOneOf2 walletName(@javax.annotation.Nonnull WalletNameEnum walletName) {
        
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

@Override
public boolean equals(Object o) {
    if (this == o) {
    return true;
    }
    if (o == null || getClass() != o.getClass()) {
    return false;
    }
        SessionTokenOneOf2 sessionTokenOneOf2 = (SessionTokenOneOf2) o;
        return Objects.equals(this.sessionToken, sessionTokenOneOf2.sessionToken) &&
        Objects.equals(this.sessionId, sessionTokenOneOf2.sessionId) &&
        Objects.equals(this.walletName, sessionTokenOneOf2.walletName);
}

    @Override
    public int hashCode() {
        return Objects.hash(sessionToken, sessionId, walletName);
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionTokenOneOf2 {\n");
        sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

            // add `session_token` to the URL query string
                        if (getSessionToken() != null) {
                        try {
                        joiner.add(String.format("%ssession_token%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSessionToken()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `session_id` to the URL query string
                        if (getSessionId() != null) {
                        try {
                        joiner.add(String.format("%ssession_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSessionId()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

            // add `wallet_name` to the URL query string
                        if (getWalletName() != null) {
                        try {
                        joiner.add(String.format("%swallet_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWalletName()), "UTF-8").replaceAll("\\+", "%20")));
                        } catch (UnsupportedEncodingException e) {
                        // Should never happen, UTF-8 is always supported
                        throw new RuntimeException(e);
                        }
                        }

        return joiner.toString();
        }

    }


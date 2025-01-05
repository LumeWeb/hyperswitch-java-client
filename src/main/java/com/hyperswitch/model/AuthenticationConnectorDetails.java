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
import com.hyperswitch.model.AuthenticationConnectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.hyperswitch.client.ApiClient;
/**
 * AuthenticationConnectorDetails
 */
@JsonPropertyOrder({
  AuthenticationConnectorDetails.JSON_PROPERTY_AUTHENTICATION_CONNECTORS,
  AuthenticationConnectorDetails.JSON_PROPERTY_THREE_DS_REQUESTOR_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class AuthenticationConnectorDetails {
  public static final String JSON_PROPERTY_AUTHENTICATION_CONNECTORS = "authentication_connectors";
  @javax.annotation.Nonnull
  private List<AuthenticationConnectors> authenticationConnectors = new ArrayList<>();

  public static final String JSON_PROPERTY_THREE_DS_REQUESTOR_URL = "three_ds_requestor_url";
  @javax.annotation.Nonnull
  private String threeDsRequestorUrl;

  public AuthenticationConnectorDetails() { 
  }

  public AuthenticationConnectorDetails authenticationConnectors(@javax.annotation.Nonnull List<AuthenticationConnectors> authenticationConnectors) {
    this.authenticationConnectors = authenticationConnectors;
    return this;
  }

  public AuthenticationConnectorDetails addAuthenticationConnectorsItem(AuthenticationConnectors authenticationConnectorsItem) {
    if (this.authenticationConnectors == null) {
      this.authenticationConnectors = new ArrayList<>();
    }
    this.authenticationConnectors.add(authenticationConnectorsItem);
    return this;
  }

  /**
   * List of authentication connectors
   * @return authenticationConnectors
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_CONNECTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AuthenticationConnectors> getAuthenticationConnectors() {
    return authenticationConnectors;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_CONNECTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthenticationConnectors(@javax.annotation.Nonnull List<AuthenticationConnectors> authenticationConnectors) {
    this.authenticationConnectors = authenticationConnectors;
  }


  public AuthenticationConnectorDetails threeDsRequestorUrl(@javax.annotation.Nonnull String threeDsRequestorUrl) {
    this.threeDsRequestorUrl = threeDsRequestorUrl;
    return this;
  }

  /**
   * URL of the (customer service) website that will be shown to the shopper in case of technical errors during the 3D Secure 2 process.
   * @return threeDsRequestorUrl
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_THREE_DS_REQUESTOR_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getThreeDsRequestorUrl() {
    return threeDsRequestorUrl;
  }


  @JsonProperty(JSON_PROPERTY_THREE_DS_REQUESTOR_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreeDsRequestorUrl(@javax.annotation.Nonnull String threeDsRequestorUrl) {
    this.threeDsRequestorUrl = threeDsRequestorUrl;
  }


  /**
   * Return true if this AuthenticationConnectorDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationConnectorDetails authenticationConnectorDetails = (AuthenticationConnectorDetails) o;
    return Objects.equals(this.authenticationConnectors, authenticationConnectorDetails.authenticationConnectors) &&
        Objects.equals(this.threeDsRequestorUrl, authenticationConnectorDetails.threeDsRequestorUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationConnectors, threeDsRequestorUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationConnectorDetails {\n");
    sb.append("    authenticationConnectors: ").append(toIndentedString(authenticationConnectors)).append("\n");
    sb.append("    threeDsRequestorUrl: ").append(toIndentedString(threeDsRequestorUrl)).append("\n");
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

    // add `authentication_connectors` to the URL query string
    if (getAuthenticationConnectors() != null) {
      for (int i = 0; i < getAuthenticationConnectors().size(); i++) {
        if (getAuthenticationConnectors().get(i) != null) {
          joiner.add(String.format("%sauthentication_connectors%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(ApiClient.valueToString(getAuthenticationConnectors().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    // add `three_ds_requestor_url` to the URL query string
    if (getThreeDsRequestorUrl() != null) {
      joiner.add(String.format("%sthree_ds_requestor_url%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getThreeDsRequestorUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


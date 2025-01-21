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
 * GpayTokenParameters
 */
@JsonPropertyOrder({
  GpayTokenParameters.JSON_PROPERTY_GATEWAY,
  GpayTokenParameters.JSON_PROPERTY_GATEWAY_MERCHANT_ID,
  GpayTokenParameters.JSON_PROPERTY_STRIPE_VERSION,
  GpayTokenParameters.JSON_PROPERTY_STRIPE_PUBLISHABLE_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class GpayTokenParameters {
  public static final String JSON_PROPERTY_GATEWAY = "gateway";
  @javax.annotation.Nonnull
  private String gateway;

  public static final String JSON_PROPERTY_GATEWAY_MERCHANT_ID = "gateway_merchant_id";
  @javax.annotation.Nullable
  private JsonNullable<String> gatewayMerchantId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STRIPE_VERSION = "stripe:version";
  @javax.annotation.Nullable
  private JsonNullable<String> stripeVersion = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STRIPE_PUBLISHABLE_KEY = "stripe:publishableKey";
  @javax.annotation.Nullable
  private JsonNullable<String> stripePublishableKey = JsonNullable.<String>undefined();

  public GpayTokenParameters() {
  }

  public GpayTokenParameters gateway(@javax.annotation.Nonnull String gateway) {
    
    this.gateway = gateway;
    return this;
  }

  /**
   * The name of the connector
   * @return gateway
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGateway() {
    return gateway;
  }


  @JsonProperty(JSON_PROPERTY_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGateway(@javax.annotation.Nonnull String gateway) {
    this.gateway = gateway;
  }

  public GpayTokenParameters gatewayMerchantId(@javax.annotation.Nullable String gatewayMerchantId) {
    this.gatewayMerchantId = JsonNullable.<String>of(gatewayMerchantId);
    
    return this;
  }

  /**
   * The merchant ID registered in the connector associated
   * @return gatewayMerchantId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getGatewayMerchantId() {
        return gatewayMerchantId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GATEWAY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGatewayMerchantId_JsonNullable() {
    return gatewayMerchantId;
  }
  
  @JsonProperty(JSON_PROPERTY_GATEWAY_MERCHANT_ID)
  public void setGatewayMerchantId_JsonNullable(JsonNullable<String> gatewayMerchantId) {
    this.gatewayMerchantId = gatewayMerchantId;
  }

  public void setGatewayMerchantId(@javax.annotation.Nullable String gatewayMerchantId) {
    this.gatewayMerchantId = JsonNullable.<String>of(gatewayMerchantId);
  }

  public GpayTokenParameters stripeVersion(@javax.annotation.Nullable String stripeVersion) {
    this.stripeVersion = JsonNullable.<String>of(stripeVersion);
    
    return this;
  }

  /**
   * Get stripeVersion
   * @return stripeVersion
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getStripeVersion() {
        return stripeVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STRIPE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStripeVersion_JsonNullable() {
    return stripeVersion;
  }
  
  @JsonProperty(JSON_PROPERTY_STRIPE_VERSION)
  public void setStripeVersion_JsonNullable(JsonNullable<String> stripeVersion) {
    this.stripeVersion = stripeVersion;
  }

  public void setStripeVersion(@javax.annotation.Nullable String stripeVersion) {
    this.stripeVersion = JsonNullable.<String>of(stripeVersion);
  }

  public GpayTokenParameters stripePublishableKey(@javax.annotation.Nullable String stripePublishableKey) {
    this.stripePublishableKey = JsonNullable.<String>of(stripePublishableKey);
    
    return this;
  }

  /**
   * Get stripePublishableKey
   * @return stripePublishableKey
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getStripePublishableKey() {
        return stripePublishableKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STRIPE_PUBLISHABLE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStripePublishableKey_JsonNullable() {
    return stripePublishableKey;
  }
  
  @JsonProperty(JSON_PROPERTY_STRIPE_PUBLISHABLE_KEY)
  public void setStripePublishableKey_JsonNullable(JsonNullable<String> stripePublishableKey) {
    this.stripePublishableKey = stripePublishableKey;
  }

  public void setStripePublishableKey(@javax.annotation.Nullable String stripePublishableKey) {
    this.stripePublishableKey = JsonNullable.<String>of(stripePublishableKey);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpayTokenParameters gpayTokenParameters = (GpayTokenParameters) o;
    return Objects.equals(this.gateway, gpayTokenParameters.gateway) &&
        equalsNullable(this.gatewayMerchantId, gpayTokenParameters.gatewayMerchantId) &&
        equalsNullable(this.stripeVersion, gpayTokenParameters.stripeVersion) &&
        equalsNullable(this.stripePublishableKey, gpayTokenParameters.stripePublishableKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gateway, hashCodeNullable(gatewayMerchantId), hashCodeNullable(stripeVersion), hashCodeNullable(stripePublishableKey));
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
    sb.append("class GpayTokenParameters {\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    gatewayMerchantId: ").append(toIndentedString(gatewayMerchantId)).append("\n");
    sb.append("    stripeVersion: ").append(toIndentedString(stripeVersion)).append("\n");
    sb.append("    stripePublishableKey: ").append(toIndentedString(stripePublishableKey)).append("\n");
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

    // add `gateway` to the URL query string
    if (getGateway() != null) {
      try {
        joiner.add(String.format("%sgateway%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGateway()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `gateway_merchant_id` to the URL query string
    if (getGatewayMerchantId() != null) {
      try {
        joiner.add(String.format("%sgateway_merchant_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGatewayMerchantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `stripe:version` to the URL query string
    if (getStripeVersion() != null) {
      try {
        joiner.add(String.format("%sstripe:version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStripeVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `stripe:publishableKey` to the URL query string
    if (getStripePublishableKey() != null) {
      try {
        joiner.add(String.format("%sstripe:publishableKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStripePublishableKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


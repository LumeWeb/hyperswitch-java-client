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
import com.lumeweb.hyperswitch.model.ApiKeyExpiration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * The response body for retrieving an API Key.
 */
@JsonPropertyOrder({
  RetrieveApiKeyResponse.JSON_PROPERTY_KEY_ID,
  RetrieveApiKeyResponse.JSON_PROPERTY_MERCHANT_ID,
  RetrieveApiKeyResponse.JSON_PROPERTY_NAME,
  RetrieveApiKeyResponse.JSON_PROPERTY_DESCRIPTION,
  RetrieveApiKeyResponse.JSON_PROPERTY_PREFIX,
  RetrieveApiKeyResponse.JSON_PROPERTY_CREATED,
  RetrieveApiKeyResponse.JSON_PROPERTY_EXPIRATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class RetrieveApiKeyResponse {
  public static final String JSON_PROPERTY_KEY_ID = "key_id";
  @javax.annotation.Nonnull
  private String keyId;

  public static final String JSON_PROPERTY_MERCHANT_ID = "merchant_id";
  @javax.annotation.Nonnull
  private String merchantId;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  @javax.annotation.Nonnull
  private String prefix;

  public static final String JSON_PROPERTY_CREATED = "created";
  @javax.annotation.Nonnull
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  @javax.annotation.Nonnull
  private ApiKeyExpiration expiration;

  public RetrieveApiKeyResponse() { 
  }

  public RetrieveApiKeyResponse keyId(@javax.annotation.Nonnull String keyId) {
    this.keyId = keyId;
    return this;
  }

  /**
   * The identifier for the API Key.
   * @return keyId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKeyId() {
    return keyId;
  }


  @JsonProperty(JSON_PROPERTY_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeyId(@javax.annotation.Nonnull String keyId) {
    this.keyId = keyId;
  }


  public RetrieveApiKeyResponse merchantId(@javax.annotation.Nonnull String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * The identifier for the Merchant Account.
   * @return merchantId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMerchantId() {
    return merchantId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantId(@javax.annotation.Nonnull String merchantId) {
    this.merchantId = merchantId;
  }


  public RetrieveApiKeyResponse name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique name for the API Key to help you identify it.
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public RetrieveApiKeyResponse description(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * The description to provide more context about the API Key.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public RetrieveApiKeyResponse prefix(@javax.annotation.Nonnull String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * The first few characters of the plaintext API Key to help you identify it.
   * @return prefix
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrefix(@javax.annotation.Nonnull String prefix) {
    this.prefix = prefix;
  }


  public RetrieveApiKeyResponse created(@javax.annotation.Nonnull OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The time at which the API Key was created.
   * @return created
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(@javax.annotation.Nonnull OffsetDateTime created) {
    this.created = created;
  }


  public RetrieveApiKeyResponse expiration(@javax.annotation.Nonnull ApiKeyExpiration expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * Get expiration
   * @return expiration
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApiKeyExpiration getExpiration() {
    return expiration;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpiration(@javax.annotation.Nonnull ApiKeyExpiration expiration) {
    this.expiration = expiration;
  }


  /**
   * Return true if this RetrieveApiKeyResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveApiKeyResponse retrieveApiKeyResponse = (RetrieveApiKeyResponse) o;
    return Objects.equals(this.keyId, retrieveApiKeyResponse.keyId) &&
        Objects.equals(this.merchantId, retrieveApiKeyResponse.merchantId) &&
        Objects.equals(this.name, retrieveApiKeyResponse.name) &&
        equalsNullable(this.description, retrieveApiKeyResponse.description) &&
        Objects.equals(this.prefix, retrieveApiKeyResponse.prefix) &&
        Objects.equals(this.created, retrieveApiKeyResponse.created) &&
        Objects.equals(this.expiration, retrieveApiKeyResponse.expiration);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyId, merchantId, name, hashCodeNullable(description), prefix, created, expiration);
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
    sb.append("class RetrieveApiKeyResponse {\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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

    // add `key_id` to the URL query string
    if (getKeyId() != null) {
      joiner.add(String.format("%skey_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getKeyId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `merchant_id` to the URL query string
    if (getMerchantId() != null) {
      joiner.add(String.format("%smerchant_id%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMerchantId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `prefix` to the URL query string
    if (getPrefix() != null) {
      joiner.add(String.format("%sprefix%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPrefix()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expiration` to the URL query string
    if (getExpiration() != null) {
      joiner.add(getExpiration().toUrlQueryString(prefix + "expiration" + suffix));
    }

    return joiner.toString();
  }
}


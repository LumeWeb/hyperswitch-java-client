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
import com.hyperswitch.client.model.MerchantRoutingAlgorithm;
import com.hyperswitch.client.model.RoutingDictionaryRecord;
import com.hyperswitch.client.model.RoutingRetrieveResponse;
import java.util.List;
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
 * LinkedRoutingConfigRetrieveResponse
 */
@JsonPropertyOrder({
  LinkedRoutingConfigRetrieveResponse.JSON_PROPERTY_ALGORITHM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class LinkedRoutingConfigRetrieveResponse {
  public static final String JSON_PROPERTY_ALGORITHM = "algorithm";
  @javax.annotation.Nullable
  private JsonNullable<MerchantRoutingAlgorithm> algorithm = JsonNullable.<MerchantRoutingAlgorithm>undefined();

  public LinkedRoutingConfigRetrieveResponse() {
  }

  public LinkedRoutingConfigRetrieveResponse algorithm(@javax.annotation.Nullable MerchantRoutingAlgorithm algorithm) {
    this.algorithm = JsonNullable.<MerchantRoutingAlgorithm>of(algorithm);
    
    return this;
  }

  /**
   * Get algorithm
   * @return algorithm
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public MerchantRoutingAlgorithm getAlgorithm() {
        return algorithm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MerchantRoutingAlgorithm> getAlgorithm_JsonNullable() {
    return algorithm;
  }
  
  @JsonProperty(JSON_PROPERTY_ALGORITHM)
  public void setAlgorithm_JsonNullable(JsonNullable<MerchantRoutingAlgorithm> algorithm) {
    this.algorithm = algorithm;
  }

  public void setAlgorithm(@javax.annotation.Nullable MerchantRoutingAlgorithm algorithm) {
    this.algorithm = JsonNullable.<MerchantRoutingAlgorithm>of(algorithm);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedRoutingConfigRetrieveResponse linkedRoutingConfigRetrieveResponse = (LinkedRoutingConfigRetrieveResponse) o;
    return equalsNullable(this.algorithm, linkedRoutingConfigRetrieveResponse.algorithm);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(algorithm));
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
    sb.append("class LinkedRoutingConfigRetrieveResponse {\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
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

    // add `algorithm` to the URL query string
    if (getAlgorithm() != null) {
      joiner.add(getAlgorithm().toUrlQueryString(prefix + "algorithm" + suffix));
    }

    return joiner.toString();
  }

}


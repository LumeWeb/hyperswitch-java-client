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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CryptoResponse
 */
@JsonPropertyOrder({
  CryptoResponse.JSON_PROPERTY_PAY_CURRENCY,
  CryptoResponse.JSON_PROPERTY_NETWORK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CryptoResponse {
  public static final String JSON_PROPERTY_PAY_CURRENCY = "pay_currency";
  private JsonNullable<String> payCurrency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NETWORK = "network";
  private JsonNullable<String> network = JsonNullable.<String>undefined();

  public CryptoResponse() { 
  }

  public CryptoResponse payCurrency(String payCurrency) {
    this.payCurrency = JsonNullable.<String>of(payCurrency);
    
    return this;
  }

   /**
   * Get payCurrency
   * @return payCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getPayCurrency() {
        return payCurrency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPayCurrency_JsonNullable() {
    return payCurrency;
  }
  
  @JsonProperty(JSON_PROPERTY_PAY_CURRENCY)
  public void setPayCurrency_JsonNullable(JsonNullable<String> payCurrency) {
    this.payCurrency = payCurrency;
  }

  public void setPayCurrency(String payCurrency) {
    this.payCurrency = JsonNullable.<String>of(payCurrency);
  }


  public CryptoResponse network(String network) {
    this.network = JsonNullable.<String>of(network);
    
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getNetwork() {
        return network.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNetwork_JsonNullable() {
    return network;
  }
  
  @JsonProperty(JSON_PROPERTY_NETWORK)
  public void setNetwork_JsonNullable(JsonNullable<String> network) {
    this.network = network;
  }

  public void setNetwork(String network) {
    this.network = JsonNullable.<String>of(network);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoResponse cryptoResponse = (CryptoResponse) o;
    return equalsNullable(this.payCurrency, cryptoResponse.payCurrency) &&
        equalsNullable(this.network, cryptoResponse.network);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(payCurrency), hashCodeNullable(network));
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
    sb.append("class CryptoResponse {\n");
    sb.append("    payCurrency: ").append(toIndentedString(payCurrency)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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


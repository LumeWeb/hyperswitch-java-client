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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.lumeweb.hyperswitch.client.ApiClient;
/**
 * BankTransferDataOneOf11Pix
 */
@JsonPropertyOrder({
  BankTransferDataOneOf11Pix.JSON_PROPERTY_PIX_KEY,
  BankTransferDataOneOf11Pix.JSON_PROPERTY_CPF,
  BankTransferDataOneOf11Pix.JSON_PROPERTY_CNPJ
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class BankTransferDataOneOf11Pix {
  public static final String JSON_PROPERTY_PIX_KEY = "pix_key";
  private JsonNullable<String> pixKey = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CPF = "cpf";
  private JsonNullable<String> cpf = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CNPJ = "cnpj";
  private JsonNullable<String> cnpj = JsonNullable.<String>undefined();

  public BankTransferDataOneOf11Pix() { 
  }

  public BankTransferDataOneOf11Pix pixKey(@javax.annotation.Nullable String pixKey) {
    this.pixKey = JsonNullable.<String>of(pixKey);
    return this;
  }

  /**
   * Unique key for pix transfer
   * @return pixKey
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getPixKey() {
        return pixKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PIX_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPixKey_JsonNullable() {
    return pixKey;
  }
  
  @JsonProperty(JSON_PROPERTY_PIX_KEY)
  public void setPixKey_JsonNullable(JsonNullable<String> pixKey) {
    this.pixKey = pixKey;
  }

  public void setPixKey(@javax.annotation.Nullable String pixKey) {
    this.pixKey = JsonNullable.<String>of(pixKey);
  }


  public BankTransferDataOneOf11Pix cpf(@javax.annotation.Nullable String cpf) {
    this.cpf = JsonNullable.<String>of(cpf);
    return this;
  }

  /**
   * CPF is a Brazilian tax identification number
   * @return cpf
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getCpf() {
        return cpf.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CPF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCpf_JsonNullable() {
    return cpf;
  }
  
  @JsonProperty(JSON_PROPERTY_CPF)
  public void setCpf_JsonNullable(JsonNullable<String> cpf) {
    this.cpf = cpf;
  }

  public void setCpf(@javax.annotation.Nullable String cpf) {
    this.cpf = JsonNullable.<String>of(cpf);
  }


  public BankTransferDataOneOf11Pix cnpj(@javax.annotation.Nullable String cnpj) {
    this.cnpj = JsonNullable.<String>of(cnpj);
    return this;
  }

  /**
   * CNPJ is a Brazilian company tax identification number
   * @return cnpj
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getCnpj() {
        return cnpj.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CNPJ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCnpj_JsonNullable() {
    return cnpj;
  }
  
  @JsonProperty(JSON_PROPERTY_CNPJ)
  public void setCnpj_JsonNullable(JsonNullable<String> cnpj) {
    this.cnpj = cnpj;
  }

  public void setCnpj(@javax.annotation.Nullable String cnpj) {
    this.cnpj = JsonNullable.<String>of(cnpj);
  }


  /**
   * Return true if this BankTransferData_oneOf_11_pix object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferDataOneOf11Pix bankTransferDataOneOf11Pix = (BankTransferDataOneOf11Pix) o;
    return equalsNullable(this.pixKey, bankTransferDataOneOf11Pix.pixKey) &&
        equalsNullable(this.cpf, bankTransferDataOneOf11Pix.cpf) &&
        equalsNullable(this.cnpj, bankTransferDataOneOf11Pix.cnpj);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(pixKey), hashCodeNullable(cpf), hashCodeNullable(cnpj));
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
    sb.append("class BankTransferDataOneOf11Pix {\n");
    sb.append("    pixKey: ").append(toIndentedString(pixKey)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
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

    // add `pix_key` to the URL query string
    if (getPixKey() != null) {
      joiner.add(String.format("%spix_key%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPixKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cpf` to the URL query string
    if (getCpf() != null) {
      joiner.add(String.format("%scpf%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCpf()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cnpj` to the URL query string
    if (getCnpj() != null) {
      joiner.add(String.format("%scnpj%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCnpj()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


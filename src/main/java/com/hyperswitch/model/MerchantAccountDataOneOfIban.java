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
 * MerchantAccountDataOneOfIban
 */
@JsonPropertyOrder({
  MerchantAccountDataOneOfIban.JSON_PROPERTY_IBAN,
  MerchantAccountDataOneOfIban.JSON_PROPERTY_NAME,
  MerchantAccountDataOneOfIban.JSON_PROPERTY_CONNECTOR_RECIPIENT_ID
})
@JsonTypeName("MerchantAccountData_oneOf_iban")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class MerchantAccountDataOneOfIban {
  public static final String JSON_PROPERTY_IBAN = "iban";
  @javax.annotation.Nonnull
  private String iban;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_CONNECTOR_RECIPIENT_ID = "connector_recipient_id";
  private JsonNullable<String> connectorRecipientId = JsonNullable.<String>undefined();

  public MerchantAccountDataOneOfIban() {
  }

  public MerchantAccountDataOneOfIban iban(@javax.annotation.Nonnull String iban) {
    
    this.iban = iban;
    return this;
  }

  /**
   * Get iban
   * @return iban
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIban() {
    return iban;
  }


  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIban(@javax.annotation.Nonnull String iban) {
    this.iban = iban;
  }


  public MerchantAccountDataOneOfIban name(@javax.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
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


  public MerchantAccountDataOneOfIban connectorRecipientId(@javax.annotation.Nullable String connectorRecipientId) {
    this.connectorRecipientId = JsonNullable.<String>of(connectorRecipientId);
    
    return this;
  }

  /**
   * Get connectorRecipientId
   * @return connectorRecipientId
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getConnectorRecipientId() {
        return connectorRecipientId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONNECTOR_RECIPIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getConnectorRecipientId_JsonNullable() {
    return connectorRecipientId;
  }
  
  @JsonProperty(JSON_PROPERTY_CONNECTOR_RECIPIENT_ID)
  public void setConnectorRecipientId_JsonNullable(JsonNullable<String> connectorRecipientId) {
    this.connectorRecipientId = connectorRecipientId;
  }

  public void setConnectorRecipientId(@javax.annotation.Nullable String connectorRecipientId) {
    this.connectorRecipientId = JsonNullable.<String>of(connectorRecipientId);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantAccountDataOneOfIban merchantAccountDataOneOfIban = (MerchantAccountDataOneOfIban) o;
    return Objects.equals(this.iban, merchantAccountDataOneOfIban.iban) &&
        Objects.equals(this.name, merchantAccountDataOneOfIban.name) &&
        equalsNullable(this.connectorRecipientId, merchantAccountDataOneOfIban.connectorRecipientId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, name, hashCodeNullable(connectorRecipientId));
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
    sb.append("class MerchantAccountDataOneOfIban {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectorRecipientId: ").append(toIndentedString(connectorRecipientId)).append("\n");
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


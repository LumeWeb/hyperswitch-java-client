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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BankTransferTypes
 */
@JsonPropertyOrder({
  BankTransferTypes.JSON_PROPERTY_ELIGIBLE_CONNECTORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BankTransferTypes {
  public static final String JSON_PROPERTY_ELIGIBLE_CONNECTORS = "eligible_connectors";
  private List<String> eligibleConnectors = new ArrayList<>();

  public BankTransferTypes() {
  }

  public BankTransferTypes eligibleConnectors(List<String> eligibleConnectors) {
    
    this.eligibleConnectors = eligibleConnectors;
    return this;
  }

  public BankTransferTypes addEligibleConnectorsItem(String eligibleConnectorsItem) {
    if (this.eligibleConnectors == null) {
      this.eligibleConnectors = new ArrayList<>();
    }
    this.eligibleConnectors.add(eligibleConnectorsItem);
    return this;
  }

   /**
   * The list of eligible connectors for a given payment experience
   * @return eligibleConnectors
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ELIGIBLE_CONNECTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getEligibleConnectors() {
    return eligibleConnectors;
  }


  @JsonProperty(JSON_PROPERTY_ELIGIBLE_CONNECTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEligibleConnectors(List<String> eligibleConnectors) {
    this.eligibleConnectors = eligibleConnectors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferTypes bankTransferTypes = (BankTransferTypes) o;
    return Objects.equals(this.eligibleConnectors, bankTransferTypes.eligibleConnectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibleConnectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferTypes {\n");
    sb.append("    eligibleConnectors: ").append(toIndentedString(eligibleConnectors)).append("\n");
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


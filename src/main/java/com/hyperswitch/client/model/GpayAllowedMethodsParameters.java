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
import com.hyperswitch.client.model.GpayBillingAddressParameters;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GpayAllowedMethodsParameters
 */
@JsonPropertyOrder({
  GpayAllowedMethodsParameters.JSON_PROPERTY_ALLOWED_AUTH_METHODS,
  GpayAllowedMethodsParameters.JSON_PROPERTY_ALLOWED_CARD_NETWORKS,
  GpayAllowedMethodsParameters.JSON_PROPERTY_BILLING_ADDRESS_REQUIRED,
  GpayAllowedMethodsParameters.JSON_PROPERTY_BILLING_ADDRESS_PARAMETERS,
  GpayAllowedMethodsParameters.JSON_PROPERTY_ASSURANCE_DETAILS_REQUIRED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GpayAllowedMethodsParameters {
  public static final String JSON_PROPERTY_ALLOWED_AUTH_METHODS = "allowed_auth_methods";
  private List<String> allowedAuthMethods = new ArrayList<>();

  public static final String JSON_PROPERTY_ALLOWED_CARD_NETWORKS = "allowed_card_networks";
  private List<String> allowedCardNetworks = new ArrayList<>();

  public static final String JSON_PROPERTY_BILLING_ADDRESS_REQUIRED = "billing_address_required";
  private JsonNullable<Boolean> billingAddressRequired = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_BILLING_ADDRESS_PARAMETERS = "billing_address_parameters";
  private JsonNullable<GpayBillingAddressParameters> billingAddressParameters = JsonNullable.<GpayBillingAddressParameters>undefined();

  public static final String JSON_PROPERTY_ASSURANCE_DETAILS_REQUIRED = "assurance_details_required";
  private JsonNullable<Boolean> assuranceDetailsRequired = JsonNullable.<Boolean>undefined();

  public GpayAllowedMethodsParameters() {
  }

  public GpayAllowedMethodsParameters allowedAuthMethods(List<String> allowedAuthMethods) {
    
    this.allowedAuthMethods = allowedAuthMethods;
    return this;
  }

  public GpayAllowedMethodsParameters addAllowedAuthMethodsItem(String allowedAuthMethodsItem) {
    if (this.allowedAuthMethods == null) {
      this.allowedAuthMethods = new ArrayList<>();
    }
    this.allowedAuthMethods.add(allowedAuthMethodsItem);
    return this;
  }

   /**
   * The list of allowed auth methods (ex: 3DS, No3DS, PAN_ONLY etc)
   * @return allowedAuthMethods
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED_AUTH_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAllowedAuthMethods() {
    return allowedAuthMethods;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_AUTH_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedAuthMethods(List<String> allowedAuthMethods) {
    this.allowedAuthMethods = allowedAuthMethods;
  }


  public GpayAllowedMethodsParameters allowedCardNetworks(List<String> allowedCardNetworks) {
    
    this.allowedCardNetworks = allowedCardNetworks;
    return this;
  }

  public GpayAllowedMethodsParameters addAllowedCardNetworksItem(String allowedCardNetworksItem) {
    if (this.allowedCardNetworks == null) {
      this.allowedCardNetworks = new ArrayList<>();
    }
    this.allowedCardNetworks.add(allowedCardNetworksItem);
    return this;
  }

   /**
   * The list of allowed card networks (ex: AMEX,JCB etc)
   * @return allowedCardNetworks
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED_CARD_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAllowedCardNetworks() {
    return allowedCardNetworks;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_CARD_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedCardNetworks(List<String> allowedCardNetworks) {
    this.allowedCardNetworks = allowedCardNetworks;
  }


  public GpayAllowedMethodsParameters billingAddressRequired(Boolean billingAddressRequired) {
    this.billingAddressRequired = JsonNullable.<Boolean>of(billingAddressRequired);
    
    return this;
  }

   /**
   * Is billing address required
   * @return billingAddressRequired
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getBillingAddressRequired() {
        return billingAddressRequired.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getBillingAddressRequired_JsonNullable() {
    return billingAddressRequired;
  }
  
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_REQUIRED)
  public void setBillingAddressRequired_JsonNullable(JsonNullable<Boolean> billingAddressRequired) {
    this.billingAddressRequired = billingAddressRequired;
  }

  public void setBillingAddressRequired(Boolean billingAddressRequired) {
    this.billingAddressRequired = JsonNullable.<Boolean>of(billingAddressRequired);
  }


  public GpayAllowedMethodsParameters billingAddressParameters(GpayBillingAddressParameters billingAddressParameters) {
    this.billingAddressParameters = JsonNullable.<GpayBillingAddressParameters>of(billingAddressParameters);
    
    return this;
  }

   /**
   * Get billingAddressParameters
   * @return billingAddressParameters
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public GpayBillingAddressParameters getBillingAddressParameters() {
        return billingAddressParameters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<GpayBillingAddressParameters> getBillingAddressParameters_JsonNullable() {
    return billingAddressParameters;
  }
  
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_PARAMETERS)
  public void setBillingAddressParameters_JsonNullable(JsonNullable<GpayBillingAddressParameters> billingAddressParameters) {
    this.billingAddressParameters = billingAddressParameters;
  }

  public void setBillingAddressParameters(GpayBillingAddressParameters billingAddressParameters) {
    this.billingAddressParameters = JsonNullable.<GpayBillingAddressParameters>of(billingAddressParameters);
  }


  public GpayAllowedMethodsParameters assuranceDetailsRequired(Boolean assuranceDetailsRequired) {
    this.assuranceDetailsRequired = JsonNullable.<Boolean>of(assuranceDetailsRequired);
    
    return this;
  }

   /**
   * Whether assurance details are required
   * @return assuranceDetailsRequired
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getAssuranceDetailsRequired() {
        return assuranceDetailsRequired.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSURANCE_DETAILS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getAssuranceDetailsRequired_JsonNullable() {
    return assuranceDetailsRequired;
  }
  
  @JsonProperty(JSON_PROPERTY_ASSURANCE_DETAILS_REQUIRED)
  public void setAssuranceDetailsRequired_JsonNullable(JsonNullable<Boolean> assuranceDetailsRequired) {
    this.assuranceDetailsRequired = assuranceDetailsRequired;
  }

  public void setAssuranceDetailsRequired(Boolean assuranceDetailsRequired) {
    this.assuranceDetailsRequired = JsonNullable.<Boolean>of(assuranceDetailsRequired);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GpayAllowedMethodsParameters gpayAllowedMethodsParameters = (GpayAllowedMethodsParameters) o;
    return Objects.equals(this.allowedAuthMethods, gpayAllowedMethodsParameters.allowedAuthMethods) &&
        Objects.equals(this.allowedCardNetworks, gpayAllowedMethodsParameters.allowedCardNetworks) &&
        equalsNullable(this.billingAddressRequired, gpayAllowedMethodsParameters.billingAddressRequired) &&
        equalsNullable(this.billingAddressParameters, gpayAllowedMethodsParameters.billingAddressParameters) &&
        equalsNullable(this.assuranceDetailsRequired, gpayAllowedMethodsParameters.assuranceDetailsRequired);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedAuthMethods, allowedCardNetworks, hashCodeNullable(billingAddressRequired), hashCodeNullable(billingAddressParameters), hashCodeNullable(assuranceDetailsRequired));
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
    sb.append("class GpayAllowedMethodsParameters {\n");
    sb.append("    allowedAuthMethods: ").append(toIndentedString(allowedAuthMethods)).append("\n");
    sb.append("    allowedCardNetworks: ").append(toIndentedString(allowedCardNetworks)).append("\n");
    sb.append("    billingAddressRequired: ").append(toIndentedString(billingAddressRequired)).append("\n");
    sb.append("    billingAddressParameters: ").append(toIndentedString(billingAddressParameters)).append("\n");
    sb.append("    assuranceDetailsRequired: ").append(toIndentedString(assuranceDetailsRequired)).append("\n");
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


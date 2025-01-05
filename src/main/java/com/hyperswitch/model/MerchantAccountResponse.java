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
import com.hyperswitch.model.MerchantDetails;
import com.hyperswitch.model.ReconStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MerchantAccountResponse
 */
@JsonPropertyOrder({
  MerchantAccountResponse.JSON_PROPERTY_ID,
  MerchantAccountResponse.JSON_PROPERTY_MERCHANT_NAME,
  MerchantAccountResponse.JSON_PROPERTY_MERCHANT_DETAILS,
  MerchantAccountResponse.JSON_PROPERTY_PUBLISHABLE_KEY,
  MerchantAccountResponse.JSON_PROPERTY_METADATA,
  MerchantAccountResponse.JSON_PROPERTY_ORGANIZATION_ID,
  MerchantAccountResponse.JSON_PROPERTY_RECON_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MerchantAccountResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MERCHANT_NAME = "merchant_name";
  private String merchantName;

  public static final String JSON_PROPERTY_MERCHANT_DETAILS = "merchant_details";
  private JsonNullable<MerchantDetails> merchantDetails = JsonNullable.<MerchantDetails>undefined();

  public static final String JSON_PROPERTY_PUBLISHABLE_KEY = "publishable_key";
  private String publishableKey;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private String organizationId;

  public static final String JSON_PROPERTY_RECON_STATUS = "recon_status";
  private ReconStatus reconStatus;

  public MerchantAccountResponse() {
  }

  public MerchantAccountResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier for the Merchant Account
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public MerchantAccountResponse merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Name of the Merchant Account
   * @return merchantName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantName() {
    return merchantName;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public MerchantAccountResponse merchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = JsonNullable.<MerchantDetails>of(merchantDetails);
    
    return this;
  }

   /**
   * Get merchantDetails
   * @return merchantDetails
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public MerchantDetails getMerchantDetails() {
        return merchantDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MerchantDetails> getMerchantDetails_JsonNullable() {
    return merchantDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_DETAILS)
  public void setMerchantDetails_JsonNullable(JsonNullable<MerchantDetails> merchantDetails) {
    this.merchantDetails = merchantDetails;
  }

  public void setMerchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = JsonNullable.<MerchantDetails>of(merchantDetails);
  }


  public MerchantAccountResponse publishableKey(String publishableKey) {
    
    this.publishableKey = publishableKey;
    return this;
  }

   /**
   * API key that will be used for server side API access
   * @return publishableKey
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PUBLISHABLE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPublishableKey() {
    return publishableKey;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISHABLE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPublishableKey(String publishableKey) {
    this.publishableKey = publishableKey;
  }


  public MerchantAccountResponse metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Metadata is useful for storing additional, unstructured information on an object.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }


  public MerchantAccountResponse organizationId(String organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The id of the organization which the merchant is associated with
   * @return organizationId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrganizationId() {
    return organizationId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public MerchantAccountResponse reconStatus(ReconStatus reconStatus) {
    
    this.reconStatus = reconStatus;
    return this;
  }

   /**
   * Get reconStatus
   * @return reconStatus
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECON_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReconStatus getReconStatus() {
    return reconStatus;
  }


  @JsonProperty(JSON_PROPERTY_RECON_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReconStatus(ReconStatus reconStatus) {
    this.reconStatus = reconStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantAccountResponse merchantAccountResponse = (MerchantAccountResponse) o;
    return Objects.equals(this.id, merchantAccountResponse.id) &&
        Objects.equals(this.merchantName, merchantAccountResponse.merchantName) &&
        equalsNullable(this.merchantDetails, merchantAccountResponse.merchantDetails) &&
        Objects.equals(this.publishableKey, merchantAccountResponse.publishableKey) &&
        equalsNullable(this.metadata, merchantAccountResponse.metadata) &&
        Objects.equals(this.organizationId, merchantAccountResponse.organizationId) &&
        Objects.equals(this.reconStatus, merchantAccountResponse.reconStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, merchantName, hashCodeNullable(merchantDetails), publishableKey, hashCodeNullable(metadata), organizationId, reconStatus);
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
    sb.append("class MerchantAccountResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    publishableKey: ").append(toIndentedString(publishableKey)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    reconStatus: ").append(toIndentedString(reconStatus)).append("\n");
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


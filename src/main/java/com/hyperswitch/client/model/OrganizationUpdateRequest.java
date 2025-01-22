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
 * OrganizationUpdateRequest
 */
@JsonPropertyOrder({
  OrganizationUpdateRequest.JSON_PROPERTY_ORGANIZATION_NAME,
  OrganizationUpdateRequest.JSON_PROPERTY_ORGANIZATION_DETAILS,
  OrganizationUpdateRequest.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class OrganizationUpdateRequest {
  public static final String JSON_PROPERTY_ORGANIZATION_NAME = "organization_name";
  @javax.annotation.Nullable
  private JsonNullable<String> organizationName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORGANIZATION_DETAILS = "organization_details";
  @javax.annotation.Nullable
  private JsonNullable<Object> organizationDetails = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @javax.annotation.Nullable
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public OrganizationUpdateRequest() {
  }

  public OrganizationUpdateRequest organizationName(@javax.annotation.Nullable String organizationName) {
    this.organizationName = JsonNullable.<String>of(organizationName);
    
    return this;
  }

  /**
   * Name of the organization
   * @return organizationName
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public String getOrganizationName() {
        return organizationName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOrganizationName_JsonNullable() {
    return organizationName;
  }
  
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
  public void setOrganizationName_JsonNullable(JsonNullable<String> organizationName) {
    this.organizationName = organizationName;
  }

  public void setOrganizationName(@javax.annotation.Nullable String organizationName) {
    this.organizationName = JsonNullable.<String>of(organizationName);
  }

  public OrganizationUpdateRequest organizationDetails(@javax.annotation.Nullable Object organizationDetails) {
    this.organizationDetails = JsonNullable.<Object>of(organizationDetails);
    
    return this;
  }

  /**
   * Details about the organization
   * @return organizationDetails
   */
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOrganizationDetails() {
        return organizationDetails.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORGANIZATION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOrganizationDetails_JsonNullable() {
    return organizationDetails;
  }
  
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_DETAILS)
  public void setOrganizationDetails_JsonNullable(JsonNullable<Object> organizationDetails) {
    this.organizationDetails = organizationDetails;
  }

  public void setOrganizationDetails(@javax.annotation.Nullable Object organizationDetails) {
    this.organizationDetails = JsonNullable.<Object>of(organizationDetails);
  }

  public OrganizationUpdateRequest metadata(@javax.annotation.Nullable Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

  /**
   * Metadata is useful for storing additional, unstructured information on an object.
   * @return metadata
   */
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

  public void setMetadata(@javax.annotation.Nullable Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationUpdateRequest organizationUpdateRequest = (OrganizationUpdateRequest) o;
    return equalsNullable(this.organizationName, organizationUpdateRequest.organizationName) &&
        equalsNullable(this.organizationDetails, organizationUpdateRequest.organizationDetails) &&
        equalsNullable(this.metadata, organizationUpdateRequest.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(organizationName), hashCodeNullable(organizationDetails), hashCodeNullable(metadata));
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
    sb.append("class OrganizationUpdateRequest {\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    organizationDetails: ").append(toIndentedString(organizationDetails)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

    // add `organization_name` to the URL query string
    if (getOrganizationName() != null) {
      try {
        joiner.add(String.format("%sorganization_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrganizationName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `organization_details` to the URL query string
    if (getOrganizationDetails() != null) {
      try {
        joiner.add(String.format("%sorganization_details%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrganizationDetails()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      try {
        joiner.add(String.format("%smetadata%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetadata()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}


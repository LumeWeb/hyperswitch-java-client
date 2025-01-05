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
import com.hyperswitch.client.model.RedirectResponse;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * additional data that might be required by hyperswitch
 */
@JsonPropertyOrder({
  FeatureMetadata.JSON_PROPERTY_REDIRECT_RESPONSE,
  FeatureMetadata.JSON_PROPERTY_SEARCH_TAGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeatureMetadata {
  public static final String JSON_PROPERTY_REDIRECT_RESPONSE = "redirect_response";
  private JsonNullable<RedirectResponse> redirectResponse = JsonNullable.<RedirectResponse>undefined();

  public static final String JSON_PROPERTY_SEARCH_TAGS = "search_tags";
  private JsonNullable<List<String>> searchTags = JsonNullable.<List<String>>undefined();

  public FeatureMetadata() {
  }

  public FeatureMetadata redirectResponse(RedirectResponse redirectResponse) {
    this.redirectResponse = JsonNullable.<RedirectResponse>of(redirectResponse);
    
    return this;
  }

   /**
   * Get redirectResponse
   * @return redirectResponse
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public RedirectResponse getRedirectResponse() {
        return redirectResponse.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RedirectResponse> getRedirectResponse_JsonNullable() {
    return redirectResponse;
  }
  
  @JsonProperty(JSON_PROPERTY_REDIRECT_RESPONSE)
  public void setRedirectResponse_JsonNullable(JsonNullable<RedirectResponse> redirectResponse) {
    this.redirectResponse = redirectResponse;
  }

  public void setRedirectResponse(RedirectResponse redirectResponse) {
    this.redirectResponse = JsonNullable.<RedirectResponse>of(redirectResponse);
  }


  public FeatureMetadata searchTags(List<String> searchTags) {
    this.searchTags = JsonNullable.<List<String>>of(searchTags);
    
    return this;
  }

  public FeatureMetadata addSearchTagsItem(String searchTagsItem) {
    if (this.searchTags == null || !this.searchTags.isPresent()) {
      this.searchTags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.searchTags.get().add(searchTagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Additional tags to be used for global search
   * @return searchTags
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<String> getSearchTags() {
        return searchTags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEARCH_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getSearchTags_JsonNullable() {
    return searchTags;
  }
  
  @JsonProperty(JSON_PROPERTY_SEARCH_TAGS)
  public void setSearchTags_JsonNullable(JsonNullable<List<String>> searchTags) {
    this.searchTags = searchTags;
  }

  public void setSearchTags(List<String> searchTags) {
    this.searchTags = JsonNullable.<List<String>>of(searchTags);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureMetadata featureMetadata = (FeatureMetadata) o;
    return equalsNullable(this.redirectResponse, featureMetadata.redirectResponse) &&
        equalsNullable(this.searchTags, featureMetadata.searchTags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(redirectResponse), hashCodeNullable(searchTags));
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
    sb.append("class FeatureMetadata {\n");
    sb.append("    redirectResponse: ").append(toIndentedString(redirectResponse)).append("\n");
    sb.append("    searchTags: ").append(toIndentedString(searchTags)).append("\n");
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


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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.hyperswitch.client.ApiClient;
/**
 * BusinessGenericLinkConfig
 */
@JsonPropertyOrder({
  BusinessGenericLinkConfig.JSON_PROPERTY_LOGO,
  BusinessGenericLinkConfig.JSON_PROPERTY_MERCHANT_NAME,
  BusinessGenericLinkConfig.JSON_PROPERTY_THEME,
  BusinessGenericLinkConfig.JSON_PROPERTY_DOMAIN_NAME,
  BusinessGenericLinkConfig.JSON_PROPERTY_ALLOWED_DOMAINS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class BusinessGenericLinkConfig {
  public static final String JSON_PROPERTY_LOGO = "logo";
  private JsonNullable<String> logo = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MERCHANT_NAME = "merchant_name";
  private JsonNullable<String> merchantName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_THEME = "theme";
  private JsonNullable<String> theme = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DOMAIN_NAME = "domain_name";
  private JsonNullable<String> domainName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ALLOWED_DOMAINS = "allowed_domains";
  @javax.annotation.Nonnull
  private Set<String> allowedDomains = new LinkedHashSet<>();

  public BusinessGenericLinkConfig() { 
  }

  public BusinessGenericLinkConfig logo(@javax.annotation.Nullable String logo) {
    this.logo = JsonNullable.<String>of(logo);
    return this;
  }

  /**
   * Merchant&#39;s display logo
   * @return logo
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getLogo() {
        return logo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLogo_JsonNullable() {
    return logo;
  }
  
  @JsonProperty(JSON_PROPERTY_LOGO)
  public void setLogo_JsonNullable(JsonNullable<String> logo) {
    this.logo = logo;
  }

  public void setLogo(@javax.annotation.Nullable String logo) {
    this.logo = JsonNullable.<String>of(logo);
  }


  public BusinessGenericLinkConfig merchantName(@javax.annotation.Nullable String merchantName) {
    this.merchantName = JsonNullable.<String>of(merchantName);
    return this;
  }

  /**
   * Custom merchant name for the link
   * @return merchantName
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getMerchantName() {
        return merchantName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMerchantName_JsonNullable() {
    return merchantName;
  }
  
  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  public void setMerchantName_JsonNullable(JsonNullable<String> merchantName) {
    this.merchantName = merchantName;
  }

  public void setMerchantName(@javax.annotation.Nullable String merchantName) {
    this.merchantName = JsonNullable.<String>of(merchantName);
  }


  public BusinessGenericLinkConfig theme(@javax.annotation.Nullable String theme) {
    this.theme = JsonNullable.<String>of(theme);
    return this;
  }

  /**
   * Primary color to be used in the form represented in hex format
   * @return theme
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getTheme() {
        return theme.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_THEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTheme_JsonNullable() {
    return theme;
  }
  
  @JsonProperty(JSON_PROPERTY_THEME)
  public void setTheme_JsonNullable(JsonNullable<String> theme) {
    this.theme = theme;
  }

  public void setTheme(@javax.annotation.Nullable String theme) {
    this.theme = JsonNullable.<String>of(theme);
  }


  public BusinessGenericLinkConfig domainName(@javax.annotation.Nullable String domainName) {
    this.domainName = JsonNullable.<String>of(domainName);
    return this;
  }

  /**
   * Custom domain name to be used for hosting the link
   * @return domainName
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getDomainName() {
        return domainName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDomainName_JsonNullable() {
    return domainName;
  }
  
  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  public void setDomainName_JsonNullable(JsonNullable<String> domainName) {
    this.domainName = domainName;
  }

  public void setDomainName(@javax.annotation.Nullable String domainName) {
    this.domainName = JsonNullable.<String>of(domainName);
  }


  public BusinessGenericLinkConfig allowedDomains(@javax.annotation.Nonnull Set<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }

  public BusinessGenericLinkConfig addAllowedDomainsItem(String allowedDomainsItem) {
    if (this.allowedDomains == null) {
      this.allowedDomains = new LinkedHashSet<>();
    }
    this.allowedDomains.add(allowedDomainsItem);
    return this;
  }

  /**
   * A list of allowed domains (glob patterns) where this link can be embedded / opened from
   * @return allowedDomains
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALLOWED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Set<String> getAllowedDomains() {
    return allowedDomains;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ALLOWED_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllowedDomains(@javax.annotation.Nonnull Set<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }


  /**
   * Return true if this BusinessGenericLinkConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessGenericLinkConfig businessGenericLinkConfig = (BusinessGenericLinkConfig) o;
    return equalsNullable(this.logo, businessGenericLinkConfig.logo) &&
        equalsNullable(this.merchantName, businessGenericLinkConfig.merchantName) &&
        equalsNullable(this.theme, businessGenericLinkConfig.theme) &&
        equalsNullable(this.domainName, businessGenericLinkConfig.domainName) &&
        Objects.equals(this.allowedDomains, businessGenericLinkConfig.allowedDomains);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(logo), hashCodeNullable(merchantName), hashCodeNullable(theme), hashCodeNullable(domainName), allowedDomains);
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
    sb.append("class BusinessGenericLinkConfig {\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
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

    // add `logo` to the URL query string
    if (getLogo() != null) {
      joiner.add(String.format("%slogo%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLogo()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `merchant_name` to the URL query string
    if (getMerchantName() != null) {
      joiner.add(String.format("%smerchant_name%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMerchantName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `theme` to the URL query string
    if (getTheme() != null) {
      joiner.add(String.format("%stheme%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTheme()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `domain_name` to the URL query string
    if (getDomainName() != null) {
      joiner.add(String.format("%sdomain_name%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDomainName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `allowed_domains` to the URL query string
    if (getAllowedDomains() != null) {
      int i = 0;
      for (String _item : getAllowedDomains()) {
        joiner.add(String.format("%sallowed_domains%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(_item), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
      i++;
    }

    return joiner.toString();
  }
}

